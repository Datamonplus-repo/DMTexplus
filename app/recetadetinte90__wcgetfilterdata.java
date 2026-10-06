package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte90__wcgetfilterdata extends GXProcedure
{
   public recetadetinte90__wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte90__wcgetfilterdata.class ), "" );
   }

   public recetadetinte90__wcgetfilterdata( int remoteHandle ,
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
      recetadetinte90__wcgetfilterdata.this.aP5 = new String[] {""};
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
      recetadetinte90__wcgetfilterdata.this.AV46DDOName = aP0;
      recetadetinte90__wcgetfilterdata.this.AV47SearchTxt = aP1;
      recetadetinte90__wcgetfilterdata.this.AV48SearchTxtTo = aP2;
      recetadetinte90__wcgetfilterdata.this.aP3 = aP3;
      recetadetinte90__wcgetfilterdata.this.aP4 = aP4;
      recetadetinte90__wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PROFORCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PROFORDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_RECPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_RECPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_FORPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_RECLOTE") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_RECMANAUT") == 0 )
      {
         /* Execute user subroutine: 'LOADRECMANAUTOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV49OptionsJson = AV36Options.toJSonString(false) ;
      AV50OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV39OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("RecetadeTinte90__WCGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetadeTinte90__WCGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("RecetadeTinte90__WCGridState"), null, null);
      }
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV12TFProForCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV13TFProForCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV14TFProForDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV15TFProForDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV16TFRecLin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFRecLin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV18TFRecPrdNum = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV19TFRecPrdNum_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV20TFRecPrdDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV21TFRecPrdDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV22TFFacCon = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFFacCon_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV24TFPrdCant = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdCant_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV26TFForPrdDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV27TFForPrdDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV28TFRecForNro = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFRecForNro_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV30TFRecPrdTnq = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFRecPrdTnq_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV32TFRecLote = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV33TFRecLote_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECMANAUT") == 0 )
         {
            AV60TFRecManAut = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECMANAUT_SEL") == 0 )
         {
            AV61TFRecManAut_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV53Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV54barcod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV55Barcodreo = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV56Barcodpar = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV57reclinmaq = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINPRO") == 0 )
         {
            AV59RecLinpro = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForCod = AV47SearchTxt ;
      AV13TFProForCod_Sel = "" ;
      AV66Recetadetinte90__wcds_1_tfreclinpro = AV10TFRecLinPro ;
      AV67Recetadetinte90__wcds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV68Recetadetinte90__wcds_3_tfproforcod = AV12TFProForCod ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = AV14TFProForDsc ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV72Recetadetinte90__wcds_7_tfreclin = AV16TFRecLin ;
      AV73Recetadetinte90__wcds_8_tfreclin_to = AV17TFRecLin_To ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV78Recetadetinte90__wcds_13_tffaccon = AV22TFFacCon ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = AV23TFFacCon_To ;
      AV80Recetadetinte90__wcds_15_tfprdcant = AV24TFPrdCant ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV84Recetadetinte90__wcds_19_tfrecfornro = AV28TFRecForNro ;
      AV85Recetadetinte90__wcds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV86Recetadetinte90__wcds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV87Recetadetinte90__wcds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV88Recetadetinte90__wcds_23_tfreclote = AV32TFRecLote ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = AV60TFRecManAut ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = AV61TFRecManAut_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV68Recetadetinte90__wcds_3_tfproforcod ,
                                           AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV78Recetadetinte90__wcds_13_tffaccon ,
                                           AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV80Recetadetinte90__wcds_15_tfprdcant ,
                                           AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV88Recetadetinte90__wcds_23_tfreclote ,
                                           AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                           A14055RecManAut ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57reclinmaq) ,
                                           Byte.valueOf(AV59RecLinpro) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV76Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV82Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV88Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV88Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV90Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor P0AH12 */
      pr_default.execute(0, new Object[] {AV53Emprcod, Integer.valueOf(AV54barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57reclinmaq), Byte.valueOf(AV59RecLinpro), Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to), lV68Recetadetinte90__wcds_3_tfproforcod, AV69Recetadetinte90__wcds_4_tfproforcod_sel, lV70Recetadetinte90__wcds_5_tfprofordsc, AV71Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to), lV74Recetadetinte90__wcds_9_tfrecprdnum, AV75Recetadetinte90__wcds_10_tfrecprdnum_sel, lV76Recetadetinte90__wcds_11_tfrecprddsc, AV77Recetadetinte90__wcds_12_tfrecprddsc_sel, AV78Recetadetinte90__wcds_13_tffaccon, AV79Recetadetinte90__wcds_14_tffaccon_to, AV80Recetadetinte90__wcds_15_tfprdcant, AV81Recetadetinte90__wcds_16_tfprdcant_to, lV82Recetadetinte90__wcds_17_tfforprddsc, AV83Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to), lV88Recetadetinte90__wcds_23_tfreclote, AV89Recetadetinte90__wcds_24_tfreclote_sel, lV90Recetadetinte90__wcds_25_tfrecmanaut, AV91Recetadetinte90__wcds_26_tfrecmanaut_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAH12 = false ;
         A490ForPrdUMe = P0AH12_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH12_n490ForPrdUMe[0] ;
         A396EmprCod = P0AH12_A396EmprCod[0] ;
         A129BarCod = P0AH12_A129BarCod[0] ;
         A132BarCodReo = P0AH12_A132BarCodReo[0] ;
         A130BarCodPar = P0AH12_A130BarCodPar[0] ;
         A2804RecLinMaq = P0AH12_A2804RecLinMaq[0] ;
         A1273RecLinPro = P0AH12_A1273RecLinPro[0] ;
         A764ProForCod = P0AH12_A764ProForCod[0] ;
         A14055RecManAut = P0AH12_A14055RecManAut[0] ;
         A5725RecLote = P0AH12_A5725RecLote[0] ;
         A3274RecPrdTnq = P0AH12_A3274RecPrdTnq[0] ;
         A2394RecForNro = P0AH12_A2394RecForNro[0] ;
         A488ForPrdDsc = P0AH12_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH12_n488ForPrdDsc[0] ;
         A686PrdCant = P0AH12_A686PrdCant[0] ;
         A431FacCon = P0AH12_A431FacCon[0] ;
         A875RecPrdDsc = P0AH12_A875RecPrdDsc[0] ;
         A872RecPrdNum = P0AH12_A872RecPrdNum[0] ;
         A811RecLin = P0AH12_A811RecLin[0] ;
         A766ProForDsc = P0AH12_A766ProForDsc[0] ;
         A488ForPrdDsc = P0AH12_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH12_n488ForPrdDsc[0] ;
         A764ProForCod = P0AH12_A764ProForCod[0] ;
         A766ProForDsc = P0AH12_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AH12_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brkAH12 = false ;
            A396EmprCod = P0AH12_A396EmprCod[0] ;
            A129BarCod = P0AH12_A129BarCod[0] ;
            A132BarCodReo = P0AH12_A132BarCodReo[0] ;
            A130BarCodPar = P0AH12_A130BarCodPar[0] ;
            A2804RecLinMaq = P0AH12_A2804RecLinMaq[0] ;
            A1273RecLinPro = P0AH12_A1273RecLinPro[0] ;
            A811RecLin = P0AH12_A811RecLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAH12 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV35Option = A764ProForCod ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH12 )
         {
            brkAH12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc = AV47SearchTxt ;
      AV15TFProForDsc_Sel = "" ;
      AV66Recetadetinte90__wcds_1_tfreclinpro = AV10TFRecLinPro ;
      AV67Recetadetinte90__wcds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV68Recetadetinte90__wcds_3_tfproforcod = AV12TFProForCod ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = AV14TFProForDsc ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV72Recetadetinte90__wcds_7_tfreclin = AV16TFRecLin ;
      AV73Recetadetinte90__wcds_8_tfreclin_to = AV17TFRecLin_To ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV78Recetadetinte90__wcds_13_tffaccon = AV22TFFacCon ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = AV23TFFacCon_To ;
      AV80Recetadetinte90__wcds_15_tfprdcant = AV24TFPrdCant ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV84Recetadetinte90__wcds_19_tfrecfornro = AV28TFRecForNro ;
      AV85Recetadetinte90__wcds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV86Recetadetinte90__wcds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV87Recetadetinte90__wcds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV88Recetadetinte90__wcds_23_tfreclote = AV32TFRecLote ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = AV60TFRecManAut ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = AV61TFRecManAut_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV68Recetadetinte90__wcds_3_tfproforcod ,
                                           AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV78Recetadetinte90__wcds_13_tffaccon ,
                                           AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV80Recetadetinte90__wcds_15_tfprdcant ,
                                           AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV88Recetadetinte90__wcds_23_tfreclote ,
                                           AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                           A14055RecManAut ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57reclinmaq) ,
                                           Byte.valueOf(AV59RecLinpro) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV76Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV82Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV88Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV88Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV90Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor P0AH13 */
      pr_default.execute(1, new Object[] {AV53Emprcod, Integer.valueOf(AV54barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57reclinmaq), Byte.valueOf(AV59RecLinpro), Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to), lV68Recetadetinte90__wcds_3_tfproforcod, AV69Recetadetinte90__wcds_4_tfproforcod_sel, lV70Recetadetinte90__wcds_5_tfprofordsc, AV71Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to), lV74Recetadetinte90__wcds_9_tfrecprdnum, AV75Recetadetinte90__wcds_10_tfrecprdnum_sel, lV76Recetadetinte90__wcds_11_tfrecprddsc, AV77Recetadetinte90__wcds_12_tfrecprddsc_sel, AV78Recetadetinte90__wcds_13_tffaccon, AV79Recetadetinte90__wcds_14_tffaccon_to, AV80Recetadetinte90__wcds_15_tfprdcant, AV81Recetadetinte90__wcds_16_tfprdcant_to, lV82Recetadetinte90__wcds_17_tfforprddsc, AV83Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to), lV88Recetadetinte90__wcds_23_tfreclote, AV89Recetadetinte90__wcds_24_tfreclote_sel, lV90Recetadetinte90__wcds_25_tfrecmanaut, AV91Recetadetinte90__wcds_26_tfrecmanaut_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAH14 = false ;
         A490ForPrdUMe = P0AH13_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH13_n490ForPrdUMe[0] ;
         A396EmprCod = P0AH13_A396EmprCod[0] ;
         A129BarCod = P0AH13_A129BarCod[0] ;
         A132BarCodReo = P0AH13_A132BarCodReo[0] ;
         A130BarCodPar = P0AH13_A130BarCodPar[0] ;
         A2804RecLinMaq = P0AH13_A2804RecLinMaq[0] ;
         A1273RecLinPro = P0AH13_A1273RecLinPro[0] ;
         A766ProForDsc = P0AH13_A766ProForDsc[0] ;
         A14055RecManAut = P0AH13_A14055RecManAut[0] ;
         A5725RecLote = P0AH13_A5725RecLote[0] ;
         A3274RecPrdTnq = P0AH13_A3274RecPrdTnq[0] ;
         A2394RecForNro = P0AH13_A2394RecForNro[0] ;
         A488ForPrdDsc = P0AH13_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH13_n488ForPrdDsc[0] ;
         A686PrdCant = P0AH13_A686PrdCant[0] ;
         A431FacCon = P0AH13_A431FacCon[0] ;
         A875RecPrdDsc = P0AH13_A875RecPrdDsc[0] ;
         A872RecPrdNum = P0AH13_A872RecPrdNum[0] ;
         A811RecLin = P0AH13_A811RecLin[0] ;
         A764ProForCod = P0AH13_A764ProForCod[0] ;
         A488ForPrdDsc = P0AH13_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH13_n488ForPrdDsc[0] ;
         A764ProForCod = P0AH13_A764ProForCod[0] ;
         A766ProForDsc = P0AH13_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AH13_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brkAH14 = false ;
            A396EmprCod = P0AH13_A396EmprCod[0] ;
            A129BarCod = P0AH13_A129BarCod[0] ;
            A132BarCodReo = P0AH13_A132BarCodReo[0] ;
            A130BarCodPar = P0AH13_A130BarCodPar[0] ;
            A2804RecLinMaq = P0AH13_A2804RecLinMaq[0] ;
            A1273RecLinPro = P0AH13_A1273RecLinPro[0] ;
            A811RecLin = P0AH13_A811RecLin[0] ;
            A764ProForCod = P0AH13_A764ProForCod[0] ;
            A764ProForCod = P0AH13_A764ProForCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAH14 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV35Option = A766ProForDsc ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH14 )
         {
            brkAH14 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFRecPrdNum = AV47SearchTxt ;
      AV19TFRecPrdNum_Sel = "" ;
      AV66Recetadetinte90__wcds_1_tfreclinpro = AV10TFRecLinPro ;
      AV67Recetadetinte90__wcds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV68Recetadetinte90__wcds_3_tfproforcod = AV12TFProForCod ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = AV14TFProForDsc ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV72Recetadetinte90__wcds_7_tfreclin = AV16TFRecLin ;
      AV73Recetadetinte90__wcds_8_tfreclin_to = AV17TFRecLin_To ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV78Recetadetinte90__wcds_13_tffaccon = AV22TFFacCon ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = AV23TFFacCon_To ;
      AV80Recetadetinte90__wcds_15_tfprdcant = AV24TFPrdCant ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV84Recetadetinte90__wcds_19_tfrecfornro = AV28TFRecForNro ;
      AV85Recetadetinte90__wcds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV86Recetadetinte90__wcds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV87Recetadetinte90__wcds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV88Recetadetinte90__wcds_23_tfreclote = AV32TFRecLote ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = AV60TFRecManAut ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = AV61TFRecManAut_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV68Recetadetinte90__wcds_3_tfproforcod ,
                                           AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV78Recetadetinte90__wcds_13_tffaccon ,
                                           AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV80Recetadetinte90__wcds_15_tfprdcant ,
                                           AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV88Recetadetinte90__wcds_23_tfreclote ,
                                           AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                           A14055RecManAut ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57reclinmaq) ,
                                           Byte.valueOf(AV59RecLinpro) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV76Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV82Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV88Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV88Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV90Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor P0AH14 */
      pr_default.execute(2, new Object[] {AV53Emprcod, Integer.valueOf(AV54barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57reclinmaq), Byte.valueOf(AV59RecLinpro), Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to), lV68Recetadetinte90__wcds_3_tfproforcod, AV69Recetadetinte90__wcds_4_tfproforcod_sel, lV70Recetadetinte90__wcds_5_tfprofordsc, AV71Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to), lV74Recetadetinte90__wcds_9_tfrecprdnum, AV75Recetadetinte90__wcds_10_tfrecprdnum_sel, lV76Recetadetinte90__wcds_11_tfrecprddsc, AV77Recetadetinte90__wcds_12_tfrecprddsc_sel, AV78Recetadetinte90__wcds_13_tffaccon, AV79Recetadetinte90__wcds_14_tffaccon_to, AV80Recetadetinte90__wcds_15_tfprdcant, AV81Recetadetinte90__wcds_16_tfprdcant_to, lV82Recetadetinte90__wcds_17_tfforprddsc, AV83Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to), lV88Recetadetinte90__wcds_23_tfreclote, AV89Recetadetinte90__wcds_24_tfreclote_sel, lV90Recetadetinte90__wcds_25_tfrecmanaut, AV91Recetadetinte90__wcds_26_tfrecmanaut_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAH16 = false ;
         A490ForPrdUMe = P0AH14_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH14_n490ForPrdUMe[0] ;
         A396EmprCod = P0AH14_A396EmprCod[0] ;
         A129BarCod = P0AH14_A129BarCod[0] ;
         A132BarCodReo = P0AH14_A132BarCodReo[0] ;
         A130BarCodPar = P0AH14_A130BarCodPar[0] ;
         A2804RecLinMaq = P0AH14_A2804RecLinMaq[0] ;
         A1273RecLinPro = P0AH14_A1273RecLinPro[0] ;
         A872RecPrdNum = P0AH14_A872RecPrdNum[0] ;
         A14055RecManAut = P0AH14_A14055RecManAut[0] ;
         A5725RecLote = P0AH14_A5725RecLote[0] ;
         A3274RecPrdTnq = P0AH14_A3274RecPrdTnq[0] ;
         A2394RecForNro = P0AH14_A2394RecForNro[0] ;
         A488ForPrdDsc = P0AH14_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH14_n488ForPrdDsc[0] ;
         A686PrdCant = P0AH14_A686PrdCant[0] ;
         A431FacCon = P0AH14_A431FacCon[0] ;
         A875RecPrdDsc = P0AH14_A875RecPrdDsc[0] ;
         A811RecLin = P0AH14_A811RecLin[0] ;
         A766ProForDsc = P0AH14_A766ProForDsc[0] ;
         A764ProForCod = P0AH14_A764ProForCod[0] ;
         A488ForPrdDsc = P0AH14_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH14_n488ForPrdDsc[0] ;
         A764ProForCod = P0AH14_A764ProForCod[0] ;
         A766ProForDsc = P0AH14_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AH14_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brkAH16 = false ;
            A396EmprCod = P0AH14_A396EmprCod[0] ;
            A129BarCod = P0AH14_A129BarCod[0] ;
            A132BarCodReo = P0AH14_A132BarCodReo[0] ;
            A130BarCodPar = P0AH14_A130BarCodPar[0] ;
            A2804RecLinMaq = P0AH14_A2804RecLinMaq[0] ;
            A1273RecLinPro = P0AH14_A1273RecLinPro[0] ;
            A811RecLin = P0AH14_A811RecLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAH16 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV35Option = A872RecPrdNum ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH16 )
         {
            brkAH16 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFRecPrdDsc = AV47SearchTxt ;
      AV21TFRecPrdDsc_Sel = "" ;
      AV66Recetadetinte90__wcds_1_tfreclinpro = AV10TFRecLinPro ;
      AV67Recetadetinte90__wcds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV68Recetadetinte90__wcds_3_tfproforcod = AV12TFProForCod ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = AV14TFProForDsc ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV72Recetadetinte90__wcds_7_tfreclin = AV16TFRecLin ;
      AV73Recetadetinte90__wcds_8_tfreclin_to = AV17TFRecLin_To ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV78Recetadetinte90__wcds_13_tffaccon = AV22TFFacCon ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = AV23TFFacCon_To ;
      AV80Recetadetinte90__wcds_15_tfprdcant = AV24TFPrdCant ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV84Recetadetinte90__wcds_19_tfrecfornro = AV28TFRecForNro ;
      AV85Recetadetinte90__wcds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV86Recetadetinte90__wcds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV87Recetadetinte90__wcds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV88Recetadetinte90__wcds_23_tfreclote = AV32TFRecLote ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = AV60TFRecManAut ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = AV61TFRecManAut_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV68Recetadetinte90__wcds_3_tfproforcod ,
                                           AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV78Recetadetinte90__wcds_13_tffaccon ,
                                           AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV80Recetadetinte90__wcds_15_tfprdcant ,
                                           AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV88Recetadetinte90__wcds_23_tfreclote ,
                                           AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                           A14055RecManAut ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57reclinmaq) ,
                                           Byte.valueOf(AV59RecLinpro) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV76Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV82Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV88Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV88Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV90Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor P0AH15 */
      pr_default.execute(3, new Object[] {AV53Emprcod, Integer.valueOf(AV54barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57reclinmaq), Byte.valueOf(AV59RecLinpro), Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to), lV68Recetadetinte90__wcds_3_tfproforcod, AV69Recetadetinte90__wcds_4_tfproforcod_sel, lV70Recetadetinte90__wcds_5_tfprofordsc, AV71Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to), lV74Recetadetinte90__wcds_9_tfrecprdnum, AV75Recetadetinte90__wcds_10_tfrecprdnum_sel, lV76Recetadetinte90__wcds_11_tfrecprddsc, AV77Recetadetinte90__wcds_12_tfrecprddsc_sel, AV78Recetadetinte90__wcds_13_tffaccon, AV79Recetadetinte90__wcds_14_tffaccon_to, AV80Recetadetinte90__wcds_15_tfprdcant, AV81Recetadetinte90__wcds_16_tfprdcant_to, lV82Recetadetinte90__wcds_17_tfforprddsc, AV83Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to), lV88Recetadetinte90__wcds_23_tfreclote, AV89Recetadetinte90__wcds_24_tfreclote_sel, lV90Recetadetinte90__wcds_25_tfrecmanaut, AV91Recetadetinte90__wcds_26_tfrecmanaut_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAH18 = false ;
         A490ForPrdUMe = P0AH15_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH15_n490ForPrdUMe[0] ;
         A396EmprCod = P0AH15_A396EmprCod[0] ;
         A129BarCod = P0AH15_A129BarCod[0] ;
         A132BarCodReo = P0AH15_A132BarCodReo[0] ;
         A130BarCodPar = P0AH15_A130BarCodPar[0] ;
         A2804RecLinMaq = P0AH15_A2804RecLinMaq[0] ;
         A1273RecLinPro = P0AH15_A1273RecLinPro[0] ;
         A875RecPrdDsc = P0AH15_A875RecPrdDsc[0] ;
         A14055RecManAut = P0AH15_A14055RecManAut[0] ;
         A5725RecLote = P0AH15_A5725RecLote[0] ;
         A3274RecPrdTnq = P0AH15_A3274RecPrdTnq[0] ;
         A2394RecForNro = P0AH15_A2394RecForNro[0] ;
         A488ForPrdDsc = P0AH15_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH15_n488ForPrdDsc[0] ;
         A686PrdCant = P0AH15_A686PrdCant[0] ;
         A431FacCon = P0AH15_A431FacCon[0] ;
         A872RecPrdNum = P0AH15_A872RecPrdNum[0] ;
         A811RecLin = P0AH15_A811RecLin[0] ;
         A766ProForDsc = P0AH15_A766ProForDsc[0] ;
         A764ProForCod = P0AH15_A764ProForCod[0] ;
         A488ForPrdDsc = P0AH15_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH15_n488ForPrdDsc[0] ;
         A764ProForCod = P0AH15_A764ProForCod[0] ;
         A766ProForDsc = P0AH15_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AH15_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brkAH18 = false ;
            A396EmprCod = P0AH15_A396EmprCod[0] ;
            A129BarCod = P0AH15_A129BarCod[0] ;
            A132BarCodReo = P0AH15_A132BarCodReo[0] ;
            A130BarCodPar = P0AH15_A130BarCodPar[0] ;
            A2804RecLinMaq = P0AH15_A2804RecLinMaq[0] ;
            A1273RecLinPro = P0AH15_A1273RecLinPro[0] ;
            A811RecLin = P0AH15_A811RecLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAH18 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV35Option = A875RecPrdDsc ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH18 )
         {
            brkAH18 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFForPrdDsc = AV47SearchTxt ;
      AV27TFForPrdDsc_Sel = "" ;
      AV66Recetadetinte90__wcds_1_tfreclinpro = AV10TFRecLinPro ;
      AV67Recetadetinte90__wcds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV68Recetadetinte90__wcds_3_tfproforcod = AV12TFProForCod ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = AV14TFProForDsc ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV72Recetadetinte90__wcds_7_tfreclin = AV16TFRecLin ;
      AV73Recetadetinte90__wcds_8_tfreclin_to = AV17TFRecLin_To ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV78Recetadetinte90__wcds_13_tffaccon = AV22TFFacCon ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = AV23TFFacCon_To ;
      AV80Recetadetinte90__wcds_15_tfprdcant = AV24TFPrdCant ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV84Recetadetinte90__wcds_19_tfrecfornro = AV28TFRecForNro ;
      AV85Recetadetinte90__wcds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV86Recetadetinte90__wcds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV87Recetadetinte90__wcds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV88Recetadetinte90__wcds_23_tfreclote = AV32TFRecLote ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = AV60TFRecManAut ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = AV61TFRecManAut_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV68Recetadetinte90__wcds_3_tfproforcod ,
                                           AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV78Recetadetinte90__wcds_13_tffaccon ,
                                           AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV80Recetadetinte90__wcds_15_tfprdcant ,
                                           AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV88Recetadetinte90__wcds_23_tfreclote ,
                                           AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                           A14055RecManAut ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57reclinmaq) ,
                                           Byte.valueOf(AV59RecLinpro) ,
                                           AV53Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV68Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV76Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV82Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV88Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV88Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV90Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor P0AH16 */
      pr_default.execute(4, new Object[] {AV53Emprcod, Integer.valueOf(AV54barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57reclinmaq), Byte.valueOf(AV59RecLinpro), Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to), lV68Recetadetinte90__wcds_3_tfproforcod, AV69Recetadetinte90__wcds_4_tfproforcod_sel, lV70Recetadetinte90__wcds_5_tfprofordsc, AV71Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to), lV74Recetadetinte90__wcds_9_tfrecprdnum, AV75Recetadetinte90__wcds_10_tfrecprdnum_sel, lV76Recetadetinte90__wcds_11_tfrecprddsc, AV77Recetadetinte90__wcds_12_tfrecprddsc_sel, AV78Recetadetinte90__wcds_13_tffaccon, AV79Recetadetinte90__wcds_14_tffaccon_to, AV80Recetadetinte90__wcds_15_tfprdcant, AV81Recetadetinte90__wcds_16_tfprdcant_to, lV82Recetadetinte90__wcds_17_tfforprddsc, AV83Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to), lV88Recetadetinte90__wcds_23_tfreclote, AV89Recetadetinte90__wcds_24_tfreclote_sel, lV90Recetadetinte90__wcds_25_tfrecmanaut, AV91Recetadetinte90__wcds_26_tfrecmanaut_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAH110 = false ;
         A490ForPrdUMe = P0AH16_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH16_n490ForPrdUMe[0] ;
         A396EmprCod = P0AH16_A396EmprCod[0] ;
         A2804RecLinMaq = P0AH16_A2804RecLinMaq[0] ;
         A130BarCodPar = P0AH16_A130BarCodPar[0] ;
         A132BarCodReo = P0AH16_A132BarCodReo[0] ;
         A129BarCod = P0AH16_A129BarCod[0] ;
         A14055RecManAut = P0AH16_A14055RecManAut[0] ;
         A5725RecLote = P0AH16_A5725RecLote[0] ;
         A3274RecPrdTnq = P0AH16_A3274RecPrdTnq[0] ;
         A2394RecForNro = P0AH16_A2394RecForNro[0] ;
         A488ForPrdDsc = P0AH16_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH16_n488ForPrdDsc[0] ;
         A686PrdCant = P0AH16_A686PrdCant[0] ;
         A431FacCon = P0AH16_A431FacCon[0] ;
         A875RecPrdDsc = P0AH16_A875RecPrdDsc[0] ;
         A872RecPrdNum = P0AH16_A872RecPrdNum[0] ;
         A811RecLin = P0AH16_A811RecLin[0] ;
         A766ProForDsc = P0AH16_A766ProForDsc[0] ;
         A764ProForCod = P0AH16_A764ProForCod[0] ;
         A1273RecLinPro = P0AH16_A1273RecLinPro[0] ;
         A488ForPrdDsc = P0AH16_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH16_n488ForPrdDsc[0] ;
         A764ProForCod = P0AH16_A764ProForCod[0] ;
         A766ProForDsc = P0AH16_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AH16_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AH16_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brkAH110 = false ;
            A2804RecLinMaq = P0AH16_A2804RecLinMaq[0] ;
            A130BarCodPar = P0AH16_A130BarCodPar[0] ;
            A132BarCodReo = P0AH16_A132BarCodReo[0] ;
            A129BarCod = P0AH16_A129BarCod[0] ;
            A811RecLin = P0AH16_A811RecLin[0] ;
            A1273RecLinPro = P0AH16_A1273RecLinPro[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAH110 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV35Option = A488ForPrdDsc ;
            AV34InsertIndex = 1 ;
            while ( ( AV34InsertIndex <= AV36Options.size() ) && ( GXutil.strcmp((String)AV36Options.elementAt(-1+AV34InsertIndex), AV35Option) < 0 ) )
            {
               AV34InsertIndex = (int)(AV34InsertIndex+1) ;
            }
            AV36Options.add(AV35Option, AV34InsertIndex);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV34InsertIndex);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH110 )
         {
            brkAH110 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV32TFRecLote = AV47SearchTxt ;
      AV33TFRecLote_Sel = "" ;
      AV66Recetadetinte90__wcds_1_tfreclinpro = AV10TFRecLinPro ;
      AV67Recetadetinte90__wcds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV68Recetadetinte90__wcds_3_tfproforcod = AV12TFProForCod ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = AV14TFProForDsc ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV72Recetadetinte90__wcds_7_tfreclin = AV16TFRecLin ;
      AV73Recetadetinte90__wcds_8_tfreclin_to = AV17TFRecLin_To ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV78Recetadetinte90__wcds_13_tffaccon = AV22TFFacCon ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = AV23TFFacCon_To ;
      AV80Recetadetinte90__wcds_15_tfprdcant = AV24TFPrdCant ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV84Recetadetinte90__wcds_19_tfrecfornro = AV28TFRecForNro ;
      AV85Recetadetinte90__wcds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV86Recetadetinte90__wcds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV87Recetadetinte90__wcds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV88Recetadetinte90__wcds_23_tfreclote = AV32TFRecLote ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = AV60TFRecManAut ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = AV61TFRecManAut_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV68Recetadetinte90__wcds_3_tfproforcod ,
                                           AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV78Recetadetinte90__wcds_13_tffaccon ,
                                           AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV80Recetadetinte90__wcds_15_tfprdcant ,
                                           AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV88Recetadetinte90__wcds_23_tfreclote ,
                                           AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                           A14055RecManAut ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57reclinmaq) ,
                                           Byte.valueOf(AV59RecLinpro) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV76Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV82Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV88Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV88Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV90Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor P0AH17 */
      pr_default.execute(5, new Object[] {AV53Emprcod, Integer.valueOf(AV54barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57reclinmaq), Byte.valueOf(AV59RecLinpro), Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to), lV68Recetadetinte90__wcds_3_tfproforcod, AV69Recetadetinte90__wcds_4_tfproforcod_sel, lV70Recetadetinte90__wcds_5_tfprofordsc, AV71Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to), lV74Recetadetinte90__wcds_9_tfrecprdnum, AV75Recetadetinte90__wcds_10_tfrecprdnum_sel, lV76Recetadetinte90__wcds_11_tfrecprddsc, AV77Recetadetinte90__wcds_12_tfrecprddsc_sel, AV78Recetadetinte90__wcds_13_tffaccon, AV79Recetadetinte90__wcds_14_tffaccon_to, AV80Recetadetinte90__wcds_15_tfprdcant, AV81Recetadetinte90__wcds_16_tfprdcant_to, lV82Recetadetinte90__wcds_17_tfforprddsc, AV83Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to), lV88Recetadetinte90__wcds_23_tfreclote, AV89Recetadetinte90__wcds_24_tfreclote_sel, lV90Recetadetinte90__wcds_25_tfrecmanaut, AV91Recetadetinte90__wcds_26_tfrecmanaut_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAH112 = false ;
         A490ForPrdUMe = P0AH17_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH17_n490ForPrdUMe[0] ;
         A396EmprCod = P0AH17_A396EmprCod[0] ;
         A129BarCod = P0AH17_A129BarCod[0] ;
         A132BarCodReo = P0AH17_A132BarCodReo[0] ;
         A130BarCodPar = P0AH17_A130BarCodPar[0] ;
         A2804RecLinMaq = P0AH17_A2804RecLinMaq[0] ;
         A1273RecLinPro = P0AH17_A1273RecLinPro[0] ;
         A5725RecLote = P0AH17_A5725RecLote[0] ;
         A14055RecManAut = P0AH17_A14055RecManAut[0] ;
         A3274RecPrdTnq = P0AH17_A3274RecPrdTnq[0] ;
         A2394RecForNro = P0AH17_A2394RecForNro[0] ;
         A488ForPrdDsc = P0AH17_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH17_n488ForPrdDsc[0] ;
         A686PrdCant = P0AH17_A686PrdCant[0] ;
         A431FacCon = P0AH17_A431FacCon[0] ;
         A875RecPrdDsc = P0AH17_A875RecPrdDsc[0] ;
         A872RecPrdNum = P0AH17_A872RecPrdNum[0] ;
         A811RecLin = P0AH17_A811RecLin[0] ;
         A766ProForDsc = P0AH17_A766ProForDsc[0] ;
         A764ProForCod = P0AH17_A764ProForCod[0] ;
         A488ForPrdDsc = P0AH17_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH17_n488ForPrdDsc[0] ;
         A764ProForCod = P0AH17_A764ProForCod[0] ;
         A766ProForDsc = P0AH17_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AH17_A5725RecLote[0], A5725RecLote) == 0 ) )
         {
            brkAH112 = false ;
            A396EmprCod = P0AH17_A396EmprCod[0] ;
            A129BarCod = P0AH17_A129BarCod[0] ;
            A132BarCodReo = P0AH17_A132BarCodReo[0] ;
            A130BarCodPar = P0AH17_A130BarCodPar[0] ;
            A2804RecLinMaq = P0AH17_A2804RecLinMaq[0] ;
            A1273RecLinPro = P0AH17_A1273RecLinPro[0] ;
            A811RecLin = P0AH17_A811RecLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAH112 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A5725RecLote)==0) )
         {
            AV35Option = A5725RecLote ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH112 )
         {
            brkAH112 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADRECMANAUTOPTIONS' Routine */
      returnInSub = false ;
      AV60TFRecManAut = AV47SearchTxt ;
      AV61TFRecManAut_Sel = "" ;
      AV66Recetadetinte90__wcds_1_tfreclinpro = AV10TFRecLinPro ;
      AV67Recetadetinte90__wcds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV68Recetadetinte90__wcds_3_tfproforcod = AV12TFProForCod ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = AV14TFProForDsc ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV72Recetadetinte90__wcds_7_tfreclin = AV16TFRecLin ;
      AV73Recetadetinte90__wcds_8_tfreclin_to = AV17TFRecLin_To ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV78Recetadetinte90__wcds_13_tffaccon = AV22TFFacCon ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = AV23TFFacCon_To ;
      AV80Recetadetinte90__wcds_15_tfprdcant = AV24TFPrdCant ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV84Recetadetinte90__wcds_19_tfrecfornro = AV28TFRecForNro ;
      AV85Recetadetinte90__wcds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV86Recetadetinte90__wcds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV87Recetadetinte90__wcds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV88Recetadetinte90__wcds_23_tfreclote = AV32TFRecLote ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = AV60TFRecManAut ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = AV61TFRecManAut_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV68Recetadetinte90__wcds_3_tfproforcod ,
                                           AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV78Recetadetinte90__wcds_13_tffaccon ,
                                           AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV80Recetadetinte90__wcds_15_tfprdcant ,
                                           AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV88Recetadetinte90__wcds_23_tfreclote ,
                                           AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                           A14055RecManAut ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55Barcodreo) ,
                                           A130BarCodPar ,
                                           AV56Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57reclinmaq) ,
                                           Byte.valueOf(AV59RecLinpro) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV76Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV82Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV88Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV88Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV90Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor P0AH18 */
      pr_default.execute(6, new Object[] {AV53Emprcod, Integer.valueOf(AV54barcod), Byte.valueOf(AV55Barcodreo), AV56Barcodpar, Short.valueOf(AV57reclinmaq), Byte.valueOf(AV59RecLinpro), Byte.valueOf(AV66Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV67Recetadetinte90__wcds_2_tfreclinpro_to), lV68Recetadetinte90__wcds_3_tfproforcod, AV69Recetadetinte90__wcds_4_tfproforcod_sel, lV70Recetadetinte90__wcds_5_tfprofordsc, AV71Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV72Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV73Recetadetinte90__wcds_8_tfreclin_to), lV74Recetadetinte90__wcds_9_tfrecprdnum, AV75Recetadetinte90__wcds_10_tfrecprdnum_sel, lV76Recetadetinte90__wcds_11_tfrecprddsc, AV77Recetadetinte90__wcds_12_tfrecprddsc_sel, AV78Recetadetinte90__wcds_13_tffaccon, AV79Recetadetinte90__wcds_14_tffaccon_to, AV80Recetadetinte90__wcds_15_tfprdcant, AV81Recetadetinte90__wcds_16_tfprdcant_to, lV82Recetadetinte90__wcds_17_tfforprddsc, AV83Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV84Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV85Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV86Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV87Recetadetinte90__wcds_22_tfrecprdtnq_to), lV88Recetadetinte90__wcds_23_tfreclote, AV89Recetadetinte90__wcds_24_tfreclote_sel, lV90Recetadetinte90__wcds_25_tfrecmanaut, AV91Recetadetinte90__wcds_26_tfrecmanaut_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAH114 = false ;
         A490ForPrdUMe = P0AH18_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH18_n490ForPrdUMe[0] ;
         A396EmprCod = P0AH18_A396EmprCod[0] ;
         A129BarCod = P0AH18_A129BarCod[0] ;
         A132BarCodReo = P0AH18_A132BarCodReo[0] ;
         A130BarCodPar = P0AH18_A130BarCodPar[0] ;
         A2804RecLinMaq = P0AH18_A2804RecLinMaq[0] ;
         A1273RecLinPro = P0AH18_A1273RecLinPro[0] ;
         A14055RecManAut = P0AH18_A14055RecManAut[0] ;
         A5725RecLote = P0AH18_A5725RecLote[0] ;
         A3274RecPrdTnq = P0AH18_A3274RecPrdTnq[0] ;
         A2394RecForNro = P0AH18_A2394RecForNro[0] ;
         A488ForPrdDsc = P0AH18_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH18_n488ForPrdDsc[0] ;
         A686PrdCant = P0AH18_A686PrdCant[0] ;
         A431FacCon = P0AH18_A431FacCon[0] ;
         A875RecPrdDsc = P0AH18_A875RecPrdDsc[0] ;
         A872RecPrdNum = P0AH18_A872RecPrdNum[0] ;
         A811RecLin = P0AH18_A811RecLin[0] ;
         A766ProForDsc = P0AH18_A766ProForDsc[0] ;
         A764ProForCod = P0AH18_A764ProForCod[0] ;
         A488ForPrdDsc = P0AH18_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AH18_n488ForPrdDsc[0] ;
         A764ProForCod = P0AH18_A764ProForCod[0] ;
         A766ProForDsc = P0AH18_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AH18_A14055RecManAut[0], A14055RecManAut) == 0 ) )
         {
            brkAH114 = false ;
            A396EmprCod = P0AH18_A396EmprCod[0] ;
            A129BarCod = P0AH18_A129BarCod[0] ;
            A132BarCodReo = P0AH18_A132BarCodReo[0] ;
            A130BarCodPar = P0AH18_A130BarCodPar[0] ;
            A2804RecLinMaq = P0AH18_A2804RecLinMaq[0] ;
            A1273RecLinPro = P0AH18_A1273RecLinPro[0] ;
            A811RecLin = P0AH18_A811RecLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAH114 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A14055RecManAut)==0) )
         {
            AV35Option = A14055RecManAut ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH114 )
         {
            brkAH114 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadetinte90__wcgetfilterdata.this.AV49OptionsJson;
      this.aP4[0] = recetadetinte90__wcgetfilterdata.this.AV50OptionsDescJson;
      this.aP5[0] = recetadetinte90__wcgetfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49OptionsJson = "" ;
      AV50OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      AV60TFRecManAut = "" ;
      AV61TFRecManAut_Sel = "" ;
      AV53Emprcod = "" ;
      AV56Barcodpar = "" ;
      A764ProForCod = "" ;
      AV68Recetadetinte90__wcds_3_tfproforcod = "" ;
      AV69Recetadetinte90__wcds_4_tfproforcod_sel = "" ;
      AV70Recetadetinte90__wcds_5_tfprofordsc = "" ;
      AV71Recetadetinte90__wcds_6_tfprofordsc_sel = "" ;
      AV74Recetadetinte90__wcds_9_tfrecprdnum = "" ;
      AV75Recetadetinte90__wcds_10_tfrecprdnum_sel = "" ;
      AV76Recetadetinte90__wcds_11_tfrecprddsc = "" ;
      AV77Recetadetinte90__wcds_12_tfrecprddsc_sel = "" ;
      AV78Recetadetinte90__wcds_13_tffaccon = DecimalUtil.ZERO ;
      AV79Recetadetinte90__wcds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV80Recetadetinte90__wcds_15_tfprdcant = DecimalUtil.ZERO ;
      AV81Recetadetinte90__wcds_16_tfprdcant_to = DecimalUtil.ZERO ;
      AV82Recetadetinte90__wcds_17_tfforprddsc = "" ;
      AV83Recetadetinte90__wcds_18_tfforprddsc_sel = "" ;
      AV88Recetadetinte90__wcds_23_tfreclote = "" ;
      AV89Recetadetinte90__wcds_24_tfreclote_sel = "" ;
      AV90Recetadetinte90__wcds_25_tfrecmanaut = "" ;
      AV91Recetadetinte90__wcds_26_tfrecmanaut_sel = "" ;
      scmdbuf = "" ;
      lV68Recetadetinte90__wcds_3_tfproforcod = "" ;
      lV70Recetadetinte90__wcds_5_tfprofordsc = "" ;
      lV74Recetadetinte90__wcds_9_tfrecprdnum = "" ;
      lV76Recetadetinte90__wcds_11_tfrecprddsc = "" ;
      lV82Recetadetinte90__wcds_17_tfforprddsc = "" ;
      lV88Recetadetinte90__wcds_23_tfreclote = "" ;
      lV90Recetadetinte90__wcds_25_tfrecmanaut = "" ;
      A766ProForDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A14055RecManAut = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P0AH12_A490ForPrdUMe = new byte[1] ;
      P0AH12_n490ForPrdUMe = new boolean[] {false} ;
      P0AH12_A396EmprCod = new String[] {""} ;
      P0AH12_A129BarCod = new int[1] ;
      P0AH12_A132BarCodReo = new byte[1] ;
      P0AH12_A130BarCodPar = new String[] {""} ;
      P0AH12_A2804RecLinMaq = new short[1] ;
      P0AH12_A1273RecLinPro = new byte[1] ;
      P0AH12_A764ProForCod = new String[] {""} ;
      P0AH12_A14055RecManAut = new String[] {""} ;
      P0AH12_A5725RecLote = new String[] {""} ;
      P0AH12_A3274RecPrdTnq = new byte[1] ;
      P0AH12_A2394RecForNro = new byte[1] ;
      P0AH12_A488ForPrdDsc = new String[] {""} ;
      P0AH12_n488ForPrdDsc = new boolean[] {false} ;
      P0AH12_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH12_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH12_A875RecPrdDsc = new String[] {""} ;
      P0AH12_A872RecPrdNum = new String[] {""} ;
      P0AH12_A811RecLin = new short[1] ;
      P0AH12_A766ProForDsc = new String[] {""} ;
      AV35Option = "" ;
      P0AH13_A490ForPrdUMe = new byte[1] ;
      P0AH13_n490ForPrdUMe = new boolean[] {false} ;
      P0AH13_A396EmprCod = new String[] {""} ;
      P0AH13_A129BarCod = new int[1] ;
      P0AH13_A132BarCodReo = new byte[1] ;
      P0AH13_A130BarCodPar = new String[] {""} ;
      P0AH13_A2804RecLinMaq = new short[1] ;
      P0AH13_A1273RecLinPro = new byte[1] ;
      P0AH13_A766ProForDsc = new String[] {""} ;
      P0AH13_A14055RecManAut = new String[] {""} ;
      P0AH13_A5725RecLote = new String[] {""} ;
      P0AH13_A3274RecPrdTnq = new byte[1] ;
      P0AH13_A2394RecForNro = new byte[1] ;
      P0AH13_A488ForPrdDsc = new String[] {""} ;
      P0AH13_n488ForPrdDsc = new boolean[] {false} ;
      P0AH13_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH13_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH13_A875RecPrdDsc = new String[] {""} ;
      P0AH13_A872RecPrdNum = new String[] {""} ;
      P0AH13_A811RecLin = new short[1] ;
      P0AH13_A764ProForCod = new String[] {""} ;
      P0AH14_A490ForPrdUMe = new byte[1] ;
      P0AH14_n490ForPrdUMe = new boolean[] {false} ;
      P0AH14_A396EmprCod = new String[] {""} ;
      P0AH14_A129BarCod = new int[1] ;
      P0AH14_A132BarCodReo = new byte[1] ;
      P0AH14_A130BarCodPar = new String[] {""} ;
      P0AH14_A2804RecLinMaq = new short[1] ;
      P0AH14_A1273RecLinPro = new byte[1] ;
      P0AH14_A872RecPrdNum = new String[] {""} ;
      P0AH14_A14055RecManAut = new String[] {""} ;
      P0AH14_A5725RecLote = new String[] {""} ;
      P0AH14_A3274RecPrdTnq = new byte[1] ;
      P0AH14_A2394RecForNro = new byte[1] ;
      P0AH14_A488ForPrdDsc = new String[] {""} ;
      P0AH14_n488ForPrdDsc = new boolean[] {false} ;
      P0AH14_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH14_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH14_A875RecPrdDsc = new String[] {""} ;
      P0AH14_A811RecLin = new short[1] ;
      P0AH14_A766ProForDsc = new String[] {""} ;
      P0AH14_A764ProForCod = new String[] {""} ;
      P0AH15_A490ForPrdUMe = new byte[1] ;
      P0AH15_n490ForPrdUMe = new boolean[] {false} ;
      P0AH15_A396EmprCod = new String[] {""} ;
      P0AH15_A129BarCod = new int[1] ;
      P0AH15_A132BarCodReo = new byte[1] ;
      P0AH15_A130BarCodPar = new String[] {""} ;
      P0AH15_A2804RecLinMaq = new short[1] ;
      P0AH15_A1273RecLinPro = new byte[1] ;
      P0AH15_A875RecPrdDsc = new String[] {""} ;
      P0AH15_A14055RecManAut = new String[] {""} ;
      P0AH15_A5725RecLote = new String[] {""} ;
      P0AH15_A3274RecPrdTnq = new byte[1] ;
      P0AH15_A2394RecForNro = new byte[1] ;
      P0AH15_A488ForPrdDsc = new String[] {""} ;
      P0AH15_n488ForPrdDsc = new boolean[] {false} ;
      P0AH15_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH15_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH15_A872RecPrdNum = new String[] {""} ;
      P0AH15_A811RecLin = new short[1] ;
      P0AH15_A766ProForDsc = new String[] {""} ;
      P0AH15_A764ProForCod = new String[] {""} ;
      P0AH16_A490ForPrdUMe = new byte[1] ;
      P0AH16_n490ForPrdUMe = new boolean[] {false} ;
      P0AH16_A396EmprCod = new String[] {""} ;
      P0AH16_A2804RecLinMaq = new short[1] ;
      P0AH16_A130BarCodPar = new String[] {""} ;
      P0AH16_A132BarCodReo = new byte[1] ;
      P0AH16_A129BarCod = new int[1] ;
      P0AH16_A14055RecManAut = new String[] {""} ;
      P0AH16_A5725RecLote = new String[] {""} ;
      P0AH16_A3274RecPrdTnq = new byte[1] ;
      P0AH16_A2394RecForNro = new byte[1] ;
      P0AH16_A488ForPrdDsc = new String[] {""} ;
      P0AH16_n488ForPrdDsc = new boolean[] {false} ;
      P0AH16_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH16_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH16_A875RecPrdDsc = new String[] {""} ;
      P0AH16_A872RecPrdNum = new String[] {""} ;
      P0AH16_A811RecLin = new short[1] ;
      P0AH16_A766ProForDsc = new String[] {""} ;
      P0AH16_A764ProForCod = new String[] {""} ;
      P0AH16_A1273RecLinPro = new byte[1] ;
      P0AH17_A490ForPrdUMe = new byte[1] ;
      P0AH17_n490ForPrdUMe = new boolean[] {false} ;
      P0AH17_A396EmprCod = new String[] {""} ;
      P0AH17_A129BarCod = new int[1] ;
      P0AH17_A132BarCodReo = new byte[1] ;
      P0AH17_A130BarCodPar = new String[] {""} ;
      P0AH17_A2804RecLinMaq = new short[1] ;
      P0AH17_A1273RecLinPro = new byte[1] ;
      P0AH17_A5725RecLote = new String[] {""} ;
      P0AH17_A14055RecManAut = new String[] {""} ;
      P0AH17_A3274RecPrdTnq = new byte[1] ;
      P0AH17_A2394RecForNro = new byte[1] ;
      P0AH17_A488ForPrdDsc = new String[] {""} ;
      P0AH17_n488ForPrdDsc = new boolean[] {false} ;
      P0AH17_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH17_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH17_A875RecPrdDsc = new String[] {""} ;
      P0AH17_A872RecPrdNum = new String[] {""} ;
      P0AH17_A811RecLin = new short[1] ;
      P0AH17_A766ProForDsc = new String[] {""} ;
      P0AH17_A764ProForCod = new String[] {""} ;
      P0AH18_A490ForPrdUMe = new byte[1] ;
      P0AH18_n490ForPrdUMe = new boolean[] {false} ;
      P0AH18_A396EmprCod = new String[] {""} ;
      P0AH18_A129BarCod = new int[1] ;
      P0AH18_A132BarCodReo = new byte[1] ;
      P0AH18_A130BarCodPar = new String[] {""} ;
      P0AH18_A2804RecLinMaq = new short[1] ;
      P0AH18_A1273RecLinPro = new byte[1] ;
      P0AH18_A14055RecManAut = new String[] {""} ;
      P0AH18_A5725RecLote = new String[] {""} ;
      P0AH18_A3274RecPrdTnq = new byte[1] ;
      P0AH18_A2394RecForNro = new byte[1] ;
      P0AH18_A488ForPrdDsc = new String[] {""} ;
      P0AH18_n488ForPrdDsc = new boolean[] {false} ;
      P0AH18_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH18_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH18_A875RecPrdDsc = new String[] {""} ;
      P0AH18_A872RecPrdNum = new String[] {""} ;
      P0AH18_A811RecLin = new short[1] ;
      P0AH18_A766ProForDsc = new String[] {""} ;
      P0AH18_A764ProForCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte90__wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AH12_A490ForPrdUMe, P0AH12_n490ForPrdUMe, P0AH12_A396EmprCod, P0AH12_A129BarCod, P0AH12_A132BarCodReo, P0AH12_A130BarCodPar, P0AH12_A2804RecLinMaq, P0AH12_A1273RecLinPro, P0AH12_A764ProForCod, P0AH12_A14055RecManAut,
            P0AH12_A5725RecLote, P0AH12_A3274RecPrdTnq, P0AH12_A2394RecForNro, P0AH12_A488ForPrdDsc, P0AH12_n488ForPrdDsc, P0AH12_A686PrdCant, P0AH12_A431FacCon, P0AH12_A875RecPrdDsc, P0AH12_A872RecPrdNum, P0AH12_A811RecLin,
            P0AH12_A766ProForDsc
            }
            , new Object[] {
            P0AH13_A490ForPrdUMe, P0AH13_n490ForPrdUMe, P0AH13_A396EmprCod, P0AH13_A129BarCod, P0AH13_A132BarCodReo, P0AH13_A130BarCodPar, P0AH13_A2804RecLinMaq, P0AH13_A1273RecLinPro, P0AH13_A766ProForDsc, P0AH13_A14055RecManAut,
            P0AH13_A5725RecLote, P0AH13_A3274RecPrdTnq, P0AH13_A2394RecForNro, P0AH13_A488ForPrdDsc, P0AH13_n488ForPrdDsc, P0AH13_A686PrdCant, P0AH13_A431FacCon, P0AH13_A875RecPrdDsc, P0AH13_A872RecPrdNum, P0AH13_A811RecLin,
            P0AH13_A764ProForCod
            }
            , new Object[] {
            P0AH14_A490ForPrdUMe, P0AH14_n490ForPrdUMe, P0AH14_A396EmprCod, P0AH14_A129BarCod, P0AH14_A132BarCodReo, P0AH14_A130BarCodPar, P0AH14_A2804RecLinMaq, P0AH14_A1273RecLinPro, P0AH14_A872RecPrdNum, P0AH14_A14055RecManAut,
            P0AH14_A5725RecLote, P0AH14_A3274RecPrdTnq, P0AH14_A2394RecForNro, P0AH14_A488ForPrdDsc, P0AH14_n488ForPrdDsc, P0AH14_A686PrdCant, P0AH14_A431FacCon, P0AH14_A875RecPrdDsc, P0AH14_A811RecLin, P0AH14_A766ProForDsc,
            P0AH14_A764ProForCod
            }
            , new Object[] {
            P0AH15_A490ForPrdUMe, P0AH15_n490ForPrdUMe, P0AH15_A396EmprCod, P0AH15_A129BarCod, P0AH15_A132BarCodReo, P0AH15_A130BarCodPar, P0AH15_A2804RecLinMaq, P0AH15_A1273RecLinPro, P0AH15_A875RecPrdDsc, P0AH15_A14055RecManAut,
            P0AH15_A5725RecLote, P0AH15_A3274RecPrdTnq, P0AH15_A2394RecForNro, P0AH15_A488ForPrdDsc, P0AH15_n488ForPrdDsc, P0AH15_A686PrdCant, P0AH15_A431FacCon, P0AH15_A872RecPrdNum, P0AH15_A811RecLin, P0AH15_A766ProForDsc,
            P0AH15_A764ProForCod
            }
            , new Object[] {
            P0AH16_A490ForPrdUMe, P0AH16_n490ForPrdUMe, P0AH16_A396EmprCod, P0AH16_A2804RecLinMaq, P0AH16_A130BarCodPar, P0AH16_A132BarCodReo, P0AH16_A129BarCod, P0AH16_A14055RecManAut, P0AH16_A5725RecLote, P0AH16_A3274RecPrdTnq,
            P0AH16_A2394RecForNro, P0AH16_A488ForPrdDsc, P0AH16_n488ForPrdDsc, P0AH16_A686PrdCant, P0AH16_A431FacCon, P0AH16_A875RecPrdDsc, P0AH16_A872RecPrdNum, P0AH16_A811RecLin, P0AH16_A766ProForDsc, P0AH16_A764ProForCod,
            P0AH16_A1273RecLinPro
            }
            , new Object[] {
            P0AH17_A490ForPrdUMe, P0AH17_n490ForPrdUMe, P0AH17_A396EmprCod, P0AH17_A129BarCod, P0AH17_A132BarCodReo, P0AH17_A130BarCodPar, P0AH17_A2804RecLinMaq, P0AH17_A1273RecLinPro, P0AH17_A5725RecLote, P0AH17_A14055RecManAut,
            P0AH17_A3274RecPrdTnq, P0AH17_A2394RecForNro, P0AH17_A488ForPrdDsc, P0AH17_n488ForPrdDsc, P0AH17_A686PrdCant, P0AH17_A431FacCon, P0AH17_A875RecPrdDsc, P0AH17_A872RecPrdNum, P0AH17_A811RecLin, P0AH17_A766ProForDsc,
            P0AH17_A764ProForCod
            }
            , new Object[] {
            P0AH18_A490ForPrdUMe, P0AH18_n490ForPrdUMe, P0AH18_A396EmprCod, P0AH18_A129BarCod, P0AH18_A132BarCodReo, P0AH18_A130BarCodPar, P0AH18_A2804RecLinMaq, P0AH18_A1273RecLinPro, P0AH18_A14055RecManAut, P0AH18_A5725RecLote,
            P0AH18_A3274RecPrdTnq, P0AH18_A2394RecForNro, P0AH18_A488ForPrdDsc, P0AH18_n488ForPrdDsc, P0AH18_A686PrdCant, P0AH18_A431FacCon, P0AH18_A875RecPrdDsc, P0AH18_A872RecPrdNum, P0AH18_A811RecLin, P0AH18_A766ProForDsc,
            P0AH18_A764ProForCod
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
   private byte AV59RecLinpro ;
   private byte AV66Recetadetinte90__wcds_1_tfreclinpro ;
   private byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ;
   private byte AV84Recetadetinte90__wcds_19_tfrecfornro ;
   private byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ;
   private byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ;
   private byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private short AV16TFRecLin ;
   private short AV17TFRecLin_To ;
   private short AV57reclinmaq ;
   private short AV72Recetadetinte90__wcds_7_tfreclin ;
   private short AV73Recetadetinte90__wcds_8_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV64GXV1 ;
   private int AV54barcod ;
   private int A129BarCod ;
   private int AV34InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV22TFFacCon ;
   private java.math.BigDecimal AV23TFFacCon_To ;
   private java.math.BigDecimal AV24TFPrdCant ;
   private java.math.BigDecimal AV25TFPrdCant_To ;
   private java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ;
   private java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ;
   private java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ;
   private java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ;
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
   private String AV60TFRecManAut ;
   private String AV61TFRecManAut_Sel ;
   private String AV53Emprcod ;
   private String AV56Barcodpar ;
   private String A764ProForCod ;
   private String AV68Recetadetinte90__wcds_3_tfproforcod ;
   private String AV69Recetadetinte90__wcds_4_tfproforcod_sel ;
   private String AV70Recetadetinte90__wcds_5_tfprofordsc ;
   private String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ;
   private String AV74Recetadetinte90__wcds_9_tfrecprdnum ;
   private String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ;
   private String AV76Recetadetinte90__wcds_11_tfrecprddsc ;
   private String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ;
   private String AV82Recetadetinte90__wcds_17_tfforprddsc ;
   private String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ;
   private String AV88Recetadetinte90__wcds_23_tfreclote ;
   private String AV89Recetadetinte90__wcds_24_tfreclote_sel ;
   private String AV90Recetadetinte90__wcds_25_tfrecmanaut ;
   private String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ;
   private String scmdbuf ;
   private String lV68Recetadetinte90__wcds_3_tfproforcod ;
   private String lV70Recetadetinte90__wcds_5_tfprofordsc ;
   private String lV74Recetadetinte90__wcds_9_tfrecprdnum ;
   private String lV76Recetadetinte90__wcds_11_tfrecprddsc ;
   private String lV82Recetadetinte90__wcds_17_tfforprddsc ;
   private String lV88Recetadetinte90__wcds_23_tfreclote ;
   private String lV90Recetadetinte90__wcds_25_tfrecmanaut ;
   private String A766ProForDsc ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A14055RecManAut ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brkAH12 ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean brkAH14 ;
   private boolean brkAH16 ;
   private boolean brkAH18 ;
   private boolean brkAH110 ;
   private boolean brkAH112 ;
   private boolean brkAH114 ;
   private String AV49OptionsJson ;
   private String AV50OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV46DDOName ;
   private String AV47SearchTxt ;
   private String AV48SearchTxtTo ;
   private String AV35Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AH12_A490ForPrdUMe ;
   private boolean[] P0AH12_n490ForPrdUMe ;
   private String[] P0AH12_A396EmprCod ;
   private int[] P0AH12_A129BarCod ;
   private byte[] P0AH12_A132BarCodReo ;
   private String[] P0AH12_A130BarCodPar ;
   private short[] P0AH12_A2804RecLinMaq ;
   private byte[] P0AH12_A1273RecLinPro ;
   private String[] P0AH12_A764ProForCod ;
   private String[] P0AH12_A14055RecManAut ;
   private String[] P0AH12_A5725RecLote ;
   private byte[] P0AH12_A3274RecPrdTnq ;
   private byte[] P0AH12_A2394RecForNro ;
   private String[] P0AH12_A488ForPrdDsc ;
   private boolean[] P0AH12_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AH12_A686PrdCant ;
   private java.math.BigDecimal[] P0AH12_A431FacCon ;
   private String[] P0AH12_A875RecPrdDsc ;
   private String[] P0AH12_A872RecPrdNum ;
   private short[] P0AH12_A811RecLin ;
   private String[] P0AH12_A766ProForDsc ;
   private byte[] P0AH13_A490ForPrdUMe ;
   private boolean[] P0AH13_n490ForPrdUMe ;
   private String[] P0AH13_A396EmprCod ;
   private int[] P0AH13_A129BarCod ;
   private byte[] P0AH13_A132BarCodReo ;
   private String[] P0AH13_A130BarCodPar ;
   private short[] P0AH13_A2804RecLinMaq ;
   private byte[] P0AH13_A1273RecLinPro ;
   private String[] P0AH13_A766ProForDsc ;
   private String[] P0AH13_A14055RecManAut ;
   private String[] P0AH13_A5725RecLote ;
   private byte[] P0AH13_A3274RecPrdTnq ;
   private byte[] P0AH13_A2394RecForNro ;
   private String[] P0AH13_A488ForPrdDsc ;
   private boolean[] P0AH13_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AH13_A686PrdCant ;
   private java.math.BigDecimal[] P0AH13_A431FacCon ;
   private String[] P0AH13_A875RecPrdDsc ;
   private String[] P0AH13_A872RecPrdNum ;
   private short[] P0AH13_A811RecLin ;
   private String[] P0AH13_A764ProForCod ;
   private byte[] P0AH14_A490ForPrdUMe ;
   private boolean[] P0AH14_n490ForPrdUMe ;
   private String[] P0AH14_A396EmprCod ;
   private int[] P0AH14_A129BarCod ;
   private byte[] P0AH14_A132BarCodReo ;
   private String[] P0AH14_A130BarCodPar ;
   private short[] P0AH14_A2804RecLinMaq ;
   private byte[] P0AH14_A1273RecLinPro ;
   private String[] P0AH14_A872RecPrdNum ;
   private String[] P0AH14_A14055RecManAut ;
   private String[] P0AH14_A5725RecLote ;
   private byte[] P0AH14_A3274RecPrdTnq ;
   private byte[] P0AH14_A2394RecForNro ;
   private String[] P0AH14_A488ForPrdDsc ;
   private boolean[] P0AH14_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AH14_A686PrdCant ;
   private java.math.BigDecimal[] P0AH14_A431FacCon ;
   private String[] P0AH14_A875RecPrdDsc ;
   private short[] P0AH14_A811RecLin ;
   private String[] P0AH14_A766ProForDsc ;
   private String[] P0AH14_A764ProForCod ;
   private byte[] P0AH15_A490ForPrdUMe ;
   private boolean[] P0AH15_n490ForPrdUMe ;
   private String[] P0AH15_A396EmprCod ;
   private int[] P0AH15_A129BarCod ;
   private byte[] P0AH15_A132BarCodReo ;
   private String[] P0AH15_A130BarCodPar ;
   private short[] P0AH15_A2804RecLinMaq ;
   private byte[] P0AH15_A1273RecLinPro ;
   private String[] P0AH15_A875RecPrdDsc ;
   private String[] P0AH15_A14055RecManAut ;
   private String[] P0AH15_A5725RecLote ;
   private byte[] P0AH15_A3274RecPrdTnq ;
   private byte[] P0AH15_A2394RecForNro ;
   private String[] P0AH15_A488ForPrdDsc ;
   private boolean[] P0AH15_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AH15_A686PrdCant ;
   private java.math.BigDecimal[] P0AH15_A431FacCon ;
   private String[] P0AH15_A872RecPrdNum ;
   private short[] P0AH15_A811RecLin ;
   private String[] P0AH15_A766ProForDsc ;
   private String[] P0AH15_A764ProForCod ;
   private byte[] P0AH16_A490ForPrdUMe ;
   private boolean[] P0AH16_n490ForPrdUMe ;
   private String[] P0AH16_A396EmprCod ;
   private short[] P0AH16_A2804RecLinMaq ;
   private String[] P0AH16_A130BarCodPar ;
   private byte[] P0AH16_A132BarCodReo ;
   private int[] P0AH16_A129BarCod ;
   private String[] P0AH16_A14055RecManAut ;
   private String[] P0AH16_A5725RecLote ;
   private byte[] P0AH16_A3274RecPrdTnq ;
   private byte[] P0AH16_A2394RecForNro ;
   private String[] P0AH16_A488ForPrdDsc ;
   private boolean[] P0AH16_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AH16_A686PrdCant ;
   private java.math.BigDecimal[] P0AH16_A431FacCon ;
   private String[] P0AH16_A875RecPrdDsc ;
   private String[] P0AH16_A872RecPrdNum ;
   private short[] P0AH16_A811RecLin ;
   private String[] P0AH16_A766ProForDsc ;
   private String[] P0AH16_A764ProForCod ;
   private byte[] P0AH16_A1273RecLinPro ;
   private byte[] P0AH17_A490ForPrdUMe ;
   private boolean[] P0AH17_n490ForPrdUMe ;
   private String[] P0AH17_A396EmprCod ;
   private int[] P0AH17_A129BarCod ;
   private byte[] P0AH17_A132BarCodReo ;
   private String[] P0AH17_A130BarCodPar ;
   private short[] P0AH17_A2804RecLinMaq ;
   private byte[] P0AH17_A1273RecLinPro ;
   private String[] P0AH17_A5725RecLote ;
   private String[] P0AH17_A14055RecManAut ;
   private byte[] P0AH17_A3274RecPrdTnq ;
   private byte[] P0AH17_A2394RecForNro ;
   private String[] P0AH17_A488ForPrdDsc ;
   private boolean[] P0AH17_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AH17_A686PrdCant ;
   private java.math.BigDecimal[] P0AH17_A431FacCon ;
   private String[] P0AH17_A875RecPrdDsc ;
   private String[] P0AH17_A872RecPrdNum ;
   private short[] P0AH17_A811RecLin ;
   private String[] P0AH17_A766ProForDsc ;
   private String[] P0AH17_A764ProForCod ;
   private byte[] P0AH18_A490ForPrdUMe ;
   private boolean[] P0AH18_n490ForPrdUMe ;
   private String[] P0AH18_A396EmprCod ;
   private int[] P0AH18_A129BarCod ;
   private byte[] P0AH18_A132BarCodReo ;
   private String[] P0AH18_A130BarCodPar ;
   private short[] P0AH18_A2804RecLinMaq ;
   private byte[] P0AH18_A1273RecLinPro ;
   private String[] P0AH18_A14055RecManAut ;
   private String[] P0AH18_A5725RecLote ;
   private byte[] P0AH18_A3274RecPrdTnq ;
   private byte[] P0AH18_A2394RecForNro ;
   private String[] P0AH18_A488ForPrdDsc ;
   private boolean[] P0AH18_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AH18_A686PrdCant ;
   private java.math.BigDecimal[] P0AH18_A431FacCon ;
   private String[] P0AH18_A875RecPrdDsc ;
   private String[] P0AH18_A872RecPrdNum ;
   private short[] P0AH18_A811RecLin ;
   private String[] P0AH18_A766ProForDsc ;
   private String[] P0AH18_A764ProForCod ;
   private GXSimpleCollection<String> AV36Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV39OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class recetadetinte90__wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AH12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV66Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV68Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV72Recetadetinte90__wcds_7_tfreclin ,
                                          short AV73Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV84Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV88Recetadetinte90__wcds_23_tfreclote ,
                                          String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                          String A14055RecManAut ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57reclinmaq ,
                                          byte AV59RecLinpro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T3.ProForCod, T1.RecManAut, T1.RecLote, T1.RecPrdTnq, T1.RecForNro," ;
      scmdbuf += " T2.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV66Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AH13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV66Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV68Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV72Recetadetinte90__wcds_7_tfreclin ,
                                          short AV73Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV84Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV88Recetadetinte90__wcds_23_tfreclote ,
                                          String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                          String A14055RecManAut ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57reclinmaq ,
                                          byte AV59RecLinpro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T4.ProForDsc, T1.RecManAut, T1.RecLote, T1.RecPrdTnq, T1.RecForNro," ;
      scmdbuf += " T2.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T3.ProForCod FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV66Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.ProForDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AH14( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV66Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV68Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV72Recetadetinte90__wcds_7_tfreclin ,
                                          short AV73Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV84Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV88Recetadetinte90__wcds_23_tfreclote ,
                                          String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                          String A14055RecManAut ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57reclinmaq ,
                                          byte AV59RecLinpro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdNum, T1.RecManAut, T1.RecLote, T1.RecPrdTnq, T1.RecForNro," ;
      scmdbuf += " T2.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.RecPrdDsc, T1.RecLin, T4.ProForDsc, T3.ProForCod FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV66Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AH15( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV66Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV68Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV72Recetadetinte90__wcds_7_tfreclin ,
                                          short AV73Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV84Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV88Recetadetinte90__wcds_23_tfreclote ,
                                          String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                          String A14055RecManAut ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57reclinmaq ,
                                          byte AV59RecLinpro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdDsc, T1.RecManAut, T1.RecLote, T1.RecPrdTnq, T1.RecForNro," ;
      scmdbuf += " T2.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV66Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AH16( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV66Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV68Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV72Recetadetinte90__wcds_7_tfreclin ,
                                          short AV73Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV84Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV88Recetadetinte90__wcds_23_tfreclote ,
                                          String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                          String A14055RecManAut ,
                                          int A129BarCod ,
                                          int AV54barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57reclinmaq ,
                                          byte AV59RecLinpro ,
                                          String AV53Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[32];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecManAut, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV66Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AH17( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV66Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV68Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV72Recetadetinte90__wcds_7_tfreclin ,
                                          short AV73Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV84Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV88Recetadetinte90__wcds_23_tfreclote ,
                                          String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                          String A14055RecManAut ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57reclinmaq ,
                                          byte AV59RecLinpro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[32];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLote, T1.RecManAut, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc," ;
      scmdbuf += " T1.PrdCant, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV66Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecLote" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0AH18( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV66Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV67Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV69Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV68Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV71Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV70Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV72Recetadetinte90__wcds_7_tfreclin ,
                                          short AV73Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV75Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV74Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV77Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV76Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV78Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV79Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV80Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV81Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV83Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV82Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV84Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV85Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV86Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV87Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV89Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV88Recetadetinte90__wcds_23_tfreclote ,
                                          String AV91Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV90Recetadetinte90__wcds_25_tfrecmanaut ,
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
                                          String A14055RecManAut ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A129BarCod ,
                                          int AV54barcod ,
                                          byte A132BarCodReo ,
                                          byte AV55Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV56Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV57reclinmaq ,
                                          byte AV59RecLinpro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[32];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecManAut, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc," ;
      scmdbuf += " T1.PrdCant, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV66Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecManAut" ;
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
                  return conditional_P0AH12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).byteValue() );
            case 1 :
                  return conditional_P0AH13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).byteValue() );
            case 2 :
                  return conditional_P0AH14(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).byteValue() );
            case 3 :
                  return conditional_P0AH15(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).byteValue() );
            case 4 :
                  return conditional_P0AH16(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 5 :
                  return conditional_P0AH17(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).byteValue() );
            case 6 :
                  return conditional_P0AH18(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AH12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH16", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH18", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 30);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
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
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[16])[0] = rslt.getString(15, 26);
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[16])[0] = rslt.getString(15, 26);
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
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
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
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
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
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
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
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
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
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
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
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
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
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
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
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
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               return;
            case 4 :
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
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
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
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               return;
            case 5 :
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
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
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
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               return;
            case 6 :
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
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
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
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               return;
      }
   }

}

