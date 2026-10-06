package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoderecetas_agrupaciontinte_wpgetfilterdata extends GXProcedure
{
   public historicoderecetas_agrupaciontinte_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_agrupaciontinte_wpgetfilterdata.class ), "" );
   }

   public historicoderecetas_agrupaciontinte_wpgetfilterdata( int remoteHandle ,
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
      historicoderecetas_agrupaciontinte_wpgetfilterdata.this.aP5 = new String[] {""};
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
      historicoderecetas_agrupaciontinte_wpgetfilterdata.this.AV34DDOName = aP0;
      historicoderecetas_agrupaciontinte_wpgetfilterdata.this.AV32SearchTxt = aP1;
      historicoderecetas_agrupaciontinte_wpgetfilterdata.this.AV33SearchTxtTo = aP2;
      historicoderecetas_agrupaciontinte_wpgetfilterdata.this.aP3 = aP3;
      historicoderecetas_agrupaciontinte_wpgetfilterdata.this.aP4 = aP4;
      historicoderecetas_agrupaciontinte_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREAGRNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADHREAGRNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREAGRSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREAGRDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREAGRCOL") == 0 )
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
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("HistoricodeRecetas_AgrupacionTinte_WPGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_AgrupacionTinte_WPGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("HistoricodeRecetas_AgrupacionTinte_WPGridState"), null, null);
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNHDR") == 0 )
         {
            AV58TFHreAgrNHdr = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNHDR_SEL") == 0 )
         {
            AV59TFHreAgrNHdr_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER") == 0 )
         {
            AV22TFHreAgrSer = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER_SEL") == 0 )
         {
            AV23TFHreAgrSer_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC") == 0 )
         {
            AV24TFHreAgrDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC_SEL") == 0 )
         {
            AV25TFHreAgrDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL") == 0 )
         {
            AV26TFHreAgrCol = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL_SEL") == 0 )
         {
            AV27TFHreAgrCol_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNUMC") == 0 )
         {
            AV28TFHreAgrNumC = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFHreAgrNumC_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCLI") == 0 )
         {
            AV30TFHreAgrCli = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFHreAgrCli_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRKGM") == 0 )
         {
            AV16TFHreAgrKgm = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFHreAgrKgm_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRMTR") == 0 )
         {
            AV18TFHreAgrMtr = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFHreAgrMtr_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPIE") == 0 )
         {
            AV20TFHreAgrPie = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFHreAgrPie_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV53Emprcod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV54HreBarCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV55HreBarReo = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV56HreBarpar = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV57HreNumCie = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREAGRNHDROPTIONS' Routine */
      returnInSub = false ;
      AV58TFHreAgrNHdr = AV32SearchTxt ;
      AV59TFHreAgrNHdr_Sel = "" ;
      AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV50FilterFullText ;
      AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV58TFHreAgrNHdr ;
      AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV59TFHreAgrNHdr_Sel ;
      AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV22TFHreAgrSer ;
      AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV23TFHreAgrSer_Sel ;
      AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV24TFHreAgrDsc ;
      AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV25TFHreAgrDsc_Sel ;
      AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV26TFHreAgrCol ;
      AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV27TFHreAgrCol_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV28TFHreAgrNumC ;
      AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV29TFHreAgrNumC_To ;
      AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV30TFHreAgrCli ;
      AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV31TFHreAgrCli_To ;
      AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV20TFHreAgrPie ;
      AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                           AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                           AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                           AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                           AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                           AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                           AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                           AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                           AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) ,
                                           Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) ,
                                           Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) ,
                                           AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                           AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                           AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                           AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                           Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) ,
                                           Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           AV53Emprcod ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           AV56HreBarpar ,
                                           Byte.valueOf(AV57HreNumCie) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr), 11, "%") ;
      lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser), 16, "%") ;
      lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc), 26, "%") ;
      lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol), 13, "%") ;
      /* Using cursor P09A72 */
      pr_default.execute(0, new Object[] {AV53Emprcod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarpar, Byte.valueOf(AV57HreNumCie), lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr, AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel, lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser, AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel, lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc, AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel, lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol, AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel, Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc), Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to), Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli), Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to), AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to, Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie), Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4495HreNumCie = P09A72_A4495HreNumCie[0] ;
         A4494HreBarPar = P09A72_A4494HreBarPar[0] ;
         A4493HreBarReo = P09A72_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A72_A4492HreBarCod[0] ;
         A396EmprCod = P09A72_A396EmprCod[0] ;
         A4502HreAgrPie = P09A72_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P09A72_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P09A72_A4500HreAgrKgm[0] ;
         A4503HreAgrCli = P09A72_A4503HreAgrCli[0] ;
         A4507HreAgrNumC = P09A72_A4507HreAgrNumC[0] ;
         A4506HreAgrCol = P09A72_A4506HreAgrCol[0] ;
         A4505HreAgrDsc = P09A72_A4505HreAgrDsc[0] ;
         A4504HreAgrSer = P09A72_A4504HreAgrSer[0] ;
         A4499HreAgrPar = P09A72_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P09A72_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P09A72_A4497HreAgrCod[0] ;
         A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
         if ( ! (GXutil.strcmp("", A13894HreAgrNHdr)==0) )
         {
            AV36Option = A13894HreAgrNHdr ;
            AV35InsertIndex = 1 ;
            while ( ( AV35InsertIndex <= AV37Options.size() ) && ( GXutil.strcmp((String)AV37Options.elementAt(-1+AV35InsertIndex), AV36Option) < 0 ) )
            {
               AV35InsertIndex = (int)(AV35InsertIndex+1) ;
            }
            if ( ( AV35InsertIndex <= AV37Options.size() ) && ( GXutil.strcmp((String)AV37Options.elementAt(-1+AV35InsertIndex), AV36Option) == 0 ) )
            {
               AV44count = GXutil.lval( (String)AV42OptionIndexes.elementAt(-1+AV35InsertIndex)) ;
               AV44count = (long)(AV44count+1) ;
               AV42OptionIndexes.removeItem(AV35InsertIndex);
               AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV35InsertIndex);
            }
            else
            {
               AV37Options.add(AV36Option, AV35InsertIndex);
               AV42OptionIndexes.add("1", AV35InsertIndex);
            }
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREAGRSEROPTIONS' Routine */
      returnInSub = false ;
      AV22TFHreAgrSer = AV32SearchTxt ;
      AV23TFHreAgrSer_Sel = "" ;
      AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV50FilterFullText ;
      AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV58TFHreAgrNHdr ;
      AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV59TFHreAgrNHdr_Sel ;
      AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV22TFHreAgrSer ;
      AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV23TFHreAgrSer_Sel ;
      AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV24TFHreAgrDsc ;
      AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV25TFHreAgrDsc_Sel ;
      AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV26TFHreAgrCol ;
      AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV27TFHreAgrCol_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV28TFHreAgrNumC ;
      AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV29TFHreAgrNumC_To ;
      AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV30TFHreAgrCli ;
      AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV31TFHreAgrCli_To ;
      AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV20TFHreAgrPie ;
      AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                           AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                           AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                           AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                           AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                           AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                           AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                           AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                           AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) ,
                                           Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) ,
                                           Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) ,
                                           AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                           AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                           AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                           AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                           Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) ,
                                           Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV56HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV57HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr), 11, "%") ;
      lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser), 16, "%") ;
      lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc), 26, "%") ;
      lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol), 13, "%") ;
      /* Using cursor P09A73 */
      pr_default.execute(1, new Object[] {AV53Emprcod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarpar, Byte.valueOf(AV57HreNumCie), lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr, AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel, lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser, AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel, lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc, AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel, lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol, AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel, Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc), Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to), Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli), Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to), AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to, Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie), Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9A73 = false ;
         A396EmprCod = P09A73_A396EmprCod[0] ;
         A4492HreBarCod = P09A73_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A73_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A73_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A73_A4495HreNumCie[0] ;
         A4504HreAgrSer = P09A73_A4504HreAgrSer[0] ;
         A4502HreAgrPie = P09A73_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P09A73_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P09A73_A4500HreAgrKgm[0] ;
         A4503HreAgrCli = P09A73_A4503HreAgrCli[0] ;
         A4507HreAgrNumC = P09A73_A4507HreAgrNumC[0] ;
         A4506HreAgrCol = P09A73_A4506HreAgrCol[0] ;
         A4505HreAgrDsc = P09A73_A4505HreAgrDsc[0] ;
         A4499HreAgrPar = P09A73_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P09A73_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P09A73_A4497HreAgrCod[0] ;
         A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09A73_A4504HreAgrSer[0], A4504HreAgrSer) == 0 ) )
         {
            brk9A73 = false ;
            A396EmprCod = P09A73_A396EmprCod[0] ;
            A4492HreBarCod = P09A73_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A73_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A73_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A73_A4495HreNumCie[0] ;
            A4499HreAgrPar = P09A73_A4499HreAgrPar[0] ;
            A4498HreAgrReo = P09A73_A4498HreAgrReo[0] ;
            A4497HreAgrCod = P09A73_A4497HreAgrCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9A73 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4504HreAgrSer)==0) )
         {
            AV36Option = A4504HreAgrSer ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A73 )
         {
            brk9A73 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHREAGRDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFHreAgrDsc = AV32SearchTxt ;
      AV25TFHreAgrDsc_Sel = "" ;
      AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV50FilterFullText ;
      AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV58TFHreAgrNHdr ;
      AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV59TFHreAgrNHdr_Sel ;
      AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV22TFHreAgrSer ;
      AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV23TFHreAgrSer_Sel ;
      AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV24TFHreAgrDsc ;
      AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV25TFHreAgrDsc_Sel ;
      AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV26TFHreAgrCol ;
      AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV27TFHreAgrCol_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV28TFHreAgrNumC ;
      AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV29TFHreAgrNumC_To ;
      AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV30TFHreAgrCli ;
      AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV31TFHreAgrCli_To ;
      AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV20TFHreAgrPie ;
      AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                           AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                           AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                           AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                           AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                           AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                           AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                           AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                           AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) ,
                                           Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) ,
                                           Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) ,
                                           AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                           AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                           AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                           AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                           Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) ,
                                           Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV56HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV57HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr), 11, "%") ;
      lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser), 16, "%") ;
      lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc), 26, "%") ;
      lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol), 13, "%") ;
      /* Using cursor P09A74 */
      pr_default.execute(2, new Object[] {AV53Emprcod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarpar, Byte.valueOf(AV57HreNumCie), lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr, AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel, lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser, AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel, lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc, AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel, lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol, AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel, Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc), Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to), Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli), Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to), AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to, Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie), Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9A75 = false ;
         A396EmprCod = P09A74_A396EmprCod[0] ;
         A4492HreBarCod = P09A74_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A74_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A74_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A74_A4495HreNumCie[0] ;
         A4505HreAgrDsc = P09A74_A4505HreAgrDsc[0] ;
         A4502HreAgrPie = P09A74_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P09A74_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P09A74_A4500HreAgrKgm[0] ;
         A4503HreAgrCli = P09A74_A4503HreAgrCli[0] ;
         A4507HreAgrNumC = P09A74_A4507HreAgrNumC[0] ;
         A4506HreAgrCol = P09A74_A4506HreAgrCol[0] ;
         A4504HreAgrSer = P09A74_A4504HreAgrSer[0] ;
         A4499HreAgrPar = P09A74_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P09A74_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P09A74_A4497HreAgrCod[0] ;
         A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09A74_A4505HreAgrDsc[0], A4505HreAgrDsc) == 0 ) )
         {
            brk9A75 = false ;
            A396EmprCod = P09A74_A396EmprCod[0] ;
            A4492HreBarCod = P09A74_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A74_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A74_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A74_A4495HreNumCie[0] ;
            A4499HreAgrPar = P09A74_A4499HreAgrPar[0] ;
            A4498HreAgrReo = P09A74_A4498HreAgrReo[0] ;
            A4497HreAgrCod = P09A74_A4497HreAgrCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9A75 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4505HreAgrDsc)==0) )
         {
            AV36Option = A4505HreAgrDsc ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A75 )
         {
            brk9A75 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHREAGRCOLOPTIONS' Routine */
      returnInSub = false ;
      AV26TFHreAgrCol = AV32SearchTxt ;
      AV27TFHreAgrCol_Sel = "" ;
      AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV50FilterFullText ;
      AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV58TFHreAgrNHdr ;
      AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV59TFHreAgrNHdr_Sel ;
      AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV22TFHreAgrSer ;
      AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV23TFHreAgrSer_Sel ;
      AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV24TFHreAgrDsc ;
      AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV25TFHreAgrDsc_Sel ;
      AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV26TFHreAgrCol ;
      AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV27TFHreAgrCol_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV28TFHreAgrNumC ;
      AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV29TFHreAgrNumC_To ;
      AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV30TFHreAgrCli ;
      AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV31TFHreAgrCli_To ;
      AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV16TFHreAgrKgm ;
      AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV17TFHreAgrKgm_To ;
      AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV18TFHreAgrMtr ;
      AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV19TFHreAgrMtr_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV20TFHreAgrPie ;
      AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV21TFHreAgrPie_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                           AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                           AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                           AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                           AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                           AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                           AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                           AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                           AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) ,
                                           Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) ,
                                           Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) ,
                                           AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                           AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                           AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                           AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                           Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) ,
                                           Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV56HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV57HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr), 11, "%") ;
      lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser), 16, "%") ;
      lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc), 26, "%") ;
      lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol), 13, "%") ;
      /* Using cursor P09A75 */
      pr_default.execute(3, new Object[] {AV53Emprcod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarpar, Byte.valueOf(AV57HreNumCie), lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr, AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel, lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser, AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel, lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc, AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel, lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol, AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel, Integer.valueOf(AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc), Integer.valueOf(AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to), Integer.valueOf(AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli), Integer.valueOf(AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to), AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to, Short.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie), Short.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9A77 = false ;
         A396EmprCod = P09A75_A396EmprCod[0] ;
         A4492HreBarCod = P09A75_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A75_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A75_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A75_A4495HreNumCie[0] ;
         A4506HreAgrCol = P09A75_A4506HreAgrCol[0] ;
         A4502HreAgrPie = P09A75_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = P09A75_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = P09A75_A4500HreAgrKgm[0] ;
         A4503HreAgrCli = P09A75_A4503HreAgrCli[0] ;
         A4507HreAgrNumC = P09A75_A4507HreAgrNumC[0] ;
         A4505HreAgrDsc = P09A75_A4505HreAgrDsc[0] ;
         A4504HreAgrSer = P09A75_A4504HreAgrSer[0] ;
         A4499HreAgrPar = P09A75_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P09A75_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P09A75_A4497HreAgrCod[0] ;
         A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09A75_A4506HreAgrCol[0], A4506HreAgrCol) == 0 ) )
         {
            brk9A77 = false ;
            A396EmprCod = P09A75_A396EmprCod[0] ;
            A4492HreBarCod = P09A75_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A75_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A75_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A75_A4495HreNumCie[0] ;
            A4499HreAgrPar = P09A75_A4499HreAgrPar[0] ;
            A4498HreAgrReo = P09A75_A4498HreAgrReo[0] ;
            A4497HreAgrCod = P09A75_A4497HreAgrCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9A77 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4506HreAgrCol)==0) )
         {
            AV36Option = A4506HreAgrCol ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A77 )
         {
            brk9A77 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = historicoderecetas_agrupaciontinte_wpgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = historicoderecetas_agrupaciontinte_wpgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = historicoderecetas_agrupaciontinte_wpgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV58TFHreAgrNHdr = "" ;
      AV59TFHreAgrNHdr_Sel = "" ;
      AV22TFHreAgrSer = "" ;
      AV23TFHreAgrSer_Sel = "" ;
      AV24TFHreAgrDsc = "" ;
      AV25TFHreAgrDsc_Sel = "" ;
      AV26TFHreAgrCol = "" ;
      AV27TFHreAgrCol_Sel = "" ;
      AV16TFHreAgrKgm = DecimalUtil.ZERO ;
      AV17TFHreAgrKgm_To = DecimalUtil.ZERO ;
      AV18TFHreAgrMtr = DecimalUtil.ZERO ;
      AV19TFHreAgrMtr_To = DecimalUtil.ZERO ;
      AV53Emprcod = "" ;
      AV56HreBarpar = "" ;
      A13894HreAgrNHdr = "" ;
      AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = "" ;
      AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = "" ;
      AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = "" ;
      AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = "" ;
      AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = "" ;
      AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = "" ;
      AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = "" ;
      AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = "" ;
      AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = "" ;
      AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = DecimalUtil.ZERO ;
      AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = DecimalUtil.ZERO ;
      AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = DecimalUtil.ZERO ;
      AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = "" ;
      lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = "" ;
      lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = "" ;
      lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = "" ;
      lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = "" ;
      A4499HreAgrPar = "" ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A72_A4495HreNumCie = new byte[1] ;
      P09A72_A4494HreBarPar = new String[] {""} ;
      P09A72_A4493HreBarReo = new byte[1] ;
      P09A72_A4492HreBarCod = new int[1] ;
      P09A72_A396EmprCod = new String[] {""} ;
      P09A72_A4502HreAgrPie = new short[1] ;
      P09A72_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A72_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A72_A4503HreAgrCli = new int[1] ;
      P09A72_A4507HreAgrNumC = new int[1] ;
      P09A72_A4506HreAgrCol = new String[] {""} ;
      P09A72_A4505HreAgrDsc = new String[] {""} ;
      P09A72_A4504HreAgrSer = new String[] {""} ;
      P09A72_A4499HreAgrPar = new String[] {""} ;
      P09A72_A4498HreAgrReo = new byte[1] ;
      P09A72_A4497HreAgrCod = new int[1] ;
      AV36Option = "" ;
      P09A73_A396EmprCod = new String[] {""} ;
      P09A73_A4492HreBarCod = new int[1] ;
      P09A73_A4493HreBarReo = new byte[1] ;
      P09A73_A4494HreBarPar = new String[] {""} ;
      P09A73_A4495HreNumCie = new byte[1] ;
      P09A73_A4504HreAgrSer = new String[] {""} ;
      P09A73_A4502HreAgrPie = new short[1] ;
      P09A73_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A73_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A73_A4503HreAgrCli = new int[1] ;
      P09A73_A4507HreAgrNumC = new int[1] ;
      P09A73_A4506HreAgrCol = new String[] {""} ;
      P09A73_A4505HreAgrDsc = new String[] {""} ;
      P09A73_A4499HreAgrPar = new String[] {""} ;
      P09A73_A4498HreAgrReo = new byte[1] ;
      P09A73_A4497HreAgrCod = new int[1] ;
      P09A74_A396EmprCod = new String[] {""} ;
      P09A74_A4492HreBarCod = new int[1] ;
      P09A74_A4493HreBarReo = new byte[1] ;
      P09A74_A4494HreBarPar = new String[] {""} ;
      P09A74_A4495HreNumCie = new byte[1] ;
      P09A74_A4505HreAgrDsc = new String[] {""} ;
      P09A74_A4502HreAgrPie = new short[1] ;
      P09A74_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A74_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A74_A4503HreAgrCli = new int[1] ;
      P09A74_A4507HreAgrNumC = new int[1] ;
      P09A74_A4506HreAgrCol = new String[] {""} ;
      P09A74_A4504HreAgrSer = new String[] {""} ;
      P09A74_A4499HreAgrPar = new String[] {""} ;
      P09A74_A4498HreAgrReo = new byte[1] ;
      P09A74_A4497HreAgrCod = new int[1] ;
      P09A75_A396EmprCod = new String[] {""} ;
      P09A75_A4492HreBarCod = new int[1] ;
      P09A75_A4493HreBarReo = new byte[1] ;
      P09A75_A4494HreBarPar = new String[] {""} ;
      P09A75_A4495HreNumCie = new byte[1] ;
      P09A75_A4506HreAgrCol = new String[] {""} ;
      P09A75_A4502HreAgrPie = new short[1] ;
      P09A75_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A75_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A75_A4503HreAgrCli = new int[1] ;
      P09A75_A4507HreAgrNumC = new int[1] ;
      P09A75_A4505HreAgrDsc = new String[] {""} ;
      P09A75_A4504HreAgrSer = new String[] {""} ;
      P09A75_A4499HreAgrPar = new String[] {""} ;
      P09A75_A4498HreAgrReo = new byte[1] ;
      P09A75_A4497HreAgrCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_agrupaciontinte_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09A72_A4495HreNumCie, P09A72_A4494HreBarPar, P09A72_A4493HreBarReo, P09A72_A4492HreBarCod, P09A72_A396EmprCod, P09A72_A4502HreAgrPie, P09A72_A4501HreAgrMtr, P09A72_A4500HreAgrKgm, P09A72_A4503HreAgrCli, P09A72_A4507HreAgrNumC,
            P09A72_A4506HreAgrCol, P09A72_A4505HreAgrDsc, P09A72_A4504HreAgrSer, P09A72_A4499HreAgrPar, P09A72_A4498HreAgrReo, P09A72_A4497HreAgrCod
            }
            , new Object[] {
            P09A73_A396EmprCod, P09A73_A4492HreBarCod, P09A73_A4493HreBarReo, P09A73_A4494HreBarPar, P09A73_A4495HreNumCie, P09A73_A4504HreAgrSer, P09A73_A4502HreAgrPie, P09A73_A4501HreAgrMtr, P09A73_A4500HreAgrKgm, P09A73_A4503HreAgrCli,
            P09A73_A4507HreAgrNumC, P09A73_A4506HreAgrCol, P09A73_A4505HreAgrDsc, P09A73_A4499HreAgrPar, P09A73_A4498HreAgrReo, P09A73_A4497HreAgrCod
            }
            , new Object[] {
            P09A74_A396EmprCod, P09A74_A4492HreBarCod, P09A74_A4493HreBarReo, P09A74_A4494HreBarPar, P09A74_A4495HreNumCie, P09A74_A4505HreAgrDsc, P09A74_A4502HreAgrPie, P09A74_A4501HreAgrMtr, P09A74_A4500HreAgrKgm, P09A74_A4503HreAgrCli,
            P09A74_A4507HreAgrNumC, P09A74_A4506HreAgrCol, P09A74_A4504HreAgrSer, P09A74_A4499HreAgrPar, P09A74_A4498HreAgrReo, P09A74_A4497HreAgrCod
            }
            , new Object[] {
            P09A75_A396EmprCod, P09A75_A4492HreBarCod, P09A75_A4493HreBarReo, P09A75_A4494HreBarPar, P09A75_A4495HreNumCie, P09A75_A4506HreAgrCol, P09A75_A4502HreAgrPie, P09A75_A4501HreAgrMtr, P09A75_A4500HreAgrKgm, P09A75_A4503HreAgrCli,
            P09A75_A4507HreAgrNumC, P09A75_A4505HreAgrDsc, P09A75_A4504HreAgrSer, P09A75_A4499HreAgrPar, P09A75_A4498HreAgrReo, P09A75_A4497HreAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55HreBarReo ;
   private byte AV57HreNumCie ;
   private byte A4498HreAgrReo ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV20TFHreAgrPie ;
   private short AV21TFHreAgrPie_To ;
   private short AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ;
   private short AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ;
   private short A4502HreAgrPie ;
   private short Gx_err ;
   private int AV62GXV1 ;
   private int AV28TFHreAgrNumC ;
   private int AV29TFHreAgrNumC_To ;
   private int AV30TFHreAgrCli ;
   private int AV31TFHreAgrCli_To ;
   private int AV54HreBarCod ;
   private int AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ;
   private int AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ;
   private int AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ;
   private int AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ;
   private int A4497HreAgrCod ;
   private int A4507HreAgrNumC ;
   private int A4503HreAgrCli ;
   private int A4492HreBarCod ;
   private int AV35InsertIndex ;
   private long AV44count ;
   private java.math.BigDecimal AV16TFHreAgrKgm ;
   private java.math.BigDecimal AV17TFHreAgrKgm_To ;
   private java.math.BigDecimal AV18TFHreAgrMtr ;
   private java.math.BigDecimal AV19TFHreAgrMtr_To ;
   private java.math.BigDecimal AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ;
   private java.math.BigDecimal AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ;
   private java.math.BigDecimal AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ;
   private java.math.BigDecimal AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private String AV58TFHreAgrNHdr ;
   private String AV59TFHreAgrNHdr_Sel ;
   private String AV22TFHreAgrSer ;
   private String AV23TFHreAgrSer_Sel ;
   private String AV24TFHreAgrDsc ;
   private String AV25TFHreAgrDsc_Sel ;
   private String AV26TFHreAgrCol ;
   private String AV27TFHreAgrCol_Sel ;
   private String AV53Emprcod ;
   private String AV56HreBarpar ;
   private String A13894HreAgrNHdr ;
   private String AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ;
   private String AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ;
   private String AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ;
   private String AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ;
   private String AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ;
   private String AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ;
   private String AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ;
   private String AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ;
   private String scmdbuf ;
   private String lV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ;
   private String lV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ;
   private String lV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ;
   private String lV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ;
   private String A4499HreAgrPar ;
   private String A4504HreAgrSer ;
   private String A4505HreAgrDsc ;
   private String A4506HreAgrCol ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brk9A73 ;
   private boolean brk9A75 ;
   private boolean brk9A77 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ;
   private String lV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ;
   private String AV36Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09A72_A4495HreNumCie ;
   private String[] P09A72_A4494HreBarPar ;
   private byte[] P09A72_A4493HreBarReo ;
   private int[] P09A72_A4492HreBarCod ;
   private String[] P09A72_A396EmprCod ;
   private short[] P09A72_A4502HreAgrPie ;
   private java.math.BigDecimal[] P09A72_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P09A72_A4500HreAgrKgm ;
   private int[] P09A72_A4503HreAgrCli ;
   private int[] P09A72_A4507HreAgrNumC ;
   private String[] P09A72_A4506HreAgrCol ;
   private String[] P09A72_A4505HreAgrDsc ;
   private String[] P09A72_A4504HreAgrSer ;
   private String[] P09A72_A4499HreAgrPar ;
   private byte[] P09A72_A4498HreAgrReo ;
   private int[] P09A72_A4497HreAgrCod ;
   private String[] P09A73_A396EmprCod ;
   private int[] P09A73_A4492HreBarCod ;
   private byte[] P09A73_A4493HreBarReo ;
   private String[] P09A73_A4494HreBarPar ;
   private byte[] P09A73_A4495HreNumCie ;
   private String[] P09A73_A4504HreAgrSer ;
   private short[] P09A73_A4502HreAgrPie ;
   private java.math.BigDecimal[] P09A73_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P09A73_A4500HreAgrKgm ;
   private int[] P09A73_A4503HreAgrCli ;
   private int[] P09A73_A4507HreAgrNumC ;
   private String[] P09A73_A4506HreAgrCol ;
   private String[] P09A73_A4505HreAgrDsc ;
   private String[] P09A73_A4499HreAgrPar ;
   private byte[] P09A73_A4498HreAgrReo ;
   private int[] P09A73_A4497HreAgrCod ;
   private String[] P09A74_A396EmprCod ;
   private int[] P09A74_A4492HreBarCod ;
   private byte[] P09A74_A4493HreBarReo ;
   private String[] P09A74_A4494HreBarPar ;
   private byte[] P09A74_A4495HreNumCie ;
   private String[] P09A74_A4505HreAgrDsc ;
   private short[] P09A74_A4502HreAgrPie ;
   private java.math.BigDecimal[] P09A74_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P09A74_A4500HreAgrKgm ;
   private int[] P09A74_A4503HreAgrCli ;
   private int[] P09A74_A4507HreAgrNumC ;
   private String[] P09A74_A4506HreAgrCol ;
   private String[] P09A74_A4504HreAgrSer ;
   private String[] P09A74_A4499HreAgrPar ;
   private byte[] P09A74_A4498HreAgrReo ;
   private int[] P09A74_A4497HreAgrCod ;
   private String[] P09A75_A396EmprCod ;
   private int[] P09A75_A4492HreBarCod ;
   private byte[] P09A75_A4493HreBarReo ;
   private String[] P09A75_A4494HreBarPar ;
   private byte[] P09A75_A4495HreNumCie ;
   private String[] P09A75_A4506HreAgrCol ;
   private short[] P09A75_A4502HreAgrPie ;
   private java.math.BigDecimal[] P09A75_A4501HreAgrMtr ;
   private java.math.BigDecimal[] P09A75_A4500HreAgrKgm ;
   private int[] P09A75_A4503HreAgrCli ;
   private int[] P09A75_A4507HreAgrNumC ;
   private String[] P09A75_A4505HreAgrDsc ;
   private String[] P09A75_A4504HreAgrSer ;
   private String[] P09A75_A4499HreAgrPar ;
   private byte[] P09A75_A4498HreAgrReo ;
   private int[] P09A75_A4497HreAgrCod ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class historicoderecetas_agrupaciontinte_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                          String AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                          String AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                          String AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                          String AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                          String AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                          String AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                          String AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                          String AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                          int AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ,
                                          int AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ,
                                          int AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ,
                                          int AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                          java.math.BigDecimal AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                          short AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ,
                                          short AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          int A4503HreAgrCli ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          String AV53Emprcod ,
                                          int AV54HreBarCod ,
                                          byte AV55HreBarReo ,
                                          String AV56HreBarpar ,
                                          byte AV57HreNumCie ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrCli, HreAgrNumC, HreAgrCol, HreAgrDsc, HreAgrSer, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?)) or ( UPPER(HreAgrSer) like '%' || UPPER(?)) or ( UPPER(HreAgrDsc) like '%' || UPPER(?)) or ( UPPER(HreAgrCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAgrNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrPie,'9990'), 2) like '%' || ?))");
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
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09A73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                          String AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                          String AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                          String AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                          String AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                          String AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                          String AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                          String AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                          String AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                          int AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ,
                                          int AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ,
                                          int AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ,
                                          int AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                          java.math.BigDecimal AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                          short AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ,
                                          short AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          int A4503HreAgrCli ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV54HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV55HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV56HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV57HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrSer, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrCli, HreAgrNumC, HreAgrCol, HreAgrDsc, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?)) or ( UPPER(HreAgrSer) like '%' || UPPER(?)) or ( UPPER(HreAgrDsc) like '%' || UPPER(?)) or ( UPPER(HreAgrCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAgrNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrPie,'9990'), 2) like '%' || ?))");
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
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreAgrSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09A74( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                          String AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                          String AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                          String AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                          String AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                          String AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                          String AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                          String AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                          String AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                          int AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ,
                                          int AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ,
                                          int AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ,
                                          int AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                          java.math.BigDecimal AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                          short AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ,
                                          short AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          int A4503HreAgrCli ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV54HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV55HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV56HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV57HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrDsc, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrCli, HreAgrNumC, HreAgrCol, HreAgrSer, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?)) or ( UPPER(HreAgrSer) like '%' || UPPER(?)) or ( UPPER(HreAgrDsc) like '%' || UPPER(?)) or ( UPPER(HreAgrCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAgrNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrPie,'9990'), 2) like '%' || ?))");
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
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreAgrDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09A75( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                          String AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                          String AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                          String AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                          String AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                          String AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                          String AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                          String AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                          String AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                          int AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ,
                                          int AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ,
                                          int AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ,
                                          int AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                          java.math.BigDecimal AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                          short AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ,
                                          short AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          int A4503HreAgrCli ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV54HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV55HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV56HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV57HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCol, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrCli, HreAgrNumC, HreAgrDsc, HreAgrSer, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?)) or ( UPPER(HreAgrSer) like '%' || UPPER(?)) or ( UPPER(HreAgrDsc) like '%' || UPPER(?)) or ( UPPER(HreAgrCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAgrNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrPie,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV75Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV82Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreAgrCol" ;
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
                  return conditional_P09A72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() );
            case 1 :
                  return conditional_P09A73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 2 :
                  return conditional_P09A74(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 3 :
                  return conditional_P09A75(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A74", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A75", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
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
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
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
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
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
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
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
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
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
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
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
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
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
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
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
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               return;
      }
   }

}

