package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmprevewwgetfilterdata extends GXProcedure
{
   public tmprevewwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmprevewwgetfilterdata.class ), "" );
   }

   public tmprevewwgetfilterdata( int remoteHandle ,
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
      tmprevewwgetfilterdata.this.aP5 = new String[] {""};
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
      tmprevewwgetfilterdata.this.AV46DDOName = aP0;
      tmprevewwgetfilterdata.this.AV44SearchTxt = aP1;
      tmprevewwgetfilterdata.this.AV45SearchTxtTo = aP2;
      tmprevewwgetfilterdata.this.aP3 = aP3;
      tmprevewwgetfilterdata.this.aP4 = aP4;
      tmprevewwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPMMAQCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPMMAQDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMUSUCRE") == 0 )
      {
         /* Execute user subroutine: 'LOADPMUSUCREOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMPLA") == 0 )
      {
         /* Execute user subroutine: 'LOADPMPLAOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PMTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADPMTXTOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV50OptionsJson = AV49Options.toJSonString(false) ;
      AV53OptionsDescJson = AV52OptionsDesc.toJSonString(false) ;
      AV55OptionIndexesJson = AV54OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV57Session.getValue("TMPreveWWGridState"), "") == 0 )
      {
         AV59GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMPreveWWGridState"), null, null);
      }
      else
      {
         AV59GridState.fromxml(AV57Session.getValue("TMPreveWWGridState"), null, null);
      }
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV60GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV1));
         if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV62FilterFullText = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV10TFPMCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPMCod_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV12TFPMDsc = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV13TFPMDsc_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD") == 0 )
         {
            AV18TFPMMaqCod = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD_SEL") == 0 )
         {
            AV19TFPMMaqCod_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC") == 0 )
         {
            AV20TFPMMaqDsc = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC_SEL") == 0 )
         {
            AV21TFPMMaqDsc_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMEST_SEL") == 0 )
         {
            AV22TFPMEst_SelsJson = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV23TFPMEst_Sels.fromJSonString(AV22TFPMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFCHCRE") == 0 )
         {
            AV14TFPMFchCre = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMINI") == 0 )
         {
            AV26TFPMIni = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMULT") == 0 )
         {
            AV30TFPMUlt = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFIN") == 0 )
         {
            AV28TFPMFin = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE") == 0 )
         {
            AV16TFPMUsuCre = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE_SEL") == 0 )
         {
            AV17TFPMUsuCre_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIAS") == 0 )
         {
            AV34TFPMDias = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFPMDias_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIASPAVISO") == 0 )
         {
            AV63TFPMDiasPaviso = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFPMDiasPaviso_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSO") == 0 )
         {
            AV32TFPMUso = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFPMUso_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSOMTS") == 0 )
         {
            AV42TFPMUsoMts = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPMUsoMts_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMORD") == 0 )
         {
            AV36TFPMOrd = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFPMOrd_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIE") == 0 )
         {
            AV38TFPMTie = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFPMTie_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA") == 0 )
         {
            AV40TFPMPla = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA_SEL") == 0 )
         {
            AV41TFPMPla_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT") == 0 )
         {
            AV24TFPMTxt = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT_SEL") == 0 )
         {
            AV25TFPMTxt_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPMDsc = AV44SearchTxt ;
      AV13TFPMDsc_Sel = "" ;
      AV75Tmprevewwds_1_filterfulltext = AV62FilterFullText ;
      AV76Tmprevewwds_2_tfpmcod = AV10TFPMCod ;
      AV77Tmprevewwds_3_tfpmcod_to = AV11TFPMCod_To ;
      AV78Tmprevewwds_4_tfpmdsc = AV12TFPMDsc ;
      AV79Tmprevewwds_5_tfpmdsc_sel = AV13TFPMDsc_Sel ;
      AV80Tmprevewwds_6_tfpmmaqcod = AV18TFPMMaqCod ;
      AV81Tmprevewwds_7_tfpmmaqcod_sel = AV19TFPMMaqCod_Sel ;
      AV82Tmprevewwds_8_tfpmmaqdsc = AV20TFPMMaqDsc ;
      AV83Tmprevewwds_9_tfpmmaqdsc_sel = AV21TFPMMaqDsc_Sel ;
      AV84Tmprevewwds_10_tfpmest_sels = AV23TFPMEst_Sels ;
      AV85Tmprevewwds_11_tfpmfchcre = AV14TFPMFchCre ;
      AV86Tmprevewwds_12_tfpmini = AV26TFPMIni ;
      AV87Tmprevewwds_13_tfpmult = AV30TFPMUlt ;
      AV88Tmprevewwds_14_tfpmfin = AV28TFPMFin ;
      AV89Tmprevewwds_15_tfpmusucre = AV16TFPMUsuCre ;
      AV90Tmprevewwds_16_tfpmusucre_sel = AV17TFPMUsuCre_Sel ;
      AV91Tmprevewwds_17_tfpmdias = AV34TFPMDias ;
      AV92Tmprevewwds_18_tfpmdias_to = AV35TFPMDias_To ;
      AV93Tmprevewwds_19_tfpmdiaspaviso = AV63TFPMDiasPaviso ;
      AV94Tmprevewwds_20_tfpmdiaspaviso_to = AV64TFPMDiasPaviso_To ;
      AV95Tmprevewwds_21_tfpmuso = AV32TFPMUso ;
      AV96Tmprevewwds_22_tfpmuso_to = AV33TFPMUso_To ;
      AV97Tmprevewwds_23_tfpmusomts = AV42TFPMUsoMts ;
      AV98Tmprevewwds_24_tfpmusomts_to = AV43TFPMUsoMts_To ;
      AV99Tmprevewwds_25_tfpmord = AV36TFPMOrd ;
      AV100Tmprevewwds_26_tfpmord_to = AV37TFPMOrd_To ;
      AV101Tmprevewwds_27_tfpmtie = AV38TFPMTie ;
      AV102Tmprevewwds_28_tfpmtie_to = AV39TFPMTie_To ;
      AV103Tmprevewwds_29_tfpmpla = AV40TFPMPla ;
      AV104Tmprevewwds_30_tfpmpla_sel = AV41TFPMPla_Sel ;
      AV105Tmprevewwds_31_tfpmtxt = AV24TFPMTxt ;
      AV106Tmprevewwds_32_tfpmtxt_sel = AV25TFPMTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV84Tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV76Tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to) ,
                                           AV79Tmprevewwds_5_tfpmdsc_sel ,
                                           AV78Tmprevewwds_4_tfpmdsc ,
                                           AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV80Tmprevewwds_6_tfpmmaqcod ,
                                           AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV82Tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV84Tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV85Tmprevewwds_11_tfpmfchcre ,
                                           AV86Tmprevewwds_12_tfpmini ,
                                           AV87Tmprevewwds_13_tfpmult ,
                                           AV88Tmprevewwds_14_tfpmfin ,
                                           AV90Tmprevewwds_16_tfpmusucre_sel ,
                                           AV89Tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV91Tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV95Tmprevewwds_21_tfpmuso ,
                                           AV96Tmprevewwds_22_tfpmuso_to ,
                                           AV97Tmprevewwds_23_tfpmusomts ,
                                           AV98Tmprevewwds_24_tfpmusomts_to ,
                                           Integer.valueOf(AV99Tmprevewwds_25_tfpmord) ,
                                           Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to) ,
                                           AV101Tmprevewwds_27_tfpmtie ,
                                           AV102Tmprevewwds_28_tfpmtie_to ,
                                           AV104Tmprevewwds_30_tfpmpla_sel ,
                                           AV103Tmprevewwds_29_tfpmpla ,
                                           AV106Tmprevewwds_32_tfpmtxt_sel ,
                                           AV105Tmprevewwds_31_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           AV75Tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV78Tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV80Tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV80Tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV82Tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV82Tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV89Tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV89Tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV103Tmprevewwds_29_tfpmpla = GXutil.padr( GXutil.rtrim( AV103Tmprevewwds_29_tfpmpla), 1, "%") ;
      lV105Tmprevewwds_31_tfpmtxt = GXutil.concat( GXutil.rtrim( AV105Tmprevewwds_31_tfpmtxt), "%", "") ;
      /* Using cursor P08JS2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV76Tmprevewwds_2_tfpmcod), Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to), lV78Tmprevewwds_4_tfpmdsc, AV79Tmprevewwds_5_tfpmdsc_sel, lV80Tmprevewwds_6_tfpmmaqcod, AV81Tmprevewwds_7_tfpmmaqcod_sel, lV82Tmprevewwds_8_tfpmmaqdsc, AV83Tmprevewwds_9_tfpmmaqdsc_sel, AV85Tmprevewwds_11_tfpmfchcre, AV86Tmprevewwds_12_tfpmini, AV87Tmprevewwds_13_tfpmult, AV88Tmprevewwds_14_tfpmfin, lV89Tmprevewwds_15_tfpmusucre, AV90Tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV91Tmprevewwds_17_tfpmdias), Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to), Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to), AV95Tmprevewwds_21_tfpmuso, AV96Tmprevewwds_22_tfpmuso_to, AV97Tmprevewwds_23_tfpmusomts, AV98Tmprevewwds_24_tfpmusomts_to, Integer.valueOf(AV99Tmprevewwds_25_tfpmord), Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to), AV101Tmprevewwds_27_tfpmtie, AV102Tmprevewwds_28_tfpmtie_to, lV103Tmprevewwds_29_tfpmpla, AV104Tmprevewwds_30_tfpmpla_sel, lV105Tmprevewwds_31_tfpmtxt, AV106Tmprevewwds_32_tfpmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8JS2 = false ;
         A396EmprCod = P08JS2_A396EmprCod[0] ;
         A9473PMDsc = P08JS2_A9473PMDsc[0] ;
         n9473PMDsc = P08JS2_n9473PMDsc[0] ;
         A9483PMTxt = P08JS2_A9483PMTxt[0] ;
         n9483PMTxt = P08JS2_n9483PMTxt[0] ;
         A11456PMPla = P08JS2_A11456PMPla[0] ;
         A11455PMTie = P08JS2_A11455PMTie[0] ;
         A9488PMOrd = P08JS2_A9488PMOrd[0] ;
         n9488PMOrd = P08JS2_n9488PMOrd[0] ;
         A13013PMUsoMts = P08JS2_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JS2_n13013PMUsoMts[0] ;
         A11454PMUso = P08JS2_A11454PMUso[0] ;
         n11454PMUso = P08JS2_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JS2_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JS2_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JS2_A9487PMDias[0] ;
         n9487PMDias = P08JS2_n9487PMDias[0] ;
         A9475PMUsuCre = P08JS2_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JS2_n9475PMUsuCre[0] ;
         A9485PMFin = P08JS2_A9485PMFin[0] ;
         n9485PMFin = P08JS2_n9485PMFin[0] ;
         A9486PMUlt = P08JS2_A9486PMUlt[0] ;
         n9486PMUlt = P08JS2_n9486PMUlt[0] ;
         A9484PMIni = P08JS2_A9484PMIni[0] ;
         n9484PMIni = P08JS2_n9484PMIni[0] ;
         A9474PMFchCre = P08JS2_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JS2_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JS2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS2_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = P08JS2_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JS2_n9476PMMaqCod[0] ;
         A9429PMCod = P08JS2_A9429PMCod[0] ;
         A9478PMEst = P08JS2_A9478PMEst[0] ;
         n9478PMEst = P08JS2_n9478PMEst[0] ;
         A9477PMMaqDsc = P08JS2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS2_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV75Tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV56count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08JS2_A9473PMDsc[0], A9473PMDsc) == 0 ) )
            {
               brk8JS2 = false ;
               A396EmprCod = P08JS2_A396EmprCod[0] ;
               A9429PMCod = P08JS2_A9429PMCod[0] ;
               AV56count = (long)(AV56count+1) ;
               brk8JS2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A9473PMDsc)==0) )
            {
               AV48Option = A9473PMDsc ;
               AV49Options.add(AV48Option, 0);
               AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV49Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JS2 )
         {
            brk8JS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPMMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFPMMaqCod = AV44SearchTxt ;
      AV19TFPMMaqCod_Sel = "" ;
      AV75Tmprevewwds_1_filterfulltext = AV62FilterFullText ;
      AV76Tmprevewwds_2_tfpmcod = AV10TFPMCod ;
      AV77Tmprevewwds_3_tfpmcod_to = AV11TFPMCod_To ;
      AV78Tmprevewwds_4_tfpmdsc = AV12TFPMDsc ;
      AV79Tmprevewwds_5_tfpmdsc_sel = AV13TFPMDsc_Sel ;
      AV80Tmprevewwds_6_tfpmmaqcod = AV18TFPMMaqCod ;
      AV81Tmprevewwds_7_tfpmmaqcod_sel = AV19TFPMMaqCod_Sel ;
      AV82Tmprevewwds_8_tfpmmaqdsc = AV20TFPMMaqDsc ;
      AV83Tmprevewwds_9_tfpmmaqdsc_sel = AV21TFPMMaqDsc_Sel ;
      AV84Tmprevewwds_10_tfpmest_sels = AV23TFPMEst_Sels ;
      AV85Tmprevewwds_11_tfpmfchcre = AV14TFPMFchCre ;
      AV86Tmprevewwds_12_tfpmini = AV26TFPMIni ;
      AV87Tmprevewwds_13_tfpmult = AV30TFPMUlt ;
      AV88Tmprevewwds_14_tfpmfin = AV28TFPMFin ;
      AV89Tmprevewwds_15_tfpmusucre = AV16TFPMUsuCre ;
      AV90Tmprevewwds_16_tfpmusucre_sel = AV17TFPMUsuCre_Sel ;
      AV91Tmprevewwds_17_tfpmdias = AV34TFPMDias ;
      AV92Tmprevewwds_18_tfpmdias_to = AV35TFPMDias_To ;
      AV93Tmprevewwds_19_tfpmdiaspaviso = AV63TFPMDiasPaviso ;
      AV94Tmprevewwds_20_tfpmdiaspaviso_to = AV64TFPMDiasPaviso_To ;
      AV95Tmprevewwds_21_tfpmuso = AV32TFPMUso ;
      AV96Tmprevewwds_22_tfpmuso_to = AV33TFPMUso_To ;
      AV97Tmprevewwds_23_tfpmusomts = AV42TFPMUsoMts ;
      AV98Tmprevewwds_24_tfpmusomts_to = AV43TFPMUsoMts_To ;
      AV99Tmprevewwds_25_tfpmord = AV36TFPMOrd ;
      AV100Tmprevewwds_26_tfpmord_to = AV37TFPMOrd_To ;
      AV101Tmprevewwds_27_tfpmtie = AV38TFPMTie ;
      AV102Tmprevewwds_28_tfpmtie_to = AV39TFPMTie_To ;
      AV103Tmprevewwds_29_tfpmpla = AV40TFPMPla ;
      AV104Tmprevewwds_30_tfpmpla_sel = AV41TFPMPla_Sel ;
      AV105Tmprevewwds_31_tfpmtxt = AV24TFPMTxt ;
      AV106Tmprevewwds_32_tfpmtxt_sel = AV25TFPMTxt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV84Tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV76Tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to) ,
                                           AV79Tmprevewwds_5_tfpmdsc_sel ,
                                           AV78Tmprevewwds_4_tfpmdsc ,
                                           AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV80Tmprevewwds_6_tfpmmaqcod ,
                                           AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV82Tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV84Tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV85Tmprevewwds_11_tfpmfchcre ,
                                           AV86Tmprevewwds_12_tfpmini ,
                                           AV87Tmprevewwds_13_tfpmult ,
                                           AV88Tmprevewwds_14_tfpmfin ,
                                           AV90Tmprevewwds_16_tfpmusucre_sel ,
                                           AV89Tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV91Tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV95Tmprevewwds_21_tfpmuso ,
                                           AV96Tmprevewwds_22_tfpmuso_to ,
                                           AV97Tmprevewwds_23_tfpmusomts ,
                                           AV98Tmprevewwds_24_tfpmusomts_to ,
                                           Integer.valueOf(AV99Tmprevewwds_25_tfpmord) ,
                                           Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to) ,
                                           AV101Tmprevewwds_27_tfpmtie ,
                                           AV102Tmprevewwds_28_tfpmtie_to ,
                                           AV104Tmprevewwds_30_tfpmpla_sel ,
                                           AV103Tmprevewwds_29_tfpmpla ,
                                           AV106Tmprevewwds_32_tfpmtxt_sel ,
                                           AV105Tmprevewwds_31_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           AV75Tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV78Tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV80Tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV80Tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV82Tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV82Tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV89Tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV89Tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV103Tmprevewwds_29_tfpmpla = GXutil.padr( GXutil.rtrim( AV103Tmprevewwds_29_tfpmpla), 1, "%") ;
      lV105Tmprevewwds_31_tfpmtxt = GXutil.concat( GXutil.rtrim( AV105Tmprevewwds_31_tfpmtxt), "%", "") ;
      /* Using cursor P08JS3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV76Tmprevewwds_2_tfpmcod), Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to), lV78Tmprevewwds_4_tfpmdsc, AV79Tmprevewwds_5_tfpmdsc_sel, lV80Tmprevewwds_6_tfpmmaqcod, AV81Tmprevewwds_7_tfpmmaqcod_sel, lV82Tmprevewwds_8_tfpmmaqdsc, AV83Tmprevewwds_9_tfpmmaqdsc_sel, AV85Tmprevewwds_11_tfpmfchcre, AV86Tmprevewwds_12_tfpmini, AV87Tmprevewwds_13_tfpmult, AV88Tmprevewwds_14_tfpmfin, lV89Tmprevewwds_15_tfpmusucre, AV90Tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV91Tmprevewwds_17_tfpmdias), Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to), Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to), AV95Tmprevewwds_21_tfpmuso, AV96Tmprevewwds_22_tfpmuso_to, AV97Tmprevewwds_23_tfpmusomts, AV98Tmprevewwds_24_tfpmusomts_to, Integer.valueOf(AV99Tmprevewwds_25_tfpmord), Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to), AV101Tmprevewwds_27_tfpmtie, AV102Tmprevewwds_28_tfpmtie_to, lV103Tmprevewwds_29_tfpmpla, AV104Tmprevewwds_30_tfpmpla_sel, lV105Tmprevewwds_31_tfpmtxt, AV106Tmprevewwds_32_tfpmtxt_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8JS4 = false ;
         A396EmprCod = P08JS3_A396EmprCod[0] ;
         A9476PMMaqCod = P08JS3_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JS3_n9476PMMaqCod[0] ;
         A9483PMTxt = P08JS3_A9483PMTxt[0] ;
         n9483PMTxt = P08JS3_n9483PMTxt[0] ;
         A11456PMPla = P08JS3_A11456PMPla[0] ;
         A11455PMTie = P08JS3_A11455PMTie[0] ;
         A9488PMOrd = P08JS3_A9488PMOrd[0] ;
         n9488PMOrd = P08JS3_n9488PMOrd[0] ;
         A13013PMUsoMts = P08JS3_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JS3_n13013PMUsoMts[0] ;
         A11454PMUso = P08JS3_A11454PMUso[0] ;
         n11454PMUso = P08JS3_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JS3_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JS3_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JS3_A9487PMDias[0] ;
         n9487PMDias = P08JS3_n9487PMDias[0] ;
         A9475PMUsuCre = P08JS3_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JS3_n9475PMUsuCre[0] ;
         A9485PMFin = P08JS3_A9485PMFin[0] ;
         n9485PMFin = P08JS3_n9485PMFin[0] ;
         A9486PMUlt = P08JS3_A9486PMUlt[0] ;
         n9486PMUlt = P08JS3_n9486PMUlt[0] ;
         A9484PMIni = P08JS3_A9484PMIni[0] ;
         n9484PMIni = P08JS3_n9484PMIni[0] ;
         A9474PMFchCre = P08JS3_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JS3_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JS3_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS3_n9477PMMaqDsc[0] ;
         A9473PMDsc = P08JS3_A9473PMDsc[0] ;
         n9473PMDsc = P08JS3_n9473PMDsc[0] ;
         A9429PMCod = P08JS3_A9429PMCod[0] ;
         A9478PMEst = P08JS3_A9478PMEst[0] ;
         n9478PMEst = P08JS3_n9478PMEst[0] ;
         A9477PMMaqDsc = P08JS3_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS3_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV75Tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV56count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08JS3_A9476PMMaqCod[0], A9476PMMaqCod) == 0 ) )
            {
               brk8JS4 = false ;
               A396EmprCod = P08JS3_A396EmprCod[0] ;
               A9429PMCod = P08JS3_A9429PMCod[0] ;
               AV56count = (long)(AV56count+1) ;
               brk8JS4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A9476PMMaqCod)==0) )
            {
               AV48Option = A9476PMMaqCod ;
               AV49Options.add(AV48Option, 0);
               AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV49Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JS4 )
         {
            brk8JS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPMMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPMMaqDsc = AV44SearchTxt ;
      AV21TFPMMaqDsc_Sel = "" ;
      AV75Tmprevewwds_1_filterfulltext = AV62FilterFullText ;
      AV76Tmprevewwds_2_tfpmcod = AV10TFPMCod ;
      AV77Tmprevewwds_3_tfpmcod_to = AV11TFPMCod_To ;
      AV78Tmprevewwds_4_tfpmdsc = AV12TFPMDsc ;
      AV79Tmprevewwds_5_tfpmdsc_sel = AV13TFPMDsc_Sel ;
      AV80Tmprevewwds_6_tfpmmaqcod = AV18TFPMMaqCod ;
      AV81Tmprevewwds_7_tfpmmaqcod_sel = AV19TFPMMaqCod_Sel ;
      AV82Tmprevewwds_8_tfpmmaqdsc = AV20TFPMMaqDsc ;
      AV83Tmprevewwds_9_tfpmmaqdsc_sel = AV21TFPMMaqDsc_Sel ;
      AV84Tmprevewwds_10_tfpmest_sels = AV23TFPMEst_Sels ;
      AV85Tmprevewwds_11_tfpmfchcre = AV14TFPMFchCre ;
      AV86Tmprevewwds_12_tfpmini = AV26TFPMIni ;
      AV87Tmprevewwds_13_tfpmult = AV30TFPMUlt ;
      AV88Tmprevewwds_14_tfpmfin = AV28TFPMFin ;
      AV89Tmprevewwds_15_tfpmusucre = AV16TFPMUsuCre ;
      AV90Tmprevewwds_16_tfpmusucre_sel = AV17TFPMUsuCre_Sel ;
      AV91Tmprevewwds_17_tfpmdias = AV34TFPMDias ;
      AV92Tmprevewwds_18_tfpmdias_to = AV35TFPMDias_To ;
      AV93Tmprevewwds_19_tfpmdiaspaviso = AV63TFPMDiasPaviso ;
      AV94Tmprevewwds_20_tfpmdiaspaviso_to = AV64TFPMDiasPaviso_To ;
      AV95Tmprevewwds_21_tfpmuso = AV32TFPMUso ;
      AV96Tmprevewwds_22_tfpmuso_to = AV33TFPMUso_To ;
      AV97Tmprevewwds_23_tfpmusomts = AV42TFPMUsoMts ;
      AV98Tmprevewwds_24_tfpmusomts_to = AV43TFPMUsoMts_To ;
      AV99Tmprevewwds_25_tfpmord = AV36TFPMOrd ;
      AV100Tmprevewwds_26_tfpmord_to = AV37TFPMOrd_To ;
      AV101Tmprevewwds_27_tfpmtie = AV38TFPMTie ;
      AV102Tmprevewwds_28_tfpmtie_to = AV39TFPMTie_To ;
      AV103Tmprevewwds_29_tfpmpla = AV40TFPMPla ;
      AV104Tmprevewwds_30_tfpmpla_sel = AV41TFPMPla_Sel ;
      AV105Tmprevewwds_31_tfpmtxt = AV24TFPMTxt ;
      AV106Tmprevewwds_32_tfpmtxt_sel = AV25TFPMTxt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV84Tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV76Tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to) ,
                                           AV79Tmprevewwds_5_tfpmdsc_sel ,
                                           AV78Tmprevewwds_4_tfpmdsc ,
                                           AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV80Tmprevewwds_6_tfpmmaqcod ,
                                           AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV82Tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV84Tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV85Tmprevewwds_11_tfpmfchcre ,
                                           AV86Tmprevewwds_12_tfpmini ,
                                           AV87Tmprevewwds_13_tfpmult ,
                                           AV88Tmprevewwds_14_tfpmfin ,
                                           AV90Tmprevewwds_16_tfpmusucre_sel ,
                                           AV89Tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV91Tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV95Tmprevewwds_21_tfpmuso ,
                                           AV96Tmprevewwds_22_tfpmuso_to ,
                                           AV97Tmprevewwds_23_tfpmusomts ,
                                           AV98Tmprevewwds_24_tfpmusomts_to ,
                                           Integer.valueOf(AV99Tmprevewwds_25_tfpmord) ,
                                           Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to) ,
                                           AV101Tmprevewwds_27_tfpmtie ,
                                           AV102Tmprevewwds_28_tfpmtie_to ,
                                           AV104Tmprevewwds_30_tfpmpla_sel ,
                                           AV103Tmprevewwds_29_tfpmpla ,
                                           AV106Tmprevewwds_32_tfpmtxt_sel ,
                                           AV105Tmprevewwds_31_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           AV75Tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV78Tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV80Tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV80Tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV82Tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV82Tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV89Tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV89Tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV103Tmprevewwds_29_tfpmpla = GXutil.padr( GXutil.rtrim( AV103Tmprevewwds_29_tfpmpla), 1, "%") ;
      lV105Tmprevewwds_31_tfpmtxt = GXutil.concat( GXutil.rtrim( AV105Tmprevewwds_31_tfpmtxt), "%", "") ;
      /* Using cursor P08JS4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV76Tmprevewwds_2_tfpmcod), Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to), lV78Tmprevewwds_4_tfpmdsc, AV79Tmprevewwds_5_tfpmdsc_sel, lV80Tmprevewwds_6_tfpmmaqcod, AV81Tmprevewwds_7_tfpmmaqcod_sel, lV82Tmprevewwds_8_tfpmmaqdsc, AV83Tmprevewwds_9_tfpmmaqdsc_sel, AV85Tmprevewwds_11_tfpmfchcre, AV86Tmprevewwds_12_tfpmini, AV87Tmprevewwds_13_tfpmult, AV88Tmprevewwds_14_tfpmfin, lV89Tmprevewwds_15_tfpmusucre, AV90Tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV91Tmprevewwds_17_tfpmdias), Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to), Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to), AV95Tmprevewwds_21_tfpmuso, AV96Tmprevewwds_22_tfpmuso_to, AV97Tmprevewwds_23_tfpmusomts, AV98Tmprevewwds_24_tfpmusomts_to, Integer.valueOf(AV99Tmprevewwds_25_tfpmord), Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to), AV101Tmprevewwds_27_tfpmtie, AV102Tmprevewwds_28_tfpmtie_to, lV103Tmprevewwds_29_tfpmpla, AV104Tmprevewwds_30_tfpmpla_sel, lV105Tmprevewwds_31_tfpmtxt, AV106Tmprevewwds_32_tfpmtxt_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8JS6 = false ;
         A9476PMMaqCod = P08JS4_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JS4_n9476PMMaqCod[0] ;
         A396EmprCod = P08JS4_A396EmprCod[0] ;
         A9483PMTxt = P08JS4_A9483PMTxt[0] ;
         n9483PMTxt = P08JS4_n9483PMTxt[0] ;
         A11456PMPla = P08JS4_A11456PMPla[0] ;
         A11455PMTie = P08JS4_A11455PMTie[0] ;
         A9488PMOrd = P08JS4_A9488PMOrd[0] ;
         n9488PMOrd = P08JS4_n9488PMOrd[0] ;
         A13013PMUsoMts = P08JS4_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JS4_n13013PMUsoMts[0] ;
         A11454PMUso = P08JS4_A11454PMUso[0] ;
         n11454PMUso = P08JS4_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JS4_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JS4_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JS4_A9487PMDias[0] ;
         n9487PMDias = P08JS4_n9487PMDias[0] ;
         A9475PMUsuCre = P08JS4_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JS4_n9475PMUsuCre[0] ;
         A9485PMFin = P08JS4_A9485PMFin[0] ;
         n9485PMFin = P08JS4_n9485PMFin[0] ;
         A9486PMUlt = P08JS4_A9486PMUlt[0] ;
         n9486PMUlt = P08JS4_n9486PMUlt[0] ;
         A9484PMIni = P08JS4_A9484PMIni[0] ;
         n9484PMIni = P08JS4_n9484PMIni[0] ;
         A9474PMFchCre = P08JS4_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JS4_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JS4_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS4_n9477PMMaqDsc[0] ;
         A9473PMDsc = P08JS4_A9473PMDsc[0] ;
         n9473PMDsc = P08JS4_n9473PMDsc[0] ;
         A9429PMCod = P08JS4_A9429PMCod[0] ;
         A9478PMEst = P08JS4_A9478PMEst[0] ;
         n9478PMEst = P08JS4_n9478PMEst[0] ;
         A9477PMMaqDsc = P08JS4_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS4_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV75Tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV56count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08JS4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08JS4_A9476PMMaqCod[0], A9476PMMaqCod) == 0 ) )
            {
               brk8JS6 = false ;
               A9429PMCod = P08JS4_A9429PMCod[0] ;
               AV56count = (long)(AV56count+1) ;
               brk8JS6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A9477PMMaqDsc)==0) )
            {
               AV48Option = A9477PMMaqDsc ;
               AV47InsertIndex = 1 ;
               while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) < 0 ) )
               {
                  AV47InsertIndex = (int)(AV47InsertIndex+1) ;
               }
               AV49Options.add(AV48Option, AV47InsertIndex);
               AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
            }
            if ( AV49Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JS6 )
         {
            brk8JS6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPMUSUCREOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPMUsuCre = AV44SearchTxt ;
      AV17TFPMUsuCre_Sel = "" ;
      AV75Tmprevewwds_1_filterfulltext = AV62FilterFullText ;
      AV76Tmprevewwds_2_tfpmcod = AV10TFPMCod ;
      AV77Tmprevewwds_3_tfpmcod_to = AV11TFPMCod_To ;
      AV78Tmprevewwds_4_tfpmdsc = AV12TFPMDsc ;
      AV79Tmprevewwds_5_tfpmdsc_sel = AV13TFPMDsc_Sel ;
      AV80Tmprevewwds_6_tfpmmaqcod = AV18TFPMMaqCod ;
      AV81Tmprevewwds_7_tfpmmaqcod_sel = AV19TFPMMaqCod_Sel ;
      AV82Tmprevewwds_8_tfpmmaqdsc = AV20TFPMMaqDsc ;
      AV83Tmprevewwds_9_tfpmmaqdsc_sel = AV21TFPMMaqDsc_Sel ;
      AV84Tmprevewwds_10_tfpmest_sels = AV23TFPMEst_Sels ;
      AV85Tmprevewwds_11_tfpmfchcre = AV14TFPMFchCre ;
      AV86Tmprevewwds_12_tfpmini = AV26TFPMIni ;
      AV87Tmprevewwds_13_tfpmult = AV30TFPMUlt ;
      AV88Tmprevewwds_14_tfpmfin = AV28TFPMFin ;
      AV89Tmprevewwds_15_tfpmusucre = AV16TFPMUsuCre ;
      AV90Tmprevewwds_16_tfpmusucre_sel = AV17TFPMUsuCre_Sel ;
      AV91Tmprevewwds_17_tfpmdias = AV34TFPMDias ;
      AV92Tmprevewwds_18_tfpmdias_to = AV35TFPMDias_To ;
      AV93Tmprevewwds_19_tfpmdiaspaviso = AV63TFPMDiasPaviso ;
      AV94Tmprevewwds_20_tfpmdiaspaviso_to = AV64TFPMDiasPaviso_To ;
      AV95Tmprevewwds_21_tfpmuso = AV32TFPMUso ;
      AV96Tmprevewwds_22_tfpmuso_to = AV33TFPMUso_To ;
      AV97Tmprevewwds_23_tfpmusomts = AV42TFPMUsoMts ;
      AV98Tmprevewwds_24_tfpmusomts_to = AV43TFPMUsoMts_To ;
      AV99Tmprevewwds_25_tfpmord = AV36TFPMOrd ;
      AV100Tmprevewwds_26_tfpmord_to = AV37TFPMOrd_To ;
      AV101Tmprevewwds_27_tfpmtie = AV38TFPMTie ;
      AV102Tmprevewwds_28_tfpmtie_to = AV39TFPMTie_To ;
      AV103Tmprevewwds_29_tfpmpla = AV40TFPMPla ;
      AV104Tmprevewwds_30_tfpmpla_sel = AV41TFPMPla_Sel ;
      AV105Tmprevewwds_31_tfpmtxt = AV24TFPMTxt ;
      AV106Tmprevewwds_32_tfpmtxt_sel = AV25TFPMTxt_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV84Tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV76Tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to) ,
                                           AV79Tmprevewwds_5_tfpmdsc_sel ,
                                           AV78Tmprevewwds_4_tfpmdsc ,
                                           AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV80Tmprevewwds_6_tfpmmaqcod ,
                                           AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV82Tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV84Tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV85Tmprevewwds_11_tfpmfchcre ,
                                           AV86Tmprevewwds_12_tfpmini ,
                                           AV87Tmprevewwds_13_tfpmult ,
                                           AV88Tmprevewwds_14_tfpmfin ,
                                           AV90Tmprevewwds_16_tfpmusucre_sel ,
                                           AV89Tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV91Tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV95Tmprevewwds_21_tfpmuso ,
                                           AV96Tmprevewwds_22_tfpmuso_to ,
                                           AV97Tmprevewwds_23_tfpmusomts ,
                                           AV98Tmprevewwds_24_tfpmusomts_to ,
                                           Integer.valueOf(AV99Tmprevewwds_25_tfpmord) ,
                                           Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to) ,
                                           AV101Tmprevewwds_27_tfpmtie ,
                                           AV102Tmprevewwds_28_tfpmtie_to ,
                                           AV104Tmprevewwds_30_tfpmpla_sel ,
                                           AV103Tmprevewwds_29_tfpmpla ,
                                           AV106Tmprevewwds_32_tfpmtxt_sel ,
                                           AV105Tmprevewwds_31_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           AV75Tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV78Tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV80Tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV80Tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV82Tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV82Tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV89Tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV89Tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV103Tmprevewwds_29_tfpmpla = GXutil.padr( GXutil.rtrim( AV103Tmprevewwds_29_tfpmpla), 1, "%") ;
      lV105Tmprevewwds_31_tfpmtxt = GXutil.concat( GXutil.rtrim( AV105Tmprevewwds_31_tfpmtxt), "%", "") ;
      /* Using cursor P08JS5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV76Tmprevewwds_2_tfpmcod), Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to), lV78Tmprevewwds_4_tfpmdsc, AV79Tmprevewwds_5_tfpmdsc_sel, lV80Tmprevewwds_6_tfpmmaqcod, AV81Tmprevewwds_7_tfpmmaqcod_sel, lV82Tmprevewwds_8_tfpmmaqdsc, AV83Tmprevewwds_9_tfpmmaqdsc_sel, AV85Tmprevewwds_11_tfpmfchcre, AV86Tmprevewwds_12_tfpmini, AV87Tmprevewwds_13_tfpmult, AV88Tmprevewwds_14_tfpmfin, lV89Tmprevewwds_15_tfpmusucre, AV90Tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV91Tmprevewwds_17_tfpmdias), Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to), Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to), AV95Tmprevewwds_21_tfpmuso, AV96Tmprevewwds_22_tfpmuso_to, AV97Tmprevewwds_23_tfpmusomts, AV98Tmprevewwds_24_tfpmusomts_to, Integer.valueOf(AV99Tmprevewwds_25_tfpmord), Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to), AV101Tmprevewwds_27_tfpmtie, AV102Tmprevewwds_28_tfpmtie_to, lV103Tmprevewwds_29_tfpmpla, AV104Tmprevewwds_30_tfpmpla_sel, lV105Tmprevewwds_31_tfpmtxt, AV106Tmprevewwds_32_tfpmtxt_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8JS8 = false ;
         A396EmprCod = P08JS5_A396EmprCod[0] ;
         A9475PMUsuCre = P08JS5_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JS5_n9475PMUsuCre[0] ;
         A9483PMTxt = P08JS5_A9483PMTxt[0] ;
         n9483PMTxt = P08JS5_n9483PMTxt[0] ;
         A11456PMPla = P08JS5_A11456PMPla[0] ;
         A11455PMTie = P08JS5_A11455PMTie[0] ;
         A9488PMOrd = P08JS5_A9488PMOrd[0] ;
         n9488PMOrd = P08JS5_n9488PMOrd[0] ;
         A13013PMUsoMts = P08JS5_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JS5_n13013PMUsoMts[0] ;
         A11454PMUso = P08JS5_A11454PMUso[0] ;
         n11454PMUso = P08JS5_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JS5_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JS5_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JS5_A9487PMDias[0] ;
         n9487PMDias = P08JS5_n9487PMDias[0] ;
         A9485PMFin = P08JS5_A9485PMFin[0] ;
         n9485PMFin = P08JS5_n9485PMFin[0] ;
         A9486PMUlt = P08JS5_A9486PMUlt[0] ;
         n9486PMUlt = P08JS5_n9486PMUlt[0] ;
         A9484PMIni = P08JS5_A9484PMIni[0] ;
         n9484PMIni = P08JS5_n9484PMIni[0] ;
         A9474PMFchCre = P08JS5_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JS5_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JS5_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS5_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = P08JS5_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JS5_n9476PMMaqCod[0] ;
         A9473PMDsc = P08JS5_A9473PMDsc[0] ;
         n9473PMDsc = P08JS5_n9473PMDsc[0] ;
         A9429PMCod = P08JS5_A9429PMCod[0] ;
         A9478PMEst = P08JS5_A9478PMEst[0] ;
         n9478PMEst = P08JS5_n9478PMEst[0] ;
         A9477PMMaqDsc = P08JS5_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS5_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV75Tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV56count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08JS5_A9475PMUsuCre[0], A9475PMUsuCre) == 0 ) )
            {
               brk8JS8 = false ;
               A396EmprCod = P08JS5_A396EmprCod[0] ;
               A9429PMCod = P08JS5_A9429PMCod[0] ;
               AV56count = (long)(AV56count+1) ;
               brk8JS8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A9475PMUsuCre)==0) )
            {
               AV48Option = A9475PMUsuCre ;
               AV51OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A9475PMUsuCre, "@!"))) ;
               AV49Options.add(AV48Option, 0);
               AV52OptionsDesc.add(AV51OptionDesc, 0);
               AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV49Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JS8 )
         {
            brk8JS8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPMPLAOPTIONS' Routine */
      returnInSub = false ;
      AV40TFPMPla = AV44SearchTxt ;
      AV41TFPMPla_Sel = "" ;
      AV75Tmprevewwds_1_filterfulltext = AV62FilterFullText ;
      AV76Tmprevewwds_2_tfpmcod = AV10TFPMCod ;
      AV77Tmprevewwds_3_tfpmcod_to = AV11TFPMCod_To ;
      AV78Tmprevewwds_4_tfpmdsc = AV12TFPMDsc ;
      AV79Tmprevewwds_5_tfpmdsc_sel = AV13TFPMDsc_Sel ;
      AV80Tmprevewwds_6_tfpmmaqcod = AV18TFPMMaqCod ;
      AV81Tmprevewwds_7_tfpmmaqcod_sel = AV19TFPMMaqCod_Sel ;
      AV82Tmprevewwds_8_tfpmmaqdsc = AV20TFPMMaqDsc ;
      AV83Tmprevewwds_9_tfpmmaqdsc_sel = AV21TFPMMaqDsc_Sel ;
      AV84Tmprevewwds_10_tfpmest_sels = AV23TFPMEst_Sels ;
      AV85Tmprevewwds_11_tfpmfchcre = AV14TFPMFchCre ;
      AV86Tmprevewwds_12_tfpmini = AV26TFPMIni ;
      AV87Tmprevewwds_13_tfpmult = AV30TFPMUlt ;
      AV88Tmprevewwds_14_tfpmfin = AV28TFPMFin ;
      AV89Tmprevewwds_15_tfpmusucre = AV16TFPMUsuCre ;
      AV90Tmprevewwds_16_tfpmusucre_sel = AV17TFPMUsuCre_Sel ;
      AV91Tmprevewwds_17_tfpmdias = AV34TFPMDias ;
      AV92Tmprevewwds_18_tfpmdias_to = AV35TFPMDias_To ;
      AV93Tmprevewwds_19_tfpmdiaspaviso = AV63TFPMDiasPaviso ;
      AV94Tmprevewwds_20_tfpmdiaspaviso_to = AV64TFPMDiasPaviso_To ;
      AV95Tmprevewwds_21_tfpmuso = AV32TFPMUso ;
      AV96Tmprevewwds_22_tfpmuso_to = AV33TFPMUso_To ;
      AV97Tmprevewwds_23_tfpmusomts = AV42TFPMUsoMts ;
      AV98Tmprevewwds_24_tfpmusomts_to = AV43TFPMUsoMts_To ;
      AV99Tmprevewwds_25_tfpmord = AV36TFPMOrd ;
      AV100Tmprevewwds_26_tfpmord_to = AV37TFPMOrd_To ;
      AV101Tmprevewwds_27_tfpmtie = AV38TFPMTie ;
      AV102Tmprevewwds_28_tfpmtie_to = AV39TFPMTie_To ;
      AV103Tmprevewwds_29_tfpmpla = AV40TFPMPla ;
      AV104Tmprevewwds_30_tfpmpla_sel = AV41TFPMPla_Sel ;
      AV105Tmprevewwds_31_tfpmtxt = AV24TFPMTxt ;
      AV106Tmprevewwds_32_tfpmtxt_sel = AV25TFPMTxt_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV84Tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV76Tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to) ,
                                           AV79Tmprevewwds_5_tfpmdsc_sel ,
                                           AV78Tmprevewwds_4_tfpmdsc ,
                                           AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV80Tmprevewwds_6_tfpmmaqcod ,
                                           AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV82Tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV84Tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV85Tmprevewwds_11_tfpmfchcre ,
                                           AV86Tmprevewwds_12_tfpmini ,
                                           AV87Tmprevewwds_13_tfpmult ,
                                           AV88Tmprevewwds_14_tfpmfin ,
                                           AV90Tmprevewwds_16_tfpmusucre_sel ,
                                           AV89Tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV91Tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV95Tmprevewwds_21_tfpmuso ,
                                           AV96Tmprevewwds_22_tfpmuso_to ,
                                           AV97Tmprevewwds_23_tfpmusomts ,
                                           AV98Tmprevewwds_24_tfpmusomts_to ,
                                           Integer.valueOf(AV99Tmprevewwds_25_tfpmord) ,
                                           Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to) ,
                                           AV101Tmprevewwds_27_tfpmtie ,
                                           AV102Tmprevewwds_28_tfpmtie_to ,
                                           AV104Tmprevewwds_30_tfpmpla_sel ,
                                           AV103Tmprevewwds_29_tfpmpla ,
                                           AV106Tmprevewwds_32_tfpmtxt_sel ,
                                           AV105Tmprevewwds_31_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           AV75Tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV78Tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV80Tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV80Tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV82Tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV82Tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV89Tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV89Tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV103Tmprevewwds_29_tfpmpla = GXutil.padr( GXutil.rtrim( AV103Tmprevewwds_29_tfpmpla), 1, "%") ;
      lV105Tmprevewwds_31_tfpmtxt = GXutil.concat( GXutil.rtrim( AV105Tmprevewwds_31_tfpmtxt), "%", "") ;
      /* Using cursor P08JS6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV76Tmprevewwds_2_tfpmcod), Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to), lV78Tmprevewwds_4_tfpmdsc, AV79Tmprevewwds_5_tfpmdsc_sel, lV80Tmprevewwds_6_tfpmmaqcod, AV81Tmprevewwds_7_tfpmmaqcod_sel, lV82Tmprevewwds_8_tfpmmaqdsc, AV83Tmprevewwds_9_tfpmmaqdsc_sel, AV85Tmprevewwds_11_tfpmfchcre, AV86Tmprevewwds_12_tfpmini, AV87Tmprevewwds_13_tfpmult, AV88Tmprevewwds_14_tfpmfin, lV89Tmprevewwds_15_tfpmusucre, AV90Tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV91Tmprevewwds_17_tfpmdias), Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to), Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to), AV95Tmprevewwds_21_tfpmuso, AV96Tmprevewwds_22_tfpmuso_to, AV97Tmprevewwds_23_tfpmusomts, AV98Tmprevewwds_24_tfpmusomts_to, Integer.valueOf(AV99Tmprevewwds_25_tfpmord), Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to), AV101Tmprevewwds_27_tfpmtie, AV102Tmprevewwds_28_tfpmtie_to, lV103Tmprevewwds_29_tfpmpla, AV104Tmprevewwds_30_tfpmpla_sel, lV105Tmprevewwds_31_tfpmtxt, AV106Tmprevewwds_32_tfpmtxt_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8JS10 = false ;
         A396EmprCod = P08JS6_A396EmprCod[0] ;
         A11456PMPla = P08JS6_A11456PMPla[0] ;
         A9483PMTxt = P08JS6_A9483PMTxt[0] ;
         n9483PMTxt = P08JS6_n9483PMTxt[0] ;
         A11455PMTie = P08JS6_A11455PMTie[0] ;
         A9488PMOrd = P08JS6_A9488PMOrd[0] ;
         n9488PMOrd = P08JS6_n9488PMOrd[0] ;
         A13013PMUsoMts = P08JS6_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JS6_n13013PMUsoMts[0] ;
         A11454PMUso = P08JS6_A11454PMUso[0] ;
         n11454PMUso = P08JS6_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JS6_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JS6_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JS6_A9487PMDias[0] ;
         n9487PMDias = P08JS6_n9487PMDias[0] ;
         A9475PMUsuCre = P08JS6_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JS6_n9475PMUsuCre[0] ;
         A9485PMFin = P08JS6_A9485PMFin[0] ;
         n9485PMFin = P08JS6_n9485PMFin[0] ;
         A9486PMUlt = P08JS6_A9486PMUlt[0] ;
         n9486PMUlt = P08JS6_n9486PMUlt[0] ;
         A9484PMIni = P08JS6_A9484PMIni[0] ;
         n9484PMIni = P08JS6_n9484PMIni[0] ;
         A9474PMFchCre = P08JS6_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JS6_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JS6_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS6_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = P08JS6_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JS6_n9476PMMaqCod[0] ;
         A9473PMDsc = P08JS6_A9473PMDsc[0] ;
         n9473PMDsc = P08JS6_n9473PMDsc[0] ;
         A9429PMCod = P08JS6_A9429PMCod[0] ;
         A9478PMEst = P08JS6_A9478PMEst[0] ;
         n9478PMEst = P08JS6_n9478PMEst[0] ;
         A9477PMMaqDsc = P08JS6_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS6_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV75Tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV56count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08JS6_A11456PMPla[0], A11456PMPla) == 0 ) )
            {
               brk8JS10 = false ;
               A396EmprCod = P08JS6_A396EmprCod[0] ;
               A9429PMCod = P08JS6_A9429PMCod[0] ;
               AV56count = (long)(AV56count+1) ;
               brk8JS10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A11456PMPla)==0) )
            {
               AV48Option = A11456PMPla ;
               AV49Options.add(AV48Option, 0);
               AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV49Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JS10 )
         {
            brk8JS10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPMTXTOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPMTxt = AV44SearchTxt ;
      AV25TFPMTxt_Sel = "" ;
      AV75Tmprevewwds_1_filterfulltext = AV62FilterFullText ;
      AV76Tmprevewwds_2_tfpmcod = AV10TFPMCod ;
      AV77Tmprevewwds_3_tfpmcod_to = AV11TFPMCod_To ;
      AV78Tmprevewwds_4_tfpmdsc = AV12TFPMDsc ;
      AV79Tmprevewwds_5_tfpmdsc_sel = AV13TFPMDsc_Sel ;
      AV80Tmprevewwds_6_tfpmmaqcod = AV18TFPMMaqCod ;
      AV81Tmprevewwds_7_tfpmmaqcod_sel = AV19TFPMMaqCod_Sel ;
      AV82Tmprevewwds_8_tfpmmaqdsc = AV20TFPMMaqDsc ;
      AV83Tmprevewwds_9_tfpmmaqdsc_sel = AV21TFPMMaqDsc_Sel ;
      AV84Tmprevewwds_10_tfpmest_sels = AV23TFPMEst_Sels ;
      AV85Tmprevewwds_11_tfpmfchcre = AV14TFPMFchCre ;
      AV86Tmprevewwds_12_tfpmini = AV26TFPMIni ;
      AV87Tmprevewwds_13_tfpmult = AV30TFPMUlt ;
      AV88Tmprevewwds_14_tfpmfin = AV28TFPMFin ;
      AV89Tmprevewwds_15_tfpmusucre = AV16TFPMUsuCre ;
      AV90Tmprevewwds_16_tfpmusucre_sel = AV17TFPMUsuCre_Sel ;
      AV91Tmprevewwds_17_tfpmdias = AV34TFPMDias ;
      AV92Tmprevewwds_18_tfpmdias_to = AV35TFPMDias_To ;
      AV93Tmprevewwds_19_tfpmdiaspaviso = AV63TFPMDiasPaviso ;
      AV94Tmprevewwds_20_tfpmdiaspaviso_to = AV64TFPMDiasPaviso_To ;
      AV95Tmprevewwds_21_tfpmuso = AV32TFPMUso ;
      AV96Tmprevewwds_22_tfpmuso_to = AV33TFPMUso_To ;
      AV97Tmprevewwds_23_tfpmusomts = AV42TFPMUsoMts ;
      AV98Tmprevewwds_24_tfpmusomts_to = AV43TFPMUsoMts_To ;
      AV99Tmprevewwds_25_tfpmord = AV36TFPMOrd ;
      AV100Tmprevewwds_26_tfpmord_to = AV37TFPMOrd_To ;
      AV101Tmprevewwds_27_tfpmtie = AV38TFPMTie ;
      AV102Tmprevewwds_28_tfpmtie_to = AV39TFPMTie_To ;
      AV103Tmprevewwds_29_tfpmpla = AV40TFPMPla ;
      AV104Tmprevewwds_30_tfpmpla_sel = AV41TFPMPla_Sel ;
      AV105Tmprevewwds_31_tfpmtxt = AV24TFPMTxt ;
      AV106Tmprevewwds_32_tfpmtxt_sel = AV25TFPMTxt_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV84Tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV76Tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to) ,
                                           AV79Tmprevewwds_5_tfpmdsc_sel ,
                                           AV78Tmprevewwds_4_tfpmdsc ,
                                           AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV80Tmprevewwds_6_tfpmmaqcod ,
                                           AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV82Tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV84Tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV85Tmprevewwds_11_tfpmfchcre ,
                                           AV86Tmprevewwds_12_tfpmini ,
                                           AV87Tmprevewwds_13_tfpmult ,
                                           AV88Tmprevewwds_14_tfpmfin ,
                                           AV90Tmprevewwds_16_tfpmusucre_sel ,
                                           AV89Tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV91Tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV95Tmprevewwds_21_tfpmuso ,
                                           AV96Tmprevewwds_22_tfpmuso_to ,
                                           AV97Tmprevewwds_23_tfpmusomts ,
                                           AV98Tmprevewwds_24_tfpmusomts_to ,
                                           Integer.valueOf(AV99Tmprevewwds_25_tfpmord) ,
                                           Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to) ,
                                           AV101Tmprevewwds_27_tfpmtie ,
                                           AV102Tmprevewwds_28_tfpmtie_to ,
                                           AV104Tmprevewwds_30_tfpmpla_sel ,
                                           AV103Tmprevewwds_29_tfpmpla ,
                                           AV106Tmprevewwds_32_tfpmtxt_sel ,
                                           AV105Tmprevewwds_31_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           AV75Tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV78Tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV80Tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV80Tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV82Tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV82Tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV89Tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV89Tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV103Tmprevewwds_29_tfpmpla = GXutil.padr( GXutil.rtrim( AV103Tmprevewwds_29_tfpmpla), 1, "%") ;
      lV105Tmprevewwds_31_tfpmtxt = GXutil.concat( GXutil.rtrim( AV105Tmprevewwds_31_tfpmtxt), "%", "") ;
      /* Using cursor P08JS7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV76Tmprevewwds_2_tfpmcod), Integer.valueOf(AV77Tmprevewwds_3_tfpmcod_to), lV78Tmprevewwds_4_tfpmdsc, AV79Tmprevewwds_5_tfpmdsc_sel, lV80Tmprevewwds_6_tfpmmaqcod, AV81Tmprevewwds_7_tfpmmaqcod_sel, lV82Tmprevewwds_8_tfpmmaqdsc, AV83Tmprevewwds_9_tfpmmaqdsc_sel, AV85Tmprevewwds_11_tfpmfchcre, AV86Tmprevewwds_12_tfpmini, AV87Tmprevewwds_13_tfpmult, AV88Tmprevewwds_14_tfpmfin, lV89Tmprevewwds_15_tfpmusucre, AV90Tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV91Tmprevewwds_17_tfpmdias), Short.valueOf(AV92Tmprevewwds_18_tfpmdias_to), Short.valueOf(AV93Tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV94Tmprevewwds_20_tfpmdiaspaviso_to), AV95Tmprevewwds_21_tfpmuso, AV96Tmprevewwds_22_tfpmuso_to, AV97Tmprevewwds_23_tfpmusomts, AV98Tmprevewwds_24_tfpmusomts_to, Integer.valueOf(AV99Tmprevewwds_25_tfpmord), Integer.valueOf(AV100Tmprevewwds_26_tfpmord_to), AV101Tmprevewwds_27_tfpmtie, AV102Tmprevewwds_28_tfpmtie_to, lV103Tmprevewwds_29_tfpmpla, AV104Tmprevewwds_30_tfpmpla_sel, lV105Tmprevewwds_31_tfpmtxt, AV106Tmprevewwds_32_tfpmtxt_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8JS12 = false ;
         A396EmprCod = P08JS7_A396EmprCod[0] ;
         A9483PMTxt = P08JS7_A9483PMTxt[0] ;
         n9483PMTxt = P08JS7_n9483PMTxt[0] ;
         A11456PMPla = P08JS7_A11456PMPla[0] ;
         A11455PMTie = P08JS7_A11455PMTie[0] ;
         A9488PMOrd = P08JS7_A9488PMOrd[0] ;
         n9488PMOrd = P08JS7_n9488PMOrd[0] ;
         A13013PMUsoMts = P08JS7_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JS7_n13013PMUsoMts[0] ;
         A11454PMUso = P08JS7_A11454PMUso[0] ;
         n11454PMUso = P08JS7_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JS7_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JS7_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JS7_A9487PMDias[0] ;
         n9487PMDias = P08JS7_n9487PMDias[0] ;
         A9475PMUsuCre = P08JS7_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JS7_n9475PMUsuCre[0] ;
         A9485PMFin = P08JS7_A9485PMFin[0] ;
         n9485PMFin = P08JS7_n9485PMFin[0] ;
         A9486PMUlt = P08JS7_A9486PMUlt[0] ;
         n9486PMUlt = P08JS7_n9486PMUlt[0] ;
         A9484PMIni = P08JS7_A9484PMIni[0] ;
         n9484PMIni = P08JS7_n9484PMIni[0] ;
         A9474PMFchCre = P08JS7_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JS7_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JS7_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS7_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = P08JS7_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JS7_n9476PMMaqCod[0] ;
         A9473PMDsc = P08JS7_A9473PMDsc[0] ;
         n9473PMDsc = P08JS7_n9473PMDsc[0] ;
         A9429PMCod = P08JS7_A9429PMCod[0] ;
         A9478PMEst = P08JS7_A9478PMEst[0] ;
         n9478PMEst = P08JS7_n9478PMEst[0] ;
         A9477PMMaqDsc = P08JS7_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JS7_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV75Tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV75Tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV75Tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV56count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08JS7_A9483PMTxt[0], A9483PMTxt) == 0 ) )
            {
               brk8JS12 = false ;
               A396EmprCod = P08JS7_A396EmprCod[0] ;
               A9429PMCod = P08JS7_A9429PMCod[0] ;
               AV56count = (long)(AV56count+1) ;
               brk8JS12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A9483PMTxt)==0) )
            {
               AV48Option = A9483PMTxt ;
               AV49Options.add(AV48Option, 0);
               AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV49Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JS12 )
         {
            brk8JS12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmprevewwgetfilterdata.this.AV50OptionsJson;
      this.aP4[0] = tmprevewwgetfilterdata.this.AV53OptionsDescJson;
      this.aP5[0] = tmprevewwgetfilterdata.this.AV55OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV50OptionsJson = "" ;
      AV53OptionsDescJson = "" ;
      AV55OptionIndexesJson = "" ;
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57Session = httpContext.getWebSession();
      AV59GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV60GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV12TFPMDsc = "" ;
      AV13TFPMDsc_Sel = "" ;
      AV18TFPMMaqCod = "" ;
      AV19TFPMMaqCod_Sel = "" ;
      AV20TFPMMaqDsc = "" ;
      AV21TFPMMaqDsc_Sel = "" ;
      AV22TFPMEst_SelsJson = "" ;
      AV23TFPMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV14TFPMFchCre = GXutil.nullDate() ;
      AV26TFPMIni = GXutil.nullDate() ;
      AV30TFPMUlt = GXutil.nullDate() ;
      AV28TFPMFin = GXutil.nullDate() ;
      AV16TFPMUsuCre = "" ;
      AV17TFPMUsuCre_Sel = "" ;
      AV32TFPMUso = DecimalUtil.ZERO ;
      AV33TFPMUso_To = DecimalUtil.ZERO ;
      AV42TFPMUsoMts = DecimalUtil.ZERO ;
      AV43TFPMUsoMts_To = DecimalUtil.ZERO ;
      AV38TFPMTie = DecimalUtil.ZERO ;
      AV39TFPMTie_To = DecimalUtil.ZERO ;
      AV40TFPMPla = "" ;
      AV41TFPMPla_Sel = "" ;
      AV24TFPMTxt = "" ;
      AV25TFPMTxt_Sel = "" ;
      A9473PMDsc = "" ;
      AV75Tmprevewwds_1_filterfulltext = "" ;
      AV78Tmprevewwds_4_tfpmdsc = "" ;
      AV79Tmprevewwds_5_tfpmdsc_sel = "" ;
      AV80Tmprevewwds_6_tfpmmaqcod = "" ;
      AV81Tmprevewwds_7_tfpmmaqcod_sel = "" ;
      AV82Tmprevewwds_8_tfpmmaqdsc = "" ;
      AV83Tmprevewwds_9_tfpmmaqdsc_sel = "" ;
      AV84Tmprevewwds_10_tfpmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV85Tmprevewwds_11_tfpmfchcre = GXutil.nullDate() ;
      AV86Tmprevewwds_12_tfpmini = GXutil.nullDate() ;
      AV87Tmprevewwds_13_tfpmult = GXutil.nullDate() ;
      AV88Tmprevewwds_14_tfpmfin = GXutil.nullDate() ;
      AV89Tmprevewwds_15_tfpmusucre = "" ;
      AV90Tmprevewwds_16_tfpmusucre_sel = "" ;
      AV95Tmprevewwds_21_tfpmuso = DecimalUtil.ZERO ;
      AV96Tmprevewwds_22_tfpmuso_to = DecimalUtil.ZERO ;
      AV97Tmprevewwds_23_tfpmusomts = DecimalUtil.ZERO ;
      AV98Tmprevewwds_24_tfpmusomts_to = DecimalUtil.ZERO ;
      AV101Tmprevewwds_27_tfpmtie = DecimalUtil.ZERO ;
      AV102Tmprevewwds_28_tfpmtie_to = DecimalUtil.ZERO ;
      AV103Tmprevewwds_29_tfpmpla = "" ;
      AV104Tmprevewwds_30_tfpmpla_sel = "" ;
      AV105Tmprevewwds_31_tfpmtxt = "" ;
      AV106Tmprevewwds_32_tfpmtxt_sel = "" ;
      lV75Tmprevewwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV78Tmprevewwds_4_tfpmdsc = "" ;
      lV80Tmprevewwds_6_tfpmmaqcod = "" ;
      lV82Tmprevewwds_8_tfpmmaqdsc = "" ;
      lV89Tmprevewwds_15_tfpmusucre = "" ;
      lV103Tmprevewwds_29_tfpmpla = "" ;
      lV105Tmprevewwds_31_tfpmtxt = "" ;
      A9478PMEst = "" ;
      A9476PMMaqCod = "" ;
      A9477PMMaqDsc = "" ;
      A9474PMFchCre = GXutil.nullDate() ;
      A9484PMIni = GXutil.nullDate() ;
      A9486PMUlt = GXutil.nullDate() ;
      A9485PMFin = GXutil.nullDate() ;
      A9475PMUsuCre = "" ;
      A11454PMUso = DecimalUtil.ZERO ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      A11455PMTie = DecimalUtil.ZERO ;
      A11456PMPla = "" ;
      A9483PMTxt = "" ;
      P08JS2_A396EmprCod = new String[] {""} ;
      P08JS2_A9473PMDsc = new String[] {""} ;
      P08JS2_n9473PMDsc = new boolean[] {false} ;
      P08JS2_A9483PMTxt = new String[] {""} ;
      P08JS2_n9483PMTxt = new boolean[] {false} ;
      P08JS2_A11456PMPla = new String[] {""} ;
      P08JS2_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS2_A9488PMOrd = new int[1] ;
      P08JS2_n9488PMOrd = new boolean[] {false} ;
      P08JS2_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS2_n13013PMUsoMts = new boolean[] {false} ;
      P08JS2_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS2_n11454PMUso = new boolean[] {false} ;
      P08JS2_A14275PMDiasPavi = new short[1] ;
      P08JS2_n14275PMDiasPavi = new boolean[] {false} ;
      P08JS2_A9487PMDias = new short[1] ;
      P08JS2_n9487PMDias = new boolean[] {false} ;
      P08JS2_A9475PMUsuCre = new String[] {""} ;
      P08JS2_n9475PMUsuCre = new boolean[] {false} ;
      P08JS2_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS2_n9485PMFin = new boolean[] {false} ;
      P08JS2_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS2_n9486PMUlt = new boolean[] {false} ;
      P08JS2_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS2_n9484PMIni = new boolean[] {false} ;
      P08JS2_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS2_n9474PMFchCre = new boolean[] {false} ;
      P08JS2_A9477PMMaqDsc = new String[] {""} ;
      P08JS2_n9477PMMaqDsc = new boolean[] {false} ;
      P08JS2_A9476PMMaqCod = new String[] {""} ;
      P08JS2_n9476PMMaqCod = new boolean[] {false} ;
      P08JS2_A9429PMCod = new int[1] ;
      P08JS2_A9478PMEst = new String[] {""} ;
      P08JS2_n9478PMEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV48Option = "" ;
      P08JS3_A396EmprCod = new String[] {""} ;
      P08JS3_A9476PMMaqCod = new String[] {""} ;
      P08JS3_n9476PMMaqCod = new boolean[] {false} ;
      P08JS3_A9483PMTxt = new String[] {""} ;
      P08JS3_n9483PMTxt = new boolean[] {false} ;
      P08JS3_A11456PMPla = new String[] {""} ;
      P08JS3_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS3_A9488PMOrd = new int[1] ;
      P08JS3_n9488PMOrd = new boolean[] {false} ;
      P08JS3_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS3_n13013PMUsoMts = new boolean[] {false} ;
      P08JS3_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS3_n11454PMUso = new boolean[] {false} ;
      P08JS3_A14275PMDiasPavi = new short[1] ;
      P08JS3_n14275PMDiasPavi = new boolean[] {false} ;
      P08JS3_A9487PMDias = new short[1] ;
      P08JS3_n9487PMDias = new boolean[] {false} ;
      P08JS3_A9475PMUsuCre = new String[] {""} ;
      P08JS3_n9475PMUsuCre = new boolean[] {false} ;
      P08JS3_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS3_n9485PMFin = new boolean[] {false} ;
      P08JS3_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS3_n9486PMUlt = new boolean[] {false} ;
      P08JS3_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS3_n9484PMIni = new boolean[] {false} ;
      P08JS3_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS3_n9474PMFchCre = new boolean[] {false} ;
      P08JS3_A9477PMMaqDsc = new String[] {""} ;
      P08JS3_n9477PMMaqDsc = new boolean[] {false} ;
      P08JS3_A9473PMDsc = new String[] {""} ;
      P08JS3_n9473PMDsc = new boolean[] {false} ;
      P08JS3_A9429PMCod = new int[1] ;
      P08JS3_A9478PMEst = new String[] {""} ;
      P08JS3_n9478PMEst = new boolean[] {false} ;
      P08JS4_A9476PMMaqCod = new String[] {""} ;
      P08JS4_n9476PMMaqCod = new boolean[] {false} ;
      P08JS4_A396EmprCod = new String[] {""} ;
      P08JS4_A9483PMTxt = new String[] {""} ;
      P08JS4_n9483PMTxt = new boolean[] {false} ;
      P08JS4_A11456PMPla = new String[] {""} ;
      P08JS4_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS4_A9488PMOrd = new int[1] ;
      P08JS4_n9488PMOrd = new boolean[] {false} ;
      P08JS4_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS4_n13013PMUsoMts = new boolean[] {false} ;
      P08JS4_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS4_n11454PMUso = new boolean[] {false} ;
      P08JS4_A14275PMDiasPavi = new short[1] ;
      P08JS4_n14275PMDiasPavi = new boolean[] {false} ;
      P08JS4_A9487PMDias = new short[1] ;
      P08JS4_n9487PMDias = new boolean[] {false} ;
      P08JS4_A9475PMUsuCre = new String[] {""} ;
      P08JS4_n9475PMUsuCre = new boolean[] {false} ;
      P08JS4_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS4_n9485PMFin = new boolean[] {false} ;
      P08JS4_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS4_n9486PMUlt = new boolean[] {false} ;
      P08JS4_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS4_n9484PMIni = new boolean[] {false} ;
      P08JS4_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS4_n9474PMFchCre = new boolean[] {false} ;
      P08JS4_A9477PMMaqDsc = new String[] {""} ;
      P08JS4_n9477PMMaqDsc = new boolean[] {false} ;
      P08JS4_A9473PMDsc = new String[] {""} ;
      P08JS4_n9473PMDsc = new boolean[] {false} ;
      P08JS4_A9429PMCod = new int[1] ;
      P08JS4_A9478PMEst = new String[] {""} ;
      P08JS4_n9478PMEst = new boolean[] {false} ;
      P08JS5_A396EmprCod = new String[] {""} ;
      P08JS5_A9475PMUsuCre = new String[] {""} ;
      P08JS5_n9475PMUsuCre = new boolean[] {false} ;
      P08JS5_A9483PMTxt = new String[] {""} ;
      P08JS5_n9483PMTxt = new boolean[] {false} ;
      P08JS5_A11456PMPla = new String[] {""} ;
      P08JS5_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS5_A9488PMOrd = new int[1] ;
      P08JS5_n9488PMOrd = new boolean[] {false} ;
      P08JS5_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS5_n13013PMUsoMts = new boolean[] {false} ;
      P08JS5_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS5_n11454PMUso = new boolean[] {false} ;
      P08JS5_A14275PMDiasPavi = new short[1] ;
      P08JS5_n14275PMDiasPavi = new boolean[] {false} ;
      P08JS5_A9487PMDias = new short[1] ;
      P08JS5_n9487PMDias = new boolean[] {false} ;
      P08JS5_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS5_n9485PMFin = new boolean[] {false} ;
      P08JS5_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS5_n9486PMUlt = new boolean[] {false} ;
      P08JS5_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS5_n9484PMIni = new boolean[] {false} ;
      P08JS5_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS5_n9474PMFchCre = new boolean[] {false} ;
      P08JS5_A9477PMMaqDsc = new String[] {""} ;
      P08JS5_n9477PMMaqDsc = new boolean[] {false} ;
      P08JS5_A9476PMMaqCod = new String[] {""} ;
      P08JS5_n9476PMMaqCod = new boolean[] {false} ;
      P08JS5_A9473PMDsc = new String[] {""} ;
      P08JS5_n9473PMDsc = new boolean[] {false} ;
      P08JS5_A9429PMCod = new int[1] ;
      P08JS5_A9478PMEst = new String[] {""} ;
      P08JS5_n9478PMEst = new boolean[] {false} ;
      AV51OptionDesc = "" ;
      P08JS6_A396EmprCod = new String[] {""} ;
      P08JS6_A11456PMPla = new String[] {""} ;
      P08JS6_A9483PMTxt = new String[] {""} ;
      P08JS6_n9483PMTxt = new boolean[] {false} ;
      P08JS6_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS6_A9488PMOrd = new int[1] ;
      P08JS6_n9488PMOrd = new boolean[] {false} ;
      P08JS6_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS6_n13013PMUsoMts = new boolean[] {false} ;
      P08JS6_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS6_n11454PMUso = new boolean[] {false} ;
      P08JS6_A14275PMDiasPavi = new short[1] ;
      P08JS6_n14275PMDiasPavi = new boolean[] {false} ;
      P08JS6_A9487PMDias = new short[1] ;
      P08JS6_n9487PMDias = new boolean[] {false} ;
      P08JS6_A9475PMUsuCre = new String[] {""} ;
      P08JS6_n9475PMUsuCre = new boolean[] {false} ;
      P08JS6_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS6_n9485PMFin = new boolean[] {false} ;
      P08JS6_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS6_n9486PMUlt = new boolean[] {false} ;
      P08JS6_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS6_n9484PMIni = new boolean[] {false} ;
      P08JS6_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS6_n9474PMFchCre = new boolean[] {false} ;
      P08JS6_A9477PMMaqDsc = new String[] {""} ;
      P08JS6_n9477PMMaqDsc = new boolean[] {false} ;
      P08JS6_A9476PMMaqCod = new String[] {""} ;
      P08JS6_n9476PMMaqCod = new boolean[] {false} ;
      P08JS6_A9473PMDsc = new String[] {""} ;
      P08JS6_n9473PMDsc = new boolean[] {false} ;
      P08JS6_A9429PMCod = new int[1] ;
      P08JS6_A9478PMEst = new String[] {""} ;
      P08JS6_n9478PMEst = new boolean[] {false} ;
      P08JS7_A396EmprCod = new String[] {""} ;
      P08JS7_A9483PMTxt = new String[] {""} ;
      P08JS7_n9483PMTxt = new boolean[] {false} ;
      P08JS7_A11456PMPla = new String[] {""} ;
      P08JS7_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS7_A9488PMOrd = new int[1] ;
      P08JS7_n9488PMOrd = new boolean[] {false} ;
      P08JS7_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS7_n13013PMUsoMts = new boolean[] {false} ;
      P08JS7_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JS7_n11454PMUso = new boolean[] {false} ;
      P08JS7_A14275PMDiasPavi = new short[1] ;
      P08JS7_n14275PMDiasPavi = new boolean[] {false} ;
      P08JS7_A9487PMDias = new short[1] ;
      P08JS7_n9487PMDias = new boolean[] {false} ;
      P08JS7_A9475PMUsuCre = new String[] {""} ;
      P08JS7_n9475PMUsuCre = new boolean[] {false} ;
      P08JS7_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS7_n9485PMFin = new boolean[] {false} ;
      P08JS7_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS7_n9486PMUlt = new boolean[] {false} ;
      P08JS7_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS7_n9484PMIni = new boolean[] {false} ;
      P08JS7_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JS7_n9474PMFchCre = new boolean[] {false} ;
      P08JS7_A9477PMMaqDsc = new String[] {""} ;
      P08JS7_n9477PMMaqDsc = new boolean[] {false} ;
      P08JS7_A9476PMMaqCod = new String[] {""} ;
      P08JS7_n9476PMMaqCod = new boolean[] {false} ;
      P08JS7_A9473PMDsc = new String[] {""} ;
      P08JS7_n9473PMDsc = new boolean[] {false} ;
      P08JS7_A9429PMCod = new int[1] ;
      P08JS7_A9478PMEst = new String[] {""} ;
      P08JS7_n9478PMEst = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmprevewwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08JS2_A396EmprCod, P08JS2_A9473PMDsc, P08JS2_n9473PMDsc, P08JS2_A9483PMTxt, P08JS2_n9483PMTxt, P08JS2_A11456PMPla, P08JS2_A11455PMTie, P08JS2_A9488PMOrd, P08JS2_n9488PMOrd, P08JS2_A13013PMUsoMts,
            P08JS2_n13013PMUsoMts, P08JS2_A11454PMUso, P08JS2_n11454PMUso, P08JS2_A14275PMDiasPavi, P08JS2_n14275PMDiasPavi, P08JS2_A9487PMDias, P08JS2_n9487PMDias, P08JS2_A9475PMUsuCre, P08JS2_n9475PMUsuCre, P08JS2_A9485PMFin,
            P08JS2_n9485PMFin, P08JS2_A9486PMUlt, P08JS2_n9486PMUlt, P08JS2_A9484PMIni, P08JS2_n9484PMIni, P08JS2_A9474PMFchCre, P08JS2_n9474PMFchCre, P08JS2_A9477PMMaqDsc, P08JS2_n9477PMMaqDsc, P08JS2_A9476PMMaqCod,
            P08JS2_n9476PMMaqCod, P08JS2_A9429PMCod, P08JS2_A9478PMEst, P08JS2_n9478PMEst
            }
            , new Object[] {
            P08JS3_A396EmprCod, P08JS3_A9476PMMaqCod, P08JS3_n9476PMMaqCod, P08JS3_A9483PMTxt, P08JS3_n9483PMTxt, P08JS3_A11456PMPla, P08JS3_A11455PMTie, P08JS3_A9488PMOrd, P08JS3_n9488PMOrd, P08JS3_A13013PMUsoMts,
            P08JS3_n13013PMUsoMts, P08JS3_A11454PMUso, P08JS3_n11454PMUso, P08JS3_A14275PMDiasPavi, P08JS3_n14275PMDiasPavi, P08JS3_A9487PMDias, P08JS3_n9487PMDias, P08JS3_A9475PMUsuCre, P08JS3_n9475PMUsuCre, P08JS3_A9485PMFin,
            P08JS3_n9485PMFin, P08JS3_A9486PMUlt, P08JS3_n9486PMUlt, P08JS3_A9484PMIni, P08JS3_n9484PMIni, P08JS3_A9474PMFchCre, P08JS3_n9474PMFchCre, P08JS3_A9477PMMaqDsc, P08JS3_n9477PMMaqDsc, P08JS3_A9473PMDsc,
            P08JS3_n9473PMDsc, P08JS3_A9429PMCod, P08JS3_A9478PMEst, P08JS3_n9478PMEst
            }
            , new Object[] {
            P08JS4_A9476PMMaqCod, P08JS4_n9476PMMaqCod, P08JS4_A396EmprCod, P08JS4_A9483PMTxt, P08JS4_n9483PMTxt, P08JS4_A11456PMPla, P08JS4_A11455PMTie, P08JS4_A9488PMOrd, P08JS4_n9488PMOrd, P08JS4_A13013PMUsoMts,
            P08JS4_n13013PMUsoMts, P08JS4_A11454PMUso, P08JS4_n11454PMUso, P08JS4_A14275PMDiasPavi, P08JS4_n14275PMDiasPavi, P08JS4_A9487PMDias, P08JS4_n9487PMDias, P08JS4_A9475PMUsuCre, P08JS4_n9475PMUsuCre, P08JS4_A9485PMFin,
            P08JS4_n9485PMFin, P08JS4_A9486PMUlt, P08JS4_n9486PMUlt, P08JS4_A9484PMIni, P08JS4_n9484PMIni, P08JS4_A9474PMFchCre, P08JS4_n9474PMFchCre, P08JS4_A9477PMMaqDsc, P08JS4_n9477PMMaqDsc, P08JS4_A9473PMDsc,
            P08JS4_n9473PMDsc, P08JS4_A9429PMCod, P08JS4_A9478PMEst, P08JS4_n9478PMEst
            }
            , new Object[] {
            P08JS5_A396EmprCod, P08JS5_A9475PMUsuCre, P08JS5_n9475PMUsuCre, P08JS5_A9483PMTxt, P08JS5_n9483PMTxt, P08JS5_A11456PMPla, P08JS5_A11455PMTie, P08JS5_A9488PMOrd, P08JS5_n9488PMOrd, P08JS5_A13013PMUsoMts,
            P08JS5_n13013PMUsoMts, P08JS5_A11454PMUso, P08JS5_n11454PMUso, P08JS5_A14275PMDiasPavi, P08JS5_n14275PMDiasPavi, P08JS5_A9487PMDias, P08JS5_n9487PMDias, P08JS5_A9485PMFin, P08JS5_n9485PMFin, P08JS5_A9486PMUlt,
            P08JS5_n9486PMUlt, P08JS5_A9484PMIni, P08JS5_n9484PMIni, P08JS5_A9474PMFchCre, P08JS5_n9474PMFchCre, P08JS5_A9477PMMaqDsc, P08JS5_n9477PMMaqDsc, P08JS5_A9476PMMaqCod, P08JS5_n9476PMMaqCod, P08JS5_A9473PMDsc,
            P08JS5_n9473PMDsc, P08JS5_A9429PMCod, P08JS5_A9478PMEst, P08JS5_n9478PMEst
            }
            , new Object[] {
            P08JS6_A396EmprCod, P08JS6_A11456PMPla, P08JS6_A9483PMTxt, P08JS6_n9483PMTxt, P08JS6_A11455PMTie, P08JS6_A9488PMOrd, P08JS6_n9488PMOrd, P08JS6_A13013PMUsoMts, P08JS6_n13013PMUsoMts, P08JS6_A11454PMUso,
            P08JS6_n11454PMUso, P08JS6_A14275PMDiasPavi, P08JS6_n14275PMDiasPavi, P08JS6_A9487PMDias, P08JS6_n9487PMDias, P08JS6_A9475PMUsuCre, P08JS6_n9475PMUsuCre, P08JS6_A9485PMFin, P08JS6_n9485PMFin, P08JS6_A9486PMUlt,
            P08JS6_n9486PMUlt, P08JS6_A9484PMIni, P08JS6_n9484PMIni, P08JS6_A9474PMFchCre, P08JS6_n9474PMFchCre, P08JS6_A9477PMMaqDsc, P08JS6_n9477PMMaqDsc, P08JS6_A9476PMMaqCod, P08JS6_n9476PMMaqCod, P08JS6_A9473PMDsc,
            P08JS6_n9473PMDsc, P08JS6_A9429PMCod, P08JS6_A9478PMEst, P08JS6_n9478PMEst
            }
            , new Object[] {
            P08JS7_A396EmprCod, P08JS7_A9483PMTxt, P08JS7_n9483PMTxt, P08JS7_A11456PMPla, P08JS7_A11455PMTie, P08JS7_A9488PMOrd, P08JS7_n9488PMOrd, P08JS7_A13013PMUsoMts, P08JS7_n13013PMUsoMts, P08JS7_A11454PMUso,
            P08JS7_n11454PMUso, P08JS7_A14275PMDiasPavi, P08JS7_n14275PMDiasPavi, P08JS7_A9487PMDias, P08JS7_n9487PMDias, P08JS7_A9475PMUsuCre, P08JS7_n9475PMUsuCre, P08JS7_A9485PMFin, P08JS7_n9485PMFin, P08JS7_A9486PMUlt,
            P08JS7_n9486PMUlt, P08JS7_A9484PMIni, P08JS7_n9484PMIni, P08JS7_A9474PMFchCre, P08JS7_n9474PMFchCre, P08JS7_A9477PMMaqDsc, P08JS7_n9477PMMaqDsc, P08JS7_A9476PMMaqCod, P08JS7_n9476PMMaqCod, P08JS7_A9473PMDsc,
            P08JS7_n9473PMDsc, P08JS7_A9429PMCod, P08JS7_A9478PMEst, P08JS7_n9478PMEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV34TFPMDias ;
   private short AV35TFPMDias_To ;
   private short AV63TFPMDiasPaviso ;
   private short AV64TFPMDiasPaviso_To ;
   private short AV91Tmprevewwds_17_tfpmdias ;
   private short AV92Tmprevewwds_18_tfpmdias_to ;
   private short AV93Tmprevewwds_19_tfpmdiaspaviso ;
   private short AV94Tmprevewwds_20_tfpmdiaspaviso_to ;
   private short A9487PMDias ;
   private short A14275PMDiasPavi ;
   private short Gx_err ;
   private int AV73GXV1 ;
   private int AV10TFPMCod ;
   private int AV11TFPMCod_To ;
   private int AV36TFPMOrd ;
   private int AV37TFPMOrd_To ;
   private int AV76Tmprevewwds_2_tfpmcod ;
   private int AV77Tmprevewwds_3_tfpmcod_to ;
   private int AV99Tmprevewwds_25_tfpmord ;
   private int AV100Tmprevewwds_26_tfpmord_to ;
   private int AV84Tmprevewwds_10_tfpmest_sels_size ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int AV47InsertIndex ;
   private long AV56count ;
   private java.math.BigDecimal AV32TFPMUso ;
   private java.math.BigDecimal AV33TFPMUso_To ;
   private java.math.BigDecimal AV42TFPMUsoMts ;
   private java.math.BigDecimal AV43TFPMUsoMts_To ;
   private java.math.BigDecimal AV38TFPMTie ;
   private java.math.BigDecimal AV39TFPMTie_To ;
   private java.math.BigDecimal AV95Tmprevewwds_21_tfpmuso ;
   private java.math.BigDecimal AV96Tmprevewwds_22_tfpmuso_to ;
   private java.math.BigDecimal AV97Tmprevewwds_23_tfpmusomts ;
   private java.math.BigDecimal AV98Tmprevewwds_24_tfpmusomts_to ;
   private java.math.BigDecimal AV101Tmprevewwds_27_tfpmtie ;
   private java.math.BigDecimal AV102Tmprevewwds_28_tfpmtie_to ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal A11455PMTie ;
   private String AV12TFPMDsc ;
   private String AV13TFPMDsc_Sel ;
   private String AV18TFPMMaqCod ;
   private String AV19TFPMMaqCod_Sel ;
   private String AV20TFPMMaqDsc ;
   private String AV21TFPMMaqDsc_Sel ;
   private String AV16TFPMUsuCre ;
   private String AV17TFPMUsuCre_Sel ;
   private String AV40TFPMPla ;
   private String AV41TFPMPla_Sel ;
   private String A9473PMDsc ;
   private String AV78Tmprevewwds_4_tfpmdsc ;
   private String AV79Tmprevewwds_5_tfpmdsc_sel ;
   private String AV80Tmprevewwds_6_tfpmmaqcod ;
   private String AV81Tmprevewwds_7_tfpmmaqcod_sel ;
   private String AV82Tmprevewwds_8_tfpmmaqdsc ;
   private String AV83Tmprevewwds_9_tfpmmaqdsc_sel ;
   private String AV89Tmprevewwds_15_tfpmusucre ;
   private String AV90Tmprevewwds_16_tfpmusucre_sel ;
   private String AV103Tmprevewwds_29_tfpmpla ;
   private String AV104Tmprevewwds_30_tfpmpla_sel ;
   private String scmdbuf ;
   private String lV78Tmprevewwds_4_tfpmdsc ;
   private String lV80Tmprevewwds_6_tfpmmaqcod ;
   private String lV82Tmprevewwds_8_tfpmmaqdsc ;
   private String lV89Tmprevewwds_15_tfpmusucre ;
   private String lV103Tmprevewwds_29_tfpmpla ;
   private String A9478PMEst ;
   private String A9476PMMaqCod ;
   private String A9477PMMaqDsc ;
   private String A9475PMUsuCre ;
   private String A11456PMPla ;
   private String A396EmprCod ;
   private java.util.Date AV14TFPMFchCre ;
   private java.util.Date AV26TFPMIni ;
   private java.util.Date AV30TFPMUlt ;
   private java.util.Date AV28TFPMFin ;
   private java.util.Date AV85Tmprevewwds_11_tfpmfchcre ;
   private java.util.Date AV86Tmprevewwds_12_tfpmini ;
   private java.util.Date AV87Tmprevewwds_13_tfpmult ;
   private java.util.Date AV88Tmprevewwds_14_tfpmfin ;
   private java.util.Date A9474PMFchCre ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date A9485PMFin ;
   private boolean returnInSub ;
   private boolean brk8JS2 ;
   private boolean n9473PMDsc ;
   private boolean n9483PMTxt ;
   private boolean n9488PMOrd ;
   private boolean n13013PMUsoMts ;
   private boolean n11454PMUso ;
   private boolean n14275PMDiasPavi ;
   private boolean n9487PMDias ;
   private boolean n9475PMUsuCre ;
   private boolean n9485PMFin ;
   private boolean n9486PMUlt ;
   private boolean n9484PMIni ;
   private boolean n9474PMFchCre ;
   private boolean n9477PMMaqDsc ;
   private boolean n9476PMMaqCod ;
   private boolean n9478PMEst ;
   private boolean brk8JS4 ;
   private boolean brk8JS6 ;
   private boolean brk8JS8 ;
   private boolean brk8JS10 ;
   private boolean brk8JS12 ;
   private String AV50OptionsJson ;
   private String AV53OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV22TFPMEst_SelsJson ;
   private String AV46DDOName ;
   private String AV44SearchTxt ;
   private String AV45SearchTxtTo ;
   private String AV62FilterFullText ;
   private String AV24TFPMTxt ;
   private String AV25TFPMTxt_Sel ;
   private String AV75Tmprevewwds_1_filterfulltext ;
   private String AV105Tmprevewwds_31_tfpmtxt ;
   private String AV106Tmprevewwds_32_tfpmtxt_sel ;
   private String lV75Tmprevewwds_1_filterfulltext ;
   private String lV105Tmprevewwds_31_tfpmtxt ;
   private String A9483PMTxt ;
   private String AV48Option ;
   private String AV51OptionDesc ;
   private com.genexus.webpanels.WebSession AV57Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08JS2_A396EmprCod ;
   private String[] P08JS2_A9473PMDsc ;
   private boolean[] P08JS2_n9473PMDsc ;
   private String[] P08JS2_A9483PMTxt ;
   private boolean[] P08JS2_n9483PMTxt ;
   private String[] P08JS2_A11456PMPla ;
   private java.math.BigDecimal[] P08JS2_A11455PMTie ;
   private int[] P08JS2_A9488PMOrd ;
   private boolean[] P08JS2_n9488PMOrd ;
   private java.math.BigDecimal[] P08JS2_A13013PMUsoMts ;
   private boolean[] P08JS2_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JS2_A11454PMUso ;
   private boolean[] P08JS2_n11454PMUso ;
   private short[] P08JS2_A14275PMDiasPavi ;
   private boolean[] P08JS2_n14275PMDiasPavi ;
   private short[] P08JS2_A9487PMDias ;
   private boolean[] P08JS2_n9487PMDias ;
   private String[] P08JS2_A9475PMUsuCre ;
   private boolean[] P08JS2_n9475PMUsuCre ;
   private java.util.Date[] P08JS2_A9485PMFin ;
   private boolean[] P08JS2_n9485PMFin ;
   private java.util.Date[] P08JS2_A9486PMUlt ;
   private boolean[] P08JS2_n9486PMUlt ;
   private java.util.Date[] P08JS2_A9484PMIni ;
   private boolean[] P08JS2_n9484PMIni ;
   private java.util.Date[] P08JS2_A9474PMFchCre ;
   private boolean[] P08JS2_n9474PMFchCre ;
   private String[] P08JS2_A9477PMMaqDsc ;
   private boolean[] P08JS2_n9477PMMaqDsc ;
   private String[] P08JS2_A9476PMMaqCod ;
   private boolean[] P08JS2_n9476PMMaqCod ;
   private int[] P08JS2_A9429PMCod ;
   private String[] P08JS2_A9478PMEst ;
   private boolean[] P08JS2_n9478PMEst ;
   private String[] P08JS3_A396EmprCod ;
   private String[] P08JS3_A9476PMMaqCod ;
   private boolean[] P08JS3_n9476PMMaqCod ;
   private String[] P08JS3_A9483PMTxt ;
   private boolean[] P08JS3_n9483PMTxt ;
   private String[] P08JS3_A11456PMPla ;
   private java.math.BigDecimal[] P08JS3_A11455PMTie ;
   private int[] P08JS3_A9488PMOrd ;
   private boolean[] P08JS3_n9488PMOrd ;
   private java.math.BigDecimal[] P08JS3_A13013PMUsoMts ;
   private boolean[] P08JS3_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JS3_A11454PMUso ;
   private boolean[] P08JS3_n11454PMUso ;
   private short[] P08JS3_A14275PMDiasPavi ;
   private boolean[] P08JS3_n14275PMDiasPavi ;
   private short[] P08JS3_A9487PMDias ;
   private boolean[] P08JS3_n9487PMDias ;
   private String[] P08JS3_A9475PMUsuCre ;
   private boolean[] P08JS3_n9475PMUsuCre ;
   private java.util.Date[] P08JS3_A9485PMFin ;
   private boolean[] P08JS3_n9485PMFin ;
   private java.util.Date[] P08JS3_A9486PMUlt ;
   private boolean[] P08JS3_n9486PMUlt ;
   private java.util.Date[] P08JS3_A9484PMIni ;
   private boolean[] P08JS3_n9484PMIni ;
   private java.util.Date[] P08JS3_A9474PMFchCre ;
   private boolean[] P08JS3_n9474PMFchCre ;
   private String[] P08JS3_A9477PMMaqDsc ;
   private boolean[] P08JS3_n9477PMMaqDsc ;
   private String[] P08JS3_A9473PMDsc ;
   private boolean[] P08JS3_n9473PMDsc ;
   private int[] P08JS3_A9429PMCod ;
   private String[] P08JS3_A9478PMEst ;
   private boolean[] P08JS3_n9478PMEst ;
   private String[] P08JS4_A9476PMMaqCod ;
   private boolean[] P08JS4_n9476PMMaqCod ;
   private String[] P08JS4_A396EmprCod ;
   private String[] P08JS4_A9483PMTxt ;
   private boolean[] P08JS4_n9483PMTxt ;
   private String[] P08JS4_A11456PMPla ;
   private java.math.BigDecimal[] P08JS4_A11455PMTie ;
   private int[] P08JS4_A9488PMOrd ;
   private boolean[] P08JS4_n9488PMOrd ;
   private java.math.BigDecimal[] P08JS4_A13013PMUsoMts ;
   private boolean[] P08JS4_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JS4_A11454PMUso ;
   private boolean[] P08JS4_n11454PMUso ;
   private short[] P08JS4_A14275PMDiasPavi ;
   private boolean[] P08JS4_n14275PMDiasPavi ;
   private short[] P08JS4_A9487PMDias ;
   private boolean[] P08JS4_n9487PMDias ;
   private String[] P08JS4_A9475PMUsuCre ;
   private boolean[] P08JS4_n9475PMUsuCre ;
   private java.util.Date[] P08JS4_A9485PMFin ;
   private boolean[] P08JS4_n9485PMFin ;
   private java.util.Date[] P08JS4_A9486PMUlt ;
   private boolean[] P08JS4_n9486PMUlt ;
   private java.util.Date[] P08JS4_A9484PMIni ;
   private boolean[] P08JS4_n9484PMIni ;
   private java.util.Date[] P08JS4_A9474PMFchCre ;
   private boolean[] P08JS4_n9474PMFchCre ;
   private String[] P08JS4_A9477PMMaqDsc ;
   private boolean[] P08JS4_n9477PMMaqDsc ;
   private String[] P08JS4_A9473PMDsc ;
   private boolean[] P08JS4_n9473PMDsc ;
   private int[] P08JS4_A9429PMCod ;
   private String[] P08JS4_A9478PMEst ;
   private boolean[] P08JS4_n9478PMEst ;
   private String[] P08JS5_A396EmprCod ;
   private String[] P08JS5_A9475PMUsuCre ;
   private boolean[] P08JS5_n9475PMUsuCre ;
   private String[] P08JS5_A9483PMTxt ;
   private boolean[] P08JS5_n9483PMTxt ;
   private String[] P08JS5_A11456PMPla ;
   private java.math.BigDecimal[] P08JS5_A11455PMTie ;
   private int[] P08JS5_A9488PMOrd ;
   private boolean[] P08JS5_n9488PMOrd ;
   private java.math.BigDecimal[] P08JS5_A13013PMUsoMts ;
   private boolean[] P08JS5_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JS5_A11454PMUso ;
   private boolean[] P08JS5_n11454PMUso ;
   private short[] P08JS5_A14275PMDiasPavi ;
   private boolean[] P08JS5_n14275PMDiasPavi ;
   private short[] P08JS5_A9487PMDias ;
   private boolean[] P08JS5_n9487PMDias ;
   private java.util.Date[] P08JS5_A9485PMFin ;
   private boolean[] P08JS5_n9485PMFin ;
   private java.util.Date[] P08JS5_A9486PMUlt ;
   private boolean[] P08JS5_n9486PMUlt ;
   private java.util.Date[] P08JS5_A9484PMIni ;
   private boolean[] P08JS5_n9484PMIni ;
   private java.util.Date[] P08JS5_A9474PMFchCre ;
   private boolean[] P08JS5_n9474PMFchCre ;
   private String[] P08JS5_A9477PMMaqDsc ;
   private boolean[] P08JS5_n9477PMMaqDsc ;
   private String[] P08JS5_A9476PMMaqCod ;
   private boolean[] P08JS5_n9476PMMaqCod ;
   private String[] P08JS5_A9473PMDsc ;
   private boolean[] P08JS5_n9473PMDsc ;
   private int[] P08JS5_A9429PMCod ;
   private String[] P08JS5_A9478PMEst ;
   private boolean[] P08JS5_n9478PMEst ;
   private String[] P08JS6_A396EmprCod ;
   private String[] P08JS6_A11456PMPla ;
   private String[] P08JS6_A9483PMTxt ;
   private boolean[] P08JS6_n9483PMTxt ;
   private java.math.BigDecimal[] P08JS6_A11455PMTie ;
   private int[] P08JS6_A9488PMOrd ;
   private boolean[] P08JS6_n9488PMOrd ;
   private java.math.BigDecimal[] P08JS6_A13013PMUsoMts ;
   private boolean[] P08JS6_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JS6_A11454PMUso ;
   private boolean[] P08JS6_n11454PMUso ;
   private short[] P08JS6_A14275PMDiasPavi ;
   private boolean[] P08JS6_n14275PMDiasPavi ;
   private short[] P08JS6_A9487PMDias ;
   private boolean[] P08JS6_n9487PMDias ;
   private String[] P08JS6_A9475PMUsuCre ;
   private boolean[] P08JS6_n9475PMUsuCre ;
   private java.util.Date[] P08JS6_A9485PMFin ;
   private boolean[] P08JS6_n9485PMFin ;
   private java.util.Date[] P08JS6_A9486PMUlt ;
   private boolean[] P08JS6_n9486PMUlt ;
   private java.util.Date[] P08JS6_A9484PMIni ;
   private boolean[] P08JS6_n9484PMIni ;
   private java.util.Date[] P08JS6_A9474PMFchCre ;
   private boolean[] P08JS6_n9474PMFchCre ;
   private String[] P08JS6_A9477PMMaqDsc ;
   private boolean[] P08JS6_n9477PMMaqDsc ;
   private String[] P08JS6_A9476PMMaqCod ;
   private boolean[] P08JS6_n9476PMMaqCod ;
   private String[] P08JS6_A9473PMDsc ;
   private boolean[] P08JS6_n9473PMDsc ;
   private int[] P08JS6_A9429PMCod ;
   private String[] P08JS6_A9478PMEst ;
   private boolean[] P08JS6_n9478PMEst ;
   private String[] P08JS7_A396EmprCod ;
   private String[] P08JS7_A9483PMTxt ;
   private boolean[] P08JS7_n9483PMTxt ;
   private String[] P08JS7_A11456PMPla ;
   private java.math.BigDecimal[] P08JS7_A11455PMTie ;
   private int[] P08JS7_A9488PMOrd ;
   private boolean[] P08JS7_n9488PMOrd ;
   private java.math.BigDecimal[] P08JS7_A13013PMUsoMts ;
   private boolean[] P08JS7_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JS7_A11454PMUso ;
   private boolean[] P08JS7_n11454PMUso ;
   private short[] P08JS7_A14275PMDiasPavi ;
   private boolean[] P08JS7_n14275PMDiasPavi ;
   private short[] P08JS7_A9487PMDias ;
   private boolean[] P08JS7_n9487PMDias ;
   private String[] P08JS7_A9475PMUsuCre ;
   private boolean[] P08JS7_n9475PMUsuCre ;
   private java.util.Date[] P08JS7_A9485PMFin ;
   private boolean[] P08JS7_n9485PMFin ;
   private java.util.Date[] P08JS7_A9486PMUlt ;
   private boolean[] P08JS7_n9486PMUlt ;
   private java.util.Date[] P08JS7_A9484PMIni ;
   private boolean[] P08JS7_n9484PMIni ;
   private java.util.Date[] P08JS7_A9474PMFchCre ;
   private boolean[] P08JS7_n9474PMFchCre ;
   private String[] P08JS7_A9477PMMaqDsc ;
   private boolean[] P08JS7_n9477PMMaqDsc ;
   private String[] P08JS7_A9476PMMaqCod ;
   private boolean[] P08JS7_n9476PMMaqCod ;
   private String[] P08JS7_A9473PMDsc ;
   private boolean[] P08JS7_n9473PMDsc ;
   private int[] P08JS7_A9429PMCod ;
   private String[] P08JS7_A9478PMEst ;
   private boolean[] P08JS7_n9478PMEst ;
   private GXSimpleCollection<String> AV23TFPMEst_Sels ;
   private GXSimpleCollection<String> AV84Tmprevewwds_10_tfpmest_sels ;
   private GXSimpleCollection<String> AV49Options ;
   private GXSimpleCollection<String> AV52OptionsDesc ;
   private GXSimpleCollection<String> AV54OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV59GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV60GridStateFilterValue ;
}

final  class tmprevewwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV84Tmprevewwds_10_tfpmest_sels ,
                                          int AV76Tmprevewwds_2_tfpmcod ,
                                          int AV77Tmprevewwds_3_tfpmcod_to ,
                                          String AV79Tmprevewwds_5_tfpmdsc_sel ,
                                          String AV78Tmprevewwds_4_tfpmdsc ,
                                          String AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV80Tmprevewwds_6_tfpmmaqcod ,
                                          String AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV82Tmprevewwds_8_tfpmmaqdsc ,
                                          int AV84Tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV85Tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV86Tmprevewwds_12_tfpmini ,
                                          java.util.Date AV87Tmprevewwds_13_tfpmult ,
                                          java.util.Date AV88Tmprevewwds_14_tfpmfin ,
                                          String AV90Tmprevewwds_16_tfpmusucre_sel ,
                                          String AV89Tmprevewwds_15_tfpmusucre ,
                                          short AV91Tmprevewwds_17_tfpmdias ,
                                          short AV92Tmprevewwds_18_tfpmdias_to ,
                                          short AV93Tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV94Tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV95Tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV96Tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV97Tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV98Tmprevewwds_24_tfpmusomts_to ,
                                          int AV99Tmprevewwds_25_tfpmord ,
                                          int AV100Tmprevewwds_26_tfpmord_to ,
                                          java.math.BigDecimal AV101Tmprevewwds_27_tfpmtie ,
                                          java.math.BigDecimal AV102Tmprevewwds_28_tfpmtie_to ,
                                          String AV104Tmprevewwds_30_tfpmpla_sel ,
                                          String AV103Tmprevewwds_29_tfpmpla ,
                                          String AV106Tmprevewwds_32_tfpmtxt_sel ,
                                          String AV105Tmprevewwds_31_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          String AV75Tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PMDsc, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt, T1.PMIni," ;
      scmdbuf += " T1.PMFchCre, T2.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMCod, T1.PMEst FROM (TXPMPREVE T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod" ;
      scmdbuf += " = T1.PMMaqCod)" ;
      if ( ! (0==AV76Tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV84Tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV92Tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV93Tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV94Tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Tmprevewwds_25_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV100Tmprevewwds_26_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tmprevewwds_27_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tmprevewwds_28_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV103Tmprevewwds_29_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV105Tmprevewwds_31_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PMDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08JS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV84Tmprevewwds_10_tfpmest_sels ,
                                          int AV76Tmprevewwds_2_tfpmcod ,
                                          int AV77Tmprevewwds_3_tfpmcod_to ,
                                          String AV79Tmprevewwds_5_tfpmdsc_sel ,
                                          String AV78Tmprevewwds_4_tfpmdsc ,
                                          String AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV80Tmprevewwds_6_tfpmmaqcod ,
                                          String AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV82Tmprevewwds_8_tfpmmaqdsc ,
                                          int AV84Tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV85Tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV86Tmprevewwds_12_tfpmini ,
                                          java.util.Date AV87Tmprevewwds_13_tfpmult ,
                                          java.util.Date AV88Tmprevewwds_14_tfpmfin ,
                                          String AV90Tmprevewwds_16_tfpmusucre_sel ,
                                          String AV89Tmprevewwds_15_tfpmusucre ,
                                          short AV91Tmprevewwds_17_tfpmdias ,
                                          short AV92Tmprevewwds_18_tfpmdias_to ,
                                          short AV93Tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV94Tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV95Tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV96Tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV97Tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV98Tmprevewwds_24_tfpmusomts_to ,
                                          int AV99Tmprevewwds_25_tfpmord ,
                                          int AV100Tmprevewwds_26_tfpmord_to ,
                                          java.math.BigDecimal AV101Tmprevewwds_27_tfpmtie ,
                                          java.math.BigDecimal AV102Tmprevewwds_28_tfpmtie_to ,
                                          String AV104Tmprevewwds_30_tfpmpla_sel ,
                                          String AV103Tmprevewwds_29_tfpmpla ,
                                          String AV106Tmprevewwds_32_tfpmtxt_sel ,
                                          String AV105Tmprevewwds_31_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          String AV75Tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[30];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PMMaqCod AS PMMaqCod, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt," ;
      scmdbuf += " T1.PMIni, T1.PMFchCre, T2.MaqDsc AS PMMaqDsc, T1.PMDsc, T1.PMCod, T1.PMEst FROM (TXPMPREVE T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.PMMaqCod)" ;
      if ( ! (0==AV76Tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV84Tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV92Tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV93Tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV94Tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Tmprevewwds_25_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV100Tmprevewwds_26_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tmprevewwds_27_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tmprevewwds_28_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV103Tmprevewwds_29_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV105Tmprevewwds_31_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PMMaqCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08JS4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV84Tmprevewwds_10_tfpmest_sels ,
                                          int AV76Tmprevewwds_2_tfpmcod ,
                                          int AV77Tmprevewwds_3_tfpmcod_to ,
                                          String AV79Tmprevewwds_5_tfpmdsc_sel ,
                                          String AV78Tmprevewwds_4_tfpmdsc ,
                                          String AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV80Tmprevewwds_6_tfpmmaqcod ,
                                          String AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV82Tmprevewwds_8_tfpmmaqdsc ,
                                          int AV84Tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV85Tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV86Tmprevewwds_12_tfpmini ,
                                          java.util.Date AV87Tmprevewwds_13_tfpmult ,
                                          java.util.Date AV88Tmprevewwds_14_tfpmfin ,
                                          String AV90Tmprevewwds_16_tfpmusucre_sel ,
                                          String AV89Tmprevewwds_15_tfpmusucre ,
                                          short AV91Tmprevewwds_17_tfpmdias ,
                                          short AV92Tmprevewwds_18_tfpmdias_to ,
                                          short AV93Tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV94Tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV95Tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV96Tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV97Tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV98Tmprevewwds_24_tfpmusomts_to ,
                                          int AV99Tmprevewwds_25_tfpmord ,
                                          int AV100Tmprevewwds_26_tfpmord_to ,
                                          java.math.BigDecimal AV101Tmprevewwds_27_tfpmtie ,
                                          java.math.BigDecimal AV102Tmprevewwds_28_tfpmtie_to ,
                                          String AV104Tmprevewwds_30_tfpmpla_sel ,
                                          String AV103Tmprevewwds_29_tfpmpla ,
                                          String AV106Tmprevewwds_32_tfpmtxt_sel ,
                                          String AV105Tmprevewwds_31_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          String AV75Tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PMMaqCod AS PMMaqCod, T1.EmprCod, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt," ;
      scmdbuf += " T1.PMIni, T1.PMFchCre, T2.MaqDsc AS PMMaqDsc, T1.PMDsc, T1.PMCod, T1.PMEst FROM (TXPMPREVE T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.PMMaqCod)" ;
      if ( ! (0==AV76Tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV84Tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV92Tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV93Tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV94Tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Tmprevewwds_25_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV100Tmprevewwds_26_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tmprevewwds_27_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tmprevewwds_28_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV103Tmprevewwds_29_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV105Tmprevewwds_31_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PMMaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08JS5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV84Tmprevewwds_10_tfpmest_sels ,
                                          int AV76Tmprevewwds_2_tfpmcod ,
                                          int AV77Tmprevewwds_3_tfpmcod_to ,
                                          String AV79Tmprevewwds_5_tfpmdsc_sel ,
                                          String AV78Tmprevewwds_4_tfpmdsc ,
                                          String AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV80Tmprevewwds_6_tfpmmaqcod ,
                                          String AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV82Tmprevewwds_8_tfpmmaqdsc ,
                                          int AV84Tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV85Tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV86Tmprevewwds_12_tfpmini ,
                                          java.util.Date AV87Tmprevewwds_13_tfpmult ,
                                          java.util.Date AV88Tmprevewwds_14_tfpmfin ,
                                          String AV90Tmprevewwds_16_tfpmusucre_sel ,
                                          String AV89Tmprevewwds_15_tfpmusucre ,
                                          short AV91Tmprevewwds_17_tfpmdias ,
                                          short AV92Tmprevewwds_18_tfpmdias_to ,
                                          short AV93Tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV94Tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV95Tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV96Tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV97Tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV98Tmprevewwds_24_tfpmusomts_to ,
                                          int AV99Tmprevewwds_25_tfpmord ,
                                          int AV100Tmprevewwds_26_tfpmord_to ,
                                          java.math.BigDecimal AV101Tmprevewwds_27_tfpmtie ,
                                          java.math.BigDecimal AV102Tmprevewwds_28_tfpmtie_to ,
                                          String AV104Tmprevewwds_30_tfpmpla_sel ,
                                          String AV103Tmprevewwds_29_tfpmpla ,
                                          String AV106Tmprevewwds_32_tfpmtxt_sel ,
                                          String AV105Tmprevewwds_31_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          String AV75Tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[30];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PMUsuCre, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMFin, T1.PMUlt, T1.PMIni, T1.PMFchCre," ;
      scmdbuf += " T2.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T1.PMEst FROM (TXPMPREVE T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod" ;
      scmdbuf += " = T1.PMMaqCod)" ;
      if ( ! (0==AV76Tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( AV84Tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV92Tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV93Tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV94Tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Tmprevewwds_25_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV100Tmprevewwds_26_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tmprevewwds_27_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tmprevewwds_28_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV103Tmprevewwds_29_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV105Tmprevewwds_31_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PMUsuCre" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08JS6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV84Tmprevewwds_10_tfpmest_sels ,
                                          int AV76Tmprevewwds_2_tfpmcod ,
                                          int AV77Tmprevewwds_3_tfpmcod_to ,
                                          String AV79Tmprevewwds_5_tfpmdsc_sel ,
                                          String AV78Tmprevewwds_4_tfpmdsc ,
                                          String AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV80Tmprevewwds_6_tfpmmaqcod ,
                                          String AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV82Tmprevewwds_8_tfpmmaqdsc ,
                                          int AV84Tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV85Tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV86Tmprevewwds_12_tfpmini ,
                                          java.util.Date AV87Tmprevewwds_13_tfpmult ,
                                          java.util.Date AV88Tmprevewwds_14_tfpmfin ,
                                          String AV90Tmprevewwds_16_tfpmusucre_sel ,
                                          String AV89Tmprevewwds_15_tfpmusucre ,
                                          short AV91Tmprevewwds_17_tfpmdias ,
                                          short AV92Tmprevewwds_18_tfpmdias_to ,
                                          short AV93Tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV94Tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV95Tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV96Tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV97Tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV98Tmprevewwds_24_tfpmusomts_to ,
                                          int AV99Tmprevewwds_25_tfpmord ,
                                          int AV100Tmprevewwds_26_tfpmord_to ,
                                          java.math.BigDecimal AV101Tmprevewwds_27_tfpmtie ,
                                          java.math.BigDecimal AV102Tmprevewwds_28_tfpmtie_to ,
                                          String AV104Tmprevewwds_30_tfpmpla_sel ,
                                          String AV103Tmprevewwds_29_tfpmpla ,
                                          String AV106Tmprevewwds_32_tfpmtxt_sel ,
                                          String AV105Tmprevewwds_31_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          String AV75Tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[30];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PMPla, T1.PMTxt, T1.PMTie, T1.PMOrd, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt, T1.PMIni, T1.PMFchCre," ;
      scmdbuf += " T2.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T1.PMEst FROM (TXPMPREVE T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod" ;
      scmdbuf += " = T1.PMMaqCod)" ;
      if ( ! (0==AV76Tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( AV84Tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV92Tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV93Tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV94Tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Tmprevewwds_25_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV100Tmprevewwds_26_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tmprevewwds_27_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tmprevewwds_28_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV103Tmprevewwds_29_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV105Tmprevewwds_31_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PMPla" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08JS7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV84Tmprevewwds_10_tfpmest_sels ,
                                          int AV76Tmprevewwds_2_tfpmcod ,
                                          int AV77Tmprevewwds_3_tfpmcod_to ,
                                          String AV79Tmprevewwds_5_tfpmdsc_sel ,
                                          String AV78Tmprevewwds_4_tfpmdsc ,
                                          String AV81Tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV80Tmprevewwds_6_tfpmmaqcod ,
                                          String AV83Tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV82Tmprevewwds_8_tfpmmaqdsc ,
                                          int AV84Tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV85Tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV86Tmprevewwds_12_tfpmini ,
                                          java.util.Date AV87Tmprevewwds_13_tfpmult ,
                                          java.util.Date AV88Tmprevewwds_14_tfpmfin ,
                                          String AV90Tmprevewwds_16_tfpmusucre_sel ,
                                          String AV89Tmprevewwds_15_tfpmusucre ,
                                          short AV91Tmprevewwds_17_tfpmdias ,
                                          short AV92Tmprevewwds_18_tfpmdias_to ,
                                          short AV93Tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV94Tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV95Tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV96Tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV97Tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV98Tmprevewwds_24_tfpmusomts_to ,
                                          int AV99Tmprevewwds_25_tfpmord ,
                                          int AV100Tmprevewwds_26_tfpmord_to ,
                                          java.math.BigDecimal AV101Tmprevewwds_27_tfpmtie ,
                                          java.math.BigDecimal AV102Tmprevewwds_28_tfpmtie_to ,
                                          String AV104Tmprevewwds_30_tfpmpla_sel ,
                                          String AV103Tmprevewwds_29_tfpmpla ,
                                          String AV106Tmprevewwds_32_tfpmtxt_sel ,
                                          String AV105Tmprevewwds_31_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          String AV75Tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[30];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt, T1.PMIni, T1.PMFchCre," ;
      scmdbuf += " T2.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T1.PMEst FROM (TXPMPREVE T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod" ;
      scmdbuf += " = T1.PMMaqCod)" ;
      if ( ! (0==AV76Tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( AV84Tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV92Tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV93Tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV94Tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Tmprevewwds_25_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV100Tmprevewwds_26_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tmprevewwds_27_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tmprevewwds_28_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV103Tmprevewwds_29_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tmprevewwds_30_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV105Tmprevewwds_31_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tmprevewwds_32_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PMTxt" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P08JS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 1 :
                  return conditional_P08JS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 2 :
                  return conditional_P08JS4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 3 :
                  return conditional_P08JS5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 4 :
                  return conditional_P08JS6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 5 :
                  return conditional_P08JS7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JS4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JS5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JS6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JS7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 2000);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 2000);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 2000);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 2000);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 2000);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 2000);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 2000);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 2000);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 2000);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 2000);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 2000);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 2000);
               }
               return;
      }
   }

}

