package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrelaciondeformulasgetfilterdata extends GXProcedure
{
   public wcrelaciondeformulasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrelaciondeformulasgetfilterdata.class ), "" );
   }

   public wcrelaciondeformulasgetfilterdata( int remoteHandle ,
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
      wcrelaciondeformulasgetfilterdata.this.aP5 = new String[] {""};
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
      wcrelaciondeformulasgetfilterdata.this.AV28DDOName = aP0;
      wcrelaciondeformulasgetfilterdata.this.AV26SearchTxt = aP1;
      wcrelaciondeformulasgetfilterdata.this.AV27SearchTxtTo = aP2;
      wcrelaciondeformulasgetfilterdata.this.aP3 = aP3;
      wcrelaciondeformulasgetfilterdata.this.aP4 = aP4;
      wcrelaciondeformulasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("WCRelaciondeformulasGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRelaciondeformulasGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WCRelaciondeformulasGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV16TFForSerDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV17TFForSerDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV18TFForColNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV19TFForColNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV20TFForColNum = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFForColNum_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV22TFTipColCod = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFTipColCod_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV24TFTipColDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV25TFTipColDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV44Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPROCOD") == 0 )
         {
            AV45MacProcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPRODSC") == 0 )
         {
            AV46MacProDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV26SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV52Wcrelaciondeformulasds_1_filterfulltext = AV47FilterFullText ;
      AV53Wcrelaciondeformulasds_2_tfclicod = AV10TFCliCod ;
      AV54Wcrelaciondeformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV55Wcrelaciondeformulasds_4_tfclinom = AV12TFCliNom ;
      AV56Wcrelaciondeformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV57Wcrelaciondeformulasds_6_tfforser = AV14TFForSer ;
      AV58Wcrelaciondeformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV59Wcrelaciondeformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV60Wcrelaciondeformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV61Wcrelaciondeformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV62Wcrelaciondeformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV63Wcrelaciondeformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV64Wcrelaciondeformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV65Wcrelaciondeformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV66Wcrelaciondeformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV67Wcrelaciondeformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to) ,
                                           AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                           AV55Wcrelaciondeformulasds_4_tfclinom ,
                                           AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                           AV57Wcrelaciondeformulasds_6_tfforser ,
                                           AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                           AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                           AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                           AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to) ,
                                           AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                           AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           A1514MacProCod ,
                                           AV45MacProcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV55Wcrelaciondeformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV55Wcrelaciondeformulasds_4_tfclinom), 30, "%") ;
      lV57Wcrelaciondeformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV57Wcrelaciondeformulasds_6_tfforser), 16, "%") ;
      lV59Wcrelaciondeformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV59Wcrelaciondeformulasds_8_tfforserdsc), 26, "%") ;
      lV61Wcrelaciondeformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Wcrelaciondeformulasds_10_tfforcolnom), 13, "%") ;
      lV67Wcrelaciondeformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV67Wcrelaciondeformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HO2 */
      pr_default.execute(0, new Object[] {AV44Emprcod, AV45MacProcod, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod), Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to), lV55Wcrelaciondeformulasds_4_tfclinom, AV56Wcrelaciondeformulasds_5_tfclinom_sel, lV57Wcrelaciondeformulasds_6_tfforser, AV58Wcrelaciondeformulasds_7_tfforser_sel, lV59Wcrelaciondeformulasds_8_tfforserdsc, AV60Wcrelaciondeformulasds_9_tfforserdsc_sel, lV61Wcrelaciondeformulasds_10_tfforcolnom, AV62Wcrelaciondeformulasds_11_tfforcolnom_sel, Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum), Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to), Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod), Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to), lV67Wcrelaciondeformulasds_16_tftipcoldsc, AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8HO2 = false ;
         A396EmprCod = P08HO2_A396EmprCod[0] ;
         A1514MacProCod = P08HO2_A1514MacProCod[0] ;
         n1514MacProCod = P08HO2_n1514MacProCod[0] ;
         A279CliNom = P08HO2_A279CliNom[0] ;
         A832TipColDsc = P08HO2_A832TipColDsc[0] ;
         n832TipColDsc = P08HO2_n832TipColDsc[0] ;
         A831TipColCod = P08HO2_A831TipColCod[0] ;
         A483ForColNum = P08HO2_A483ForColNum[0] ;
         A482ForColNom = P08HO2_A482ForColNom[0] ;
         A5742ForSerDsc = P08HO2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08HO2_n5742ForSerDsc[0] ;
         A494ForSer = P08HO2_A494ForSer[0] ;
         A252CliCod = P08HO2_A252CliCod[0] ;
         A832TipColDsc = P08HO2_A832TipColDsc[0] ;
         n832TipColDsc = P08HO2_n832TipColDsc[0] ;
         A279CliNom = P08HO2_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08HO2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8HO2 = false ;
            A396EmprCod = P08HO2_A396EmprCod[0] ;
            A831TipColCod = P08HO2_A831TipColCod[0] ;
            A483ForColNum = P08HO2_A483ForColNum[0] ;
            A482ForColNom = P08HO2_A482ForColNom[0] ;
            A494ForSer = P08HO2_A494ForSer[0] ;
            A252CliCod = P08HO2_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8HO2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV30Option = A279CliNom ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HO2 )
         {
            brk8HO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV26SearchTxt ;
      AV15TFForSer_Sel = "" ;
      AV52Wcrelaciondeformulasds_1_filterfulltext = AV47FilterFullText ;
      AV53Wcrelaciondeformulasds_2_tfclicod = AV10TFCliCod ;
      AV54Wcrelaciondeformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV55Wcrelaciondeformulasds_4_tfclinom = AV12TFCliNom ;
      AV56Wcrelaciondeformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV57Wcrelaciondeformulasds_6_tfforser = AV14TFForSer ;
      AV58Wcrelaciondeformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV59Wcrelaciondeformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV60Wcrelaciondeformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV61Wcrelaciondeformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV62Wcrelaciondeformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV63Wcrelaciondeformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV64Wcrelaciondeformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV65Wcrelaciondeformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV66Wcrelaciondeformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV67Wcrelaciondeformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to) ,
                                           AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                           AV55Wcrelaciondeformulasds_4_tfclinom ,
                                           AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                           AV57Wcrelaciondeformulasds_6_tfforser ,
                                           AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                           AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                           AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                           AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to) ,
                                           AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                           AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           A1514MacProCod ,
                                           AV45MacProcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV55Wcrelaciondeformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV55Wcrelaciondeformulasds_4_tfclinom), 30, "%") ;
      lV57Wcrelaciondeformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV57Wcrelaciondeformulasds_6_tfforser), 16, "%") ;
      lV59Wcrelaciondeformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV59Wcrelaciondeformulasds_8_tfforserdsc), 26, "%") ;
      lV61Wcrelaciondeformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Wcrelaciondeformulasds_10_tfforcolnom), 13, "%") ;
      lV67Wcrelaciondeformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV67Wcrelaciondeformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HO3 */
      pr_default.execute(1, new Object[] {AV44Emprcod, AV45MacProcod, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod), Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to), lV55Wcrelaciondeformulasds_4_tfclinom, AV56Wcrelaciondeformulasds_5_tfclinom_sel, lV57Wcrelaciondeformulasds_6_tfforser, AV58Wcrelaciondeformulasds_7_tfforser_sel, lV59Wcrelaciondeformulasds_8_tfforserdsc, AV60Wcrelaciondeformulasds_9_tfforserdsc_sel, lV61Wcrelaciondeformulasds_10_tfforcolnom, AV62Wcrelaciondeformulasds_11_tfforcolnom_sel, Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum), Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to), Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod), Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to), lV67Wcrelaciondeformulasds_16_tftipcoldsc, AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8HO4 = false ;
         A396EmprCod = P08HO3_A396EmprCod[0] ;
         A1514MacProCod = P08HO3_A1514MacProCod[0] ;
         n1514MacProCod = P08HO3_n1514MacProCod[0] ;
         A494ForSer = P08HO3_A494ForSer[0] ;
         A832TipColDsc = P08HO3_A832TipColDsc[0] ;
         n832TipColDsc = P08HO3_n832TipColDsc[0] ;
         A831TipColCod = P08HO3_A831TipColCod[0] ;
         A483ForColNum = P08HO3_A483ForColNum[0] ;
         A482ForColNom = P08HO3_A482ForColNom[0] ;
         A5742ForSerDsc = P08HO3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08HO3_n5742ForSerDsc[0] ;
         A279CliNom = P08HO3_A279CliNom[0] ;
         A252CliCod = P08HO3_A252CliCod[0] ;
         A832TipColDsc = P08HO3_A832TipColDsc[0] ;
         n832TipColDsc = P08HO3_n832TipColDsc[0] ;
         A279CliNom = P08HO3_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08HO3_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk8HO4 = false ;
            A396EmprCod = P08HO3_A396EmprCod[0] ;
            A831TipColCod = P08HO3_A831TipColCod[0] ;
            A483ForColNum = P08HO3_A483ForColNum[0] ;
            A482ForColNom = P08HO3_A482ForColNom[0] ;
            A252CliCod = P08HO3_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8HO4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV30Option = A494ForSer ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HO4 )
         {
            brk8HO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForSerDsc = AV26SearchTxt ;
      AV17TFForSerDsc_Sel = "" ;
      AV52Wcrelaciondeformulasds_1_filterfulltext = AV47FilterFullText ;
      AV53Wcrelaciondeformulasds_2_tfclicod = AV10TFCliCod ;
      AV54Wcrelaciondeformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV55Wcrelaciondeformulasds_4_tfclinom = AV12TFCliNom ;
      AV56Wcrelaciondeformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV57Wcrelaciondeformulasds_6_tfforser = AV14TFForSer ;
      AV58Wcrelaciondeformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV59Wcrelaciondeformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV60Wcrelaciondeformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV61Wcrelaciondeformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV62Wcrelaciondeformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV63Wcrelaciondeformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV64Wcrelaciondeformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV65Wcrelaciondeformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV66Wcrelaciondeformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV67Wcrelaciondeformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to) ,
                                           AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                           AV55Wcrelaciondeformulasds_4_tfclinom ,
                                           AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                           AV57Wcrelaciondeformulasds_6_tfforser ,
                                           AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                           AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                           AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                           AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to) ,
                                           AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                           AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           A1514MacProCod ,
                                           AV45MacProcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV55Wcrelaciondeformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV55Wcrelaciondeformulasds_4_tfclinom), 30, "%") ;
      lV57Wcrelaciondeformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV57Wcrelaciondeformulasds_6_tfforser), 16, "%") ;
      lV59Wcrelaciondeformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV59Wcrelaciondeformulasds_8_tfforserdsc), 26, "%") ;
      lV61Wcrelaciondeformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Wcrelaciondeformulasds_10_tfforcolnom), 13, "%") ;
      lV67Wcrelaciondeformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV67Wcrelaciondeformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HO4 */
      pr_default.execute(2, new Object[] {AV44Emprcod, AV45MacProcod, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod), Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to), lV55Wcrelaciondeformulasds_4_tfclinom, AV56Wcrelaciondeformulasds_5_tfclinom_sel, lV57Wcrelaciondeformulasds_6_tfforser, AV58Wcrelaciondeformulasds_7_tfforser_sel, lV59Wcrelaciondeformulasds_8_tfforserdsc, AV60Wcrelaciondeformulasds_9_tfforserdsc_sel, lV61Wcrelaciondeformulasds_10_tfforcolnom, AV62Wcrelaciondeformulasds_11_tfforcolnom_sel, Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum), Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to), Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod), Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to), lV67Wcrelaciondeformulasds_16_tftipcoldsc, AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8HO6 = false ;
         A396EmprCod = P08HO4_A396EmprCod[0] ;
         A1514MacProCod = P08HO4_A1514MacProCod[0] ;
         n1514MacProCod = P08HO4_n1514MacProCod[0] ;
         A5742ForSerDsc = P08HO4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08HO4_n5742ForSerDsc[0] ;
         A832TipColDsc = P08HO4_A832TipColDsc[0] ;
         n832TipColDsc = P08HO4_n832TipColDsc[0] ;
         A831TipColCod = P08HO4_A831TipColCod[0] ;
         A483ForColNum = P08HO4_A483ForColNum[0] ;
         A482ForColNom = P08HO4_A482ForColNom[0] ;
         A494ForSer = P08HO4_A494ForSer[0] ;
         A279CliNom = P08HO4_A279CliNom[0] ;
         A252CliCod = P08HO4_A252CliCod[0] ;
         A832TipColDsc = P08HO4_A832TipColDsc[0] ;
         n832TipColDsc = P08HO4_n832TipColDsc[0] ;
         A279CliNom = P08HO4_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08HO4_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk8HO6 = false ;
            A396EmprCod = P08HO4_A396EmprCod[0] ;
            A831TipColCod = P08HO4_A831TipColCod[0] ;
            A483ForColNum = P08HO4_A483ForColNum[0] ;
            A482ForColNom = P08HO4_A482ForColNom[0] ;
            A494ForSer = P08HO4_A494ForSer[0] ;
            A252CliCod = P08HO4_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8HO6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV30Option = A5742ForSerDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HO6 )
         {
            brk8HO6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForColNom = AV26SearchTxt ;
      AV19TFForColNom_Sel = "" ;
      AV52Wcrelaciondeformulasds_1_filterfulltext = AV47FilterFullText ;
      AV53Wcrelaciondeformulasds_2_tfclicod = AV10TFCliCod ;
      AV54Wcrelaciondeformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV55Wcrelaciondeformulasds_4_tfclinom = AV12TFCliNom ;
      AV56Wcrelaciondeformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV57Wcrelaciondeformulasds_6_tfforser = AV14TFForSer ;
      AV58Wcrelaciondeformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV59Wcrelaciondeformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV60Wcrelaciondeformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV61Wcrelaciondeformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV62Wcrelaciondeformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV63Wcrelaciondeformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV64Wcrelaciondeformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV65Wcrelaciondeformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV66Wcrelaciondeformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV67Wcrelaciondeformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to) ,
                                           AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                           AV55Wcrelaciondeformulasds_4_tfclinom ,
                                           AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                           AV57Wcrelaciondeformulasds_6_tfforser ,
                                           AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                           AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                           AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                           AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to) ,
                                           AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                           AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           A1514MacProCod ,
                                           AV45MacProcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV55Wcrelaciondeformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV55Wcrelaciondeformulasds_4_tfclinom), 30, "%") ;
      lV57Wcrelaciondeformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV57Wcrelaciondeformulasds_6_tfforser), 16, "%") ;
      lV59Wcrelaciondeformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV59Wcrelaciondeformulasds_8_tfforserdsc), 26, "%") ;
      lV61Wcrelaciondeformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Wcrelaciondeformulasds_10_tfforcolnom), 13, "%") ;
      lV67Wcrelaciondeformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV67Wcrelaciondeformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HO5 */
      pr_default.execute(3, new Object[] {AV44Emprcod, AV45MacProcod, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod), Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to), lV55Wcrelaciondeformulasds_4_tfclinom, AV56Wcrelaciondeformulasds_5_tfclinom_sel, lV57Wcrelaciondeformulasds_6_tfforser, AV58Wcrelaciondeformulasds_7_tfforser_sel, lV59Wcrelaciondeformulasds_8_tfforserdsc, AV60Wcrelaciondeformulasds_9_tfforserdsc_sel, lV61Wcrelaciondeformulasds_10_tfforcolnom, AV62Wcrelaciondeformulasds_11_tfforcolnom_sel, Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum), Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to), Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod), Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to), lV67Wcrelaciondeformulasds_16_tftipcoldsc, AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8HO8 = false ;
         A396EmprCod = P08HO5_A396EmprCod[0] ;
         A1514MacProCod = P08HO5_A1514MacProCod[0] ;
         n1514MacProCod = P08HO5_n1514MacProCod[0] ;
         A482ForColNom = P08HO5_A482ForColNom[0] ;
         A832TipColDsc = P08HO5_A832TipColDsc[0] ;
         n832TipColDsc = P08HO5_n832TipColDsc[0] ;
         A831TipColCod = P08HO5_A831TipColCod[0] ;
         A483ForColNum = P08HO5_A483ForColNum[0] ;
         A5742ForSerDsc = P08HO5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08HO5_n5742ForSerDsc[0] ;
         A494ForSer = P08HO5_A494ForSer[0] ;
         A279CliNom = P08HO5_A279CliNom[0] ;
         A252CliCod = P08HO5_A252CliCod[0] ;
         A832TipColDsc = P08HO5_A832TipColDsc[0] ;
         n832TipColDsc = P08HO5_n832TipColDsc[0] ;
         A279CliNom = P08HO5_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08HO5_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk8HO8 = false ;
            A396EmprCod = P08HO5_A396EmprCod[0] ;
            A831TipColCod = P08HO5_A831TipColCod[0] ;
            A483ForColNum = P08HO5_A483ForColNum[0] ;
            A494ForSer = P08HO5_A494ForSer[0] ;
            A252CliCod = P08HO5_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8HO8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV30Option = A482ForColNom ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HO8 )
         {
            brk8HO8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFTipColDsc = AV26SearchTxt ;
      AV25TFTipColDsc_Sel = "" ;
      AV52Wcrelaciondeformulasds_1_filterfulltext = AV47FilterFullText ;
      AV53Wcrelaciondeformulasds_2_tfclicod = AV10TFCliCod ;
      AV54Wcrelaciondeformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV55Wcrelaciondeformulasds_4_tfclinom = AV12TFCliNom ;
      AV56Wcrelaciondeformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV57Wcrelaciondeformulasds_6_tfforser = AV14TFForSer ;
      AV58Wcrelaciondeformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV59Wcrelaciondeformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV60Wcrelaciondeformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV61Wcrelaciondeformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV62Wcrelaciondeformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV63Wcrelaciondeformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV64Wcrelaciondeformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV65Wcrelaciondeformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV66Wcrelaciondeformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV67Wcrelaciondeformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to) ,
                                           AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                           AV55Wcrelaciondeformulasds_4_tfclinom ,
                                           AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                           AV57Wcrelaciondeformulasds_6_tfforser ,
                                           AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                           AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                           AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                           AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to) ,
                                           AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                           AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV45MacProcod ,
                                           AV44Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcrelaciondeformulasds_1_filterfulltext), "%", "") ;
      lV55Wcrelaciondeformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV55Wcrelaciondeformulasds_4_tfclinom), 30, "%") ;
      lV57Wcrelaciondeformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV57Wcrelaciondeformulasds_6_tfforser), 16, "%") ;
      lV59Wcrelaciondeformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV59Wcrelaciondeformulasds_8_tfforserdsc), 26, "%") ;
      lV61Wcrelaciondeformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Wcrelaciondeformulasds_10_tfforcolnom), 13, "%") ;
      lV67Wcrelaciondeformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV67Wcrelaciondeformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HO6 */
      pr_default.execute(4, new Object[] {AV44Emprcod, AV45MacProcod, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, lV52Wcrelaciondeformulasds_1_filterfulltext, Integer.valueOf(AV53Wcrelaciondeformulasds_2_tfclicod), Integer.valueOf(AV54Wcrelaciondeformulasds_3_tfclicod_to), lV55Wcrelaciondeformulasds_4_tfclinom, AV56Wcrelaciondeformulasds_5_tfclinom_sel, lV57Wcrelaciondeformulasds_6_tfforser, AV58Wcrelaciondeformulasds_7_tfforser_sel, lV59Wcrelaciondeformulasds_8_tfforserdsc, AV60Wcrelaciondeformulasds_9_tfforserdsc_sel, lV61Wcrelaciondeformulasds_10_tfforcolnom, AV62Wcrelaciondeformulasds_11_tfforcolnom_sel, Integer.valueOf(AV63Wcrelaciondeformulasds_12_tfforcolnum), Integer.valueOf(AV64Wcrelaciondeformulasds_13_tfforcolnum_to), Byte.valueOf(AV65Wcrelaciondeformulasds_14_tftipcolcod), Byte.valueOf(AV66Wcrelaciondeformulasds_15_tftipcolcod_to), lV67Wcrelaciondeformulasds_16_tftipcoldsc, AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8HO10 = false ;
         A831TipColCod = P08HO6_A831TipColCod[0] ;
         A396EmprCod = P08HO6_A396EmprCod[0] ;
         A1514MacProCod = P08HO6_A1514MacProCod[0] ;
         n1514MacProCod = P08HO6_n1514MacProCod[0] ;
         A832TipColDsc = P08HO6_A832TipColDsc[0] ;
         n832TipColDsc = P08HO6_n832TipColDsc[0] ;
         A483ForColNum = P08HO6_A483ForColNum[0] ;
         A482ForColNom = P08HO6_A482ForColNom[0] ;
         A5742ForSerDsc = P08HO6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08HO6_n5742ForSerDsc[0] ;
         A494ForSer = P08HO6_A494ForSer[0] ;
         A279CliNom = P08HO6_A279CliNom[0] ;
         A252CliCod = P08HO6_A252CliCod[0] ;
         A832TipColDsc = P08HO6_A832TipColDsc[0] ;
         n832TipColDsc = P08HO6_n832TipColDsc[0] ;
         A279CliNom = P08HO6_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08HO6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08HO6_A831TipColCod[0] == A831TipColCod ) )
         {
            brk8HO10 = false ;
            A483ForColNum = P08HO6_A483ForColNum[0] ;
            A482ForColNom = P08HO6_A482ForColNom[0] ;
            A494ForSer = P08HO6_A494ForSer[0] ;
            A252CliCod = P08HO6_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8HO10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
         {
            AV30Option = A832TipColDsc ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            AV31Options.add(AV30Option, AV29InsertIndex);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HO10 )
         {
            brk8HO10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcrelaciondeformulasgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wcrelaciondeformulasgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wcrelaciondeformulasgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFForSer = "" ;
      AV15TFForSer_Sel = "" ;
      AV16TFForSerDsc = "" ;
      AV17TFForSerDsc_Sel = "" ;
      AV18TFForColNom = "" ;
      AV19TFForColNom_Sel = "" ;
      AV24TFTipColDsc = "" ;
      AV25TFTipColDsc_Sel = "" ;
      AV44Emprcod = "" ;
      AV45MacProcod = "" ;
      AV46MacProDsc = "" ;
      A279CliNom = "" ;
      AV52Wcrelaciondeformulasds_1_filterfulltext = "" ;
      AV55Wcrelaciondeformulasds_4_tfclinom = "" ;
      AV56Wcrelaciondeformulasds_5_tfclinom_sel = "" ;
      AV57Wcrelaciondeformulasds_6_tfforser = "" ;
      AV58Wcrelaciondeformulasds_7_tfforser_sel = "" ;
      AV59Wcrelaciondeformulasds_8_tfforserdsc = "" ;
      AV60Wcrelaciondeformulasds_9_tfforserdsc_sel = "" ;
      AV61Wcrelaciondeformulasds_10_tfforcolnom = "" ;
      AV62Wcrelaciondeformulasds_11_tfforcolnom_sel = "" ;
      AV67Wcrelaciondeformulasds_16_tftipcoldsc = "" ;
      AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV52Wcrelaciondeformulasds_1_filterfulltext = "" ;
      lV55Wcrelaciondeformulasds_4_tfclinom = "" ;
      lV57Wcrelaciondeformulasds_6_tfforser = "" ;
      lV59Wcrelaciondeformulasds_8_tfforserdsc = "" ;
      lV61Wcrelaciondeformulasds_10_tfforcolnom = "" ;
      lV67Wcrelaciondeformulasds_16_tftipcoldsc = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A396EmprCod = "" ;
      A1514MacProCod = "" ;
      P08HO2_A396EmprCod = new String[] {""} ;
      P08HO2_A1514MacProCod = new String[] {""} ;
      P08HO2_n1514MacProCod = new boolean[] {false} ;
      P08HO2_A279CliNom = new String[] {""} ;
      P08HO2_A832TipColDsc = new String[] {""} ;
      P08HO2_n832TipColDsc = new boolean[] {false} ;
      P08HO2_A831TipColCod = new byte[1] ;
      P08HO2_A483ForColNum = new int[1] ;
      P08HO2_A482ForColNom = new String[] {""} ;
      P08HO2_A5742ForSerDsc = new String[] {""} ;
      P08HO2_n5742ForSerDsc = new boolean[] {false} ;
      P08HO2_A494ForSer = new String[] {""} ;
      P08HO2_A252CliCod = new int[1] ;
      AV30Option = "" ;
      P08HO3_A396EmprCod = new String[] {""} ;
      P08HO3_A1514MacProCod = new String[] {""} ;
      P08HO3_n1514MacProCod = new boolean[] {false} ;
      P08HO3_A494ForSer = new String[] {""} ;
      P08HO3_A832TipColDsc = new String[] {""} ;
      P08HO3_n832TipColDsc = new boolean[] {false} ;
      P08HO3_A831TipColCod = new byte[1] ;
      P08HO3_A483ForColNum = new int[1] ;
      P08HO3_A482ForColNom = new String[] {""} ;
      P08HO3_A5742ForSerDsc = new String[] {""} ;
      P08HO3_n5742ForSerDsc = new boolean[] {false} ;
      P08HO3_A279CliNom = new String[] {""} ;
      P08HO3_A252CliCod = new int[1] ;
      P08HO4_A396EmprCod = new String[] {""} ;
      P08HO4_A1514MacProCod = new String[] {""} ;
      P08HO4_n1514MacProCod = new boolean[] {false} ;
      P08HO4_A5742ForSerDsc = new String[] {""} ;
      P08HO4_n5742ForSerDsc = new boolean[] {false} ;
      P08HO4_A832TipColDsc = new String[] {""} ;
      P08HO4_n832TipColDsc = new boolean[] {false} ;
      P08HO4_A831TipColCod = new byte[1] ;
      P08HO4_A483ForColNum = new int[1] ;
      P08HO4_A482ForColNom = new String[] {""} ;
      P08HO4_A494ForSer = new String[] {""} ;
      P08HO4_A279CliNom = new String[] {""} ;
      P08HO4_A252CliCod = new int[1] ;
      P08HO5_A396EmprCod = new String[] {""} ;
      P08HO5_A1514MacProCod = new String[] {""} ;
      P08HO5_n1514MacProCod = new boolean[] {false} ;
      P08HO5_A482ForColNom = new String[] {""} ;
      P08HO5_A832TipColDsc = new String[] {""} ;
      P08HO5_n832TipColDsc = new boolean[] {false} ;
      P08HO5_A831TipColCod = new byte[1] ;
      P08HO5_A483ForColNum = new int[1] ;
      P08HO5_A5742ForSerDsc = new String[] {""} ;
      P08HO5_n5742ForSerDsc = new boolean[] {false} ;
      P08HO5_A494ForSer = new String[] {""} ;
      P08HO5_A279CliNom = new String[] {""} ;
      P08HO5_A252CliCod = new int[1] ;
      P08HO6_A831TipColCod = new byte[1] ;
      P08HO6_A396EmprCod = new String[] {""} ;
      P08HO6_A1514MacProCod = new String[] {""} ;
      P08HO6_n1514MacProCod = new boolean[] {false} ;
      P08HO6_A832TipColDsc = new String[] {""} ;
      P08HO6_n832TipColDsc = new boolean[] {false} ;
      P08HO6_A483ForColNum = new int[1] ;
      P08HO6_A482ForColNom = new String[] {""} ;
      P08HO6_A5742ForSerDsc = new String[] {""} ;
      P08HO6_n5742ForSerDsc = new boolean[] {false} ;
      P08HO6_A494ForSer = new String[] {""} ;
      P08HO6_A279CliNom = new String[] {""} ;
      P08HO6_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrelaciondeformulasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08HO2_A396EmprCod, P08HO2_A1514MacProCod, P08HO2_n1514MacProCod, P08HO2_A279CliNom, P08HO2_A832TipColDsc, P08HO2_n832TipColDsc, P08HO2_A831TipColCod, P08HO2_A483ForColNum, P08HO2_A482ForColNom, P08HO2_A5742ForSerDsc,
            P08HO2_n5742ForSerDsc, P08HO2_A494ForSer, P08HO2_A252CliCod
            }
            , new Object[] {
            P08HO3_A396EmprCod, P08HO3_A1514MacProCod, P08HO3_n1514MacProCod, P08HO3_A494ForSer, P08HO3_A832TipColDsc, P08HO3_n832TipColDsc, P08HO3_A831TipColCod, P08HO3_A483ForColNum, P08HO3_A482ForColNom, P08HO3_A5742ForSerDsc,
            P08HO3_n5742ForSerDsc, P08HO3_A279CliNom, P08HO3_A252CliCod
            }
            , new Object[] {
            P08HO4_A396EmprCod, P08HO4_A1514MacProCod, P08HO4_n1514MacProCod, P08HO4_A5742ForSerDsc, P08HO4_n5742ForSerDsc, P08HO4_A832TipColDsc, P08HO4_n832TipColDsc, P08HO4_A831TipColCod, P08HO4_A483ForColNum, P08HO4_A482ForColNom,
            P08HO4_A494ForSer, P08HO4_A279CliNom, P08HO4_A252CliCod
            }
            , new Object[] {
            P08HO5_A396EmprCod, P08HO5_A1514MacProCod, P08HO5_n1514MacProCod, P08HO5_A482ForColNom, P08HO5_A832TipColDsc, P08HO5_n832TipColDsc, P08HO5_A831TipColCod, P08HO5_A483ForColNum, P08HO5_A5742ForSerDsc, P08HO5_n5742ForSerDsc,
            P08HO5_A494ForSer, P08HO5_A279CliNom, P08HO5_A252CliCod
            }
            , new Object[] {
            P08HO6_A831TipColCod, P08HO6_A396EmprCod, P08HO6_A1514MacProCod, P08HO6_n1514MacProCod, P08HO6_A832TipColDsc, P08HO6_n832TipColDsc, P08HO6_A483ForColNum, P08HO6_A482ForColNom, P08HO6_A5742ForSerDsc, P08HO6_n5742ForSerDsc,
            P08HO6_A494ForSer, P08HO6_A279CliNom, P08HO6_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFTipColCod ;
   private byte AV23TFTipColCod_To ;
   private byte AV65Wcrelaciondeformulasds_14_tftipcolcod ;
   private byte AV66Wcrelaciondeformulasds_15_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV50GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV20TFForColNum ;
   private int AV21TFForColNum_To ;
   private int AV53Wcrelaciondeformulasds_2_tfclicod ;
   private int AV54Wcrelaciondeformulasds_3_tfclicod_to ;
   private int AV63Wcrelaciondeformulasds_12_tfforcolnum ;
   private int AV64Wcrelaciondeformulasds_13_tfforcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFForSer ;
   private String AV15TFForSer_Sel ;
   private String AV16TFForSerDsc ;
   private String AV17TFForSerDsc_Sel ;
   private String AV18TFForColNom ;
   private String AV19TFForColNom_Sel ;
   private String AV24TFTipColDsc ;
   private String AV25TFTipColDsc_Sel ;
   private String AV44Emprcod ;
   private String AV45MacProcod ;
   private String AV46MacProDsc ;
   private String A279CliNom ;
   private String AV55Wcrelaciondeformulasds_4_tfclinom ;
   private String AV56Wcrelaciondeformulasds_5_tfclinom_sel ;
   private String AV57Wcrelaciondeformulasds_6_tfforser ;
   private String AV58Wcrelaciondeformulasds_7_tfforser_sel ;
   private String AV59Wcrelaciondeformulasds_8_tfforserdsc ;
   private String AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ;
   private String AV61Wcrelaciondeformulasds_10_tfforcolnom ;
   private String AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ;
   private String AV67Wcrelaciondeformulasds_16_tftipcoldsc ;
   private String AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV55Wcrelaciondeformulasds_4_tfclinom ;
   private String lV57Wcrelaciondeformulasds_6_tfforser ;
   private String lV59Wcrelaciondeformulasds_8_tfforserdsc ;
   private String lV61Wcrelaciondeformulasds_10_tfforcolnom ;
   private String lV67Wcrelaciondeformulasds_16_tftipcoldsc ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private boolean returnInSub ;
   private boolean brk8HO2 ;
   private boolean n1514MacProCod ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private boolean brk8HO4 ;
   private boolean brk8HO6 ;
   private boolean brk8HO8 ;
   private boolean brk8HO10 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV47FilterFullText ;
   private String AV52Wcrelaciondeformulasds_1_filterfulltext ;
   private String lV52Wcrelaciondeformulasds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HO2_A396EmprCod ;
   private String[] P08HO2_A1514MacProCod ;
   private boolean[] P08HO2_n1514MacProCod ;
   private String[] P08HO2_A279CliNom ;
   private String[] P08HO2_A832TipColDsc ;
   private boolean[] P08HO2_n832TipColDsc ;
   private byte[] P08HO2_A831TipColCod ;
   private int[] P08HO2_A483ForColNum ;
   private String[] P08HO2_A482ForColNom ;
   private String[] P08HO2_A5742ForSerDsc ;
   private boolean[] P08HO2_n5742ForSerDsc ;
   private String[] P08HO2_A494ForSer ;
   private int[] P08HO2_A252CliCod ;
   private String[] P08HO3_A396EmprCod ;
   private String[] P08HO3_A1514MacProCod ;
   private boolean[] P08HO3_n1514MacProCod ;
   private String[] P08HO3_A494ForSer ;
   private String[] P08HO3_A832TipColDsc ;
   private boolean[] P08HO3_n832TipColDsc ;
   private byte[] P08HO3_A831TipColCod ;
   private int[] P08HO3_A483ForColNum ;
   private String[] P08HO3_A482ForColNom ;
   private String[] P08HO3_A5742ForSerDsc ;
   private boolean[] P08HO3_n5742ForSerDsc ;
   private String[] P08HO3_A279CliNom ;
   private int[] P08HO3_A252CliCod ;
   private String[] P08HO4_A396EmprCod ;
   private String[] P08HO4_A1514MacProCod ;
   private boolean[] P08HO4_n1514MacProCod ;
   private String[] P08HO4_A5742ForSerDsc ;
   private boolean[] P08HO4_n5742ForSerDsc ;
   private String[] P08HO4_A832TipColDsc ;
   private boolean[] P08HO4_n832TipColDsc ;
   private byte[] P08HO4_A831TipColCod ;
   private int[] P08HO4_A483ForColNum ;
   private String[] P08HO4_A482ForColNom ;
   private String[] P08HO4_A494ForSer ;
   private String[] P08HO4_A279CliNom ;
   private int[] P08HO4_A252CliCod ;
   private String[] P08HO5_A396EmprCod ;
   private String[] P08HO5_A1514MacProCod ;
   private boolean[] P08HO5_n1514MacProCod ;
   private String[] P08HO5_A482ForColNom ;
   private String[] P08HO5_A832TipColDsc ;
   private boolean[] P08HO5_n832TipColDsc ;
   private byte[] P08HO5_A831TipColCod ;
   private int[] P08HO5_A483ForColNum ;
   private String[] P08HO5_A5742ForSerDsc ;
   private boolean[] P08HO5_n5742ForSerDsc ;
   private String[] P08HO5_A494ForSer ;
   private String[] P08HO5_A279CliNom ;
   private int[] P08HO5_A252CliCod ;
   private byte[] P08HO6_A831TipColCod ;
   private String[] P08HO6_A396EmprCod ;
   private String[] P08HO6_A1514MacProCod ;
   private boolean[] P08HO6_n1514MacProCod ;
   private String[] P08HO6_A832TipColDsc ;
   private boolean[] P08HO6_n832TipColDsc ;
   private int[] P08HO6_A483ForColNum ;
   private String[] P08HO6_A482ForColNom ;
   private String[] P08HO6_A5742ForSerDsc ;
   private boolean[] P08HO6_n5742ForSerDsc ;
   private String[] P08HO6_A494ForSer ;
   private String[] P08HO6_A279CliNom ;
   private int[] P08HO6_A252CliCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wcrelaciondeformulasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                          int AV53Wcrelaciondeformulasds_2_tfclicod ,
                                          int AV54Wcrelaciondeformulasds_3_tfclicod_to ,
                                          String AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                          String AV55Wcrelaciondeformulasds_4_tfclinom ,
                                          String AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                          String AV57Wcrelaciondeformulasds_6_tfforser ,
                                          String AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                          String AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                          String AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                          String AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                          int AV63Wcrelaciondeformulasds_12_tfforcolnum ,
                                          int AV64Wcrelaciondeformulasds_13_tfforcolnum_to ,
                                          byte AV65Wcrelaciondeformulasds_14_tftipcolcod ,
                                          byte AV66Wcrelaciondeformulasds_15_tftipcolcod_to ,
                                          String AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                          String AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String A1514MacProCod ,
                                          String AV45MacProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[26];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T3.CliNom, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod FROM ((TXPCFORMU T1 INNER" ;
      scmdbuf += " JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcrelaciondeformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcrelaciondeformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Wcrelaciondeformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcrelaciondeformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcrelaciondeformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelaciondeformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelaciondeformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrelaciondeformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrelaciondeformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrelaciondeformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcrelaciondeformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcrelaciondeformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08HO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                          int AV53Wcrelaciondeformulasds_2_tfclicod ,
                                          int AV54Wcrelaciondeformulasds_3_tfclicod_to ,
                                          String AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                          String AV55Wcrelaciondeformulasds_4_tfclinom ,
                                          String AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                          String AV57Wcrelaciondeformulasds_6_tfforser ,
                                          String AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                          String AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                          String AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                          String AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                          int AV63Wcrelaciondeformulasds_12_tfforcolnum ,
                                          int AV64Wcrelaciondeformulasds_13_tfforcolnum_to ,
                                          byte AV65Wcrelaciondeformulasds_14_tftipcolcod ,
                                          byte AV66Wcrelaciondeformulasds_15_tftipcolcod_to ,
                                          String AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                          String AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String A1514MacProCod ,
                                          String AV45MacProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[26];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.ForSer, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1 INNER" ;
      scmdbuf += " JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcrelaciondeformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcrelaciondeformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Wcrelaciondeformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcrelaciondeformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcrelaciondeformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelaciondeformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelaciondeformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrelaciondeformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrelaciondeformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrelaciondeformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcrelaciondeformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcrelaciondeformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08HO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                          int AV53Wcrelaciondeformulasds_2_tfclicod ,
                                          int AV54Wcrelaciondeformulasds_3_tfclicod_to ,
                                          String AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                          String AV55Wcrelaciondeformulasds_4_tfclinom ,
                                          String AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                          String AV57Wcrelaciondeformulasds_6_tfforser ,
                                          String AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                          String AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                          String AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                          String AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                          int AV63Wcrelaciondeformulasds_12_tfforcolnum ,
                                          int AV64Wcrelaciondeformulasds_13_tfforcolnum_to ,
                                          byte AV65Wcrelaciondeformulasds_14_tftipcolcod ,
                                          byte AV66Wcrelaciondeformulasds_15_tftipcolcod_to ,
                                          String AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                          String AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String A1514MacProCod ,
                                          String AV45MacProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.ForSerDsc, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1 INNER" ;
      scmdbuf += " JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcrelaciondeformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcrelaciondeformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Wcrelaciondeformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcrelaciondeformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcrelaciondeformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelaciondeformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelaciondeformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrelaciondeformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrelaciondeformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrelaciondeformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcrelaciondeformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcrelaciondeformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08HO5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                          int AV53Wcrelaciondeformulasds_2_tfclicod ,
                                          int AV54Wcrelaciondeformulasds_3_tfclicod_to ,
                                          String AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                          String AV55Wcrelaciondeformulasds_4_tfclinom ,
                                          String AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                          String AV57Wcrelaciondeformulasds_6_tfforser ,
                                          String AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                          String AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                          String AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                          String AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                          int AV63Wcrelaciondeformulasds_12_tfforcolnum ,
                                          int AV64Wcrelaciondeformulasds_13_tfforcolnum_to ,
                                          byte AV65Wcrelaciondeformulasds_14_tftipcolcod ,
                                          byte AV66Wcrelaciondeformulasds_15_tftipcolcod_to ,
                                          String AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                          String AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String A1514MacProCod ,
                                          String AV45MacProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[26];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.ForColNom, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1 INNER" ;
      scmdbuf += " JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcrelaciondeformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcrelaciondeformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Wcrelaciondeformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcrelaciondeformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcrelaciondeformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelaciondeformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelaciondeformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrelaciondeformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrelaciondeformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrelaciondeformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcrelaciondeformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcrelaciondeformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08HO6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcrelaciondeformulasds_1_filterfulltext ,
                                          int AV53Wcrelaciondeformulasds_2_tfclicod ,
                                          int AV54Wcrelaciondeformulasds_3_tfclicod_to ,
                                          String AV56Wcrelaciondeformulasds_5_tfclinom_sel ,
                                          String AV55Wcrelaciondeformulasds_4_tfclinom ,
                                          String AV58Wcrelaciondeformulasds_7_tfforser_sel ,
                                          String AV57Wcrelaciondeformulasds_6_tfforser ,
                                          String AV60Wcrelaciondeformulasds_9_tfforserdsc_sel ,
                                          String AV59Wcrelaciondeformulasds_8_tfforserdsc ,
                                          String AV62Wcrelaciondeformulasds_11_tfforcolnom_sel ,
                                          String AV61Wcrelaciondeformulasds_10_tfforcolnom ,
                                          int AV63Wcrelaciondeformulasds_12_tfforcolnum ,
                                          int AV64Wcrelaciondeformulasds_13_tfforcolnum_to ,
                                          byte AV65Wcrelaciondeformulasds_14_tftipcolcod ,
                                          byte AV66Wcrelaciondeformulasds_15_tftipcolcod_to ,
                                          String AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel ,
                                          String AV67Wcrelaciondeformulasds_16_tftipcoldsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV45MacProcod ,
                                          String AV44Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[26];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.TipColCod, T1.EmprCod, T1.MacProCod, T2.TipColDsc, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1 INNER" ;
      scmdbuf += " JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcrelaciondeformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcrelaciondeformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Wcrelaciondeformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcrelaciondeformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcrelaciondeformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcrelaciondeformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcrelaciondeformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelaciondeformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelaciondeformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelaciondeformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelaciondeformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrelaciondeformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrelaciondeformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrelaciondeformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcrelaciondeformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcrelaciondeformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcrelaciondeformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipColCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08HO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 1 :
                  return conditional_P08HO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 2 :
                  return conditional_P08HO4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 3 :
                  return conditional_P08HO5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 4 :
                  return conditional_P08HO6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HO5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HO6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               return;
      }
   }

}

