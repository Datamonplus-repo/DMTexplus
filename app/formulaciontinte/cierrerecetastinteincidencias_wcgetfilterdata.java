package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinteincidencias_wcgetfilterdata extends GXProcedure
{
   public cierrerecetastinteincidencias_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinteincidencias_wcgetfilterdata.class ), "" );
   }

   public cierrerecetastinteincidencias_wcgetfilterdata( int remoteHandle ,
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
      cierrerecetastinteincidencias_wcgetfilterdata.this.aP5 = new String[] {""};
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
      cierrerecetastinteincidencias_wcgetfilterdata.this.AV40DDOName = aP0;
      cierrerecetastinteincidencias_wcgetfilterdata.this.AV41SearchTxt = aP1;
      cierrerecetastinteincidencias_wcgetfilterdata.this.AV42SearchTxtTo = aP2;
      cierrerecetastinteincidencias_wcgetfilterdata.this.aP3 = aP3;
      cierrerecetastinteincidencias_wcgetfilterdata.this.aP4 = aP4;
      cierrerecetastinteincidencias_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_RECPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_RECPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_RECLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLOTEOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV43OptionsJson = AV30Options.toJSonString(false) ;
      AV44OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV33OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("FormulacionTinte.CierreRecetasTinteIncidencias_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinteIncidencias_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("FormulacionTinte.CierreRecetasTinteIncidencias_WCGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV10TFRecLin = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLin_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV52TFRecPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV53TFRecPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV16TFRecPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV17TFRecPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV54TFPrdFacCon = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFPrdFacCon_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV56TFPrdCant = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFPrdCant_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV58TFForPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV59TFForPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV60TFRecForNro = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFRecForNro_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV62TFRecPrdTnq = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFRecPrdTnq_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV26TFRecLote = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV27TFRecLote_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV20TFPrdExiAlm = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPrdExiAlm_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV22TFPrdExiCC = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdExiCC_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV48barcod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV49barcodreo = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV50barcodpar = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV51reclinmaq = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV52TFRecPrdNum = AV41SearchTxt ;
      AV53TFRecPrdNum_Sel = "" ;
      AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV47emprcod ;
      AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV48barcod ;
      AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV49barcodreo ;
      AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV50barcodpar ;
      AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV51reclinmaq ;
      AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV10TFRecLin ;
      AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV11TFRecLin_To ;
      AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV52TFRecPrdNum ;
      AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV16TFRecPrdDsc ;
      AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV54TFPrdFacCon ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV55TFPrdFacCon_To ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV56TFPrdCant ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV57TFPrdCant_To ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV58TFForPrdDsc ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV60TFRecForNro ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV61TFRecForNro_To ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV26TFRecLote ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV27TFRecLote_Sel ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV20TFPrdExiAlm ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV21TFPrdExiAlm_To ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV22TFPrdExiCC ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV23TFPrdExiCC_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) ,
                                           Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) ,
                                           AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                           AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                           AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                           AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                           AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                           AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                           AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                           AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                           AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                           AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                           Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) ,
                                           Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) ,
                                           AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                           AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                           AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                           AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                           AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                           AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A707PrdFacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A396EmprCod ,
                                           AV47emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49barcodreo) ,
                                           A130BarCodPar ,
                                           AV50barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV51reclinmaq) ,
                                           AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo) ,
                                           AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum), 6, "%") ;
      lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc), 26, "%") ;
      lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc), 5, "%") ;
      lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote), 26, "%") ;
      /* Using cursor P09UA2 */
      pr_default.execute(0, new Object[] {AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod), Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo), AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq), AV47emprcod, Integer.valueOf(AV48barcod), Byte.valueOf(AV49barcodreo), AV50barcodpar, Short.valueOf(AV51reclinmaq), Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin), Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to), lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum, AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel, lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc, AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to, lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc, AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel, Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro), Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to), Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq), Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to), lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9UA2 = false ;
         A719PrdNum = P09UA2_A719PrdNum[0] ;
         n719PrdNum = P09UA2_n719PrdNum[0] ;
         A490ForPrdUMe = P09UA2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09UA2_n490ForPrdUMe[0] ;
         A396EmprCod = P09UA2_A396EmprCod[0] ;
         A129BarCod = P09UA2_A129BarCod[0] ;
         A132BarCodReo = P09UA2_A132BarCodReo[0] ;
         A130BarCodPar = P09UA2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09UA2_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09UA2_A872RecPrdNum[0] ;
         A705PrdExiCC = P09UA2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA2_A704PrdExiAlm[0] ;
         A5725RecLote = P09UA2_A5725RecLote[0] ;
         A3274RecPrdTnq = P09UA2_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09UA2_A2394RecForNro[0] ;
         A488ForPrdDsc = P09UA2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA2_n488ForPrdDsc[0] ;
         A686PrdCant = P09UA2_A686PrdCant[0] ;
         A707PrdFacCon = P09UA2_A707PrdFacCon[0] ;
         A875RecPrdDsc = P09UA2_A875RecPrdDsc[0] ;
         A811RecLin = P09UA2_A811RecLin[0] ;
         A1273RecLinPro = P09UA2_A1273RecLinPro[0] ;
         A705PrdExiCC = P09UA2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA2_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09UA2_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09UA2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA2_n488ForPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09UA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09UA2_A129BarCod[0] == A129BarCod ) && ( P09UA2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09UA2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09UA2_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09UA2_A872RecPrdNum[0], A872RecPrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk9UA2 = false ;
            A811RecLin = P09UA2_A811RecLin[0] ;
            A1273RecLinPro = P09UA2_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9UA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV29Option = A872RecPrdNum ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UA2 )
         {
            brk9UA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFRecPrdDsc = AV41SearchTxt ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV47emprcod ;
      AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV48barcod ;
      AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV49barcodreo ;
      AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV50barcodpar ;
      AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV51reclinmaq ;
      AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV10TFRecLin ;
      AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV11TFRecLin_To ;
      AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV52TFRecPrdNum ;
      AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV16TFRecPrdDsc ;
      AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV54TFPrdFacCon ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV55TFPrdFacCon_To ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV56TFPrdCant ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV57TFPrdCant_To ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV58TFForPrdDsc ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV60TFRecForNro ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV61TFRecForNro_To ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV26TFRecLote ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV27TFRecLote_Sel ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV20TFPrdExiAlm ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV21TFPrdExiAlm_To ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV22TFPrdExiCC ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV23TFPrdExiCC_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) ,
                                           Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) ,
                                           AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                           AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                           AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                           AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                           AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                           AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                           AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                           AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                           AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                           AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                           Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) ,
                                           Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) ,
                                           AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                           AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                           AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                           AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                           AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                           AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A707PrdFacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A396EmprCod ,
                                           AV47emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49barcodreo) ,
                                           A130BarCodPar ,
                                           AV50barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV51reclinmaq) ,
                                           AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo) ,
                                           AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum), 6, "%") ;
      lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc), 26, "%") ;
      lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc), 5, "%") ;
      lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote), 26, "%") ;
      /* Using cursor P09UA3 */
      pr_default.execute(1, new Object[] {AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod), Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo), AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq), AV47emprcod, Integer.valueOf(AV48barcod), Byte.valueOf(AV49barcodreo), AV50barcodpar, Short.valueOf(AV51reclinmaq), Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin), Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to), lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum, AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel, lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc, AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to, lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc, AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel, Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro), Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to), Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq), Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to), lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9UA4 = false ;
         A719PrdNum = P09UA3_A719PrdNum[0] ;
         n719PrdNum = P09UA3_n719PrdNum[0] ;
         A490ForPrdUMe = P09UA3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09UA3_n490ForPrdUMe[0] ;
         A396EmprCod = P09UA3_A396EmprCod[0] ;
         A129BarCod = P09UA3_A129BarCod[0] ;
         A132BarCodReo = P09UA3_A132BarCodReo[0] ;
         A130BarCodPar = P09UA3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09UA3_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09UA3_A875RecPrdDsc[0] ;
         A705PrdExiCC = P09UA3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA3_A704PrdExiAlm[0] ;
         A5725RecLote = P09UA3_A5725RecLote[0] ;
         A3274RecPrdTnq = P09UA3_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09UA3_A2394RecForNro[0] ;
         A488ForPrdDsc = P09UA3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA3_n488ForPrdDsc[0] ;
         A686PrdCant = P09UA3_A686PrdCant[0] ;
         A707PrdFacCon = P09UA3_A707PrdFacCon[0] ;
         A872RecPrdNum = P09UA3_A872RecPrdNum[0] ;
         A811RecLin = P09UA3_A811RecLin[0] ;
         A1273RecLinPro = P09UA3_A1273RecLinPro[0] ;
         A705PrdExiCC = P09UA3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA3_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09UA3_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09UA3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA3_n488ForPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09UA3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09UA3_A129BarCod[0] == A129BarCod ) && ( P09UA3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09UA3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09UA3_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09UA3_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brk9UA4 = false ;
            A811RecLin = P09UA3_A811RecLin[0] ;
            A1273RecLinPro = P09UA3_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9UA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV29Option = A875RecPrdDsc ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UA4 )
         {
            brk9UA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV58TFForPrdDsc = AV41SearchTxt ;
      AV59TFForPrdDsc_Sel = "" ;
      AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV47emprcod ;
      AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV48barcod ;
      AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV49barcodreo ;
      AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV50barcodpar ;
      AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV51reclinmaq ;
      AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV10TFRecLin ;
      AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV11TFRecLin_To ;
      AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV52TFRecPrdNum ;
      AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV16TFRecPrdDsc ;
      AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV54TFPrdFacCon ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV55TFPrdFacCon_To ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV56TFPrdCant ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV57TFPrdCant_To ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV58TFForPrdDsc ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV60TFRecForNro ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV61TFRecForNro_To ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV26TFRecLote ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV27TFRecLote_Sel ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV20TFPrdExiAlm ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV21TFPrdExiAlm_To ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV22TFPrdExiCC ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV23TFPrdExiCC_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) ,
                                           Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) ,
                                           AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                           AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                           AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                           AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                           AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                           AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                           AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                           AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                           AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                           AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                           Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) ,
                                           Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) ,
                                           AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                           AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                           AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                           AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                           AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                           AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A707PrdFacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A396EmprCod ,
                                           AV47emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49barcodreo) ,
                                           A130BarCodPar ,
                                           AV50barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV51reclinmaq) ,
                                           AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo) ,
                                           AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum), 6, "%") ;
      lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc), 26, "%") ;
      lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc), 5, "%") ;
      lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote), 26, "%") ;
      /* Using cursor P09UA4 */
      pr_default.execute(2, new Object[] {AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod), Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo), AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq), AV47emprcod, Integer.valueOf(AV48barcod), Byte.valueOf(AV49barcodreo), AV50barcodpar, Short.valueOf(AV51reclinmaq), Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin), Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to), lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum, AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel, lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc, AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to, lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc, AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel, Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro), Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to), Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq), Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to), lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9UA6 = false ;
         A719PrdNum = P09UA4_A719PrdNum[0] ;
         n719PrdNum = P09UA4_n719PrdNum[0] ;
         A396EmprCod = P09UA4_A396EmprCod[0] ;
         A129BarCod = P09UA4_A129BarCod[0] ;
         A132BarCodReo = P09UA4_A132BarCodReo[0] ;
         A130BarCodPar = P09UA4_A130BarCodPar[0] ;
         A2804RecLinMaq = P09UA4_A2804RecLinMaq[0] ;
         A490ForPrdUMe = P09UA4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09UA4_n490ForPrdUMe[0] ;
         A705PrdExiCC = P09UA4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA4_A704PrdExiAlm[0] ;
         A5725RecLote = P09UA4_A5725RecLote[0] ;
         A3274RecPrdTnq = P09UA4_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09UA4_A2394RecForNro[0] ;
         A488ForPrdDsc = P09UA4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA4_n488ForPrdDsc[0] ;
         A686PrdCant = P09UA4_A686PrdCant[0] ;
         A707PrdFacCon = P09UA4_A707PrdFacCon[0] ;
         A875RecPrdDsc = P09UA4_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09UA4_A872RecPrdNum[0] ;
         A811RecLin = P09UA4_A811RecLin[0] ;
         A1273RecLinPro = P09UA4_A1273RecLinPro[0] ;
         A705PrdExiCC = P09UA4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA4_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09UA4_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09UA4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA4_n488ForPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09UA4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09UA4_A129BarCod[0] == A129BarCod ) && ( P09UA4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09UA4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09UA4_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( P09UA4_A490ForPrdUMe[0] == A490ForPrdUMe ) ) )
            {
               if (true) break;
            }
            brk9UA6 = false ;
            A811RecLin = P09UA4_A811RecLin[0] ;
            A1273RecLinPro = P09UA4_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9UA6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV29Option = A488ForPrdDsc ;
            AV28InsertIndex = 1 ;
            while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
            {
               AV28InsertIndex = (int)(AV28InsertIndex+1) ;
            }
            AV30Options.add(AV29Option, AV28InsertIndex);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UA6 )
         {
            brk9UA6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV26TFRecLote = AV41SearchTxt ;
      AV27TFRecLote_Sel = "" ;
      AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV47emprcod ;
      AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV48barcod ;
      AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV49barcodreo ;
      AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV50barcodpar ;
      AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV51reclinmaq ;
      AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV10TFRecLin ;
      AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV11TFRecLin_To ;
      AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV52TFRecPrdNum ;
      AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV16TFRecPrdDsc ;
      AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV54TFPrdFacCon ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV55TFPrdFacCon_To ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV56TFPrdCant ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV57TFPrdCant_To ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV58TFForPrdDsc ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV60TFRecForNro ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV61TFRecForNro_To ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV26TFRecLote ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV27TFRecLote_Sel ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV20TFPrdExiAlm ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV21TFPrdExiAlm_To ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV22TFPrdExiCC ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV23TFPrdExiCC_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) ,
                                           Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) ,
                                           AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                           AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                           AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                           AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                           AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                           AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                           AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                           AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                           AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                           AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                           Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) ,
                                           Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) ,
                                           AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                           AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                           AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                           AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                           AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                           AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A707PrdFacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A396EmprCod ,
                                           AV47emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49barcodreo) ,
                                           A130BarCodPar ,
                                           AV50barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV51reclinmaq) ,
                                           AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo) ,
                                           AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum), 6, "%") ;
      lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc), 26, "%") ;
      lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc), 5, "%") ;
      lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote), 26, "%") ;
      /* Using cursor P09UA5 */
      pr_default.execute(3, new Object[] {AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, Integer.valueOf(AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod), Byte.valueOf(AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo), AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, Short.valueOf(AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq), AV47emprcod, Integer.valueOf(AV48barcod), Byte.valueOf(AV49barcodreo), AV50barcodpar, Short.valueOf(AV51reclinmaq), Short.valueOf(AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin), Short.valueOf(AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to), lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum, AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel, lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc, AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to, lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc, AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel, Byte.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro), Byte.valueOf(AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to), Byte.valueOf(AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq), Byte.valueOf(AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to), lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9UA8 = false ;
         A719PrdNum = P09UA5_A719PrdNum[0] ;
         n719PrdNum = P09UA5_n719PrdNum[0] ;
         A490ForPrdUMe = P09UA5_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09UA5_n490ForPrdUMe[0] ;
         A396EmprCod = P09UA5_A396EmprCod[0] ;
         A129BarCod = P09UA5_A129BarCod[0] ;
         A132BarCodReo = P09UA5_A132BarCodReo[0] ;
         A130BarCodPar = P09UA5_A130BarCodPar[0] ;
         A2804RecLinMaq = P09UA5_A2804RecLinMaq[0] ;
         A5725RecLote = P09UA5_A5725RecLote[0] ;
         A705PrdExiCC = P09UA5_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA5_A704PrdExiAlm[0] ;
         A3274RecPrdTnq = P09UA5_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09UA5_A2394RecForNro[0] ;
         A488ForPrdDsc = P09UA5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA5_n488ForPrdDsc[0] ;
         A686PrdCant = P09UA5_A686PrdCant[0] ;
         A707PrdFacCon = P09UA5_A707PrdFacCon[0] ;
         A875RecPrdDsc = P09UA5_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09UA5_A872RecPrdNum[0] ;
         A811RecLin = P09UA5_A811RecLin[0] ;
         A1273RecLinPro = P09UA5_A1273RecLinPro[0] ;
         A705PrdExiCC = P09UA5_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UA5_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09UA5_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09UA5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09UA5_n488ForPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09UA5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09UA5_A129BarCod[0] == A129BarCod ) && ( P09UA5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09UA5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09UA5_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09UA5_A5725RecLote[0], A5725RecLote) == 0 ) ) )
            {
               if (true) break;
            }
            brk9UA8 = false ;
            A811RecLin = P09UA5_A811RecLin[0] ;
            A1273RecLinPro = P09UA5_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9UA8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5725RecLote)==0) )
         {
            AV29Option = A5725RecLote ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UA8 )
         {
            brk9UA8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cierrerecetastinteincidencias_wcgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = cierrerecetastinteincidencias_wcgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = cierrerecetastinteincidencias_wcgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43OptionsJson = "" ;
      AV44OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52TFRecPrdNum = "" ;
      AV53TFRecPrdNum_Sel = "" ;
      AV16TFRecPrdDsc = "" ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV54TFPrdFacCon = DecimalUtil.ZERO ;
      AV55TFPrdFacCon_To = DecimalUtil.ZERO ;
      AV56TFPrdCant = DecimalUtil.ZERO ;
      AV57TFPrdCant_To = DecimalUtil.ZERO ;
      AV58TFForPrdDsc = "" ;
      AV59TFForPrdDsc_Sel = "" ;
      AV26TFRecLote = "" ;
      AV27TFRecLote_Sel = "" ;
      AV20TFPrdExiAlm = DecimalUtil.ZERO ;
      AV21TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV22TFPrdExiCC = DecimalUtil.ZERO ;
      AV23TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV47emprcod = "" ;
      AV50barcodpar = "" ;
      A872RecPrdNum = "" ;
      AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = "" ;
      AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = "" ;
      AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = "" ;
      AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = "" ;
      AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = "" ;
      AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = "" ;
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = DecimalUtil.ZERO ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = DecimalUtil.ZERO ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = DecimalUtil.ZERO ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = "" ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = "" ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = "" ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = "" ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = DecimalUtil.ZERO ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = DecimalUtil.ZERO ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = DecimalUtil.ZERO ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = "" ;
      lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = "" ;
      lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = "" ;
      lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = "" ;
      A875RecPrdDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09UA2_A719PrdNum = new String[] {""} ;
      P09UA2_n719PrdNum = new boolean[] {false} ;
      P09UA2_A490ForPrdUMe = new byte[1] ;
      P09UA2_n490ForPrdUMe = new boolean[] {false} ;
      P09UA2_A396EmprCod = new String[] {""} ;
      P09UA2_A129BarCod = new int[1] ;
      P09UA2_A132BarCodReo = new byte[1] ;
      P09UA2_A130BarCodPar = new String[] {""} ;
      P09UA2_A2804RecLinMaq = new short[1] ;
      P09UA2_A872RecPrdNum = new String[] {""} ;
      P09UA2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA2_A5725RecLote = new String[] {""} ;
      P09UA2_A3274RecPrdTnq = new byte[1] ;
      P09UA2_A2394RecForNro = new byte[1] ;
      P09UA2_A488ForPrdDsc = new String[] {""} ;
      P09UA2_n488ForPrdDsc = new boolean[] {false} ;
      P09UA2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA2_A875RecPrdDsc = new String[] {""} ;
      P09UA2_A811RecLin = new short[1] ;
      P09UA2_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      AV29Option = "" ;
      P09UA3_A719PrdNum = new String[] {""} ;
      P09UA3_n719PrdNum = new boolean[] {false} ;
      P09UA3_A490ForPrdUMe = new byte[1] ;
      P09UA3_n490ForPrdUMe = new boolean[] {false} ;
      P09UA3_A396EmprCod = new String[] {""} ;
      P09UA3_A129BarCod = new int[1] ;
      P09UA3_A132BarCodReo = new byte[1] ;
      P09UA3_A130BarCodPar = new String[] {""} ;
      P09UA3_A2804RecLinMaq = new short[1] ;
      P09UA3_A875RecPrdDsc = new String[] {""} ;
      P09UA3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA3_A5725RecLote = new String[] {""} ;
      P09UA3_A3274RecPrdTnq = new byte[1] ;
      P09UA3_A2394RecForNro = new byte[1] ;
      P09UA3_A488ForPrdDsc = new String[] {""} ;
      P09UA3_n488ForPrdDsc = new boolean[] {false} ;
      P09UA3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA3_A872RecPrdNum = new String[] {""} ;
      P09UA3_A811RecLin = new short[1] ;
      P09UA3_A1273RecLinPro = new byte[1] ;
      P09UA4_A719PrdNum = new String[] {""} ;
      P09UA4_n719PrdNum = new boolean[] {false} ;
      P09UA4_A396EmprCod = new String[] {""} ;
      P09UA4_A129BarCod = new int[1] ;
      P09UA4_A132BarCodReo = new byte[1] ;
      P09UA4_A130BarCodPar = new String[] {""} ;
      P09UA4_A2804RecLinMaq = new short[1] ;
      P09UA4_A490ForPrdUMe = new byte[1] ;
      P09UA4_n490ForPrdUMe = new boolean[] {false} ;
      P09UA4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA4_A5725RecLote = new String[] {""} ;
      P09UA4_A3274RecPrdTnq = new byte[1] ;
      P09UA4_A2394RecForNro = new byte[1] ;
      P09UA4_A488ForPrdDsc = new String[] {""} ;
      P09UA4_n488ForPrdDsc = new boolean[] {false} ;
      P09UA4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA4_A875RecPrdDsc = new String[] {""} ;
      P09UA4_A872RecPrdNum = new String[] {""} ;
      P09UA4_A811RecLin = new short[1] ;
      P09UA4_A1273RecLinPro = new byte[1] ;
      P09UA5_A719PrdNum = new String[] {""} ;
      P09UA5_n719PrdNum = new boolean[] {false} ;
      P09UA5_A490ForPrdUMe = new byte[1] ;
      P09UA5_n490ForPrdUMe = new boolean[] {false} ;
      P09UA5_A396EmprCod = new String[] {""} ;
      P09UA5_A129BarCod = new int[1] ;
      P09UA5_A132BarCodReo = new byte[1] ;
      P09UA5_A130BarCodPar = new String[] {""} ;
      P09UA5_A2804RecLinMaq = new short[1] ;
      P09UA5_A5725RecLote = new String[] {""} ;
      P09UA5_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA5_A3274RecPrdTnq = new byte[1] ;
      P09UA5_A2394RecForNro = new byte[1] ;
      P09UA5_A488ForPrdDsc = new String[] {""} ;
      P09UA5_n488ForPrdDsc = new boolean[] {false} ;
      P09UA5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UA5_A875RecPrdDsc = new String[] {""} ;
      P09UA5_A872RecPrdNum = new String[] {""} ;
      P09UA5_A811RecLin = new short[1] ;
      P09UA5_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinteincidencias_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09UA2_A719PrdNum, P09UA2_n719PrdNum, P09UA2_A490ForPrdUMe, P09UA2_n490ForPrdUMe, P09UA2_A396EmprCod, P09UA2_A129BarCod, P09UA2_A132BarCodReo, P09UA2_A130BarCodPar, P09UA2_A2804RecLinMaq, P09UA2_A872RecPrdNum,
            P09UA2_A705PrdExiCC, P09UA2_A704PrdExiAlm, P09UA2_A5725RecLote, P09UA2_A3274RecPrdTnq, P09UA2_A2394RecForNro, P09UA2_A488ForPrdDsc, P09UA2_n488ForPrdDsc, P09UA2_A686PrdCant, P09UA2_A707PrdFacCon, P09UA2_A875RecPrdDsc,
            P09UA2_A811RecLin, P09UA2_A1273RecLinPro
            }
            , new Object[] {
            P09UA3_A719PrdNum, P09UA3_n719PrdNum, P09UA3_A490ForPrdUMe, P09UA3_n490ForPrdUMe, P09UA3_A396EmprCod, P09UA3_A129BarCod, P09UA3_A132BarCodReo, P09UA3_A130BarCodPar, P09UA3_A2804RecLinMaq, P09UA3_A875RecPrdDsc,
            P09UA3_A705PrdExiCC, P09UA3_A704PrdExiAlm, P09UA3_A5725RecLote, P09UA3_A3274RecPrdTnq, P09UA3_A2394RecForNro, P09UA3_A488ForPrdDsc, P09UA3_n488ForPrdDsc, P09UA3_A686PrdCant, P09UA3_A707PrdFacCon, P09UA3_A872RecPrdNum,
            P09UA3_A811RecLin, P09UA3_A1273RecLinPro
            }
            , new Object[] {
            P09UA4_A719PrdNum, P09UA4_n719PrdNum, P09UA4_A396EmprCod, P09UA4_A129BarCod, P09UA4_A132BarCodReo, P09UA4_A130BarCodPar, P09UA4_A2804RecLinMaq, P09UA4_A490ForPrdUMe, P09UA4_n490ForPrdUMe, P09UA4_A705PrdExiCC,
            P09UA4_A704PrdExiAlm, P09UA4_A5725RecLote, P09UA4_A3274RecPrdTnq, P09UA4_A2394RecForNro, P09UA4_A488ForPrdDsc, P09UA4_n488ForPrdDsc, P09UA4_A686PrdCant, P09UA4_A707PrdFacCon, P09UA4_A875RecPrdDsc, P09UA4_A872RecPrdNum,
            P09UA4_A811RecLin, P09UA4_A1273RecLinPro
            }
            , new Object[] {
            P09UA5_A719PrdNum, P09UA5_n719PrdNum, P09UA5_A490ForPrdUMe, P09UA5_n490ForPrdUMe, P09UA5_A396EmprCod, P09UA5_A129BarCod, P09UA5_A132BarCodReo, P09UA5_A130BarCodPar, P09UA5_A2804RecLinMaq, P09UA5_A5725RecLote,
            P09UA5_A705PrdExiCC, P09UA5_A704PrdExiAlm, P09UA5_A3274RecPrdTnq, P09UA5_A2394RecForNro, P09UA5_A488ForPrdDsc, P09UA5_n488ForPrdDsc, P09UA5_A686PrdCant, P09UA5_A707PrdFacCon, P09UA5_A875RecPrdDsc, P09UA5_A872RecPrdNum,
            P09UA5_A811RecLin, P09UA5_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60TFRecForNro ;
   private byte AV61TFRecForNro_To ;
   private byte AV62TFRecPrdTnq ;
   private byte AV63TFRecPrdTnq_To ;
   private byte AV49barcodreo ;
   private byte AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ;
   private byte AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ;
   private byte AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ;
   private byte AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ;
   private byte AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private byte A1273RecLinPro ;
   private short AV10TFRecLin ;
   private short AV11TFRecLin_To ;
   private short AV51reclinmaq ;
   private short AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq ;
   private short AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ;
   private short AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV48barcod ;
   private int AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ;
   private int A129BarCod ;
   private int AV28InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV54TFPrdFacCon ;
   private java.math.BigDecimal AV55TFPrdFacCon_To ;
   private java.math.BigDecimal AV56TFPrdCant ;
   private java.math.BigDecimal AV57TFPrdCant_To ;
   private java.math.BigDecimal AV20TFPrdExiAlm ;
   private java.math.BigDecimal AV21TFPrdExiAlm_To ;
   private java.math.BigDecimal AV22TFPrdExiCC ;
   private java.math.BigDecimal AV23TFPrdExiCC_To ;
   private java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ;
   private java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ;
   private java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ;
   private java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ;
   private java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ;
   private java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ;
   private java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ;
   private java.math.BigDecimal AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private String AV52TFRecPrdNum ;
   private String AV53TFRecPrdNum_Sel ;
   private String AV16TFRecPrdDsc ;
   private String AV17TFRecPrdDsc_Sel ;
   private String AV58TFForPrdDsc ;
   private String AV59TFForPrdDsc_Sel ;
   private String AV26TFRecLote ;
   private String AV27TFRecLote_Sel ;
   private String AV47emprcod ;
   private String AV50barcodpar ;
   private String A872RecPrdNum ;
   private String AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ;
   private String AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ;
   private String AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ;
   private String AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ;
   private String AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ;
   private String AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ;
   private String AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ;
   private String AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ;
   private String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ;
   private String AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ;
   private String scmdbuf ;
   private String lV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ;
   private String lV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ;
   private String lV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ;
   private String lV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private boolean brk9UA2 ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean brk9UA4 ;
   private boolean brk9UA6 ;
   private boolean brk9UA8 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV29Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09UA2_A719PrdNum ;
   private boolean[] P09UA2_n719PrdNum ;
   private byte[] P09UA2_A490ForPrdUMe ;
   private boolean[] P09UA2_n490ForPrdUMe ;
   private String[] P09UA2_A396EmprCod ;
   private int[] P09UA2_A129BarCod ;
   private byte[] P09UA2_A132BarCodReo ;
   private String[] P09UA2_A130BarCodPar ;
   private short[] P09UA2_A2804RecLinMaq ;
   private String[] P09UA2_A872RecPrdNum ;
   private java.math.BigDecimal[] P09UA2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09UA2_A704PrdExiAlm ;
   private String[] P09UA2_A5725RecLote ;
   private byte[] P09UA2_A3274RecPrdTnq ;
   private byte[] P09UA2_A2394RecForNro ;
   private String[] P09UA2_A488ForPrdDsc ;
   private boolean[] P09UA2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09UA2_A686PrdCant ;
   private java.math.BigDecimal[] P09UA2_A707PrdFacCon ;
   private String[] P09UA2_A875RecPrdDsc ;
   private short[] P09UA2_A811RecLin ;
   private byte[] P09UA2_A1273RecLinPro ;
   private String[] P09UA3_A719PrdNum ;
   private boolean[] P09UA3_n719PrdNum ;
   private byte[] P09UA3_A490ForPrdUMe ;
   private boolean[] P09UA3_n490ForPrdUMe ;
   private String[] P09UA3_A396EmprCod ;
   private int[] P09UA3_A129BarCod ;
   private byte[] P09UA3_A132BarCodReo ;
   private String[] P09UA3_A130BarCodPar ;
   private short[] P09UA3_A2804RecLinMaq ;
   private String[] P09UA3_A875RecPrdDsc ;
   private java.math.BigDecimal[] P09UA3_A705PrdExiCC ;
   private java.math.BigDecimal[] P09UA3_A704PrdExiAlm ;
   private String[] P09UA3_A5725RecLote ;
   private byte[] P09UA3_A3274RecPrdTnq ;
   private byte[] P09UA3_A2394RecForNro ;
   private String[] P09UA3_A488ForPrdDsc ;
   private boolean[] P09UA3_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09UA3_A686PrdCant ;
   private java.math.BigDecimal[] P09UA3_A707PrdFacCon ;
   private String[] P09UA3_A872RecPrdNum ;
   private short[] P09UA3_A811RecLin ;
   private byte[] P09UA3_A1273RecLinPro ;
   private String[] P09UA4_A719PrdNum ;
   private boolean[] P09UA4_n719PrdNum ;
   private String[] P09UA4_A396EmprCod ;
   private int[] P09UA4_A129BarCod ;
   private byte[] P09UA4_A132BarCodReo ;
   private String[] P09UA4_A130BarCodPar ;
   private short[] P09UA4_A2804RecLinMaq ;
   private byte[] P09UA4_A490ForPrdUMe ;
   private boolean[] P09UA4_n490ForPrdUMe ;
   private java.math.BigDecimal[] P09UA4_A705PrdExiCC ;
   private java.math.BigDecimal[] P09UA4_A704PrdExiAlm ;
   private String[] P09UA4_A5725RecLote ;
   private byte[] P09UA4_A3274RecPrdTnq ;
   private byte[] P09UA4_A2394RecForNro ;
   private String[] P09UA4_A488ForPrdDsc ;
   private boolean[] P09UA4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09UA4_A686PrdCant ;
   private java.math.BigDecimal[] P09UA4_A707PrdFacCon ;
   private String[] P09UA4_A875RecPrdDsc ;
   private String[] P09UA4_A872RecPrdNum ;
   private short[] P09UA4_A811RecLin ;
   private byte[] P09UA4_A1273RecLinPro ;
   private String[] P09UA5_A719PrdNum ;
   private boolean[] P09UA5_n719PrdNum ;
   private byte[] P09UA5_A490ForPrdUMe ;
   private boolean[] P09UA5_n490ForPrdUMe ;
   private String[] P09UA5_A396EmprCod ;
   private int[] P09UA5_A129BarCod ;
   private byte[] P09UA5_A132BarCodReo ;
   private String[] P09UA5_A130BarCodPar ;
   private short[] P09UA5_A2804RecLinMaq ;
   private String[] P09UA5_A5725RecLote ;
   private java.math.BigDecimal[] P09UA5_A705PrdExiCC ;
   private java.math.BigDecimal[] P09UA5_A704PrdExiAlm ;
   private byte[] P09UA5_A3274RecPrdTnq ;
   private byte[] P09UA5_A2394RecForNro ;
   private String[] P09UA5_A488ForPrdDsc ;
   private boolean[] P09UA5_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09UA5_A686PrdCant ;
   private java.math.BigDecimal[] P09UA5_A707PrdFacCon ;
   private String[] P09UA5_A875RecPrdDsc ;
   private String[] P09UA5_A872RecPrdNum ;
   private short[] P09UA5_A811RecLin ;
   private byte[] P09UA5_A1273RecLinPro ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class cierrerecetastinteincidencias_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ,
                                          short AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ,
                                          String AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                          String AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                          String AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                          java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                          String AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                          String AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                          byte AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ,
                                          byte AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ,
                                          byte AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ,
                                          byte AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ,
                                          String AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                          String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                          java.math.BigDecimal AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A396EmprCod ,
                                          String AV47emprcod ,
                                          int A129BarCod ,
                                          int AV48barcod ,
                                          byte A132BarCodReo ,
                                          byte AV49barcodreo ,
                                          String A130BarCodPar ,
                                          String AV50barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV51reclinmaq ,
                                          String AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                          int AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ,
                                          byte AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ,
                                          String AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                          short AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum, T2.PrdExiCC, T2.PrdExiAlm, T1.RecLote, T1.RecPrdTnq," ;
      scmdbuf += " T1.RecForNro, T3.ForPrdDsc, T1.PrdCant, T2.PrdFacCon, T1.RecPrdDsc, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09UA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ,
                                          short AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ,
                                          String AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                          String AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                          String AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                          java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                          String AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                          String AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                          byte AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ,
                                          byte AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ,
                                          byte AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ,
                                          byte AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ,
                                          String AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                          String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                          java.math.BigDecimal AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A396EmprCod ,
                                          String AV47emprcod ,
                                          int A129BarCod ,
                                          int AV48barcod ,
                                          byte A132BarCodReo ,
                                          byte AV49barcodreo ,
                                          String A130BarCodPar ,
                                          String AV50barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV51reclinmaq ,
                                          String AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                          int AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ,
                                          byte AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ,
                                          String AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                          short AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc, T2.PrdExiCC, T2.PrdExiAlm, T1.RecLote, T1.RecPrdTnq," ;
      scmdbuf += " T1.RecForNro, T3.ForPrdDsc, T1.PrdCant, T2.PrdFacCon, T1.RecPrdNum, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09UA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ,
                                          short AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ,
                                          String AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                          String AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                          String AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                          java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                          String AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                          String AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                          byte AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ,
                                          byte AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ,
                                          byte AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ,
                                          byte AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ,
                                          String AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                          String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                          java.math.BigDecimal AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A396EmprCod ,
                                          String AV47emprcod ,
                                          int A129BarCod ,
                                          int AV48barcod ,
                                          byte A132BarCodReo ,
                                          byte AV49barcodreo ,
                                          String A130BarCodPar ,
                                          String AV50barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV51reclinmaq ,
                                          String AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                          int AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ,
                                          byte AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ,
                                          String AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                          short AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.ForPrdUMe, T2.PrdExiCC, T2.PrdExiAlm, T1.RecLote, T1.RecPrdTnq, T1.RecForNro," ;
      scmdbuf += " T3.ForPrdDsc, T1.PrdCant, T2.PrdFacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.ForPrdUMe" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09UA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ,
                                          short AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ,
                                          String AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                          String AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                          String AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                          java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                          String AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                          String AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                          byte AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ,
                                          byte AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ,
                                          byte AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ,
                                          byte AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ,
                                          String AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                          String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                          java.math.BigDecimal AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A396EmprCod ,
                                          String AV47emprcod ,
                                          int A129BarCod ,
                                          int AV48barcod ,
                                          byte A132BarCodReo ,
                                          byte AV49barcodreo ,
                                          String A130BarCodPar ,
                                          String AV50barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV51reclinmaq ,
                                          String AV70Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                          int AV71Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ,
                                          byte AV72Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ,
                                          String AV73Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                          short AV74Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote, T2.PrdExiCC, T2.PrdExiAlm, T1.RecPrdTnq, T1.RecForNro," ;
      scmdbuf += " T3.ForPrdDsc, T1.PrdCant, T2.PrdFacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV75Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
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
                  return conditional_P09UA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
            case 1 :
                  return conditional_P09UA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
            case 2 :
                  return conditional_P09UA4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
            case 3 :
                  return conditional_P09UA5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,4);
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,4);
               ((String[]) buf[19])[0] = rslt.getString(17, 26);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,4);
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,4);
               ((String[]) buf[19])[0] = rslt.getString(17, 6);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,4);
               ((String[]) buf[18])[0] = rslt.getString(16, 26);
               ((String[]) buf[19])[0] = rslt.getString(17, 6);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,4);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,4);
               ((String[]) buf[18])[0] = rslt.getString(16, 26);
               ((String[]) buf[19])[0] = rslt.getString(17, 6);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               return;
      }
   }

}

