package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidenciasgetfilterdata extends GXProcedure
{
   public cierrerecetastinte_incidenciasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_incidenciasgetfilterdata.class ), "" );
   }

   public cierrerecetastinte_incidenciasgetfilterdata( int remoteHandle ,
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
      cierrerecetastinte_incidenciasgetfilterdata.this.aP5 = new String[] {""};
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
      cierrerecetastinte_incidenciasgetfilterdata.this.AV32DDOName = aP0;
      cierrerecetastinte_incidenciasgetfilterdata.this.AV30SearchTxt = aP1;
      cierrerecetastinte_incidenciasgetfilterdata.this.AV31SearchTxtTo = aP2;
      cierrerecetastinte_incidenciasgetfilterdata.this.aP3 = aP3;
      cierrerecetastinte_incidenciasgetfilterdata.this.aP4 = aP4;
      cierrerecetastinte_incidenciasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECLOTE") == 0 )
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
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV10TFRecLin = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLin_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV12TFRecPrdNum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV13TFRecPrdNum_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV14TFRecPrdDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV15TFRecPrdDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV16TFFacCon = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFFacCon_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV22TFPrdExiAlm = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdExiAlm_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV24TFPrdExiCC = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdExiCC_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV26TFPrdCanRes = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFPrdCanRes_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV28TFRecLote = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV29TFRecLote_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50barcod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51barcodreo = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV52barcodpar = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV53reclinmaq = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFRecPrdNum = AV30SearchTxt ;
      AV13TFRecPrdNum_Sel = "" ;
      AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV49emprcod ;
      AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV50barcod ;
      AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV51barcodreo ;
      AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV52barcodpar ;
      AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV53reclinmaq ;
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV48FilterFullText ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV10TFRecLin ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV11TFRecLin_To ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV12TFRecPrdNum ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV13TFRecPrdNum_Sel ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV14TFRecPrdDsc ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV15TFRecPrdDsc_Sel ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV16TFFacCon ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV17TFFacCon_To ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV22TFPrdExiAlm ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV23TFPrdExiAlm_To ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV24TFPrdExiCC ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV25TFPrdExiCC_To ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV26TFPrdCanRes ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV27TFPrdCanRes_To ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV28TFRecLote ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                           Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) ,
                                           Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) ,
                                           AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                           AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                           AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                           AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                           AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                           AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                           AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                           AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                           Integer.valueOf(AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod) ,
                                           Byte.valueOf(AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo) ,
                                           AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                           Short.valueOf(AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum), 6, "%") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote), 26, "%") ;
      /* Using cursor P09EV2 */
      pr_default.execute(0, new Object[] {AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, Integer.valueOf(AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod), Byte.valueOf(AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo), AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, Short.valueOf(AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq), lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin), Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to), lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc, AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel, AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon, AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm, AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to, lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9EV2 = false ;
         A719PrdNum = P09EV2_A719PrdNum[0] ;
         n719PrdNum = P09EV2_n719PrdNum[0] ;
         A396EmprCod = P09EV2_A396EmprCod[0] ;
         A129BarCod = P09EV2_A129BarCod[0] ;
         A132BarCodReo = P09EV2_A132BarCodReo[0] ;
         A130BarCodPar = P09EV2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EV2_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09EV2_A872RecPrdNum[0] ;
         A5725RecLote = P09EV2_A5725RecLote[0] ;
         A685PrdCanRes = P09EV2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EV2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EV2_A704PrdExiAlm[0] ;
         A431FacCon = P09EV2_A431FacCon[0] ;
         A875RecPrdDsc = P09EV2_A875RecPrdDsc[0] ;
         A811RecLin = P09EV2_A811RecLin[0] ;
         A1273RecLinPro = P09EV2_A1273RecLinPro[0] ;
         A685PrdCanRes = P09EV2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EV2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EV2_A704PrdExiAlm[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09EV2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09EV2_A129BarCod[0] == A129BarCod ) && ( P09EV2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09EV2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09EV2_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09EV2_A872RecPrdNum[0], A872RecPrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk9EV2 = false ;
            A811RecLin = P09EV2_A811RecLin[0] ;
            A1273RecLinPro = P09EV2_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9EV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV34Option = A872RecPrdNum ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EV2 )
         {
            brk9EV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFRecPrdDsc = AV30SearchTxt ;
      AV15TFRecPrdDsc_Sel = "" ;
      AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV49emprcod ;
      AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV50barcod ;
      AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV51barcodreo ;
      AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV52barcodpar ;
      AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV53reclinmaq ;
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV48FilterFullText ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV10TFRecLin ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV11TFRecLin_To ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV12TFRecPrdNum ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV13TFRecPrdNum_Sel ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV14TFRecPrdDsc ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV15TFRecPrdDsc_Sel ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV16TFFacCon ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV17TFFacCon_To ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV22TFPrdExiAlm ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV23TFPrdExiAlm_To ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV24TFPrdExiCC ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV25TFPrdExiCC_To ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV26TFPrdCanRes ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV27TFPrdCanRes_To ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV28TFRecLote ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                           Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) ,
                                           Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) ,
                                           AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                           AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                           AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                           AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                           AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                           AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                           AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                           AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                           Integer.valueOf(AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod) ,
                                           Byte.valueOf(AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo) ,
                                           AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                           Short.valueOf(AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum), 6, "%") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote), 26, "%") ;
      /* Using cursor P09EV3 */
      pr_default.execute(1, new Object[] {AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, Integer.valueOf(AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod), Byte.valueOf(AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo), AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, Short.valueOf(AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq), lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin), Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to), lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc, AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel, AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon, AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm, AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to, lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9EV4 = false ;
         A719PrdNum = P09EV3_A719PrdNum[0] ;
         n719PrdNum = P09EV3_n719PrdNum[0] ;
         A396EmprCod = P09EV3_A396EmprCod[0] ;
         A129BarCod = P09EV3_A129BarCod[0] ;
         A132BarCodReo = P09EV3_A132BarCodReo[0] ;
         A130BarCodPar = P09EV3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EV3_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09EV3_A875RecPrdDsc[0] ;
         A5725RecLote = P09EV3_A5725RecLote[0] ;
         A685PrdCanRes = P09EV3_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EV3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EV3_A704PrdExiAlm[0] ;
         A431FacCon = P09EV3_A431FacCon[0] ;
         A872RecPrdNum = P09EV3_A872RecPrdNum[0] ;
         A811RecLin = P09EV3_A811RecLin[0] ;
         A1273RecLinPro = P09EV3_A1273RecLinPro[0] ;
         A685PrdCanRes = P09EV3_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EV3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EV3_A704PrdExiAlm[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09EV3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09EV3_A129BarCod[0] == A129BarCod ) && ( P09EV3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09EV3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09EV3_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09EV3_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brk9EV4 = false ;
            A811RecLin = P09EV3_A811RecLin[0] ;
            A1273RecLinPro = P09EV3_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9EV4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV34Option = A875RecPrdDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EV4 )
         {
            brk9EV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV28TFRecLote = AV30SearchTxt ;
      AV29TFRecLote_Sel = "" ;
      AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV49emprcod ;
      AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV50barcod ;
      AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV51barcodreo ;
      AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV52barcodpar ;
      AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV53reclinmaq ;
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV48FilterFullText ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV10TFRecLin ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV11TFRecLin_To ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV12TFRecPrdNum ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV13TFRecPrdNum_Sel ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV14TFRecPrdDsc ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV15TFRecPrdDsc_Sel ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV16TFFacCon ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV17TFFacCon_To ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV22TFPrdExiAlm ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV23TFPrdExiAlm_To ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV24TFPrdExiCC ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV25TFPrdExiCC_To ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV26TFPrdCanRes ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV27TFPrdCanRes_To ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV28TFRecLote ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                           Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) ,
                                           Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) ,
                                           AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                           AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                           AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                           AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                           AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                           AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                           AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                           AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                           Integer.valueOf(AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod) ,
                                           Byte.valueOf(AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo) ,
                                           AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                           Short.valueOf(AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum), 6, "%") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote), 26, "%") ;
      /* Using cursor P09EV4 */
      pr_default.execute(2, new Object[] {AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, Integer.valueOf(AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod), Byte.valueOf(AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo), AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, Short.valueOf(AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq), lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin), Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to), lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc, AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel, AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon, AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm, AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to, lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9EV6 = false ;
         A719PrdNum = P09EV4_A719PrdNum[0] ;
         n719PrdNum = P09EV4_n719PrdNum[0] ;
         A396EmprCod = P09EV4_A396EmprCod[0] ;
         A129BarCod = P09EV4_A129BarCod[0] ;
         A132BarCodReo = P09EV4_A132BarCodReo[0] ;
         A130BarCodPar = P09EV4_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EV4_A2804RecLinMaq[0] ;
         A5725RecLote = P09EV4_A5725RecLote[0] ;
         A685PrdCanRes = P09EV4_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EV4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EV4_A704PrdExiAlm[0] ;
         A431FacCon = P09EV4_A431FacCon[0] ;
         A875RecPrdDsc = P09EV4_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09EV4_A872RecPrdNum[0] ;
         A811RecLin = P09EV4_A811RecLin[0] ;
         A1273RecLinPro = P09EV4_A1273RecLinPro[0] ;
         A685PrdCanRes = P09EV4_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EV4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EV4_A704PrdExiAlm[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09EV4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09EV4_A129BarCod[0] == A129BarCod ) && ( P09EV4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09EV4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09EV4_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P09EV4_A5725RecLote[0], A5725RecLote) == 0 ) ) )
            {
               if (true) break;
            }
            brk9EV6 = false ;
            A811RecLin = P09EV4_A811RecLin[0] ;
            A1273RecLinPro = P09EV4_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9EV6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5725RecLote)==0) )
         {
            AV34Option = A5725RecLote ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EV6 )
         {
            brk9EV6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cierrerecetastinte_incidenciasgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = cierrerecetastinte_incidenciasgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = cierrerecetastinte_incidenciasgetfilterdata.this.AV41OptionIndexesJson;
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
      AV12TFRecPrdNum = "" ;
      AV13TFRecPrdNum_Sel = "" ;
      AV14TFRecPrdDsc = "" ;
      AV15TFRecPrdDsc_Sel = "" ;
      AV16TFFacCon = DecimalUtil.ZERO ;
      AV17TFFacCon_To = DecimalUtil.ZERO ;
      AV22TFPrdExiAlm = DecimalUtil.ZERO ;
      AV23TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV24TFPrdExiCC = DecimalUtil.ZERO ;
      AV25TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV26TFPrdCanRes = DecimalUtil.ZERO ;
      AV27TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV28TFRecLote = "" ;
      AV29TFRecLote_Sel = "" ;
      AV49emprcod = "" ;
      AV52barcodpar = "" ;
      A872RecPrdNum = "" ;
      AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = "" ;
      AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = "" ;
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = "" ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = "" ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = DecimalUtil.ZERO ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = DecimalUtil.ZERO ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = DecimalUtil.ZERO ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = DecimalUtil.ZERO ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = DecimalUtil.ZERO ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = DecimalUtil.ZERO ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = DecimalUtil.ZERO ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09EV2_A719PrdNum = new String[] {""} ;
      P09EV2_n719PrdNum = new boolean[] {false} ;
      P09EV2_A396EmprCod = new String[] {""} ;
      P09EV2_A129BarCod = new int[1] ;
      P09EV2_A132BarCodReo = new byte[1] ;
      P09EV2_A130BarCodPar = new String[] {""} ;
      P09EV2_A2804RecLinMaq = new short[1] ;
      P09EV2_A872RecPrdNum = new String[] {""} ;
      P09EV2_A5725RecLote = new String[] {""} ;
      P09EV2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV2_A875RecPrdDsc = new String[] {""} ;
      P09EV2_A811RecLin = new short[1] ;
      P09EV2_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      AV34Option = "" ;
      P09EV3_A719PrdNum = new String[] {""} ;
      P09EV3_n719PrdNum = new boolean[] {false} ;
      P09EV3_A396EmprCod = new String[] {""} ;
      P09EV3_A129BarCod = new int[1] ;
      P09EV3_A132BarCodReo = new byte[1] ;
      P09EV3_A130BarCodPar = new String[] {""} ;
      P09EV3_A2804RecLinMaq = new short[1] ;
      P09EV3_A875RecPrdDsc = new String[] {""} ;
      P09EV3_A5725RecLote = new String[] {""} ;
      P09EV3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV3_A872RecPrdNum = new String[] {""} ;
      P09EV3_A811RecLin = new short[1] ;
      P09EV3_A1273RecLinPro = new byte[1] ;
      P09EV4_A719PrdNum = new String[] {""} ;
      P09EV4_n719PrdNum = new boolean[] {false} ;
      P09EV4_A396EmprCod = new String[] {""} ;
      P09EV4_A129BarCod = new int[1] ;
      P09EV4_A132BarCodReo = new byte[1] ;
      P09EV4_A130BarCodPar = new String[] {""} ;
      P09EV4_A2804RecLinMaq = new short[1] ;
      P09EV4_A5725RecLote = new String[] {""} ;
      P09EV4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EV4_A875RecPrdDsc = new String[] {""} ;
      P09EV4_A872RecPrdNum = new String[] {""} ;
      P09EV4_A811RecLin = new short[1] ;
      P09EV4_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidenciasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09EV2_A719PrdNum, P09EV2_n719PrdNum, P09EV2_A396EmprCod, P09EV2_A129BarCod, P09EV2_A132BarCodReo, P09EV2_A130BarCodPar, P09EV2_A2804RecLinMaq, P09EV2_A872RecPrdNum, P09EV2_A5725RecLote, P09EV2_A685PrdCanRes,
            P09EV2_A705PrdExiCC, P09EV2_A704PrdExiAlm, P09EV2_A431FacCon, P09EV2_A875RecPrdDsc, P09EV2_A811RecLin, P09EV2_A1273RecLinPro
            }
            , new Object[] {
            P09EV3_A719PrdNum, P09EV3_n719PrdNum, P09EV3_A396EmprCod, P09EV3_A129BarCod, P09EV3_A132BarCodReo, P09EV3_A130BarCodPar, P09EV3_A2804RecLinMaq, P09EV3_A875RecPrdDsc, P09EV3_A5725RecLote, P09EV3_A685PrdCanRes,
            P09EV3_A705PrdExiCC, P09EV3_A704PrdExiAlm, P09EV3_A431FacCon, P09EV3_A872RecPrdNum, P09EV3_A811RecLin, P09EV3_A1273RecLinPro
            }
            , new Object[] {
            P09EV4_A719PrdNum, P09EV4_n719PrdNum, P09EV4_A396EmprCod, P09EV4_A129BarCod, P09EV4_A132BarCodReo, P09EV4_A130BarCodPar, P09EV4_A2804RecLinMaq, P09EV4_A5725RecLote, P09EV4_A685PrdCanRes, P09EV4_A705PrdExiCC,
            P09EV4_A704PrdExiAlm, P09EV4_A431FacCon, P09EV4_A875RecPrdDsc, P09EV4_A872RecPrdNum, P09EV4_A811RecLin, P09EV4_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV51barcodreo ;
   private byte AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short AV10TFRecLin ;
   private short AV11TFRecLin_To ;
   private short AV53reclinmaq ;
   private short AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ;
   private short AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ;
   private short AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV50barcod ;
   private int AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ;
   private int A129BarCod ;
   private long AV42count ;
   private java.math.BigDecimal AV16TFFacCon ;
   private java.math.BigDecimal AV17TFFacCon_To ;
   private java.math.BigDecimal AV22TFPrdExiAlm ;
   private java.math.BigDecimal AV23TFPrdExiAlm_To ;
   private java.math.BigDecimal AV24TFPrdExiCC ;
   private java.math.BigDecimal AV25TFPrdExiCC_To ;
   private java.math.BigDecimal AV26TFPrdCanRes ;
   private java.math.BigDecimal AV27TFPrdCanRes_To ;
   private java.math.BigDecimal AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ;
   private java.math.BigDecimal AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ;
   private java.math.BigDecimal AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ;
   private java.math.BigDecimal AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ;
   private java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ;
   private java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ;
   private java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ;
   private java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV12TFRecPrdNum ;
   private String AV13TFRecPrdNum_Sel ;
   private String AV14TFRecPrdDsc ;
   private String AV15TFRecPrdDsc_Sel ;
   private String AV28TFRecLote ;
   private String AV29TFRecLote_Sel ;
   private String AV49emprcod ;
   private String AV52barcodpar ;
   private String A872RecPrdNum ;
   private String AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ;
   private String AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ;
   private String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ;
   private String AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ;
   private String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ;
   private String scmdbuf ;
   private String lV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String lV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String lV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String A875RecPrdDsc ;
   private String A5725RecLote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private boolean brk9EV2 ;
   private boolean n719PrdNum ;
   private boolean brk9EV4 ;
   private boolean brk9EV6 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
   private String lV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EV2_A719PrdNum ;
   private boolean[] P09EV2_n719PrdNum ;
   private String[] P09EV2_A396EmprCod ;
   private int[] P09EV2_A129BarCod ;
   private byte[] P09EV2_A132BarCodReo ;
   private String[] P09EV2_A130BarCodPar ;
   private short[] P09EV2_A2804RecLinMaq ;
   private String[] P09EV2_A872RecPrdNum ;
   private String[] P09EV2_A5725RecLote ;
   private java.math.BigDecimal[] P09EV2_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EV2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EV2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EV2_A431FacCon ;
   private String[] P09EV2_A875RecPrdDsc ;
   private short[] P09EV2_A811RecLin ;
   private byte[] P09EV2_A1273RecLinPro ;
   private String[] P09EV3_A719PrdNum ;
   private boolean[] P09EV3_n719PrdNum ;
   private String[] P09EV3_A396EmprCod ;
   private int[] P09EV3_A129BarCod ;
   private byte[] P09EV3_A132BarCodReo ;
   private String[] P09EV3_A130BarCodPar ;
   private short[] P09EV3_A2804RecLinMaq ;
   private String[] P09EV3_A875RecPrdDsc ;
   private String[] P09EV3_A5725RecLote ;
   private java.math.BigDecimal[] P09EV3_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EV3_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EV3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EV3_A431FacCon ;
   private String[] P09EV3_A872RecPrdNum ;
   private short[] P09EV3_A811RecLin ;
   private byte[] P09EV3_A1273RecLinPro ;
   private String[] P09EV4_A719PrdNum ;
   private boolean[] P09EV4_n719PrdNum ;
   private String[] P09EV4_A396EmprCod ;
   private int[] P09EV4_A129BarCod ;
   private byte[] P09EV4_A132BarCodReo ;
   private String[] P09EV4_A130BarCodPar ;
   private short[] P09EV4_A2804RecLinMaq ;
   private String[] P09EV4_A5725RecLote ;
   private java.math.BigDecimal[] P09EV4_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EV4_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EV4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EV4_A431FacCon ;
   private String[] P09EV4_A875RecPrdDsc ;
   private String[] P09EV4_A872RecPrdNum ;
   private short[] P09EV4_A811RecLin ;
   private byte[] P09EV4_A1273RecLinPro ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class cierrerecetastinte_incidenciasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                          short AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ,
                                          short AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ,
                                          String AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                          String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                          String AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                          java.math.BigDecimal AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                          java.math.BigDecimal AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                          java.math.BigDecimal AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                          java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                          String AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          String AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                          int AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                          byte AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                          String AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                          short AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon," ;
      scmdbuf += " T1.RecPrdDsc, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09EV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                          short AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ,
                                          short AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ,
                                          String AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                          String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                          String AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                          java.math.BigDecimal AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                          java.math.BigDecimal AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                          java.math.BigDecimal AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                          java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                          String AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          String AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                          int AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                          byte AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                          String AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                          short AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon," ;
      scmdbuf += " T1.RecPrdNum, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09EV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                          short AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ,
                                          short AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ,
                                          String AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                          String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                          String AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                          java.math.BigDecimal AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                          java.math.BigDecimal AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                          java.math.BigDecimal AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                          java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                          String AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          String AV59Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                          int AV60Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                          byte AV61Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                          String AV62Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                          short AV63Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon, T1.RecPrdDsc," ;
      scmdbuf += " T1.RecPrdNum, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
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
                  return conditional_P09EV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() );
            case 1 :
                  return conditional_P09EV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() );
            case 2 :
                  return conditional_P09EV4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
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
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
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
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
      }
   }

}

