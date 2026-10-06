package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmrepuewwgetfilterdata extends GXProcedure
{
   public tmrepuewwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrepuewwgetfilterdata.class ), "" );
   }

   public tmrepuewwgetfilterdata( int remoteHandle ,
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
      tmrepuewwgetfilterdata.this.aP5 = new String[] {""};
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
      tmrepuewwgetfilterdata.this.AV36DDOName = aP0;
      tmrepuewwgetfilterdata.this.AV34SearchTxt = aP1;
      tmrepuewwgetfilterdata.this.AV35SearchTxtTo = aP2;
      tmrepuewwgetfilterdata.this.aP3 = aP3;
      tmrepuewwgetfilterdata.this.aP4 = aP4;
      tmrepuewwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMRNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MRCODEXT") == 0 )
      {
         /* Execute user subroutine: 'LOADMRCODEXTOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MRCODPRV") == 0 )
      {
         /* Execute user subroutine: 'LOADMRCODPRVOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV47Session.getValue("TMRepueWWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMRepueWWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("TMRepueWWGridState"), null, null);
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV12TFMRNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV13TFMRNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV10TFMRCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFMRCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT") == 0 )
         {
            AV14TFMRCodExt = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT_SEL") == 0 )
         {
            AV15TFMRCodExt_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKPRE") == 0 )
         {
            AV26TFMRStkPre = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFMRStkPre_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKACT") == 0 )
         {
            AV18TFMRStkAct = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFMRStkAct_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKRES") == 0 )
         {
            AV20TFMRStkRes = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFMRStkRes_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKMIN") == 0 )
         {
            AV22TFMRStkMin = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFMRStkMin_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKCRI") == 0 )
         {
            AV24TFMRStkCri = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFMRStkCri_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV") == 0 )
         {
            AV16TFMRCodPrv = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV_SEL") == 0 )
         {
            AV17TFMRCodPrv_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRACTIVO_SEL") == 0 )
         {
            AV33TFMRActivo_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMRNom = AV34SearchTxt ;
      AV13TFMRNom_Sel = "" ;
      AV65Tmrepuewwds_1_filterfulltext = AV52FilterFullText ;
      AV66Tmrepuewwds_2_tfmrnom = AV12TFMRNom ;
      AV67Tmrepuewwds_3_tfmrnom_sel = AV13TFMRNom_Sel ;
      AV68Tmrepuewwds_4_tfmrcod = AV10TFMRCod ;
      AV69Tmrepuewwds_5_tfmrcod_to = AV11TFMRCod_To ;
      AV70Tmrepuewwds_6_tfmrcodext = AV14TFMRCodExt ;
      AV71Tmrepuewwds_7_tfmrcodext_sel = AV15TFMRCodExt_Sel ;
      AV72Tmrepuewwds_8_tfmrstkpre = AV26TFMRStkPre ;
      AV73Tmrepuewwds_9_tfmrstkpre_to = AV27TFMRStkPre_To ;
      AV74Tmrepuewwds_10_tfmrstkact = AV18TFMRStkAct ;
      AV75Tmrepuewwds_11_tfmrstkact_to = AV19TFMRStkAct_To ;
      AV76Tmrepuewwds_12_tfmrstkres = AV20TFMRStkRes ;
      AV77Tmrepuewwds_13_tfmrstkres_to = AV21TFMRStkRes_To ;
      AV78Tmrepuewwds_14_tfmrstkmin = AV22TFMRStkMin ;
      AV79Tmrepuewwds_15_tfmrstkmin_to = AV23TFMRStkMin_To ;
      AV80Tmrepuewwds_16_tfmrstkcri = AV24TFMRStkCri ;
      AV81Tmrepuewwds_17_tfmrstkcri_to = AV25TFMRStkCri_To ;
      AV82Tmrepuewwds_18_tfmrcodprv = AV16TFMRCodPrv ;
      AV83Tmrepuewwds_19_tfmrcodprv_sel = AV17TFMRCodPrv_Sel ;
      AV84Tmrepuewwds_20_tfmractivo_sel = AV33TFMRActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Tmrepuewwds_1_filterfulltext ,
                                           AV67Tmrepuewwds_3_tfmrnom_sel ,
                                           AV66Tmrepuewwds_2_tfmrnom ,
                                           Integer.valueOf(AV68Tmrepuewwds_4_tfmrcod) ,
                                           Integer.valueOf(AV69Tmrepuewwds_5_tfmrcod_to) ,
                                           AV71Tmrepuewwds_7_tfmrcodext_sel ,
                                           AV70Tmrepuewwds_6_tfmrcodext ,
                                           AV72Tmrepuewwds_8_tfmrstkpre ,
                                           AV73Tmrepuewwds_9_tfmrstkpre_to ,
                                           AV74Tmrepuewwds_10_tfmrstkact ,
                                           AV75Tmrepuewwds_11_tfmrstkact_to ,
                                           AV76Tmrepuewwds_12_tfmrstkres ,
                                           AV77Tmrepuewwds_13_tfmrstkres_to ,
                                           AV78Tmrepuewwds_14_tfmrstkmin ,
                                           AV79Tmrepuewwds_15_tfmrstkmin_to ,
                                           AV80Tmrepuewwds_16_tfmrstkcri ,
                                           AV81Tmrepuewwds_17_tfmrstkcri_to ,
                                           AV83Tmrepuewwds_19_tfmrcodprv_sel ,
                                           AV82Tmrepuewwds_18_tfmrcodprv ,
                                           AV84Tmrepuewwds_20_tfmractivo_sel ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A9494MRCodExt ,
                                           A9499MRStkPre ,
                                           A9495MRStkAct ,
                                           A9496MRStkRes ,
                                           A9497MRStkMin ,
                                           A9498MRStkCri ,
                                           A11458MRCodPrv ,
                                           A12850MRActivo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV66Tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV66Tmrepuewwds_2_tfmrnom), 100, "%") ;
      lV70Tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV70Tmrepuewwds_6_tfmrcodext), 20, "%") ;
      lV82Tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV82Tmrepuewwds_18_tfmrcodprv), 20, "%") ;
      /* Using cursor P08BR2 */
      pr_default.execute(0, new Object[] {lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV66Tmrepuewwds_2_tfmrnom, AV67Tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV68Tmrepuewwds_4_tfmrcod), Integer.valueOf(AV69Tmrepuewwds_5_tfmrcod_to), lV70Tmrepuewwds_6_tfmrcodext, AV71Tmrepuewwds_7_tfmrcodext_sel, AV72Tmrepuewwds_8_tfmrstkpre, AV73Tmrepuewwds_9_tfmrstkpre_to, AV74Tmrepuewwds_10_tfmrstkact, AV75Tmrepuewwds_11_tfmrstkact_to, AV76Tmrepuewwds_12_tfmrstkres, AV77Tmrepuewwds_13_tfmrstkres_to, AV78Tmrepuewwds_14_tfmrstkmin, AV79Tmrepuewwds_15_tfmrstkmin_to, AV80Tmrepuewwds_16_tfmrstkcri, AV81Tmrepuewwds_17_tfmrstkcri_to, lV82Tmrepuewwds_18_tfmrcodprv, AV83Tmrepuewwds_19_tfmrcodprv_sel, AV84Tmrepuewwds_20_tfmractivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8BR2 = false ;
         A9493MRNom = P08BR2_A9493MRNom[0] ;
         n9493MRNom = P08BR2_n9493MRNom[0] ;
         A12850MRActivo = P08BR2_A12850MRActivo[0] ;
         n12850MRActivo = P08BR2_n12850MRActivo[0] ;
         A11458MRCodPrv = P08BR2_A11458MRCodPrv[0] ;
         n11458MRCodPrv = P08BR2_n11458MRCodPrv[0] ;
         A9498MRStkCri = P08BR2_A9498MRStkCri[0] ;
         n9498MRStkCri = P08BR2_n9498MRStkCri[0] ;
         A9497MRStkMin = P08BR2_A9497MRStkMin[0] ;
         n9497MRStkMin = P08BR2_n9497MRStkMin[0] ;
         A9496MRStkRes = P08BR2_A9496MRStkRes[0] ;
         n9496MRStkRes = P08BR2_n9496MRStkRes[0] ;
         A9495MRStkAct = P08BR2_A9495MRStkAct[0] ;
         n9495MRStkAct = P08BR2_n9495MRStkAct[0] ;
         A9499MRStkPre = P08BR2_A9499MRStkPre[0] ;
         n9499MRStkPre = P08BR2_n9499MRStkPre[0] ;
         A9494MRCodExt = P08BR2_A9494MRCodExt[0] ;
         n9494MRCodExt = P08BR2_n9494MRCodExt[0] ;
         A9492MRCod = P08BR2_A9492MRCod[0] ;
         A396EmprCod = P08BR2_A396EmprCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08BR2_A9493MRNom[0], A9493MRNom) == 0 ) )
         {
            brk8BR2 = false ;
            A9492MRCod = P08BR2_A9492MRCod[0] ;
            A396EmprCod = P08BR2_A396EmprCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8BR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9493MRNom)==0) )
         {
            AV38Option = A9493MRNom ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BR2 )
         {
            brk8BR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMRCODEXTOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMRCodExt = AV34SearchTxt ;
      AV15TFMRCodExt_Sel = "" ;
      AV65Tmrepuewwds_1_filterfulltext = AV52FilterFullText ;
      AV66Tmrepuewwds_2_tfmrnom = AV12TFMRNom ;
      AV67Tmrepuewwds_3_tfmrnom_sel = AV13TFMRNom_Sel ;
      AV68Tmrepuewwds_4_tfmrcod = AV10TFMRCod ;
      AV69Tmrepuewwds_5_tfmrcod_to = AV11TFMRCod_To ;
      AV70Tmrepuewwds_6_tfmrcodext = AV14TFMRCodExt ;
      AV71Tmrepuewwds_7_tfmrcodext_sel = AV15TFMRCodExt_Sel ;
      AV72Tmrepuewwds_8_tfmrstkpre = AV26TFMRStkPre ;
      AV73Tmrepuewwds_9_tfmrstkpre_to = AV27TFMRStkPre_To ;
      AV74Tmrepuewwds_10_tfmrstkact = AV18TFMRStkAct ;
      AV75Tmrepuewwds_11_tfmrstkact_to = AV19TFMRStkAct_To ;
      AV76Tmrepuewwds_12_tfmrstkres = AV20TFMRStkRes ;
      AV77Tmrepuewwds_13_tfmrstkres_to = AV21TFMRStkRes_To ;
      AV78Tmrepuewwds_14_tfmrstkmin = AV22TFMRStkMin ;
      AV79Tmrepuewwds_15_tfmrstkmin_to = AV23TFMRStkMin_To ;
      AV80Tmrepuewwds_16_tfmrstkcri = AV24TFMRStkCri ;
      AV81Tmrepuewwds_17_tfmrstkcri_to = AV25TFMRStkCri_To ;
      AV82Tmrepuewwds_18_tfmrcodprv = AV16TFMRCodPrv ;
      AV83Tmrepuewwds_19_tfmrcodprv_sel = AV17TFMRCodPrv_Sel ;
      AV84Tmrepuewwds_20_tfmractivo_sel = AV33TFMRActivo_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV65Tmrepuewwds_1_filterfulltext ,
                                           AV67Tmrepuewwds_3_tfmrnom_sel ,
                                           AV66Tmrepuewwds_2_tfmrnom ,
                                           Integer.valueOf(AV68Tmrepuewwds_4_tfmrcod) ,
                                           Integer.valueOf(AV69Tmrepuewwds_5_tfmrcod_to) ,
                                           AV71Tmrepuewwds_7_tfmrcodext_sel ,
                                           AV70Tmrepuewwds_6_tfmrcodext ,
                                           AV72Tmrepuewwds_8_tfmrstkpre ,
                                           AV73Tmrepuewwds_9_tfmrstkpre_to ,
                                           AV74Tmrepuewwds_10_tfmrstkact ,
                                           AV75Tmrepuewwds_11_tfmrstkact_to ,
                                           AV76Tmrepuewwds_12_tfmrstkres ,
                                           AV77Tmrepuewwds_13_tfmrstkres_to ,
                                           AV78Tmrepuewwds_14_tfmrstkmin ,
                                           AV79Tmrepuewwds_15_tfmrstkmin_to ,
                                           AV80Tmrepuewwds_16_tfmrstkcri ,
                                           AV81Tmrepuewwds_17_tfmrstkcri_to ,
                                           AV83Tmrepuewwds_19_tfmrcodprv_sel ,
                                           AV82Tmrepuewwds_18_tfmrcodprv ,
                                           AV84Tmrepuewwds_20_tfmractivo_sel ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A9494MRCodExt ,
                                           A9499MRStkPre ,
                                           A9495MRStkAct ,
                                           A9496MRStkRes ,
                                           A9497MRStkMin ,
                                           A9498MRStkCri ,
                                           A11458MRCodPrv ,
                                           A12850MRActivo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV66Tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV66Tmrepuewwds_2_tfmrnom), 100, "%") ;
      lV70Tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV70Tmrepuewwds_6_tfmrcodext), 20, "%") ;
      lV82Tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV82Tmrepuewwds_18_tfmrcodprv), 20, "%") ;
      /* Using cursor P08BR3 */
      pr_default.execute(1, new Object[] {lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV66Tmrepuewwds_2_tfmrnom, AV67Tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV68Tmrepuewwds_4_tfmrcod), Integer.valueOf(AV69Tmrepuewwds_5_tfmrcod_to), lV70Tmrepuewwds_6_tfmrcodext, AV71Tmrepuewwds_7_tfmrcodext_sel, AV72Tmrepuewwds_8_tfmrstkpre, AV73Tmrepuewwds_9_tfmrstkpre_to, AV74Tmrepuewwds_10_tfmrstkact, AV75Tmrepuewwds_11_tfmrstkact_to, AV76Tmrepuewwds_12_tfmrstkres, AV77Tmrepuewwds_13_tfmrstkres_to, AV78Tmrepuewwds_14_tfmrstkmin, AV79Tmrepuewwds_15_tfmrstkmin_to, AV80Tmrepuewwds_16_tfmrstkcri, AV81Tmrepuewwds_17_tfmrstkcri_to, lV82Tmrepuewwds_18_tfmrcodprv, AV83Tmrepuewwds_19_tfmrcodprv_sel, AV84Tmrepuewwds_20_tfmractivo_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8BR4 = false ;
         A9494MRCodExt = P08BR3_A9494MRCodExt[0] ;
         n9494MRCodExt = P08BR3_n9494MRCodExt[0] ;
         A12850MRActivo = P08BR3_A12850MRActivo[0] ;
         n12850MRActivo = P08BR3_n12850MRActivo[0] ;
         A11458MRCodPrv = P08BR3_A11458MRCodPrv[0] ;
         n11458MRCodPrv = P08BR3_n11458MRCodPrv[0] ;
         A9498MRStkCri = P08BR3_A9498MRStkCri[0] ;
         n9498MRStkCri = P08BR3_n9498MRStkCri[0] ;
         A9497MRStkMin = P08BR3_A9497MRStkMin[0] ;
         n9497MRStkMin = P08BR3_n9497MRStkMin[0] ;
         A9496MRStkRes = P08BR3_A9496MRStkRes[0] ;
         n9496MRStkRes = P08BR3_n9496MRStkRes[0] ;
         A9495MRStkAct = P08BR3_A9495MRStkAct[0] ;
         n9495MRStkAct = P08BR3_n9495MRStkAct[0] ;
         A9499MRStkPre = P08BR3_A9499MRStkPre[0] ;
         n9499MRStkPre = P08BR3_n9499MRStkPre[0] ;
         A9492MRCod = P08BR3_A9492MRCod[0] ;
         A9493MRNom = P08BR3_A9493MRNom[0] ;
         n9493MRNom = P08BR3_n9493MRNom[0] ;
         A396EmprCod = P08BR3_A396EmprCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08BR3_A9494MRCodExt[0], A9494MRCodExt) == 0 ) )
         {
            brk8BR4 = false ;
            A9492MRCod = P08BR3_A9492MRCod[0] ;
            A396EmprCod = P08BR3_A396EmprCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8BR4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A9494MRCodExt)==0) )
         {
            AV38Option = A9494MRCodExt ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BR4 )
         {
            brk8BR4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMRCODPRVOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMRCodPrv = AV34SearchTxt ;
      AV17TFMRCodPrv_Sel = "" ;
      AV65Tmrepuewwds_1_filterfulltext = AV52FilterFullText ;
      AV66Tmrepuewwds_2_tfmrnom = AV12TFMRNom ;
      AV67Tmrepuewwds_3_tfmrnom_sel = AV13TFMRNom_Sel ;
      AV68Tmrepuewwds_4_tfmrcod = AV10TFMRCod ;
      AV69Tmrepuewwds_5_tfmrcod_to = AV11TFMRCod_To ;
      AV70Tmrepuewwds_6_tfmrcodext = AV14TFMRCodExt ;
      AV71Tmrepuewwds_7_tfmrcodext_sel = AV15TFMRCodExt_Sel ;
      AV72Tmrepuewwds_8_tfmrstkpre = AV26TFMRStkPre ;
      AV73Tmrepuewwds_9_tfmrstkpre_to = AV27TFMRStkPre_To ;
      AV74Tmrepuewwds_10_tfmrstkact = AV18TFMRStkAct ;
      AV75Tmrepuewwds_11_tfmrstkact_to = AV19TFMRStkAct_To ;
      AV76Tmrepuewwds_12_tfmrstkres = AV20TFMRStkRes ;
      AV77Tmrepuewwds_13_tfmrstkres_to = AV21TFMRStkRes_To ;
      AV78Tmrepuewwds_14_tfmrstkmin = AV22TFMRStkMin ;
      AV79Tmrepuewwds_15_tfmrstkmin_to = AV23TFMRStkMin_To ;
      AV80Tmrepuewwds_16_tfmrstkcri = AV24TFMRStkCri ;
      AV81Tmrepuewwds_17_tfmrstkcri_to = AV25TFMRStkCri_To ;
      AV82Tmrepuewwds_18_tfmrcodprv = AV16TFMRCodPrv ;
      AV83Tmrepuewwds_19_tfmrcodprv_sel = AV17TFMRCodPrv_Sel ;
      AV84Tmrepuewwds_20_tfmractivo_sel = AV33TFMRActivo_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV65Tmrepuewwds_1_filterfulltext ,
                                           AV67Tmrepuewwds_3_tfmrnom_sel ,
                                           AV66Tmrepuewwds_2_tfmrnom ,
                                           Integer.valueOf(AV68Tmrepuewwds_4_tfmrcod) ,
                                           Integer.valueOf(AV69Tmrepuewwds_5_tfmrcod_to) ,
                                           AV71Tmrepuewwds_7_tfmrcodext_sel ,
                                           AV70Tmrepuewwds_6_tfmrcodext ,
                                           AV72Tmrepuewwds_8_tfmrstkpre ,
                                           AV73Tmrepuewwds_9_tfmrstkpre_to ,
                                           AV74Tmrepuewwds_10_tfmrstkact ,
                                           AV75Tmrepuewwds_11_tfmrstkact_to ,
                                           AV76Tmrepuewwds_12_tfmrstkres ,
                                           AV77Tmrepuewwds_13_tfmrstkres_to ,
                                           AV78Tmrepuewwds_14_tfmrstkmin ,
                                           AV79Tmrepuewwds_15_tfmrstkmin_to ,
                                           AV80Tmrepuewwds_16_tfmrstkcri ,
                                           AV81Tmrepuewwds_17_tfmrstkcri_to ,
                                           AV83Tmrepuewwds_19_tfmrcodprv_sel ,
                                           AV82Tmrepuewwds_18_tfmrcodprv ,
                                           AV84Tmrepuewwds_20_tfmractivo_sel ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A9494MRCodExt ,
                                           A9499MRStkPre ,
                                           A9495MRStkAct ,
                                           A9496MRStkRes ,
                                           A9497MRStkMin ,
                                           A9498MRStkCri ,
                                           A11458MRCodPrv ,
                                           A12850MRActivo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV65Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV66Tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV66Tmrepuewwds_2_tfmrnom), 100, "%") ;
      lV70Tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV70Tmrepuewwds_6_tfmrcodext), 20, "%") ;
      lV82Tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV82Tmrepuewwds_18_tfmrcodprv), 20, "%") ;
      /* Using cursor P08BR4 */
      pr_default.execute(2, new Object[] {lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV65Tmrepuewwds_1_filterfulltext, lV66Tmrepuewwds_2_tfmrnom, AV67Tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV68Tmrepuewwds_4_tfmrcod), Integer.valueOf(AV69Tmrepuewwds_5_tfmrcod_to), lV70Tmrepuewwds_6_tfmrcodext, AV71Tmrepuewwds_7_tfmrcodext_sel, AV72Tmrepuewwds_8_tfmrstkpre, AV73Tmrepuewwds_9_tfmrstkpre_to, AV74Tmrepuewwds_10_tfmrstkact, AV75Tmrepuewwds_11_tfmrstkact_to, AV76Tmrepuewwds_12_tfmrstkres, AV77Tmrepuewwds_13_tfmrstkres_to, AV78Tmrepuewwds_14_tfmrstkmin, AV79Tmrepuewwds_15_tfmrstkmin_to, AV80Tmrepuewwds_16_tfmrstkcri, AV81Tmrepuewwds_17_tfmrstkcri_to, lV82Tmrepuewwds_18_tfmrcodprv, AV83Tmrepuewwds_19_tfmrcodprv_sel, AV84Tmrepuewwds_20_tfmractivo_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8BR6 = false ;
         A11458MRCodPrv = P08BR4_A11458MRCodPrv[0] ;
         n11458MRCodPrv = P08BR4_n11458MRCodPrv[0] ;
         A12850MRActivo = P08BR4_A12850MRActivo[0] ;
         n12850MRActivo = P08BR4_n12850MRActivo[0] ;
         A9498MRStkCri = P08BR4_A9498MRStkCri[0] ;
         n9498MRStkCri = P08BR4_n9498MRStkCri[0] ;
         A9497MRStkMin = P08BR4_A9497MRStkMin[0] ;
         n9497MRStkMin = P08BR4_n9497MRStkMin[0] ;
         A9496MRStkRes = P08BR4_A9496MRStkRes[0] ;
         n9496MRStkRes = P08BR4_n9496MRStkRes[0] ;
         A9495MRStkAct = P08BR4_A9495MRStkAct[0] ;
         n9495MRStkAct = P08BR4_n9495MRStkAct[0] ;
         A9499MRStkPre = P08BR4_A9499MRStkPre[0] ;
         n9499MRStkPre = P08BR4_n9499MRStkPre[0] ;
         A9494MRCodExt = P08BR4_A9494MRCodExt[0] ;
         n9494MRCodExt = P08BR4_n9494MRCodExt[0] ;
         A9492MRCod = P08BR4_A9492MRCod[0] ;
         A9493MRNom = P08BR4_A9493MRNom[0] ;
         n9493MRNom = P08BR4_n9493MRNom[0] ;
         A396EmprCod = P08BR4_A396EmprCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08BR4_A11458MRCodPrv[0], A11458MRCodPrv) == 0 ) )
         {
            brk8BR6 = false ;
            A9492MRCod = P08BR4_A9492MRCod[0] ;
            A396EmprCod = P08BR4_A396EmprCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8BR6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11458MRCodPrv)==0) )
         {
            AV38Option = A11458MRCodPrv ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BR6 )
         {
            brk8BR6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmrepuewwgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = tmrepuewwgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = tmrepuewwgetfilterdata.this.AV45OptionIndexesJson;
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
      AV52FilterFullText = "" ;
      AV12TFMRNom = "" ;
      AV13TFMRNom_Sel = "" ;
      AV14TFMRCodExt = "" ;
      AV15TFMRCodExt_Sel = "" ;
      AV26TFMRStkPre = DecimalUtil.ZERO ;
      AV27TFMRStkPre_To = DecimalUtil.ZERO ;
      AV18TFMRStkAct = DecimalUtil.ZERO ;
      AV19TFMRStkAct_To = DecimalUtil.ZERO ;
      AV20TFMRStkRes = DecimalUtil.ZERO ;
      AV21TFMRStkRes_To = DecimalUtil.ZERO ;
      AV22TFMRStkMin = DecimalUtil.ZERO ;
      AV23TFMRStkMin_To = DecimalUtil.ZERO ;
      AV24TFMRStkCri = DecimalUtil.ZERO ;
      AV25TFMRStkCri_To = DecimalUtil.ZERO ;
      AV16TFMRCodPrv = "" ;
      AV17TFMRCodPrv_Sel = "" ;
      AV33TFMRActivo_Sel = "" ;
      A9493MRNom = "" ;
      AV65Tmrepuewwds_1_filterfulltext = "" ;
      AV66Tmrepuewwds_2_tfmrnom = "" ;
      AV67Tmrepuewwds_3_tfmrnom_sel = "" ;
      AV70Tmrepuewwds_6_tfmrcodext = "" ;
      AV71Tmrepuewwds_7_tfmrcodext_sel = "" ;
      AV72Tmrepuewwds_8_tfmrstkpre = DecimalUtil.ZERO ;
      AV73Tmrepuewwds_9_tfmrstkpre_to = DecimalUtil.ZERO ;
      AV74Tmrepuewwds_10_tfmrstkact = DecimalUtil.ZERO ;
      AV75Tmrepuewwds_11_tfmrstkact_to = DecimalUtil.ZERO ;
      AV76Tmrepuewwds_12_tfmrstkres = DecimalUtil.ZERO ;
      AV77Tmrepuewwds_13_tfmrstkres_to = DecimalUtil.ZERO ;
      AV78Tmrepuewwds_14_tfmrstkmin = DecimalUtil.ZERO ;
      AV79Tmrepuewwds_15_tfmrstkmin_to = DecimalUtil.ZERO ;
      AV80Tmrepuewwds_16_tfmrstkcri = DecimalUtil.ZERO ;
      AV81Tmrepuewwds_17_tfmrstkcri_to = DecimalUtil.ZERO ;
      AV82Tmrepuewwds_18_tfmrcodprv = "" ;
      AV83Tmrepuewwds_19_tfmrcodprv_sel = "" ;
      AV84Tmrepuewwds_20_tfmractivo_sel = "" ;
      scmdbuf = "" ;
      lV65Tmrepuewwds_1_filterfulltext = "" ;
      lV66Tmrepuewwds_2_tfmrnom = "" ;
      lV70Tmrepuewwds_6_tfmrcodext = "" ;
      lV82Tmrepuewwds_18_tfmrcodprv = "" ;
      A9494MRCodExt = "" ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A11458MRCodPrv = "" ;
      A12850MRActivo = "" ;
      P08BR2_A9493MRNom = new String[] {""} ;
      P08BR2_n9493MRNom = new boolean[] {false} ;
      P08BR2_A12850MRActivo = new String[] {""} ;
      P08BR2_n12850MRActivo = new boolean[] {false} ;
      P08BR2_A11458MRCodPrv = new String[] {""} ;
      P08BR2_n11458MRCodPrv = new boolean[] {false} ;
      P08BR2_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR2_n9498MRStkCri = new boolean[] {false} ;
      P08BR2_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR2_n9497MRStkMin = new boolean[] {false} ;
      P08BR2_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR2_n9496MRStkRes = new boolean[] {false} ;
      P08BR2_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR2_n9495MRStkAct = new boolean[] {false} ;
      P08BR2_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR2_n9499MRStkPre = new boolean[] {false} ;
      P08BR2_A9494MRCodExt = new String[] {""} ;
      P08BR2_n9494MRCodExt = new boolean[] {false} ;
      P08BR2_A9492MRCod = new int[1] ;
      P08BR2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV38Option = "" ;
      P08BR3_A9494MRCodExt = new String[] {""} ;
      P08BR3_n9494MRCodExt = new boolean[] {false} ;
      P08BR3_A12850MRActivo = new String[] {""} ;
      P08BR3_n12850MRActivo = new boolean[] {false} ;
      P08BR3_A11458MRCodPrv = new String[] {""} ;
      P08BR3_n11458MRCodPrv = new boolean[] {false} ;
      P08BR3_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR3_n9498MRStkCri = new boolean[] {false} ;
      P08BR3_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR3_n9497MRStkMin = new boolean[] {false} ;
      P08BR3_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR3_n9496MRStkRes = new boolean[] {false} ;
      P08BR3_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR3_n9495MRStkAct = new boolean[] {false} ;
      P08BR3_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR3_n9499MRStkPre = new boolean[] {false} ;
      P08BR3_A9492MRCod = new int[1] ;
      P08BR3_A9493MRNom = new String[] {""} ;
      P08BR3_n9493MRNom = new boolean[] {false} ;
      P08BR3_A396EmprCod = new String[] {""} ;
      P08BR4_A11458MRCodPrv = new String[] {""} ;
      P08BR4_n11458MRCodPrv = new boolean[] {false} ;
      P08BR4_A12850MRActivo = new String[] {""} ;
      P08BR4_n12850MRActivo = new boolean[] {false} ;
      P08BR4_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR4_n9498MRStkCri = new boolean[] {false} ;
      P08BR4_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR4_n9497MRStkMin = new boolean[] {false} ;
      P08BR4_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR4_n9496MRStkRes = new boolean[] {false} ;
      P08BR4_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR4_n9495MRStkAct = new boolean[] {false} ;
      P08BR4_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BR4_n9499MRStkPre = new boolean[] {false} ;
      P08BR4_A9494MRCodExt = new String[] {""} ;
      P08BR4_n9494MRCodExt = new boolean[] {false} ;
      P08BR4_A9492MRCod = new int[1] ;
      P08BR4_A9493MRNom = new String[] {""} ;
      P08BR4_n9493MRNom = new boolean[] {false} ;
      P08BR4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmrepuewwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08BR2_A9493MRNom, P08BR2_n9493MRNom, P08BR2_A12850MRActivo, P08BR2_n12850MRActivo, P08BR2_A11458MRCodPrv, P08BR2_n11458MRCodPrv, P08BR2_A9498MRStkCri, P08BR2_n9498MRStkCri, P08BR2_A9497MRStkMin, P08BR2_n9497MRStkMin,
            P08BR2_A9496MRStkRes, P08BR2_n9496MRStkRes, P08BR2_A9495MRStkAct, P08BR2_n9495MRStkAct, P08BR2_A9499MRStkPre, P08BR2_n9499MRStkPre, P08BR2_A9494MRCodExt, P08BR2_n9494MRCodExt, P08BR2_A9492MRCod, P08BR2_A396EmprCod
            }
            , new Object[] {
            P08BR3_A9494MRCodExt, P08BR3_n9494MRCodExt, P08BR3_A12850MRActivo, P08BR3_n12850MRActivo, P08BR3_A11458MRCodPrv, P08BR3_n11458MRCodPrv, P08BR3_A9498MRStkCri, P08BR3_n9498MRStkCri, P08BR3_A9497MRStkMin, P08BR3_n9497MRStkMin,
            P08BR3_A9496MRStkRes, P08BR3_n9496MRStkRes, P08BR3_A9495MRStkAct, P08BR3_n9495MRStkAct, P08BR3_A9499MRStkPre, P08BR3_n9499MRStkPre, P08BR3_A9492MRCod, P08BR3_A9493MRNom, P08BR3_n9493MRNom, P08BR3_A396EmprCod
            }
            , new Object[] {
            P08BR4_A11458MRCodPrv, P08BR4_n11458MRCodPrv, P08BR4_A12850MRActivo, P08BR4_n12850MRActivo, P08BR4_A9498MRStkCri, P08BR4_n9498MRStkCri, P08BR4_A9497MRStkMin, P08BR4_n9497MRStkMin, P08BR4_A9496MRStkRes, P08BR4_n9496MRStkRes,
            P08BR4_A9495MRStkAct, P08BR4_n9495MRStkAct, P08BR4_A9499MRStkPre, P08BR4_n9499MRStkPre, P08BR4_A9494MRCodExt, P08BR4_n9494MRCodExt, P08BR4_A9492MRCod, P08BR4_A9493MRNom, P08BR4_n9493MRNom, P08BR4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV63GXV1 ;
   private int AV10TFMRCod ;
   private int AV11TFMRCod_To ;
   private int AV68Tmrepuewwds_4_tfmrcod ;
   private int AV69Tmrepuewwds_5_tfmrcod_to ;
   private int A9492MRCod ;
   private long AV46count ;
   private java.math.BigDecimal AV26TFMRStkPre ;
   private java.math.BigDecimal AV27TFMRStkPre_To ;
   private java.math.BigDecimal AV18TFMRStkAct ;
   private java.math.BigDecimal AV19TFMRStkAct_To ;
   private java.math.BigDecimal AV20TFMRStkRes ;
   private java.math.BigDecimal AV21TFMRStkRes_To ;
   private java.math.BigDecimal AV22TFMRStkMin ;
   private java.math.BigDecimal AV23TFMRStkMin_To ;
   private java.math.BigDecimal AV24TFMRStkCri ;
   private java.math.BigDecimal AV25TFMRStkCri_To ;
   private java.math.BigDecimal AV72Tmrepuewwds_8_tfmrstkpre ;
   private java.math.BigDecimal AV73Tmrepuewwds_9_tfmrstkpre_to ;
   private java.math.BigDecimal AV74Tmrepuewwds_10_tfmrstkact ;
   private java.math.BigDecimal AV75Tmrepuewwds_11_tfmrstkact_to ;
   private java.math.BigDecimal AV76Tmrepuewwds_12_tfmrstkres ;
   private java.math.BigDecimal AV77Tmrepuewwds_13_tfmrstkres_to ;
   private java.math.BigDecimal AV78Tmrepuewwds_14_tfmrstkmin ;
   private java.math.BigDecimal AV79Tmrepuewwds_15_tfmrstkmin_to ;
   private java.math.BigDecimal AV80Tmrepuewwds_16_tfmrstkcri ;
   private java.math.BigDecimal AV81Tmrepuewwds_17_tfmrstkcri_to ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private String AV12TFMRNom ;
   private String AV13TFMRNom_Sel ;
   private String AV14TFMRCodExt ;
   private String AV15TFMRCodExt_Sel ;
   private String AV16TFMRCodPrv ;
   private String AV17TFMRCodPrv_Sel ;
   private String AV33TFMRActivo_Sel ;
   private String A9493MRNom ;
   private String AV66Tmrepuewwds_2_tfmrnom ;
   private String AV67Tmrepuewwds_3_tfmrnom_sel ;
   private String AV70Tmrepuewwds_6_tfmrcodext ;
   private String AV71Tmrepuewwds_7_tfmrcodext_sel ;
   private String AV82Tmrepuewwds_18_tfmrcodprv ;
   private String AV83Tmrepuewwds_19_tfmrcodprv_sel ;
   private String AV84Tmrepuewwds_20_tfmractivo_sel ;
   private String scmdbuf ;
   private String lV66Tmrepuewwds_2_tfmrnom ;
   private String lV70Tmrepuewwds_6_tfmrcodext ;
   private String lV82Tmrepuewwds_18_tfmrcodprv ;
   private String A9494MRCodExt ;
   private String A11458MRCodPrv ;
   private String A12850MRActivo ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8BR2 ;
   private boolean n9493MRNom ;
   private boolean n12850MRActivo ;
   private boolean n11458MRCodPrv ;
   private boolean n9498MRStkCri ;
   private boolean n9497MRStkMin ;
   private boolean n9496MRStkRes ;
   private boolean n9495MRStkAct ;
   private boolean n9499MRStkPre ;
   private boolean n9494MRCodExt ;
   private boolean brk8BR4 ;
   private boolean brk8BR6 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV65Tmrepuewwds_1_filterfulltext ;
   private String lV65Tmrepuewwds_1_filterfulltext ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BR2_A9493MRNom ;
   private boolean[] P08BR2_n9493MRNom ;
   private String[] P08BR2_A12850MRActivo ;
   private boolean[] P08BR2_n12850MRActivo ;
   private String[] P08BR2_A11458MRCodPrv ;
   private boolean[] P08BR2_n11458MRCodPrv ;
   private java.math.BigDecimal[] P08BR2_A9498MRStkCri ;
   private boolean[] P08BR2_n9498MRStkCri ;
   private java.math.BigDecimal[] P08BR2_A9497MRStkMin ;
   private boolean[] P08BR2_n9497MRStkMin ;
   private java.math.BigDecimal[] P08BR2_A9496MRStkRes ;
   private boolean[] P08BR2_n9496MRStkRes ;
   private java.math.BigDecimal[] P08BR2_A9495MRStkAct ;
   private boolean[] P08BR2_n9495MRStkAct ;
   private java.math.BigDecimal[] P08BR2_A9499MRStkPre ;
   private boolean[] P08BR2_n9499MRStkPre ;
   private String[] P08BR2_A9494MRCodExt ;
   private boolean[] P08BR2_n9494MRCodExt ;
   private int[] P08BR2_A9492MRCod ;
   private String[] P08BR2_A396EmprCod ;
   private String[] P08BR3_A9494MRCodExt ;
   private boolean[] P08BR3_n9494MRCodExt ;
   private String[] P08BR3_A12850MRActivo ;
   private boolean[] P08BR3_n12850MRActivo ;
   private String[] P08BR3_A11458MRCodPrv ;
   private boolean[] P08BR3_n11458MRCodPrv ;
   private java.math.BigDecimal[] P08BR3_A9498MRStkCri ;
   private boolean[] P08BR3_n9498MRStkCri ;
   private java.math.BigDecimal[] P08BR3_A9497MRStkMin ;
   private boolean[] P08BR3_n9497MRStkMin ;
   private java.math.BigDecimal[] P08BR3_A9496MRStkRes ;
   private boolean[] P08BR3_n9496MRStkRes ;
   private java.math.BigDecimal[] P08BR3_A9495MRStkAct ;
   private boolean[] P08BR3_n9495MRStkAct ;
   private java.math.BigDecimal[] P08BR3_A9499MRStkPre ;
   private boolean[] P08BR3_n9499MRStkPre ;
   private int[] P08BR3_A9492MRCod ;
   private String[] P08BR3_A9493MRNom ;
   private boolean[] P08BR3_n9493MRNom ;
   private String[] P08BR3_A396EmprCod ;
   private String[] P08BR4_A11458MRCodPrv ;
   private boolean[] P08BR4_n11458MRCodPrv ;
   private String[] P08BR4_A12850MRActivo ;
   private boolean[] P08BR4_n12850MRActivo ;
   private java.math.BigDecimal[] P08BR4_A9498MRStkCri ;
   private boolean[] P08BR4_n9498MRStkCri ;
   private java.math.BigDecimal[] P08BR4_A9497MRStkMin ;
   private boolean[] P08BR4_n9497MRStkMin ;
   private java.math.BigDecimal[] P08BR4_A9496MRStkRes ;
   private boolean[] P08BR4_n9496MRStkRes ;
   private java.math.BigDecimal[] P08BR4_A9495MRStkAct ;
   private boolean[] P08BR4_n9495MRStkAct ;
   private java.math.BigDecimal[] P08BR4_A9499MRStkPre ;
   private boolean[] P08BR4_n9499MRStkPre ;
   private String[] P08BR4_A9494MRCodExt ;
   private boolean[] P08BR4_n9494MRCodExt ;
   private int[] P08BR4_A9492MRCod ;
   private String[] P08BR4_A9493MRNom ;
   private boolean[] P08BR4_n9493MRNom ;
   private String[] P08BR4_A396EmprCod ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class tmrepuewwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Tmrepuewwds_1_filterfulltext ,
                                          String AV67Tmrepuewwds_3_tfmrnom_sel ,
                                          String AV66Tmrepuewwds_2_tfmrnom ,
                                          int AV68Tmrepuewwds_4_tfmrcod ,
                                          int AV69Tmrepuewwds_5_tfmrcod_to ,
                                          String AV71Tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV70Tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV72Tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV73Tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV74Tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV75Tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV76Tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV77Tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV78Tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV79Tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV80Tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV81Tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV83Tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV82Tmrepuewwds_18_tfmrcodprv ,
                                          String AV84Tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[28];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MRNom, MRActivo, MRCodPrv, MRStkCri, MRStkMin, MRStkRes, MRStkAct, MRStkPre, MRCodExt, MRCod, EmprCod FROM TXPMREPUE" ;
      if ( ! (GXutil.strcmp("", AV65Tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(MRCodPrv) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV67Tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(MRNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(MRCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(MRCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV70Tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodExt = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(MRStkPre >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(MRStkPre <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(MRStkAct >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(MRStkAct <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(MRStkRes >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(MRStkRes <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(MRStkMin >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(MRStkMin <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(MRStkCri >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(MRStkCri <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodPrv = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(MRActivo = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08BR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Tmrepuewwds_1_filterfulltext ,
                                          String AV67Tmrepuewwds_3_tfmrnom_sel ,
                                          String AV66Tmrepuewwds_2_tfmrnom ,
                                          int AV68Tmrepuewwds_4_tfmrcod ,
                                          int AV69Tmrepuewwds_5_tfmrcod_to ,
                                          String AV71Tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV70Tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV72Tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV73Tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV74Tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV75Tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV76Tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV77Tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV78Tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV79Tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV80Tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV81Tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV83Tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV82Tmrepuewwds_18_tfmrcodprv ,
                                          String AV84Tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[28];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MRCodExt, MRActivo, MRCodPrv, MRStkCri, MRStkMin, MRStkRes, MRStkAct, MRStkPre, MRCod, MRNom, EmprCod FROM TXPMREPUE" ;
      if ( ! (GXutil.strcmp("", AV65Tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(MRCodPrv) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV67Tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(MRNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(MRCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(MRCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV70Tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodExt = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(MRStkPre >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(MRStkPre <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(MRStkAct >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(MRStkAct <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(MRStkRes >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(MRStkRes <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(MRStkMin >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(MRStkMin <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(MRStkCri >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(MRStkCri <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodPrv = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(MRActivo = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRCodExt" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08BR4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Tmrepuewwds_1_filterfulltext ,
                                          String AV67Tmrepuewwds_3_tfmrnom_sel ,
                                          String AV66Tmrepuewwds_2_tfmrnom ,
                                          int AV68Tmrepuewwds_4_tfmrcod ,
                                          int AV69Tmrepuewwds_5_tfmrcod_to ,
                                          String AV71Tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV70Tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV72Tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV73Tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV74Tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV75Tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV76Tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV77Tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV78Tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV79Tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV80Tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV81Tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV83Tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV82Tmrepuewwds_18_tfmrcodprv ,
                                          String AV84Tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[28];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MRCodPrv, MRActivo, MRStkCri, MRStkMin, MRStkRes, MRStkAct, MRStkPre, MRCodExt, MRCod, MRNom, EmprCod FROM TXPMREPUE" ;
      if ( ! (GXutil.strcmp("", AV65Tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(MRCodPrv) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV67Tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(MRNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(MRCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(MRCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV70Tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodExt = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(MRStkPre >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(MRStkPre <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(MRStkAct >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(MRStkAct <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(MRStkRes >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(MRStkRes <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(MRStkMin >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(MRStkMin <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(MRStkCri >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(MRStkCri <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodPrv = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(MRActivo = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRCodPrv" ;
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
                  return conditional_P08BR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P08BR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P08BR4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BR4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((String[]) buf[17])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((String[]) buf[17])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               return;
      }
   }

}

