package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranguiafase__wwgetfilterdata extends GXProcedure
{
   public albaranguiafase__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiafase__wwgetfilterdata.class ), "" );
   }

   public albaranguiafase__wwgetfilterdata( int remoteHandle ,
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
      albaranguiafase__wwgetfilterdata.this.aP5 = new String[] {""};
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
      albaranguiafase__wwgetfilterdata.this.AV36DDOName = aP0;
      albaranguiafase__wwgetfilterdata.this.AV37SearchTxt = aP1;
      albaranguiafase__wwgetfilterdata.this.AV38SearchTxtTo = aP2;
      albaranguiafase__wwgetfilterdata.this.aP3 = aP3;
      albaranguiafase__wwgetfilterdata.this.aP4 = aP4;
      albaranguiafase__wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("Albaranes.AlbaranGuiaFase__WWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Albaranes.AlbaranGuiaFase__WWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("Albaranes.AlbaranGuiaFase__WWGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASLIN") == 0 )
         {
            AV10TFGuiFasLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFGuiFasLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPKG") == 0 )
         {
            AV18TFGuiFasPKg = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFGuiFasPKg_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPMT") == 0 )
         {
            AV22TFGuiFasPMt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFGuiFasPMt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGM") == 0 )
         {
            AV16TFFasKgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFFasKgm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASMTR") == 0 )
         {
            AV20TFFasMtr = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFFasMtr_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV37SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV47Albaranes_albaranguiafase__wwds_1_filterfulltext = AV42FilterFullText ;
      AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV10TFGuiFasLin ;
      AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV11TFGuiFasLin_To ;
      AV50Albaranes_albaranguiafase__wwds_4_tffascod = AV12TFFasCod ;
      AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV52Albaranes_albaranguiafase__wwds_6_tffasdsc = AV14TFFasDsc ;
      AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV18TFGuiFasPKg ;
      AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV19TFGuiFasPKg_To ;
      AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV22TFGuiFasPMt ;
      AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV23TFGuiFasPMt_To ;
      AV58Albaranes_albaranguiafase__wwds_12_tffaskgm = AV16TFFasKgm ;
      AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV17TFFasKgm_To ;
      AV60Albaranes_albaranguiafase__wwds_14_tffasmtr = AV20TFFasMtr ;
      AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV21TFFasMtr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                           Short.valueOf(AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin) ,
                                           Short.valueOf(AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) ,
                                           AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                           AV50Albaranes_albaranguiafase__wwds_4_tffascod ,
                                           AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                           AV52Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                           AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                           AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                           AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                           AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                           AV58Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                           AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                           AV60Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                           AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1241GuiFasPKg ,
                                           A1242GuiFasPMt ,
                                           A1275FasKgm ,
                                           A1276FasMtr } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV50Albaranes_albaranguiafase__wwds_4_tffascod = GXutil.padr( GXutil.rtrim( AV50Albaranes_albaranguiafase__wwds_4_tffascod), 8, "%") ;
      lV52Albaranes_albaranguiafase__wwds_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV52Albaranes_albaranguiafase__wwds_6_tffasdsc), 28, "%") ;
      /* Using cursor P09UT2 */
      pr_default.execute(0, new Object[] {lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, Short.valueOf(AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin), Short.valueOf(AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to), lV50Albaranes_albaranguiafase__wwds_4_tffascod, AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel, lV52Albaranes_albaranguiafase__wwds_6_tffasdsc, AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel, AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg, AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to, AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt, AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to, AV58Albaranes_albaranguiafase__wwds_12_tffaskgm, AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to, AV60Albaranes_albaranguiafase__wwds_14_tffasmtr, AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9UT2 = false ;
         A396EmprCod = P09UT2_A396EmprCod[0] ;
         A30AlbProCod = P09UT2_A30AlbProCod[0] ;
         A1253EmprGuiRem = P09UT2_A1253EmprGuiRem[0] ;
         A457FasCod = P09UT2_A457FasCod[0] ;
         A1276FasMtr = P09UT2_A1276FasMtr[0] ;
         A1275FasKgm = P09UT2_A1275FasKgm[0] ;
         A1242GuiFasPMt = P09UT2_A1242GuiFasPMt[0] ;
         A1241GuiFasPKg = P09UT2_A1241GuiFasPKg[0] ;
         A460FasDsc = P09UT2_A460FasDsc[0] ;
         A1240GuiFasLin = P09UT2_A1240GuiFasLin[0] ;
         A129BarCod = P09UT2_A129BarCod[0] ;
         A132BarCodReo = P09UT2_A132BarCodReo[0] ;
         A130BarCodPar = P09UT2_A130BarCodPar[0] ;
         A1253EmprGuiRem = P09UT2_A1253EmprGuiRem[0] ;
         A460FasDsc = P09UT2_A460FasDsc[0] ;
         /* Using cursor P09UT3 */
         pr_default.execute(1, new Object[] {A1253EmprGuiRem, A457FasCod});
         A460FasDsc = P09UT3_A460FasDsc[0] ;
         pr_default.close(1);
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09UT2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk9UT2 = false ;
            A396EmprCod = P09UT2_A396EmprCod[0] ;
            A30AlbProCod = P09UT2_A30AlbProCod[0] ;
            A1240GuiFasLin = P09UT2_A1240GuiFasLin[0] ;
            A129BarCod = P09UT2_A129BarCod[0] ;
            A132BarCodReo = P09UT2_A132BarCodReo[0] ;
            A130BarCodPar = P09UT2_A130BarCodPar[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9UT2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV25Option = A457FasCod ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UT2 )
         {
            brk9UT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV37SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV47Albaranes_albaranguiafase__wwds_1_filterfulltext = AV42FilterFullText ;
      AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV10TFGuiFasLin ;
      AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV11TFGuiFasLin_To ;
      AV50Albaranes_albaranguiafase__wwds_4_tffascod = AV12TFFasCod ;
      AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV52Albaranes_albaranguiafase__wwds_6_tffasdsc = AV14TFFasDsc ;
      AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV18TFGuiFasPKg ;
      AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV19TFGuiFasPKg_To ;
      AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV22TFGuiFasPMt ;
      AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV23TFGuiFasPMt_To ;
      AV58Albaranes_albaranguiafase__wwds_12_tffaskgm = AV16TFFasKgm ;
      AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV17TFFasKgm_To ;
      AV60Albaranes_albaranguiafase__wwds_14_tffasmtr = AV20TFFasMtr ;
      AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV21TFFasMtr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV47Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                           Short.valueOf(AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin) ,
                                           Short.valueOf(AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) ,
                                           AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                           AV50Albaranes_albaranguiafase__wwds_4_tffascod ,
                                           AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                           AV52Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                           AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                           AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                           AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                           AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                           AV58Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                           AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                           AV60Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                           AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1241GuiFasPKg ,
                                           A1242GuiFasPMt ,
                                           A1275FasKgm ,
                                           A1276FasMtr } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV50Albaranes_albaranguiafase__wwds_4_tffascod = GXutil.padr( GXutil.rtrim( AV50Albaranes_albaranguiafase__wwds_4_tffascod), 8, "%") ;
      lV52Albaranes_albaranguiafase__wwds_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV52Albaranes_albaranguiafase__wwds_6_tffasdsc), 28, "%") ;
      /* Using cursor P09UT4 */
      pr_default.execute(2, new Object[] {lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, lV47Albaranes_albaranguiafase__wwds_1_filterfulltext, Short.valueOf(AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin), Short.valueOf(AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to), lV50Albaranes_albaranguiafase__wwds_4_tffascod, AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel, lV52Albaranes_albaranguiafase__wwds_6_tffasdsc, AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel, AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg, AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to, AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt, AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to, AV58Albaranes_albaranguiafase__wwds_12_tffaskgm, AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to, AV60Albaranes_albaranguiafase__wwds_14_tffasmtr, AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9UT4 = false ;
         A457FasCod = P09UT4_A457FasCod[0] ;
         A396EmprCod = P09UT4_A396EmprCod[0] ;
         A1276FasMtr = P09UT4_A1276FasMtr[0] ;
         A1275FasKgm = P09UT4_A1275FasKgm[0] ;
         A1242GuiFasPMt = P09UT4_A1242GuiFasPMt[0] ;
         A1241GuiFasPKg = P09UT4_A1241GuiFasPKg[0] ;
         A460FasDsc = P09UT4_A460FasDsc[0] ;
         A1240GuiFasLin = P09UT4_A1240GuiFasLin[0] ;
         A30AlbProCod = P09UT4_A30AlbProCod[0] ;
         A129BarCod = P09UT4_A129BarCod[0] ;
         A132BarCodReo = P09UT4_A132BarCodReo[0] ;
         A130BarCodPar = P09UT4_A130BarCodPar[0] ;
         A460FasDsc = P09UT4_A460FasDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09UT4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09UT4_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk9UT4 = false ;
            A1240GuiFasLin = P09UT4_A1240GuiFasLin[0] ;
            A30AlbProCod = P09UT4_A30AlbProCod[0] ;
            A129BarCod = P09UT4_A129BarCod[0] ;
            A132BarCodReo = P09UT4_A132BarCodReo[0] ;
            A130BarCodPar = P09UT4_A130BarCodPar[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9UT4 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV25Option = A460FasDsc ;
            AV24InsertIndex = 1 ;
            while ( ( AV24InsertIndex <= AV26Options.size() ) && ( GXutil.strcmp((String)AV26Options.elementAt(-1+AV24InsertIndex), AV25Option) < 0 ) )
            {
               AV24InsertIndex = (int)(AV24InsertIndex+1) ;
            }
            AV26Options.add(AV25Option, AV24InsertIndex);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV24InsertIndex);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UT4 )
         {
            brk9UT4 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = albaranguiafase__wwgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = albaranguiafase__wwgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = albaranguiafase__wwgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV18TFGuiFasPKg = DecimalUtil.ZERO ;
      AV19TFGuiFasPKg_To = DecimalUtil.ZERO ;
      AV22TFGuiFasPMt = DecimalUtil.ZERO ;
      AV23TFGuiFasPMt_To = DecimalUtil.ZERO ;
      AV16TFFasKgm = DecimalUtil.ZERO ;
      AV17TFFasKgm_To = DecimalUtil.ZERO ;
      AV20TFFasMtr = DecimalUtil.ZERO ;
      AV21TFFasMtr_To = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      AV47Albaranes_albaranguiafase__wwds_1_filterfulltext = "" ;
      AV50Albaranes_albaranguiafase__wwds_4_tffascod = "" ;
      AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel = "" ;
      AV52Albaranes_albaranguiafase__wwds_6_tffasdsc = "" ;
      AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = "" ;
      AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg = DecimalUtil.ZERO ;
      AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = DecimalUtil.ZERO ;
      AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt = DecimalUtil.ZERO ;
      AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = DecimalUtil.ZERO ;
      AV58Albaranes_albaranguiafase__wwds_12_tffaskgm = DecimalUtil.ZERO ;
      AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to = DecimalUtil.ZERO ;
      AV60Albaranes_albaranguiafase__wwds_14_tffasmtr = DecimalUtil.ZERO ;
      AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV47Albaranes_albaranguiafase__wwds_1_filterfulltext = "" ;
      lV50Albaranes_albaranguiafase__wwds_4_tffascod = "" ;
      lV52Albaranes_albaranguiafase__wwds_6_tffasdsc = "" ;
      A460FasDsc = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      P09UT2_A396EmprCod = new String[] {""} ;
      P09UT2_A30AlbProCod = new long[1] ;
      P09UT2_A1253EmprGuiRem = new String[] {""} ;
      P09UT2_A457FasCod = new String[] {""} ;
      P09UT2_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT2_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT2_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT2_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT2_A460FasDsc = new String[] {""} ;
      P09UT2_A1240GuiFasLin = new short[1] ;
      P09UT2_A129BarCod = new int[1] ;
      P09UT2_A132BarCodReo = new byte[1] ;
      P09UT2_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A1253EmprGuiRem = "" ;
      A130BarCodPar = "" ;
      P09UT3_A460FasDsc = new String[] {""} ;
      AV25Option = "" ;
      AV27OptionDesc = "" ;
      P09UT4_A457FasCod = new String[] {""} ;
      P09UT4_A396EmprCod = new String[] {""} ;
      P09UT4_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT4_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UT4_A460FasDsc = new String[] {""} ;
      P09UT4_A1240GuiFasLin = new short[1] ;
      P09UT4_A30AlbProCod = new long[1] ;
      P09UT4_A129BarCod = new int[1] ;
      P09UT4_A132BarCodReo = new byte[1] ;
      P09UT4_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09UT2_A396EmprCod, P09UT2_A30AlbProCod, P09UT2_A1253EmprGuiRem, P09UT2_A457FasCod, P09UT2_A1276FasMtr, P09UT2_A1275FasKgm, P09UT2_A1242GuiFasPMt, P09UT2_A1241GuiFasPKg, P09UT2_A460FasDsc, P09UT2_A1240GuiFasLin,
            P09UT2_A129BarCod, P09UT2_A132BarCodReo, P09UT2_A130BarCodPar
            }
            , new Object[] {
            P09UT3_A460FasDsc
            }
            , new Object[] {
            P09UT4_A457FasCod, P09UT4_A396EmprCod, P09UT4_A1276FasMtr, P09UT4_A1275FasKgm, P09UT4_A1242GuiFasPMt, P09UT4_A1241GuiFasPKg, P09UT4_A460FasDsc, P09UT4_A1240GuiFasLin, P09UT4_A30AlbProCod, P09UT4_A129BarCod,
            P09UT4_A132BarCodReo, P09UT4_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV10TFGuiFasLin ;
   private short AV11TFGuiFasLin_To ;
   private short AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin ;
   private short AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int A129BarCod ;
   private int AV24InsertIndex ;
   private long A30AlbProCod ;
   private long AV30count ;
   private java.math.BigDecimal AV18TFGuiFasPKg ;
   private java.math.BigDecimal AV19TFGuiFasPKg_To ;
   private java.math.BigDecimal AV22TFGuiFasPMt ;
   private java.math.BigDecimal AV23TFGuiFasPMt_To ;
   private java.math.BigDecimal AV16TFFasKgm ;
   private java.math.BigDecimal AV17TFFasKgm_To ;
   private java.math.BigDecimal AV20TFFasMtr ;
   private java.math.BigDecimal AV21TFFasMtr_To ;
   private java.math.BigDecimal AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg ;
   private java.math.BigDecimal AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ;
   private java.math.BigDecimal AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt ;
   private java.math.BigDecimal AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ;
   private java.math.BigDecimal AV58Albaranes_albaranguiafase__wwds_12_tffaskgm ;
   private java.math.BigDecimal AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to ;
   private java.math.BigDecimal AV60Albaranes_albaranguiafase__wwds_14_tffasmtr ;
   private java.math.BigDecimal AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String A457FasCod ;
   private String AV50Albaranes_albaranguiafase__wwds_4_tffascod ;
   private String AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel ;
   private String AV52Albaranes_albaranguiafase__wwds_6_tffasdsc ;
   private String AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV50Albaranes_albaranguiafase__wwds_4_tffascod ;
   private String lV52Albaranes_albaranguiafase__wwds_6_tffasdsc ;
   private String A460FasDsc ;
   private String A396EmprCod ;
   private String A1253EmprGuiRem ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9UT2 ;
   private boolean brk9UT4 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV47Albaranes_albaranguiafase__wwds_1_filterfulltext ;
   private String lV47Albaranes_albaranguiafase__wwds_1_filterfulltext ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09UT2_A396EmprCod ;
   private long[] P09UT2_A30AlbProCod ;
   private String[] P09UT2_A1253EmprGuiRem ;
   private String[] P09UT2_A457FasCod ;
   private java.math.BigDecimal[] P09UT2_A1276FasMtr ;
   private java.math.BigDecimal[] P09UT2_A1275FasKgm ;
   private java.math.BigDecimal[] P09UT2_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P09UT2_A1241GuiFasPKg ;
   private String[] P09UT2_A460FasDsc ;
   private short[] P09UT2_A1240GuiFasLin ;
   private int[] P09UT2_A129BarCod ;
   private byte[] P09UT2_A132BarCodReo ;
   private String[] P09UT2_A130BarCodPar ;
   private String[] P09UT3_A460FasDsc ;
   private String[] P09UT4_A457FasCod ;
   private String[] P09UT4_A396EmprCod ;
   private java.math.BigDecimal[] P09UT4_A1276FasMtr ;
   private java.math.BigDecimal[] P09UT4_A1275FasKgm ;
   private java.math.BigDecimal[] P09UT4_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P09UT4_A1241GuiFasPKg ;
   private String[] P09UT4_A460FasDsc ;
   private short[] P09UT4_A1240GuiFasLin ;
   private long[] P09UT4_A30AlbProCod ;
   private int[] P09UT4_A129BarCod ;
   private byte[] P09UT4_A132BarCodReo ;
   private String[] P09UT4_A130BarCodPar ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class albaranguiafase__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                          short AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin ,
                                          short AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to ,
                                          String AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                          String AV50Albaranes_albaranguiafase__wwds_4_tffascod ,
                                          String AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                          String AV52Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                          java.math.BigDecimal AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                          java.math.BigDecimal AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                          java.math.BigDecimal AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                          java.math.BigDecimal AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                          java.math.BigDecimal AV58Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                          java.math.BigDecimal AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                          java.math.BigDecimal AV60Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                          java.math.BigDecimal AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1276FasMtr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T2.EmprGuiRem, T1.FasCod, T1.FasMtr, T1.FasKgm, T1.GuiFasPMt, T1.GuiFasPKg, T3.FasDsc, T1.GuiFasLin, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM ((TXPALBFAS T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod" ;
      scmdbuf += " = T1.FasCod)" ;
      if ( ! (GXutil.strcmp("", AV47Albaranes_albaranguiafase__wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.GuiFasLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GuiFasPKg,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.GuiFasPMt,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasMtr,'999990.99'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV50Albaranes_albaranguiafase__wwds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Albaranes_albaranguiafase__wwds_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Albaranes_albaranguiafase__wwds_12_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Albaranes_albaranguiafase__wwds_14_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09UT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                          short AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin ,
                                          short AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to ,
                                          String AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                          String AV50Albaranes_albaranguiafase__wwds_4_tffascod ,
                                          String AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                          String AV52Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                          java.math.BigDecimal AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                          java.math.BigDecimal AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                          java.math.BigDecimal AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                          java.math.BigDecimal AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                          java.math.BigDecimal AV58Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                          java.math.BigDecimal AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                          java.math.BigDecimal AV60Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                          java.math.BigDecimal AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1276FasMtr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[21];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T1.EmprCod, T1.FasMtr, T1.FasKgm, T1.GuiFasPMt, T1.GuiFasPKg, T2.FasDsc, T1.GuiFasLin, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM" ;
      scmdbuf += " (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( ! (GXutil.strcmp("", AV47Albaranes_albaranguiafase__wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.GuiFasLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GuiFasPKg,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.GuiFasPMt,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasMtr,'999990.99'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV48Albaranes_albaranguiafase__wwds_2_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV49Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV50Albaranes_albaranguiafase__wwds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Albaranes_albaranguiafase__wwds_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Albaranes_albaranguiafase__wwds_8_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Albaranes_albaranguiafase__wwds_10_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Albaranes_albaranguiafase__wwds_12_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Albaranes_albaranguiafase__wwds_13_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Albaranes_albaranguiafase__wwds_14_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Albaranes_albaranguiafase__wwds_15_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P09UT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] );
            case 2 :
                  return conditional_P09UT4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UT3", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               return;
      }
   }

}

