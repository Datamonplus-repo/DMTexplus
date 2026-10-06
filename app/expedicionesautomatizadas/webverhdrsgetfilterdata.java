package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webverhdrsgetfilterdata extends GXProcedure
{
   public webverhdrsgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webverhdrsgetfilterdata.class ), "" );
   }

   public webverhdrsgetfilterdata( int remoteHandle ,
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
      webverhdrsgetfilterdata.this.aP5 = new String[] {""};
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
      webverhdrsgetfilterdata.this.AV50DDOName = aP0;
      webverhdrsgetfilterdata.this.AV51SearchTxt = aP1;
      webverhdrsgetfilterdata.this.AV52SearchTxtTo = aP2;
      webverhdrsgetfilterdata.this.aP3 = aP3;
      webverhdrsgetfilterdata.this.aP4 = aP4;
      webverhdrsgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV43OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_HISPROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADHISPROCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_MAQCDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCDSCOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV53OptionsJson = AV40Options.toJSonString(false) ;
      AV54OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV55OptionIndexesJson = AV43OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV56FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPRODTF") == 0 )
         {
            AV57HisProDTF = localUtil.ctot( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV58HisProDTF_To = localUtil.ctot( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "MAQCOD") == 0 )
         {
            AV59MaqCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV10TFBarCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV12TFBarCodReo = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarCodReo_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV14TFBarCodPar = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV15TFBarCodPar_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV20TFBarSer = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV21TFBarSer_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV22TFBarSerDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV23TFBarSerDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV24TFHisProKgr = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFHisProKgr_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV26TFHisProMtr = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFHisProMtr_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV28TFHisProDTF = localUtil.ctot( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV30TFBarColNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV31TFBarColNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD") == 0 )
         {
            AV32TFHisProCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD_SEL") == 0 )
         {
            AV33TFHisProCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV34TFMaqCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV35TFMaqCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC") == 0 )
         {
            AV36TFMaqCDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC_SEL") == 0 )
         {
            AV37TFMaqCDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV60EmprCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD1") == 0 )
         {
            AV61Maqcod1 = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD2") == 0 )
         {
            AV62Maqcod2 = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarCodPar = AV51SearchTxt ;
      AV15TFBarCodPar_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV61Maqcod1 ,
                                           AV62Maqcod2 ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09772 */
      pr_default.execute(0, new Object[] {AV61Maqcod1, AV62Maqcod2, AV60EmprCod, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9772 = false ;
         A396EmprCod = P09772_A396EmprCod[0] ;
         A130BarCodPar = P09772_A130BarCodPar[0] ;
         A2504HisProCod = P09772_A2504HisProCod[0] ;
         A135BarColNom = P09772_A135BarColNom[0] ;
         A1526HisProMtr = P09772_A1526HisProMtr[0] ;
         A1525HisProKgr = P09772_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09772_A1652BarSerDsc[0] ;
         A212BarSer = P09772_A212BarSer[0] ;
         A279CliNom = P09772_A279CliNom[0] ;
         A252CliCod = P09772_A252CliCod[0] ;
         n252CliCod = P09772_n252CliCod[0] ;
         A132BarCodReo = P09772_A132BarCodReo[0] ;
         A129BarCod = P09772_A129BarCod[0] ;
         A4441HisProDTF = P09772_A4441HisProDTF[0] ;
         n4441HisProDTF = P09772_n4441HisProDTF[0] ;
         A606MaqDsc = P09772_A606MaqDsc[0] ;
         n606MaqDsc = P09772_n606MaqDsc[0] ;
         A602MaqCod = P09772_A602MaqCod[0] ;
         A558HisProFec = P09772_A558HisProFec[0] ;
         A561HisProLin = P09772_A561HisProLin[0] ;
         A135BarColNom = P09772_A135BarColNom[0] ;
         A1652BarSerDsc = P09772_A1652BarSerDsc[0] ;
         A212BarSer = P09772_A212BarSer[0] ;
         A252CliCod = P09772_A252CliCod[0] ;
         n252CliCod = P09772_n252CliCod[0] ;
         A279CliNom = P09772_A279CliNom[0] ;
         A606MaqDsc = P09772_A606MaqDsc[0] ;
         n606MaqDsc = P09772_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09772_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk9772 = false ;
            A396EmprCod = P09772_A396EmprCod[0] ;
            A602MaqCod = P09772_A602MaqCod[0] ;
            A558HisProFec = P09772_A558HisProFec[0] ;
            A561HisProLin = P09772_A561HisProLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9772 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
         {
            AV39Option = A130BarCodPar ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9772 )
         {
            brk9772 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV51SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV61Maqcod1 ,
                                           AV62Maqcod2 ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09773 */
      pr_default.execute(1, new Object[] {AV61Maqcod1, AV62Maqcod2, AV60EmprCod, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9774 = false ;
         A396EmprCod = P09773_A396EmprCod[0] ;
         A279CliNom = P09773_A279CliNom[0] ;
         A2504HisProCod = P09773_A2504HisProCod[0] ;
         A135BarColNom = P09773_A135BarColNom[0] ;
         A1526HisProMtr = P09773_A1526HisProMtr[0] ;
         A1525HisProKgr = P09773_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09773_A1652BarSerDsc[0] ;
         A212BarSer = P09773_A212BarSer[0] ;
         A252CliCod = P09773_A252CliCod[0] ;
         n252CliCod = P09773_n252CliCod[0] ;
         A130BarCodPar = P09773_A130BarCodPar[0] ;
         A132BarCodReo = P09773_A132BarCodReo[0] ;
         A129BarCod = P09773_A129BarCod[0] ;
         A4441HisProDTF = P09773_A4441HisProDTF[0] ;
         n4441HisProDTF = P09773_n4441HisProDTF[0] ;
         A606MaqDsc = P09773_A606MaqDsc[0] ;
         n606MaqDsc = P09773_n606MaqDsc[0] ;
         A602MaqCod = P09773_A602MaqCod[0] ;
         A558HisProFec = P09773_A558HisProFec[0] ;
         A561HisProLin = P09773_A561HisProLin[0] ;
         A135BarColNom = P09773_A135BarColNom[0] ;
         A1652BarSerDsc = P09773_A1652BarSerDsc[0] ;
         A212BarSer = P09773_A212BarSer[0] ;
         A252CliCod = P09773_A252CliCod[0] ;
         n252CliCod = P09773_n252CliCod[0] ;
         A279CliNom = P09773_A279CliNom[0] ;
         A606MaqDsc = P09773_A606MaqDsc[0] ;
         n606MaqDsc = P09773_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09773_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9774 = false ;
            A396EmprCod = P09773_A396EmprCod[0] ;
            A252CliCod = P09773_A252CliCod[0] ;
            n252CliCod = P09773_n252CliCod[0] ;
            A130BarCodPar = P09773_A130BarCodPar[0] ;
            A132BarCodReo = P09773_A132BarCodReo[0] ;
            A129BarCod = P09773_A129BarCod[0] ;
            A602MaqCod = P09773_A602MaqCod[0] ;
            A558HisProFec = P09773_A558HisProFec[0] ;
            A561HisProLin = P09773_A561HisProLin[0] ;
            A252CliCod = P09773_A252CliCod[0] ;
            n252CliCod = P09773_n252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9774 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV39Option = A279CliNom ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9774 )
         {
            brk9774 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarSer = AV51SearchTxt ;
      AV21TFBarSer_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV61Maqcod1 ,
                                           AV62Maqcod2 ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09774 */
      pr_default.execute(2, new Object[] {AV61Maqcod1, AV62Maqcod2, AV60EmprCod, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9776 = false ;
         A396EmprCod = P09774_A396EmprCod[0] ;
         A212BarSer = P09774_A212BarSer[0] ;
         A2504HisProCod = P09774_A2504HisProCod[0] ;
         A135BarColNom = P09774_A135BarColNom[0] ;
         A1526HisProMtr = P09774_A1526HisProMtr[0] ;
         A1525HisProKgr = P09774_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09774_A1652BarSerDsc[0] ;
         A279CliNom = P09774_A279CliNom[0] ;
         A252CliCod = P09774_A252CliCod[0] ;
         n252CliCod = P09774_n252CliCod[0] ;
         A130BarCodPar = P09774_A130BarCodPar[0] ;
         A132BarCodReo = P09774_A132BarCodReo[0] ;
         A129BarCod = P09774_A129BarCod[0] ;
         A4441HisProDTF = P09774_A4441HisProDTF[0] ;
         n4441HisProDTF = P09774_n4441HisProDTF[0] ;
         A606MaqDsc = P09774_A606MaqDsc[0] ;
         n606MaqDsc = P09774_n606MaqDsc[0] ;
         A602MaqCod = P09774_A602MaqCod[0] ;
         A558HisProFec = P09774_A558HisProFec[0] ;
         A561HisProLin = P09774_A561HisProLin[0] ;
         A212BarSer = P09774_A212BarSer[0] ;
         A135BarColNom = P09774_A135BarColNom[0] ;
         A1652BarSerDsc = P09774_A1652BarSerDsc[0] ;
         A252CliCod = P09774_A252CliCod[0] ;
         n252CliCod = P09774_n252CliCod[0] ;
         A279CliNom = P09774_A279CliNom[0] ;
         A606MaqDsc = P09774_A606MaqDsc[0] ;
         n606MaqDsc = P09774_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09774_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9776 = false ;
            A396EmprCod = P09774_A396EmprCod[0] ;
            A130BarCodPar = P09774_A130BarCodPar[0] ;
            A132BarCodReo = P09774_A132BarCodReo[0] ;
            A129BarCod = P09774_A129BarCod[0] ;
            A602MaqCod = P09774_A602MaqCod[0] ;
            A558HisProFec = P09774_A558HisProFec[0] ;
            A561HisProLin = P09774_A561HisProLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9776 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV39Option = A212BarSer ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9776 )
         {
            brk9776 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSerDsc = AV51SearchTxt ;
      AV23TFBarSerDsc_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV61Maqcod1 ,
                                           AV62Maqcod2 ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09775 */
      pr_default.execute(3, new Object[] {AV61Maqcod1, AV62Maqcod2, AV60EmprCod, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9778 = false ;
         A396EmprCod = P09775_A396EmprCod[0] ;
         A1652BarSerDsc = P09775_A1652BarSerDsc[0] ;
         A2504HisProCod = P09775_A2504HisProCod[0] ;
         A135BarColNom = P09775_A135BarColNom[0] ;
         A1526HisProMtr = P09775_A1526HisProMtr[0] ;
         A1525HisProKgr = P09775_A1525HisProKgr[0] ;
         A212BarSer = P09775_A212BarSer[0] ;
         A279CliNom = P09775_A279CliNom[0] ;
         A252CliCod = P09775_A252CliCod[0] ;
         n252CliCod = P09775_n252CliCod[0] ;
         A130BarCodPar = P09775_A130BarCodPar[0] ;
         A132BarCodReo = P09775_A132BarCodReo[0] ;
         A129BarCod = P09775_A129BarCod[0] ;
         A4441HisProDTF = P09775_A4441HisProDTF[0] ;
         n4441HisProDTF = P09775_n4441HisProDTF[0] ;
         A606MaqDsc = P09775_A606MaqDsc[0] ;
         n606MaqDsc = P09775_n606MaqDsc[0] ;
         A602MaqCod = P09775_A602MaqCod[0] ;
         A558HisProFec = P09775_A558HisProFec[0] ;
         A561HisProLin = P09775_A561HisProLin[0] ;
         A1652BarSerDsc = P09775_A1652BarSerDsc[0] ;
         A135BarColNom = P09775_A135BarColNom[0] ;
         A212BarSer = P09775_A212BarSer[0] ;
         A252CliCod = P09775_A252CliCod[0] ;
         n252CliCod = P09775_n252CliCod[0] ;
         A279CliNom = P09775_A279CliNom[0] ;
         A606MaqDsc = P09775_A606MaqDsc[0] ;
         n606MaqDsc = P09775_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09775_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9778 = false ;
            A396EmprCod = P09775_A396EmprCod[0] ;
            A130BarCodPar = P09775_A130BarCodPar[0] ;
            A132BarCodReo = P09775_A132BarCodReo[0] ;
            A129BarCod = P09775_A129BarCod[0] ;
            A602MaqCod = P09775_A602MaqCod[0] ;
            A558HisProFec = P09775_A558HisProFec[0] ;
            A561HisProLin = P09775_A561HisProLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9778 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV39Option = A1652BarSerDsc ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9778 )
         {
            brk9778 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV30TFBarColNom = AV51SearchTxt ;
      AV31TFBarColNom_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV61Maqcod1 ,
                                           AV62Maqcod2 ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09776 */
      pr_default.execute(4, new Object[] {AV61Maqcod1, AV62Maqcod2, AV60EmprCod, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk97710 = false ;
         A396EmprCod = P09776_A396EmprCod[0] ;
         A135BarColNom = P09776_A135BarColNom[0] ;
         A2504HisProCod = P09776_A2504HisProCod[0] ;
         A1526HisProMtr = P09776_A1526HisProMtr[0] ;
         A1525HisProKgr = P09776_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09776_A1652BarSerDsc[0] ;
         A212BarSer = P09776_A212BarSer[0] ;
         A279CliNom = P09776_A279CliNom[0] ;
         A252CliCod = P09776_A252CliCod[0] ;
         n252CliCod = P09776_n252CliCod[0] ;
         A130BarCodPar = P09776_A130BarCodPar[0] ;
         A132BarCodReo = P09776_A132BarCodReo[0] ;
         A129BarCod = P09776_A129BarCod[0] ;
         A4441HisProDTF = P09776_A4441HisProDTF[0] ;
         n4441HisProDTF = P09776_n4441HisProDTF[0] ;
         A606MaqDsc = P09776_A606MaqDsc[0] ;
         n606MaqDsc = P09776_n606MaqDsc[0] ;
         A602MaqCod = P09776_A602MaqCod[0] ;
         A558HisProFec = P09776_A558HisProFec[0] ;
         A561HisProLin = P09776_A561HisProLin[0] ;
         A135BarColNom = P09776_A135BarColNom[0] ;
         A1652BarSerDsc = P09776_A1652BarSerDsc[0] ;
         A212BarSer = P09776_A212BarSer[0] ;
         A252CliCod = P09776_A252CliCod[0] ;
         n252CliCod = P09776_n252CliCod[0] ;
         A279CliNom = P09776_A279CliNom[0] ;
         A606MaqDsc = P09776_A606MaqDsc[0] ;
         n606MaqDsc = P09776_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09776_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk97710 = false ;
            A396EmprCod = P09776_A396EmprCod[0] ;
            A130BarCodPar = P09776_A130BarCodPar[0] ;
            A132BarCodReo = P09776_A132BarCodReo[0] ;
            A129BarCod = P09776_A129BarCod[0] ;
            A602MaqCod = P09776_A602MaqCod[0] ;
            A558HisProFec = P09776_A558HisProFec[0] ;
            A561HisProLin = P09776_A561HisProLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brk97710 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV39Option = A135BarColNom ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97710 )
         {
            brk97710 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADHISPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFHisProCod = AV51SearchTxt ;
      AV33TFHisProCod_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV61Maqcod1 ,
                                           AV62Maqcod2 ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09777 */
      pr_default.execute(5, new Object[] {AV61Maqcod1, AV62Maqcod2, AV60EmprCod, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk97712 = false ;
         A396EmprCod = P09777_A396EmprCod[0] ;
         A2504HisProCod = P09777_A2504HisProCod[0] ;
         A135BarColNom = P09777_A135BarColNom[0] ;
         A1526HisProMtr = P09777_A1526HisProMtr[0] ;
         A1525HisProKgr = P09777_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09777_A1652BarSerDsc[0] ;
         A212BarSer = P09777_A212BarSer[0] ;
         A279CliNom = P09777_A279CliNom[0] ;
         A252CliCod = P09777_A252CliCod[0] ;
         n252CliCod = P09777_n252CliCod[0] ;
         A130BarCodPar = P09777_A130BarCodPar[0] ;
         A132BarCodReo = P09777_A132BarCodReo[0] ;
         A129BarCod = P09777_A129BarCod[0] ;
         A4441HisProDTF = P09777_A4441HisProDTF[0] ;
         n4441HisProDTF = P09777_n4441HisProDTF[0] ;
         A606MaqDsc = P09777_A606MaqDsc[0] ;
         n606MaqDsc = P09777_n606MaqDsc[0] ;
         A602MaqCod = P09777_A602MaqCod[0] ;
         A558HisProFec = P09777_A558HisProFec[0] ;
         A561HisProLin = P09777_A561HisProLin[0] ;
         A135BarColNom = P09777_A135BarColNom[0] ;
         A1652BarSerDsc = P09777_A1652BarSerDsc[0] ;
         A212BarSer = P09777_A212BarSer[0] ;
         A252CliCod = P09777_A252CliCod[0] ;
         n252CliCod = P09777_n252CliCod[0] ;
         A279CliNom = P09777_A279CliNom[0] ;
         A606MaqDsc = P09777_A606MaqDsc[0] ;
         n606MaqDsc = P09777_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09777_A2504HisProCod[0], A2504HisProCod) == 0 ) )
         {
            brk97712 = false ;
            A396EmprCod = P09777_A396EmprCod[0] ;
            A602MaqCod = P09777_A602MaqCod[0] ;
            A558HisProFec = P09777_A558HisProFec[0] ;
            A561HisProLin = P09777_A561HisProLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brk97712 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A2504HisProCod)==0) )
         {
            AV39Option = A2504HisProCod ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97712 )
         {
            brk97712 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV34TFMaqCod = AV51SearchTxt ;
      AV35TFMaqCod_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV60EmprCod ,
                                           AV61Maqcod1 ,
                                           A396EmprCod ,
                                           AV62Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09778 */
      pr_default.execute(6, new Object[] {AV60EmprCod, AV61Maqcod1, AV62Maqcod2, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk97714 = false ;
         A396EmprCod = P09778_A396EmprCod[0] ;
         A2504HisProCod = P09778_A2504HisProCod[0] ;
         A135BarColNom = P09778_A135BarColNom[0] ;
         A1526HisProMtr = P09778_A1526HisProMtr[0] ;
         A1525HisProKgr = P09778_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09778_A1652BarSerDsc[0] ;
         A212BarSer = P09778_A212BarSer[0] ;
         A279CliNom = P09778_A279CliNom[0] ;
         A252CliCod = P09778_A252CliCod[0] ;
         n252CliCod = P09778_n252CliCod[0] ;
         A130BarCodPar = P09778_A130BarCodPar[0] ;
         A132BarCodReo = P09778_A132BarCodReo[0] ;
         A129BarCod = P09778_A129BarCod[0] ;
         A4441HisProDTF = P09778_A4441HisProDTF[0] ;
         n4441HisProDTF = P09778_n4441HisProDTF[0] ;
         A606MaqDsc = P09778_A606MaqDsc[0] ;
         n606MaqDsc = P09778_n606MaqDsc[0] ;
         A602MaqCod = P09778_A602MaqCod[0] ;
         A558HisProFec = P09778_A558HisProFec[0] ;
         A561HisProLin = P09778_A561HisProLin[0] ;
         A135BarColNom = P09778_A135BarColNom[0] ;
         A1652BarSerDsc = P09778_A1652BarSerDsc[0] ;
         A212BarSer = P09778_A212BarSer[0] ;
         A252CliCod = P09778_A252CliCod[0] ;
         n252CliCod = P09778_n252CliCod[0] ;
         A279CliNom = P09778_A279CliNom[0] ;
         A606MaqDsc = P09778_A606MaqDsc[0] ;
         n606MaqDsc = P09778_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09778_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09778_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk97714 = false ;
            A558HisProFec = P09778_A558HisProFec[0] ;
            A561HisProLin = P09778_A561HisProLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brk97714 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV39Option = A602MaqCod ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97714 )
         {
            brk97714 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADMAQCDSCOPTIONS' Routine */
      returnInSub = false ;
      AV36TFMaqCDsc = AV51SearchTxt ;
      AV37TFMaqCDsc_Sel = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV56FilterFullText ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV57HisProDTF ;
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV58HisProDTF_To ;
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV59MaqCod ;
      AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV10TFBarCod ;
      AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV11TFBarCod_To ;
      AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV12TFBarCodReo ;
      AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV14TFBarCodPar ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV16TFCliCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV17TFCliCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV18TFCliNom ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV19TFCliNom_Sel ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV20TFBarSer ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV22TFBarSerDsc ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV26TFHisProMtr ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV28TFHisProDTF ;
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV30TFBarColNom ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV32TFHisProCod ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV33TFHisProCod_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV34TFMaqCod ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV36TFMaqCDsc ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV37TFMaqCDsc_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV60EmprCod ,
                                           AV61Maqcod1 ,
                                           A396EmprCod ,
                                           AV62Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09779 */
      pr_default.execute(7, new Object[] {AV60EmprCod, AV61Maqcod1, AV62Maqcod2, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A396EmprCod = P09779_A396EmprCod[0] ;
         A2504HisProCod = P09779_A2504HisProCod[0] ;
         A135BarColNom = P09779_A135BarColNom[0] ;
         A1526HisProMtr = P09779_A1526HisProMtr[0] ;
         A1525HisProKgr = P09779_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09779_A1652BarSerDsc[0] ;
         A212BarSer = P09779_A212BarSer[0] ;
         A279CliNom = P09779_A279CliNom[0] ;
         A252CliCod = P09779_A252CliCod[0] ;
         n252CliCod = P09779_n252CliCod[0] ;
         A130BarCodPar = P09779_A130BarCodPar[0] ;
         A132BarCodReo = P09779_A132BarCodReo[0] ;
         A129BarCod = P09779_A129BarCod[0] ;
         A4441HisProDTF = P09779_A4441HisProDTF[0] ;
         n4441HisProDTF = P09779_n4441HisProDTF[0] ;
         A606MaqDsc = P09779_A606MaqDsc[0] ;
         n606MaqDsc = P09779_n606MaqDsc[0] ;
         A602MaqCod = P09779_A602MaqCod[0] ;
         A558HisProFec = P09779_A558HisProFec[0] ;
         A561HisProLin = P09779_A561HisProLin[0] ;
         A135BarColNom = P09779_A135BarColNom[0] ;
         A1652BarSerDsc = P09779_A1652BarSerDsc[0] ;
         A212BarSer = P09779_A212BarSer[0] ;
         A252CliCod = P09779_A252CliCod[0] ;
         n252CliCod = P09779_n252CliCod[0] ;
         A279CliNom = P09779_A279CliNom[0] ;
         A606MaqDsc = P09779_A606MaqDsc[0] ;
         n606MaqDsc = P09779_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         if ( ! (GXutil.strcmp("", A13734MaqCDsc)==0) )
         {
            AV39Option = A13734MaqCDsc ;
            AV38InsertIndex = 1 ;
            while ( ( AV38InsertIndex <= AV40Options.size() ) && ( GXutil.strcmp((String)AV40Options.elementAt(-1+AV38InsertIndex), AV39Option) < 0 ) )
            {
               AV38InsertIndex = (int)(AV38InsertIndex+1) ;
            }
            if ( ( AV38InsertIndex <= AV40Options.size() ) && ( GXutil.strcmp((String)AV40Options.elementAt(-1+AV38InsertIndex), AV39Option) == 0 ) )
            {
               AV44count = GXutil.lval( (String)AV43OptionIndexes.elementAt(-1+AV38InsertIndex)) ;
               AV44count = (long)(AV44count+1) ;
               AV43OptionIndexes.removeItem(AV38InsertIndex);
               AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV38InsertIndex);
            }
            else
            {
               AV40Options.add(AV39Option, AV38InsertIndex);
               AV43OptionIndexes.add("1", AV38InsertIndex);
            }
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webverhdrsgetfilterdata.this.AV53OptionsJson;
      this.aP4[0] = webverhdrsgetfilterdata.this.AV54OptionsDescJson;
      this.aP5[0] = webverhdrsgetfilterdata.this.AV55OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV53OptionsJson = "" ;
      AV54OptionsDescJson = "" ;
      AV55OptionIndexesJson = "" ;
      AV40Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV43OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV56FilterFullText = "" ;
      AV57HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV58HisProDTF_To = GXutil.resetTime( GXutil.nullDate() );
      AV59MaqCod = "" ;
      AV14TFBarCodPar = "" ;
      AV15TFBarCodPar_Sel = "" ;
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV20TFBarSer = "" ;
      AV21TFBarSer_Sel = "" ;
      AV22TFBarSerDsc = "" ;
      AV23TFBarSerDsc_Sel = "" ;
      AV24TFHisProKgr = DecimalUtil.ZERO ;
      AV25TFHisProKgr_To = DecimalUtil.ZERO ;
      AV26TFHisProMtr = DecimalUtil.ZERO ;
      AV27TFHisProMtr_To = DecimalUtil.ZERO ;
      AV28TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV30TFBarColNom = "" ;
      AV31TFBarColNom_Sel = "" ;
      AV32TFHisProCod = "" ;
      AV33TFHisProCod_Sel = "" ;
      AV34TFMaqCod = "" ;
      AV35TFMaqCod_Sel = "" ;
      AV36TFMaqCDsc = "" ;
      AV37TFMaqCDsc_Sel = "" ;
      AV60EmprCod = "" ;
      AV61Maqcod1 = "" ;
      AV62Maqcod2 = "" ;
      A130BarCodPar = "" ;
      AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = GXutil.resetTime( GXutil.nullDate() );
      AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = "" ;
      AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = "" ;
      AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = "" ;
      AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = "" ;
      AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = "" ;
      AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = "" ;
      AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = "" ;
      AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = "" ;
      scmdbuf = "" ;
      lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A2504HisProCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P09772_A396EmprCod = new String[] {""} ;
      P09772_A130BarCodPar = new String[] {""} ;
      P09772_A2504HisProCod = new String[] {""} ;
      P09772_A135BarColNom = new String[] {""} ;
      P09772_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09772_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09772_A1652BarSerDsc = new String[] {""} ;
      P09772_A212BarSer = new String[] {""} ;
      P09772_A279CliNom = new String[] {""} ;
      P09772_A252CliCod = new int[1] ;
      P09772_n252CliCod = new boolean[] {false} ;
      P09772_A132BarCodReo = new byte[1] ;
      P09772_A129BarCod = new int[1] ;
      P09772_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09772_n4441HisProDTF = new boolean[] {false} ;
      P09772_A606MaqDsc = new String[] {""} ;
      P09772_n606MaqDsc = new boolean[] {false} ;
      P09772_A602MaqCod = new String[] {""} ;
      P09772_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09772_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      A13734MaqCDsc = "" ;
      AV39Option = "" ;
      P09773_A396EmprCod = new String[] {""} ;
      P09773_A279CliNom = new String[] {""} ;
      P09773_A2504HisProCod = new String[] {""} ;
      P09773_A135BarColNom = new String[] {""} ;
      P09773_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09773_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09773_A1652BarSerDsc = new String[] {""} ;
      P09773_A212BarSer = new String[] {""} ;
      P09773_A252CliCod = new int[1] ;
      P09773_n252CliCod = new boolean[] {false} ;
      P09773_A130BarCodPar = new String[] {""} ;
      P09773_A132BarCodReo = new byte[1] ;
      P09773_A129BarCod = new int[1] ;
      P09773_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09773_n4441HisProDTF = new boolean[] {false} ;
      P09773_A606MaqDsc = new String[] {""} ;
      P09773_n606MaqDsc = new boolean[] {false} ;
      P09773_A602MaqCod = new String[] {""} ;
      P09773_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09773_A561HisProLin = new int[1] ;
      P09774_A396EmprCod = new String[] {""} ;
      P09774_A212BarSer = new String[] {""} ;
      P09774_A2504HisProCod = new String[] {""} ;
      P09774_A135BarColNom = new String[] {""} ;
      P09774_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09774_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09774_A1652BarSerDsc = new String[] {""} ;
      P09774_A279CliNom = new String[] {""} ;
      P09774_A252CliCod = new int[1] ;
      P09774_n252CliCod = new boolean[] {false} ;
      P09774_A130BarCodPar = new String[] {""} ;
      P09774_A132BarCodReo = new byte[1] ;
      P09774_A129BarCod = new int[1] ;
      P09774_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09774_n4441HisProDTF = new boolean[] {false} ;
      P09774_A606MaqDsc = new String[] {""} ;
      P09774_n606MaqDsc = new boolean[] {false} ;
      P09774_A602MaqCod = new String[] {""} ;
      P09774_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09774_A561HisProLin = new int[1] ;
      P09775_A396EmprCod = new String[] {""} ;
      P09775_A1652BarSerDsc = new String[] {""} ;
      P09775_A2504HisProCod = new String[] {""} ;
      P09775_A135BarColNom = new String[] {""} ;
      P09775_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09775_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09775_A212BarSer = new String[] {""} ;
      P09775_A279CliNom = new String[] {""} ;
      P09775_A252CliCod = new int[1] ;
      P09775_n252CliCod = new boolean[] {false} ;
      P09775_A130BarCodPar = new String[] {""} ;
      P09775_A132BarCodReo = new byte[1] ;
      P09775_A129BarCod = new int[1] ;
      P09775_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09775_n4441HisProDTF = new boolean[] {false} ;
      P09775_A606MaqDsc = new String[] {""} ;
      P09775_n606MaqDsc = new boolean[] {false} ;
      P09775_A602MaqCod = new String[] {""} ;
      P09775_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09775_A561HisProLin = new int[1] ;
      P09776_A396EmprCod = new String[] {""} ;
      P09776_A135BarColNom = new String[] {""} ;
      P09776_A2504HisProCod = new String[] {""} ;
      P09776_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09776_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09776_A1652BarSerDsc = new String[] {""} ;
      P09776_A212BarSer = new String[] {""} ;
      P09776_A279CliNom = new String[] {""} ;
      P09776_A252CliCod = new int[1] ;
      P09776_n252CliCod = new boolean[] {false} ;
      P09776_A130BarCodPar = new String[] {""} ;
      P09776_A132BarCodReo = new byte[1] ;
      P09776_A129BarCod = new int[1] ;
      P09776_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09776_n4441HisProDTF = new boolean[] {false} ;
      P09776_A606MaqDsc = new String[] {""} ;
      P09776_n606MaqDsc = new boolean[] {false} ;
      P09776_A602MaqCod = new String[] {""} ;
      P09776_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09776_A561HisProLin = new int[1] ;
      P09777_A396EmprCod = new String[] {""} ;
      P09777_A2504HisProCod = new String[] {""} ;
      P09777_A135BarColNom = new String[] {""} ;
      P09777_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09777_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09777_A1652BarSerDsc = new String[] {""} ;
      P09777_A212BarSer = new String[] {""} ;
      P09777_A279CliNom = new String[] {""} ;
      P09777_A252CliCod = new int[1] ;
      P09777_n252CliCod = new boolean[] {false} ;
      P09777_A130BarCodPar = new String[] {""} ;
      P09777_A132BarCodReo = new byte[1] ;
      P09777_A129BarCod = new int[1] ;
      P09777_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09777_n4441HisProDTF = new boolean[] {false} ;
      P09777_A606MaqDsc = new String[] {""} ;
      P09777_n606MaqDsc = new boolean[] {false} ;
      P09777_A602MaqCod = new String[] {""} ;
      P09777_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09777_A561HisProLin = new int[1] ;
      P09778_A396EmprCod = new String[] {""} ;
      P09778_A2504HisProCod = new String[] {""} ;
      P09778_A135BarColNom = new String[] {""} ;
      P09778_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09778_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09778_A1652BarSerDsc = new String[] {""} ;
      P09778_A212BarSer = new String[] {""} ;
      P09778_A279CliNom = new String[] {""} ;
      P09778_A252CliCod = new int[1] ;
      P09778_n252CliCod = new boolean[] {false} ;
      P09778_A130BarCodPar = new String[] {""} ;
      P09778_A132BarCodReo = new byte[1] ;
      P09778_A129BarCod = new int[1] ;
      P09778_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09778_n4441HisProDTF = new boolean[] {false} ;
      P09778_A606MaqDsc = new String[] {""} ;
      P09778_n606MaqDsc = new boolean[] {false} ;
      P09778_A602MaqCod = new String[] {""} ;
      P09778_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09778_A561HisProLin = new int[1] ;
      P09779_A396EmprCod = new String[] {""} ;
      P09779_A2504HisProCod = new String[] {""} ;
      P09779_A135BarColNom = new String[] {""} ;
      P09779_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09779_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09779_A1652BarSerDsc = new String[] {""} ;
      P09779_A212BarSer = new String[] {""} ;
      P09779_A279CliNom = new String[] {""} ;
      P09779_A252CliCod = new int[1] ;
      P09779_n252CliCod = new boolean[] {false} ;
      P09779_A130BarCodPar = new String[] {""} ;
      P09779_A132BarCodReo = new byte[1] ;
      P09779_A129BarCod = new int[1] ;
      P09779_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09779_n4441HisProDTF = new boolean[] {false} ;
      P09779_A606MaqDsc = new String[] {""} ;
      P09779_n606MaqDsc = new boolean[] {false} ;
      P09779_A602MaqCod = new String[] {""} ;
      P09779_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09779_A561HisProLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webverhdrsgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09772_A396EmprCod, P09772_A130BarCodPar, P09772_A2504HisProCod, P09772_A135BarColNom, P09772_A1526HisProMtr, P09772_A1525HisProKgr, P09772_A1652BarSerDsc, P09772_A212BarSer, P09772_A279CliNom, P09772_A252CliCod,
            P09772_n252CliCod, P09772_A132BarCodReo, P09772_A129BarCod, P09772_A4441HisProDTF, P09772_n4441HisProDTF, P09772_A606MaqDsc, P09772_n606MaqDsc, P09772_A602MaqCod, P09772_A558HisProFec, P09772_A561HisProLin
            }
            , new Object[] {
            P09773_A396EmprCod, P09773_A279CliNom, P09773_A2504HisProCod, P09773_A135BarColNom, P09773_A1526HisProMtr, P09773_A1525HisProKgr, P09773_A1652BarSerDsc, P09773_A212BarSer, P09773_A252CliCod, P09773_n252CliCod,
            P09773_A130BarCodPar, P09773_A132BarCodReo, P09773_A129BarCod, P09773_A4441HisProDTF, P09773_n4441HisProDTF, P09773_A606MaqDsc, P09773_n606MaqDsc, P09773_A602MaqCod, P09773_A558HisProFec, P09773_A561HisProLin
            }
            , new Object[] {
            P09774_A396EmprCod, P09774_A212BarSer, P09774_A2504HisProCod, P09774_A135BarColNom, P09774_A1526HisProMtr, P09774_A1525HisProKgr, P09774_A1652BarSerDsc, P09774_A279CliNom, P09774_A252CliCod, P09774_n252CliCod,
            P09774_A130BarCodPar, P09774_A132BarCodReo, P09774_A129BarCod, P09774_A4441HisProDTF, P09774_n4441HisProDTF, P09774_A606MaqDsc, P09774_n606MaqDsc, P09774_A602MaqCod, P09774_A558HisProFec, P09774_A561HisProLin
            }
            , new Object[] {
            P09775_A396EmprCod, P09775_A1652BarSerDsc, P09775_A2504HisProCod, P09775_A135BarColNom, P09775_A1526HisProMtr, P09775_A1525HisProKgr, P09775_A212BarSer, P09775_A279CliNom, P09775_A252CliCod, P09775_n252CliCod,
            P09775_A130BarCodPar, P09775_A132BarCodReo, P09775_A129BarCod, P09775_A4441HisProDTF, P09775_n4441HisProDTF, P09775_A606MaqDsc, P09775_n606MaqDsc, P09775_A602MaqCod, P09775_A558HisProFec, P09775_A561HisProLin
            }
            , new Object[] {
            P09776_A396EmprCod, P09776_A135BarColNom, P09776_A2504HisProCod, P09776_A1526HisProMtr, P09776_A1525HisProKgr, P09776_A1652BarSerDsc, P09776_A212BarSer, P09776_A279CliNom, P09776_A252CliCod, P09776_n252CliCod,
            P09776_A130BarCodPar, P09776_A132BarCodReo, P09776_A129BarCod, P09776_A4441HisProDTF, P09776_n4441HisProDTF, P09776_A606MaqDsc, P09776_n606MaqDsc, P09776_A602MaqCod, P09776_A558HisProFec, P09776_A561HisProLin
            }
            , new Object[] {
            P09777_A396EmprCod, P09777_A2504HisProCod, P09777_A135BarColNom, P09777_A1526HisProMtr, P09777_A1525HisProKgr, P09777_A1652BarSerDsc, P09777_A212BarSer, P09777_A279CliNom, P09777_A252CliCod, P09777_n252CliCod,
            P09777_A130BarCodPar, P09777_A132BarCodReo, P09777_A129BarCod, P09777_A4441HisProDTF, P09777_n4441HisProDTF, P09777_A606MaqDsc, P09777_n606MaqDsc, P09777_A602MaqCod, P09777_A558HisProFec, P09777_A561HisProLin
            }
            , new Object[] {
            P09778_A396EmprCod, P09778_A2504HisProCod, P09778_A135BarColNom, P09778_A1526HisProMtr, P09778_A1525HisProKgr, P09778_A1652BarSerDsc, P09778_A212BarSer, P09778_A279CliNom, P09778_A252CliCod, P09778_n252CliCod,
            P09778_A130BarCodPar, P09778_A132BarCodReo, P09778_A129BarCod, P09778_A4441HisProDTF, P09778_n4441HisProDTF, P09778_A606MaqDsc, P09778_n606MaqDsc, P09778_A602MaqCod, P09778_A558HisProFec, P09778_A561HisProLin
            }
            , new Object[] {
            P09779_A396EmprCod, P09779_A2504HisProCod, P09779_A135BarColNom, P09779_A1526HisProMtr, P09779_A1525HisProKgr, P09779_A1652BarSerDsc, P09779_A212BarSer, P09779_A279CliNom, P09779_A252CliCod, P09779_n252CliCod,
            P09779_A130BarCodPar, P09779_A132BarCodReo, P09779_A129BarCod, P09779_A4441HisProDTF, P09779_n4441HisProDTF, P09779_A606MaqDsc, P09779_n606MaqDsc, P09779_A602MaqCod, P09779_A558HisProFec, P09779_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFBarCodReo ;
   private byte AV13TFBarCodReo_To ;
   private byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ;
   private byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV10TFBarCod ;
   private int AV11TFBarCod_To ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ;
   private int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ;
   private int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ;
   private int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private int AV38InsertIndex ;
   private long AV44count ;
   private java.math.BigDecimal AV24TFHisProKgr ;
   private java.math.BigDecimal AV25TFHisProKgr_To ;
   private java.math.BigDecimal AV26TFHisProMtr ;
   private java.math.BigDecimal AV27TFHisProMtr_To ;
   private java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ;
   private java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ;
   private java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV59MaqCod ;
   private String AV14TFBarCodPar ;
   private String AV15TFBarCodPar_Sel ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV20TFBarSer ;
   private String AV21TFBarSer_Sel ;
   private String AV22TFBarSerDsc ;
   private String AV23TFBarSerDsc_Sel ;
   private String AV30TFBarColNom ;
   private String AV31TFBarColNom_Sel ;
   private String AV32TFHisProCod ;
   private String AV33TFHisProCod_Sel ;
   private String AV34TFMaqCod ;
   private String AV35TFMaqCod_Sel ;
   private String AV60EmprCod ;
   private String AV61Maqcod1 ;
   private String AV62Maqcod2 ;
   private String A130BarCodPar ;
   private String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ;
   private String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ;
   private String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ;
   private String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ;
   private String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ;
   private String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ;
   private String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String lV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String lV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String lV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String lV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String lV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String lV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String lV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2504HisProCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private java.util.Date AV57HisProDTF ;
   private java.util.Date AV58HisProDTF_To ;
   private java.util.Date AV28TFHisProDTF ;
   private java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ;
   private java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ;
   private java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk9772 ;
   private boolean n252CliCod ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private boolean brk9774 ;
   private boolean brk9776 ;
   private boolean brk9778 ;
   private boolean brk97710 ;
   private boolean brk97712 ;
   private boolean brk97714 ;
   private String AV53OptionsJson ;
   private String AV54OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV50DDOName ;
   private String AV51SearchTxt ;
   private String AV52SearchTxtTo ;
   private String AV56FilterFullText ;
   private String AV36TFMaqCDsc ;
   private String AV37TFMaqCDsc_Sel ;
   private String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ;
   private String lV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String lV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String A13734MaqCDsc ;
   private String AV39Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09772_A396EmprCod ;
   private String[] P09772_A130BarCodPar ;
   private String[] P09772_A2504HisProCod ;
   private String[] P09772_A135BarColNom ;
   private java.math.BigDecimal[] P09772_A1526HisProMtr ;
   private java.math.BigDecimal[] P09772_A1525HisProKgr ;
   private String[] P09772_A1652BarSerDsc ;
   private String[] P09772_A212BarSer ;
   private String[] P09772_A279CliNom ;
   private int[] P09772_A252CliCod ;
   private boolean[] P09772_n252CliCod ;
   private byte[] P09772_A132BarCodReo ;
   private int[] P09772_A129BarCod ;
   private java.util.Date[] P09772_A4441HisProDTF ;
   private boolean[] P09772_n4441HisProDTF ;
   private String[] P09772_A606MaqDsc ;
   private boolean[] P09772_n606MaqDsc ;
   private String[] P09772_A602MaqCod ;
   private java.util.Date[] P09772_A558HisProFec ;
   private int[] P09772_A561HisProLin ;
   private String[] P09773_A396EmprCod ;
   private String[] P09773_A279CliNom ;
   private String[] P09773_A2504HisProCod ;
   private String[] P09773_A135BarColNom ;
   private java.math.BigDecimal[] P09773_A1526HisProMtr ;
   private java.math.BigDecimal[] P09773_A1525HisProKgr ;
   private String[] P09773_A1652BarSerDsc ;
   private String[] P09773_A212BarSer ;
   private int[] P09773_A252CliCod ;
   private boolean[] P09773_n252CliCod ;
   private String[] P09773_A130BarCodPar ;
   private byte[] P09773_A132BarCodReo ;
   private int[] P09773_A129BarCod ;
   private java.util.Date[] P09773_A4441HisProDTF ;
   private boolean[] P09773_n4441HisProDTF ;
   private String[] P09773_A606MaqDsc ;
   private boolean[] P09773_n606MaqDsc ;
   private String[] P09773_A602MaqCod ;
   private java.util.Date[] P09773_A558HisProFec ;
   private int[] P09773_A561HisProLin ;
   private String[] P09774_A396EmprCod ;
   private String[] P09774_A212BarSer ;
   private String[] P09774_A2504HisProCod ;
   private String[] P09774_A135BarColNom ;
   private java.math.BigDecimal[] P09774_A1526HisProMtr ;
   private java.math.BigDecimal[] P09774_A1525HisProKgr ;
   private String[] P09774_A1652BarSerDsc ;
   private String[] P09774_A279CliNom ;
   private int[] P09774_A252CliCod ;
   private boolean[] P09774_n252CliCod ;
   private String[] P09774_A130BarCodPar ;
   private byte[] P09774_A132BarCodReo ;
   private int[] P09774_A129BarCod ;
   private java.util.Date[] P09774_A4441HisProDTF ;
   private boolean[] P09774_n4441HisProDTF ;
   private String[] P09774_A606MaqDsc ;
   private boolean[] P09774_n606MaqDsc ;
   private String[] P09774_A602MaqCod ;
   private java.util.Date[] P09774_A558HisProFec ;
   private int[] P09774_A561HisProLin ;
   private String[] P09775_A396EmprCod ;
   private String[] P09775_A1652BarSerDsc ;
   private String[] P09775_A2504HisProCod ;
   private String[] P09775_A135BarColNom ;
   private java.math.BigDecimal[] P09775_A1526HisProMtr ;
   private java.math.BigDecimal[] P09775_A1525HisProKgr ;
   private String[] P09775_A212BarSer ;
   private String[] P09775_A279CliNom ;
   private int[] P09775_A252CliCod ;
   private boolean[] P09775_n252CliCod ;
   private String[] P09775_A130BarCodPar ;
   private byte[] P09775_A132BarCodReo ;
   private int[] P09775_A129BarCod ;
   private java.util.Date[] P09775_A4441HisProDTF ;
   private boolean[] P09775_n4441HisProDTF ;
   private String[] P09775_A606MaqDsc ;
   private boolean[] P09775_n606MaqDsc ;
   private String[] P09775_A602MaqCod ;
   private java.util.Date[] P09775_A558HisProFec ;
   private int[] P09775_A561HisProLin ;
   private String[] P09776_A396EmprCod ;
   private String[] P09776_A135BarColNom ;
   private String[] P09776_A2504HisProCod ;
   private java.math.BigDecimal[] P09776_A1526HisProMtr ;
   private java.math.BigDecimal[] P09776_A1525HisProKgr ;
   private String[] P09776_A1652BarSerDsc ;
   private String[] P09776_A212BarSer ;
   private String[] P09776_A279CliNom ;
   private int[] P09776_A252CliCod ;
   private boolean[] P09776_n252CliCod ;
   private String[] P09776_A130BarCodPar ;
   private byte[] P09776_A132BarCodReo ;
   private int[] P09776_A129BarCod ;
   private java.util.Date[] P09776_A4441HisProDTF ;
   private boolean[] P09776_n4441HisProDTF ;
   private String[] P09776_A606MaqDsc ;
   private boolean[] P09776_n606MaqDsc ;
   private String[] P09776_A602MaqCod ;
   private java.util.Date[] P09776_A558HisProFec ;
   private int[] P09776_A561HisProLin ;
   private String[] P09777_A396EmprCod ;
   private String[] P09777_A2504HisProCod ;
   private String[] P09777_A135BarColNom ;
   private java.math.BigDecimal[] P09777_A1526HisProMtr ;
   private java.math.BigDecimal[] P09777_A1525HisProKgr ;
   private String[] P09777_A1652BarSerDsc ;
   private String[] P09777_A212BarSer ;
   private String[] P09777_A279CliNom ;
   private int[] P09777_A252CliCod ;
   private boolean[] P09777_n252CliCod ;
   private String[] P09777_A130BarCodPar ;
   private byte[] P09777_A132BarCodReo ;
   private int[] P09777_A129BarCod ;
   private java.util.Date[] P09777_A4441HisProDTF ;
   private boolean[] P09777_n4441HisProDTF ;
   private String[] P09777_A606MaqDsc ;
   private boolean[] P09777_n606MaqDsc ;
   private String[] P09777_A602MaqCod ;
   private java.util.Date[] P09777_A558HisProFec ;
   private int[] P09777_A561HisProLin ;
   private String[] P09778_A396EmprCod ;
   private String[] P09778_A2504HisProCod ;
   private String[] P09778_A135BarColNom ;
   private java.math.BigDecimal[] P09778_A1526HisProMtr ;
   private java.math.BigDecimal[] P09778_A1525HisProKgr ;
   private String[] P09778_A1652BarSerDsc ;
   private String[] P09778_A212BarSer ;
   private String[] P09778_A279CliNom ;
   private int[] P09778_A252CliCod ;
   private boolean[] P09778_n252CliCod ;
   private String[] P09778_A130BarCodPar ;
   private byte[] P09778_A132BarCodReo ;
   private int[] P09778_A129BarCod ;
   private java.util.Date[] P09778_A4441HisProDTF ;
   private boolean[] P09778_n4441HisProDTF ;
   private String[] P09778_A606MaqDsc ;
   private boolean[] P09778_n606MaqDsc ;
   private String[] P09778_A602MaqCod ;
   private java.util.Date[] P09778_A558HisProFec ;
   private int[] P09778_A561HisProLin ;
   private String[] P09779_A396EmprCod ;
   private String[] P09779_A2504HisProCod ;
   private String[] P09779_A135BarColNom ;
   private java.math.BigDecimal[] P09779_A1526HisProMtr ;
   private java.math.BigDecimal[] P09779_A1525HisProKgr ;
   private String[] P09779_A1652BarSerDsc ;
   private String[] P09779_A212BarSer ;
   private String[] P09779_A279CliNom ;
   private int[] P09779_A252CliCod ;
   private boolean[] P09779_n252CliCod ;
   private String[] P09779_A130BarCodPar ;
   private byte[] P09779_A132BarCodReo ;
   private int[] P09779_A129BarCod ;
   private java.util.Date[] P09779_A4441HisProDTF ;
   private boolean[] P09779_n4441HisProDTF ;
   private String[] P09779_A606MaqDsc ;
   private boolean[] P09779_n606MaqDsc ;
   private String[] P09779_A602MaqCod ;
   private java.util.Date[] P09779_A558HisProFec ;
   private int[] P09779_A561HisProLin ;
   private GXSimpleCollection<String> AV40Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV43OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class webverhdrsgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09772( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV61Maqcod1 ,
                                          String AV62Maqcod2 ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[46];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCodPar, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09773( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV61Maqcod1 ,
                                          String AV62Maqcod2 ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[46];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09774( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV61Maqcod1 ,
                                          String AV62Maqcod2 ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[46];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.BarSer, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09775( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV61Maqcod1 ,
                                          String AV62Maqcod2 ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[46];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.BarSerDsc, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09776( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV61Maqcod1 ,
                                          String AV62Maqcod2 ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[46];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.BarColNom, T1.HisProCod, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
         GXv_int10[12] = (byte)(1) ;
         GXv_int10[13] = (byte)(1) ;
         GXv_int10[14] = (byte)(1) ;
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09777( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV61Maqcod1 ,
                                          String AV62Maqcod2 ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[46];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
         GXv_int12[10] = (byte)(1) ;
         GXv_int12[11] = (byte)(1) ;
         GXv_int12[12] = (byte)(1) ;
         GXv_int12[13] = (byte)(1) ;
         GXv_int12[14] = (byte)(1) ;
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HisProCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09778( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV60EmprCod ,
                                          String AV61Maqcod1 ,
                                          String A396EmprCod ,
                                          String AV62Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[46];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
         GXv_int14[14] = (byte)(1) ;
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09779( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV60EmprCod ,
                                          String AV61Maqcod1 ,
                                          String A396EmprCod ,
                                          String AV62Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[46];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
         GXv_int16[14] = (byte)(1) ;
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P09772(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 1 :
                  return conditional_P09773(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 2 :
                  return conditional_P09774(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 3 :
                  return conditional_P09775(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 4 :
                  return conditional_P09776(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 5 :
                  return conditional_P09777(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 6 :
                  return conditional_P09778(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 7 :
                  return conditional_P09779(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09772", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09773", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09774", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09775", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09776", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09777", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09778", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09779", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
      }
   }

}

