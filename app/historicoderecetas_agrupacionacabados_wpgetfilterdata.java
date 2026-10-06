package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoderecetas_agrupacionacabados_wpgetfilterdata extends GXProcedure
{
   public historicoderecetas_agrupacionacabados_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_agrupacionacabados_wpgetfilterdata.class ), "" );
   }

   public historicoderecetas_agrupacionacabados_wpgetfilterdata( int remoteHandle ,
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
      historicoderecetas_agrupacionacabados_wpgetfilterdata.this.aP5 = new String[] {""};
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
      historicoderecetas_agrupacionacabados_wpgetfilterdata.this.AV34DDOName = aP0;
      historicoderecetas_agrupacionacabados_wpgetfilterdata.this.AV32SearchTxt = aP1;
      historicoderecetas_agrupacionacabados_wpgetfilterdata.this.AV33SearchTxtTo = aP2;
      historicoderecetas_agrupacionacabados_wpgetfilterdata.this.aP3 = aP3;
      historicoderecetas_agrupacionacabados_wpgetfilterdata.this.aP4 = aP4;
      historicoderecetas_agrupacionacabados_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREACNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADHREACNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREACSER") == 0 )
      {
         /* Execute user subroutine: 'LOADHREACSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREACDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHREACDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_HREACCOL") == 0 )
      {
         /* Execute user subroutine: 'LOADHREACCOLOPTIONS' */
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
      if ( GXutil.strcmp(AV45Session.getValue("HistoricodeRecetas_AgrupacionAcabados_WPGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_AgrupacionAcabados_WPGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("HistoricodeRecetas_AgrupacionAcabados_WPGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACNHDR") == 0 )
         {
            AV51TFHreAcNHdr = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACNHDR_SEL") == 0 )
         {
            AV52TFHreAcNHdr_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACSER") == 0 )
         {
            AV24TFHreAcSer = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACSER_SEL") == 0 )
         {
            AV25TFHreAcSer_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACDSC") == 0 )
         {
            AV26TFHreAcDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACDSC_SEL") == 0 )
         {
            AV27TFHreAcDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACCOL") == 0 )
         {
            AV28TFHreAcCol = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACCOL_SEL") == 0 )
         {
            AV29TFHreAcCol_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACNUMC") == 0 )
         {
            AV30TFHreAcNumC = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFHreAcNumC_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACCLI") == 0 )
         {
            AV22TFHreAcCli = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFHreAcCli_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACKGM") == 0 )
         {
            AV16TFHreAcKgm = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFHreAcKgm_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACMTR") == 0 )
         {
            AV18TFHreAcMtr = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFHreAcMtr_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACPIE") == 0 )
         {
            AV20TFHreAcPie = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFHreAcPie_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREACNHDROPTIONS' Routine */
      returnInSub = false ;
      AV51TFHreAcNHdr = AV32SearchTxt ;
      AV52TFHreAcNHdr_Sel = "" ;
      AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV50FilterFullText ;
      AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV24TFHreAcSer ;
      AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV25TFHreAcSer_Sel ;
      AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV26TFHreAcDsc ;
      AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV27TFHreAcDsc_Sel ;
      AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV28TFHreAcCol ;
      AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV29TFHreAcCol_Sel ;
      AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV30TFHreAcNumC ;
      AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV31TFHreAcNumC_To ;
      AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV22TFHreAcCli ;
      AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV23TFHreAcCli_To ;
      AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV16TFHreAcKgm ;
      AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV17TFHreAcKgm_To ;
      AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV18TFHreAcMtr ;
      AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV19TFHreAcMtr_To ;
      AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV20TFHreAcPie ;
      AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV21TFHreAcPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                           AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                           AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                           AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                           AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                           AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                           AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                           AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                           AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                           Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) ,
                                           Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) ,
                                           AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                           AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                           AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                           AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) ,
                                           Integer.valueOf(A9985HreAcCod) ,
                                           Byte.valueOf(A9986HreAcReo) ,
                                           A9987HreAcPar ,
                                           A9992HreAcSer ,
                                           A9993HreAcDsc ,
                                           A9994HreAcCol ,
                                           Integer.valueOf(A9995HreAcNumC) ,
                                           Integer.valueOf(A9991HreAcCli) ,
                                           A9988HreAcKgm ,
                                           A9989HreAcMtr ,
                                           Integer.valueOf(A9990HreAcPie) ,
                                           AV53EmprCod ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           AV56HreBarPar ,
                                           Byte.valueOf(AV57HreNumCie) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = GXutil.padr( GXutil.rtrim( AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr), 11, "%") ;
      lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser), 16, "%") ;
      lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc), 26, "%") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol), 13, "%") ;
      /* Using cursor P09A82 */
      pr_default.execute(0, new Object[] {AV53EmprCod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarPar, Byte.valueOf(AV57HreNumCie), lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr, AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel, lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser, AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel, lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc, AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel, lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol, AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel, Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc), Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to), Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli), Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to), AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to, Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie), Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4495HreNumCie = P09A82_A4495HreNumCie[0] ;
         A4494HreBarPar = P09A82_A4494HreBarPar[0] ;
         A4493HreBarReo = P09A82_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A82_A4492HreBarCod[0] ;
         A396EmprCod = P09A82_A396EmprCod[0] ;
         A9990HreAcPie = P09A82_A9990HreAcPie[0] ;
         n9990HreAcPie = P09A82_n9990HreAcPie[0] ;
         A9989HreAcMtr = P09A82_A9989HreAcMtr[0] ;
         n9989HreAcMtr = P09A82_n9989HreAcMtr[0] ;
         A9988HreAcKgm = P09A82_A9988HreAcKgm[0] ;
         n9988HreAcKgm = P09A82_n9988HreAcKgm[0] ;
         A9991HreAcCli = P09A82_A9991HreAcCli[0] ;
         n9991HreAcCli = P09A82_n9991HreAcCli[0] ;
         A9995HreAcNumC = P09A82_A9995HreAcNumC[0] ;
         n9995HreAcNumC = P09A82_n9995HreAcNumC[0] ;
         A9994HreAcCol = P09A82_A9994HreAcCol[0] ;
         n9994HreAcCol = P09A82_n9994HreAcCol[0] ;
         A9993HreAcDsc = P09A82_A9993HreAcDsc[0] ;
         n9993HreAcDsc = P09A82_n9993HreAcDsc[0] ;
         A9992HreAcSer = P09A82_A9992HreAcSer[0] ;
         n9992HreAcSer = P09A82_n9992HreAcSer[0] ;
         A9987HreAcPar = P09A82_A9987HreAcPar[0] ;
         A9986HreAcReo = P09A82_A9986HreAcReo[0] ;
         A9985HreAcCod = P09A82_A9985HreAcCod[0] ;
         A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
         if ( ! (GXutil.strcmp("", A13895HreAcNHdr)==0) )
         {
            AV36Option = A13895HreAcNHdr ;
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
      /* 'LOADHREACSEROPTIONS' Routine */
      returnInSub = false ;
      AV24TFHreAcSer = AV32SearchTxt ;
      AV25TFHreAcSer_Sel = "" ;
      AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV50FilterFullText ;
      AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV24TFHreAcSer ;
      AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV25TFHreAcSer_Sel ;
      AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV26TFHreAcDsc ;
      AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV27TFHreAcDsc_Sel ;
      AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV28TFHreAcCol ;
      AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV29TFHreAcCol_Sel ;
      AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV30TFHreAcNumC ;
      AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV31TFHreAcNumC_To ;
      AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV22TFHreAcCli ;
      AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV23TFHreAcCli_To ;
      AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV16TFHreAcKgm ;
      AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV17TFHreAcKgm_To ;
      AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV18TFHreAcMtr ;
      AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV19TFHreAcMtr_To ;
      AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV20TFHreAcPie ;
      AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV21TFHreAcPie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                           AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                           AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                           AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                           AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                           AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                           AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                           AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                           AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                           Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) ,
                                           Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) ,
                                           AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                           AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                           AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                           AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) ,
                                           Integer.valueOf(A9985HreAcCod) ,
                                           Byte.valueOf(A9986HreAcReo) ,
                                           A9987HreAcPar ,
                                           A9992HreAcSer ,
                                           A9993HreAcDsc ,
                                           A9994HreAcCol ,
                                           Integer.valueOf(A9995HreAcNumC) ,
                                           Integer.valueOf(A9991HreAcCli) ,
                                           A9988HreAcKgm ,
                                           A9989HreAcMtr ,
                                           Integer.valueOf(A9990HreAcPie) ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV56HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV57HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = GXutil.padr( GXutil.rtrim( AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr), 11, "%") ;
      lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser), 16, "%") ;
      lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc), 26, "%") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol), 13, "%") ;
      /* Using cursor P09A83 */
      pr_default.execute(1, new Object[] {AV53EmprCod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarPar, Byte.valueOf(AV57HreNumCie), lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr, AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel, lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser, AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel, lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc, AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel, lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol, AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel, Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc), Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to), Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli), Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to), AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to, Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie), Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9A83 = false ;
         A396EmprCod = P09A83_A396EmprCod[0] ;
         A4492HreBarCod = P09A83_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A83_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A83_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A83_A4495HreNumCie[0] ;
         A9992HreAcSer = P09A83_A9992HreAcSer[0] ;
         n9992HreAcSer = P09A83_n9992HreAcSer[0] ;
         A9990HreAcPie = P09A83_A9990HreAcPie[0] ;
         n9990HreAcPie = P09A83_n9990HreAcPie[0] ;
         A9989HreAcMtr = P09A83_A9989HreAcMtr[0] ;
         n9989HreAcMtr = P09A83_n9989HreAcMtr[0] ;
         A9988HreAcKgm = P09A83_A9988HreAcKgm[0] ;
         n9988HreAcKgm = P09A83_n9988HreAcKgm[0] ;
         A9991HreAcCli = P09A83_A9991HreAcCli[0] ;
         n9991HreAcCli = P09A83_n9991HreAcCli[0] ;
         A9995HreAcNumC = P09A83_A9995HreAcNumC[0] ;
         n9995HreAcNumC = P09A83_n9995HreAcNumC[0] ;
         A9994HreAcCol = P09A83_A9994HreAcCol[0] ;
         n9994HreAcCol = P09A83_n9994HreAcCol[0] ;
         A9993HreAcDsc = P09A83_A9993HreAcDsc[0] ;
         n9993HreAcDsc = P09A83_n9993HreAcDsc[0] ;
         A9987HreAcPar = P09A83_A9987HreAcPar[0] ;
         A9986HreAcReo = P09A83_A9986HreAcReo[0] ;
         A9985HreAcCod = P09A83_A9985HreAcCod[0] ;
         A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09A83_A9992HreAcSer[0], A9992HreAcSer) == 0 ) )
         {
            brk9A83 = false ;
            A396EmprCod = P09A83_A396EmprCod[0] ;
            A4492HreBarCod = P09A83_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A83_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A83_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A83_A4495HreNumCie[0] ;
            A9987HreAcPar = P09A83_A9987HreAcPar[0] ;
            A9986HreAcReo = P09A83_A9986HreAcReo[0] ;
            A9985HreAcCod = P09A83_A9985HreAcCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9A83 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A9992HreAcSer)==0) )
         {
            AV36Option = A9992HreAcSer ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A83 )
         {
            brk9A83 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHREACDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFHreAcDsc = AV32SearchTxt ;
      AV27TFHreAcDsc_Sel = "" ;
      AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV50FilterFullText ;
      AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV24TFHreAcSer ;
      AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV25TFHreAcSer_Sel ;
      AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV26TFHreAcDsc ;
      AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV27TFHreAcDsc_Sel ;
      AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV28TFHreAcCol ;
      AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV29TFHreAcCol_Sel ;
      AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV30TFHreAcNumC ;
      AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV31TFHreAcNumC_To ;
      AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV22TFHreAcCli ;
      AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV23TFHreAcCli_To ;
      AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV16TFHreAcKgm ;
      AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV17TFHreAcKgm_To ;
      AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV18TFHreAcMtr ;
      AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV19TFHreAcMtr_To ;
      AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV20TFHreAcPie ;
      AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV21TFHreAcPie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                           AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                           AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                           AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                           AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                           AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                           AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                           AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                           AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                           Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) ,
                                           Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) ,
                                           AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                           AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                           AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                           AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) ,
                                           Integer.valueOf(A9985HreAcCod) ,
                                           Byte.valueOf(A9986HreAcReo) ,
                                           A9987HreAcPar ,
                                           A9992HreAcSer ,
                                           A9993HreAcDsc ,
                                           A9994HreAcCol ,
                                           Integer.valueOf(A9995HreAcNumC) ,
                                           Integer.valueOf(A9991HreAcCli) ,
                                           A9988HreAcKgm ,
                                           A9989HreAcMtr ,
                                           Integer.valueOf(A9990HreAcPie) ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV56HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV57HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = GXutil.padr( GXutil.rtrim( AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr), 11, "%") ;
      lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser), 16, "%") ;
      lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc), 26, "%") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol), 13, "%") ;
      /* Using cursor P09A84 */
      pr_default.execute(2, new Object[] {AV53EmprCod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarPar, Byte.valueOf(AV57HreNumCie), lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr, AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel, lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser, AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel, lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc, AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel, lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol, AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel, Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc), Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to), Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli), Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to), AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to, Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie), Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9A85 = false ;
         A396EmprCod = P09A84_A396EmprCod[0] ;
         A4492HreBarCod = P09A84_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A84_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A84_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A84_A4495HreNumCie[0] ;
         A9993HreAcDsc = P09A84_A9993HreAcDsc[0] ;
         n9993HreAcDsc = P09A84_n9993HreAcDsc[0] ;
         A9990HreAcPie = P09A84_A9990HreAcPie[0] ;
         n9990HreAcPie = P09A84_n9990HreAcPie[0] ;
         A9989HreAcMtr = P09A84_A9989HreAcMtr[0] ;
         n9989HreAcMtr = P09A84_n9989HreAcMtr[0] ;
         A9988HreAcKgm = P09A84_A9988HreAcKgm[0] ;
         n9988HreAcKgm = P09A84_n9988HreAcKgm[0] ;
         A9991HreAcCli = P09A84_A9991HreAcCli[0] ;
         n9991HreAcCli = P09A84_n9991HreAcCli[0] ;
         A9995HreAcNumC = P09A84_A9995HreAcNumC[0] ;
         n9995HreAcNumC = P09A84_n9995HreAcNumC[0] ;
         A9994HreAcCol = P09A84_A9994HreAcCol[0] ;
         n9994HreAcCol = P09A84_n9994HreAcCol[0] ;
         A9992HreAcSer = P09A84_A9992HreAcSer[0] ;
         n9992HreAcSer = P09A84_n9992HreAcSer[0] ;
         A9987HreAcPar = P09A84_A9987HreAcPar[0] ;
         A9986HreAcReo = P09A84_A9986HreAcReo[0] ;
         A9985HreAcCod = P09A84_A9985HreAcCod[0] ;
         A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09A84_A9993HreAcDsc[0], A9993HreAcDsc) == 0 ) )
         {
            brk9A85 = false ;
            A396EmprCod = P09A84_A396EmprCod[0] ;
            A4492HreBarCod = P09A84_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A84_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A84_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A84_A4495HreNumCie[0] ;
            A9987HreAcPar = P09A84_A9987HreAcPar[0] ;
            A9986HreAcReo = P09A84_A9986HreAcReo[0] ;
            A9985HreAcCod = P09A84_A9985HreAcCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9A85 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A9993HreAcDsc)==0) )
         {
            AV36Option = A9993HreAcDsc ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A85 )
         {
            brk9A85 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHREACCOLOPTIONS' Routine */
      returnInSub = false ;
      AV28TFHreAcCol = AV32SearchTxt ;
      AV29TFHreAcCol_Sel = "" ;
      AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV50FilterFullText ;
      AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV24TFHreAcSer ;
      AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV25TFHreAcSer_Sel ;
      AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV26TFHreAcDsc ;
      AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV27TFHreAcDsc_Sel ;
      AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV28TFHreAcCol ;
      AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV29TFHreAcCol_Sel ;
      AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV30TFHreAcNumC ;
      AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV31TFHreAcNumC_To ;
      AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV22TFHreAcCli ;
      AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV23TFHreAcCli_To ;
      AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV16TFHreAcKgm ;
      AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV17TFHreAcKgm_To ;
      AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV18TFHreAcMtr ;
      AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV19TFHreAcMtr_To ;
      AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV20TFHreAcPie ;
      AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV21TFHreAcPie_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                           AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                           AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                           AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                           AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                           AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                           AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                           AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                           AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                           Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) ,
                                           Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) ,
                                           Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) ,
                                           Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) ,
                                           AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                           AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                           AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                           AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) ,
                                           Integer.valueOf(A9985HreAcCod) ,
                                           Byte.valueOf(A9986HreAcReo) ,
                                           A9987HreAcPar ,
                                           A9992HreAcSer ,
                                           A9993HreAcDsc ,
                                           A9994HreAcCol ,
                                           Integer.valueOf(A9995HreAcNumC) ,
                                           Integer.valueOf(A9991HreAcCli) ,
                                           A9988HreAcKgm ,
                                           A9989HreAcMtr ,
                                           Integer.valueOf(A9990HreAcPie) ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV54HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV55HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV56HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV57HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = GXutil.padr( GXutil.rtrim( AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr), 11, "%") ;
      lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = GXutil.padr( GXutil.rtrim( AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser), 16, "%") ;
      lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc), 26, "%") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol), 13, "%") ;
      /* Using cursor P09A85 */
      pr_default.execute(3, new Object[] {AV53EmprCod, Integer.valueOf(AV54HreBarCod), Byte.valueOf(AV55HreBarReo), AV56HreBarPar, Byte.valueOf(AV57HreNumCie), lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr, AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel, lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser, AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel, lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc, AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel, lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol, AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel, Integer.valueOf(AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc), Integer.valueOf(AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to), Integer.valueOf(AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli), Integer.valueOf(AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to), AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to, Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie), Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9A87 = false ;
         A396EmprCod = P09A85_A396EmprCod[0] ;
         A4492HreBarCod = P09A85_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A85_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A85_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A85_A4495HreNumCie[0] ;
         A9994HreAcCol = P09A85_A9994HreAcCol[0] ;
         n9994HreAcCol = P09A85_n9994HreAcCol[0] ;
         A9990HreAcPie = P09A85_A9990HreAcPie[0] ;
         n9990HreAcPie = P09A85_n9990HreAcPie[0] ;
         A9989HreAcMtr = P09A85_A9989HreAcMtr[0] ;
         n9989HreAcMtr = P09A85_n9989HreAcMtr[0] ;
         A9988HreAcKgm = P09A85_A9988HreAcKgm[0] ;
         n9988HreAcKgm = P09A85_n9988HreAcKgm[0] ;
         A9991HreAcCli = P09A85_A9991HreAcCli[0] ;
         n9991HreAcCli = P09A85_n9991HreAcCli[0] ;
         A9995HreAcNumC = P09A85_A9995HreAcNumC[0] ;
         n9995HreAcNumC = P09A85_n9995HreAcNumC[0] ;
         A9993HreAcDsc = P09A85_A9993HreAcDsc[0] ;
         n9993HreAcDsc = P09A85_n9993HreAcDsc[0] ;
         A9992HreAcSer = P09A85_A9992HreAcSer[0] ;
         n9992HreAcSer = P09A85_n9992HreAcSer[0] ;
         A9987HreAcPar = P09A85_A9987HreAcPar[0] ;
         A9986HreAcReo = P09A85_A9986HreAcReo[0] ;
         A9985HreAcCod = P09A85_A9985HreAcCod[0] ;
         A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09A85_A9994HreAcCol[0], A9994HreAcCol) == 0 ) )
         {
            brk9A87 = false ;
            A396EmprCod = P09A85_A396EmprCod[0] ;
            A4492HreBarCod = P09A85_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A85_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A85_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A85_A4495HreNumCie[0] ;
            A9987HreAcPar = P09A85_A9987HreAcPar[0] ;
            A9986HreAcReo = P09A85_A9986HreAcReo[0] ;
            A9985HreAcCod = P09A85_A9985HreAcCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9A87 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A9994HreAcCol)==0) )
         {
            AV36Option = A9994HreAcCol ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A87 )
         {
            brk9A87 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = historicoderecetas_agrupacionacabados_wpgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = historicoderecetas_agrupacionacabados_wpgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = historicoderecetas_agrupacionacabados_wpgetfilterdata.this.AV43OptionIndexesJson;
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
      AV51TFHreAcNHdr = "" ;
      AV52TFHreAcNHdr_Sel = "" ;
      AV24TFHreAcSer = "" ;
      AV25TFHreAcSer_Sel = "" ;
      AV26TFHreAcDsc = "" ;
      AV27TFHreAcDsc_Sel = "" ;
      AV28TFHreAcCol = "" ;
      AV29TFHreAcCol_Sel = "" ;
      AV16TFHreAcKgm = DecimalUtil.ZERO ;
      AV17TFHreAcKgm_To = DecimalUtil.ZERO ;
      AV18TFHreAcMtr = DecimalUtil.ZERO ;
      AV19TFHreAcMtr_To = DecimalUtil.ZERO ;
      A13895HreAcNHdr = "" ;
      AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = "" ;
      AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = "" ;
      AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = "" ;
      AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = "" ;
      AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = "" ;
      AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = "" ;
      AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = "" ;
      AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = "" ;
      AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = "" ;
      AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = DecimalUtil.ZERO ;
      AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = DecimalUtil.ZERO ;
      AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = DecimalUtil.ZERO ;
      AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = "" ;
      lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = "" ;
      lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = "" ;
      lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = "" ;
      lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = "" ;
      A9987HreAcPar = "" ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      A9994HreAcCol = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      AV53EmprCod = "" ;
      AV56HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A82_A4495HreNumCie = new byte[1] ;
      P09A82_A4494HreBarPar = new String[] {""} ;
      P09A82_A4493HreBarReo = new byte[1] ;
      P09A82_A4492HreBarCod = new int[1] ;
      P09A82_A396EmprCod = new String[] {""} ;
      P09A82_A9990HreAcPie = new int[1] ;
      P09A82_n9990HreAcPie = new boolean[] {false} ;
      P09A82_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A82_n9989HreAcMtr = new boolean[] {false} ;
      P09A82_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A82_n9988HreAcKgm = new boolean[] {false} ;
      P09A82_A9991HreAcCli = new int[1] ;
      P09A82_n9991HreAcCli = new boolean[] {false} ;
      P09A82_A9995HreAcNumC = new int[1] ;
      P09A82_n9995HreAcNumC = new boolean[] {false} ;
      P09A82_A9994HreAcCol = new String[] {""} ;
      P09A82_n9994HreAcCol = new boolean[] {false} ;
      P09A82_A9993HreAcDsc = new String[] {""} ;
      P09A82_n9993HreAcDsc = new boolean[] {false} ;
      P09A82_A9992HreAcSer = new String[] {""} ;
      P09A82_n9992HreAcSer = new boolean[] {false} ;
      P09A82_A9987HreAcPar = new String[] {""} ;
      P09A82_A9986HreAcReo = new byte[1] ;
      P09A82_A9985HreAcCod = new int[1] ;
      AV36Option = "" ;
      P09A83_A396EmprCod = new String[] {""} ;
      P09A83_A4492HreBarCod = new int[1] ;
      P09A83_A4493HreBarReo = new byte[1] ;
      P09A83_A4494HreBarPar = new String[] {""} ;
      P09A83_A4495HreNumCie = new byte[1] ;
      P09A83_A9992HreAcSer = new String[] {""} ;
      P09A83_n9992HreAcSer = new boolean[] {false} ;
      P09A83_A9990HreAcPie = new int[1] ;
      P09A83_n9990HreAcPie = new boolean[] {false} ;
      P09A83_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A83_n9989HreAcMtr = new boolean[] {false} ;
      P09A83_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A83_n9988HreAcKgm = new boolean[] {false} ;
      P09A83_A9991HreAcCli = new int[1] ;
      P09A83_n9991HreAcCli = new boolean[] {false} ;
      P09A83_A9995HreAcNumC = new int[1] ;
      P09A83_n9995HreAcNumC = new boolean[] {false} ;
      P09A83_A9994HreAcCol = new String[] {""} ;
      P09A83_n9994HreAcCol = new boolean[] {false} ;
      P09A83_A9993HreAcDsc = new String[] {""} ;
      P09A83_n9993HreAcDsc = new boolean[] {false} ;
      P09A83_A9987HreAcPar = new String[] {""} ;
      P09A83_A9986HreAcReo = new byte[1] ;
      P09A83_A9985HreAcCod = new int[1] ;
      P09A84_A396EmprCod = new String[] {""} ;
      P09A84_A4492HreBarCod = new int[1] ;
      P09A84_A4493HreBarReo = new byte[1] ;
      P09A84_A4494HreBarPar = new String[] {""} ;
      P09A84_A4495HreNumCie = new byte[1] ;
      P09A84_A9993HreAcDsc = new String[] {""} ;
      P09A84_n9993HreAcDsc = new boolean[] {false} ;
      P09A84_A9990HreAcPie = new int[1] ;
      P09A84_n9990HreAcPie = new boolean[] {false} ;
      P09A84_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A84_n9989HreAcMtr = new boolean[] {false} ;
      P09A84_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A84_n9988HreAcKgm = new boolean[] {false} ;
      P09A84_A9991HreAcCli = new int[1] ;
      P09A84_n9991HreAcCli = new boolean[] {false} ;
      P09A84_A9995HreAcNumC = new int[1] ;
      P09A84_n9995HreAcNumC = new boolean[] {false} ;
      P09A84_A9994HreAcCol = new String[] {""} ;
      P09A84_n9994HreAcCol = new boolean[] {false} ;
      P09A84_A9992HreAcSer = new String[] {""} ;
      P09A84_n9992HreAcSer = new boolean[] {false} ;
      P09A84_A9987HreAcPar = new String[] {""} ;
      P09A84_A9986HreAcReo = new byte[1] ;
      P09A84_A9985HreAcCod = new int[1] ;
      P09A85_A396EmprCod = new String[] {""} ;
      P09A85_A4492HreBarCod = new int[1] ;
      P09A85_A4493HreBarReo = new byte[1] ;
      P09A85_A4494HreBarPar = new String[] {""} ;
      P09A85_A4495HreNumCie = new byte[1] ;
      P09A85_A9994HreAcCol = new String[] {""} ;
      P09A85_n9994HreAcCol = new boolean[] {false} ;
      P09A85_A9990HreAcPie = new int[1] ;
      P09A85_n9990HreAcPie = new boolean[] {false} ;
      P09A85_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A85_n9989HreAcMtr = new boolean[] {false} ;
      P09A85_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A85_n9988HreAcKgm = new boolean[] {false} ;
      P09A85_A9991HreAcCli = new int[1] ;
      P09A85_n9991HreAcCli = new boolean[] {false} ;
      P09A85_A9995HreAcNumC = new int[1] ;
      P09A85_n9995HreAcNumC = new boolean[] {false} ;
      P09A85_A9993HreAcDsc = new String[] {""} ;
      P09A85_n9993HreAcDsc = new boolean[] {false} ;
      P09A85_A9992HreAcSer = new String[] {""} ;
      P09A85_n9992HreAcSer = new boolean[] {false} ;
      P09A85_A9987HreAcPar = new String[] {""} ;
      P09A85_A9986HreAcReo = new byte[1] ;
      P09A85_A9985HreAcCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_agrupacionacabados_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09A82_A4495HreNumCie, P09A82_A4494HreBarPar, P09A82_A4493HreBarReo, P09A82_A4492HreBarCod, P09A82_A396EmprCod, P09A82_A9990HreAcPie, P09A82_n9990HreAcPie, P09A82_A9989HreAcMtr, P09A82_n9989HreAcMtr, P09A82_A9988HreAcKgm,
            P09A82_n9988HreAcKgm, P09A82_A9991HreAcCli, P09A82_n9991HreAcCli, P09A82_A9995HreAcNumC, P09A82_n9995HreAcNumC, P09A82_A9994HreAcCol, P09A82_n9994HreAcCol, P09A82_A9993HreAcDsc, P09A82_n9993HreAcDsc, P09A82_A9992HreAcSer,
            P09A82_n9992HreAcSer, P09A82_A9987HreAcPar, P09A82_A9986HreAcReo, P09A82_A9985HreAcCod
            }
            , new Object[] {
            P09A83_A396EmprCod, P09A83_A4492HreBarCod, P09A83_A4493HreBarReo, P09A83_A4494HreBarPar, P09A83_A4495HreNumCie, P09A83_A9992HreAcSer, P09A83_n9992HreAcSer, P09A83_A9990HreAcPie, P09A83_n9990HreAcPie, P09A83_A9989HreAcMtr,
            P09A83_n9989HreAcMtr, P09A83_A9988HreAcKgm, P09A83_n9988HreAcKgm, P09A83_A9991HreAcCli, P09A83_n9991HreAcCli, P09A83_A9995HreAcNumC, P09A83_n9995HreAcNumC, P09A83_A9994HreAcCol, P09A83_n9994HreAcCol, P09A83_A9993HreAcDsc,
            P09A83_n9993HreAcDsc, P09A83_A9987HreAcPar, P09A83_A9986HreAcReo, P09A83_A9985HreAcCod
            }
            , new Object[] {
            P09A84_A396EmprCod, P09A84_A4492HreBarCod, P09A84_A4493HreBarReo, P09A84_A4494HreBarPar, P09A84_A4495HreNumCie, P09A84_A9993HreAcDsc, P09A84_n9993HreAcDsc, P09A84_A9990HreAcPie, P09A84_n9990HreAcPie, P09A84_A9989HreAcMtr,
            P09A84_n9989HreAcMtr, P09A84_A9988HreAcKgm, P09A84_n9988HreAcKgm, P09A84_A9991HreAcCli, P09A84_n9991HreAcCli, P09A84_A9995HreAcNumC, P09A84_n9995HreAcNumC, P09A84_A9994HreAcCol, P09A84_n9994HreAcCol, P09A84_A9992HreAcSer,
            P09A84_n9992HreAcSer, P09A84_A9987HreAcPar, P09A84_A9986HreAcReo, P09A84_A9985HreAcCod
            }
            , new Object[] {
            P09A85_A396EmprCod, P09A85_A4492HreBarCod, P09A85_A4493HreBarReo, P09A85_A4494HreBarPar, P09A85_A4495HreNumCie, P09A85_A9994HreAcCol, P09A85_n9994HreAcCol, P09A85_A9990HreAcPie, P09A85_n9990HreAcPie, P09A85_A9989HreAcMtr,
            P09A85_n9989HreAcMtr, P09A85_A9988HreAcKgm, P09A85_n9988HreAcKgm, P09A85_A9991HreAcCli, P09A85_n9991HreAcCli, P09A85_A9995HreAcNumC, P09A85_n9995HreAcNumC, P09A85_A9993HreAcDsc, P09A85_n9993HreAcDsc, P09A85_A9992HreAcSer,
            P09A85_n9992HreAcSer, P09A85_A9987HreAcPar, P09A85_A9986HreAcReo, P09A85_A9985HreAcCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A9986HreAcReo ;
   private byte AV55HreBarReo ;
   private byte AV57HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV30TFHreAcNumC ;
   private int AV31TFHreAcNumC_To ;
   private int AV22TFHreAcCli ;
   private int AV23TFHreAcCli_To ;
   private int AV20TFHreAcPie ;
   private int AV21TFHreAcPie_To ;
   private int AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ;
   private int AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ;
   private int AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ;
   private int AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ;
   private int AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ;
   private int AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ;
   private int A9985HreAcCod ;
   private int A9995HreAcNumC ;
   private int A9991HreAcCli ;
   private int A9990HreAcPie ;
   private int AV54HreBarCod ;
   private int A4492HreBarCod ;
   private int AV35InsertIndex ;
   private long AV44count ;
   private java.math.BigDecimal AV16TFHreAcKgm ;
   private java.math.BigDecimal AV17TFHreAcKgm_To ;
   private java.math.BigDecimal AV18TFHreAcMtr ;
   private java.math.BigDecimal AV19TFHreAcMtr_To ;
   private java.math.BigDecimal AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ;
   private java.math.BigDecimal AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ;
   private java.math.BigDecimal AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ;
   private java.math.BigDecimal AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private String AV51TFHreAcNHdr ;
   private String AV52TFHreAcNHdr_Sel ;
   private String AV24TFHreAcSer ;
   private String AV25TFHreAcSer_Sel ;
   private String AV26TFHreAcDsc ;
   private String AV27TFHreAcDsc_Sel ;
   private String AV28TFHreAcCol ;
   private String AV29TFHreAcCol_Sel ;
   private String A13895HreAcNHdr ;
   private String AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ;
   private String AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ;
   private String AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ;
   private String AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ;
   private String AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ;
   private String AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ;
   private String AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ;
   private String AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ;
   private String scmdbuf ;
   private String lV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ;
   private String lV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ;
   private String lV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ;
   private String lV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ;
   private String A9987HreAcPar ;
   private String A9992HreAcSer ;
   private String A9993HreAcDsc ;
   private String A9994HreAcCol ;
   private String AV53EmprCod ;
   private String AV56HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean n9990HreAcPie ;
   private boolean n9989HreAcMtr ;
   private boolean n9988HreAcKgm ;
   private boolean n9991HreAcCli ;
   private boolean n9995HreAcNumC ;
   private boolean n9994HreAcCol ;
   private boolean n9993HreAcDsc ;
   private boolean n9992HreAcSer ;
   private boolean brk9A83 ;
   private boolean brk9A85 ;
   private boolean brk9A87 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ;
   private String lV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ;
   private String AV36Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09A82_A4495HreNumCie ;
   private String[] P09A82_A4494HreBarPar ;
   private byte[] P09A82_A4493HreBarReo ;
   private int[] P09A82_A4492HreBarCod ;
   private String[] P09A82_A396EmprCod ;
   private int[] P09A82_A9990HreAcPie ;
   private boolean[] P09A82_n9990HreAcPie ;
   private java.math.BigDecimal[] P09A82_A9989HreAcMtr ;
   private boolean[] P09A82_n9989HreAcMtr ;
   private java.math.BigDecimal[] P09A82_A9988HreAcKgm ;
   private boolean[] P09A82_n9988HreAcKgm ;
   private int[] P09A82_A9991HreAcCli ;
   private boolean[] P09A82_n9991HreAcCli ;
   private int[] P09A82_A9995HreAcNumC ;
   private boolean[] P09A82_n9995HreAcNumC ;
   private String[] P09A82_A9994HreAcCol ;
   private boolean[] P09A82_n9994HreAcCol ;
   private String[] P09A82_A9993HreAcDsc ;
   private boolean[] P09A82_n9993HreAcDsc ;
   private String[] P09A82_A9992HreAcSer ;
   private boolean[] P09A82_n9992HreAcSer ;
   private String[] P09A82_A9987HreAcPar ;
   private byte[] P09A82_A9986HreAcReo ;
   private int[] P09A82_A9985HreAcCod ;
   private String[] P09A83_A396EmprCod ;
   private int[] P09A83_A4492HreBarCod ;
   private byte[] P09A83_A4493HreBarReo ;
   private String[] P09A83_A4494HreBarPar ;
   private byte[] P09A83_A4495HreNumCie ;
   private String[] P09A83_A9992HreAcSer ;
   private boolean[] P09A83_n9992HreAcSer ;
   private int[] P09A83_A9990HreAcPie ;
   private boolean[] P09A83_n9990HreAcPie ;
   private java.math.BigDecimal[] P09A83_A9989HreAcMtr ;
   private boolean[] P09A83_n9989HreAcMtr ;
   private java.math.BigDecimal[] P09A83_A9988HreAcKgm ;
   private boolean[] P09A83_n9988HreAcKgm ;
   private int[] P09A83_A9991HreAcCli ;
   private boolean[] P09A83_n9991HreAcCli ;
   private int[] P09A83_A9995HreAcNumC ;
   private boolean[] P09A83_n9995HreAcNumC ;
   private String[] P09A83_A9994HreAcCol ;
   private boolean[] P09A83_n9994HreAcCol ;
   private String[] P09A83_A9993HreAcDsc ;
   private boolean[] P09A83_n9993HreAcDsc ;
   private String[] P09A83_A9987HreAcPar ;
   private byte[] P09A83_A9986HreAcReo ;
   private int[] P09A83_A9985HreAcCod ;
   private String[] P09A84_A396EmprCod ;
   private int[] P09A84_A4492HreBarCod ;
   private byte[] P09A84_A4493HreBarReo ;
   private String[] P09A84_A4494HreBarPar ;
   private byte[] P09A84_A4495HreNumCie ;
   private String[] P09A84_A9993HreAcDsc ;
   private boolean[] P09A84_n9993HreAcDsc ;
   private int[] P09A84_A9990HreAcPie ;
   private boolean[] P09A84_n9990HreAcPie ;
   private java.math.BigDecimal[] P09A84_A9989HreAcMtr ;
   private boolean[] P09A84_n9989HreAcMtr ;
   private java.math.BigDecimal[] P09A84_A9988HreAcKgm ;
   private boolean[] P09A84_n9988HreAcKgm ;
   private int[] P09A84_A9991HreAcCli ;
   private boolean[] P09A84_n9991HreAcCli ;
   private int[] P09A84_A9995HreAcNumC ;
   private boolean[] P09A84_n9995HreAcNumC ;
   private String[] P09A84_A9994HreAcCol ;
   private boolean[] P09A84_n9994HreAcCol ;
   private String[] P09A84_A9992HreAcSer ;
   private boolean[] P09A84_n9992HreAcSer ;
   private String[] P09A84_A9987HreAcPar ;
   private byte[] P09A84_A9986HreAcReo ;
   private int[] P09A84_A9985HreAcCod ;
   private String[] P09A85_A396EmprCod ;
   private int[] P09A85_A4492HreBarCod ;
   private byte[] P09A85_A4493HreBarReo ;
   private String[] P09A85_A4494HreBarPar ;
   private byte[] P09A85_A4495HreNumCie ;
   private String[] P09A85_A9994HreAcCol ;
   private boolean[] P09A85_n9994HreAcCol ;
   private int[] P09A85_A9990HreAcPie ;
   private boolean[] P09A85_n9990HreAcPie ;
   private java.math.BigDecimal[] P09A85_A9989HreAcMtr ;
   private boolean[] P09A85_n9989HreAcMtr ;
   private java.math.BigDecimal[] P09A85_A9988HreAcKgm ;
   private boolean[] P09A85_n9988HreAcKgm ;
   private int[] P09A85_A9991HreAcCli ;
   private boolean[] P09A85_n9991HreAcCli ;
   private int[] P09A85_A9995HreAcNumC ;
   private boolean[] P09A85_n9995HreAcNumC ;
   private String[] P09A85_A9993HreAcDsc ;
   private boolean[] P09A85_n9993HreAcDsc ;
   private String[] P09A85_A9992HreAcSer ;
   private boolean[] P09A85_n9992HreAcSer ;
   private String[] P09A85_A9987HreAcPar ;
   private byte[] P09A85_A9986HreAcReo ;
   private int[] P09A85_A9985HreAcCod ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class historicoderecetas_agrupacionacabados_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                          String AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                          String AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                          String AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                          String AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                          String AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                          String AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                          String AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                          String AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                          int AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ,
                                          int AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ,
                                          int AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ,
                                          int AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ,
                                          java.math.BigDecimal AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                          java.math.BigDecimal AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                          int AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ,
                                          int AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ,
                                          int A9985HreAcCod ,
                                          byte A9986HreAcReo ,
                                          String A9987HreAcPar ,
                                          String A9992HreAcSer ,
                                          String A9993HreAcDsc ,
                                          String A9994HreAcCol ,
                                          int A9995HreAcNumC ,
                                          int A9991HreAcCli ,
                                          java.math.BigDecimal A9988HreAcKgm ,
                                          java.math.BigDecimal A9989HreAcMtr ,
                                          int A9990HreAcPie ,
                                          String AV53EmprCod ,
                                          int AV54HreBarCod ,
                                          byte AV55HreBarReo ,
                                          String AV56HreBarPar ,
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
      scmdbuf = "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAcPie, HreAcMtr, HreAcKgm, HreAcCli, HreAcNumC, HreAcCol, HreAcDsc, HreAcSer, HreAcPar, HreAcReo," ;
      scmdbuf += " HreAcCod FROM TXPHISHRA" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?)) or ( UPPER(HreAcSer) like '%' || UPPER(?)) or ( UPPER(HreAcDsc) like '%' || UPPER(?)) or ( UPPER(HreAcCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAcNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcPie,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcSer = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcCol = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) )
      {
         addWhere(sWhereString, "(HreAcNumC >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) )
      {
         addWhere(sWhereString, "(HreAcNumC <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) )
      {
         addWhere(sWhereString, "(HreAcCli >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) )
      {
         addWhere(sWhereString, "(HreAcCli <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) )
      {
         addWhere(sWhereString, "(HreAcPie >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) )
      {
         addWhere(sWhereString, "(HreAcPie <= ?)");
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

   protected Object[] conditional_P09A83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                          String AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                          String AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                          String AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                          String AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                          String AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                          String AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                          String AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                          String AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                          int AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ,
                                          int AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ,
                                          int AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ,
                                          int AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ,
                                          java.math.BigDecimal AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                          java.math.BigDecimal AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                          int AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ,
                                          int AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ,
                                          int A9985HreAcCod ,
                                          byte A9986HreAcReo ,
                                          String A9987HreAcPar ,
                                          String A9992HreAcSer ,
                                          String A9993HreAcDsc ,
                                          String A9994HreAcCol ,
                                          int A9995HreAcNumC ,
                                          int A9991HreAcCli ,
                                          java.math.BigDecimal A9988HreAcKgm ,
                                          java.math.BigDecimal A9989HreAcMtr ,
                                          int A9990HreAcPie ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV54HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV55HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV56HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV57HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcSer, HreAcPie, HreAcMtr, HreAcKgm, HreAcCli, HreAcNumC, HreAcCol, HreAcDsc, HreAcPar, HreAcReo," ;
      scmdbuf += " HreAcCod FROM TXPHISHRA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?)) or ( UPPER(HreAcSer) like '%' || UPPER(?)) or ( UPPER(HreAcDsc) like '%' || UPPER(?)) or ( UPPER(HreAcCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAcNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcPie,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcSer = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcCol = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) )
      {
         addWhere(sWhereString, "(HreAcNumC >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) )
      {
         addWhere(sWhereString, "(HreAcNumC <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) )
      {
         addWhere(sWhereString, "(HreAcCli >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) )
      {
         addWhere(sWhereString, "(HreAcCli <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) )
      {
         addWhere(sWhereString, "(HreAcPie >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) )
      {
         addWhere(sWhereString, "(HreAcPie <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreAcSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09A84( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                          String AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                          String AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                          String AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                          String AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                          String AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                          String AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                          String AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                          String AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                          int AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ,
                                          int AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ,
                                          int AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ,
                                          int AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ,
                                          java.math.BigDecimal AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                          java.math.BigDecimal AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                          int AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ,
                                          int AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ,
                                          int A9985HreAcCod ,
                                          byte A9986HreAcReo ,
                                          String A9987HreAcPar ,
                                          String A9992HreAcSer ,
                                          String A9993HreAcDsc ,
                                          String A9994HreAcCol ,
                                          int A9995HreAcNumC ,
                                          int A9991HreAcCli ,
                                          java.math.BigDecimal A9988HreAcKgm ,
                                          java.math.BigDecimal A9989HreAcMtr ,
                                          int A9990HreAcPie ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV54HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV55HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV56HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV57HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcDsc, HreAcPie, HreAcMtr, HreAcKgm, HreAcCli, HreAcNumC, HreAcCol, HreAcSer, HreAcPar, HreAcReo," ;
      scmdbuf += " HreAcCod FROM TXPHISHRA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?)) or ( UPPER(HreAcSer) like '%' || UPPER(?)) or ( UPPER(HreAcDsc) like '%' || UPPER(?)) or ( UPPER(HreAcCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAcNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcPie,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcSer = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcCol = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) )
      {
         addWhere(sWhereString, "(HreAcNumC >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) )
      {
         addWhere(sWhereString, "(HreAcNumC <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) )
      {
         addWhere(sWhereString, "(HreAcCli >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) )
      {
         addWhere(sWhereString, "(HreAcCli <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) )
      {
         addWhere(sWhereString, "(HreAcPie >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) )
      {
         addWhere(sWhereString, "(HreAcPie <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreAcDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09A85( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                          String AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                          String AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                          String AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                          String AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                          String AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                          String AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                          String AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                          String AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                          int AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ,
                                          int AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ,
                                          int AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ,
                                          int AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ,
                                          java.math.BigDecimal AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                          java.math.BigDecimal AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                          java.math.BigDecimal AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                          java.math.BigDecimal AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                          int AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ,
                                          int AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ,
                                          int A9985HreAcCod ,
                                          byte A9986HreAcReo ,
                                          String A9987HreAcPar ,
                                          String A9992HreAcSer ,
                                          String A9993HreAcDsc ,
                                          String A9994HreAcCol ,
                                          int A9995HreAcNumC ,
                                          int A9991HreAcCli ,
                                          java.math.BigDecimal A9988HreAcKgm ,
                                          java.math.BigDecimal A9989HreAcMtr ,
                                          int A9990HreAcPie ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV54HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV55HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV56HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV57HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCol, HreAcPie, HreAcMtr, HreAcKgm, HreAcCli, HreAcNumC, HreAcDsc, HreAcSer, HreAcPar, HreAcReo," ;
      scmdbuf += " HreAcCod FROM TXPHISHRA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV62Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?)) or ( UPPER(HreAcSer) like '%' || UPPER(?)) or ( UPPER(HreAcDsc) like '%' || UPPER(?)) or ( UPPER(HreAcCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAcNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcPie,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) && ( ! (GXutil.strcmp("", AV65Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcSer = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcCol = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) )
      {
         addWhere(sWhereString, "(HreAcNumC >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV72Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) )
      {
         addWhere(sWhereString, "(HreAcNumC <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) )
      {
         addWhere(sWhereString, "(HreAcCli >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) )
      {
         addWhere(sWhereString, "(HreAcCli <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) )
      {
         addWhere(sWhereString, "(HreAcPie >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) )
      {
         addWhere(sWhereString, "(HreAcPie <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreAcCol" ;
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
                  return conditional_P09A82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() );
            case 1 :
                  return conditional_P09A83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 2 :
                  return conditional_P09A84(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 3 :
                  return conditional_P09A85(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A84", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A85", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(15);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(15);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(15);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(15);
               ((int[]) buf[23])[0] = rslt.getInt(16);
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

