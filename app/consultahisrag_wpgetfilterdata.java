package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultahisrag_wpgetfilterdata extends GXProcedure
{
   public consultahisrag_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultahisrag_wpgetfilterdata.class ), "" );
   }

   public consultahisrag_wpgetfilterdata( int remoteHandle ,
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
      consultahisrag_wpgetfilterdata.this.aP5 = new String[] {""};
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
      consultahisrag_wpgetfilterdata.this.AV44DDOName = aP0;
      consultahisrag_wpgetfilterdata.this.AV45SearchTxt = aP1;
      consultahisrag_wpgetfilterdata.this.AV46SearchTxtTo = aP2;
      consultahisrag_wpgetfilterdata.this.aP3 = aP3;
      consultahisrag_wpgetfilterdata.this.aP4 = aP4;
      consultahisrag_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV37OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_HREAGRPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADHREAGRPAROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_HREAGRSER") == 0 )
      {
         /* Execute user subroutine: 'LOADHREAGRSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_HREAGRDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHREAGRDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_HREAGRCOL") == 0 )
      {
         /* Execute user subroutine: 'LOADHREAGRCOLOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV47OptionsJson = AV34Options.toJSonString(false) ;
      AV48OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV49OptionIndexesJson = AV37OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("ConsultaHisRag_WPGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaHisRag_WPGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("ConsultaHisRag_WPGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOD") == 0 )
         {
            AV10TFHreAgrCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFHreAgrCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRREO") == 0 )
         {
            AV12TFHreAgrReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFHreAgrReo_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPAR") == 0 )
         {
            AV14TFHreAgrPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPAR_SEL") == 0 )
         {
            AV15TFHreAgrPar_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRKGM") == 0 )
         {
            AV16TFHreAgrKgm = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFHreAgrKgm_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRMTR") == 0 )
         {
            AV18TFHreAgrMtr = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFHreAgrMtr_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPIE") == 0 )
         {
            AV20TFHreAgrPie = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFHreAgrPie_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCLI") == 0 )
         {
            AV22TFHreAgrCli = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFHreAgrCli_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER") == 0 )
         {
            AV24TFHreAgrSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER_SEL") == 0 )
         {
            AV25TFHreAgrSer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC") == 0 )
         {
            AV26TFHreAgrDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC_SEL") == 0 )
         {
            AV27TFHreAgrDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL") == 0 )
         {
            AV28TFHreAgrCol = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL_SEL") == 0 )
         {
            AV29TFHreAgrCol_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNUMC") == 0 )
         {
            AV30TFHreAgrNumC = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFHreAgrNumC_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV50EmprCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV51HreBarCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV52HreBarReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV53HreBarPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV54Hrenumcie = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREAGRPAROPTIONS' Routine */
      returnInSub = false ;
      AV14TFHreAgrPar = AV45SearchTxt ;
      AV15TFHreAgrPar_Sel = "" ;
      AV59Consultahisrag_wpds_1_emprcod = AV50EmprCod ;
      AV60Consultahisrag_wpds_2_hrebarcod = AV51HreBarCod ;
      AV61Consultahisrag_wpds_3_hrebarreo = AV52HreBarReo ;
      AV62Consultahisrag_wpds_4_hrebarpar = AV53HreBarPar ;
      AV63Consultahisrag_wpds_5_hrenumcie = AV54Hrenumcie ;
      AV64Consultahisrag_wpds_6_tfhreagrcod = AV10TFHreAgrCod ;
      AV65Consultahisrag_wpds_7_tfhreagrcod_to = AV11TFHreAgrCod_To ;
      AV66Consultahisrag_wpds_8_tfhreagrreo = AV12TFHreAgrReo ;
      AV67Consultahisrag_wpds_9_tfhreagrreo_to = AV13TFHreAgrReo_To ;
      AV68Consultahisrag_wpds_10_tfhreagrpar = AV14TFHreAgrPar ;
      AV69Consultahisrag_wpds_11_tfhreagrpar_sel = AV15TFHreAgrPar_Sel ;
      AV70Consultahisrag_wpds_12_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV71Consultahisrag_wpds_13_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV72Consultahisrag_wpds_14_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV73Consultahisrag_wpds_15_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV74Consultahisrag_wpds_16_tfhreagrpie = AV20TFHreAgrPie ;
      AV75Consultahisrag_wpds_17_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      AV76Consultahisrag_wpds_18_tfhreagrcli = AV22TFHreAgrCli ;
      AV77Consultahisrag_wpds_19_tfhreagrcli_to = AV23TFHreAgrCli_To ;
      AV78Consultahisrag_wpds_20_tfhreagrser = AV24TFHreAgrSer ;
      AV79Consultahisrag_wpds_21_tfhreagrser_sel = AV25TFHreAgrSer_Sel ;
      AV80Consultahisrag_wpds_22_tfhreagrdsc = AV26TFHreAgrDsc ;
      AV81Consultahisrag_wpds_23_tfhreagrdsc_sel = AV27TFHreAgrDsc_Sel ;
      AV82Consultahisrag_wpds_24_tfhreagrcol = AV28TFHreAgrCol ;
      AV83Consultahisrag_wpds_25_tfhreagrcol_sel = AV29TFHreAgrCol_Sel ;
      AV84Consultahisrag_wpds_26_tfhreagrnumc = AV30TFHreAgrNumC ;
      AV85Consultahisrag_wpds_27_tfhreagrnumc_to = AV31TFHreAgrNumC_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod) ,
                                           Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to) ,
                                           Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo) ,
                                           Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to) ,
                                           AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                           AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                           AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                           AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                           AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                           AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                           Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie) ,
                                           Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to) ,
                                           Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli) ,
                                           Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to) ,
                                           AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                           AV78Consultahisrag_wpds_20_tfhreagrser ,
                                           AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                           AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                           AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                           AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                           Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc) ,
                                           Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           A396EmprCod ,
                                           AV50EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV51HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV52HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV53HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV54Hrenumcie) ,
                                           AV59Consultahisrag_wpds_1_emprcod ,
                                           Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod) ,
                                           Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo) ,
                                           AV62Consultahisrag_wpds_4_hrebarpar ,
                                           Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV68Consultahisrag_wpds_10_tfhreagrpar = GXutil.padr( GXutil.rtrim( AV68Consultahisrag_wpds_10_tfhreagrpar), 1, "%") ;
      lV78Consultahisrag_wpds_20_tfhreagrser = GXutil.padr( GXutil.rtrim( AV78Consultahisrag_wpds_20_tfhreagrser), 16, "%") ;
      lV80Consultahisrag_wpds_22_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV80Consultahisrag_wpds_22_tfhreagrdsc), 26, "%") ;
      lV82Consultahisrag_wpds_24_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV82Consultahisrag_wpds_24_tfhreagrcol), 13, "%") ;
      /* Using cursor P0AN32 */
      pr_default.execute(0, new Object[] {AV59Consultahisrag_wpds_1_emprcod, Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod), Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo), AV62Consultahisrag_wpds_4_hrebarpar, Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie), AV50EmprCod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarPar, Byte.valueOf(AV54Hrenumcie), Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod), Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to), Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo), Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to), lV68Consultahisrag_wpds_10_tfhreagrpar, AV69Consultahisrag_wpds_11_tfhreagrpar_sel, AV70Consultahisrag_wpds_12_tfhreagrkgm, AV71Consultahisrag_wpds_13_tfhreagrkgm_to, AV72Consultahisrag_wpds_14_tfhreagrmtr, AV73Consultahisrag_wpds_15_tfhreagrmtr_to, Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie), Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to), Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli), Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to), lV78Consultahisrag_wpds_20_tfhreagrser, AV79Consultahisrag_wpds_21_tfhreagrser_sel, lV80Consultahisrag_wpds_22_tfhreagrdsc, AV81Consultahisrag_wpds_23_tfhreagrdsc_sel, lV82Consultahisrag_wpds_24_tfhreagrcol, AV83Consultahisrag_wpds_25_tfhreagrcol_sel, Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc), Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAN32 = false ;
         A396EmprCod = P0AN32_A396EmprCod[0] ;
         A4492HreBarCod = P0AN32_A4492HreBarCod[0] ;
         A4493HreBarReo = P0AN32_A4493HreBarReo[0] ;
         A4494HreBarPar = P0AN32_A4494HreBarPar[0] ;
         A4495HreNumCie = P0AN32_A4495HreNumCie[0] ;
         A4499HreAgrPar = P0AN32_A4499HreAgrPar[0] ;
         A4507HreAgrNumC = P0AN32_A4507HreAgrNumC[0] ;
         A4506HreAgrCol = P0AN32_A4506HreAgrCol[0] ;
         A4505HreAgrDsc = P0AN32_A4505HreAgrDsc[0] ;
         A4504HreAgrSer = P0AN32_A4504HreAgrSer[0] ;
         A4503HreAgrCli = P0AN32_A4503HreAgrCli[0] ;
         A4502HreAgrPie = P0AN32_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P0AN32_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P0AN32_A4500HreAgrKgm[0] ;
         A4498HreAgrReo = P0AN32_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P0AN32_A4497HreAgrCod[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AN32_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AN32_A4492HreBarCod[0] == A4492HreBarCod ) && ( P0AN32_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(P0AN32_A4494HreBarPar[0], A4494HreBarPar) == 0 ) )
         {
            if ( ! ( ( P0AN32_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(P0AN32_A4499HreAgrPar[0], A4499HreAgrPar) == 0 ) ) )
            {
               if (true) break;
            }
            brkAN32 = false ;
            A4498HreAgrReo = P0AN32_A4498HreAgrReo[0] ;
            A4497HreAgrCod = P0AN32_A4497HreAgrCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkAN32 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4499HreAgrPar)==0) )
         {
            AV33Option = A4499HreAgrPar ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAN32 )
         {
            brkAN32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREAGRSEROPTIONS' Routine */
      returnInSub = false ;
      AV24TFHreAgrSer = AV45SearchTxt ;
      AV25TFHreAgrSer_Sel = "" ;
      AV59Consultahisrag_wpds_1_emprcod = AV50EmprCod ;
      AV60Consultahisrag_wpds_2_hrebarcod = AV51HreBarCod ;
      AV61Consultahisrag_wpds_3_hrebarreo = AV52HreBarReo ;
      AV62Consultahisrag_wpds_4_hrebarpar = AV53HreBarPar ;
      AV63Consultahisrag_wpds_5_hrenumcie = AV54Hrenumcie ;
      AV64Consultahisrag_wpds_6_tfhreagrcod = AV10TFHreAgrCod ;
      AV65Consultahisrag_wpds_7_tfhreagrcod_to = AV11TFHreAgrCod_To ;
      AV66Consultahisrag_wpds_8_tfhreagrreo = AV12TFHreAgrReo ;
      AV67Consultahisrag_wpds_9_tfhreagrreo_to = AV13TFHreAgrReo_To ;
      AV68Consultahisrag_wpds_10_tfhreagrpar = AV14TFHreAgrPar ;
      AV69Consultahisrag_wpds_11_tfhreagrpar_sel = AV15TFHreAgrPar_Sel ;
      AV70Consultahisrag_wpds_12_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV71Consultahisrag_wpds_13_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV72Consultahisrag_wpds_14_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV73Consultahisrag_wpds_15_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV74Consultahisrag_wpds_16_tfhreagrpie = AV20TFHreAgrPie ;
      AV75Consultahisrag_wpds_17_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      AV76Consultahisrag_wpds_18_tfhreagrcli = AV22TFHreAgrCli ;
      AV77Consultahisrag_wpds_19_tfhreagrcli_to = AV23TFHreAgrCli_To ;
      AV78Consultahisrag_wpds_20_tfhreagrser = AV24TFHreAgrSer ;
      AV79Consultahisrag_wpds_21_tfhreagrser_sel = AV25TFHreAgrSer_Sel ;
      AV80Consultahisrag_wpds_22_tfhreagrdsc = AV26TFHreAgrDsc ;
      AV81Consultahisrag_wpds_23_tfhreagrdsc_sel = AV27TFHreAgrDsc_Sel ;
      AV82Consultahisrag_wpds_24_tfhreagrcol = AV28TFHreAgrCol ;
      AV83Consultahisrag_wpds_25_tfhreagrcol_sel = AV29TFHreAgrCol_Sel ;
      AV84Consultahisrag_wpds_26_tfhreagrnumc = AV30TFHreAgrNumC ;
      AV85Consultahisrag_wpds_27_tfhreagrnumc_to = AV31TFHreAgrNumC_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod) ,
                                           Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to) ,
                                           Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo) ,
                                           Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to) ,
                                           AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                           AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                           AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                           AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                           AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                           AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                           Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie) ,
                                           Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to) ,
                                           Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli) ,
                                           Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to) ,
                                           AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                           AV78Consultahisrag_wpds_20_tfhreagrser ,
                                           AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                           AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                           AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                           AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                           Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc) ,
                                           Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           A396EmprCod ,
                                           AV50EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV51HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV52HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV53HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV54Hrenumcie) ,
                                           AV59Consultahisrag_wpds_1_emprcod ,
                                           Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod) ,
                                           Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo) ,
                                           AV62Consultahisrag_wpds_4_hrebarpar ,
                                           Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV68Consultahisrag_wpds_10_tfhreagrpar = GXutil.padr( GXutil.rtrim( AV68Consultahisrag_wpds_10_tfhreagrpar), 1, "%") ;
      lV78Consultahisrag_wpds_20_tfhreagrser = GXutil.padr( GXutil.rtrim( AV78Consultahisrag_wpds_20_tfhreagrser), 16, "%") ;
      lV80Consultahisrag_wpds_22_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV80Consultahisrag_wpds_22_tfhreagrdsc), 26, "%") ;
      lV82Consultahisrag_wpds_24_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV82Consultahisrag_wpds_24_tfhreagrcol), 13, "%") ;
      /* Using cursor P0AN33 */
      pr_default.execute(1, new Object[] {AV59Consultahisrag_wpds_1_emprcod, Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod), Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo), AV62Consultahisrag_wpds_4_hrebarpar, Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie), AV50EmprCod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarPar, Byte.valueOf(AV54Hrenumcie), Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod), Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to), Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo), Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to), lV68Consultahisrag_wpds_10_tfhreagrpar, AV69Consultahisrag_wpds_11_tfhreagrpar_sel, AV70Consultahisrag_wpds_12_tfhreagrkgm, AV71Consultahisrag_wpds_13_tfhreagrkgm_to, AV72Consultahisrag_wpds_14_tfhreagrmtr, AV73Consultahisrag_wpds_15_tfhreagrmtr_to, Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie), Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to), Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli), Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to), lV78Consultahisrag_wpds_20_tfhreagrser, AV79Consultahisrag_wpds_21_tfhreagrser_sel, lV80Consultahisrag_wpds_22_tfhreagrdsc, AV81Consultahisrag_wpds_23_tfhreagrdsc_sel, lV82Consultahisrag_wpds_24_tfhreagrcol, AV83Consultahisrag_wpds_25_tfhreagrcol_sel, Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc), Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAN34 = false ;
         A396EmprCod = P0AN33_A396EmprCod[0] ;
         A4492HreBarCod = P0AN33_A4492HreBarCod[0] ;
         A4493HreBarReo = P0AN33_A4493HreBarReo[0] ;
         A4494HreBarPar = P0AN33_A4494HreBarPar[0] ;
         A4495HreNumCie = P0AN33_A4495HreNumCie[0] ;
         A4504HreAgrSer = P0AN33_A4504HreAgrSer[0] ;
         A4507HreAgrNumC = P0AN33_A4507HreAgrNumC[0] ;
         A4506HreAgrCol = P0AN33_A4506HreAgrCol[0] ;
         A4505HreAgrDsc = P0AN33_A4505HreAgrDsc[0] ;
         A4503HreAgrCli = P0AN33_A4503HreAgrCli[0] ;
         A4502HreAgrPie = P0AN33_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P0AN33_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P0AN33_A4500HreAgrKgm[0] ;
         A4499HreAgrPar = P0AN33_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P0AN33_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P0AN33_A4497HreAgrCod[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AN33_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AN33_A4492HreBarCod[0] == A4492HreBarCod ) && ( P0AN33_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(P0AN33_A4494HreBarPar[0], A4494HreBarPar) == 0 ) )
         {
            if ( ! ( ( P0AN33_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(P0AN33_A4504HreAgrSer[0], A4504HreAgrSer) == 0 ) ) )
            {
               if (true) break;
            }
            brkAN34 = false ;
            A4499HreAgrPar = P0AN33_A4499HreAgrPar[0] ;
            A4498HreAgrReo = P0AN33_A4498HreAgrReo[0] ;
            A4497HreAgrCod = P0AN33_A4497HreAgrCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkAN34 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4504HreAgrSer)==0) )
         {
            AV33Option = A4504HreAgrSer ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAN34 )
         {
            brkAN34 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHREAGRDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFHreAgrDsc = AV45SearchTxt ;
      AV27TFHreAgrDsc_Sel = "" ;
      AV59Consultahisrag_wpds_1_emprcod = AV50EmprCod ;
      AV60Consultahisrag_wpds_2_hrebarcod = AV51HreBarCod ;
      AV61Consultahisrag_wpds_3_hrebarreo = AV52HreBarReo ;
      AV62Consultahisrag_wpds_4_hrebarpar = AV53HreBarPar ;
      AV63Consultahisrag_wpds_5_hrenumcie = AV54Hrenumcie ;
      AV64Consultahisrag_wpds_6_tfhreagrcod = AV10TFHreAgrCod ;
      AV65Consultahisrag_wpds_7_tfhreagrcod_to = AV11TFHreAgrCod_To ;
      AV66Consultahisrag_wpds_8_tfhreagrreo = AV12TFHreAgrReo ;
      AV67Consultahisrag_wpds_9_tfhreagrreo_to = AV13TFHreAgrReo_To ;
      AV68Consultahisrag_wpds_10_tfhreagrpar = AV14TFHreAgrPar ;
      AV69Consultahisrag_wpds_11_tfhreagrpar_sel = AV15TFHreAgrPar_Sel ;
      AV70Consultahisrag_wpds_12_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV71Consultahisrag_wpds_13_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV72Consultahisrag_wpds_14_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV73Consultahisrag_wpds_15_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV74Consultahisrag_wpds_16_tfhreagrpie = AV20TFHreAgrPie ;
      AV75Consultahisrag_wpds_17_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      AV76Consultahisrag_wpds_18_tfhreagrcli = AV22TFHreAgrCli ;
      AV77Consultahisrag_wpds_19_tfhreagrcli_to = AV23TFHreAgrCli_To ;
      AV78Consultahisrag_wpds_20_tfhreagrser = AV24TFHreAgrSer ;
      AV79Consultahisrag_wpds_21_tfhreagrser_sel = AV25TFHreAgrSer_Sel ;
      AV80Consultahisrag_wpds_22_tfhreagrdsc = AV26TFHreAgrDsc ;
      AV81Consultahisrag_wpds_23_tfhreagrdsc_sel = AV27TFHreAgrDsc_Sel ;
      AV82Consultahisrag_wpds_24_tfhreagrcol = AV28TFHreAgrCol ;
      AV83Consultahisrag_wpds_25_tfhreagrcol_sel = AV29TFHreAgrCol_Sel ;
      AV84Consultahisrag_wpds_26_tfhreagrnumc = AV30TFHreAgrNumC ;
      AV85Consultahisrag_wpds_27_tfhreagrnumc_to = AV31TFHreAgrNumC_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod) ,
                                           Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to) ,
                                           Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo) ,
                                           Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to) ,
                                           AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                           AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                           AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                           AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                           AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                           AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                           Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie) ,
                                           Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to) ,
                                           Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli) ,
                                           Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to) ,
                                           AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                           AV78Consultahisrag_wpds_20_tfhreagrser ,
                                           AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                           AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                           AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                           AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                           Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc) ,
                                           Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           A396EmprCod ,
                                           AV50EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV51HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV52HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV53HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV54Hrenumcie) ,
                                           AV59Consultahisrag_wpds_1_emprcod ,
                                           Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod) ,
                                           Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo) ,
                                           AV62Consultahisrag_wpds_4_hrebarpar ,
                                           Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV68Consultahisrag_wpds_10_tfhreagrpar = GXutil.padr( GXutil.rtrim( AV68Consultahisrag_wpds_10_tfhreagrpar), 1, "%") ;
      lV78Consultahisrag_wpds_20_tfhreagrser = GXutil.padr( GXutil.rtrim( AV78Consultahisrag_wpds_20_tfhreagrser), 16, "%") ;
      lV80Consultahisrag_wpds_22_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV80Consultahisrag_wpds_22_tfhreagrdsc), 26, "%") ;
      lV82Consultahisrag_wpds_24_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV82Consultahisrag_wpds_24_tfhreagrcol), 13, "%") ;
      /* Using cursor P0AN34 */
      pr_default.execute(2, new Object[] {AV59Consultahisrag_wpds_1_emprcod, Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod), Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo), AV62Consultahisrag_wpds_4_hrebarpar, Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie), AV50EmprCod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarPar, Byte.valueOf(AV54Hrenumcie), Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod), Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to), Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo), Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to), lV68Consultahisrag_wpds_10_tfhreagrpar, AV69Consultahisrag_wpds_11_tfhreagrpar_sel, AV70Consultahisrag_wpds_12_tfhreagrkgm, AV71Consultahisrag_wpds_13_tfhreagrkgm_to, AV72Consultahisrag_wpds_14_tfhreagrmtr, AV73Consultahisrag_wpds_15_tfhreagrmtr_to, Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie), Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to), Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli), Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to), lV78Consultahisrag_wpds_20_tfhreagrser, AV79Consultahisrag_wpds_21_tfhreagrser_sel, lV80Consultahisrag_wpds_22_tfhreagrdsc, AV81Consultahisrag_wpds_23_tfhreagrdsc_sel, lV82Consultahisrag_wpds_24_tfhreagrcol, AV83Consultahisrag_wpds_25_tfhreagrcol_sel, Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc), Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAN36 = false ;
         A396EmprCod = P0AN34_A396EmprCod[0] ;
         A4492HreBarCod = P0AN34_A4492HreBarCod[0] ;
         A4493HreBarReo = P0AN34_A4493HreBarReo[0] ;
         A4494HreBarPar = P0AN34_A4494HreBarPar[0] ;
         A4495HreNumCie = P0AN34_A4495HreNumCie[0] ;
         A4505HreAgrDsc = P0AN34_A4505HreAgrDsc[0] ;
         A4507HreAgrNumC = P0AN34_A4507HreAgrNumC[0] ;
         A4506HreAgrCol = P0AN34_A4506HreAgrCol[0] ;
         A4504HreAgrSer = P0AN34_A4504HreAgrSer[0] ;
         A4503HreAgrCli = P0AN34_A4503HreAgrCli[0] ;
         A4502HreAgrPie = P0AN34_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P0AN34_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P0AN34_A4500HreAgrKgm[0] ;
         A4499HreAgrPar = P0AN34_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P0AN34_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P0AN34_A4497HreAgrCod[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AN34_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AN34_A4492HreBarCod[0] == A4492HreBarCod ) && ( P0AN34_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(P0AN34_A4494HreBarPar[0], A4494HreBarPar) == 0 ) )
         {
            if ( ! ( ( P0AN34_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(P0AN34_A4505HreAgrDsc[0], A4505HreAgrDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brkAN36 = false ;
            A4499HreAgrPar = P0AN34_A4499HreAgrPar[0] ;
            A4498HreAgrReo = P0AN34_A4498HreAgrReo[0] ;
            A4497HreAgrCod = P0AN34_A4497HreAgrCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkAN36 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4505HreAgrDsc)==0) )
         {
            AV33Option = A4505HreAgrDsc ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAN36 )
         {
            brkAN36 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHREAGRCOLOPTIONS' Routine */
      returnInSub = false ;
      AV28TFHreAgrCol = AV45SearchTxt ;
      AV29TFHreAgrCol_Sel = "" ;
      AV59Consultahisrag_wpds_1_emprcod = AV50EmprCod ;
      AV60Consultahisrag_wpds_2_hrebarcod = AV51HreBarCod ;
      AV61Consultahisrag_wpds_3_hrebarreo = AV52HreBarReo ;
      AV62Consultahisrag_wpds_4_hrebarpar = AV53HreBarPar ;
      AV63Consultahisrag_wpds_5_hrenumcie = AV54Hrenumcie ;
      AV64Consultahisrag_wpds_6_tfhreagrcod = AV10TFHreAgrCod ;
      AV65Consultahisrag_wpds_7_tfhreagrcod_to = AV11TFHreAgrCod_To ;
      AV66Consultahisrag_wpds_8_tfhreagrreo = AV12TFHreAgrReo ;
      AV67Consultahisrag_wpds_9_tfhreagrreo_to = AV13TFHreAgrReo_To ;
      AV68Consultahisrag_wpds_10_tfhreagrpar = AV14TFHreAgrPar ;
      AV69Consultahisrag_wpds_11_tfhreagrpar_sel = AV15TFHreAgrPar_Sel ;
      AV70Consultahisrag_wpds_12_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV71Consultahisrag_wpds_13_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV72Consultahisrag_wpds_14_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV73Consultahisrag_wpds_15_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV74Consultahisrag_wpds_16_tfhreagrpie = AV20TFHreAgrPie ;
      AV75Consultahisrag_wpds_17_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      AV76Consultahisrag_wpds_18_tfhreagrcli = AV22TFHreAgrCli ;
      AV77Consultahisrag_wpds_19_tfhreagrcli_to = AV23TFHreAgrCli_To ;
      AV78Consultahisrag_wpds_20_tfhreagrser = AV24TFHreAgrSer ;
      AV79Consultahisrag_wpds_21_tfhreagrser_sel = AV25TFHreAgrSer_Sel ;
      AV80Consultahisrag_wpds_22_tfhreagrdsc = AV26TFHreAgrDsc ;
      AV81Consultahisrag_wpds_23_tfhreagrdsc_sel = AV27TFHreAgrDsc_Sel ;
      AV82Consultahisrag_wpds_24_tfhreagrcol = AV28TFHreAgrCol ;
      AV83Consultahisrag_wpds_25_tfhreagrcol_sel = AV29TFHreAgrCol_Sel ;
      AV84Consultahisrag_wpds_26_tfhreagrnumc = AV30TFHreAgrNumC ;
      AV85Consultahisrag_wpds_27_tfhreagrnumc_to = AV31TFHreAgrNumC_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod) ,
                                           Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to) ,
                                           Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo) ,
                                           Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to) ,
                                           AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                           AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                           AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                           AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                           AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                           AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                           Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie) ,
                                           Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to) ,
                                           Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli) ,
                                           Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to) ,
                                           AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                           AV78Consultahisrag_wpds_20_tfhreagrser ,
                                           AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                           AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                           AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                           AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                           Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc) ,
                                           Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           A396EmprCod ,
                                           AV50EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV51HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV52HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV53HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV54Hrenumcie) ,
                                           AV59Consultahisrag_wpds_1_emprcod ,
                                           Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod) ,
                                           Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo) ,
                                           AV62Consultahisrag_wpds_4_hrebarpar ,
                                           Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV68Consultahisrag_wpds_10_tfhreagrpar = GXutil.padr( GXutil.rtrim( AV68Consultahisrag_wpds_10_tfhreagrpar), 1, "%") ;
      lV78Consultahisrag_wpds_20_tfhreagrser = GXutil.padr( GXutil.rtrim( AV78Consultahisrag_wpds_20_tfhreagrser), 16, "%") ;
      lV80Consultahisrag_wpds_22_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV80Consultahisrag_wpds_22_tfhreagrdsc), 26, "%") ;
      lV82Consultahisrag_wpds_24_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV82Consultahisrag_wpds_24_tfhreagrcol), 13, "%") ;
      /* Using cursor P0AN35 */
      pr_default.execute(3, new Object[] {AV59Consultahisrag_wpds_1_emprcod, Integer.valueOf(AV60Consultahisrag_wpds_2_hrebarcod), Byte.valueOf(AV61Consultahisrag_wpds_3_hrebarreo), AV62Consultahisrag_wpds_4_hrebarpar, Byte.valueOf(AV63Consultahisrag_wpds_5_hrenumcie), AV50EmprCod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarPar, Byte.valueOf(AV54Hrenumcie), Integer.valueOf(AV64Consultahisrag_wpds_6_tfhreagrcod), Integer.valueOf(AV65Consultahisrag_wpds_7_tfhreagrcod_to), Byte.valueOf(AV66Consultahisrag_wpds_8_tfhreagrreo), Byte.valueOf(AV67Consultahisrag_wpds_9_tfhreagrreo_to), lV68Consultahisrag_wpds_10_tfhreagrpar, AV69Consultahisrag_wpds_11_tfhreagrpar_sel, AV70Consultahisrag_wpds_12_tfhreagrkgm, AV71Consultahisrag_wpds_13_tfhreagrkgm_to, AV72Consultahisrag_wpds_14_tfhreagrmtr, AV73Consultahisrag_wpds_15_tfhreagrmtr_to, Short.valueOf(AV74Consultahisrag_wpds_16_tfhreagrpie), Short.valueOf(AV75Consultahisrag_wpds_17_tfhreagrpie_to), Integer.valueOf(AV76Consultahisrag_wpds_18_tfhreagrcli), Integer.valueOf(AV77Consultahisrag_wpds_19_tfhreagrcli_to), lV78Consultahisrag_wpds_20_tfhreagrser, AV79Consultahisrag_wpds_21_tfhreagrser_sel, lV80Consultahisrag_wpds_22_tfhreagrdsc, AV81Consultahisrag_wpds_23_tfhreagrdsc_sel, lV82Consultahisrag_wpds_24_tfhreagrcol, AV83Consultahisrag_wpds_25_tfhreagrcol_sel, Integer.valueOf(AV84Consultahisrag_wpds_26_tfhreagrnumc), Integer.valueOf(AV85Consultahisrag_wpds_27_tfhreagrnumc_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAN38 = false ;
         A396EmprCod = P0AN35_A396EmprCod[0] ;
         A4492HreBarCod = P0AN35_A4492HreBarCod[0] ;
         A4493HreBarReo = P0AN35_A4493HreBarReo[0] ;
         A4494HreBarPar = P0AN35_A4494HreBarPar[0] ;
         A4495HreNumCie = P0AN35_A4495HreNumCie[0] ;
         A4506HreAgrCol = P0AN35_A4506HreAgrCol[0] ;
         A4507HreAgrNumC = P0AN35_A4507HreAgrNumC[0] ;
         A4505HreAgrDsc = P0AN35_A4505HreAgrDsc[0] ;
         A4504HreAgrSer = P0AN35_A4504HreAgrSer[0] ;
         A4503HreAgrCli = P0AN35_A4503HreAgrCli[0] ;
         A4502HreAgrPie = P0AN35_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P0AN35_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P0AN35_A4500HreAgrKgm[0] ;
         A4499HreAgrPar = P0AN35_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P0AN35_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P0AN35_A4497HreAgrCod[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AN35_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AN35_A4492HreBarCod[0] == A4492HreBarCod ) && ( P0AN35_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(P0AN35_A4494HreBarPar[0], A4494HreBarPar) == 0 ) )
         {
            if ( ! ( ( P0AN35_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(P0AN35_A4506HreAgrCol[0], A4506HreAgrCol) == 0 ) ) )
            {
               if (true) break;
            }
            brkAN38 = false ;
            A4499HreAgrPar = P0AN35_A4499HreAgrPar[0] ;
            A4498HreAgrReo = P0AN35_A4498HreAgrReo[0] ;
            A4497HreAgrCod = P0AN35_A4497HreAgrCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkAN38 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4506HreAgrCol)==0) )
         {
            AV33Option = A4506HreAgrCol ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAN38 )
         {
            brkAN38 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultahisrag_wpgetfilterdata.this.AV47OptionsJson;
      this.aP4[0] = consultahisrag_wpgetfilterdata.this.AV48OptionsDescJson;
      this.aP5[0] = consultahisrag_wpgetfilterdata.this.AV49OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47OptionsJson = "" ;
      AV48OptionsDescJson = "" ;
      AV49OptionIndexesJson = "" ;
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV14TFHreAgrPar = "" ;
      AV15TFHreAgrPar_Sel = "" ;
      AV16TFHreAgrKgm = DecimalUtil.ZERO ;
      AV17TFHreAgrKgm_To = DecimalUtil.ZERO ;
      AV18TFHreAgrMtr = DecimalUtil.ZERO ;
      AV19TFHreAgrMtr_To = DecimalUtil.ZERO ;
      AV24TFHreAgrSer = "" ;
      AV25TFHreAgrSer_Sel = "" ;
      AV26TFHreAgrDsc = "" ;
      AV27TFHreAgrDsc_Sel = "" ;
      AV28TFHreAgrCol = "" ;
      AV29TFHreAgrCol_Sel = "" ;
      AV50EmprCod = "" ;
      AV53HreBarPar = "" ;
      A4499HreAgrPar = "" ;
      AV59Consultahisrag_wpds_1_emprcod = "" ;
      AV62Consultahisrag_wpds_4_hrebarpar = "" ;
      AV68Consultahisrag_wpds_10_tfhreagrpar = "" ;
      AV69Consultahisrag_wpds_11_tfhreagrpar_sel = "" ;
      AV70Consultahisrag_wpds_12_tfhreagrkgm = DecimalUtil.ZERO ;
      AV71Consultahisrag_wpds_13_tfhreagrkgm_to = DecimalUtil.ZERO ;
      AV72Consultahisrag_wpds_14_tfhreagrmtr = DecimalUtil.ZERO ;
      AV73Consultahisrag_wpds_15_tfhreagrmtr_to = DecimalUtil.ZERO ;
      AV78Consultahisrag_wpds_20_tfhreagrser = "" ;
      AV79Consultahisrag_wpds_21_tfhreagrser_sel = "" ;
      AV80Consultahisrag_wpds_22_tfhreagrdsc = "" ;
      AV81Consultahisrag_wpds_23_tfhreagrdsc_sel = "" ;
      AV82Consultahisrag_wpds_24_tfhreagrcol = "" ;
      AV83Consultahisrag_wpds_25_tfhreagrcol_sel = "" ;
      scmdbuf = "" ;
      lV68Consultahisrag_wpds_10_tfhreagrpar = "" ;
      lV78Consultahisrag_wpds_20_tfhreagrser = "" ;
      lV80Consultahisrag_wpds_22_tfhreagrdsc = "" ;
      lV82Consultahisrag_wpds_24_tfhreagrcol = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P0AN32_A396EmprCod = new String[] {""} ;
      P0AN32_A4492HreBarCod = new int[1] ;
      P0AN32_A4493HreBarReo = new byte[1] ;
      P0AN32_A4494HreBarPar = new String[] {""} ;
      P0AN32_A4495HreNumCie = new byte[1] ;
      P0AN32_A4499HreAgrPar = new String[] {""} ;
      P0AN32_A4507HreAgrNumC = new int[1] ;
      P0AN32_A4506HreAgrCol = new String[] {""} ;
      P0AN32_A4505HreAgrDsc = new String[] {""} ;
      P0AN32_A4504HreAgrSer = new String[] {""} ;
      P0AN32_A4503HreAgrCli = new int[1] ;
      P0AN32_A4502HreAgrPie = new short[1] ;
      P0AN32_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN32_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN32_A4498HreAgrReo = new byte[1] ;
      P0AN32_A4497HreAgrCod = new int[1] ;
      AV33Option = "" ;
      P0AN33_A396EmprCod = new String[] {""} ;
      P0AN33_A4492HreBarCod = new int[1] ;
      P0AN33_A4493HreBarReo = new byte[1] ;
      P0AN33_A4494HreBarPar = new String[] {""} ;
      P0AN33_A4495HreNumCie = new byte[1] ;
      P0AN33_A4504HreAgrSer = new String[] {""} ;
      P0AN33_A4507HreAgrNumC = new int[1] ;
      P0AN33_A4506HreAgrCol = new String[] {""} ;
      P0AN33_A4505HreAgrDsc = new String[] {""} ;
      P0AN33_A4503HreAgrCli = new int[1] ;
      P0AN33_A4502HreAgrPie = new short[1] ;
      P0AN33_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN33_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN33_A4499HreAgrPar = new String[] {""} ;
      P0AN33_A4498HreAgrReo = new byte[1] ;
      P0AN33_A4497HreAgrCod = new int[1] ;
      P0AN34_A396EmprCod = new String[] {""} ;
      P0AN34_A4492HreBarCod = new int[1] ;
      P0AN34_A4493HreBarReo = new byte[1] ;
      P0AN34_A4494HreBarPar = new String[] {""} ;
      P0AN34_A4495HreNumCie = new byte[1] ;
      P0AN34_A4505HreAgrDsc = new String[] {""} ;
      P0AN34_A4507HreAgrNumC = new int[1] ;
      P0AN34_A4506HreAgrCol = new String[] {""} ;
      P0AN34_A4504HreAgrSer = new String[] {""} ;
      P0AN34_A4503HreAgrCli = new int[1] ;
      P0AN34_A4502HreAgrPie = new short[1] ;
      P0AN34_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN34_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN34_A4499HreAgrPar = new String[] {""} ;
      P0AN34_A4498HreAgrReo = new byte[1] ;
      P0AN34_A4497HreAgrCod = new int[1] ;
      P0AN35_A396EmprCod = new String[] {""} ;
      P0AN35_A4492HreBarCod = new int[1] ;
      P0AN35_A4493HreBarReo = new byte[1] ;
      P0AN35_A4494HreBarPar = new String[] {""} ;
      P0AN35_A4495HreNumCie = new byte[1] ;
      P0AN35_A4506HreAgrCol = new String[] {""} ;
      P0AN35_A4507HreAgrNumC = new int[1] ;
      P0AN35_A4505HreAgrDsc = new String[] {""} ;
      P0AN35_A4504HreAgrSer = new String[] {""} ;
      P0AN35_A4503HreAgrCli = new int[1] ;
      P0AN35_A4502HreAgrPie = new short[1] ;
      P0AN35_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN35_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN35_A4499HreAgrPar = new String[] {""} ;
      P0AN35_A4498HreAgrReo = new byte[1] ;
      P0AN35_A4497HreAgrCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultahisrag_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AN32_A396EmprCod, P0AN32_A4492HreBarCod, P0AN32_A4493HreBarReo, P0AN32_A4494HreBarPar, P0AN32_A4495HreNumCie, P0AN32_A4499HreAgrPar, P0AN32_A4507HreAgrNumC, P0AN32_A4506HreAgrCol, P0AN32_A4505HreAgrDsc, P0AN32_A4504HreAgrSer,
            P0AN32_A4503HreAgrCli, P0AN32_A4502HreAgrPie, P0AN32_A4501HreAgrMtr, P0AN32_A4500HreAgrKgm, P0AN32_A4498HreAgrReo, P0AN32_A4497HreAgrCod
            }
            , new Object[] {
            P0AN33_A396EmprCod, P0AN33_A4492HreBarCod, P0AN33_A4493HreBarReo, P0AN33_A4494HreBarPar, P0AN33_A4495HreNumCie, P0AN33_A4504HreAgrSer, P0AN33_A4507HreAgrNumC, P0AN33_A4506HreAgrCol, P0AN33_A4505HreAgrDsc, P0AN33_A4503HreAgrCli,
            P0AN33_A4502HreAgrPie, P0AN33_A4501HreAgrMtr, P0AN33_A4500HreAgrKgm, P0AN33_A4499HreAgrPar, P0AN33_A4498HreAgrReo, P0AN33_A4497HreAgrCod
            }
            , new Object[] {
            P0AN34_A396EmprCod, P0AN34_A4492HreBarCod, P0AN34_A4493HreBarReo, P0AN34_A4494HreBarPar, P0AN34_A4495HreNumCie, P0AN34_A4505HreAgrDsc, P0AN34_A4507HreAgrNumC, P0AN34_A4506HreAgrCol, P0AN34_A4504HreAgrSer, P0AN34_A4503HreAgrCli,
            P0AN34_A4502HreAgrPie, P0AN34_A4501HreAgrMtr, P0AN34_A4500HreAgrKgm, P0AN34_A4499HreAgrPar, P0AN34_A4498HreAgrReo, P0AN34_A4497HreAgrCod
            }
            , new Object[] {
            P0AN35_A396EmprCod, P0AN35_A4492HreBarCod, P0AN35_A4493HreBarReo, P0AN35_A4494HreBarPar, P0AN35_A4495HreNumCie, P0AN35_A4506HreAgrCol, P0AN35_A4507HreAgrNumC, P0AN35_A4505HreAgrDsc, P0AN35_A4504HreAgrSer, P0AN35_A4503HreAgrCli,
            P0AN35_A4502HreAgrPie, P0AN35_A4501HreAgrMtr, P0AN35_A4500HreAgrKgm, P0AN35_A4499HreAgrPar, P0AN35_A4498HreAgrReo, P0AN35_A4497HreAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFHreAgrReo ;
   private byte AV13TFHreAgrReo_To ;
   private byte AV52HreBarReo ;
   private byte AV54Hrenumcie ;
   private byte AV61Consultahisrag_wpds_3_hrebarreo ;
   private byte AV63Consultahisrag_wpds_5_hrenumcie ;
   private byte AV66Consultahisrag_wpds_8_tfhreagrreo ;
   private byte AV67Consultahisrag_wpds_9_tfhreagrreo_to ;
   private byte A4498HreAgrReo ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV20TFHreAgrPie ;
   private short AV21TFHreAgrPie_To ;
   private short AV74Consultahisrag_wpds_16_tfhreagrpie ;
   private short AV75Consultahisrag_wpds_17_tfhreagrpie_to ;
   private short A4502HreAgrPie ;
   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV10TFHreAgrCod ;
   private int AV11TFHreAgrCod_To ;
   private int AV22TFHreAgrCli ;
   private int AV23TFHreAgrCli_To ;
   private int AV30TFHreAgrNumC ;
   private int AV31TFHreAgrNumC_To ;
   private int AV51HreBarCod ;
   private int AV60Consultahisrag_wpds_2_hrebarcod ;
   private int AV64Consultahisrag_wpds_6_tfhreagrcod ;
   private int AV65Consultahisrag_wpds_7_tfhreagrcod_to ;
   private int AV76Consultahisrag_wpds_18_tfhreagrcli ;
   private int AV77Consultahisrag_wpds_19_tfhreagrcli_to ;
   private int AV84Consultahisrag_wpds_26_tfhreagrnumc ;
   private int AV85Consultahisrag_wpds_27_tfhreagrnumc_to ;
   private int A4497HreAgrCod ;
   private int A4503HreAgrCli ;
   private int A4507HreAgrNumC ;
   private int A4492HreBarCod ;
   private long AV38count ;
   private java.math.BigDecimal AV16TFHreAgrKgm ;
   private java.math.BigDecimal AV17TFHreAgrKgm_To ;
   private java.math.BigDecimal AV18TFHreAgrMtr ;
   private java.math.BigDecimal AV19TFHreAgrMtr_To ;
   private java.math.BigDecimal AV70Consultahisrag_wpds_12_tfhreagrkgm ;
   private java.math.BigDecimal AV71Consultahisrag_wpds_13_tfhreagrkgm_to ;
   private java.math.BigDecimal AV72Consultahisrag_wpds_14_tfhreagrmtr ;
   private java.math.BigDecimal AV73Consultahisrag_wpds_15_tfhreagrmtr_to ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private String AV14TFHreAgrPar ;
   private String AV15TFHreAgrPar_Sel ;
   private String AV24TFHreAgrSer ;
   private String AV25TFHreAgrSer_Sel ;
   private String AV26TFHreAgrDsc ;
   private String AV27TFHreAgrDsc_Sel ;
   private String AV28TFHreAgrCol ;
   private String AV29TFHreAgrCol_Sel ;
   private String AV50EmprCod ;
   private String AV53HreBarPar ;
   private String A4499HreAgrPar ;
   private String AV59Consultahisrag_wpds_1_emprcod ;
   private String AV62Consultahisrag_wpds_4_hrebarpar ;
   private String AV68Consultahisrag_wpds_10_tfhreagrpar ;
   private String AV69Consultahisrag_wpds_11_tfhreagrpar_sel ;
   private String AV78Consultahisrag_wpds_20_tfhreagrser ;
   private String AV79Consultahisrag_wpds_21_tfhreagrser_sel ;
   private String AV80Consultahisrag_wpds_22_tfhreagrdsc ;
   private String AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ;
   private String AV82Consultahisrag_wpds_24_tfhreagrcol ;
   private String AV83Consultahisrag_wpds_25_tfhreagrcol_sel ;
   private String scmdbuf ;
   private String lV68Consultahisrag_wpds_10_tfhreagrpar ;
   private String lV78Consultahisrag_wpds_20_tfhreagrser ;
   private String lV80Consultahisrag_wpds_22_tfhreagrdsc ;
   private String lV82Consultahisrag_wpds_24_tfhreagrcol ;
   private String A4504HreAgrSer ;
   private String A4505HreAgrDsc ;
   private String A4506HreAgrCol ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brkAN32 ;
   private boolean brkAN34 ;
   private boolean brkAN36 ;
   private boolean brkAN38 ;
   private String AV47OptionsJson ;
   private String AV48OptionsDescJson ;
   private String AV49OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV45SearchTxt ;
   private String AV46SearchTxtTo ;
   private String AV33Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AN32_A396EmprCod ;
   private int[] P0AN32_A4492HreBarCod ;
   private byte[] P0AN32_A4493HreBarReo ;
   private String[] P0AN32_A4494HreBarPar ;
   private byte[] P0AN32_A4495HreNumCie ;
   private String[] P0AN32_A4499HreAgrPar ;
   private int[] P0AN32_A4507HreAgrNumC ;
   private String[] P0AN32_A4506HreAgrCol ;
   private String[] P0AN32_A4505HreAgrDsc ;
   private String[] P0AN32_A4504HreAgrSer ;
   private int[] P0AN32_A4503HreAgrCli ;
   private short[] P0AN32_A4502HreAgrPie ;
   private java.math.BigDecimal[] P0AN32_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P0AN32_A4500HreAgrKgm ;
   private byte[] P0AN32_A4498HreAgrReo ;
   private int[] P0AN32_A4497HreAgrCod ;
   private String[] P0AN33_A396EmprCod ;
   private int[] P0AN33_A4492HreBarCod ;
   private byte[] P0AN33_A4493HreBarReo ;
   private String[] P0AN33_A4494HreBarPar ;
   private byte[] P0AN33_A4495HreNumCie ;
   private String[] P0AN33_A4504HreAgrSer ;
   private int[] P0AN33_A4507HreAgrNumC ;
   private String[] P0AN33_A4506HreAgrCol ;
   private String[] P0AN33_A4505HreAgrDsc ;
   private int[] P0AN33_A4503HreAgrCli ;
   private short[] P0AN33_A4502HreAgrPie ;
   private java.math.BigDecimal[] P0AN33_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P0AN33_A4500HreAgrKgm ;
   private String[] P0AN33_A4499HreAgrPar ;
   private byte[] P0AN33_A4498HreAgrReo ;
   private int[] P0AN33_A4497HreAgrCod ;
   private String[] P0AN34_A396EmprCod ;
   private int[] P0AN34_A4492HreBarCod ;
   private byte[] P0AN34_A4493HreBarReo ;
   private String[] P0AN34_A4494HreBarPar ;
   private byte[] P0AN34_A4495HreNumCie ;
   private String[] P0AN34_A4505HreAgrDsc ;
   private int[] P0AN34_A4507HreAgrNumC ;
   private String[] P0AN34_A4506HreAgrCol ;
   private String[] P0AN34_A4504HreAgrSer ;
   private int[] P0AN34_A4503HreAgrCli ;
   private short[] P0AN34_A4502HreAgrPie ;
   private java.math.BigDecimal[] P0AN34_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P0AN34_A4500HreAgrKgm ;
   private String[] P0AN34_A4499HreAgrPar ;
   private byte[] P0AN34_A4498HreAgrReo ;
   private int[] P0AN34_A4497HreAgrCod ;
   private String[] P0AN35_A396EmprCod ;
   private int[] P0AN35_A4492HreBarCod ;
   private byte[] P0AN35_A4493HreBarReo ;
   private String[] P0AN35_A4494HreBarPar ;
   private byte[] P0AN35_A4495HreNumCie ;
   private String[] P0AN35_A4506HreAgrCol ;
   private int[] P0AN35_A4507HreAgrNumC ;
   private String[] P0AN35_A4505HreAgrDsc ;
   private String[] P0AN35_A4504HreAgrSer ;
   private int[] P0AN35_A4503HreAgrCli ;
   private short[] P0AN35_A4502HreAgrPie ;
   private java.math.BigDecimal[] P0AN35_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P0AN35_A4500HreAgrKgm ;
   private String[] P0AN35_A4499HreAgrPar ;
   private byte[] P0AN35_A4498HreAgrReo ;
   private int[] P0AN35_A4497HreAgrCod ;
   private GXSimpleCollection<String> AV34Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV37OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class consultahisrag_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AN32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV64Consultahisrag_wpds_6_tfhreagrcod ,
                                          int AV65Consultahisrag_wpds_7_tfhreagrcod_to ,
                                          byte AV66Consultahisrag_wpds_8_tfhreagrreo ,
                                          byte AV67Consultahisrag_wpds_9_tfhreagrreo_to ,
                                          String AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                          String AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                          java.math.BigDecimal AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                          java.math.BigDecimal AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                          java.math.BigDecimal AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                          short AV74Consultahisrag_wpds_16_tfhreagrpie ,
                                          short AV75Consultahisrag_wpds_17_tfhreagrpie_to ,
                                          int AV76Consultahisrag_wpds_18_tfhreagrcli ,
                                          int AV77Consultahisrag_wpds_19_tfhreagrcli_to ,
                                          String AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                          String AV78Consultahisrag_wpds_20_tfhreagrser ,
                                          String AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                          String AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                          String AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                          String AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                          int AV84Consultahisrag_wpds_26_tfhreagrnumc ,
                                          int AV85Consultahisrag_wpds_27_tfhreagrnumc_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          int A4503HreAgrCli ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          String A396EmprCod ,
                                          String AV50EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV51HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV52HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV53HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV54Hrenumcie ,
                                          String AV59Consultahisrag_wpds_1_emprcod ,
                                          int AV60Consultahisrag_wpds_2_hrebarcod ,
                                          byte AV61Consultahisrag_wpds_3_hrebarreo ,
                                          String AV62Consultahisrag_wpds_4_hrebarpar ,
                                          byte AV63Consultahisrag_wpds_5_hrenumcie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrPar, HreAgrNumC, HreAgrCol, HreAgrDsc, HreAgrSer, HreAgrCli, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (0==AV64Consultahisrag_wpds_6_tfhreagrcod) )
      {
         addWhere(sWhereString, "(HreAgrCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Consultahisrag_wpds_7_tfhreagrcod_to) )
      {
         addWhere(sWhereString, "(HreAgrCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Consultahisrag_wpds_8_tfhreagrreo) )
      {
         addWhere(sWhereString, "(HreAgrReo >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Consultahisrag_wpds_9_tfhreagrreo_to) )
      {
         addWhere(sWhereString, "(HreAgrReo <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) && ( ! (GXutil.strcmp("", AV68Consultahisrag_wpds_10_tfhreagrpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrPar = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Consultahisrag_wpds_12_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Consultahisrag_wpds_13_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Consultahisrag_wpds_14_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Consultahisrag_wpds_15_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Consultahisrag_wpds_16_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV75Consultahisrag_wpds_17_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV76Consultahisrag_wpds_18_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultahisrag_wpds_19_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV78Consultahisrag_wpds_20_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Consultahisrag_wpds_22_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV82Consultahisrag_wpds_24_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV84Consultahisrag_wpds_26_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Consultahisrag_wpds_27_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AN33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV64Consultahisrag_wpds_6_tfhreagrcod ,
                                          int AV65Consultahisrag_wpds_7_tfhreagrcod_to ,
                                          byte AV66Consultahisrag_wpds_8_tfhreagrreo ,
                                          byte AV67Consultahisrag_wpds_9_tfhreagrreo_to ,
                                          String AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                          String AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                          java.math.BigDecimal AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                          java.math.BigDecimal AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                          java.math.BigDecimal AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                          short AV74Consultahisrag_wpds_16_tfhreagrpie ,
                                          short AV75Consultahisrag_wpds_17_tfhreagrpie_to ,
                                          int AV76Consultahisrag_wpds_18_tfhreagrcli ,
                                          int AV77Consultahisrag_wpds_19_tfhreagrcli_to ,
                                          String AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                          String AV78Consultahisrag_wpds_20_tfhreagrser ,
                                          String AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                          String AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                          String AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                          String AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                          int AV84Consultahisrag_wpds_26_tfhreagrnumc ,
                                          int AV85Consultahisrag_wpds_27_tfhreagrnumc_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          int A4503HreAgrCli ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          String A396EmprCod ,
                                          String AV50EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV51HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV52HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV53HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV54Hrenumcie ,
                                          String AV59Consultahisrag_wpds_1_emprcod ,
                                          int AV60Consultahisrag_wpds_2_hrebarcod ,
                                          byte AV61Consultahisrag_wpds_3_hrebarreo ,
                                          String AV62Consultahisrag_wpds_4_hrebarpar ,
                                          byte AV63Consultahisrag_wpds_5_hrenumcie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrSer, HreAgrNumC, HreAgrCol, HreAgrDsc, HreAgrCli, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (0==AV64Consultahisrag_wpds_6_tfhreagrcod) )
      {
         addWhere(sWhereString, "(HreAgrCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Consultahisrag_wpds_7_tfhreagrcod_to) )
      {
         addWhere(sWhereString, "(HreAgrCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Consultahisrag_wpds_8_tfhreagrreo) )
      {
         addWhere(sWhereString, "(HreAgrReo >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Consultahisrag_wpds_9_tfhreagrreo_to) )
      {
         addWhere(sWhereString, "(HreAgrReo <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) && ( ! (GXutil.strcmp("", AV68Consultahisrag_wpds_10_tfhreagrpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrPar = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Consultahisrag_wpds_12_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Consultahisrag_wpds_13_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Consultahisrag_wpds_14_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Consultahisrag_wpds_15_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Consultahisrag_wpds_16_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV75Consultahisrag_wpds_17_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV76Consultahisrag_wpds_18_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultahisrag_wpds_19_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV78Consultahisrag_wpds_20_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Consultahisrag_wpds_22_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV82Consultahisrag_wpds_24_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV84Consultahisrag_wpds_26_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Consultahisrag_wpds_27_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AN34( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV64Consultahisrag_wpds_6_tfhreagrcod ,
                                          int AV65Consultahisrag_wpds_7_tfhreagrcod_to ,
                                          byte AV66Consultahisrag_wpds_8_tfhreagrreo ,
                                          byte AV67Consultahisrag_wpds_9_tfhreagrreo_to ,
                                          String AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                          String AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                          java.math.BigDecimal AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                          java.math.BigDecimal AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                          java.math.BigDecimal AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                          short AV74Consultahisrag_wpds_16_tfhreagrpie ,
                                          short AV75Consultahisrag_wpds_17_tfhreagrpie_to ,
                                          int AV76Consultahisrag_wpds_18_tfhreagrcli ,
                                          int AV77Consultahisrag_wpds_19_tfhreagrcli_to ,
                                          String AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                          String AV78Consultahisrag_wpds_20_tfhreagrser ,
                                          String AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                          String AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                          String AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                          String AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                          int AV84Consultahisrag_wpds_26_tfhreagrnumc ,
                                          int AV85Consultahisrag_wpds_27_tfhreagrnumc_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          int A4503HreAgrCli ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          String A396EmprCod ,
                                          String AV50EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV51HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV52HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV53HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV54Hrenumcie ,
                                          String AV59Consultahisrag_wpds_1_emprcod ,
                                          int AV60Consultahisrag_wpds_2_hrebarcod ,
                                          byte AV61Consultahisrag_wpds_3_hrebarreo ,
                                          String AV62Consultahisrag_wpds_4_hrebarpar ,
                                          byte AV63Consultahisrag_wpds_5_hrenumcie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrDsc, HreAgrNumC, HreAgrCol, HreAgrSer, HreAgrCli, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (0==AV64Consultahisrag_wpds_6_tfhreagrcod) )
      {
         addWhere(sWhereString, "(HreAgrCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Consultahisrag_wpds_7_tfhreagrcod_to) )
      {
         addWhere(sWhereString, "(HreAgrCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Consultahisrag_wpds_8_tfhreagrreo) )
      {
         addWhere(sWhereString, "(HreAgrReo >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Consultahisrag_wpds_9_tfhreagrreo_to) )
      {
         addWhere(sWhereString, "(HreAgrReo <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) && ( ! (GXutil.strcmp("", AV68Consultahisrag_wpds_10_tfhreagrpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrPar = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Consultahisrag_wpds_12_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Consultahisrag_wpds_13_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Consultahisrag_wpds_14_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Consultahisrag_wpds_15_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Consultahisrag_wpds_16_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV75Consultahisrag_wpds_17_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV76Consultahisrag_wpds_18_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultahisrag_wpds_19_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV78Consultahisrag_wpds_20_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Consultahisrag_wpds_22_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV82Consultahisrag_wpds_24_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV84Consultahisrag_wpds_26_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Consultahisrag_wpds_27_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AN35( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV64Consultahisrag_wpds_6_tfhreagrcod ,
                                          int AV65Consultahisrag_wpds_7_tfhreagrcod_to ,
                                          byte AV66Consultahisrag_wpds_8_tfhreagrreo ,
                                          byte AV67Consultahisrag_wpds_9_tfhreagrreo_to ,
                                          String AV69Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                          String AV68Consultahisrag_wpds_10_tfhreagrpar ,
                                          java.math.BigDecimal AV70Consultahisrag_wpds_12_tfhreagrkgm ,
                                          java.math.BigDecimal AV71Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV72Consultahisrag_wpds_14_tfhreagrmtr ,
                                          java.math.BigDecimal AV73Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                          short AV74Consultahisrag_wpds_16_tfhreagrpie ,
                                          short AV75Consultahisrag_wpds_17_tfhreagrpie_to ,
                                          int AV76Consultahisrag_wpds_18_tfhreagrcli ,
                                          int AV77Consultahisrag_wpds_19_tfhreagrcli_to ,
                                          String AV79Consultahisrag_wpds_21_tfhreagrser_sel ,
                                          String AV78Consultahisrag_wpds_20_tfhreagrser ,
                                          String AV81Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                          String AV80Consultahisrag_wpds_22_tfhreagrdsc ,
                                          String AV83Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                          String AV82Consultahisrag_wpds_24_tfhreagrcol ,
                                          int AV84Consultahisrag_wpds_26_tfhreagrnumc ,
                                          int AV85Consultahisrag_wpds_27_tfhreagrnumc_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          int A4503HreAgrCli ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          String A396EmprCod ,
                                          String AV50EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV51HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV52HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV53HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV54Hrenumcie ,
                                          String AV59Consultahisrag_wpds_1_emprcod ,
                                          int AV60Consultahisrag_wpds_2_hrebarcod ,
                                          byte AV61Consultahisrag_wpds_3_hrebarreo ,
                                          String AV62Consultahisrag_wpds_4_hrebarpar ,
                                          byte AV63Consultahisrag_wpds_5_hrenumcie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCol, HreAgrNumC, HreAgrDsc, HreAgrSer, HreAgrCli, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (0==AV64Consultahisrag_wpds_6_tfhreagrcod) )
      {
         addWhere(sWhereString, "(HreAgrCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Consultahisrag_wpds_7_tfhreagrcod_to) )
      {
         addWhere(sWhereString, "(HreAgrCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Consultahisrag_wpds_8_tfhreagrreo) )
      {
         addWhere(sWhereString, "(HreAgrReo >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Consultahisrag_wpds_9_tfhreagrreo_to) )
      {
         addWhere(sWhereString, "(HreAgrReo <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) && ( ! (GXutil.strcmp("", AV68Consultahisrag_wpds_10_tfhreagrpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Consultahisrag_wpds_11_tfhreagrpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrPar = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Consultahisrag_wpds_12_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Consultahisrag_wpds_13_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Consultahisrag_wpds_14_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Consultahisrag_wpds_15_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Consultahisrag_wpds_16_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV75Consultahisrag_wpds_17_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV76Consultahisrag_wpds_18_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultahisrag_wpds_19_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV78Consultahisrag_wpds_20_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Consultahisrag_wpds_21_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Consultahisrag_wpds_22_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV82Consultahisrag_wpds_24_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Consultahisrag_wpds_25_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV84Consultahisrag_wpds_26_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Consultahisrag_wpds_27_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCol" ;
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
                  return conditional_P0AN32(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() );
            case 1 :
                  return conditional_P0AN33(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() );
            case 2 :
                  return conditional_P0AN34(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() );
            case 3 :
                  return conditional_P0AN35(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AN32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AN33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AN34", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AN35", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
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
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
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
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
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
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
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
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
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
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
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
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
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
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
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
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
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
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
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
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
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
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
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
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               return;
      }
   }

}

