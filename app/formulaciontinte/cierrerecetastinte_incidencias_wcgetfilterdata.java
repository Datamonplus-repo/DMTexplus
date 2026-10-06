package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidencias_wcgetfilterdata extends GXProcedure
{
   public cierrerecetastinte_incidencias_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_incidencias_wcgetfilterdata.class ), "" );
   }

   public cierrerecetastinte_incidencias_wcgetfilterdata( int remoteHandle ,
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
      cierrerecetastinte_incidencias_wcgetfilterdata.this.aP5 = new String[] {""};
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
      cierrerecetastinte_incidencias_wcgetfilterdata.this.AV24DDOName = aP0;
      cierrerecetastinte_incidencias_wcgetfilterdata.this.AV22SearchTxt = aP1;
      cierrerecetastinte_incidencias_wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      cierrerecetastinte_incidencias_wcgetfilterdata.this.aP3 = aP3;
      cierrerecetastinte_incidencias_wcgetfilterdata.this.aP4 = aP4;
      cierrerecetastinte_incidencias_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_RECPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_RECPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_RECLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLOTEOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), null, null);
      }
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV43TFRecPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV44TFRecPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV45TFRecPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV46TFRecPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV47TFFacCon = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFFacCon_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV49TFPrdExiAlm = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFPrdExiAlm_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV51TFPrdExiCC = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFPrdExiCC_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV53TFPrdCanRes = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFPrdCanRes_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV55TFRecLote = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV56TFRecLote_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV20TFRecLinPro = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFRecLinPro_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV41TFRecLin = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFRecLin_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV57emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV58barcod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV59barcodreo = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV60barcodpar = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV61reclinmaq = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV43TFRecPrdNum = AV22SearchTxt ;
      AV44TFRecPrdNum_Sel = "" ;
      AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV57emprcod ;
      AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV58barcod ;
      AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV59barcodreo ;
      AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV60barcodpar ;
      AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV61reclinmaq ;
      AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV40FilterFullText ;
      AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV43TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV44TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV45TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV46TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV47TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV48TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV49TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV50TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV51TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV52TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV53TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV54TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV55TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV56TFRecLote_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV20TFRecLinPro ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV21TFRecLinPro_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV41TFRecLin ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV42TFRecLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                           AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                           AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                           AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                           AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                           AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                           Byte.valueOf(AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) ,
                                           Byte.valueOf(AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) ,
                                           Short.valueOf(AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) ,
                                           Short.valueOf(AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A396EmprCod ,
                                           AV57emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A130BarCodPar ,
                                           AV60barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV61reclinmaq) ,
                                           AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo) ,
                                           AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum), 6, "%") ;
      lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc), 26, "%") ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote), 26, "%") ;
      /* Using cursor P09EY2 */
      pr_default.execute(0, new Object[] {AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, Integer.valueOf(AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod), Byte.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo), AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq), AV57emprcod, Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), AV60barcodpar, Short.valueOf(AV61reclinmaq), lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum, AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel, lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc, AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc, AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to, AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to, lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote, AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel, Byte.valueOf(AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro), Byte.valueOf(AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to), Short.valueOf(AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin), Short.valueOf(AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9EY2 = false ;
         A719PrdNum = P09EY2_A719PrdNum[0] ;
         n719PrdNum = P09EY2_n719PrdNum[0] ;
         A396EmprCod = P09EY2_A396EmprCod[0] ;
         A129BarCod = P09EY2_A129BarCod[0] ;
         A132BarCodReo = P09EY2_A132BarCodReo[0] ;
         A130BarCodPar = P09EY2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EY2_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09EY2_A872RecPrdNum[0] ;
         A811RecLin = P09EY2_A811RecLin[0] ;
         A1273RecLinPro = P09EY2_A1273RecLinPro[0] ;
         A5725RecLote = P09EY2_A5725RecLote[0] ;
         A685PrdCanRes = P09EY2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EY2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EY2_A704PrdExiAlm[0] ;
         A431FacCon = P09EY2_A431FacCon[0] ;
         A875RecPrdDsc = P09EY2_A875RecPrdDsc[0] ;
         A685PrdCanRes = P09EY2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EY2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EY2_A704PrdExiAlm[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09EY2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09EY2_A129BarCod[0] == A129BarCod ) && ( P09EY2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09EY2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09EY2_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09EY2_A872RecPrdNum[0], A872RecPrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk9EY2 = false ;
            A811RecLin = P09EY2_A811RecLin[0] ;
            A1273RecLinPro = P09EY2_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9EY2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV26Option = A872RecPrdNum ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EY2 )
         {
            brk9EY2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV45TFRecPrdDsc = AV22SearchTxt ;
      AV46TFRecPrdDsc_Sel = "" ;
      AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV57emprcod ;
      AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV58barcod ;
      AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV59barcodreo ;
      AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV60barcodpar ;
      AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV61reclinmaq ;
      AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV40FilterFullText ;
      AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV43TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV44TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV45TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV46TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV47TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV48TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV49TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV50TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV51TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV52TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV53TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV54TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV55TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV56TFRecLote_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV20TFRecLinPro ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV21TFRecLinPro_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV41TFRecLin ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV42TFRecLin_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                           AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                           AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                           AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                           AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                           AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                           Byte.valueOf(AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) ,
                                           Byte.valueOf(AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) ,
                                           Short.valueOf(AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) ,
                                           Short.valueOf(AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A396EmprCod ,
                                           AV57emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A130BarCodPar ,
                                           AV60barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV61reclinmaq) ,
                                           AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo) ,
                                           AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum), 6, "%") ;
      lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc), 26, "%") ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote), 26, "%") ;
      /* Using cursor P09EY3 */
      pr_default.execute(1, new Object[] {AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, Integer.valueOf(AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod), Byte.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo), AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq), AV57emprcod, Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), AV60barcodpar, Short.valueOf(AV61reclinmaq), lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum, AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel, lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc, AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc, AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to, AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to, lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote, AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel, Byte.valueOf(AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro), Byte.valueOf(AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to), Short.valueOf(AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin), Short.valueOf(AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9EY4 = false ;
         A719PrdNum = P09EY3_A719PrdNum[0] ;
         n719PrdNum = P09EY3_n719PrdNum[0] ;
         A396EmprCod = P09EY3_A396EmprCod[0] ;
         A129BarCod = P09EY3_A129BarCod[0] ;
         A132BarCodReo = P09EY3_A132BarCodReo[0] ;
         A130BarCodPar = P09EY3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EY3_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09EY3_A875RecPrdDsc[0] ;
         A811RecLin = P09EY3_A811RecLin[0] ;
         A1273RecLinPro = P09EY3_A1273RecLinPro[0] ;
         A5725RecLote = P09EY3_A5725RecLote[0] ;
         A685PrdCanRes = P09EY3_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EY3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EY3_A704PrdExiAlm[0] ;
         A431FacCon = P09EY3_A431FacCon[0] ;
         A872RecPrdNum = P09EY3_A872RecPrdNum[0] ;
         A685PrdCanRes = P09EY3_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EY3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EY3_A704PrdExiAlm[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09EY3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09EY3_A129BarCod[0] == A129BarCod ) && ( P09EY3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09EY3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09EY3_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09EY3_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brk9EY4 = false ;
            A811RecLin = P09EY3_A811RecLin[0] ;
            A1273RecLinPro = P09EY3_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9EY4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV26Option = A875RecPrdDsc ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EY4 )
         {
            brk9EY4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV55TFRecLote = AV22SearchTxt ;
      AV56TFRecLote_Sel = "" ;
      AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV57emprcod ;
      AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV58barcod ;
      AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV59barcodreo ;
      AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV60barcodpar ;
      AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV61reclinmaq ;
      AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV40FilterFullText ;
      AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV43TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV44TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV45TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV46TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV47TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV48TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV49TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV50TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV51TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV52TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV53TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV54TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV55TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV56TFRecLote_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV20TFRecLinPro ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV21TFRecLinPro_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV41TFRecLin ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV42TFRecLin_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                           AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                           AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                           AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                           AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                           AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                           Byte.valueOf(AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) ,
                                           Byte.valueOf(AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) ,
                                           Short.valueOf(AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) ,
                                           Short.valueOf(AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A396EmprCod ,
                                           AV57emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A130BarCodPar ,
                                           AV60barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV61reclinmaq) ,
                                           AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo) ,
                                           AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum), 6, "%") ;
      lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc), 26, "%") ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote), 26, "%") ;
      /* Using cursor P09EY4 */
      pr_default.execute(2, new Object[] {AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, Integer.valueOf(AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod), Byte.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo), AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq), AV57emprcod, Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), AV60barcodpar, Short.valueOf(AV61reclinmaq), lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum, AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel, lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc, AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc, AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to, AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to, lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote, AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel, Byte.valueOf(AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro), Byte.valueOf(AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to), Short.valueOf(AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin), Short.valueOf(AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9EY6 = false ;
         A719PrdNum = P09EY4_A719PrdNum[0] ;
         n719PrdNum = P09EY4_n719PrdNum[0] ;
         A396EmprCod = P09EY4_A396EmprCod[0] ;
         A129BarCod = P09EY4_A129BarCod[0] ;
         A132BarCodReo = P09EY4_A132BarCodReo[0] ;
         A130BarCodPar = P09EY4_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EY4_A2804RecLinMaq[0] ;
         A5725RecLote = P09EY4_A5725RecLote[0] ;
         A811RecLin = P09EY4_A811RecLin[0] ;
         A1273RecLinPro = P09EY4_A1273RecLinPro[0] ;
         A685PrdCanRes = P09EY4_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EY4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EY4_A704PrdExiAlm[0] ;
         A431FacCon = P09EY4_A431FacCon[0] ;
         A875RecPrdDsc = P09EY4_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09EY4_A872RecPrdNum[0] ;
         A685PrdCanRes = P09EY4_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EY4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EY4_A704PrdExiAlm[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09EY4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09EY4_A129BarCod[0] == A129BarCod ) && ( P09EY4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09EY4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09EY4_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09EY4_A5725RecLote[0], A5725RecLote) == 0 ) ) )
            {
               if (true) break;
            }
            brk9EY6 = false ;
            A811RecLin = P09EY4_A811RecLin[0] ;
            A1273RecLinPro = P09EY4_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9EY6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5725RecLote)==0) )
         {
            AV26Option = A5725RecLote ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EY6 )
         {
            brk9EY6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cierrerecetastinte_incidencias_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = cierrerecetastinte_incidencias_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = cierrerecetastinte_incidencias_wcgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV43TFRecPrdNum = "" ;
      AV44TFRecPrdNum_Sel = "" ;
      AV45TFRecPrdDsc = "" ;
      AV46TFRecPrdDsc_Sel = "" ;
      AV47TFFacCon = DecimalUtil.ZERO ;
      AV48TFFacCon_To = DecimalUtil.ZERO ;
      AV49TFPrdExiAlm = DecimalUtil.ZERO ;
      AV50TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV51TFPrdExiCC = DecimalUtil.ZERO ;
      AV52TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV53TFPrdCanRes = DecimalUtil.ZERO ;
      AV54TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV55TFRecLote = "" ;
      AV56TFRecLote_Sel = "" ;
      AV57emprcod = "" ;
      AV60barcodpar = "" ;
      A872RecPrdNum = "" ;
      AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = "" ;
      AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = "" ;
      AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = "" ;
      AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = "" ;
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = DecimalUtil.ZERO ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = DecimalUtil.ZERO ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = DecimalUtil.ZERO ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = DecimalUtil.ZERO ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = DecimalUtil.ZERO ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = DecimalUtil.ZERO ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = DecimalUtil.ZERO ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = DecimalUtil.ZERO ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09EY2_A719PrdNum = new String[] {""} ;
      P09EY2_n719PrdNum = new boolean[] {false} ;
      P09EY2_A396EmprCod = new String[] {""} ;
      P09EY2_A129BarCod = new int[1] ;
      P09EY2_A132BarCodReo = new byte[1] ;
      P09EY2_A130BarCodPar = new String[] {""} ;
      P09EY2_A2804RecLinMaq = new short[1] ;
      P09EY2_A872RecPrdNum = new String[] {""} ;
      P09EY2_A811RecLin = new short[1] ;
      P09EY2_A1273RecLinPro = new byte[1] ;
      P09EY2_A5725RecLote = new String[] {""} ;
      P09EY2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY2_A875RecPrdDsc = new String[] {""} ;
      A719PrdNum = "" ;
      AV26Option = "" ;
      P09EY3_A719PrdNum = new String[] {""} ;
      P09EY3_n719PrdNum = new boolean[] {false} ;
      P09EY3_A396EmprCod = new String[] {""} ;
      P09EY3_A129BarCod = new int[1] ;
      P09EY3_A132BarCodReo = new byte[1] ;
      P09EY3_A130BarCodPar = new String[] {""} ;
      P09EY3_A2804RecLinMaq = new short[1] ;
      P09EY3_A875RecPrdDsc = new String[] {""} ;
      P09EY3_A811RecLin = new short[1] ;
      P09EY3_A1273RecLinPro = new byte[1] ;
      P09EY3_A5725RecLote = new String[] {""} ;
      P09EY3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY3_A872RecPrdNum = new String[] {""} ;
      P09EY4_A719PrdNum = new String[] {""} ;
      P09EY4_n719PrdNum = new boolean[] {false} ;
      P09EY4_A396EmprCod = new String[] {""} ;
      P09EY4_A129BarCod = new int[1] ;
      P09EY4_A132BarCodReo = new byte[1] ;
      P09EY4_A130BarCodPar = new String[] {""} ;
      P09EY4_A2804RecLinMaq = new short[1] ;
      P09EY4_A5725RecLote = new String[] {""} ;
      P09EY4_A811RecLin = new short[1] ;
      P09EY4_A1273RecLinPro = new byte[1] ;
      P09EY4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EY4_A875RecPrdDsc = new String[] {""} ;
      P09EY4_A872RecPrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidencias_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09EY2_A719PrdNum, P09EY2_n719PrdNum, P09EY2_A396EmprCod, P09EY2_A129BarCod, P09EY2_A132BarCodReo, P09EY2_A130BarCodPar, P09EY2_A2804RecLinMaq, P09EY2_A872RecPrdNum, P09EY2_A811RecLin, P09EY2_A1273RecLinPro,
            P09EY2_A5725RecLote, P09EY2_A685PrdCanRes, P09EY2_A705PrdExiCC, P09EY2_A704PrdExiAlm, P09EY2_A431FacCon, P09EY2_A875RecPrdDsc
            }
            , new Object[] {
            P09EY3_A719PrdNum, P09EY3_n719PrdNum, P09EY3_A396EmprCod, P09EY3_A129BarCod, P09EY3_A132BarCodReo, P09EY3_A130BarCodPar, P09EY3_A2804RecLinMaq, P09EY3_A875RecPrdDsc, P09EY3_A811RecLin, P09EY3_A1273RecLinPro,
            P09EY3_A5725RecLote, P09EY3_A685PrdCanRes, P09EY3_A705PrdExiCC, P09EY3_A704PrdExiAlm, P09EY3_A431FacCon, P09EY3_A872RecPrdNum
            }
            , new Object[] {
            P09EY4_A719PrdNum, P09EY4_n719PrdNum, P09EY4_A396EmprCod, P09EY4_A129BarCod, P09EY4_A132BarCodReo, P09EY4_A130BarCodPar, P09EY4_A2804RecLinMaq, P09EY4_A5725RecLote, P09EY4_A811RecLin, P09EY4_A1273RecLinPro,
            P09EY4_A685PrdCanRes, P09EY4_A705PrdExiCC, P09EY4_A704PrdExiAlm, P09EY4_A431FacCon, P09EY4_A875RecPrdDsc, P09EY4_A872RecPrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFRecLinPro ;
   private byte AV21TFRecLinPro_To ;
   private byte AV59barcodreo ;
   private byte AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ;
   private byte AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ;
   private byte AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private short AV41TFRecLin ;
   private short AV42TFRecLin_To ;
   private short AV61reclinmaq ;
   private short AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq ;
   private short AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ;
   private short AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV64GXV1 ;
   private int AV58barcod ;
   private int AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ;
   private int A129BarCod ;
   private long AV34count ;
   private java.math.BigDecimal AV47TFFacCon ;
   private java.math.BigDecimal AV48TFFacCon_To ;
   private java.math.BigDecimal AV49TFPrdExiAlm ;
   private java.math.BigDecimal AV50TFPrdExiAlm_To ;
   private java.math.BigDecimal AV51TFPrdExiCC ;
   private java.math.BigDecimal AV52TFPrdExiCC_To ;
   private java.math.BigDecimal AV53TFPrdCanRes ;
   private java.math.BigDecimal AV54TFPrdCanRes_To ;
   private java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ;
   private java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ;
   private java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ;
   private java.math.BigDecimal AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ;
   private java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ;
   private java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ;
   private java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ;
   private java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV43TFRecPrdNum ;
   private String AV44TFRecPrdNum_Sel ;
   private String AV45TFRecPrdDsc ;
   private String AV46TFRecPrdDsc_Sel ;
   private String AV55TFRecLote ;
   private String AV56TFRecLote_Sel ;
   private String AV57emprcod ;
   private String AV60barcodpar ;
   private String A872RecPrdNum ;
   private String AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ;
   private String AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ;
   private String AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ;
   private String AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ;
   private String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ;
   private String scmdbuf ;
   private String lV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String lV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String A875RecPrdDsc ;
   private String A5725RecLote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private boolean brk9EY2 ;
   private boolean n719PrdNum ;
   private boolean brk9EY4 ;
   private boolean brk9EY6 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private String lV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EY2_A719PrdNum ;
   private boolean[] P09EY2_n719PrdNum ;
   private String[] P09EY2_A396EmprCod ;
   private int[] P09EY2_A129BarCod ;
   private byte[] P09EY2_A132BarCodReo ;
   private String[] P09EY2_A130BarCodPar ;
   private short[] P09EY2_A2804RecLinMaq ;
   private String[] P09EY2_A872RecPrdNum ;
   private short[] P09EY2_A811RecLin ;
   private byte[] P09EY2_A1273RecLinPro ;
   private String[] P09EY2_A5725RecLote ;
   private java.math.BigDecimal[] P09EY2_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EY2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EY2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EY2_A431FacCon ;
   private String[] P09EY2_A875RecPrdDsc ;
   private String[] P09EY3_A719PrdNum ;
   private boolean[] P09EY3_n719PrdNum ;
   private String[] P09EY3_A396EmprCod ;
   private int[] P09EY3_A129BarCod ;
   private byte[] P09EY3_A132BarCodReo ;
   private String[] P09EY3_A130BarCodPar ;
   private short[] P09EY3_A2804RecLinMaq ;
   private String[] P09EY3_A875RecPrdDsc ;
   private short[] P09EY3_A811RecLin ;
   private byte[] P09EY3_A1273RecLinPro ;
   private String[] P09EY3_A5725RecLote ;
   private java.math.BigDecimal[] P09EY3_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EY3_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EY3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EY3_A431FacCon ;
   private String[] P09EY3_A872RecPrdNum ;
   private String[] P09EY4_A719PrdNum ;
   private boolean[] P09EY4_n719PrdNum ;
   private String[] P09EY4_A396EmprCod ;
   private int[] P09EY4_A129BarCod ;
   private byte[] P09EY4_A132BarCodReo ;
   private String[] P09EY4_A130BarCodPar ;
   private short[] P09EY4_A2804RecLinMaq ;
   private String[] P09EY4_A5725RecLote ;
   private short[] P09EY4_A811RecLin ;
   private byte[] P09EY4_A1273RecLinPro ;
   private java.math.BigDecimal[] P09EY4_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EY4_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EY4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EY4_A431FacCon ;
   private String[] P09EY4_A875RecPrdDsc ;
   private String[] P09EY4_A872RecPrdNum ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class cierrerecetastinte_incidencias_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                          String AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                          String AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                          String AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                          String AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                          java.math.BigDecimal AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                          java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                          byte AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ,
                                          byte AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ,
                                          short AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ,
                                          short AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A396EmprCod ,
                                          String AV57emprcod ,
                                          int A129BarCod ,
                                          int AV58barcod ,
                                          byte A132BarCodReo ,
                                          byte AV59barcodreo ,
                                          String A130BarCodPar ,
                                          String AV60barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV61reclinmaq ,
                                          String AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                          int AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                          byte AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                          short AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[37];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC," ;
      scmdbuf += " T2.PrdExiAlm, T1.FacCon, T1.RecPrdDsc FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09EY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                          String AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                          String AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                          String AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                          String AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                          java.math.BigDecimal AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                          java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                          byte AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ,
                                          byte AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ,
                                          short AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ,
                                          short AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A396EmprCod ,
                                          String AV57emprcod ,
                                          int A129BarCod ,
                                          int AV58barcod ,
                                          byte A132BarCodReo ,
                                          byte AV59barcodreo ,
                                          String A130BarCodPar ,
                                          String AV60barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV61reclinmaq ,
                                          String AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                          int AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                          byte AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                          short AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[37];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc, T1.RecLin, T1.RecLinPro, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC," ;
      scmdbuf += " T2.PrdExiAlm, T1.FacCon, T1.RecPrdNum FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09EY4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                          String AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                          String AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                          String AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                          String AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                          java.math.BigDecimal AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                          java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                          byte AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ,
                                          byte AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ,
                                          short AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ,
                                          short AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A396EmprCod ,
                                          String AV57emprcod ,
                                          int A129BarCod ,
                                          int AV58barcod ,
                                          byte A132BarCodReo ,
                                          byte AV59barcodreo ,
                                          String A130BarCodPar ,
                                          String AV60barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV61reclinmaq ,
                                          String AV66Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                          int AV67Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                          byte AV68Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                          short AV70Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[37];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote, T1.RecLin, T1.RecLinPro, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
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
                  return conditional_P09EY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() );
            case 1 :
                  return conditional_P09EY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() );
            case 2 :
                  return conditional_P09EY4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EY4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[15])[0] = rslt.getString(15, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 6);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               return;
      }
   }

}

