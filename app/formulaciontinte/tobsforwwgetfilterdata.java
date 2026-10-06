package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tobsforwwgetfilterdata extends GXProcedure
{
   public tobsforwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tobsforwwgetfilterdata.class ), "" );
   }

   public tobsforwwgetfilterdata( int remoteHandle ,
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
      tobsforwwgetfilterdata.this.aP5 = new String[] {""};
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
      tobsforwwgetfilterdata.this.AV24DDOName = aP0;
      tobsforwwgetfilterdata.this.AV22SearchTxt = aP1;
      tobsforwwgetfilterdata.this.AV23SearchTxtTo = aP2;
      tobsforwwgetfilterdata.this.aP3 = aP3;
      tobsforwwgetfilterdata.this.aP4 = aP4;
      tobsforwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_FORCURVA") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCURVAOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("FormulacionTinte.TOBSFORWWGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TOBSFORWWGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("FormulacionTinte.TOBSFORWWGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV51FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV12TFForSer = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV13TFForSer_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV14TFForColNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV15TFForColNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV16TFForColNum = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFForColNum_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV18TFTipColCod = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFTipColCod_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCURVA") == 0 )
         {
            AV20TFForCurva = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCURVA_SEL") == 0 )
         {
            AV21TFForCurva_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV12TFForSer = AV22SearchTxt ;
      AV13TFForSer_Sel = "" ;
      AV56Formulaciontinte_tobsforwwds_1_filterfulltext = AV51FilterFullText ;
      AV57Formulaciontinte_tobsforwwds_2_tfclicod = AV10TFCliCod ;
      AV58Formulaciontinte_tobsforwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Formulaciontinte_tobsforwwds_4_tfforser = AV12TFForSer ;
      AV60Formulaciontinte_tobsforwwds_5_tfforser_sel = AV13TFForSer_Sel ;
      AV61Formulaciontinte_tobsforwwds_6_tfforcolnom = AV14TFForColNom ;
      AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = AV15TFForColNom_Sel ;
      AV63Formulaciontinte_tobsforwwds_8_tfforcolnum = AV16TFForColNum ;
      AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to = AV17TFForColNum_To ;
      AV65Formulaciontinte_tobsforwwds_10_tftipcolcod = AV18TFTipColCod ;
      AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to = AV19TFTipColCod_To ;
      AV67Formulaciontinte_tobsforwwds_12_tfforcurva = AV20TFForCurva ;
      AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel = AV21TFForCurva_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_tobsforwwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Formulaciontinte_tobsforwwds_3_tfclicod_to) ,
                                           AV60Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                           AV59Formulaciontinte_tobsforwwds_4_tfforser ,
                                           AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                           AV61Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                           Integer.valueOf(AV63Formulaciontinte_tobsforwwds_8_tfforcolnum) ,
                                           Integer.valueOf(AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Formulaciontinte_tobsforwwds_10_tftipcolcod) ,
                                           Byte.valueOf(AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to) ,
                                           AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                           AV67Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A12200ForCurva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_tobsforwwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_tobsforwwds_4_tfforser), 16, "%") ;
      lV61Formulaciontinte_tobsforwwds_6_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_tobsforwwds_6_tfforcolnom), 13, "%") ;
      lV67Formulaciontinte_tobsforwwds_12_tfforcurva = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_tobsforwwds_12_tfforcurva), 128, "%") ;
      /* Using cursor P08KO2 */
      pr_default.execute(0, new Object[] {lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_tobsforwwds_2_tfclicod), Integer.valueOf(AV58Formulaciontinte_tobsforwwds_3_tfclicod_to), lV59Formulaciontinte_tobsforwwds_4_tfforser, AV60Formulaciontinte_tobsforwwds_5_tfforser_sel, lV61Formulaciontinte_tobsforwwds_6_tfforcolnom, AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel, Integer.valueOf(AV63Formulaciontinte_tobsforwwds_8_tfforcolnum), Integer.valueOf(AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to), Byte.valueOf(AV65Formulaciontinte_tobsforwwds_10_tftipcolcod), Byte.valueOf(AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to), lV67Formulaciontinte_tobsforwwds_12_tfforcurva, AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8KO2 = false ;
         A494ForSer = P08KO2_A494ForSer[0] ;
         A12200ForCurva = P08KO2_A12200ForCurva[0] ;
         n12200ForCurva = P08KO2_n12200ForCurva[0] ;
         A831TipColCod = P08KO2_A831TipColCod[0] ;
         A483ForColNum = P08KO2_A483ForColNum[0] ;
         A482ForColNom = P08KO2_A482ForColNom[0] ;
         A252CliCod = P08KO2_A252CliCod[0] ;
         A396EmprCod = P08KO2_A396EmprCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08KO2_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk8KO2 = false ;
            A831TipColCod = P08KO2_A831TipColCod[0] ;
            A483ForColNum = P08KO2_A483ForColNum[0] ;
            A482ForColNom = P08KO2_A482ForColNom[0] ;
            A252CliCod = P08KO2_A252CliCod[0] ;
            A396EmprCod = P08KO2_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8KO2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV26Option = A494ForSer ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KO2 )
         {
            brk8KO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFForColNom = AV22SearchTxt ;
      AV15TFForColNom_Sel = "" ;
      AV56Formulaciontinte_tobsforwwds_1_filterfulltext = AV51FilterFullText ;
      AV57Formulaciontinte_tobsforwwds_2_tfclicod = AV10TFCliCod ;
      AV58Formulaciontinte_tobsforwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Formulaciontinte_tobsforwwds_4_tfforser = AV12TFForSer ;
      AV60Formulaciontinte_tobsforwwds_5_tfforser_sel = AV13TFForSer_Sel ;
      AV61Formulaciontinte_tobsforwwds_6_tfforcolnom = AV14TFForColNom ;
      AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = AV15TFForColNom_Sel ;
      AV63Formulaciontinte_tobsforwwds_8_tfforcolnum = AV16TFForColNum ;
      AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to = AV17TFForColNum_To ;
      AV65Formulaciontinte_tobsforwwds_10_tftipcolcod = AV18TFTipColCod ;
      AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to = AV19TFTipColCod_To ;
      AV67Formulaciontinte_tobsforwwds_12_tfforcurva = AV20TFForCurva ;
      AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel = AV21TFForCurva_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_tobsforwwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Formulaciontinte_tobsforwwds_3_tfclicod_to) ,
                                           AV60Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                           AV59Formulaciontinte_tobsforwwds_4_tfforser ,
                                           AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                           AV61Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                           Integer.valueOf(AV63Formulaciontinte_tobsforwwds_8_tfforcolnum) ,
                                           Integer.valueOf(AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Formulaciontinte_tobsforwwds_10_tftipcolcod) ,
                                           Byte.valueOf(AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to) ,
                                           AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                           AV67Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A12200ForCurva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_tobsforwwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_tobsforwwds_4_tfforser), 16, "%") ;
      lV61Formulaciontinte_tobsforwwds_6_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_tobsforwwds_6_tfforcolnom), 13, "%") ;
      lV67Formulaciontinte_tobsforwwds_12_tfforcurva = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_tobsforwwds_12_tfforcurva), 128, "%") ;
      /* Using cursor P08KO3 */
      pr_default.execute(1, new Object[] {lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_tobsforwwds_2_tfclicod), Integer.valueOf(AV58Formulaciontinte_tobsforwwds_3_tfclicod_to), lV59Formulaciontinte_tobsforwwds_4_tfforser, AV60Formulaciontinte_tobsforwwds_5_tfforser_sel, lV61Formulaciontinte_tobsforwwds_6_tfforcolnom, AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel, Integer.valueOf(AV63Formulaciontinte_tobsforwwds_8_tfforcolnum), Integer.valueOf(AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to), Byte.valueOf(AV65Formulaciontinte_tobsforwwds_10_tftipcolcod), Byte.valueOf(AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to), lV67Formulaciontinte_tobsforwwds_12_tfforcurva, AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8KO4 = false ;
         A482ForColNom = P08KO3_A482ForColNom[0] ;
         A12200ForCurva = P08KO3_A12200ForCurva[0] ;
         n12200ForCurva = P08KO3_n12200ForCurva[0] ;
         A831TipColCod = P08KO3_A831TipColCod[0] ;
         A483ForColNum = P08KO3_A483ForColNum[0] ;
         A494ForSer = P08KO3_A494ForSer[0] ;
         A252CliCod = P08KO3_A252CliCod[0] ;
         A396EmprCod = P08KO3_A396EmprCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08KO3_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk8KO4 = false ;
            A831TipColCod = P08KO3_A831TipColCod[0] ;
            A483ForColNum = P08KO3_A483ForColNum[0] ;
            A494ForSer = P08KO3_A494ForSer[0] ;
            A252CliCod = P08KO3_A252CliCod[0] ;
            A396EmprCod = P08KO3_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8KO4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV26Option = A482ForColNom ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KO4 )
         {
            brk8KO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORCURVAOPTIONS' Routine */
      returnInSub = false ;
      AV20TFForCurva = AV22SearchTxt ;
      AV21TFForCurva_Sel = "" ;
      AV56Formulaciontinte_tobsforwwds_1_filterfulltext = AV51FilterFullText ;
      AV57Formulaciontinte_tobsforwwds_2_tfclicod = AV10TFCliCod ;
      AV58Formulaciontinte_tobsforwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Formulaciontinte_tobsforwwds_4_tfforser = AV12TFForSer ;
      AV60Formulaciontinte_tobsforwwds_5_tfforser_sel = AV13TFForSer_Sel ;
      AV61Formulaciontinte_tobsforwwds_6_tfforcolnom = AV14TFForColNom ;
      AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = AV15TFForColNom_Sel ;
      AV63Formulaciontinte_tobsforwwds_8_tfforcolnum = AV16TFForColNum ;
      AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to = AV17TFForColNum_To ;
      AV65Formulaciontinte_tobsforwwds_10_tftipcolcod = AV18TFTipColCod ;
      AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to = AV19TFTipColCod_To ;
      AV67Formulaciontinte_tobsforwwds_12_tfforcurva = AV20TFForCurva ;
      AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel = AV21TFForCurva_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_tobsforwwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Formulaciontinte_tobsforwwds_3_tfclicod_to) ,
                                           AV60Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                           AV59Formulaciontinte_tobsforwwds_4_tfforser ,
                                           AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                           AV61Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                           Integer.valueOf(AV63Formulaciontinte_tobsforwwds_8_tfforcolnum) ,
                                           Integer.valueOf(AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to) ,
                                           Byte.valueOf(AV65Formulaciontinte_tobsforwwds_10_tftipcolcod) ,
                                           Byte.valueOf(AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to) ,
                                           AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                           AV67Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A12200ForCurva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_tobsforwwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_tobsforwwds_4_tfforser), 16, "%") ;
      lV61Formulaciontinte_tobsforwwds_6_tfforcolnom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_tobsforwwds_6_tfforcolnom), 13, "%") ;
      lV67Formulaciontinte_tobsforwwds_12_tfforcurva = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_tobsforwwds_12_tfforcurva), 128, "%") ;
      /* Using cursor P08KO4 */
      pr_default.execute(2, new Object[] {lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, lV56Formulaciontinte_tobsforwwds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_tobsforwwds_2_tfclicod), Integer.valueOf(AV58Formulaciontinte_tobsforwwds_3_tfclicod_to), lV59Formulaciontinte_tobsforwwds_4_tfforser, AV60Formulaciontinte_tobsforwwds_5_tfforser_sel, lV61Formulaciontinte_tobsforwwds_6_tfforcolnom, AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel, Integer.valueOf(AV63Formulaciontinte_tobsforwwds_8_tfforcolnum), Integer.valueOf(AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to), Byte.valueOf(AV65Formulaciontinte_tobsforwwds_10_tftipcolcod), Byte.valueOf(AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to), lV67Formulaciontinte_tobsforwwds_12_tfforcurva, AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8KO6 = false ;
         A12200ForCurva = P08KO4_A12200ForCurva[0] ;
         n12200ForCurva = P08KO4_n12200ForCurva[0] ;
         A831TipColCod = P08KO4_A831TipColCod[0] ;
         A483ForColNum = P08KO4_A483ForColNum[0] ;
         A482ForColNom = P08KO4_A482ForColNom[0] ;
         A494ForSer = P08KO4_A494ForSer[0] ;
         A252CliCod = P08KO4_A252CliCod[0] ;
         A396EmprCod = P08KO4_A396EmprCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08KO4_A12200ForCurva[0], A12200ForCurva) == 0 ) )
         {
            brk8KO6 = false ;
            A831TipColCod = P08KO4_A831TipColCod[0] ;
            A483ForColNum = P08KO4_A483ForColNum[0] ;
            A482ForColNom = P08KO4_A482ForColNom[0] ;
            A494ForSer = P08KO4_A494ForSer[0] ;
            A252CliCod = P08KO4_A252CliCod[0] ;
            A396EmprCod = P08KO4_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8KO6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A12200ForCurva)==0) )
         {
            AV26Option = A12200ForCurva ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KO6 )
         {
            brk8KO6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tobsforwwgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = tobsforwwgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = tobsforwwgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV51FilterFullText = "" ;
      AV12TFForSer = "" ;
      AV13TFForSer_Sel = "" ;
      AV14TFForColNom = "" ;
      AV15TFForColNom_Sel = "" ;
      AV20TFForCurva = "" ;
      AV21TFForCurva_Sel = "" ;
      A494ForSer = "" ;
      AV56Formulaciontinte_tobsforwwds_1_filterfulltext = "" ;
      AV59Formulaciontinte_tobsforwwds_4_tfforser = "" ;
      AV60Formulaciontinte_tobsforwwds_5_tfforser_sel = "" ;
      AV61Formulaciontinte_tobsforwwds_6_tfforcolnom = "" ;
      AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = "" ;
      AV67Formulaciontinte_tobsforwwds_12_tfforcurva = "" ;
      AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel = "" ;
      scmdbuf = "" ;
      lV56Formulaciontinte_tobsforwwds_1_filterfulltext = "" ;
      lV59Formulaciontinte_tobsforwwds_4_tfforser = "" ;
      lV61Formulaciontinte_tobsforwwds_6_tfforcolnom = "" ;
      lV67Formulaciontinte_tobsforwwds_12_tfforcurva = "" ;
      A482ForColNom = "" ;
      A12200ForCurva = "" ;
      P08KO2_A494ForSer = new String[] {""} ;
      P08KO2_A12200ForCurva = new String[] {""} ;
      P08KO2_n12200ForCurva = new boolean[] {false} ;
      P08KO2_A831TipColCod = new byte[1] ;
      P08KO2_A483ForColNum = new int[1] ;
      P08KO2_A482ForColNom = new String[] {""} ;
      P08KO2_A252CliCod = new int[1] ;
      P08KO2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV26Option = "" ;
      P08KO3_A482ForColNom = new String[] {""} ;
      P08KO3_A12200ForCurva = new String[] {""} ;
      P08KO3_n12200ForCurva = new boolean[] {false} ;
      P08KO3_A831TipColCod = new byte[1] ;
      P08KO3_A483ForColNum = new int[1] ;
      P08KO3_A494ForSer = new String[] {""} ;
      P08KO3_A252CliCod = new int[1] ;
      P08KO3_A396EmprCod = new String[] {""} ;
      P08KO4_A12200ForCurva = new String[] {""} ;
      P08KO4_n12200ForCurva = new boolean[] {false} ;
      P08KO4_A831TipColCod = new byte[1] ;
      P08KO4_A483ForColNum = new int[1] ;
      P08KO4_A482ForColNom = new String[] {""} ;
      P08KO4_A494ForSer = new String[] {""} ;
      P08KO4_A252CliCod = new int[1] ;
      P08KO4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tobsforwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08KO2_A494ForSer, P08KO2_A12200ForCurva, P08KO2_n12200ForCurva, P08KO2_A831TipColCod, P08KO2_A483ForColNum, P08KO2_A482ForColNom, P08KO2_A252CliCod, P08KO2_A396EmprCod
            }
            , new Object[] {
            P08KO3_A482ForColNom, P08KO3_A12200ForCurva, P08KO3_n12200ForCurva, P08KO3_A831TipColCod, P08KO3_A483ForColNum, P08KO3_A494ForSer, P08KO3_A252CliCod, P08KO3_A396EmprCod
            }
            , new Object[] {
            P08KO4_A12200ForCurva, P08KO4_n12200ForCurva, P08KO4_A831TipColCod, P08KO4_A483ForColNum, P08KO4_A482ForColNom, P08KO4_A494ForSer, P08KO4_A252CliCod, P08KO4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFTipColCod ;
   private byte AV19TFTipColCod_To ;
   private byte AV65Formulaciontinte_tobsforwwds_10_tftipcolcod ;
   private byte AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV16TFForColNum ;
   private int AV17TFForColNum_To ;
   private int AV57Formulaciontinte_tobsforwwds_2_tfclicod ;
   private int AV58Formulaciontinte_tobsforwwds_3_tfclicod_to ;
   private int AV63Formulaciontinte_tobsforwwds_8_tfforcolnum ;
   private int AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private long AV34count ;
   private String AV12TFForSer ;
   private String AV13TFForSer_Sel ;
   private String AV14TFForColNom ;
   private String AV15TFForColNom_Sel ;
   private String AV20TFForCurva ;
   private String AV21TFForCurva_Sel ;
   private String A494ForSer ;
   private String AV59Formulaciontinte_tobsforwwds_4_tfforser ;
   private String AV60Formulaciontinte_tobsforwwds_5_tfforser_sel ;
   private String AV61Formulaciontinte_tobsforwwds_6_tfforcolnom ;
   private String AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ;
   private String AV67Formulaciontinte_tobsforwwds_12_tfforcurva ;
   private String AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel ;
   private String scmdbuf ;
   private String lV59Formulaciontinte_tobsforwwds_4_tfforser ;
   private String lV61Formulaciontinte_tobsforwwds_6_tfforcolnom ;
   private String lV67Formulaciontinte_tobsforwwds_12_tfforcurva ;
   private String A482ForColNom ;
   private String A12200ForCurva ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8KO2 ;
   private boolean n12200ForCurva ;
   private boolean brk8KO4 ;
   private boolean brk8KO6 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV51FilterFullText ;
   private String AV56Formulaciontinte_tobsforwwds_1_filterfulltext ;
   private String lV56Formulaciontinte_tobsforwwds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08KO2_A494ForSer ;
   private String[] P08KO2_A12200ForCurva ;
   private boolean[] P08KO2_n12200ForCurva ;
   private byte[] P08KO2_A831TipColCod ;
   private int[] P08KO2_A483ForColNum ;
   private String[] P08KO2_A482ForColNom ;
   private int[] P08KO2_A252CliCod ;
   private String[] P08KO2_A396EmprCod ;
   private String[] P08KO3_A482ForColNom ;
   private String[] P08KO3_A12200ForCurva ;
   private boolean[] P08KO3_n12200ForCurva ;
   private byte[] P08KO3_A831TipColCod ;
   private int[] P08KO3_A483ForColNum ;
   private String[] P08KO3_A494ForSer ;
   private int[] P08KO3_A252CliCod ;
   private String[] P08KO3_A396EmprCod ;
   private String[] P08KO4_A12200ForCurva ;
   private boolean[] P08KO4_n12200ForCurva ;
   private byte[] P08KO4_A831TipColCod ;
   private int[] P08KO4_A483ForColNum ;
   private String[] P08KO4_A482ForColNom ;
   private String[] P08KO4_A494ForSer ;
   private int[] P08KO4_A252CliCod ;
   private String[] P08KO4_A396EmprCod ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class tobsforwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                          int AV57Formulaciontinte_tobsforwwds_2_tfclicod ,
                                          int AV58Formulaciontinte_tobsforwwds_3_tfclicod_to ,
                                          String AV60Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                          String AV59Formulaciontinte_tobsforwwds_4_tfforser ,
                                          String AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                          String AV61Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                          int AV63Formulaciontinte_tobsforwwds_8_tfforcolnum ,
                                          int AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to ,
                                          byte AV65Formulaciontinte_tobsforwwds_10_tftipcolcod ,
                                          byte AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to ,
                                          String AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                          String AV67Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A12200ForCurva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ForSer, ForCurva, TipColCod, ForColNum, ForColNom, CliCod, EmprCod FROM TXPCFORMU" ;
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_tobsforwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForCurva) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_tobsforwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_tobsforwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_tobsforwwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_tobsforwwds_6_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_tobsforwwds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_tobsforwwds_10_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_tobsforwwds_12_tfforcurva)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForCurva) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) )
      {
         addWhere(sWhereString, "(ForCurva = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForSer" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08KO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                          int AV57Formulaciontinte_tobsforwwds_2_tfclicod ,
                                          int AV58Formulaciontinte_tobsforwwds_3_tfclicod_to ,
                                          String AV60Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                          String AV59Formulaciontinte_tobsforwwds_4_tfforser ,
                                          String AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                          String AV61Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                          int AV63Formulaciontinte_tobsforwwds_8_tfforcolnum ,
                                          int AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to ,
                                          byte AV65Formulaciontinte_tobsforwwds_10_tftipcolcod ,
                                          byte AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to ,
                                          String AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                          String AV67Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A12200ForCurva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ForColNom, ForCurva, TipColCod, ForColNum, ForSer, CliCod, EmprCod FROM TXPCFORMU" ;
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_tobsforwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForCurva) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_tobsforwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_tobsforwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_tobsforwwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_tobsforwwds_6_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_tobsforwwds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_tobsforwwds_10_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_tobsforwwds_12_tfforcurva)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForCurva) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) )
      {
         addWhere(sWhereString, "(ForCurva = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForColNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08KO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                          int AV57Formulaciontinte_tobsforwwds_2_tfclicod ,
                                          int AV58Formulaciontinte_tobsforwwds_3_tfclicod_to ,
                                          String AV60Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                          String AV59Formulaciontinte_tobsforwwds_4_tfforser ,
                                          String AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                          String AV61Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                          int AV63Formulaciontinte_tobsforwwds_8_tfforcolnum ,
                                          int AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to ,
                                          byte AV65Formulaciontinte_tobsforwwds_10_tftipcolcod ,
                                          byte AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to ,
                                          String AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                          String AV67Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A12200ForCurva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ForCurva, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU" ;
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_tobsforwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForCurva) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_tobsforwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_tobsforwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_tobsforwwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_tobsforwwds_6_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_tobsforwwds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_tobsforwwds_9_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_tobsforwwds_10_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_tobsforwwds_11_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_tobsforwwds_12_tfforcurva)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForCurva) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) )
      {
         addWhere(sWhereString, "(ForCurva = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForCurva" ;
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
                  return conditional_P08KO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P08KO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] );
            case 2 :
                  return conditional_P08KO4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 128);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 128);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 128);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 128);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 128);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 128);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 128);
               }
               return;
      }
   }

}

