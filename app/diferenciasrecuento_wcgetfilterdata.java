package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class diferenciasrecuento_wcgetfilterdata extends GXProcedure
{
   public diferenciasrecuento_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( diferenciasrecuento_wcgetfilterdata.class ), "" );
   }

   public diferenciasrecuento_wcgetfilterdata( int remoteHandle ,
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
      diferenciasrecuento_wcgetfilterdata.this.aP5 = new String[] {""};
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
      diferenciasrecuento_wcgetfilterdata.this.AV42DDOName = aP0;
      diferenciasrecuento_wcgetfilterdata.this.AV40SearchTxt = aP1;
      diferenciasrecuento_wcgetfilterdata.this.AV41SearchTxtTo = aP2;
      diferenciasrecuento_wcgetfilterdata.this.aP3 = aP3;
      diferenciasrecuento_wcgetfilterdata.this.aP4 = aP4;
      diferenciasrecuento_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_RECUBIC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECUBICOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_RECLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLOTOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV46OptionsJson = AV45Options.toJSonString(false) ;
      AV49OptionsDescJson = AV48OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV50OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV53Session.getValue("DiferenciasRecuento_WCGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DiferenciasRecuento_WCGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("DiferenciasRecuento_WCGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV62FilterFullText = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV14TFRecFec = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV15TFRecFec_To = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV16TFRecExiTeo = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFRecExiTeo_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV18TFRecExiRea = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFRecExiRea_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV20TFRecExiTcc = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFRecExiTcc_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIRCC") == 0 )
         {
            AV22TFRecExiRcc = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFRecExiRcc_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV24TFRecPreRec = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFRecPreRec_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITAC") == 0 )
         {
            AV26TFRecExiTAc = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFRecExiTAc_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIRAC") == 0 )
         {
            AV28TFRecExiRAc = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFRecExiRAc_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC") == 0 )
         {
            AV30TFRecUbic = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC_SEL") == 0 )
         {
            AV31TFRecUbic_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECMEMCANT") == 0 )
         {
            AV32TFRecMemCant = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFRecMemCant_To = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT") == 0 )
         {
            AV34TFRecLot = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT_SEL") == 0 )
         {
            AV35TFRecLot_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECESTINV") == 0 )
         {
            AV36TFRecEstInv = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFRecEstInv_To = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV38TFRechora = localUtil.ctot( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV39TFRechora_To = localUtil.ctot( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV40SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV67Core_diferenciasrecuento_wcds_1_filterfulltext = AV62FilterFullText ;
      AV68Core_diferenciasrecuento_wcds_2_tfemprcod = AV10TFEmprCod ;
      AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV70Core_diferenciasrecuento_wcds_4_tfprdnum = AV12TFPrdNum ;
      AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV72Core_diferenciasrecuento_wcds_6_tfrecfec = AV14TFRecFec ;
      AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to = AV15TFRecFec_To ;
      AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo = AV16TFRecExiTeo ;
      AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to = AV17TFRecExiTeo_To ;
      AV76Core_diferenciasrecuento_wcds_10_tfrecexirea = AV18TFRecExiRea ;
      AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to = AV19TFRecExiRea_To ;
      AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc = AV20TFRecExiTcc ;
      AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to = AV21TFRecExiTcc_To ;
      AV80Core_diferenciasrecuento_wcds_14_tfrecexircc = AV22TFRecExiRcc ;
      AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to = AV23TFRecExiRcc_To ;
      AV82Core_diferenciasrecuento_wcds_16_tfrecprerec = AV24TFRecPreRec ;
      AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to = AV25TFRecPreRec_To ;
      AV84Core_diferenciasrecuento_wcds_18_tfrecexitac = AV26TFRecExiTAc ;
      AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to = AV27TFRecExiTAc_To ;
      AV86Core_diferenciasrecuento_wcds_20_tfrecexirac = AV28TFRecExiRAc ;
      AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to = AV29TFRecExiRAc_To ;
      AV88Core_diferenciasrecuento_wcds_22_tfrecubic = AV30TFRecUbic ;
      AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel = AV31TFRecUbic_Sel ;
      AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant = AV32TFRecMemCant ;
      AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to = AV33TFRecMemCant_To ;
      AV92Core_diferenciasrecuento_wcds_26_tfreclot = AV34TFRecLot ;
      AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel = AV35TFRecLot_Sel ;
      AV94Core_diferenciasrecuento_wcds_28_tfrecestinv = AV36TFRecEstInv ;
      AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to = AV37TFRecEstInv_To ;
      AV96Core_diferenciasrecuento_wcds_30_tfrechora = AV38TFRechora ;
      AV97Core_diferenciasrecuento_wcds_31_tfrechora_to = AV39TFRechora_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                           AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                           AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                           AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                           AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                           AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                           AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                           AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                           AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                           AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                           AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                           AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                           AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                           AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                           AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                           AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                           AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                           AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                           Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) ,
                                           Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) ,
                                           AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                           AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                           Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) ,
                                           Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) ,
                                           AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                           AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                           AV61EmprCod ,
                                           AV58PrdNumFrom ,
                                           AV59PrdNumTo ,
                                           AV60RecFec ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A808RecExiTcc ,
                                           A806RecExiRcc ,
                                           A6573RecPreRec ,
                                           A8668RecExiTAc ,
                                           A8669RecExiRAc ,
                                           A11195RecUbic ,
                                           Byte.valueOf(A11624RecMemCant) ,
                                           A12285RecLot ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           A810RecFec ,
                                           A13455Rechora } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Core_diferenciasrecuento_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV68Core_diferenciasrecuento_wcds_2_tfemprcod), 3, "%") ;
      lV70Core_diferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Core_diferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV88Core_diferenciasrecuento_wcds_22_tfrecubic = GXutil.padr( GXutil.rtrim( AV88Core_diferenciasrecuento_wcds_22_tfrecubic), 20, "%") ;
      lV92Core_diferenciasrecuento_wcds_26_tfreclot = GXutil.padr( GXutil.rtrim( AV92Core_diferenciasrecuento_wcds_26_tfreclot), 26, "%") ;
      /* Using cursor P09IS2 */
      pr_default.execute(0, new Object[] {lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV68Core_diferenciasrecuento_wcds_2_tfemprcod, AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel, lV70Core_diferenciasrecuento_wcds_4_tfprdnum, AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel, AV72Core_diferenciasrecuento_wcds_6_tfrecfec, AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to, lV88Core_diferenciasrecuento_wcds_22_tfrecubic, AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel, Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant), Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to), lV92Core_diferenciasrecuento_wcds_26_tfreclot, AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel, Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv), Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to), AV96Core_diferenciasrecuento_wcds_30_tfrechora, AV97Core_diferenciasrecuento_wcds_31_tfrechora_to, AV61EmprCod, AV58PrdNumFrom, AV59PrdNumTo, AV60RecFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9IS2 = false ;
         A396EmprCod = P09IS2_A396EmprCod[0] ;
         A13455Rechora = P09IS2_A13455Rechora[0] ;
         A13416RecEstInv = P09IS2_A13416RecEstInv[0] ;
         A12285RecLot = P09IS2_A12285RecLot[0] ;
         A11624RecMemCant = P09IS2_A11624RecMemCant[0] ;
         A11195RecUbic = P09IS2_A11195RecUbic[0] ;
         A8669RecExiRAc = P09IS2_A8669RecExiRAc[0] ;
         A8668RecExiTAc = P09IS2_A8668RecExiTAc[0] ;
         A6573RecPreRec = P09IS2_A6573RecPreRec[0] ;
         A806RecExiRcc = P09IS2_A806RecExiRcc[0] ;
         A808RecExiTcc = P09IS2_A808RecExiTcc[0] ;
         A807RecExiRea = P09IS2_A807RecExiRea[0] ;
         A809RecExiTeo = P09IS2_A809RecExiTeo[0] ;
         A810RecFec = P09IS2_A810RecFec[0] ;
         A719PrdNum = P09IS2_A719PrdNum[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09IS2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk9IS2 = false ;
            A810RecFec = P09IS2_A810RecFec[0] ;
            A719PrdNum = P09IS2_A719PrdNum[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9IS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV44Option = A396EmprCod ;
            AV47OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV45Options.add(AV44Option, 0);
            AV48OptionsDesc.add(AV47OptionDesc, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IS2 )
         {
            brk9IS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV40SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV67Core_diferenciasrecuento_wcds_1_filterfulltext = AV62FilterFullText ;
      AV68Core_diferenciasrecuento_wcds_2_tfemprcod = AV10TFEmprCod ;
      AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV70Core_diferenciasrecuento_wcds_4_tfprdnum = AV12TFPrdNum ;
      AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV72Core_diferenciasrecuento_wcds_6_tfrecfec = AV14TFRecFec ;
      AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to = AV15TFRecFec_To ;
      AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo = AV16TFRecExiTeo ;
      AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to = AV17TFRecExiTeo_To ;
      AV76Core_diferenciasrecuento_wcds_10_tfrecexirea = AV18TFRecExiRea ;
      AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to = AV19TFRecExiRea_To ;
      AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc = AV20TFRecExiTcc ;
      AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to = AV21TFRecExiTcc_To ;
      AV80Core_diferenciasrecuento_wcds_14_tfrecexircc = AV22TFRecExiRcc ;
      AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to = AV23TFRecExiRcc_To ;
      AV82Core_diferenciasrecuento_wcds_16_tfrecprerec = AV24TFRecPreRec ;
      AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to = AV25TFRecPreRec_To ;
      AV84Core_diferenciasrecuento_wcds_18_tfrecexitac = AV26TFRecExiTAc ;
      AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to = AV27TFRecExiTAc_To ;
      AV86Core_diferenciasrecuento_wcds_20_tfrecexirac = AV28TFRecExiRAc ;
      AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to = AV29TFRecExiRAc_To ;
      AV88Core_diferenciasrecuento_wcds_22_tfrecubic = AV30TFRecUbic ;
      AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel = AV31TFRecUbic_Sel ;
      AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant = AV32TFRecMemCant ;
      AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to = AV33TFRecMemCant_To ;
      AV92Core_diferenciasrecuento_wcds_26_tfreclot = AV34TFRecLot ;
      AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel = AV35TFRecLot_Sel ;
      AV94Core_diferenciasrecuento_wcds_28_tfrecestinv = AV36TFRecEstInv ;
      AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to = AV37TFRecEstInv_To ;
      AV96Core_diferenciasrecuento_wcds_30_tfrechora = AV38TFRechora ;
      AV97Core_diferenciasrecuento_wcds_31_tfrechora_to = AV39TFRechora_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                           AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                           AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                           AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                           AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                           AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                           AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                           AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                           AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                           AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                           AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                           AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                           AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                           AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                           AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                           AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                           AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                           AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                           Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) ,
                                           Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) ,
                                           AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                           AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                           Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) ,
                                           Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) ,
                                           AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                           AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                           AV61EmprCod ,
                                           AV58PrdNumFrom ,
                                           AV59PrdNumTo ,
                                           AV60RecFec ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A808RecExiTcc ,
                                           A806RecExiRcc ,
                                           A6573RecPreRec ,
                                           A8668RecExiTAc ,
                                           A8669RecExiRAc ,
                                           A11195RecUbic ,
                                           Byte.valueOf(A11624RecMemCant) ,
                                           A12285RecLot ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           A810RecFec ,
                                           A13455Rechora } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Core_diferenciasrecuento_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV68Core_diferenciasrecuento_wcds_2_tfemprcod), 3, "%") ;
      lV70Core_diferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Core_diferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV88Core_diferenciasrecuento_wcds_22_tfrecubic = GXutil.padr( GXutil.rtrim( AV88Core_diferenciasrecuento_wcds_22_tfrecubic), 20, "%") ;
      lV92Core_diferenciasrecuento_wcds_26_tfreclot = GXutil.padr( GXutil.rtrim( AV92Core_diferenciasrecuento_wcds_26_tfreclot), 26, "%") ;
      /* Using cursor P09IS3 */
      pr_default.execute(1, new Object[] {lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV68Core_diferenciasrecuento_wcds_2_tfemprcod, AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel, lV70Core_diferenciasrecuento_wcds_4_tfprdnum, AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel, AV72Core_diferenciasrecuento_wcds_6_tfrecfec, AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to, lV88Core_diferenciasrecuento_wcds_22_tfrecubic, AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel, Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant), Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to), lV92Core_diferenciasrecuento_wcds_26_tfreclot, AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel, Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv), Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to), AV96Core_diferenciasrecuento_wcds_30_tfrechora, AV97Core_diferenciasrecuento_wcds_31_tfrechora_to, AV61EmprCod, AV58PrdNumFrom, AV59PrdNumTo, AV60RecFec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9IS4 = false ;
         A719PrdNum = P09IS3_A719PrdNum[0] ;
         A13455Rechora = P09IS3_A13455Rechora[0] ;
         A13416RecEstInv = P09IS3_A13416RecEstInv[0] ;
         A12285RecLot = P09IS3_A12285RecLot[0] ;
         A11624RecMemCant = P09IS3_A11624RecMemCant[0] ;
         A11195RecUbic = P09IS3_A11195RecUbic[0] ;
         A8669RecExiRAc = P09IS3_A8669RecExiRAc[0] ;
         A8668RecExiTAc = P09IS3_A8668RecExiTAc[0] ;
         A6573RecPreRec = P09IS3_A6573RecPreRec[0] ;
         A806RecExiRcc = P09IS3_A806RecExiRcc[0] ;
         A808RecExiTcc = P09IS3_A808RecExiTcc[0] ;
         A807RecExiRea = P09IS3_A807RecExiRea[0] ;
         A809RecExiTeo = P09IS3_A809RecExiTeo[0] ;
         A810RecFec = P09IS3_A810RecFec[0] ;
         A396EmprCod = P09IS3_A396EmprCod[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09IS3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9IS4 = false ;
            A810RecFec = P09IS3_A810RecFec[0] ;
            A396EmprCod = P09IS3_A396EmprCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9IS4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV44Option = A719PrdNum ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IS4 )
         {
            brk9IS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECUBICOPTIONS' Routine */
      returnInSub = false ;
      AV30TFRecUbic = AV40SearchTxt ;
      AV31TFRecUbic_Sel = "" ;
      AV67Core_diferenciasrecuento_wcds_1_filterfulltext = AV62FilterFullText ;
      AV68Core_diferenciasrecuento_wcds_2_tfemprcod = AV10TFEmprCod ;
      AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV70Core_diferenciasrecuento_wcds_4_tfprdnum = AV12TFPrdNum ;
      AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV72Core_diferenciasrecuento_wcds_6_tfrecfec = AV14TFRecFec ;
      AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to = AV15TFRecFec_To ;
      AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo = AV16TFRecExiTeo ;
      AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to = AV17TFRecExiTeo_To ;
      AV76Core_diferenciasrecuento_wcds_10_tfrecexirea = AV18TFRecExiRea ;
      AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to = AV19TFRecExiRea_To ;
      AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc = AV20TFRecExiTcc ;
      AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to = AV21TFRecExiTcc_To ;
      AV80Core_diferenciasrecuento_wcds_14_tfrecexircc = AV22TFRecExiRcc ;
      AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to = AV23TFRecExiRcc_To ;
      AV82Core_diferenciasrecuento_wcds_16_tfrecprerec = AV24TFRecPreRec ;
      AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to = AV25TFRecPreRec_To ;
      AV84Core_diferenciasrecuento_wcds_18_tfrecexitac = AV26TFRecExiTAc ;
      AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to = AV27TFRecExiTAc_To ;
      AV86Core_diferenciasrecuento_wcds_20_tfrecexirac = AV28TFRecExiRAc ;
      AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to = AV29TFRecExiRAc_To ;
      AV88Core_diferenciasrecuento_wcds_22_tfrecubic = AV30TFRecUbic ;
      AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel = AV31TFRecUbic_Sel ;
      AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant = AV32TFRecMemCant ;
      AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to = AV33TFRecMemCant_To ;
      AV92Core_diferenciasrecuento_wcds_26_tfreclot = AV34TFRecLot ;
      AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel = AV35TFRecLot_Sel ;
      AV94Core_diferenciasrecuento_wcds_28_tfrecestinv = AV36TFRecEstInv ;
      AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to = AV37TFRecEstInv_To ;
      AV96Core_diferenciasrecuento_wcds_30_tfrechora = AV38TFRechora ;
      AV97Core_diferenciasrecuento_wcds_31_tfrechora_to = AV39TFRechora_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                           AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                           AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                           AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                           AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                           AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                           AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                           AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                           AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                           AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                           AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                           AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                           AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                           AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                           AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                           AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                           AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                           AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                           Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) ,
                                           Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) ,
                                           AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                           AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                           Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) ,
                                           Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) ,
                                           AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                           AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                           AV61EmprCod ,
                                           AV58PrdNumFrom ,
                                           AV59PrdNumTo ,
                                           AV60RecFec ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A808RecExiTcc ,
                                           A806RecExiRcc ,
                                           A6573RecPreRec ,
                                           A8668RecExiTAc ,
                                           A8669RecExiRAc ,
                                           A11195RecUbic ,
                                           Byte.valueOf(A11624RecMemCant) ,
                                           A12285RecLot ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           A810RecFec ,
                                           A13455Rechora } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Core_diferenciasrecuento_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV68Core_diferenciasrecuento_wcds_2_tfemprcod), 3, "%") ;
      lV70Core_diferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Core_diferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV88Core_diferenciasrecuento_wcds_22_tfrecubic = GXutil.padr( GXutil.rtrim( AV88Core_diferenciasrecuento_wcds_22_tfrecubic), 20, "%") ;
      lV92Core_diferenciasrecuento_wcds_26_tfreclot = GXutil.padr( GXutil.rtrim( AV92Core_diferenciasrecuento_wcds_26_tfreclot), 26, "%") ;
      /* Using cursor P09IS4 */
      pr_default.execute(2, new Object[] {lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV68Core_diferenciasrecuento_wcds_2_tfemprcod, AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel, lV70Core_diferenciasrecuento_wcds_4_tfprdnum, AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel, AV72Core_diferenciasrecuento_wcds_6_tfrecfec, AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to, lV88Core_diferenciasrecuento_wcds_22_tfrecubic, AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel, Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant), Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to), lV92Core_diferenciasrecuento_wcds_26_tfreclot, AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel, Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv), Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to), AV96Core_diferenciasrecuento_wcds_30_tfrechora, AV97Core_diferenciasrecuento_wcds_31_tfrechora_to, AV61EmprCod, AV58PrdNumFrom, AV59PrdNumTo, AV60RecFec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9IS6 = false ;
         A11195RecUbic = P09IS4_A11195RecUbic[0] ;
         A13455Rechora = P09IS4_A13455Rechora[0] ;
         A13416RecEstInv = P09IS4_A13416RecEstInv[0] ;
         A12285RecLot = P09IS4_A12285RecLot[0] ;
         A11624RecMemCant = P09IS4_A11624RecMemCant[0] ;
         A8669RecExiRAc = P09IS4_A8669RecExiRAc[0] ;
         A8668RecExiTAc = P09IS4_A8668RecExiTAc[0] ;
         A6573RecPreRec = P09IS4_A6573RecPreRec[0] ;
         A806RecExiRcc = P09IS4_A806RecExiRcc[0] ;
         A808RecExiTcc = P09IS4_A808RecExiTcc[0] ;
         A807RecExiRea = P09IS4_A807RecExiRea[0] ;
         A809RecExiTeo = P09IS4_A809RecExiTeo[0] ;
         A810RecFec = P09IS4_A810RecFec[0] ;
         A719PrdNum = P09IS4_A719PrdNum[0] ;
         A396EmprCod = P09IS4_A396EmprCod[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09IS4_A11195RecUbic[0], A11195RecUbic) == 0 ) )
         {
            brk9IS6 = false ;
            A810RecFec = P09IS4_A810RecFec[0] ;
            A719PrdNum = P09IS4_A719PrdNum[0] ;
            A396EmprCod = P09IS4_A396EmprCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9IS6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11195RecUbic)==0) )
         {
            AV44Option = A11195RecUbic ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IS6 )
         {
            brk9IS6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECLOTOPTIONS' Routine */
      returnInSub = false ;
      AV34TFRecLot = AV40SearchTxt ;
      AV35TFRecLot_Sel = "" ;
      AV67Core_diferenciasrecuento_wcds_1_filterfulltext = AV62FilterFullText ;
      AV68Core_diferenciasrecuento_wcds_2_tfemprcod = AV10TFEmprCod ;
      AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV70Core_diferenciasrecuento_wcds_4_tfprdnum = AV12TFPrdNum ;
      AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV72Core_diferenciasrecuento_wcds_6_tfrecfec = AV14TFRecFec ;
      AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to = AV15TFRecFec_To ;
      AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo = AV16TFRecExiTeo ;
      AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to = AV17TFRecExiTeo_To ;
      AV76Core_diferenciasrecuento_wcds_10_tfrecexirea = AV18TFRecExiRea ;
      AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to = AV19TFRecExiRea_To ;
      AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc = AV20TFRecExiTcc ;
      AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to = AV21TFRecExiTcc_To ;
      AV80Core_diferenciasrecuento_wcds_14_tfrecexircc = AV22TFRecExiRcc ;
      AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to = AV23TFRecExiRcc_To ;
      AV82Core_diferenciasrecuento_wcds_16_tfrecprerec = AV24TFRecPreRec ;
      AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to = AV25TFRecPreRec_To ;
      AV84Core_diferenciasrecuento_wcds_18_tfrecexitac = AV26TFRecExiTAc ;
      AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to = AV27TFRecExiTAc_To ;
      AV86Core_diferenciasrecuento_wcds_20_tfrecexirac = AV28TFRecExiRAc ;
      AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to = AV29TFRecExiRAc_To ;
      AV88Core_diferenciasrecuento_wcds_22_tfrecubic = AV30TFRecUbic ;
      AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel = AV31TFRecUbic_Sel ;
      AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant = AV32TFRecMemCant ;
      AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to = AV33TFRecMemCant_To ;
      AV92Core_diferenciasrecuento_wcds_26_tfreclot = AV34TFRecLot ;
      AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel = AV35TFRecLot_Sel ;
      AV94Core_diferenciasrecuento_wcds_28_tfrecestinv = AV36TFRecEstInv ;
      AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to = AV37TFRecEstInv_To ;
      AV96Core_diferenciasrecuento_wcds_30_tfrechora = AV38TFRechora ;
      AV97Core_diferenciasrecuento_wcds_31_tfrechora_to = AV39TFRechora_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                           AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                           AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                           AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                           AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                           AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                           AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                           AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                           AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                           AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                           AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                           AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                           AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                           AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                           AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                           AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                           AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                           AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                           Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) ,
                                           Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) ,
                                           AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                           AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                           Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) ,
                                           Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) ,
                                           AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                           AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                           AV61EmprCod ,
                                           AV58PrdNumFrom ,
                                           AV59PrdNumTo ,
                                           AV60RecFec ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A808RecExiTcc ,
                                           A806RecExiRcc ,
                                           A6573RecPreRec ,
                                           A8668RecExiTAc ,
                                           A8669RecExiRAc ,
                                           A11195RecUbic ,
                                           Byte.valueOf(A11624RecMemCant) ,
                                           A12285RecLot ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           A810RecFec ,
                                           A13455Rechora } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Core_diferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Core_diferenciasrecuento_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV68Core_diferenciasrecuento_wcds_2_tfemprcod), 3, "%") ;
      lV70Core_diferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Core_diferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV88Core_diferenciasrecuento_wcds_22_tfrecubic = GXutil.padr( GXutil.rtrim( AV88Core_diferenciasrecuento_wcds_22_tfrecubic), 20, "%") ;
      lV92Core_diferenciasrecuento_wcds_26_tfreclot = GXutil.padr( GXutil.rtrim( AV92Core_diferenciasrecuento_wcds_26_tfreclot), 26, "%") ;
      /* Using cursor P09IS5 */
      pr_default.execute(3, new Object[] {lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV67Core_diferenciasrecuento_wcds_1_filterfulltext, lV68Core_diferenciasrecuento_wcds_2_tfemprcod, AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel, lV70Core_diferenciasrecuento_wcds_4_tfprdnum, AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel, AV72Core_diferenciasrecuento_wcds_6_tfrecfec, AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to, lV88Core_diferenciasrecuento_wcds_22_tfrecubic, AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel, Byte.valueOf(AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant), Byte.valueOf(AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to), lV92Core_diferenciasrecuento_wcds_26_tfreclot, AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel, Byte.valueOf(AV94Core_diferenciasrecuento_wcds_28_tfrecestinv), Byte.valueOf(AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to), AV96Core_diferenciasrecuento_wcds_30_tfrechora, AV97Core_diferenciasrecuento_wcds_31_tfrechora_to, AV61EmprCod, AV58PrdNumFrom, AV59PrdNumTo, AV60RecFec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9IS8 = false ;
         A12285RecLot = P09IS5_A12285RecLot[0] ;
         A13455Rechora = P09IS5_A13455Rechora[0] ;
         A13416RecEstInv = P09IS5_A13416RecEstInv[0] ;
         A11624RecMemCant = P09IS5_A11624RecMemCant[0] ;
         A11195RecUbic = P09IS5_A11195RecUbic[0] ;
         A8669RecExiRAc = P09IS5_A8669RecExiRAc[0] ;
         A8668RecExiTAc = P09IS5_A8668RecExiTAc[0] ;
         A6573RecPreRec = P09IS5_A6573RecPreRec[0] ;
         A806RecExiRcc = P09IS5_A806RecExiRcc[0] ;
         A808RecExiTcc = P09IS5_A808RecExiTcc[0] ;
         A807RecExiRea = P09IS5_A807RecExiRea[0] ;
         A809RecExiTeo = P09IS5_A809RecExiTeo[0] ;
         A810RecFec = P09IS5_A810RecFec[0] ;
         A719PrdNum = P09IS5_A719PrdNum[0] ;
         A396EmprCod = P09IS5_A396EmprCod[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09IS5_A12285RecLot[0], A12285RecLot) == 0 ) )
         {
            brk9IS8 = false ;
            A810RecFec = P09IS5_A810RecFec[0] ;
            A719PrdNum = P09IS5_A719PrdNum[0] ;
            A396EmprCod = P09IS5_A396EmprCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9IS8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A12285RecLot)==0) )
         {
            AV44Option = A12285RecLot ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IS8 )
         {
            brk9IS8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = diferenciasrecuento_wcgetfilterdata.this.AV46OptionsJson;
      this.aP4[0] = diferenciasrecuento_wcgetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = diferenciasrecuento_wcgetfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV46OptionsJson = "" ;
      AV49OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53Session = httpContext.getWebSession();
      AV55GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV56GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFRecFec = GXutil.nullDate() ;
      AV15TFRecFec_To = GXutil.nullDate() ;
      AV16TFRecExiTeo = DecimalUtil.ZERO ;
      AV17TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV18TFRecExiRea = DecimalUtil.ZERO ;
      AV19TFRecExiRea_To = DecimalUtil.ZERO ;
      AV20TFRecExiTcc = DecimalUtil.ZERO ;
      AV21TFRecExiTcc_To = DecimalUtil.ZERO ;
      AV22TFRecExiRcc = DecimalUtil.ZERO ;
      AV23TFRecExiRcc_To = DecimalUtil.ZERO ;
      AV24TFRecPreRec = DecimalUtil.ZERO ;
      AV25TFRecPreRec_To = DecimalUtil.ZERO ;
      AV26TFRecExiTAc = DecimalUtil.ZERO ;
      AV27TFRecExiTAc_To = DecimalUtil.ZERO ;
      AV28TFRecExiRAc = DecimalUtil.ZERO ;
      AV29TFRecExiRAc_To = DecimalUtil.ZERO ;
      AV30TFRecUbic = "" ;
      AV31TFRecUbic_Sel = "" ;
      AV34TFRecLot = "" ;
      AV35TFRecLot_Sel = "" ;
      AV38TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV39TFRechora_To = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      AV67Core_diferenciasrecuento_wcds_1_filterfulltext = "" ;
      AV68Core_diferenciasrecuento_wcds_2_tfemprcod = "" ;
      AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel = "" ;
      AV70Core_diferenciasrecuento_wcds_4_tfprdnum = "" ;
      AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel = "" ;
      AV72Core_diferenciasrecuento_wcds_6_tfrecfec = GXutil.nullDate() ;
      AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to = GXutil.nullDate() ;
      AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV76Core_diferenciasrecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc = DecimalUtil.ZERO ;
      AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to = DecimalUtil.ZERO ;
      AV80Core_diferenciasrecuento_wcds_14_tfrecexircc = DecimalUtil.ZERO ;
      AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to = DecimalUtil.ZERO ;
      AV82Core_diferenciasrecuento_wcds_16_tfrecprerec = DecimalUtil.ZERO ;
      AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to = DecimalUtil.ZERO ;
      AV84Core_diferenciasrecuento_wcds_18_tfrecexitac = DecimalUtil.ZERO ;
      AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to = DecimalUtil.ZERO ;
      AV86Core_diferenciasrecuento_wcds_20_tfrecexirac = DecimalUtil.ZERO ;
      AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to = DecimalUtil.ZERO ;
      AV88Core_diferenciasrecuento_wcds_22_tfrecubic = "" ;
      AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel = "" ;
      AV92Core_diferenciasrecuento_wcds_26_tfreclot = "" ;
      AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel = "" ;
      AV96Core_diferenciasrecuento_wcds_30_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV97Core_diferenciasrecuento_wcds_31_tfrechora_to = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV67Core_diferenciasrecuento_wcds_1_filterfulltext = "" ;
      lV68Core_diferenciasrecuento_wcds_2_tfemprcod = "" ;
      lV70Core_diferenciasrecuento_wcds_4_tfprdnum = "" ;
      lV88Core_diferenciasrecuento_wcds_22_tfrecubic = "" ;
      lV92Core_diferenciasrecuento_wcds_26_tfreclot = "" ;
      AV61EmprCod = "" ;
      AV58PrdNumFrom = "" ;
      AV59PrdNumTo = "" ;
      AV60RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A8668RecExiTAc = DecimalUtil.ZERO ;
      A8669RecExiRAc = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A12285RecLot = "" ;
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      P09IS2_A396EmprCod = new String[] {""} ;
      P09IS2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS2_A13416RecEstInv = new byte[1] ;
      P09IS2_A12285RecLot = new String[] {""} ;
      P09IS2_A11624RecMemCant = new byte[1] ;
      P09IS2_A11195RecUbic = new String[] {""} ;
      P09IS2_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS2_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS2_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS2_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS2_A719PrdNum = new String[] {""} ;
      AV44Option = "" ;
      AV47OptionDesc = "" ;
      P09IS3_A719PrdNum = new String[] {""} ;
      P09IS3_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS3_A13416RecEstInv = new byte[1] ;
      P09IS3_A12285RecLot = new String[] {""} ;
      P09IS3_A11624RecMemCant = new byte[1] ;
      P09IS3_A11195RecUbic = new String[] {""} ;
      P09IS3_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS3_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS3_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS3_A396EmprCod = new String[] {""} ;
      P09IS4_A11195RecUbic = new String[] {""} ;
      P09IS4_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS4_A13416RecEstInv = new byte[1] ;
      P09IS4_A12285RecLot = new String[] {""} ;
      P09IS4_A11624RecMemCant = new byte[1] ;
      P09IS4_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS4_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS4_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS4_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS4_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS4_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS4_A719PrdNum = new String[] {""} ;
      P09IS4_A396EmprCod = new String[] {""} ;
      P09IS5_A12285RecLot = new String[] {""} ;
      P09IS5_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS5_A13416RecEstInv = new byte[1] ;
      P09IS5_A11624RecMemCant = new byte[1] ;
      P09IS5_A11195RecUbic = new String[] {""} ;
      P09IS5_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS5_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS5_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS5_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS5_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS5_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS5_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IS5_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IS5_A719PrdNum = new String[] {""} ;
      P09IS5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.diferenciasrecuento_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09IS2_A396EmprCod, P09IS2_A13455Rechora, P09IS2_A13416RecEstInv, P09IS2_A12285RecLot, P09IS2_A11624RecMemCant, P09IS2_A11195RecUbic, P09IS2_A8669RecExiRAc, P09IS2_A8668RecExiTAc, P09IS2_A6573RecPreRec, P09IS2_A806RecExiRcc,
            P09IS2_A808RecExiTcc, P09IS2_A807RecExiRea, P09IS2_A809RecExiTeo, P09IS2_A810RecFec, P09IS2_A719PrdNum
            }
            , new Object[] {
            P09IS3_A719PrdNum, P09IS3_A13455Rechora, P09IS3_A13416RecEstInv, P09IS3_A12285RecLot, P09IS3_A11624RecMemCant, P09IS3_A11195RecUbic, P09IS3_A8669RecExiRAc, P09IS3_A8668RecExiTAc, P09IS3_A6573RecPreRec, P09IS3_A806RecExiRcc,
            P09IS3_A808RecExiTcc, P09IS3_A807RecExiRea, P09IS3_A809RecExiTeo, P09IS3_A810RecFec, P09IS3_A396EmprCod
            }
            , new Object[] {
            P09IS4_A11195RecUbic, P09IS4_A13455Rechora, P09IS4_A13416RecEstInv, P09IS4_A12285RecLot, P09IS4_A11624RecMemCant, P09IS4_A8669RecExiRAc, P09IS4_A8668RecExiTAc, P09IS4_A6573RecPreRec, P09IS4_A806RecExiRcc, P09IS4_A808RecExiTcc,
            P09IS4_A807RecExiRea, P09IS4_A809RecExiTeo, P09IS4_A810RecFec, P09IS4_A719PrdNum, P09IS4_A396EmprCod
            }
            , new Object[] {
            P09IS5_A12285RecLot, P09IS5_A13455Rechora, P09IS5_A13416RecEstInv, P09IS5_A11624RecMemCant, P09IS5_A11195RecUbic, P09IS5_A8669RecExiRAc, P09IS5_A8668RecExiTAc, P09IS5_A6573RecPreRec, P09IS5_A806RecExiRcc, P09IS5_A808RecExiTcc,
            P09IS5_A807RecExiRea, P09IS5_A809RecExiTeo, P09IS5_A810RecFec, P09IS5_A719PrdNum, P09IS5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32TFRecMemCant ;
   private byte AV33TFRecMemCant_To ;
   private byte AV36TFRecEstInv ;
   private byte AV37TFRecEstInv_To ;
   private byte AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant ;
   private byte AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to ;
   private byte AV94Core_diferenciasrecuento_wcds_28_tfrecestinv ;
   private byte AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to ;
   private byte A11624RecMemCant ;
   private byte A13416RecEstInv ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private long AV52count ;
   private java.math.BigDecimal AV16TFRecExiTeo ;
   private java.math.BigDecimal AV17TFRecExiTeo_To ;
   private java.math.BigDecimal AV18TFRecExiRea ;
   private java.math.BigDecimal AV19TFRecExiRea_To ;
   private java.math.BigDecimal AV20TFRecExiTcc ;
   private java.math.BigDecimal AV21TFRecExiTcc_To ;
   private java.math.BigDecimal AV22TFRecExiRcc ;
   private java.math.BigDecimal AV23TFRecExiRcc_To ;
   private java.math.BigDecimal AV24TFRecPreRec ;
   private java.math.BigDecimal AV25TFRecPreRec_To ;
   private java.math.BigDecimal AV26TFRecExiTAc ;
   private java.math.BigDecimal AV27TFRecExiTAc_To ;
   private java.math.BigDecimal AV28TFRecExiRAc ;
   private java.math.BigDecimal AV29TFRecExiRAc_To ;
   private java.math.BigDecimal AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ;
   private java.math.BigDecimal AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ;
   private java.math.BigDecimal AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ;
   private java.math.BigDecimal AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ;
   private java.math.BigDecimal AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ;
   private java.math.BigDecimal AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ;
   private java.math.BigDecimal AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ;
   private java.math.BigDecimal AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ;
   private java.math.BigDecimal AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ;
   private java.math.BigDecimal AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A8668RecExiTAc ;
   private java.math.BigDecimal A8669RecExiRAc ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV30TFRecUbic ;
   private String AV31TFRecUbic_Sel ;
   private String AV34TFRecLot ;
   private String AV35TFRecLot_Sel ;
   private String A396EmprCod ;
   private String AV68Core_diferenciasrecuento_wcds_2_tfemprcod ;
   private String AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ;
   private String AV70Core_diferenciasrecuento_wcds_4_tfprdnum ;
   private String AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ;
   private String AV88Core_diferenciasrecuento_wcds_22_tfrecubic ;
   private String AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ;
   private String AV92Core_diferenciasrecuento_wcds_26_tfreclot ;
   private String AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ;
   private String scmdbuf ;
   private String lV68Core_diferenciasrecuento_wcds_2_tfemprcod ;
   private String lV70Core_diferenciasrecuento_wcds_4_tfprdnum ;
   private String lV88Core_diferenciasrecuento_wcds_22_tfrecubic ;
   private String lV92Core_diferenciasrecuento_wcds_26_tfreclot ;
   private String AV61EmprCod ;
   private String AV58PrdNumFrom ;
   private String AV59PrdNumTo ;
   private String A719PrdNum ;
   private String A11195RecUbic ;
   private String A12285RecLot ;
   private java.util.Date AV38TFRechora ;
   private java.util.Date AV39TFRechora_To ;
   private java.util.Date AV96Core_diferenciasrecuento_wcds_30_tfrechora ;
   private java.util.Date AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV14TFRecFec ;
   private java.util.Date AV15TFRecFec_To ;
   private java.util.Date AV72Core_diferenciasrecuento_wcds_6_tfrecfec ;
   private java.util.Date AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ;
   private java.util.Date AV60RecFec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean brk9IS2 ;
   private boolean brk9IS4 ;
   private boolean brk9IS6 ;
   private boolean brk9IS8 ;
   private String AV46OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV40SearchTxt ;
   private String AV41SearchTxtTo ;
   private String AV62FilterFullText ;
   private String AV67Core_diferenciasrecuento_wcds_1_filterfulltext ;
   private String lV67Core_diferenciasrecuento_wcds_1_filterfulltext ;
   private String AV44Option ;
   private String AV47OptionDesc ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09IS2_A396EmprCod ;
   private java.util.Date[] P09IS2_A13455Rechora ;
   private byte[] P09IS2_A13416RecEstInv ;
   private String[] P09IS2_A12285RecLot ;
   private byte[] P09IS2_A11624RecMemCant ;
   private String[] P09IS2_A11195RecUbic ;
   private java.math.BigDecimal[] P09IS2_A8669RecExiRAc ;
   private java.math.BigDecimal[] P09IS2_A8668RecExiTAc ;
   private java.math.BigDecimal[] P09IS2_A6573RecPreRec ;
   private java.math.BigDecimal[] P09IS2_A806RecExiRcc ;
   private java.math.BigDecimal[] P09IS2_A808RecExiTcc ;
   private java.math.BigDecimal[] P09IS2_A807RecExiRea ;
   private java.math.BigDecimal[] P09IS2_A809RecExiTeo ;
   private java.util.Date[] P09IS2_A810RecFec ;
   private String[] P09IS2_A719PrdNum ;
   private String[] P09IS3_A719PrdNum ;
   private java.util.Date[] P09IS3_A13455Rechora ;
   private byte[] P09IS3_A13416RecEstInv ;
   private String[] P09IS3_A12285RecLot ;
   private byte[] P09IS3_A11624RecMemCant ;
   private String[] P09IS3_A11195RecUbic ;
   private java.math.BigDecimal[] P09IS3_A8669RecExiRAc ;
   private java.math.BigDecimal[] P09IS3_A8668RecExiTAc ;
   private java.math.BigDecimal[] P09IS3_A6573RecPreRec ;
   private java.math.BigDecimal[] P09IS3_A806RecExiRcc ;
   private java.math.BigDecimal[] P09IS3_A808RecExiTcc ;
   private java.math.BigDecimal[] P09IS3_A807RecExiRea ;
   private java.math.BigDecimal[] P09IS3_A809RecExiTeo ;
   private java.util.Date[] P09IS3_A810RecFec ;
   private String[] P09IS3_A396EmprCod ;
   private String[] P09IS4_A11195RecUbic ;
   private java.util.Date[] P09IS4_A13455Rechora ;
   private byte[] P09IS4_A13416RecEstInv ;
   private String[] P09IS4_A12285RecLot ;
   private byte[] P09IS4_A11624RecMemCant ;
   private java.math.BigDecimal[] P09IS4_A8669RecExiRAc ;
   private java.math.BigDecimal[] P09IS4_A8668RecExiTAc ;
   private java.math.BigDecimal[] P09IS4_A6573RecPreRec ;
   private java.math.BigDecimal[] P09IS4_A806RecExiRcc ;
   private java.math.BigDecimal[] P09IS4_A808RecExiTcc ;
   private java.math.BigDecimal[] P09IS4_A807RecExiRea ;
   private java.math.BigDecimal[] P09IS4_A809RecExiTeo ;
   private java.util.Date[] P09IS4_A810RecFec ;
   private String[] P09IS4_A719PrdNum ;
   private String[] P09IS4_A396EmprCod ;
   private String[] P09IS5_A12285RecLot ;
   private java.util.Date[] P09IS5_A13455Rechora ;
   private byte[] P09IS5_A13416RecEstInv ;
   private byte[] P09IS5_A11624RecMemCant ;
   private String[] P09IS5_A11195RecUbic ;
   private java.math.BigDecimal[] P09IS5_A8669RecExiRAc ;
   private java.math.BigDecimal[] P09IS5_A8668RecExiTAc ;
   private java.math.BigDecimal[] P09IS5_A6573RecPreRec ;
   private java.math.BigDecimal[] P09IS5_A806RecExiRcc ;
   private java.math.BigDecimal[] P09IS5_A808RecExiTcc ;
   private java.math.BigDecimal[] P09IS5_A807RecExiRea ;
   private java.math.BigDecimal[] P09IS5_A809RecExiTeo ;
   private java.util.Date[] P09IS5_A810RecFec ;
   private String[] P09IS5_A719PrdNum ;
   private String[] P09IS5_A396EmprCod ;
   private GXSimpleCollection<String> AV45Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV50OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class diferenciasrecuento_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09IS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                          String AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                          String AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                          String AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                          java.util.Date AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                          java.util.Date AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                          java.math.BigDecimal AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                          java.math.BigDecimal AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                          java.math.BigDecimal AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                          java.math.BigDecimal AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                          java.math.BigDecimal AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                          java.math.BigDecimal AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                          java.math.BigDecimal AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                          java.math.BigDecimal AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                          java.math.BigDecimal AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                          java.math.BigDecimal AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                          String AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                          String AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                          byte AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant ,
                                          byte AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to ,
                                          String AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                          String AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                          byte AV94Core_diferenciasrecuento_wcds_28_tfrecestinv ,
                                          byte AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to ,
                                          java.util.Date AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                          java.util.Date AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                          String AV61EmprCod ,
                                          String AV58PrdNumFrom ,
                                          String AV59PrdNumTo ,
                                          java.util.Date AV60RecFec ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          java.math.BigDecimal A806RecExiRcc ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          java.math.BigDecimal A8668RecExiTAc ,
                                          java.math.BigDecimal A8669RecExiRAc ,
                                          String A11195RecUbic ,
                                          byte A11624RecMemCant ,
                                          String A12285RecLot ,
                                          byte A13416RecEstInv ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[47];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, Rechora, RecEstInv, RecLot, RecMemCant, RecUbic, RecExiRAc, RecExiTAc, RecPreRec, RecExiRcc, RecExiTcc, RecExiRea, RecExiTeo, RecFec, PrdNum FROM" ;
      scmdbuf += " TXPRECUEN" ;
      if ( ! (GXutil.strcmp("", AV67Core_diferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( UPPER(PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTAc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRAc,'9999990.9999'), 2) like '%' || ?) or ( UPPER(RecUbic) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecMemCant,'90'), 2) like '%' || ?) or ( UPPER(RecLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecEstInv,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Core_diferenciasrecuento_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Core_diferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Core_diferenciasrecuento_wcds_6_tfrecfec)) )
      {
         addWhere(sWhereString, "(RecFec >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to)) )
      {
         addWhere(sWhereString, "(RecFec <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(RecExiRea >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRea <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(RecPreRec >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(RecPreRec <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV88Core_diferenciasrecuento_wcds_22_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(RecUbic = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) )
      {
         addWhere(sWhereString, "(RecMemCant >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) )
      {
         addWhere(sWhereString, "(RecMemCant <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV92Core_diferenciasrecuento_wcds_26_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(RecLot = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) )
      {
         addWhere(sWhereString, "(RecEstInv >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) )
      {
         addWhere(sWhereString, "(RecEstInv <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Core_diferenciasrecuento_wcds_30_tfrechora) )
      {
         addWhere(sWhereString, "(Rechora >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97Core_diferenciasrecuento_wcds_31_tfrechora_to) )
      {
         addWhere(sWhereString, "(Rechora <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61EmprCod)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(PrdNum >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(PrdNum <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60RecFec)) )
      {
         addWhere(sWhereString, "(RecFec = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09IS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                          String AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                          String AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                          String AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                          java.util.Date AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                          java.util.Date AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                          java.math.BigDecimal AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                          java.math.BigDecimal AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                          java.math.BigDecimal AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                          java.math.BigDecimal AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                          java.math.BigDecimal AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                          java.math.BigDecimal AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                          java.math.BigDecimal AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                          java.math.BigDecimal AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                          java.math.BigDecimal AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                          java.math.BigDecimal AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                          String AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                          String AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                          byte AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant ,
                                          byte AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to ,
                                          String AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                          String AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                          byte AV94Core_diferenciasrecuento_wcds_28_tfrecestinv ,
                                          byte AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to ,
                                          java.util.Date AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                          java.util.Date AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                          String AV61EmprCod ,
                                          String AV58PrdNumFrom ,
                                          String AV59PrdNumTo ,
                                          java.util.Date AV60RecFec ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          java.math.BigDecimal A806RecExiRcc ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          java.math.BigDecimal A8668RecExiTAc ,
                                          java.math.BigDecimal A8669RecExiRAc ,
                                          String A11195RecUbic ,
                                          byte A11624RecMemCant ,
                                          String A12285RecLot ,
                                          byte A13416RecEstInv ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[47];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT PrdNum, Rechora, RecEstInv, RecLot, RecMemCant, RecUbic, RecExiRAc, RecExiTAc, RecPreRec, RecExiRcc, RecExiTcc, RecExiRea, RecExiTeo, RecFec, EmprCod FROM" ;
      scmdbuf += " TXPRECUEN" ;
      if ( ! (GXutil.strcmp("", AV67Core_diferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( UPPER(PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTAc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRAc,'9999990.9999'), 2) like '%' || ?) or ( UPPER(RecUbic) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecMemCant,'90'), 2) like '%' || ?) or ( UPPER(RecLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecEstInv,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Core_diferenciasrecuento_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Core_diferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Core_diferenciasrecuento_wcds_6_tfrecfec)) )
      {
         addWhere(sWhereString, "(RecFec >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to)) )
      {
         addWhere(sWhereString, "(RecFec <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(RecExiRea >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRea <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(RecPreRec >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(RecPreRec <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV88Core_diferenciasrecuento_wcds_22_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(RecUbic = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) )
      {
         addWhere(sWhereString, "(RecMemCant >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (0==AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) )
      {
         addWhere(sWhereString, "(RecMemCant <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV92Core_diferenciasrecuento_wcds_26_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(RecLot = ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) )
      {
         addWhere(sWhereString, "(RecEstInv >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (0==AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) )
      {
         addWhere(sWhereString, "(RecEstInv <= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Core_diferenciasrecuento_wcds_30_tfrechora) )
      {
         addWhere(sWhereString, "(Rechora >= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97Core_diferenciasrecuento_wcds_31_tfrechora_to) )
      {
         addWhere(sWhereString, "(Rechora <= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61EmprCod)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(PrdNum >= ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(PrdNum <= ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60RecFec)) )
      {
         addWhere(sWhereString, "(RecFec = ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09IS4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                          String AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                          String AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                          String AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                          java.util.Date AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                          java.util.Date AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                          java.math.BigDecimal AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                          java.math.BigDecimal AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                          java.math.BigDecimal AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                          java.math.BigDecimal AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                          java.math.BigDecimal AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                          java.math.BigDecimal AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                          java.math.BigDecimal AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                          java.math.BigDecimal AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                          java.math.BigDecimal AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                          java.math.BigDecimal AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                          String AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                          String AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                          byte AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant ,
                                          byte AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to ,
                                          String AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                          String AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                          byte AV94Core_diferenciasrecuento_wcds_28_tfrecestinv ,
                                          byte AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to ,
                                          java.util.Date AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                          java.util.Date AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                          String AV61EmprCod ,
                                          String AV58PrdNumFrom ,
                                          String AV59PrdNumTo ,
                                          java.util.Date AV60RecFec ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          java.math.BigDecimal A806RecExiRcc ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          java.math.BigDecimal A8668RecExiTAc ,
                                          java.math.BigDecimal A8669RecExiRAc ,
                                          String A11195RecUbic ,
                                          byte A11624RecMemCant ,
                                          String A12285RecLot ,
                                          byte A13416RecEstInv ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[47];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT RecUbic, Rechora, RecEstInv, RecLot, RecMemCant, RecExiRAc, RecExiTAc, RecPreRec, RecExiRcc, RecExiTcc, RecExiRea, RecExiTeo, RecFec, PrdNum, EmprCod FROM" ;
      scmdbuf += " TXPRECUEN" ;
      if ( ! (GXutil.strcmp("", AV67Core_diferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( UPPER(PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTAc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRAc,'9999990.9999'), 2) like '%' || ?) or ( UPPER(RecUbic) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecMemCant,'90'), 2) like '%' || ?) or ( UPPER(RecLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecEstInv,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Core_diferenciasrecuento_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Core_diferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Core_diferenciasrecuento_wcds_6_tfrecfec)) )
      {
         addWhere(sWhereString, "(RecFec >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to)) )
      {
         addWhere(sWhereString, "(RecFec <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(RecExiRea >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRea <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(RecPreRec >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(RecPreRec <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV88Core_diferenciasrecuento_wcds_22_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(RecUbic = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) )
      {
         addWhere(sWhereString, "(RecMemCant >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) )
      {
         addWhere(sWhereString, "(RecMemCant <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV92Core_diferenciasrecuento_wcds_26_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(RecLot = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) )
      {
         addWhere(sWhereString, "(RecEstInv >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) )
      {
         addWhere(sWhereString, "(RecEstInv <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Core_diferenciasrecuento_wcds_30_tfrechora) )
      {
         addWhere(sWhereString, "(Rechora >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97Core_diferenciasrecuento_wcds_31_tfrechora_to) )
      {
         addWhere(sWhereString, "(Rechora <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61EmprCod)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(PrdNum >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(PrdNum <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60RecFec)) )
      {
         addWhere(sWhereString, "(RecFec = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY RecUbic" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09IS5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Core_diferenciasrecuento_wcds_1_filterfulltext ,
                                          String AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel ,
                                          String AV68Core_diferenciasrecuento_wcds_2_tfemprcod ,
                                          String AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV70Core_diferenciasrecuento_wcds_4_tfprdnum ,
                                          java.util.Date AV72Core_diferenciasrecuento_wcds_6_tfrecfec ,
                                          java.util.Date AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to ,
                                          java.math.BigDecimal AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV76Core_diferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc ,
                                          java.math.BigDecimal AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to ,
                                          java.math.BigDecimal AV80Core_diferenciasrecuento_wcds_14_tfrecexircc ,
                                          java.math.BigDecimal AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to ,
                                          java.math.BigDecimal AV82Core_diferenciasrecuento_wcds_16_tfrecprerec ,
                                          java.math.BigDecimal AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to ,
                                          java.math.BigDecimal AV84Core_diferenciasrecuento_wcds_18_tfrecexitac ,
                                          java.math.BigDecimal AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to ,
                                          java.math.BigDecimal AV86Core_diferenciasrecuento_wcds_20_tfrecexirac ,
                                          java.math.BigDecimal AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to ,
                                          String AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel ,
                                          String AV88Core_diferenciasrecuento_wcds_22_tfrecubic ,
                                          byte AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant ,
                                          byte AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to ,
                                          String AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel ,
                                          String AV92Core_diferenciasrecuento_wcds_26_tfreclot ,
                                          byte AV94Core_diferenciasrecuento_wcds_28_tfrecestinv ,
                                          byte AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to ,
                                          java.util.Date AV96Core_diferenciasrecuento_wcds_30_tfrechora ,
                                          java.util.Date AV97Core_diferenciasrecuento_wcds_31_tfrechora_to ,
                                          String AV61EmprCod ,
                                          String AV58PrdNumFrom ,
                                          String AV59PrdNumTo ,
                                          java.util.Date AV60RecFec ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          java.math.BigDecimal A806RecExiRcc ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          java.math.BigDecimal A8668RecExiTAc ,
                                          java.math.BigDecimal A8669RecExiRAc ,
                                          String A11195RecUbic ,
                                          byte A11624RecMemCant ,
                                          String A12285RecLot ,
                                          byte A13416RecEstInv ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[47];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT RecLot, Rechora, RecEstInv, RecMemCant, RecUbic, RecExiRAc, RecExiTAc, RecPreRec, RecExiRcc, RecExiTcc, RecExiRea, RecExiTeo, RecFec, PrdNum, EmprCod FROM" ;
      scmdbuf += " TXPRECUEN" ;
      if ( ! (GXutil.strcmp("", AV67Core_diferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( UPPER(PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRcc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiTAc,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(RecExiRAc,'9999990.9999'), 2) like '%' || ?) or ( UPPER(RecUbic) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecMemCant,'90'), 2) like '%' || ?) or ( UPPER(RecLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(RecEstInv,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Core_diferenciasrecuento_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Core_diferenciasrecuento_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Core_diferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Core_diferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Core_diferenciasrecuento_wcds_6_tfrecfec)) )
      {
         addWhere(sWhereString, "(RecFec >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Core_diferenciasrecuento_wcds_7_tfrecfec_to)) )
      {
         addWhere(sWhereString, "(RecFec <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Core_diferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Core_diferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTeo <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Core_diferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(RecExiRea >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Core_diferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRea <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Core_diferenciasrecuento_wcds_12_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Core_diferenciasrecuento_wcds_13_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTcc <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Core_diferenciasrecuento_wcds_14_tfrecexircc)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Core_diferenciasrecuento_wcds_15_tfrecexircc_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRcc <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Core_diferenciasrecuento_wcds_16_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(RecPreRec >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Core_diferenciasrecuento_wcds_17_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(RecPreRec <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Core_diferenciasrecuento_wcds_18_tfrecexitac)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Core_diferenciasrecuento_wcds_19_tfrecexitac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiTAc <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Core_diferenciasrecuento_wcds_20_tfrecexirac)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Core_diferenciasrecuento_wcds_21_tfrecexirac_to)==0) )
      {
         addWhere(sWhereString, "(RecExiRAc <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV88Core_diferenciasrecuento_wcds_22_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Core_diferenciasrecuento_wcds_23_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(RecUbic = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV90Core_diferenciasrecuento_wcds_24_tfrecmemcant) )
      {
         addWhere(sWhereString, "(RecMemCant >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV91Core_diferenciasrecuento_wcds_25_tfrecmemcant_to) )
      {
         addWhere(sWhereString, "(RecMemCant <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV92Core_diferenciasrecuento_wcds_26_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Core_diferenciasrecuento_wcds_27_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(RecLot = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Core_diferenciasrecuento_wcds_28_tfrecestinv) )
      {
         addWhere(sWhereString, "(RecEstInv >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV95Core_diferenciasrecuento_wcds_29_tfrecestinv_to) )
      {
         addWhere(sWhereString, "(RecEstInv <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Core_diferenciasrecuento_wcds_30_tfrechora) )
      {
         addWhere(sWhereString, "(Rechora >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97Core_diferenciasrecuento_wcds_31_tfrechora_to) )
      {
         addWhere(sWhereString, "(Rechora <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61EmprCod)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(PrdNum >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(PrdNum <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60RecFec)) )
      {
         addWhere(sWhereString, "(RecFec = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY RecLot" ;
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
                  return conditional_P09IS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] );
            case 1 :
                  return conditional_P09IS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] );
            case 2 :
                  return conditional_P09IS4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] );
            case 3 :
                  return conditional_P09IS5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IS4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IS5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,4);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,4);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 4);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 4);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[88], false);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[89], false);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 3);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 4);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 4);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[88], false);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[89], false);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 3);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 4);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 4);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[88], false);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[89], false);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 3);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 4);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 4);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[88], false);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[89], false);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 3);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               return;
      }
   }

}

