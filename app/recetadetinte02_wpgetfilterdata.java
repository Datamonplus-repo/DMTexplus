package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte02_wpgetfilterdata extends GXProcedure
{
   public recetadetinte02_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte02_wpgetfilterdata.class ), "" );
   }

   public recetadetinte02_wpgetfilterdata( int remoteHandle ,
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
      recetadetinte02_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetadetinte02_wpgetfilterdata.this.AV32DDOName = aP0;
      recetadetinte02_wpgetfilterdata.this.AV30SearchTxt = aP1;
      recetadetinte02_wpgetfilterdata.this.AV31SearchTxtTo = aP2;
      recetadetinte02_wpgetfilterdata.this.aP3 = aP3;
      recetadetinte02_wpgetfilterdata.this.aP4 = aP4;
      recetadetinte02_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PROFORCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PROFORDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECLOTE") == 0 )
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
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("RecetadeTinte02_WPGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetadeTinte02_WPGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("RecetadeTinte02_WPGridState"), null, null);
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV56TFProForCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV57TFProForCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV58TFProForDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV59TFProForDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV12TFRecLin = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFRecLin_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV14TFRecPrdNum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV15TFRecPrdNum_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV54TFRecPrdDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV55TFRecPrdDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV20TFFacCon = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFFacCon_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV22TFPrdCant = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdCant_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV18TFForPrdDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV19TFForPrdDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV24TFRecForNro = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFRecForNro_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV26TFRecPrdTnq = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFRecPrdTnq_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
            AV49Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50Barcod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51Barcodreo = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV52Barcodpar = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV53RecLinMaq = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODE") == 0 )
         {
            Gx_mode = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VARMSG") == 0 )
         {
            AV64varmsg = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV56TFProForCod = AV30SearchTxt ;
      AV57TFProForCod_Sel = "" ;
      AV70Recetadetinte02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV71Recetadetinte02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV72Recetadetinte02_wpds_3_tfproforcod = AV56TFProForCod ;
      AV73Recetadetinte02_wpds_4_tfproforcod_sel = AV57TFProForCod_Sel ;
      AV74Recetadetinte02_wpds_5_tfprofordsc = AV58TFProForDsc ;
      AV75Recetadetinte02_wpds_6_tfprofordsc_sel = AV59TFProForDsc_Sel ;
      AV76Recetadetinte02_wpds_7_tfreclin = AV12TFRecLin ;
      AV77Recetadetinte02_wpds_8_tfreclin_to = AV13TFRecLin_To ;
      AV78Recetadetinte02_wpds_9_tfrecprdnum = AV14TFRecPrdNum ;
      AV79Recetadetinte02_wpds_10_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV80Recetadetinte02_wpds_11_tfrecprddsc = AV54TFRecPrdDsc ;
      AV81Recetadetinte02_wpds_12_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV82Recetadetinte02_wpds_13_tffaccon = AV20TFFacCon ;
      AV83Recetadetinte02_wpds_14_tffaccon_to = AV21TFFacCon_To ;
      AV84Recetadetinte02_wpds_15_tfprdcant = AV22TFPrdCant ;
      AV85Recetadetinte02_wpds_16_tfprdcant_to = AV23TFPrdCant_To ;
      AV86Recetadetinte02_wpds_17_tfforprddsc = AV18TFForPrdDsc ;
      AV87Recetadetinte02_wpds_18_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV88Recetadetinte02_wpds_19_tfrecfornro = AV24TFRecForNro ;
      AV89Recetadetinte02_wpds_20_tfrecfornro_to = AV25TFRecForNro_To ;
      AV90Recetadetinte02_wpds_21_tfrecprdtnq = AV26TFRecPrdTnq ;
      AV91Recetadetinte02_wpds_22_tfrecprdtnq_to = AV27TFRecPrdTnq_To ;
      AV92Recetadetinte02_wpds_23_tfreclote = AV28TFRecLote ;
      AV93Recetadetinte02_wpds_24_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                           AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                           AV72Recetadetinte02_wpds_3_tfproforcod ,
                                           AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                           AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to) ,
                                           AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                           AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                           AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                           AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                           AV82Recetadetinte02_wpds_13_tffaccon ,
                                           AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                           AV84Recetadetinte02_wpds_15_tfprdcant ,
                                           AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                           AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                           AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                           AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                           AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV53RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV72Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
      lV74Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
      lV78Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
      lV80Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
      lV86Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
      lV92Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09AA2 */
      pr_default.execute(0, new Object[] {AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar, Short.valueOf(AV53RecLinMaq), Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to), lV72Recetadetinte02_wpds_3_tfproforcod, AV73Recetadetinte02_wpds_4_tfproforcod_sel, lV74Recetadetinte02_wpds_5_tfprofordsc, AV75Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to), lV78Recetadetinte02_wpds_9_tfrecprdnum, AV79Recetadetinte02_wpds_10_tfrecprdnum_sel, lV80Recetadetinte02_wpds_11_tfrecprddsc, AV81Recetadetinte02_wpds_12_tfrecprddsc_sel, AV82Recetadetinte02_wpds_13_tffaccon, AV83Recetadetinte02_wpds_14_tffaccon_to, AV84Recetadetinte02_wpds_15_tfprdcant, AV85Recetadetinte02_wpds_16_tfprdcant_to, lV86Recetadetinte02_wpds_17_tfforprddsc, AV87Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to), lV92Recetadetinte02_wpds_23_tfreclote, AV93Recetadetinte02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9AA2 = false ;
         A490ForPrdUMe = P09AA2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09AA2_n490ForPrdUMe[0] ;
         A396EmprCod = P09AA2_A396EmprCod[0] ;
         A129BarCod = P09AA2_A129BarCod[0] ;
         A132BarCodReo = P09AA2_A132BarCodReo[0] ;
         A130BarCodPar = P09AA2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09AA2_A2804RecLinMaq[0] ;
         A764ProForCod = P09AA2_A764ProForCod[0] ;
         A5725RecLote = P09AA2_A5725RecLote[0] ;
         A3274RecPrdTnq = P09AA2_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09AA2_A2394RecForNro[0] ;
         A488ForPrdDsc = P09AA2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA2_n488ForPrdDsc[0] ;
         A686PrdCant = P09AA2_A686PrdCant[0] ;
         A431FacCon = P09AA2_A431FacCon[0] ;
         A875RecPrdDsc = P09AA2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09AA2_A872RecPrdNum[0] ;
         A811RecLin = P09AA2_A811RecLin[0] ;
         A766ProForDsc = P09AA2_A766ProForDsc[0] ;
         A1273RecLinPro = P09AA2_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09AA2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA2_n488ForPrdDsc[0] ;
         A764ProForCod = P09AA2_A764ProForCod[0] ;
         A766ProForDsc = P09AA2_A766ProForDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09AA2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk9AA2 = false ;
            A396EmprCod = P09AA2_A396EmprCod[0] ;
            A129BarCod = P09AA2_A129BarCod[0] ;
            A132BarCodReo = P09AA2_A132BarCodReo[0] ;
            A130BarCodPar = P09AA2_A130BarCodPar[0] ;
            A2804RecLinMaq = P09AA2_A2804RecLinMaq[0] ;
            A811RecLin = P09AA2_A811RecLin[0] ;
            A1273RecLinPro = P09AA2_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9AA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV34Option = A764ProForCod ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AA2 )
         {
            brk9AA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV58TFProForDsc = AV30SearchTxt ;
      AV59TFProForDsc_Sel = "" ;
      AV70Recetadetinte02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV71Recetadetinte02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV72Recetadetinte02_wpds_3_tfproforcod = AV56TFProForCod ;
      AV73Recetadetinte02_wpds_4_tfproforcod_sel = AV57TFProForCod_Sel ;
      AV74Recetadetinte02_wpds_5_tfprofordsc = AV58TFProForDsc ;
      AV75Recetadetinte02_wpds_6_tfprofordsc_sel = AV59TFProForDsc_Sel ;
      AV76Recetadetinte02_wpds_7_tfreclin = AV12TFRecLin ;
      AV77Recetadetinte02_wpds_8_tfreclin_to = AV13TFRecLin_To ;
      AV78Recetadetinte02_wpds_9_tfrecprdnum = AV14TFRecPrdNum ;
      AV79Recetadetinte02_wpds_10_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV80Recetadetinte02_wpds_11_tfrecprddsc = AV54TFRecPrdDsc ;
      AV81Recetadetinte02_wpds_12_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV82Recetadetinte02_wpds_13_tffaccon = AV20TFFacCon ;
      AV83Recetadetinte02_wpds_14_tffaccon_to = AV21TFFacCon_To ;
      AV84Recetadetinte02_wpds_15_tfprdcant = AV22TFPrdCant ;
      AV85Recetadetinte02_wpds_16_tfprdcant_to = AV23TFPrdCant_To ;
      AV86Recetadetinte02_wpds_17_tfforprddsc = AV18TFForPrdDsc ;
      AV87Recetadetinte02_wpds_18_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV88Recetadetinte02_wpds_19_tfrecfornro = AV24TFRecForNro ;
      AV89Recetadetinte02_wpds_20_tfrecfornro_to = AV25TFRecForNro_To ;
      AV90Recetadetinte02_wpds_21_tfrecprdtnq = AV26TFRecPrdTnq ;
      AV91Recetadetinte02_wpds_22_tfrecprdtnq_to = AV27TFRecPrdTnq_To ;
      AV92Recetadetinte02_wpds_23_tfreclote = AV28TFRecLote ;
      AV93Recetadetinte02_wpds_24_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                           AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                           AV72Recetadetinte02_wpds_3_tfproforcod ,
                                           AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                           AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to) ,
                                           AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                           AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                           AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                           AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                           AV82Recetadetinte02_wpds_13_tffaccon ,
                                           AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                           AV84Recetadetinte02_wpds_15_tfprdcant ,
                                           AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                           AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                           AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                           AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                           AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV53RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV72Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
      lV74Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
      lV78Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
      lV80Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
      lV86Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
      lV92Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09AA3 */
      pr_default.execute(1, new Object[] {AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar, Short.valueOf(AV53RecLinMaq), Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to), lV72Recetadetinte02_wpds_3_tfproforcod, AV73Recetadetinte02_wpds_4_tfproforcod_sel, lV74Recetadetinte02_wpds_5_tfprofordsc, AV75Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to), lV78Recetadetinte02_wpds_9_tfrecprdnum, AV79Recetadetinte02_wpds_10_tfrecprdnum_sel, lV80Recetadetinte02_wpds_11_tfrecprddsc, AV81Recetadetinte02_wpds_12_tfrecprddsc_sel, AV82Recetadetinte02_wpds_13_tffaccon, AV83Recetadetinte02_wpds_14_tffaccon_to, AV84Recetadetinte02_wpds_15_tfprdcant, AV85Recetadetinte02_wpds_16_tfprdcant_to, lV86Recetadetinte02_wpds_17_tfforprddsc, AV87Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to), lV92Recetadetinte02_wpds_23_tfreclote, AV93Recetadetinte02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9AA4 = false ;
         A490ForPrdUMe = P09AA3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09AA3_n490ForPrdUMe[0] ;
         A396EmprCod = P09AA3_A396EmprCod[0] ;
         A129BarCod = P09AA3_A129BarCod[0] ;
         A132BarCodReo = P09AA3_A132BarCodReo[0] ;
         A130BarCodPar = P09AA3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09AA3_A2804RecLinMaq[0] ;
         A766ProForDsc = P09AA3_A766ProForDsc[0] ;
         A5725RecLote = P09AA3_A5725RecLote[0] ;
         A3274RecPrdTnq = P09AA3_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09AA3_A2394RecForNro[0] ;
         A488ForPrdDsc = P09AA3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA3_n488ForPrdDsc[0] ;
         A686PrdCant = P09AA3_A686PrdCant[0] ;
         A431FacCon = P09AA3_A431FacCon[0] ;
         A875RecPrdDsc = P09AA3_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09AA3_A872RecPrdNum[0] ;
         A811RecLin = P09AA3_A811RecLin[0] ;
         A764ProForCod = P09AA3_A764ProForCod[0] ;
         A1273RecLinPro = P09AA3_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09AA3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA3_n488ForPrdDsc[0] ;
         A764ProForCod = P09AA3_A764ProForCod[0] ;
         A766ProForDsc = P09AA3_A766ProForDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09AA3_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brk9AA4 = false ;
            A396EmprCod = P09AA3_A396EmprCod[0] ;
            A129BarCod = P09AA3_A129BarCod[0] ;
            A132BarCodReo = P09AA3_A132BarCodReo[0] ;
            A130BarCodPar = P09AA3_A130BarCodPar[0] ;
            A2804RecLinMaq = P09AA3_A2804RecLinMaq[0] ;
            A811RecLin = P09AA3_A811RecLin[0] ;
            A764ProForCod = P09AA3_A764ProForCod[0] ;
            A1273RecLinPro = P09AA3_A1273RecLinPro[0] ;
            A764ProForCod = P09AA3_A764ProForCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9AA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV34Option = A766ProForDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AA4 )
         {
            brk9AA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFRecPrdNum = AV30SearchTxt ;
      AV15TFRecPrdNum_Sel = "" ;
      AV70Recetadetinte02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV71Recetadetinte02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV72Recetadetinte02_wpds_3_tfproforcod = AV56TFProForCod ;
      AV73Recetadetinte02_wpds_4_tfproforcod_sel = AV57TFProForCod_Sel ;
      AV74Recetadetinte02_wpds_5_tfprofordsc = AV58TFProForDsc ;
      AV75Recetadetinte02_wpds_6_tfprofordsc_sel = AV59TFProForDsc_Sel ;
      AV76Recetadetinte02_wpds_7_tfreclin = AV12TFRecLin ;
      AV77Recetadetinte02_wpds_8_tfreclin_to = AV13TFRecLin_To ;
      AV78Recetadetinte02_wpds_9_tfrecprdnum = AV14TFRecPrdNum ;
      AV79Recetadetinte02_wpds_10_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV80Recetadetinte02_wpds_11_tfrecprddsc = AV54TFRecPrdDsc ;
      AV81Recetadetinte02_wpds_12_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV82Recetadetinte02_wpds_13_tffaccon = AV20TFFacCon ;
      AV83Recetadetinte02_wpds_14_tffaccon_to = AV21TFFacCon_To ;
      AV84Recetadetinte02_wpds_15_tfprdcant = AV22TFPrdCant ;
      AV85Recetadetinte02_wpds_16_tfprdcant_to = AV23TFPrdCant_To ;
      AV86Recetadetinte02_wpds_17_tfforprddsc = AV18TFForPrdDsc ;
      AV87Recetadetinte02_wpds_18_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV88Recetadetinte02_wpds_19_tfrecfornro = AV24TFRecForNro ;
      AV89Recetadetinte02_wpds_20_tfrecfornro_to = AV25TFRecForNro_To ;
      AV90Recetadetinte02_wpds_21_tfrecprdtnq = AV26TFRecPrdTnq ;
      AV91Recetadetinte02_wpds_22_tfrecprdtnq_to = AV27TFRecPrdTnq_To ;
      AV92Recetadetinte02_wpds_23_tfreclote = AV28TFRecLote ;
      AV93Recetadetinte02_wpds_24_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                           AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                           AV72Recetadetinte02_wpds_3_tfproforcod ,
                                           AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                           AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to) ,
                                           AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                           AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                           AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                           AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                           AV82Recetadetinte02_wpds_13_tffaccon ,
                                           AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                           AV84Recetadetinte02_wpds_15_tfprdcant ,
                                           AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                           AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                           AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                           AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                           AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV53RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV72Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
      lV74Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
      lV78Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
      lV80Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
      lV86Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
      lV92Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09AA4 */
      pr_default.execute(2, new Object[] {AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar, Short.valueOf(AV53RecLinMaq), Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to), lV72Recetadetinte02_wpds_3_tfproforcod, AV73Recetadetinte02_wpds_4_tfproforcod_sel, lV74Recetadetinte02_wpds_5_tfprofordsc, AV75Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to), lV78Recetadetinte02_wpds_9_tfrecprdnum, AV79Recetadetinte02_wpds_10_tfrecprdnum_sel, lV80Recetadetinte02_wpds_11_tfrecprddsc, AV81Recetadetinte02_wpds_12_tfrecprddsc_sel, AV82Recetadetinte02_wpds_13_tffaccon, AV83Recetadetinte02_wpds_14_tffaccon_to, AV84Recetadetinte02_wpds_15_tfprdcant, AV85Recetadetinte02_wpds_16_tfprdcant_to, lV86Recetadetinte02_wpds_17_tfforprddsc, AV87Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to), lV92Recetadetinte02_wpds_23_tfreclote, AV93Recetadetinte02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9AA6 = false ;
         A490ForPrdUMe = P09AA4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09AA4_n490ForPrdUMe[0] ;
         A396EmprCod = P09AA4_A396EmprCod[0] ;
         A129BarCod = P09AA4_A129BarCod[0] ;
         A132BarCodReo = P09AA4_A132BarCodReo[0] ;
         A130BarCodPar = P09AA4_A130BarCodPar[0] ;
         A2804RecLinMaq = P09AA4_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09AA4_A872RecPrdNum[0] ;
         A5725RecLote = P09AA4_A5725RecLote[0] ;
         A3274RecPrdTnq = P09AA4_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09AA4_A2394RecForNro[0] ;
         A488ForPrdDsc = P09AA4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA4_n488ForPrdDsc[0] ;
         A686PrdCant = P09AA4_A686PrdCant[0] ;
         A431FacCon = P09AA4_A431FacCon[0] ;
         A875RecPrdDsc = P09AA4_A875RecPrdDsc[0] ;
         A811RecLin = P09AA4_A811RecLin[0] ;
         A766ProForDsc = P09AA4_A766ProForDsc[0] ;
         A764ProForCod = P09AA4_A764ProForCod[0] ;
         A1273RecLinPro = P09AA4_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09AA4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA4_n488ForPrdDsc[0] ;
         A764ProForCod = P09AA4_A764ProForCod[0] ;
         A766ProForDsc = P09AA4_A766ProForDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09AA4_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brk9AA6 = false ;
            A396EmprCod = P09AA4_A396EmprCod[0] ;
            A129BarCod = P09AA4_A129BarCod[0] ;
            A132BarCodReo = P09AA4_A132BarCodReo[0] ;
            A130BarCodPar = P09AA4_A130BarCodPar[0] ;
            A2804RecLinMaq = P09AA4_A2804RecLinMaq[0] ;
            A811RecLin = P09AA4_A811RecLin[0] ;
            A1273RecLinPro = P09AA4_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9AA6 = true ;
            pr_default.readNext(2);
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
         if ( ! brk9AA6 )
         {
            brk9AA6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV54TFRecPrdDsc = AV30SearchTxt ;
      AV55TFRecPrdDsc_Sel = "" ;
      AV70Recetadetinte02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV71Recetadetinte02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV72Recetadetinte02_wpds_3_tfproforcod = AV56TFProForCod ;
      AV73Recetadetinte02_wpds_4_tfproforcod_sel = AV57TFProForCod_Sel ;
      AV74Recetadetinte02_wpds_5_tfprofordsc = AV58TFProForDsc ;
      AV75Recetadetinte02_wpds_6_tfprofordsc_sel = AV59TFProForDsc_Sel ;
      AV76Recetadetinte02_wpds_7_tfreclin = AV12TFRecLin ;
      AV77Recetadetinte02_wpds_8_tfreclin_to = AV13TFRecLin_To ;
      AV78Recetadetinte02_wpds_9_tfrecprdnum = AV14TFRecPrdNum ;
      AV79Recetadetinte02_wpds_10_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV80Recetadetinte02_wpds_11_tfrecprddsc = AV54TFRecPrdDsc ;
      AV81Recetadetinte02_wpds_12_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV82Recetadetinte02_wpds_13_tffaccon = AV20TFFacCon ;
      AV83Recetadetinte02_wpds_14_tffaccon_to = AV21TFFacCon_To ;
      AV84Recetadetinte02_wpds_15_tfprdcant = AV22TFPrdCant ;
      AV85Recetadetinte02_wpds_16_tfprdcant_to = AV23TFPrdCant_To ;
      AV86Recetadetinte02_wpds_17_tfforprddsc = AV18TFForPrdDsc ;
      AV87Recetadetinte02_wpds_18_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV88Recetadetinte02_wpds_19_tfrecfornro = AV24TFRecForNro ;
      AV89Recetadetinte02_wpds_20_tfrecfornro_to = AV25TFRecForNro_To ;
      AV90Recetadetinte02_wpds_21_tfrecprdtnq = AV26TFRecPrdTnq ;
      AV91Recetadetinte02_wpds_22_tfrecprdtnq_to = AV27TFRecPrdTnq_To ;
      AV92Recetadetinte02_wpds_23_tfreclote = AV28TFRecLote ;
      AV93Recetadetinte02_wpds_24_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                           AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                           AV72Recetadetinte02_wpds_3_tfproforcod ,
                                           AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                           AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to) ,
                                           AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                           AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                           AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                           AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                           AV82Recetadetinte02_wpds_13_tffaccon ,
                                           AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                           AV84Recetadetinte02_wpds_15_tfprdcant ,
                                           AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                           AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                           AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                           AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                           AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV53RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV72Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
      lV74Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
      lV78Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
      lV80Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
      lV86Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
      lV92Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09AA5 */
      pr_default.execute(3, new Object[] {AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar, Short.valueOf(AV53RecLinMaq), Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to), lV72Recetadetinte02_wpds_3_tfproforcod, AV73Recetadetinte02_wpds_4_tfproforcod_sel, lV74Recetadetinte02_wpds_5_tfprofordsc, AV75Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to), lV78Recetadetinte02_wpds_9_tfrecprdnum, AV79Recetadetinte02_wpds_10_tfrecprdnum_sel, lV80Recetadetinte02_wpds_11_tfrecprddsc, AV81Recetadetinte02_wpds_12_tfrecprddsc_sel, AV82Recetadetinte02_wpds_13_tffaccon, AV83Recetadetinte02_wpds_14_tffaccon_to, AV84Recetadetinte02_wpds_15_tfprdcant, AV85Recetadetinte02_wpds_16_tfprdcant_to, lV86Recetadetinte02_wpds_17_tfforprddsc, AV87Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to), lV92Recetadetinte02_wpds_23_tfreclote, AV93Recetadetinte02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9AA8 = false ;
         A490ForPrdUMe = P09AA5_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09AA5_n490ForPrdUMe[0] ;
         A396EmprCod = P09AA5_A396EmprCod[0] ;
         A129BarCod = P09AA5_A129BarCod[0] ;
         A132BarCodReo = P09AA5_A132BarCodReo[0] ;
         A130BarCodPar = P09AA5_A130BarCodPar[0] ;
         A2804RecLinMaq = P09AA5_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09AA5_A875RecPrdDsc[0] ;
         A5725RecLote = P09AA5_A5725RecLote[0] ;
         A3274RecPrdTnq = P09AA5_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09AA5_A2394RecForNro[0] ;
         A488ForPrdDsc = P09AA5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA5_n488ForPrdDsc[0] ;
         A686PrdCant = P09AA5_A686PrdCant[0] ;
         A431FacCon = P09AA5_A431FacCon[0] ;
         A872RecPrdNum = P09AA5_A872RecPrdNum[0] ;
         A811RecLin = P09AA5_A811RecLin[0] ;
         A766ProForDsc = P09AA5_A766ProForDsc[0] ;
         A764ProForCod = P09AA5_A764ProForCod[0] ;
         A1273RecLinPro = P09AA5_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09AA5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA5_n488ForPrdDsc[0] ;
         A764ProForCod = P09AA5_A764ProForCod[0] ;
         A766ProForDsc = P09AA5_A766ProForDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09AA5_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brk9AA8 = false ;
            A396EmprCod = P09AA5_A396EmprCod[0] ;
            A129BarCod = P09AA5_A129BarCod[0] ;
            A132BarCodReo = P09AA5_A132BarCodReo[0] ;
            A130BarCodPar = P09AA5_A130BarCodPar[0] ;
            A2804RecLinMaq = P09AA5_A2804RecLinMaq[0] ;
            A811RecLin = P09AA5_A811RecLin[0] ;
            A1273RecLinPro = P09AA5_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9AA8 = true ;
            pr_default.readNext(3);
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
         if ( ! brk9AA8 )
         {
            brk9AA8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForPrdDsc = AV30SearchTxt ;
      AV19TFForPrdDsc_Sel = "" ;
      AV70Recetadetinte02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV71Recetadetinte02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV72Recetadetinte02_wpds_3_tfproforcod = AV56TFProForCod ;
      AV73Recetadetinte02_wpds_4_tfproforcod_sel = AV57TFProForCod_Sel ;
      AV74Recetadetinte02_wpds_5_tfprofordsc = AV58TFProForDsc ;
      AV75Recetadetinte02_wpds_6_tfprofordsc_sel = AV59TFProForDsc_Sel ;
      AV76Recetadetinte02_wpds_7_tfreclin = AV12TFRecLin ;
      AV77Recetadetinte02_wpds_8_tfreclin_to = AV13TFRecLin_To ;
      AV78Recetadetinte02_wpds_9_tfrecprdnum = AV14TFRecPrdNum ;
      AV79Recetadetinte02_wpds_10_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV80Recetadetinte02_wpds_11_tfrecprddsc = AV54TFRecPrdDsc ;
      AV81Recetadetinte02_wpds_12_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV82Recetadetinte02_wpds_13_tffaccon = AV20TFFacCon ;
      AV83Recetadetinte02_wpds_14_tffaccon_to = AV21TFFacCon_To ;
      AV84Recetadetinte02_wpds_15_tfprdcant = AV22TFPrdCant ;
      AV85Recetadetinte02_wpds_16_tfprdcant_to = AV23TFPrdCant_To ;
      AV86Recetadetinte02_wpds_17_tfforprddsc = AV18TFForPrdDsc ;
      AV87Recetadetinte02_wpds_18_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV88Recetadetinte02_wpds_19_tfrecfornro = AV24TFRecForNro ;
      AV89Recetadetinte02_wpds_20_tfrecfornro_to = AV25TFRecForNro_To ;
      AV90Recetadetinte02_wpds_21_tfrecprdtnq = AV26TFRecPrdTnq ;
      AV91Recetadetinte02_wpds_22_tfrecprdtnq_to = AV27TFRecPrdTnq_To ;
      AV92Recetadetinte02_wpds_23_tfreclote = AV28TFRecLote ;
      AV93Recetadetinte02_wpds_24_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                           AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                           AV72Recetadetinte02_wpds_3_tfproforcod ,
                                           AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                           AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to) ,
                                           AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                           AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                           AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                           AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                           AV82Recetadetinte02_wpds_13_tffaccon ,
                                           AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                           AV84Recetadetinte02_wpds_15_tfprdcant ,
                                           AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                           AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                           AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                           AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                           AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV53RecLinMaq) ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
      lV74Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
      lV78Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
      lV80Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
      lV86Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
      lV92Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09AA6 */
      pr_default.execute(4, new Object[] {AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar, Short.valueOf(AV53RecLinMaq), Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to), lV72Recetadetinte02_wpds_3_tfproforcod, AV73Recetadetinte02_wpds_4_tfproforcod_sel, lV74Recetadetinte02_wpds_5_tfprofordsc, AV75Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to), lV78Recetadetinte02_wpds_9_tfrecprdnum, AV79Recetadetinte02_wpds_10_tfrecprdnum_sel, lV80Recetadetinte02_wpds_11_tfrecprddsc, AV81Recetadetinte02_wpds_12_tfrecprddsc_sel, AV82Recetadetinte02_wpds_13_tffaccon, AV83Recetadetinte02_wpds_14_tffaccon_to, AV84Recetadetinte02_wpds_15_tfprdcant, AV85Recetadetinte02_wpds_16_tfprdcant_to, lV86Recetadetinte02_wpds_17_tfforprddsc, AV87Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to), lV92Recetadetinte02_wpds_23_tfreclote, AV93Recetadetinte02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9AA10 = false ;
         A490ForPrdUMe = P09AA6_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09AA6_n490ForPrdUMe[0] ;
         A396EmprCod = P09AA6_A396EmprCod[0] ;
         A2804RecLinMaq = P09AA6_A2804RecLinMaq[0] ;
         A130BarCodPar = P09AA6_A130BarCodPar[0] ;
         A132BarCodReo = P09AA6_A132BarCodReo[0] ;
         A129BarCod = P09AA6_A129BarCod[0] ;
         A5725RecLote = P09AA6_A5725RecLote[0] ;
         A3274RecPrdTnq = P09AA6_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09AA6_A2394RecForNro[0] ;
         A488ForPrdDsc = P09AA6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA6_n488ForPrdDsc[0] ;
         A686PrdCant = P09AA6_A686PrdCant[0] ;
         A431FacCon = P09AA6_A431FacCon[0] ;
         A875RecPrdDsc = P09AA6_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09AA6_A872RecPrdNum[0] ;
         A811RecLin = P09AA6_A811RecLin[0] ;
         A766ProForDsc = P09AA6_A766ProForDsc[0] ;
         A764ProForCod = P09AA6_A764ProForCod[0] ;
         A1273RecLinPro = P09AA6_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09AA6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA6_n488ForPrdDsc[0] ;
         A764ProForCod = P09AA6_A764ProForCod[0] ;
         A766ProForDsc = P09AA6_A766ProForDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09AA6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09AA6_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk9AA10 = false ;
            A2804RecLinMaq = P09AA6_A2804RecLinMaq[0] ;
            A130BarCodPar = P09AA6_A130BarCodPar[0] ;
            A132BarCodReo = P09AA6_A132BarCodReo[0] ;
            A129BarCod = P09AA6_A129BarCod[0] ;
            A811RecLin = P09AA6_A811RecLin[0] ;
            A1273RecLinPro = P09AA6_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9AA10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV34Option = A488ForPrdDsc ;
            AV33InsertIndex = 1 ;
            while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
            {
               AV33InsertIndex = (int)(AV33InsertIndex+1) ;
            }
            AV35Options.add(AV34Option, AV33InsertIndex);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AA10 )
         {
            brk9AA10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV28TFRecLote = AV30SearchTxt ;
      AV29TFRecLote_Sel = "" ;
      AV70Recetadetinte02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV71Recetadetinte02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV72Recetadetinte02_wpds_3_tfproforcod = AV56TFProForCod ;
      AV73Recetadetinte02_wpds_4_tfproforcod_sel = AV57TFProForCod_Sel ;
      AV74Recetadetinte02_wpds_5_tfprofordsc = AV58TFProForDsc ;
      AV75Recetadetinte02_wpds_6_tfprofordsc_sel = AV59TFProForDsc_Sel ;
      AV76Recetadetinte02_wpds_7_tfreclin = AV12TFRecLin ;
      AV77Recetadetinte02_wpds_8_tfreclin_to = AV13TFRecLin_To ;
      AV78Recetadetinte02_wpds_9_tfrecprdnum = AV14TFRecPrdNum ;
      AV79Recetadetinte02_wpds_10_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV80Recetadetinte02_wpds_11_tfrecprddsc = AV54TFRecPrdDsc ;
      AV81Recetadetinte02_wpds_12_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV82Recetadetinte02_wpds_13_tffaccon = AV20TFFacCon ;
      AV83Recetadetinte02_wpds_14_tffaccon_to = AV21TFFacCon_To ;
      AV84Recetadetinte02_wpds_15_tfprdcant = AV22TFPrdCant ;
      AV85Recetadetinte02_wpds_16_tfprdcant_to = AV23TFPrdCant_To ;
      AV86Recetadetinte02_wpds_17_tfforprddsc = AV18TFForPrdDsc ;
      AV87Recetadetinte02_wpds_18_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV88Recetadetinte02_wpds_19_tfrecfornro = AV24TFRecForNro ;
      AV89Recetadetinte02_wpds_20_tfrecfornro_to = AV25TFRecForNro_To ;
      AV90Recetadetinte02_wpds_21_tfrecprdtnq = AV26TFRecPrdTnq ;
      AV91Recetadetinte02_wpds_22_tfrecprdtnq_to = AV27TFRecPrdTnq_To ;
      AV92Recetadetinte02_wpds_23_tfreclote = AV28TFRecLote ;
      AV93Recetadetinte02_wpds_24_tfreclote_sel = AV29TFRecLote_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                           AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                           AV72Recetadetinte02_wpds_3_tfproforcod ,
                                           AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                           AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to) ,
                                           AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                           AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                           AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                           AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                           AV82Recetadetinte02_wpds_13_tffaccon ,
                                           AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                           AV84Recetadetinte02_wpds_15_tfprdcant ,
                                           AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                           AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                           AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                           AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                           AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV53RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV72Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
      lV74Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
      lV78Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
      lV80Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
      lV86Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
      lV92Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09AA7 */
      pr_default.execute(5, new Object[] {AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar, Short.valueOf(AV53RecLinMaq), Byte.valueOf(AV70Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte02_wpds_2_tfreclinpro_to), lV72Recetadetinte02_wpds_3_tfproforcod, AV73Recetadetinte02_wpds_4_tfproforcod_sel, lV74Recetadetinte02_wpds_5_tfprofordsc, AV75Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV77Recetadetinte02_wpds_8_tfreclin_to), lV78Recetadetinte02_wpds_9_tfrecprdnum, AV79Recetadetinte02_wpds_10_tfrecprdnum_sel, lV80Recetadetinte02_wpds_11_tfrecprddsc, AV81Recetadetinte02_wpds_12_tfrecprddsc_sel, AV82Recetadetinte02_wpds_13_tffaccon, AV83Recetadetinte02_wpds_14_tffaccon_to, AV84Recetadetinte02_wpds_15_tfprdcant, AV85Recetadetinte02_wpds_16_tfprdcant_to, lV86Recetadetinte02_wpds_17_tfforprddsc, AV87Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte02_wpds_22_tfrecprdtnq_to), lV92Recetadetinte02_wpds_23_tfreclote, AV93Recetadetinte02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9AA12 = false ;
         A490ForPrdUMe = P09AA7_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09AA7_n490ForPrdUMe[0] ;
         A396EmprCod = P09AA7_A396EmprCod[0] ;
         A129BarCod = P09AA7_A129BarCod[0] ;
         A132BarCodReo = P09AA7_A132BarCodReo[0] ;
         A130BarCodPar = P09AA7_A130BarCodPar[0] ;
         A2804RecLinMaq = P09AA7_A2804RecLinMaq[0] ;
         A5725RecLote = P09AA7_A5725RecLote[0] ;
         A3274RecPrdTnq = P09AA7_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09AA7_A2394RecForNro[0] ;
         A488ForPrdDsc = P09AA7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA7_n488ForPrdDsc[0] ;
         A686PrdCant = P09AA7_A686PrdCant[0] ;
         A431FacCon = P09AA7_A431FacCon[0] ;
         A875RecPrdDsc = P09AA7_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09AA7_A872RecPrdNum[0] ;
         A811RecLin = P09AA7_A811RecLin[0] ;
         A766ProForDsc = P09AA7_A766ProForDsc[0] ;
         A764ProForCod = P09AA7_A764ProForCod[0] ;
         A1273RecLinPro = P09AA7_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09AA7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09AA7_n488ForPrdDsc[0] ;
         A764ProForCod = P09AA7_A764ProForCod[0] ;
         A766ProForDsc = P09AA7_A766ProForDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09AA7_A5725RecLote[0], A5725RecLote) == 0 ) )
         {
            brk9AA12 = false ;
            A396EmprCod = P09AA7_A396EmprCod[0] ;
            A129BarCod = P09AA7_A129BarCod[0] ;
            A132BarCodReo = P09AA7_A132BarCodReo[0] ;
            A130BarCodPar = P09AA7_A130BarCodPar[0] ;
            A2804RecLinMaq = P09AA7_A2804RecLinMaq[0] ;
            A811RecLin = P09AA7_A811RecLin[0] ;
            A1273RecLinPro = P09AA7_A1273RecLinPro[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9AA12 = true ;
            pr_default.readNext(5);
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
         if ( ! brk9AA12 )
         {
            brk9AA12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadetinte02_wpgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = recetadetinte02_wpgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = recetadetinte02_wpgetfilterdata.this.AV41OptionIndexesJson;
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
      AV56TFProForCod = "" ;
      AV57TFProForCod_Sel = "" ;
      AV58TFProForDsc = "" ;
      AV59TFProForDsc_Sel = "" ;
      AV14TFRecPrdNum = "" ;
      AV15TFRecPrdNum_Sel = "" ;
      AV54TFRecPrdDsc = "" ;
      AV55TFRecPrdDsc_Sel = "" ;
      AV20TFFacCon = DecimalUtil.ZERO ;
      AV21TFFacCon_To = DecimalUtil.ZERO ;
      AV22TFPrdCant = DecimalUtil.ZERO ;
      AV23TFPrdCant_To = DecimalUtil.ZERO ;
      AV18TFForPrdDsc = "" ;
      AV19TFForPrdDsc_Sel = "" ;
      AV28TFRecLote = "" ;
      AV29TFRecLote_Sel = "" ;
      AV49Emprcod = "" ;
      AV52Barcodpar = "" ;
      Gx_mode = "" ;
      AV64varmsg = "" ;
      A764ProForCod = "" ;
      AV72Recetadetinte02_wpds_3_tfproforcod = "" ;
      AV73Recetadetinte02_wpds_4_tfproforcod_sel = "" ;
      AV74Recetadetinte02_wpds_5_tfprofordsc = "" ;
      AV75Recetadetinte02_wpds_6_tfprofordsc_sel = "" ;
      AV78Recetadetinte02_wpds_9_tfrecprdnum = "" ;
      AV79Recetadetinte02_wpds_10_tfrecprdnum_sel = "" ;
      AV80Recetadetinte02_wpds_11_tfrecprddsc = "" ;
      AV81Recetadetinte02_wpds_12_tfrecprddsc_sel = "" ;
      AV82Recetadetinte02_wpds_13_tffaccon = DecimalUtil.ZERO ;
      AV83Recetadetinte02_wpds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV84Recetadetinte02_wpds_15_tfprdcant = DecimalUtil.ZERO ;
      AV85Recetadetinte02_wpds_16_tfprdcant_to = DecimalUtil.ZERO ;
      AV86Recetadetinte02_wpds_17_tfforprddsc = "" ;
      AV87Recetadetinte02_wpds_18_tfforprddsc_sel = "" ;
      AV92Recetadetinte02_wpds_23_tfreclote = "" ;
      AV93Recetadetinte02_wpds_24_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV72Recetadetinte02_wpds_3_tfproforcod = "" ;
      lV74Recetadetinte02_wpds_5_tfprofordsc = "" ;
      lV78Recetadetinte02_wpds_9_tfrecprdnum = "" ;
      lV80Recetadetinte02_wpds_11_tfrecprddsc = "" ;
      lV86Recetadetinte02_wpds_17_tfforprddsc = "" ;
      lV92Recetadetinte02_wpds_23_tfreclote = "" ;
      A766ProForDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09AA2_A490ForPrdUMe = new byte[1] ;
      P09AA2_n490ForPrdUMe = new boolean[] {false} ;
      P09AA2_A396EmprCod = new String[] {""} ;
      P09AA2_A129BarCod = new int[1] ;
      P09AA2_A132BarCodReo = new byte[1] ;
      P09AA2_A130BarCodPar = new String[] {""} ;
      P09AA2_A2804RecLinMaq = new short[1] ;
      P09AA2_A764ProForCod = new String[] {""} ;
      P09AA2_A5725RecLote = new String[] {""} ;
      P09AA2_A3274RecPrdTnq = new byte[1] ;
      P09AA2_A2394RecForNro = new byte[1] ;
      P09AA2_A488ForPrdDsc = new String[] {""} ;
      P09AA2_n488ForPrdDsc = new boolean[] {false} ;
      P09AA2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA2_A875RecPrdDsc = new String[] {""} ;
      P09AA2_A872RecPrdNum = new String[] {""} ;
      P09AA2_A811RecLin = new short[1] ;
      P09AA2_A766ProForDsc = new String[] {""} ;
      P09AA2_A1273RecLinPro = new byte[1] ;
      AV34Option = "" ;
      P09AA3_A490ForPrdUMe = new byte[1] ;
      P09AA3_n490ForPrdUMe = new boolean[] {false} ;
      P09AA3_A396EmprCod = new String[] {""} ;
      P09AA3_A129BarCod = new int[1] ;
      P09AA3_A132BarCodReo = new byte[1] ;
      P09AA3_A130BarCodPar = new String[] {""} ;
      P09AA3_A2804RecLinMaq = new short[1] ;
      P09AA3_A766ProForDsc = new String[] {""} ;
      P09AA3_A5725RecLote = new String[] {""} ;
      P09AA3_A3274RecPrdTnq = new byte[1] ;
      P09AA3_A2394RecForNro = new byte[1] ;
      P09AA3_A488ForPrdDsc = new String[] {""} ;
      P09AA3_n488ForPrdDsc = new boolean[] {false} ;
      P09AA3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA3_A875RecPrdDsc = new String[] {""} ;
      P09AA3_A872RecPrdNum = new String[] {""} ;
      P09AA3_A811RecLin = new short[1] ;
      P09AA3_A764ProForCod = new String[] {""} ;
      P09AA3_A1273RecLinPro = new byte[1] ;
      P09AA4_A490ForPrdUMe = new byte[1] ;
      P09AA4_n490ForPrdUMe = new boolean[] {false} ;
      P09AA4_A396EmprCod = new String[] {""} ;
      P09AA4_A129BarCod = new int[1] ;
      P09AA4_A132BarCodReo = new byte[1] ;
      P09AA4_A130BarCodPar = new String[] {""} ;
      P09AA4_A2804RecLinMaq = new short[1] ;
      P09AA4_A872RecPrdNum = new String[] {""} ;
      P09AA4_A5725RecLote = new String[] {""} ;
      P09AA4_A3274RecPrdTnq = new byte[1] ;
      P09AA4_A2394RecForNro = new byte[1] ;
      P09AA4_A488ForPrdDsc = new String[] {""} ;
      P09AA4_n488ForPrdDsc = new boolean[] {false} ;
      P09AA4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA4_A875RecPrdDsc = new String[] {""} ;
      P09AA4_A811RecLin = new short[1] ;
      P09AA4_A766ProForDsc = new String[] {""} ;
      P09AA4_A764ProForCod = new String[] {""} ;
      P09AA4_A1273RecLinPro = new byte[1] ;
      P09AA5_A490ForPrdUMe = new byte[1] ;
      P09AA5_n490ForPrdUMe = new boolean[] {false} ;
      P09AA5_A396EmprCod = new String[] {""} ;
      P09AA5_A129BarCod = new int[1] ;
      P09AA5_A132BarCodReo = new byte[1] ;
      P09AA5_A130BarCodPar = new String[] {""} ;
      P09AA5_A2804RecLinMaq = new short[1] ;
      P09AA5_A875RecPrdDsc = new String[] {""} ;
      P09AA5_A5725RecLote = new String[] {""} ;
      P09AA5_A3274RecPrdTnq = new byte[1] ;
      P09AA5_A2394RecForNro = new byte[1] ;
      P09AA5_A488ForPrdDsc = new String[] {""} ;
      P09AA5_n488ForPrdDsc = new boolean[] {false} ;
      P09AA5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA5_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA5_A872RecPrdNum = new String[] {""} ;
      P09AA5_A811RecLin = new short[1] ;
      P09AA5_A766ProForDsc = new String[] {""} ;
      P09AA5_A764ProForCod = new String[] {""} ;
      P09AA5_A1273RecLinPro = new byte[1] ;
      P09AA6_A490ForPrdUMe = new byte[1] ;
      P09AA6_n490ForPrdUMe = new boolean[] {false} ;
      P09AA6_A396EmprCod = new String[] {""} ;
      P09AA6_A2804RecLinMaq = new short[1] ;
      P09AA6_A130BarCodPar = new String[] {""} ;
      P09AA6_A132BarCodReo = new byte[1] ;
      P09AA6_A129BarCod = new int[1] ;
      P09AA6_A5725RecLote = new String[] {""} ;
      P09AA6_A3274RecPrdTnq = new byte[1] ;
      P09AA6_A2394RecForNro = new byte[1] ;
      P09AA6_A488ForPrdDsc = new String[] {""} ;
      P09AA6_n488ForPrdDsc = new boolean[] {false} ;
      P09AA6_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA6_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA6_A875RecPrdDsc = new String[] {""} ;
      P09AA6_A872RecPrdNum = new String[] {""} ;
      P09AA6_A811RecLin = new short[1] ;
      P09AA6_A766ProForDsc = new String[] {""} ;
      P09AA6_A764ProForCod = new String[] {""} ;
      P09AA6_A1273RecLinPro = new byte[1] ;
      P09AA7_A490ForPrdUMe = new byte[1] ;
      P09AA7_n490ForPrdUMe = new boolean[] {false} ;
      P09AA7_A396EmprCod = new String[] {""} ;
      P09AA7_A129BarCod = new int[1] ;
      P09AA7_A132BarCodReo = new byte[1] ;
      P09AA7_A130BarCodPar = new String[] {""} ;
      P09AA7_A2804RecLinMaq = new short[1] ;
      P09AA7_A5725RecLote = new String[] {""} ;
      P09AA7_A3274RecPrdTnq = new byte[1] ;
      P09AA7_A2394RecForNro = new byte[1] ;
      P09AA7_A488ForPrdDsc = new String[] {""} ;
      P09AA7_n488ForPrdDsc = new boolean[] {false} ;
      P09AA7_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA7_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AA7_A875RecPrdDsc = new String[] {""} ;
      P09AA7_A872RecPrdNum = new String[] {""} ;
      P09AA7_A811RecLin = new short[1] ;
      P09AA7_A766ProForDsc = new String[] {""} ;
      P09AA7_A764ProForCod = new String[] {""} ;
      P09AA7_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte02_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09AA2_A490ForPrdUMe, P09AA2_n490ForPrdUMe, P09AA2_A396EmprCod, P09AA2_A129BarCod, P09AA2_A132BarCodReo, P09AA2_A130BarCodPar, P09AA2_A2804RecLinMaq, P09AA2_A764ProForCod, P09AA2_A5725RecLote, P09AA2_A3274RecPrdTnq,
            P09AA2_A2394RecForNro, P09AA2_A488ForPrdDsc, P09AA2_n488ForPrdDsc, P09AA2_A686PrdCant, P09AA2_A431FacCon, P09AA2_A875RecPrdDsc, P09AA2_A872RecPrdNum, P09AA2_A811RecLin, P09AA2_A766ProForDsc, P09AA2_A1273RecLinPro
            }
            , new Object[] {
            P09AA3_A490ForPrdUMe, P09AA3_n490ForPrdUMe, P09AA3_A396EmprCod, P09AA3_A129BarCod, P09AA3_A132BarCodReo, P09AA3_A130BarCodPar, P09AA3_A2804RecLinMaq, P09AA3_A766ProForDsc, P09AA3_A5725RecLote, P09AA3_A3274RecPrdTnq,
            P09AA3_A2394RecForNro, P09AA3_A488ForPrdDsc, P09AA3_n488ForPrdDsc, P09AA3_A686PrdCant, P09AA3_A431FacCon, P09AA3_A875RecPrdDsc, P09AA3_A872RecPrdNum, P09AA3_A811RecLin, P09AA3_A764ProForCod, P09AA3_A1273RecLinPro
            }
            , new Object[] {
            P09AA4_A490ForPrdUMe, P09AA4_n490ForPrdUMe, P09AA4_A396EmprCod, P09AA4_A129BarCod, P09AA4_A132BarCodReo, P09AA4_A130BarCodPar, P09AA4_A2804RecLinMaq, P09AA4_A872RecPrdNum, P09AA4_A5725RecLote, P09AA4_A3274RecPrdTnq,
            P09AA4_A2394RecForNro, P09AA4_A488ForPrdDsc, P09AA4_n488ForPrdDsc, P09AA4_A686PrdCant, P09AA4_A431FacCon, P09AA4_A875RecPrdDsc, P09AA4_A811RecLin, P09AA4_A766ProForDsc, P09AA4_A764ProForCod, P09AA4_A1273RecLinPro
            }
            , new Object[] {
            P09AA5_A490ForPrdUMe, P09AA5_n490ForPrdUMe, P09AA5_A396EmprCod, P09AA5_A129BarCod, P09AA5_A132BarCodReo, P09AA5_A130BarCodPar, P09AA5_A2804RecLinMaq, P09AA5_A875RecPrdDsc, P09AA5_A5725RecLote, P09AA5_A3274RecPrdTnq,
            P09AA5_A2394RecForNro, P09AA5_A488ForPrdDsc, P09AA5_n488ForPrdDsc, P09AA5_A686PrdCant, P09AA5_A431FacCon, P09AA5_A872RecPrdNum, P09AA5_A811RecLin, P09AA5_A766ProForDsc, P09AA5_A764ProForCod, P09AA5_A1273RecLinPro
            }
            , new Object[] {
            P09AA6_A490ForPrdUMe, P09AA6_n490ForPrdUMe, P09AA6_A396EmprCod, P09AA6_A2804RecLinMaq, P09AA6_A130BarCodPar, P09AA6_A132BarCodReo, P09AA6_A129BarCod, P09AA6_A5725RecLote, P09AA6_A3274RecPrdTnq, P09AA6_A2394RecForNro,
            P09AA6_A488ForPrdDsc, P09AA6_n488ForPrdDsc, P09AA6_A686PrdCant, P09AA6_A431FacCon, P09AA6_A875RecPrdDsc, P09AA6_A872RecPrdNum, P09AA6_A811RecLin, P09AA6_A766ProForDsc, P09AA6_A764ProForCod, P09AA6_A1273RecLinPro
            }
            , new Object[] {
            P09AA7_A490ForPrdUMe, P09AA7_n490ForPrdUMe, P09AA7_A396EmprCod, P09AA7_A129BarCod, P09AA7_A132BarCodReo, P09AA7_A130BarCodPar, P09AA7_A2804RecLinMaq, P09AA7_A5725RecLote, P09AA7_A3274RecPrdTnq, P09AA7_A2394RecForNro,
            P09AA7_A488ForPrdDsc, P09AA7_n488ForPrdDsc, P09AA7_A686PrdCant, P09AA7_A431FacCon, P09AA7_A875RecPrdDsc, P09AA7_A872RecPrdNum, P09AA7_A811RecLin, P09AA7_A766ProForDsc, P09AA7_A764ProForCod, P09AA7_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV24TFRecForNro ;
   private byte AV25TFRecForNro_To ;
   private byte AV26TFRecPrdTnq ;
   private byte AV27TFRecPrdTnq_To ;
   private byte AV51Barcodreo ;
   private byte AV70Recetadetinte02_wpds_1_tfreclinpro ;
   private byte AV71Recetadetinte02_wpds_2_tfreclinpro_to ;
   private byte AV88Recetadetinte02_wpds_19_tfrecfornro ;
   private byte AV89Recetadetinte02_wpds_20_tfrecfornro_to ;
   private byte AV90Recetadetinte02_wpds_21_tfrecprdtnq ;
   private byte AV91Recetadetinte02_wpds_22_tfrecprdtnq_to ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private short AV12TFRecLin ;
   private short AV13TFRecLin_To ;
   private short AV53RecLinMaq ;
   private short AV76Recetadetinte02_wpds_7_tfreclin ;
   private short AV77Recetadetinte02_wpds_8_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV67GXV1 ;
   private int AV50Barcod ;
   private int A129BarCod ;
   private int AV33InsertIndex ;
   private long AV42count ;
   private java.math.BigDecimal AV20TFFacCon ;
   private java.math.BigDecimal AV21TFFacCon_To ;
   private java.math.BigDecimal AV22TFPrdCant ;
   private java.math.BigDecimal AV23TFPrdCant_To ;
   private java.math.BigDecimal AV82Recetadetinte02_wpds_13_tffaccon ;
   private java.math.BigDecimal AV83Recetadetinte02_wpds_14_tffaccon_to ;
   private java.math.BigDecimal AV84Recetadetinte02_wpds_15_tfprdcant ;
   private java.math.BigDecimal AV85Recetadetinte02_wpds_16_tfprdcant_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV56TFProForCod ;
   private String AV57TFProForCod_Sel ;
   private String AV58TFProForDsc ;
   private String AV59TFProForDsc_Sel ;
   private String AV14TFRecPrdNum ;
   private String AV15TFRecPrdNum_Sel ;
   private String AV54TFRecPrdDsc ;
   private String AV55TFRecPrdDsc_Sel ;
   private String AV18TFForPrdDsc ;
   private String AV19TFForPrdDsc_Sel ;
   private String AV28TFRecLote ;
   private String AV29TFRecLote_Sel ;
   private String AV49Emprcod ;
   private String AV52Barcodpar ;
   private String Gx_mode ;
   private String A764ProForCod ;
   private String AV72Recetadetinte02_wpds_3_tfproforcod ;
   private String AV73Recetadetinte02_wpds_4_tfproforcod_sel ;
   private String AV74Recetadetinte02_wpds_5_tfprofordsc ;
   private String AV75Recetadetinte02_wpds_6_tfprofordsc_sel ;
   private String AV78Recetadetinte02_wpds_9_tfrecprdnum ;
   private String AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ;
   private String AV80Recetadetinte02_wpds_11_tfrecprddsc ;
   private String AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ;
   private String AV86Recetadetinte02_wpds_17_tfforprddsc ;
   private String AV87Recetadetinte02_wpds_18_tfforprddsc_sel ;
   private String AV92Recetadetinte02_wpds_23_tfreclote ;
   private String AV93Recetadetinte02_wpds_24_tfreclote_sel ;
   private String scmdbuf ;
   private String lV72Recetadetinte02_wpds_3_tfproforcod ;
   private String lV74Recetadetinte02_wpds_5_tfprofordsc ;
   private String lV78Recetadetinte02_wpds_9_tfrecprdnum ;
   private String lV80Recetadetinte02_wpds_11_tfrecprddsc ;
   private String lV86Recetadetinte02_wpds_17_tfforprddsc ;
   private String lV92Recetadetinte02_wpds_23_tfreclote ;
   private String A766ProForDsc ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9AA2 ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean brk9AA4 ;
   private boolean brk9AA6 ;
   private boolean brk9AA8 ;
   private boolean brk9AA10 ;
   private boolean brk9AA12 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV64varmsg ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09AA2_A490ForPrdUMe ;
   private boolean[] P09AA2_n490ForPrdUMe ;
   private String[] P09AA2_A396EmprCod ;
   private int[] P09AA2_A129BarCod ;
   private byte[] P09AA2_A132BarCodReo ;
   private String[] P09AA2_A130BarCodPar ;
   private short[] P09AA2_A2804RecLinMaq ;
   private String[] P09AA2_A764ProForCod ;
   private String[] P09AA2_A5725RecLote ;
   private byte[] P09AA2_A3274RecPrdTnq ;
   private byte[] P09AA2_A2394RecForNro ;
   private String[] P09AA2_A488ForPrdDsc ;
   private boolean[] P09AA2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09AA2_A686PrdCant ;
   private java.math.BigDecimal[] P09AA2_A431FacCon ;
   private String[] P09AA2_A875RecPrdDsc ;
   private String[] P09AA2_A872RecPrdNum ;
   private short[] P09AA2_A811RecLin ;
   private String[] P09AA2_A766ProForDsc ;
   private byte[] P09AA2_A1273RecLinPro ;
   private byte[] P09AA3_A490ForPrdUMe ;
   private boolean[] P09AA3_n490ForPrdUMe ;
   private String[] P09AA3_A396EmprCod ;
   private int[] P09AA3_A129BarCod ;
   private byte[] P09AA3_A132BarCodReo ;
   private String[] P09AA3_A130BarCodPar ;
   private short[] P09AA3_A2804RecLinMaq ;
   private String[] P09AA3_A766ProForDsc ;
   private String[] P09AA3_A5725RecLote ;
   private byte[] P09AA3_A3274RecPrdTnq ;
   private byte[] P09AA3_A2394RecForNro ;
   private String[] P09AA3_A488ForPrdDsc ;
   private boolean[] P09AA3_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09AA3_A686PrdCant ;
   private java.math.BigDecimal[] P09AA3_A431FacCon ;
   private String[] P09AA3_A875RecPrdDsc ;
   private String[] P09AA3_A872RecPrdNum ;
   private short[] P09AA3_A811RecLin ;
   private String[] P09AA3_A764ProForCod ;
   private byte[] P09AA3_A1273RecLinPro ;
   private byte[] P09AA4_A490ForPrdUMe ;
   private boolean[] P09AA4_n490ForPrdUMe ;
   private String[] P09AA4_A396EmprCod ;
   private int[] P09AA4_A129BarCod ;
   private byte[] P09AA4_A132BarCodReo ;
   private String[] P09AA4_A130BarCodPar ;
   private short[] P09AA4_A2804RecLinMaq ;
   private String[] P09AA4_A872RecPrdNum ;
   private String[] P09AA4_A5725RecLote ;
   private byte[] P09AA4_A3274RecPrdTnq ;
   private byte[] P09AA4_A2394RecForNro ;
   private String[] P09AA4_A488ForPrdDsc ;
   private boolean[] P09AA4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09AA4_A686PrdCant ;
   private java.math.BigDecimal[] P09AA4_A431FacCon ;
   private String[] P09AA4_A875RecPrdDsc ;
   private short[] P09AA4_A811RecLin ;
   private String[] P09AA4_A766ProForDsc ;
   private String[] P09AA4_A764ProForCod ;
   private byte[] P09AA4_A1273RecLinPro ;
   private byte[] P09AA5_A490ForPrdUMe ;
   private boolean[] P09AA5_n490ForPrdUMe ;
   private String[] P09AA5_A396EmprCod ;
   private int[] P09AA5_A129BarCod ;
   private byte[] P09AA5_A132BarCodReo ;
   private String[] P09AA5_A130BarCodPar ;
   private short[] P09AA5_A2804RecLinMaq ;
   private String[] P09AA5_A875RecPrdDsc ;
   private String[] P09AA5_A5725RecLote ;
   private byte[] P09AA5_A3274RecPrdTnq ;
   private byte[] P09AA5_A2394RecForNro ;
   private String[] P09AA5_A488ForPrdDsc ;
   private boolean[] P09AA5_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09AA5_A686PrdCant ;
   private java.math.BigDecimal[] P09AA5_A431FacCon ;
   private String[] P09AA5_A872RecPrdNum ;
   private short[] P09AA5_A811RecLin ;
   private String[] P09AA5_A766ProForDsc ;
   private String[] P09AA5_A764ProForCod ;
   private byte[] P09AA5_A1273RecLinPro ;
   private byte[] P09AA6_A490ForPrdUMe ;
   private boolean[] P09AA6_n490ForPrdUMe ;
   private String[] P09AA6_A396EmprCod ;
   private short[] P09AA6_A2804RecLinMaq ;
   private String[] P09AA6_A130BarCodPar ;
   private byte[] P09AA6_A132BarCodReo ;
   private int[] P09AA6_A129BarCod ;
   private String[] P09AA6_A5725RecLote ;
   private byte[] P09AA6_A3274RecPrdTnq ;
   private byte[] P09AA6_A2394RecForNro ;
   private String[] P09AA6_A488ForPrdDsc ;
   private boolean[] P09AA6_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09AA6_A686PrdCant ;
   private java.math.BigDecimal[] P09AA6_A431FacCon ;
   private String[] P09AA6_A875RecPrdDsc ;
   private String[] P09AA6_A872RecPrdNum ;
   private short[] P09AA6_A811RecLin ;
   private String[] P09AA6_A766ProForDsc ;
   private String[] P09AA6_A764ProForCod ;
   private byte[] P09AA6_A1273RecLinPro ;
   private byte[] P09AA7_A490ForPrdUMe ;
   private boolean[] P09AA7_n490ForPrdUMe ;
   private String[] P09AA7_A396EmprCod ;
   private int[] P09AA7_A129BarCod ;
   private byte[] P09AA7_A132BarCodReo ;
   private String[] P09AA7_A130BarCodPar ;
   private short[] P09AA7_A2804RecLinMaq ;
   private String[] P09AA7_A5725RecLote ;
   private byte[] P09AA7_A3274RecPrdTnq ;
   private byte[] P09AA7_A2394RecForNro ;
   private String[] P09AA7_A488ForPrdDsc ;
   private boolean[] P09AA7_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09AA7_A686PrdCant ;
   private java.math.BigDecimal[] P09AA7_A431FacCon ;
   private String[] P09AA7_A875RecPrdDsc ;
   private String[] P09AA7_A872RecPrdNum ;
   private short[] P09AA7_A811RecLin ;
   private String[] P09AA7_A766ProForDsc ;
   private String[] P09AA7_A764ProForCod ;
   private byte[] P09AA7_A1273RecLinPro ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class recetadetinte02_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV71Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV76Recetadetinte02_wpds_7_tfreclin ,
                                          short AV77Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV88Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV89Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV53RecLinMaq )
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
      if ( ! (0==AV70Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) )
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

   protected Object[] conditional_P09AA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV71Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV76Recetadetinte02_wpds_7_tfreclin ,
                                          short AV77Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV88Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV89Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV53RecLinMaq )
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
      if ( ! (0==AV70Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) )
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

   protected Object[] conditional_P09AA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV71Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV76Recetadetinte02_wpds_7_tfreclin ,
                                          short AV77Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV88Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV89Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV53RecLinMaq )
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
      if ( ! (0==AV70Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) )
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

   protected Object[] conditional_P09AA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV71Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV76Recetadetinte02_wpds_7_tfreclin ,
                                          short AV77Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV88Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV89Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV53RecLinMaq )
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
      if ( ! (0==AV70Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) )
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

   protected Object[] conditional_P09AA6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV71Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV76Recetadetinte02_wpds_7_tfreclin ,
                                          short AV77Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV88Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV89Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV53RecLinMaq ,
                                          String AV49Emprcod ,
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
      if ( ! (0==AV70Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) )
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

   protected Object[] conditional_P09AA7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV71Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV75Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV76Recetadetinte02_wpds_7_tfreclin ,
                                          short AV77Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV79Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV81Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV87Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV88Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV89Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV92Recetadetinte02_wpds_23_tfreclote ,
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
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV53RecLinMaq )
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
      if ( ! (0==AV70Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte02_wpds_24_tfreclote_sel)==0) )
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
                  return conditional_P09AA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 1 :
                  return conditional_P09AA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 2 :
                  return conditional_P09AA4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 3 :
                  return conditional_P09AA5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 4 :
                  return conditional_P09AA6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 5 :
                  return conditional_P09AA7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AA6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AA7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

