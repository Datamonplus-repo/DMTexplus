package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadeacabados02_wpgetfilterdata extends GXProcedure
{
   public recetadeacabados02_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadeacabados02_wpgetfilterdata.class ), "" );
   }

   public recetadeacabados02_wpgetfilterdata( int remoteHandle ,
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
      recetadeacabados02_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetadeacabados02_wpgetfilterdata.this.AV36DDOName = aP0;
      recetadeacabados02_wpgetfilterdata.this.AV34SearchTxt = aP1;
      recetadeacabados02_wpgetfilterdata.this.AV35SearchTxtTo = aP2;
      recetadeacabados02_wpgetfilterdata.this.aP3 = aP3;
      recetadeacabados02_wpgetfilterdata.this.aP4 = aP4;
      recetadeacabados02_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_PROFORCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_RECPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDNUMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_RECPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_RECLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLOTEOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV39Options.toJSonString(false) ;
      AV43OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV44OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("FormulacionTinte.RecetadeAcabados02_wpGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeAcabados02_wpGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("FormulacionTinte.RecetadeAcabados02_wpGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV12TFProForCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV13TFProForCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV14TFProForDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV15TFProForDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV16TFRecLin = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFRecLin_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV18TFRecPrdNum = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV19TFRecPrdNum_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV20TFRecPrdDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV21TFRecPrdDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV22TFFacCon = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFFacCon_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV24TFPrdCant = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdCant_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV26TFForPrdDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV27TFForPrdDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV28TFRecForNro = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFRecForNro_To = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV30TFRecPrdTnq = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFRecPrdTnq_To = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV32TFRecLote = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV33TFRecLote_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV53Emprcod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV54Barcod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV55Barcodreo = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV56Barcodpar = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV57Reclinmaq = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODE") == 0 )
         {
            Gx_mode = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForCod = AV34SearchTxt ;
      AV13TFProForCod_Sel = "" ;
      AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) ,
                                           AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                           AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                           AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                           AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) ,
                                           AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                           AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                           AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                           AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                           AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                           AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                           AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                           AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                           AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                           AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                           AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57Reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod), 6, "%") ;
      lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09GU2 */
      pr_default.execute(0, new Object[] {AV53Emprcod, Integer.valueOf(AV54Barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57Reclinmaq), Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to), lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod, AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel, lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc, AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin), Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to), lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum, AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel, lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc, AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to, lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc, AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro), Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to), lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote, AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9GU2 = false ;
         A490ForPrdUMe = P09GU2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09GU2_n490ForPrdUMe[0] ;
         A396EmprCod = P09GU2_A396EmprCod[0] ;
         A129BarCod = P09GU2_A129BarCod[0] ;
         A132BarCodReo = P09GU2_A132BarCodReo[0] ;
         A130BarCodPar = P09GU2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09GU2_A2804RecLinMaq[0] ;
         A764ProForCod = P09GU2_A764ProForCod[0] ;
         A5725RecLote = P09GU2_A5725RecLote[0] ;
         A3274RecPrdTnq = P09GU2_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09GU2_A2394RecForNro[0] ;
         A488ForPrdDsc = P09GU2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU2_n488ForPrdDsc[0] ;
         A686PrdCant = P09GU2_A686PrdCant[0] ;
         A431FacCon = P09GU2_A431FacCon[0] ;
         A875RecPrdDsc = P09GU2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09GU2_A872RecPrdNum[0] ;
         A811RecLin = P09GU2_A811RecLin[0] ;
         A766ProForDsc = P09GU2_A766ProForDsc[0] ;
         A1273RecLinPro = P09GU2_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09GU2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU2_n488ForPrdDsc[0] ;
         A764ProForCod = P09GU2_A764ProForCod[0] ;
         A766ProForDsc = P09GU2_A766ProForDsc[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09GU2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk9GU2 = false ;
            A396EmprCod = P09GU2_A396EmprCod[0] ;
            A129BarCod = P09GU2_A129BarCod[0] ;
            A132BarCodReo = P09GU2_A132BarCodReo[0] ;
            A130BarCodPar = P09GU2_A130BarCodPar[0] ;
            A2804RecLinMaq = P09GU2_A2804RecLinMaq[0] ;
            A811RecLin = P09GU2_A811RecLin[0] ;
            A1273RecLinPro = P09GU2_A1273RecLinPro[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9GU2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV38Option = A764ProForCod ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GU2 )
         {
            brk9GU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc = AV34SearchTxt ;
      AV15TFProForDsc_Sel = "" ;
      AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) ,
                                           AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                           AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                           AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                           AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) ,
                                           AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                           AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                           AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                           AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                           AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                           AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                           AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                           AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                           AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                           AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                           AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57Reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod), 6, "%") ;
      lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09GU3 */
      pr_default.execute(1, new Object[] {AV53Emprcod, Integer.valueOf(AV54Barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57Reclinmaq), Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to), lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod, AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel, lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc, AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin), Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to), lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum, AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel, lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc, AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to, lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc, AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro), Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to), lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote, AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9GU4 = false ;
         A490ForPrdUMe = P09GU3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09GU3_n490ForPrdUMe[0] ;
         A396EmprCod = P09GU3_A396EmprCod[0] ;
         A129BarCod = P09GU3_A129BarCod[0] ;
         A132BarCodReo = P09GU3_A132BarCodReo[0] ;
         A130BarCodPar = P09GU3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09GU3_A2804RecLinMaq[0] ;
         A766ProForDsc = P09GU3_A766ProForDsc[0] ;
         A5725RecLote = P09GU3_A5725RecLote[0] ;
         A3274RecPrdTnq = P09GU3_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09GU3_A2394RecForNro[0] ;
         A488ForPrdDsc = P09GU3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU3_n488ForPrdDsc[0] ;
         A686PrdCant = P09GU3_A686PrdCant[0] ;
         A431FacCon = P09GU3_A431FacCon[0] ;
         A875RecPrdDsc = P09GU3_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09GU3_A872RecPrdNum[0] ;
         A811RecLin = P09GU3_A811RecLin[0] ;
         A764ProForCod = P09GU3_A764ProForCod[0] ;
         A1273RecLinPro = P09GU3_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09GU3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU3_n488ForPrdDsc[0] ;
         A764ProForCod = P09GU3_A764ProForCod[0] ;
         A766ProForDsc = P09GU3_A766ProForDsc[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09GU3_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brk9GU4 = false ;
            A396EmprCod = P09GU3_A396EmprCod[0] ;
            A129BarCod = P09GU3_A129BarCod[0] ;
            A132BarCodReo = P09GU3_A132BarCodReo[0] ;
            A130BarCodPar = P09GU3_A130BarCodPar[0] ;
            A2804RecLinMaq = P09GU3_A2804RecLinMaq[0] ;
            A811RecLin = P09GU3_A811RecLin[0] ;
            A764ProForCod = P09GU3_A764ProForCod[0] ;
            A1273RecLinPro = P09GU3_A1273RecLinPro[0] ;
            A764ProForCod = P09GU3_A764ProForCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9GU4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV38Option = A766ProForDsc ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GU4 )
         {
            brk9GU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFRecPrdNum = AV34SearchTxt ;
      AV19TFRecPrdNum_Sel = "" ;
      AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) ,
                                           AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                           AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                           AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                           AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) ,
                                           AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                           AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                           AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                           AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                           AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                           AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                           AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                           AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                           AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                           AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                           AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57Reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod), 6, "%") ;
      lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09GU4 */
      pr_default.execute(2, new Object[] {AV53Emprcod, Integer.valueOf(AV54Barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57Reclinmaq), Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to), lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod, AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel, lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc, AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin), Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to), lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum, AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel, lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc, AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to, lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc, AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro), Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to), lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote, AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9GU6 = false ;
         A490ForPrdUMe = P09GU4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09GU4_n490ForPrdUMe[0] ;
         A396EmprCod = P09GU4_A396EmprCod[0] ;
         A129BarCod = P09GU4_A129BarCod[0] ;
         A132BarCodReo = P09GU4_A132BarCodReo[0] ;
         A130BarCodPar = P09GU4_A130BarCodPar[0] ;
         A2804RecLinMaq = P09GU4_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09GU4_A872RecPrdNum[0] ;
         A5725RecLote = P09GU4_A5725RecLote[0] ;
         A3274RecPrdTnq = P09GU4_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09GU4_A2394RecForNro[0] ;
         A488ForPrdDsc = P09GU4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU4_n488ForPrdDsc[0] ;
         A686PrdCant = P09GU4_A686PrdCant[0] ;
         A431FacCon = P09GU4_A431FacCon[0] ;
         A875RecPrdDsc = P09GU4_A875RecPrdDsc[0] ;
         A811RecLin = P09GU4_A811RecLin[0] ;
         A766ProForDsc = P09GU4_A766ProForDsc[0] ;
         A764ProForCod = P09GU4_A764ProForCod[0] ;
         A1273RecLinPro = P09GU4_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09GU4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU4_n488ForPrdDsc[0] ;
         A764ProForCod = P09GU4_A764ProForCod[0] ;
         A766ProForDsc = P09GU4_A766ProForDsc[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09GU4_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brk9GU6 = false ;
            A396EmprCod = P09GU4_A396EmprCod[0] ;
            A129BarCod = P09GU4_A129BarCod[0] ;
            A132BarCodReo = P09GU4_A132BarCodReo[0] ;
            A130BarCodPar = P09GU4_A130BarCodPar[0] ;
            A2804RecLinMaq = P09GU4_A2804RecLinMaq[0] ;
            A811RecLin = P09GU4_A811RecLin[0] ;
            A1273RecLinPro = P09GU4_A1273RecLinPro[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9GU6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV38Option = A872RecPrdNum ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GU6 )
         {
            brk9GU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFRecPrdDsc = AV34SearchTxt ;
      AV21TFRecPrdDsc_Sel = "" ;
      AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) ,
                                           AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                           AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                           AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                           AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) ,
                                           AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                           AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                           AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                           AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                           AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                           AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                           AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                           AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                           AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                           AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                           AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57Reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod), 6, "%") ;
      lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09GU5 */
      pr_default.execute(3, new Object[] {AV53Emprcod, Integer.valueOf(AV54Barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57Reclinmaq), Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to), lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod, AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel, lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc, AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin), Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to), lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum, AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel, lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc, AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to, lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc, AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro), Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to), lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote, AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9GU8 = false ;
         A490ForPrdUMe = P09GU5_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09GU5_n490ForPrdUMe[0] ;
         A396EmprCod = P09GU5_A396EmprCod[0] ;
         A129BarCod = P09GU5_A129BarCod[0] ;
         A132BarCodReo = P09GU5_A132BarCodReo[0] ;
         A130BarCodPar = P09GU5_A130BarCodPar[0] ;
         A2804RecLinMaq = P09GU5_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09GU5_A875RecPrdDsc[0] ;
         A5725RecLote = P09GU5_A5725RecLote[0] ;
         A3274RecPrdTnq = P09GU5_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09GU5_A2394RecForNro[0] ;
         A488ForPrdDsc = P09GU5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU5_n488ForPrdDsc[0] ;
         A686PrdCant = P09GU5_A686PrdCant[0] ;
         A431FacCon = P09GU5_A431FacCon[0] ;
         A872RecPrdNum = P09GU5_A872RecPrdNum[0] ;
         A811RecLin = P09GU5_A811RecLin[0] ;
         A766ProForDsc = P09GU5_A766ProForDsc[0] ;
         A764ProForCod = P09GU5_A764ProForCod[0] ;
         A1273RecLinPro = P09GU5_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09GU5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU5_n488ForPrdDsc[0] ;
         A764ProForCod = P09GU5_A764ProForCod[0] ;
         A766ProForDsc = P09GU5_A766ProForDsc[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09GU5_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brk9GU8 = false ;
            A396EmprCod = P09GU5_A396EmprCod[0] ;
            A129BarCod = P09GU5_A129BarCod[0] ;
            A132BarCodReo = P09GU5_A132BarCodReo[0] ;
            A130BarCodPar = P09GU5_A130BarCodPar[0] ;
            A2804RecLinMaq = P09GU5_A2804RecLinMaq[0] ;
            A811RecLin = P09GU5_A811RecLin[0] ;
            A1273RecLinPro = P09GU5_A1273RecLinPro[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9GU8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV38Option = A875RecPrdDsc ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GU8 )
         {
            brk9GU8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFForPrdDsc = AV34SearchTxt ;
      AV27TFForPrdDsc_Sel = "" ;
      AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) ,
                                           AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                           AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                           AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                           AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) ,
                                           AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                           AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                           AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                           AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                           AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                           AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                           AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                           AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                           AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                           AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                           AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57Reclinmaq) ,
                                           AV53Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod), 6, "%") ;
      lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09GU6 */
      pr_default.execute(4, new Object[] {AV53Emprcod, Integer.valueOf(AV54Barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57Reclinmaq), Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to), lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod, AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel, lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc, AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin), Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to), lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum, AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel, lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc, AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to, lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc, AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro), Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to), lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote, AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9GU10 = false ;
         A490ForPrdUMe = P09GU6_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09GU6_n490ForPrdUMe[0] ;
         A396EmprCod = P09GU6_A396EmprCod[0] ;
         A2804RecLinMaq = P09GU6_A2804RecLinMaq[0] ;
         A130BarCodPar = P09GU6_A130BarCodPar[0] ;
         A132BarCodReo = P09GU6_A132BarCodReo[0] ;
         A129BarCod = P09GU6_A129BarCod[0] ;
         A5725RecLote = P09GU6_A5725RecLote[0] ;
         A3274RecPrdTnq = P09GU6_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09GU6_A2394RecForNro[0] ;
         A488ForPrdDsc = P09GU6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU6_n488ForPrdDsc[0] ;
         A686PrdCant = P09GU6_A686PrdCant[0] ;
         A431FacCon = P09GU6_A431FacCon[0] ;
         A875RecPrdDsc = P09GU6_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09GU6_A872RecPrdNum[0] ;
         A811RecLin = P09GU6_A811RecLin[0] ;
         A766ProForDsc = P09GU6_A766ProForDsc[0] ;
         A764ProForCod = P09GU6_A764ProForCod[0] ;
         A1273RecLinPro = P09GU6_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09GU6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU6_n488ForPrdDsc[0] ;
         A764ProForCod = P09GU6_A764ProForCod[0] ;
         A766ProForDsc = P09GU6_A766ProForDsc[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09GU6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09GU6_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk9GU10 = false ;
            A2804RecLinMaq = P09GU6_A2804RecLinMaq[0] ;
            A130BarCodPar = P09GU6_A130BarCodPar[0] ;
            A132BarCodReo = P09GU6_A132BarCodReo[0] ;
            A129BarCod = P09GU6_A129BarCod[0] ;
            A811RecLin = P09GU6_A811RecLin[0] ;
            A1273RecLinPro = P09GU6_A1273RecLinPro[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9GU10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV38Option = A488ForPrdDsc ;
            AV37InsertIndex = 1 ;
            while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
            {
               AV37InsertIndex = (int)(AV37InsertIndex+1) ;
            }
            AV39Options.add(AV38Option, AV37InsertIndex);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GU10 )
         {
            brk9GU10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV32TFRecLote = AV34SearchTxt ;
      AV33TFRecLote_Sel = "" ;
      AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) ,
                                           AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                           AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                           AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                           AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) ,
                                           AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                           AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                           AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                           AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                           AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                           AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                           AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                           AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                           AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                           AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                           AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57Reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod), 6, "%") ;
      lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09GU7 */
      pr_default.execute(5, new Object[] {AV53Emprcod, Integer.valueOf(AV54Barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57Reclinmaq), Byte.valueOf(AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to), lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod, AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel, lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc, AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin), Short.valueOf(AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to), lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum, AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel, lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc, AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to, lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc, AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro), Byte.valueOf(AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to), lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote, AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9GU12 = false ;
         A490ForPrdUMe = P09GU7_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09GU7_n490ForPrdUMe[0] ;
         A396EmprCod = P09GU7_A396EmprCod[0] ;
         A129BarCod = P09GU7_A129BarCod[0] ;
         A132BarCodReo = P09GU7_A132BarCodReo[0] ;
         A130BarCodPar = P09GU7_A130BarCodPar[0] ;
         A2804RecLinMaq = P09GU7_A2804RecLinMaq[0] ;
         A5725RecLote = P09GU7_A5725RecLote[0] ;
         A3274RecPrdTnq = P09GU7_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09GU7_A2394RecForNro[0] ;
         A488ForPrdDsc = P09GU7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU7_n488ForPrdDsc[0] ;
         A686PrdCant = P09GU7_A686PrdCant[0] ;
         A431FacCon = P09GU7_A431FacCon[0] ;
         A875RecPrdDsc = P09GU7_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09GU7_A872RecPrdNum[0] ;
         A811RecLin = P09GU7_A811RecLin[0] ;
         A766ProForDsc = P09GU7_A766ProForDsc[0] ;
         A764ProForCod = P09GU7_A764ProForCod[0] ;
         A1273RecLinPro = P09GU7_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09GU7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09GU7_n488ForPrdDsc[0] ;
         A764ProForCod = P09GU7_A764ProForCod[0] ;
         A766ProForDsc = P09GU7_A766ProForDsc[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09GU7_A5725RecLote[0], A5725RecLote) == 0 ) )
         {
            brk9GU12 = false ;
            A396EmprCod = P09GU7_A396EmprCod[0] ;
            A129BarCod = P09GU7_A129BarCod[0] ;
            A132BarCodReo = P09GU7_A132BarCodReo[0] ;
            A130BarCodPar = P09GU7_A130BarCodPar[0] ;
            A2804RecLinMaq = P09GU7_A2804RecLinMaq[0] ;
            A811RecLin = P09GU7_A811RecLin[0] ;
            A1273RecLinPro = P09GU7_A1273RecLinPro[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9GU12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A5725RecLote)==0) )
         {
            AV38Option = A5725RecLote ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GU12 )
         {
            brk9GU12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadeacabados02_wpgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = recetadeacabados02_wpgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = recetadeacabados02_wpgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40OptionsJson = "" ;
      AV43OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFProForCod = "" ;
      AV13TFProForCod_Sel = "" ;
      AV14TFProForDsc = "" ;
      AV15TFProForDsc_Sel = "" ;
      AV18TFRecPrdNum = "" ;
      AV19TFRecPrdNum_Sel = "" ;
      AV20TFRecPrdDsc = "" ;
      AV21TFRecPrdDsc_Sel = "" ;
      AV22TFFacCon = DecimalUtil.ZERO ;
      AV23TFFacCon_To = DecimalUtil.ZERO ;
      AV24TFPrdCant = DecimalUtil.ZERO ;
      AV25TFPrdCant_To = DecimalUtil.ZERO ;
      AV26TFForPrdDsc = "" ;
      AV27TFForPrdDsc_Sel = "" ;
      AV32TFRecLote = "" ;
      AV33TFRecLote_Sel = "" ;
      AV53Emprcod = "" ;
      AV56Barcodpar = "" ;
      Gx_mode = "" ;
      A764ProForCod = "" ;
      AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = "" ;
      AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel = "" ;
      AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = "" ;
      AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel = "" ;
      AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = "" ;
      AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel = "" ;
      AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = "" ;
      AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel = "" ;
      AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon = DecimalUtil.ZERO ;
      AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant = DecimalUtil.ZERO ;
      AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to = DecimalUtil.ZERO ;
      AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = "" ;
      AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel = "" ;
      AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = "" ;
      AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod = "" ;
      lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc = "" ;
      lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum = "" ;
      lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc = "" ;
      lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc = "" ;
      lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote = "" ;
      A766ProForDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09GU2_A490ForPrdUMe = new byte[1] ;
      P09GU2_n490ForPrdUMe = new boolean[] {false} ;
      P09GU2_A396EmprCod = new String[] {""} ;
      P09GU2_A129BarCod = new int[1] ;
      P09GU2_A132BarCodReo = new byte[1] ;
      P09GU2_A130BarCodPar = new String[] {""} ;
      P09GU2_A2804RecLinMaq = new short[1] ;
      P09GU2_A764ProForCod = new String[] {""} ;
      P09GU2_A5725RecLote = new String[] {""} ;
      P09GU2_A3274RecPrdTnq = new byte[1] ;
      P09GU2_A2394RecForNro = new byte[1] ;
      P09GU2_A488ForPrdDsc = new String[] {""} ;
      P09GU2_n488ForPrdDsc = new boolean[] {false} ;
      P09GU2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU2_A875RecPrdDsc = new String[] {""} ;
      P09GU2_A872RecPrdNum = new String[] {""} ;
      P09GU2_A811RecLin = new short[1] ;
      P09GU2_A766ProForDsc = new String[] {""} ;
      P09GU2_A1273RecLinPro = new byte[1] ;
      AV38Option = "" ;
      P09GU3_A490ForPrdUMe = new byte[1] ;
      P09GU3_n490ForPrdUMe = new boolean[] {false} ;
      P09GU3_A396EmprCod = new String[] {""} ;
      P09GU3_A129BarCod = new int[1] ;
      P09GU3_A132BarCodReo = new byte[1] ;
      P09GU3_A130BarCodPar = new String[] {""} ;
      P09GU3_A2804RecLinMaq = new short[1] ;
      P09GU3_A766ProForDsc = new String[] {""} ;
      P09GU3_A5725RecLote = new String[] {""} ;
      P09GU3_A3274RecPrdTnq = new byte[1] ;
      P09GU3_A2394RecForNro = new byte[1] ;
      P09GU3_A488ForPrdDsc = new String[] {""} ;
      P09GU3_n488ForPrdDsc = new boolean[] {false} ;
      P09GU3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU3_A875RecPrdDsc = new String[] {""} ;
      P09GU3_A872RecPrdNum = new String[] {""} ;
      P09GU3_A811RecLin = new short[1] ;
      P09GU3_A764ProForCod = new String[] {""} ;
      P09GU3_A1273RecLinPro = new byte[1] ;
      P09GU4_A490ForPrdUMe = new byte[1] ;
      P09GU4_n490ForPrdUMe = new boolean[] {false} ;
      P09GU4_A396EmprCod = new String[] {""} ;
      P09GU4_A129BarCod = new int[1] ;
      P09GU4_A132BarCodReo = new byte[1] ;
      P09GU4_A130BarCodPar = new String[] {""} ;
      P09GU4_A2804RecLinMaq = new short[1] ;
      P09GU4_A872RecPrdNum = new String[] {""} ;
      P09GU4_A5725RecLote = new String[] {""} ;
      P09GU4_A3274RecPrdTnq = new byte[1] ;
      P09GU4_A2394RecForNro = new byte[1] ;
      P09GU4_A488ForPrdDsc = new String[] {""} ;
      P09GU4_n488ForPrdDsc = new boolean[] {false} ;
      P09GU4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU4_A875RecPrdDsc = new String[] {""} ;
      P09GU4_A811RecLin = new short[1] ;
      P09GU4_A766ProForDsc = new String[] {""} ;
      P09GU4_A764ProForCod = new String[] {""} ;
      P09GU4_A1273RecLinPro = new byte[1] ;
      P09GU5_A490ForPrdUMe = new byte[1] ;
      P09GU5_n490ForPrdUMe = new boolean[] {false} ;
      P09GU5_A396EmprCod = new String[] {""} ;
      P09GU5_A129BarCod = new int[1] ;
      P09GU5_A132BarCodReo = new byte[1] ;
      P09GU5_A130BarCodPar = new String[] {""} ;
      P09GU5_A2804RecLinMaq = new short[1] ;
      P09GU5_A875RecPrdDsc = new String[] {""} ;
      P09GU5_A5725RecLote = new String[] {""} ;
      P09GU5_A3274RecPrdTnq = new byte[1] ;
      P09GU5_A2394RecForNro = new byte[1] ;
      P09GU5_A488ForPrdDsc = new String[] {""} ;
      P09GU5_n488ForPrdDsc = new boolean[] {false} ;
      P09GU5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU5_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU5_A872RecPrdNum = new String[] {""} ;
      P09GU5_A811RecLin = new short[1] ;
      P09GU5_A766ProForDsc = new String[] {""} ;
      P09GU5_A764ProForCod = new String[] {""} ;
      P09GU5_A1273RecLinPro = new byte[1] ;
      P09GU6_A490ForPrdUMe = new byte[1] ;
      P09GU6_n490ForPrdUMe = new boolean[] {false} ;
      P09GU6_A396EmprCod = new String[] {""} ;
      P09GU6_A2804RecLinMaq = new short[1] ;
      P09GU6_A130BarCodPar = new String[] {""} ;
      P09GU6_A132BarCodReo = new byte[1] ;
      P09GU6_A129BarCod = new int[1] ;
      P09GU6_A5725RecLote = new String[] {""} ;
      P09GU6_A3274RecPrdTnq = new byte[1] ;
      P09GU6_A2394RecForNro = new byte[1] ;
      P09GU6_A488ForPrdDsc = new String[] {""} ;
      P09GU6_n488ForPrdDsc = new boolean[] {false} ;
      P09GU6_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU6_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU6_A875RecPrdDsc = new String[] {""} ;
      P09GU6_A872RecPrdNum = new String[] {""} ;
      P09GU6_A811RecLin = new short[1] ;
      P09GU6_A766ProForDsc = new String[] {""} ;
      P09GU6_A764ProForCod = new String[] {""} ;
      P09GU6_A1273RecLinPro = new byte[1] ;
      P09GU7_A490ForPrdUMe = new byte[1] ;
      P09GU7_n490ForPrdUMe = new boolean[] {false} ;
      P09GU7_A396EmprCod = new String[] {""} ;
      P09GU7_A129BarCod = new int[1] ;
      P09GU7_A132BarCodReo = new byte[1] ;
      P09GU7_A130BarCodPar = new String[] {""} ;
      P09GU7_A2804RecLinMaq = new short[1] ;
      P09GU7_A5725RecLote = new String[] {""} ;
      P09GU7_A3274RecPrdTnq = new byte[1] ;
      P09GU7_A2394RecForNro = new byte[1] ;
      P09GU7_A488ForPrdDsc = new String[] {""} ;
      P09GU7_n488ForPrdDsc = new boolean[] {false} ;
      P09GU7_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU7_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GU7_A875RecPrdDsc = new String[] {""} ;
      P09GU7_A872RecPrdNum = new String[] {""} ;
      P09GU7_A811RecLin = new short[1] ;
      P09GU7_A766ProForDsc = new String[] {""} ;
      P09GU7_A764ProForCod = new String[] {""} ;
      P09GU7_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadeacabados02_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09GU2_A490ForPrdUMe, P09GU2_n490ForPrdUMe, P09GU2_A396EmprCod, P09GU2_A129BarCod, P09GU2_A132BarCodReo, P09GU2_A130BarCodPar, P09GU2_A2804RecLinMaq, P09GU2_A764ProForCod, P09GU2_A5725RecLote, P09GU2_A3274RecPrdTnq,
            P09GU2_A2394RecForNro, P09GU2_A488ForPrdDsc, P09GU2_n488ForPrdDsc, P09GU2_A686PrdCant, P09GU2_A431FacCon, P09GU2_A875RecPrdDsc, P09GU2_A872RecPrdNum, P09GU2_A811RecLin, P09GU2_A766ProForDsc, P09GU2_A1273RecLinPro
            }
            , new Object[] {
            P09GU3_A490ForPrdUMe, P09GU3_n490ForPrdUMe, P09GU3_A396EmprCod, P09GU3_A129BarCod, P09GU3_A132BarCodReo, P09GU3_A130BarCodPar, P09GU3_A2804RecLinMaq, P09GU3_A766ProForDsc, P09GU3_A5725RecLote, P09GU3_A3274RecPrdTnq,
            P09GU3_A2394RecForNro, P09GU3_A488ForPrdDsc, P09GU3_n488ForPrdDsc, P09GU3_A686PrdCant, P09GU3_A431FacCon, P09GU3_A875RecPrdDsc, P09GU3_A872RecPrdNum, P09GU3_A811RecLin, P09GU3_A764ProForCod, P09GU3_A1273RecLinPro
            }
            , new Object[] {
            P09GU4_A490ForPrdUMe, P09GU4_n490ForPrdUMe, P09GU4_A396EmprCod, P09GU4_A129BarCod, P09GU4_A132BarCodReo, P09GU4_A130BarCodPar, P09GU4_A2804RecLinMaq, P09GU4_A872RecPrdNum, P09GU4_A5725RecLote, P09GU4_A3274RecPrdTnq,
            P09GU4_A2394RecForNro, P09GU4_A488ForPrdDsc, P09GU4_n488ForPrdDsc, P09GU4_A686PrdCant, P09GU4_A431FacCon, P09GU4_A875RecPrdDsc, P09GU4_A811RecLin, P09GU4_A766ProForDsc, P09GU4_A764ProForCod, P09GU4_A1273RecLinPro
            }
            , new Object[] {
            P09GU5_A490ForPrdUMe, P09GU5_n490ForPrdUMe, P09GU5_A396EmprCod, P09GU5_A129BarCod, P09GU5_A132BarCodReo, P09GU5_A130BarCodPar, P09GU5_A2804RecLinMaq, P09GU5_A875RecPrdDsc, P09GU5_A5725RecLote, P09GU5_A3274RecPrdTnq,
            P09GU5_A2394RecForNro, P09GU5_A488ForPrdDsc, P09GU5_n488ForPrdDsc, P09GU5_A686PrdCant, P09GU5_A431FacCon, P09GU5_A872RecPrdNum, P09GU5_A811RecLin, P09GU5_A766ProForDsc, P09GU5_A764ProForCod, P09GU5_A1273RecLinPro
            }
            , new Object[] {
            P09GU6_A490ForPrdUMe, P09GU6_n490ForPrdUMe, P09GU6_A396EmprCod, P09GU6_A2804RecLinMaq, P09GU6_A130BarCodPar, P09GU6_A132BarCodReo, P09GU6_A129BarCod, P09GU6_A5725RecLote, P09GU6_A3274RecPrdTnq, P09GU6_A2394RecForNro,
            P09GU6_A488ForPrdDsc, P09GU6_n488ForPrdDsc, P09GU6_A686PrdCant, P09GU6_A431FacCon, P09GU6_A875RecPrdDsc, P09GU6_A872RecPrdNum, P09GU6_A811RecLin, P09GU6_A766ProForDsc, P09GU6_A764ProForCod, P09GU6_A1273RecLinPro
            }
            , new Object[] {
            P09GU7_A490ForPrdUMe, P09GU7_n490ForPrdUMe, P09GU7_A396EmprCod, P09GU7_A129BarCod, P09GU7_A132BarCodReo, P09GU7_A130BarCodPar, P09GU7_A2804RecLinMaq, P09GU7_A5725RecLote, P09GU7_A3274RecPrdTnq, P09GU7_A2394RecForNro,
            P09GU7_A488ForPrdDsc, P09GU7_n488ForPrdDsc, P09GU7_A686PrdCant, P09GU7_A431FacCon, P09GU7_A875RecPrdDsc, P09GU7_A872RecPrdNum, P09GU7_A811RecLin, P09GU7_A766ProForDsc, P09GU7_A764ProForCod, P09GU7_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV28TFRecForNro ;
   private byte AV29TFRecForNro_To ;
   private byte AV30TFRecPrdTnq ;
   private byte AV31TFRecPrdTnq_To ;
   private byte AV55Barcodreo ;
   private byte AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro ;
   private byte AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to ;
   private byte AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro ;
   private byte AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to ;
   private byte AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq ;
   private byte AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private short AV16TFRecLin ;
   private short AV17TFRecLin_To ;
   private short AV57Reclinmaq ;
   private short AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin ;
   private short AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV54Barcod ;
   private int A129BarCod ;
   private int AV37InsertIndex ;
   private long AV46count ;
   private java.math.BigDecimal AV22TFFacCon ;
   private java.math.BigDecimal AV23TFFacCon_To ;
   private java.math.BigDecimal AV24TFPrdCant ;
   private java.math.BigDecimal AV25TFPrdCant_To ;
   private java.math.BigDecimal AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ;
   private java.math.BigDecimal AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ;
   private java.math.BigDecimal AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ;
   private java.math.BigDecimal AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV12TFProForCod ;
   private String AV13TFProForCod_Sel ;
   private String AV14TFProForDsc ;
   private String AV15TFProForDsc_Sel ;
   private String AV18TFRecPrdNum ;
   private String AV19TFRecPrdNum_Sel ;
   private String AV20TFRecPrdDsc ;
   private String AV21TFRecPrdDsc_Sel ;
   private String AV26TFForPrdDsc ;
   private String AV27TFForPrdDsc_Sel ;
   private String AV32TFRecLote ;
   private String AV33TFRecLote_Sel ;
   private String AV53Emprcod ;
   private String AV56Barcodpar ;
   private String Gx_mode ;
   private String A764ProForCod ;
   private String AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ;
   private String AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ;
   private String AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ;
   private String AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ;
   private String AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ;
   private String AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ;
   private String AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ;
   private String AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ;
   private String AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ;
   private String AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ;
   private String AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ;
   private String AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ;
   private String scmdbuf ;
   private String lV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ;
   private String lV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ;
   private String lV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ;
   private String lV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ;
   private String lV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ;
   private String lV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ;
   private String A766ProForDsc ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9GU2 ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean brk9GU4 ;
   private boolean brk9GU6 ;
   private boolean brk9GU8 ;
   private boolean brk9GU10 ;
   private boolean brk9GU12 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09GU2_A490ForPrdUMe ;
   private boolean[] P09GU2_n490ForPrdUMe ;
   private String[] P09GU2_A396EmprCod ;
   private int[] P09GU2_A129BarCod ;
   private byte[] P09GU2_A132BarCodReo ;
   private String[] P09GU2_A130BarCodPar ;
   private short[] P09GU2_A2804RecLinMaq ;
   private String[] P09GU2_A764ProForCod ;
   private String[] P09GU2_A5725RecLote ;
   private byte[] P09GU2_A3274RecPrdTnq ;
   private byte[] P09GU2_A2394RecForNro ;
   private String[] P09GU2_A488ForPrdDsc ;
   private boolean[] P09GU2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09GU2_A686PrdCant ;
   private java.math.BigDecimal[] P09GU2_A431FacCon ;
   private String[] P09GU2_A875RecPrdDsc ;
   private String[] P09GU2_A872RecPrdNum ;
   private short[] P09GU2_A811RecLin ;
   private String[] P09GU2_A766ProForDsc ;
   private byte[] P09GU2_A1273RecLinPro ;
   private byte[] P09GU3_A490ForPrdUMe ;
   private boolean[] P09GU3_n490ForPrdUMe ;
   private String[] P09GU3_A396EmprCod ;
   private int[] P09GU3_A129BarCod ;
   private byte[] P09GU3_A132BarCodReo ;
   private String[] P09GU3_A130BarCodPar ;
   private short[] P09GU3_A2804RecLinMaq ;
   private String[] P09GU3_A766ProForDsc ;
   private String[] P09GU3_A5725RecLote ;
   private byte[] P09GU3_A3274RecPrdTnq ;
   private byte[] P09GU3_A2394RecForNro ;
   private String[] P09GU3_A488ForPrdDsc ;
   private boolean[] P09GU3_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09GU3_A686PrdCant ;
   private java.math.BigDecimal[] P09GU3_A431FacCon ;
   private String[] P09GU3_A875RecPrdDsc ;
   private String[] P09GU3_A872RecPrdNum ;
   private short[] P09GU3_A811RecLin ;
   private String[] P09GU3_A764ProForCod ;
   private byte[] P09GU3_A1273RecLinPro ;
   private byte[] P09GU4_A490ForPrdUMe ;
   private boolean[] P09GU4_n490ForPrdUMe ;
   private String[] P09GU4_A396EmprCod ;
   private int[] P09GU4_A129BarCod ;
   private byte[] P09GU4_A132BarCodReo ;
   private String[] P09GU4_A130BarCodPar ;
   private short[] P09GU4_A2804RecLinMaq ;
   private String[] P09GU4_A872RecPrdNum ;
   private String[] P09GU4_A5725RecLote ;
   private byte[] P09GU4_A3274RecPrdTnq ;
   private byte[] P09GU4_A2394RecForNro ;
   private String[] P09GU4_A488ForPrdDsc ;
   private boolean[] P09GU4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09GU4_A686PrdCant ;
   private java.math.BigDecimal[] P09GU4_A431FacCon ;
   private String[] P09GU4_A875RecPrdDsc ;
   private short[] P09GU4_A811RecLin ;
   private String[] P09GU4_A766ProForDsc ;
   private String[] P09GU4_A764ProForCod ;
   private byte[] P09GU4_A1273RecLinPro ;
   private byte[] P09GU5_A490ForPrdUMe ;
   private boolean[] P09GU5_n490ForPrdUMe ;
   private String[] P09GU5_A396EmprCod ;
   private int[] P09GU5_A129BarCod ;
   private byte[] P09GU5_A132BarCodReo ;
   private String[] P09GU5_A130BarCodPar ;
   private short[] P09GU5_A2804RecLinMaq ;
   private String[] P09GU5_A875RecPrdDsc ;
   private String[] P09GU5_A5725RecLote ;
   private byte[] P09GU5_A3274RecPrdTnq ;
   private byte[] P09GU5_A2394RecForNro ;
   private String[] P09GU5_A488ForPrdDsc ;
   private boolean[] P09GU5_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09GU5_A686PrdCant ;
   private java.math.BigDecimal[] P09GU5_A431FacCon ;
   private String[] P09GU5_A872RecPrdNum ;
   private short[] P09GU5_A811RecLin ;
   private String[] P09GU5_A766ProForDsc ;
   private String[] P09GU5_A764ProForCod ;
   private byte[] P09GU5_A1273RecLinPro ;
   private byte[] P09GU6_A490ForPrdUMe ;
   private boolean[] P09GU6_n490ForPrdUMe ;
   private String[] P09GU6_A396EmprCod ;
   private short[] P09GU6_A2804RecLinMaq ;
   private String[] P09GU6_A130BarCodPar ;
   private byte[] P09GU6_A132BarCodReo ;
   private int[] P09GU6_A129BarCod ;
   private String[] P09GU6_A5725RecLote ;
   private byte[] P09GU6_A3274RecPrdTnq ;
   private byte[] P09GU6_A2394RecForNro ;
   private String[] P09GU6_A488ForPrdDsc ;
   private boolean[] P09GU6_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09GU6_A686PrdCant ;
   private java.math.BigDecimal[] P09GU6_A431FacCon ;
   private String[] P09GU6_A875RecPrdDsc ;
   private String[] P09GU6_A872RecPrdNum ;
   private short[] P09GU6_A811RecLin ;
   private String[] P09GU6_A766ProForDsc ;
   private String[] P09GU6_A764ProForCod ;
   private byte[] P09GU6_A1273RecLinPro ;
   private byte[] P09GU7_A490ForPrdUMe ;
   private boolean[] P09GU7_n490ForPrdUMe ;
   private String[] P09GU7_A396EmprCod ;
   private int[] P09GU7_A129BarCod ;
   private byte[] P09GU7_A132BarCodReo ;
   private String[] P09GU7_A130BarCodPar ;
   private short[] P09GU7_A2804RecLinMaq ;
   private String[] P09GU7_A5725RecLote ;
   private byte[] P09GU7_A3274RecPrdTnq ;
   private byte[] P09GU7_A2394RecForNro ;
   private String[] P09GU7_A488ForPrdDsc ;
   private boolean[] P09GU7_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09GU7_A686PrdCant ;
   private java.math.BigDecimal[] P09GU7_A431FacCon ;
   private String[] P09GU7_A875RecPrdDsc ;
   private String[] P09GU7_A872RecPrdNum ;
   private short[] P09GU7_A811RecLin ;
   private String[] P09GU7_A766ProForDsc ;
   private String[] P09GU7_A764ProForCod ;
   private byte[] P09GU7_A1273RecLinPro ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class recetadeacabados02_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro ,
                                          byte AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to ,
                                          String AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                          String AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                          String AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                          String AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                          short AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin ,
                                          short AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to ,
                                          String AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                          String AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                          String AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                          String AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                          byte AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro ,
                                          byte AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to ,
                                          byte AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq ,
                                          byte AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                          String AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57Reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T3.ProForCod, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09GU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro ,
                                          byte AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to ,
                                          String AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                          String AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                          String AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                          String AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                          short AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin ,
                                          short AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to ,
                                          String AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                          String AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                          String AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                          String AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                          byte AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro ,
                                          byte AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to ,
                                          byte AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq ,
                                          byte AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                          String AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57Reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T4.ProForDsc, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.ProForDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09GU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro ,
                                          byte AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to ,
                                          String AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                          String AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                          String AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                          String AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                          short AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin ,
                                          short AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to ,
                                          String AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                          String AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                          String AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                          String AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                          byte AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro ,
                                          byte AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to ,
                                          byte AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq ,
                                          byte AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                          String AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57Reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09GU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro ,
                                          byte AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to ,
                                          String AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                          String AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                          String AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                          String AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                          short AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin ,
                                          short AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to ,
                                          String AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                          String AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                          String AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                          String AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                          byte AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro ,
                                          byte AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to ,
                                          byte AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq ,
                                          byte AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                          String AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57Reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09GU6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro ,
                                          byte AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to ,
                                          String AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                          String AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                          String AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                          String AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                          short AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin ,
                                          short AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to ,
                                          String AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                          String AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                          String AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                          String AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                          byte AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro ,
                                          byte AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to ,
                                          byte AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq ,
                                          byte AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                          String AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          int A129BarCod ,
                                          int AV54Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57Reclinmaq ,
                                          String AV53Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[29];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant, T1.FacCon," ;
      scmdbuf += " T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09GU7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro ,
                                          byte AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to ,
                                          String AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel ,
                                          String AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod ,
                                          String AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel ,
                                          String AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc ,
                                          short AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin ,
                                          short AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to ,
                                          String AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum ,
                                          String AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to ,
                                          String AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel ,
                                          String AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc ,
                                          byte AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro ,
                                          byte AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to ,
                                          byte AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq ,
                                          byte AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel ,
                                          String AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57Reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[29];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant, T1.FacCon," ;
      scmdbuf += " T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Formulaciontinte_recetadeacabados02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_recetadeacabados02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_recetadeacabados02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_recetadeacabados02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_recetadeacabados02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_recetadeacabados02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_recetadeacabados02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_recetadeacabados02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadeacabados02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_recetadeacabados02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_recetadeacabados02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadeacabados02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_recetadeacabados02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_recetadeacabados02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_recetadeacabados02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_recetadeacabados02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadeacabados02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadeacabados02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_recetadeacabados02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadeacabados02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadeacabados02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadeacabados02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadeacabados02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadeacabados02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecLote" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P09GU2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 1 :
                  return conditional_P09GU3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 2 :
                  return conditional_P09GU4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 3 :
                  return conditional_P09GU5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 4 :
                  return conditional_P09GU6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 5 :
                  return conditional_P09GU7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GU6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GU7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
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
            case 3 :
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
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
            case 4 :
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
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
            case 5 :
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
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

