package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wclecturasproducciongetfilterdata extends GXProcedure
{
   public wclecturasproducciongetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wclecturasproducciongetfilterdata.class ), "" );
   }

   public wclecturasproducciongetfilterdata( int remoteHandle ,
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
      wclecturasproducciongetfilterdata.this.aP5 = new String[] {""};
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
      wclecturasproducciongetfilterdata.this.AV22DDOName = aP0;
      wclecturasproducciongetfilterdata.this.AV20SearchTxt = aP1;
      wclecturasproducciongetfilterdata.this.AV21SearchTxtTo = aP2;
      wclecturasproducciongetfilterdata.this.aP3 = aP3;
      wclecturasproducciongetfilterdata.this.aP4 = aP4;
      wclecturasproducciongetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASE") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASEDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HISPROF") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WCLecturasProduccionGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCLecturasProduccionGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WCLecturasProduccionGridState"), null, null);
      }
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV12TFHisProFec = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV14TFHisProLin = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFHisProLin_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV16TFBarOrdLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFBarOrdLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV18TFFase = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV19TFFase_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV56TFFaseDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV57TFFaseDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV68TFHisProTur = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFHisProTur_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV70TFHisProF = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV71TFHisProF_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV58TFHisProDTI = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV60TFHisProDTF = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV72TFHisProKgr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFHisProKgr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV74TFHisProMtr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV75TFHisProMtr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV76TFHisProNpzs = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFHisProNpzs_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV62TFGruOpeCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFGruOpeCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV64TFParCod = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFParCod_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV66TFParCodNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV67TFParCodNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50Barcod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51Barcodreo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV52BarCodpar = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV20SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV83Wclecturasproduccionds_1_emprcod = AV49Emprcod ;
      AV84Wclecturasproduccionds_2_barcod = AV50Barcod ;
      AV85Wclecturasproduccionds_3_barcodreo = AV51Barcodreo ;
      AV86Wclecturasproduccionds_4_barcodpar = AV52BarCodpar ;
      AV87Wclecturasproduccionds_5_filterfulltext = AV78FilterFullText ;
      AV88Wclecturasproduccionds_6_tfmaqcod = AV10TFMaqCod ;
      AV89Wclecturasproduccionds_7_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV90Wclecturasproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV91Wclecturasproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV92Wclecturasproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV93Wclecturasproduccionds_11_tfbarordlin = AV16TFBarOrdLin ;
      AV94Wclecturasproduccionds_12_tfbarordlin_to = AV17TFBarOrdLin_To ;
      AV95Wclecturasproduccionds_13_tffase = AV18TFFase ;
      AV96Wclecturasproduccionds_14_tffase_sel = AV19TFFase_Sel ;
      AV97Wclecturasproduccionds_15_tffasedsc = AV56TFFaseDsc ;
      AV98Wclecturasproduccionds_16_tffasedsc_sel = AV57TFFaseDsc_Sel ;
      AV99Wclecturasproduccionds_17_tfhisprotur = AV68TFHisProTur ;
      AV100Wclecturasproduccionds_18_tfhisprotur_to = AV69TFHisProTur_To ;
      AV101Wclecturasproduccionds_19_tfhisprof = AV70TFHisProF ;
      AV102Wclecturasproduccionds_20_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV103Wclecturasproduccionds_21_tfhisprodti = AV58TFHisProDTI ;
      AV104Wclecturasproduccionds_22_tfhisprodtf = AV60TFHisProDTF ;
      AV105Wclecturasproduccionds_23_tfhisprokgr = AV72TFHisProKgr ;
      AV106Wclecturasproduccionds_24_tfhisprokgr_to = AV73TFHisProKgr_To ;
      AV107Wclecturasproduccionds_25_tfhispromtr = AV74TFHisProMtr ;
      AV108Wclecturasproduccionds_26_tfhispromtr_to = AV75TFHisProMtr_To ;
      AV109Wclecturasproduccionds_27_tfhispronpzs = AV76TFHisProNpzs ;
      AV110Wclecturasproduccionds_28_tfhispronpzs_to = AV77TFHisProNpzs_To ;
      AV111Wclecturasproduccionds_29_tfgruopecod = AV62TFGruOpeCod ;
      AV112Wclecturasproduccionds_30_tfgruopecod_to = AV63TFGruOpeCod_To ;
      AV113Wclecturasproduccionds_31_tfparcod = AV64TFParCod ;
      AV114Wclecturasproduccionds_32_tfparcod_to = AV65TFParCod_To ;
      AV115Wclecturasproduccionds_33_tfparcodnom = AV66TFParCodNom ;
      AV116Wclecturasproduccionds_34_tfparcodnom_sel = AV67TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV88Wclecturasproduccionds_6_tfmaqcod ,
                                           AV90Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV91Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV92Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV93Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV94Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV96Wclecturasproduccionds_14_tffase_sel ,
                                           AV95Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV99Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV100Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV101Wclecturasproduccionds_19_tfhisprof ,
                                           AV103Wclecturasproduccionds_21_tfhisprodti ,
                                           AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV107Wclecturasproduccionds_25_tfhispromtr ,
                                           AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV109Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV110Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV111Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV112Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV113Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV114Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV115Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV87Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV97Wclecturasproduccionds_15_tffasedsc ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52BarCodpar ,
                                           AV83Wclecturasproduccionds_1_emprcod ,
                                           Integer.valueOf(AV84Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(AV85Wclecturasproduccionds_3_barcodreo) ,
                                           AV86Wclecturasproduccionds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV97Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV88Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor P08CX2 */
      pr_default.execute(0, new Object[] {AV87Wclecturasproduccionds_5_filterfulltext, lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV87Wclecturasproduccionds_5_filterfulltext, A461Fase, lV87Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV87Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV87Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV87Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV87Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV87Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV87Wclecturasproduccionds_5_filterfulltext, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV97Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV97Wclecturasproduccionds_15_tffasedsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV49Emprcod, Integer.valueOf(A129BarCod), Integer.valueOf(AV50Barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV51Barcodreo), A130BarCodPar, AV52BarCodpar, lV88Wclecturasproduccionds_6_tfmaqcod, AV89Wclecturasproduccionds_7_tfmaqcod_sel, AV90Wclecturasproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8CX2 = false ;
         A602MaqCod = P08CX2_A602MaqCod[0] ;
         A558HisProFec = P08CX2_A558HisProFec[0] ;
         A396EmprCod = P08CX2_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08CX2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08CX2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8CX2 = false ;
            A558HisProFec = P08CX2_A558HisProFec[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8CX2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV24Option = A602MaqCod ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CX2 )
         {
            brk8CX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV18TFFase = AV20SearchTxt ;
      AV19TFFase_Sel = "" ;
      AV83Wclecturasproduccionds_1_emprcod = AV49Emprcod ;
      AV84Wclecturasproduccionds_2_barcod = AV50Barcod ;
      AV85Wclecturasproduccionds_3_barcodreo = AV51Barcodreo ;
      AV86Wclecturasproduccionds_4_barcodpar = AV52BarCodpar ;
      AV87Wclecturasproduccionds_5_filterfulltext = AV78FilterFullText ;
      AV88Wclecturasproduccionds_6_tfmaqcod = AV10TFMaqCod ;
      AV89Wclecturasproduccionds_7_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV90Wclecturasproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV91Wclecturasproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV92Wclecturasproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV93Wclecturasproduccionds_11_tfbarordlin = AV16TFBarOrdLin ;
      AV94Wclecturasproduccionds_12_tfbarordlin_to = AV17TFBarOrdLin_To ;
      AV95Wclecturasproduccionds_13_tffase = AV18TFFase ;
      AV96Wclecturasproduccionds_14_tffase_sel = AV19TFFase_Sel ;
      AV97Wclecturasproduccionds_15_tffasedsc = AV56TFFaseDsc ;
      AV98Wclecturasproduccionds_16_tffasedsc_sel = AV57TFFaseDsc_Sel ;
      AV99Wclecturasproduccionds_17_tfhisprotur = AV68TFHisProTur ;
      AV100Wclecturasproduccionds_18_tfhisprotur_to = AV69TFHisProTur_To ;
      AV101Wclecturasproduccionds_19_tfhisprof = AV70TFHisProF ;
      AV102Wclecturasproduccionds_20_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV103Wclecturasproduccionds_21_tfhisprodti = AV58TFHisProDTI ;
      AV104Wclecturasproduccionds_22_tfhisprodtf = AV60TFHisProDTF ;
      AV105Wclecturasproduccionds_23_tfhisprokgr = AV72TFHisProKgr ;
      AV106Wclecturasproduccionds_24_tfhisprokgr_to = AV73TFHisProKgr_To ;
      AV107Wclecturasproduccionds_25_tfhispromtr = AV74TFHisProMtr ;
      AV108Wclecturasproduccionds_26_tfhispromtr_to = AV75TFHisProMtr_To ;
      AV109Wclecturasproduccionds_27_tfhispronpzs = AV76TFHisProNpzs ;
      AV110Wclecturasproduccionds_28_tfhispronpzs_to = AV77TFHisProNpzs_To ;
      AV111Wclecturasproduccionds_29_tfgruopecod = AV62TFGruOpeCod ;
      AV112Wclecturasproduccionds_30_tfgruopecod_to = AV63TFGruOpeCod_To ;
      AV113Wclecturasproduccionds_31_tfparcod = AV64TFParCod ;
      AV114Wclecturasproduccionds_32_tfparcod_to = AV65TFParCod_To ;
      AV115Wclecturasproduccionds_33_tfparcodnom = AV66TFParCodNom ;
      AV116Wclecturasproduccionds_34_tfparcodnom_sel = AV67TFParCodNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV88Wclecturasproduccionds_6_tfmaqcod ,
                                           AV90Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV91Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV92Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV93Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV94Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV96Wclecturasproduccionds_14_tffase_sel ,
                                           AV95Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV99Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV100Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV101Wclecturasproduccionds_19_tfhisprof ,
                                           AV103Wclecturasproduccionds_21_tfhisprodti ,
                                           AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV107Wclecturasproduccionds_25_tfhispromtr ,
                                           AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV109Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV110Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV111Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV112Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV113Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV114Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV115Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV87Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV97Wclecturasproduccionds_15_tffasedsc ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52BarCodpar ,
                                           AV83Wclecturasproduccionds_1_emprcod ,
                                           Integer.valueOf(AV84Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(AV85Wclecturasproduccionds_3_barcodreo) ,
                                           AV86Wclecturasproduccionds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV97Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV88Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor P08CX3 */
      pr_default.execute(1, new Object[] {AV87Wclecturasproduccionds_5_filterfulltext, lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV87Wclecturasproduccionds_5_filterfulltext, A461Fase, lV87Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV87Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV87Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV87Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV87Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV87Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV87Wclecturasproduccionds_5_filterfulltext, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV97Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV97Wclecturasproduccionds_15_tffasedsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV49Emprcod, Integer.valueOf(A129BarCod), Integer.valueOf(AV50Barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV51Barcodreo), A130BarCodPar, AV52BarCodpar, lV88Wclecturasproduccionds_6_tfmaqcod, AV89Wclecturasproduccionds_7_tfmaqcod_sel, AV90Wclecturasproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8CX4 = false ;
         A558HisProFec = P08CX3_A558HisProFec[0] ;
         A602MaqCod = P08CX3_A602MaqCod[0] ;
         A396EmprCod = P08CX3_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08CX3_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8CX4 = false ;
            A558HisProFec = P08CX3_A558HisProFec[0] ;
            A602MaqCod = P08CX3_A602MaqCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8CX4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A461Fase)==0) )
         {
            AV24Option = A461Fase ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CX4 )
         {
            brk8CX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASEDSCOPTIONS' Routine */
      returnInSub = false ;
      AV56TFFaseDsc = AV20SearchTxt ;
      AV57TFFaseDsc_Sel = "" ;
      AV83Wclecturasproduccionds_1_emprcod = AV49Emprcod ;
      AV84Wclecturasproduccionds_2_barcod = AV50Barcod ;
      AV85Wclecturasproduccionds_3_barcodreo = AV51Barcodreo ;
      AV86Wclecturasproduccionds_4_barcodpar = AV52BarCodpar ;
      AV87Wclecturasproduccionds_5_filterfulltext = AV78FilterFullText ;
      AV88Wclecturasproduccionds_6_tfmaqcod = AV10TFMaqCod ;
      AV89Wclecturasproduccionds_7_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV90Wclecturasproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV91Wclecturasproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV92Wclecturasproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV93Wclecturasproduccionds_11_tfbarordlin = AV16TFBarOrdLin ;
      AV94Wclecturasproduccionds_12_tfbarordlin_to = AV17TFBarOrdLin_To ;
      AV95Wclecturasproduccionds_13_tffase = AV18TFFase ;
      AV96Wclecturasproduccionds_14_tffase_sel = AV19TFFase_Sel ;
      AV97Wclecturasproduccionds_15_tffasedsc = AV56TFFaseDsc ;
      AV98Wclecturasproduccionds_16_tffasedsc_sel = AV57TFFaseDsc_Sel ;
      AV99Wclecturasproduccionds_17_tfhisprotur = AV68TFHisProTur ;
      AV100Wclecturasproduccionds_18_tfhisprotur_to = AV69TFHisProTur_To ;
      AV101Wclecturasproduccionds_19_tfhisprof = AV70TFHisProF ;
      AV102Wclecturasproduccionds_20_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV103Wclecturasproduccionds_21_tfhisprodti = AV58TFHisProDTI ;
      AV104Wclecturasproduccionds_22_tfhisprodtf = AV60TFHisProDTF ;
      AV105Wclecturasproduccionds_23_tfhisprokgr = AV72TFHisProKgr ;
      AV106Wclecturasproduccionds_24_tfhisprokgr_to = AV73TFHisProKgr_To ;
      AV107Wclecturasproduccionds_25_tfhispromtr = AV74TFHisProMtr ;
      AV108Wclecturasproduccionds_26_tfhispromtr_to = AV75TFHisProMtr_To ;
      AV109Wclecturasproduccionds_27_tfhispronpzs = AV76TFHisProNpzs ;
      AV110Wclecturasproduccionds_28_tfhispronpzs_to = AV77TFHisProNpzs_To ;
      AV111Wclecturasproduccionds_29_tfgruopecod = AV62TFGruOpeCod ;
      AV112Wclecturasproduccionds_30_tfgruopecod_to = AV63TFGruOpeCod_To ;
      AV113Wclecturasproduccionds_31_tfparcod = AV64TFParCod ;
      AV114Wclecturasproduccionds_32_tfparcod_to = AV65TFParCod_To ;
      AV115Wclecturasproduccionds_33_tfparcodnom = AV66TFParCodNom ;
      AV116Wclecturasproduccionds_34_tfparcodnom_sel = AV67TFParCodNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV88Wclecturasproduccionds_6_tfmaqcod ,
                                           AV90Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV91Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV92Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV93Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV94Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV96Wclecturasproduccionds_14_tffase_sel ,
                                           AV95Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV99Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV100Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV101Wclecturasproduccionds_19_tfhisprof ,
                                           AV103Wclecturasproduccionds_21_tfhisprodti ,
                                           AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV107Wclecturasproduccionds_25_tfhispromtr ,
                                           AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV109Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV110Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV111Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV112Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV113Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV114Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV115Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV87Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV97Wclecturasproduccionds_15_tffasedsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV84Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV85Wclecturasproduccionds_3_barcodreo) ,
                                           A130BarCodPar ,
                                           AV86Wclecturasproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           AV52BarCodpar ,
                                           AV83Wclecturasproduccionds_1_emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV97Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV88Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor P08CX4 */
      pr_default.execute(2, new Object[] {AV83Wclecturasproduccionds_1_emprcod, AV87Wclecturasproduccionds_5_filterfulltext, lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV87Wclecturasproduccionds_5_filterfulltext, A461Fase, lV87Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV87Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV87Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV87Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV87Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV87Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV87Wclecturasproduccionds_5_filterfulltext, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV97Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV97Wclecturasproduccionds_15_tffasedsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, Integer.valueOf(A129BarCod), Integer.valueOf(AV84Wclecturasproduccionds_2_barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV85Wclecturasproduccionds_3_barcodreo), A130BarCodPar, AV86Wclecturasproduccionds_4_barcodpar, AV49Emprcod, Integer.valueOf(A129BarCod), Integer.valueOf(AV50Barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV51Barcodreo), A130BarCodPar, AV52BarCodpar, lV88Wclecturasproduccionds_6_tfmaqcod, AV89Wclecturasproduccionds_7_tfmaqcod_sel, AV90Wclecturasproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A558HisProFec = P08CX4_A558HisProFec[0] ;
         A602MaqCod = P08CX4_A602MaqCod[0] ;
         A396EmprCod = P08CX4_A396EmprCod[0] ;
         if ( ! (GXutil.strcmp("", A7258FaseDsc)==0) )
         {
            AV24Option = A7258FaseDsc ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHISPROFOPTIONS' Routine */
      returnInSub = false ;
      AV70TFHisProF = AV20SearchTxt ;
      AV71TFHisProF_Sel = "" ;
      AV83Wclecturasproduccionds_1_emprcod = AV49Emprcod ;
      AV84Wclecturasproduccionds_2_barcod = AV50Barcod ;
      AV85Wclecturasproduccionds_3_barcodreo = AV51Barcodreo ;
      AV86Wclecturasproduccionds_4_barcodpar = AV52BarCodpar ;
      AV87Wclecturasproduccionds_5_filterfulltext = AV78FilterFullText ;
      AV88Wclecturasproduccionds_6_tfmaqcod = AV10TFMaqCod ;
      AV89Wclecturasproduccionds_7_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV90Wclecturasproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV91Wclecturasproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV92Wclecturasproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV93Wclecturasproduccionds_11_tfbarordlin = AV16TFBarOrdLin ;
      AV94Wclecturasproduccionds_12_tfbarordlin_to = AV17TFBarOrdLin_To ;
      AV95Wclecturasproduccionds_13_tffase = AV18TFFase ;
      AV96Wclecturasproduccionds_14_tffase_sel = AV19TFFase_Sel ;
      AV97Wclecturasproduccionds_15_tffasedsc = AV56TFFaseDsc ;
      AV98Wclecturasproduccionds_16_tffasedsc_sel = AV57TFFaseDsc_Sel ;
      AV99Wclecturasproduccionds_17_tfhisprotur = AV68TFHisProTur ;
      AV100Wclecturasproduccionds_18_tfhisprotur_to = AV69TFHisProTur_To ;
      AV101Wclecturasproduccionds_19_tfhisprof = AV70TFHisProF ;
      AV102Wclecturasproduccionds_20_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV103Wclecturasproduccionds_21_tfhisprodti = AV58TFHisProDTI ;
      AV104Wclecturasproduccionds_22_tfhisprodtf = AV60TFHisProDTF ;
      AV105Wclecturasproduccionds_23_tfhisprokgr = AV72TFHisProKgr ;
      AV106Wclecturasproduccionds_24_tfhisprokgr_to = AV73TFHisProKgr_To ;
      AV107Wclecturasproduccionds_25_tfhispromtr = AV74TFHisProMtr ;
      AV108Wclecturasproduccionds_26_tfhispromtr_to = AV75TFHisProMtr_To ;
      AV109Wclecturasproduccionds_27_tfhispronpzs = AV76TFHisProNpzs ;
      AV110Wclecturasproduccionds_28_tfhispronpzs_to = AV77TFHisProNpzs_To ;
      AV111Wclecturasproduccionds_29_tfgruopecod = AV62TFGruOpeCod ;
      AV112Wclecturasproduccionds_30_tfgruopecod_to = AV63TFGruOpeCod_To ;
      AV113Wclecturasproduccionds_31_tfparcod = AV64TFParCod ;
      AV114Wclecturasproduccionds_32_tfparcod_to = AV65TFParCod_To ;
      AV115Wclecturasproduccionds_33_tfparcodnom = AV66TFParCodNom ;
      AV116Wclecturasproduccionds_34_tfparcodnom_sel = AV67TFParCodNom_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV88Wclecturasproduccionds_6_tfmaqcod ,
                                           AV90Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV91Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV92Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV93Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV94Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV96Wclecturasproduccionds_14_tffase_sel ,
                                           AV95Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV99Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV100Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV101Wclecturasproduccionds_19_tfhisprof ,
                                           AV103Wclecturasproduccionds_21_tfhisprodti ,
                                           AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV107Wclecturasproduccionds_25_tfhispromtr ,
                                           AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV109Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV110Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV111Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV112Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV113Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV114Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV115Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV87Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV97Wclecturasproduccionds_15_tffasedsc ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52BarCodpar ,
                                           AV83Wclecturasproduccionds_1_emprcod ,
                                           Integer.valueOf(AV84Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(AV85Wclecturasproduccionds_3_barcodreo) ,
                                           AV86Wclecturasproduccionds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV97Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV88Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor P08CX5 */
      pr_default.execute(3, new Object[] {AV87Wclecturasproduccionds_5_filterfulltext, lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV87Wclecturasproduccionds_5_filterfulltext, A461Fase, lV87Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV87Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV87Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV87Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV87Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV87Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV87Wclecturasproduccionds_5_filterfulltext, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV97Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV97Wclecturasproduccionds_15_tffasedsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV49Emprcod, Integer.valueOf(A129BarCod), Integer.valueOf(AV50Barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV51Barcodreo), A130BarCodPar, AV52BarCodpar, lV88Wclecturasproduccionds_6_tfmaqcod, AV89Wclecturasproduccionds_7_tfmaqcod_sel, AV90Wclecturasproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8CX7 = false ;
         A558HisProFec = P08CX5_A558HisProFec[0] ;
         A602MaqCod = P08CX5_A602MaqCod[0] ;
         A396EmprCod = P08CX5_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08CX5_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8CX7 = false ;
            A558HisProFec = P08CX5_A558HisProFec[0] ;
            A602MaqCod = P08CX5_A602MaqCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8CX7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A557HisProF)==0) )
         {
            AV24Option = A557HisProF ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A557HisProF, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CX7 )
         {
            brk8CX7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV66TFParCodNom = AV20SearchTxt ;
      AV67TFParCodNom_Sel = "" ;
      AV83Wclecturasproduccionds_1_emprcod = AV49Emprcod ;
      AV84Wclecturasproduccionds_2_barcod = AV50Barcod ;
      AV85Wclecturasproduccionds_3_barcodreo = AV51Barcodreo ;
      AV86Wclecturasproduccionds_4_barcodpar = AV52BarCodpar ;
      AV87Wclecturasproduccionds_5_filterfulltext = AV78FilterFullText ;
      AV88Wclecturasproduccionds_6_tfmaqcod = AV10TFMaqCod ;
      AV89Wclecturasproduccionds_7_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV90Wclecturasproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV91Wclecturasproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV92Wclecturasproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV93Wclecturasproduccionds_11_tfbarordlin = AV16TFBarOrdLin ;
      AV94Wclecturasproduccionds_12_tfbarordlin_to = AV17TFBarOrdLin_To ;
      AV95Wclecturasproduccionds_13_tffase = AV18TFFase ;
      AV96Wclecturasproduccionds_14_tffase_sel = AV19TFFase_Sel ;
      AV97Wclecturasproduccionds_15_tffasedsc = AV56TFFaseDsc ;
      AV98Wclecturasproduccionds_16_tffasedsc_sel = AV57TFFaseDsc_Sel ;
      AV99Wclecturasproduccionds_17_tfhisprotur = AV68TFHisProTur ;
      AV100Wclecturasproduccionds_18_tfhisprotur_to = AV69TFHisProTur_To ;
      AV101Wclecturasproduccionds_19_tfhisprof = AV70TFHisProF ;
      AV102Wclecturasproduccionds_20_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV103Wclecturasproduccionds_21_tfhisprodti = AV58TFHisProDTI ;
      AV104Wclecturasproduccionds_22_tfhisprodtf = AV60TFHisProDTF ;
      AV105Wclecturasproduccionds_23_tfhisprokgr = AV72TFHisProKgr ;
      AV106Wclecturasproduccionds_24_tfhisprokgr_to = AV73TFHisProKgr_To ;
      AV107Wclecturasproduccionds_25_tfhispromtr = AV74TFHisProMtr ;
      AV108Wclecturasproduccionds_26_tfhispromtr_to = AV75TFHisProMtr_To ;
      AV109Wclecturasproduccionds_27_tfhispronpzs = AV76TFHisProNpzs ;
      AV110Wclecturasproduccionds_28_tfhispronpzs_to = AV77TFHisProNpzs_To ;
      AV111Wclecturasproduccionds_29_tfgruopecod = AV62TFGruOpeCod ;
      AV112Wclecturasproduccionds_30_tfgruopecod_to = AV63TFGruOpeCod_To ;
      AV113Wclecturasproduccionds_31_tfparcod = AV64TFParCod ;
      AV114Wclecturasproduccionds_32_tfparcod_to = AV65TFParCod_To ;
      AV115Wclecturasproduccionds_33_tfparcodnom = AV66TFParCodNom ;
      AV116Wclecturasproduccionds_34_tfparcodnom_sel = AV67TFParCodNom_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV88Wclecturasproduccionds_6_tfmaqcod ,
                                           AV90Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV91Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV92Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV93Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV94Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV96Wclecturasproduccionds_14_tffase_sel ,
                                           AV95Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV99Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV100Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV101Wclecturasproduccionds_19_tfhisprof ,
                                           AV103Wclecturasproduccionds_21_tfhisprodti ,
                                           AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV107Wclecturasproduccionds_25_tfhispromtr ,
                                           AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV109Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV110Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV111Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV112Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV113Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV114Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV115Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV87Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV97Wclecturasproduccionds_15_tffasedsc ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52BarCodpar ,
                                           AV83Wclecturasproduccionds_1_emprcod ,
                                           Integer.valueOf(AV84Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(AV85Wclecturasproduccionds_3_barcodreo) ,
                                           AV86Wclecturasproduccionds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV87Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV97Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV88Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor P08CX6 */
      pr_default.execute(4, new Object[] {AV87Wclecturasproduccionds_5_filterfulltext, lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV87Wclecturasproduccionds_5_filterfulltext, A461Fase, lV87Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV87Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV87Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV87Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV87Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV87Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV87Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV87Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV87Wclecturasproduccionds_5_filterfulltext, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV97Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV97Wclecturasproduccionds_15_tffasedsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV98Wclecturasproduccionds_16_tffasedsc_sel, AV49Emprcod, Integer.valueOf(A129BarCod), Integer.valueOf(AV50Barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV51Barcodreo), A130BarCodPar, AV52BarCodpar, lV88Wclecturasproduccionds_6_tfmaqcod, AV89Wclecturasproduccionds_7_tfmaqcod_sel, AV90Wclecturasproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8CX9 = false ;
         A558HisProFec = P08CX6_A558HisProFec[0] ;
         A602MaqCod = P08CX6_A602MaqCod[0] ;
         A396EmprCod = P08CX6_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08CX6_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8CX9 = false ;
            A558HisProFec = P08CX6_A558HisProFec[0] ;
            A602MaqCod = P08CX6_A602MaqCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8CX9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
         {
            AV24Option = A867ParCodNom ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CX9 )
         {
            brk8CX9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wclecturasproducciongetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = wclecturasproducciongetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = wclecturasproducciongetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV78FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV12TFHisProFec = GXutil.nullDate() ;
      AV18TFFase = "" ;
      AV19TFFase_Sel = "" ;
      AV56TFFaseDsc = "" ;
      AV57TFFaseDsc_Sel = "" ;
      AV70TFHisProF = "" ;
      AV71TFHisProF_Sel = "" ;
      AV58TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV60TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV72TFHisProKgr = DecimalUtil.ZERO ;
      AV73TFHisProKgr_To = DecimalUtil.ZERO ;
      AV74TFHisProMtr = DecimalUtil.ZERO ;
      AV75TFHisProMtr_To = DecimalUtil.ZERO ;
      AV66TFParCodNom = "" ;
      AV67TFParCodNom_Sel = "" ;
      AV49Emprcod = "" ;
      AV52BarCodpar = "" ;
      A602MaqCod = "" ;
      AV83Wclecturasproduccionds_1_emprcod = "" ;
      AV86Wclecturasproduccionds_4_barcodpar = "" ;
      AV87Wclecturasproduccionds_5_filterfulltext = "" ;
      AV88Wclecturasproduccionds_6_tfmaqcod = "" ;
      AV89Wclecturasproduccionds_7_tfmaqcod_sel = "" ;
      AV90Wclecturasproduccionds_8_tfhisprofec = GXutil.nullDate() ;
      AV95Wclecturasproduccionds_13_tffase = "" ;
      AV96Wclecturasproduccionds_14_tffase_sel = "" ;
      AV97Wclecturasproduccionds_15_tffasedsc = "" ;
      AV98Wclecturasproduccionds_16_tffasedsc_sel = "" ;
      AV101Wclecturasproduccionds_19_tfhisprof = "" ;
      AV102Wclecturasproduccionds_20_tfhisprof_sel = "" ;
      AV103Wclecturasproduccionds_21_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV104Wclecturasproduccionds_22_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV105Wclecturasproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV106Wclecturasproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV107Wclecturasproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV108Wclecturasproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV115Wclecturasproduccionds_33_tfparcodnom = "" ;
      AV116Wclecturasproduccionds_34_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV87Wclecturasproduccionds_5_filterfulltext = "" ;
      lV97Wclecturasproduccionds_15_tffasedsc = "" ;
      lV88Wclecturasproduccionds_6_tfmaqcod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A461Fase = "" ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A7258FaseDsc = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P08CX2_A602MaqCod = new String[] {""} ;
      P08CX2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08CX2_A396EmprCod = new String[] {""} ;
      AV24Option = "" ;
      P08CX3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08CX3_A602MaqCod = new String[] {""} ;
      P08CX3_A396EmprCod = new String[] {""} ;
      P08CX4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08CX4_A602MaqCod = new String[] {""} ;
      P08CX4_A396EmprCod = new String[] {""} ;
      P08CX5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08CX5_A602MaqCod = new String[] {""} ;
      P08CX5_A396EmprCod = new String[] {""} ;
      AV27OptionDesc = "" ;
      P08CX6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08CX6_A602MaqCod = new String[] {""} ;
      P08CX6_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wclecturasproducciongetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08CX2_A602MaqCod, P08CX2_A558HisProFec, P08CX2_A396EmprCod
            }
            , new Object[] {
            P08CX3_A558HisProFec, P08CX3_A602MaqCod, P08CX3_A396EmprCod
            }
            , new Object[] {
            P08CX4_A558HisProFec, P08CX4_A602MaqCod, P08CX4_A396EmprCod
            }
            , new Object[] {
            P08CX5_A558HisProFec, P08CX5_A602MaqCod, P08CX5_A396EmprCod
            }
            , new Object[] {
            P08CX6_A558HisProFec, P08CX6_A602MaqCod, P08CX6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV68TFHisProTur ;
   private byte AV69TFHisProTur_To ;
   private byte AV51Barcodreo ;
   private byte AV85Wclecturasproduccionds_3_barcodreo ;
   private byte AV99Wclecturasproduccionds_17_tfhisprotur ;
   private byte AV100Wclecturasproduccionds_18_tfhisprotur_to ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private short AV16TFBarOrdLin ;
   private short AV17TFBarOrdLin_To ;
   private short AV76TFHisProNpzs ;
   private short AV77TFHisProNpzs_To ;
   private short AV64TFParCod ;
   private short AV65TFParCod_To ;
   private short AV93Wclecturasproduccionds_11_tfbarordlin ;
   private short AV94Wclecturasproduccionds_12_tfbarordlin_to ;
   private short AV109Wclecturasproduccionds_27_tfhispronpzs ;
   private short AV110Wclecturasproduccionds_28_tfhispronpzs_to ;
   private short AV113Wclecturasproduccionds_31_tfparcod ;
   private short AV114Wclecturasproduccionds_32_tfparcod_to ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV81GXV1 ;
   private int AV14TFHisProLin ;
   private int AV15TFHisProLin_To ;
   private int AV62TFGruOpeCod ;
   private int AV63TFGruOpeCod_To ;
   private int AV50Barcod ;
   private int AV84Wclecturasproduccionds_2_barcod ;
   private int AV91Wclecturasproduccionds_9_tfhisprolin ;
   private int AV92Wclecturasproduccionds_10_tfhisprolin_to ;
   private int AV111Wclecturasproduccionds_29_tfgruopecod ;
   private int AV112Wclecturasproduccionds_30_tfgruopecod_to ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV72TFHisProKgr ;
   private java.math.BigDecimal AV73TFHisProKgr_To ;
   private java.math.BigDecimal AV74TFHisProMtr ;
   private java.math.BigDecimal AV75TFHisProMtr_To ;
   private java.math.BigDecimal AV105Wclecturasproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV106Wclecturasproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV107Wclecturasproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV108Wclecturasproduccionds_26_tfhispromtr_to ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV18TFFase ;
   private String AV19TFFase_Sel ;
   private String AV56TFFaseDsc ;
   private String AV57TFFaseDsc_Sel ;
   private String AV70TFHisProF ;
   private String AV71TFHisProF_Sel ;
   private String AV66TFParCodNom ;
   private String AV67TFParCodNom_Sel ;
   private String AV49Emprcod ;
   private String AV52BarCodpar ;
   private String A602MaqCod ;
   private String AV83Wclecturasproduccionds_1_emprcod ;
   private String AV86Wclecturasproduccionds_4_barcodpar ;
   private String AV88Wclecturasproduccionds_6_tfmaqcod ;
   private String AV89Wclecturasproduccionds_7_tfmaqcod_sel ;
   private String AV95Wclecturasproduccionds_13_tffase ;
   private String AV96Wclecturasproduccionds_14_tffase_sel ;
   private String AV97Wclecturasproduccionds_15_tffasedsc ;
   private String AV98Wclecturasproduccionds_16_tffasedsc_sel ;
   private String AV101Wclecturasproduccionds_19_tfhisprof ;
   private String AV102Wclecturasproduccionds_20_tfhisprof_sel ;
   private String AV115Wclecturasproduccionds_33_tfparcodnom ;
   private String AV116Wclecturasproduccionds_34_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV97Wclecturasproduccionds_15_tffasedsc ;
   private String lV88Wclecturasproduccionds_6_tfmaqcod ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String A7258FaseDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV58TFHisProDTI ;
   private java.util.Date AV60TFHisProDTF ;
   private java.util.Date AV103Wclecturasproduccionds_21_tfhisprodti ;
   private java.util.Date AV104Wclecturasproduccionds_22_tfhisprodtf ;
   private java.util.Date AV12TFHisProFec ;
   private java.util.Date AV90Wclecturasproduccionds_8_tfhisprofec ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk8CX2 ;
   private boolean brk8CX4 ;
   private boolean brk8CX7 ;
   private boolean brk8CX9 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV78FilterFullText ;
   private String AV87Wclecturasproduccionds_5_filterfulltext ;
   private String lV87Wclecturasproduccionds_5_filterfulltext ;
   private String AV24Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08CX2_A602MaqCod ;
   private java.util.Date[] P08CX2_A558HisProFec ;
   private String[] P08CX2_A396EmprCod ;
   private java.util.Date[] P08CX3_A558HisProFec ;
   private String[] P08CX3_A602MaqCod ;
   private String[] P08CX3_A396EmprCod ;
   private java.util.Date[] P08CX4_A558HisProFec ;
   private String[] P08CX4_A602MaqCod ;
   private String[] P08CX4_A396EmprCod ;
   private java.util.Date[] P08CX5_A558HisProFec ;
   private String[] P08CX5_A602MaqCod ;
   private String[] P08CX5_A396EmprCod ;
   private java.util.Date[] P08CX6_A558HisProFec ;
   private String[] P08CX6_A602MaqCod ;
   private String[] P08CX6_A396EmprCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wclecturasproducciongetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV88Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV90Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV91Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV92Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV93Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV94Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV96Wclecturasproduccionds_14_tffase_sel ,
                                          String AV95Wclecturasproduccionds_13_tffase ,
                                          byte AV99Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV100Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV101Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV103Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV107Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV109Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV110Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV111Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV112Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV113Wclecturasproduccionds_31_tfparcod ,
                                          short AV114Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV115Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV87Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV97Wclecturasproduccionds_15_tffasedsc ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodpar ,
                                          String AV83Wclecturasproduccionds_1_emprcod ,
                                          int AV84Wclecturasproduccionds_2_barcod ,
                                          byte AV85Wclecturasproduccionds_3_barcodreo ,
                                          String AV86Wclecturasproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[43];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MaqCod, HisProFec, EmprCod FROM TXPCHIPRO" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08CX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV88Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV90Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV91Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV92Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV93Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV94Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV96Wclecturasproduccionds_14_tffase_sel ,
                                          String AV95Wclecturasproduccionds_13_tffase ,
                                          byte AV99Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV100Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV101Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV103Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV107Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV109Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV110Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV111Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV112Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV113Wclecturasproduccionds_31_tfparcod ,
                                          short AV114Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV115Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV87Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV97Wclecturasproduccionds_15_tffasedsc ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodpar ,
                                          String AV83Wclecturasproduccionds_1_emprcod ,
                                          int AV84Wclecturasproduccionds_2_barcod ,
                                          byte AV85Wclecturasproduccionds_3_barcodreo ,
                                          String AV86Wclecturasproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[43];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT HisProFec, MaqCod, EmprCod FROM TXPCHIPRO" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08CX4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV88Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV90Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV91Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV92Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV93Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV94Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV96Wclecturasproduccionds_14_tffase_sel ,
                                          String AV95Wclecturasproduccionds_13_tffase ,
                                          byte AV99Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV100Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV101Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV103Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV107Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV109Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV110Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV111Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV112Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV113Wclecturasproduccionds_31_tfparcod ,
                                          short AV114Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV115Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV87Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV97Wclecturasproduccionds_15_tffasedsc ,
                                          int A129BarCod ,
                                          int AV84Wclecturasproduccionds_2_barcod ,
                                          byte A132BarCodReo ,
                                          byte AV85Wclecturasproduccionds_3_barcodreo ,
                                          String A130BarCodPar ,
                                          String AV86Wclecturasproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int AV50Barcod ,
                                          byte AV51Barcodreo ,
                                          String AV52BarCodpar ,
                                          String AV83Wclecturasproduccionds_1_emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[50];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT HisProFec, MaqCod, EmprCod FROM TXPCHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08CX5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV88Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV90Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV91Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV92Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV93Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV94Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV96Wclecturasproduccionds_14_tffase_sel ,
                                          String AV95Wclecturasproduccionds_13_tffase ,
                                          byte AV99Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV100Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV101Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV103Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV107Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV109Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV110Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV111Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV112Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV113Wclecturasproduccionds_31_tfparcod ,
                                          short AV114Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV115Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV87Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV97Wclecturasproduccionds_15_tffasedsc ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodpar ,
                                          String AV83Wclecturasproduccionds_1_emprcod ,
                                          int AV84Wclecturasproduccionds_2_barcod ,
                                          byte AV85Wclecturasproduccionds_3_barcodreo ,
                                          String AV86Wclecturasproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[43];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT HisProFec, MaqCod, EmprCod FROM TXPCHIPRO" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08CX6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV88Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV90Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV91Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV92Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV93Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV94Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV96Wclecturasproduccionds_14_tffase_sel ,
                                          String AV95Wclecturasproduccionds_13_tffase ,
                                          byte AV99Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV100Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV102Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV101Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV103Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV104Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV105Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV106Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV107Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV108Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV109Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV110Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV111Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV112Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV113Wclecturasproduccionds_31_tfparcod ,
                                          short AV114Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV116Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV115Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV87Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV98Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV97Wclecturasproduccionds_15_tffasedsc ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodpar ,
                                          String AV83Wclecturasproduccionds_1_emprcod ,
                                          int AV84Wclecturasproduccionds_2_barcod ,
                                          byte AV85Wclecturasproduccionds_3_barcodreo ,
                                          String AV86Wclecturasproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[43];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT HisProFec, MaqCod, EmprCod FROM TXPCHIPRO" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08CX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] );
            case 1 :
                  return conditional_P08CX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] );
            case 2 :
                  return conditional_P08CX4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).byteValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 3 :
                  return conditional_P08CX5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] );
            case 4 :
                  return conditional_P08CX6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CX4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CX5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CX6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 3);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               return;
      }
   }

}

