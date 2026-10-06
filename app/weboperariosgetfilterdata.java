package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class weboperariosgetfilterdata extends GXProcedure
{
   public weboperariosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( weboperariosgetfilterdata.class ), "" );
   }

   public weboperariosgetfilterdata( int remoteHandle ,
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
      weboperariosgetfilterdata.this.aP5 = new String[] {""};
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
      weboperariosgetfilterdata.this.AV20DDOName = aP0;
      weboperariosgetfilterdata.this.AV18SearchTxt = aP1;
      weboperariosgetfilterdata.this.AV19SearchTxtTo = aP2;
      weboperariosgetfilterdata.this.aP3 = aP3;
      weboperariosgetfilterdata.this.aP4 = aP4;
      weboperariosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_OPENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADOPENOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_OPENOM2") == 0 )
      {
         /* Execute user subroutine: 'LOADOPENOM2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_OPEACT") == 0 )
      {
         /* Execute user subroutine: 'LOADOPEACTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WebOperariosGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebOperariosGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WebOperariosGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECOD") == 0 )
         {
            AV10TFOpeCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFOpeCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM") == 0 )
         {
            AV12TFOpeNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM_SEL") == 0 )
         {
            AV13TFOpeNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2") == 0 )
         {
            AV14TFOpeNom2 = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2_SEL") == 0 )
         {
            AV15TFOpeNom2_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT") == 0 )
         {
            AV16TFOpeAct = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT_SEL") == 0 )
         {
            AV17TFOpeAct_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
      if ( AV33GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV35GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV33GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV36DynamicFiltersSelector1 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV36DynamicFiltersSelector1, "OPENOM") == 0 )
         {
            AV37DynamicFiltersOperator1 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV38OpeNom1 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
         }
         if ( AV33GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV39DynamicFiltersEnabled2 = true ;
            AV35GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV33GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV40DynamicFiltersSelector2 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV40DynamicFiltersSelector2, "OPENOM") == 0 )
            {
               AV41DynamicFiltersOperator2 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV42OpeNom2 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            }
            if ( AV33GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV43DynamicFiltersEnabled3 = true ;
               AV35GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV33GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV44DynamicFiltersSelector3 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV44DynamicFiltersSelector3, "OPENOM") == 0 )
               {
                  AV45DynamicFiltersOperator3 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV46OpeNom3 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               }
            }
         }
      }
   }

   public void S121( )
   {
      /* 'LOADOPENOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFOpeNom = AV18SearchTxt ;
      AV13TFOpeNom_Sel = "" ;
      AV54Weboperariosds_1_filterfulltext = AV49FilterFullText ;
      AV55Weboperariosds_2_dynamicfiltersselector1 = AV36DynamicFiltersSelector1 ;
      AV56Weboperariosds_3_dynamicfiltersoperator1 = AV37DynamicFiltersOperator1 ;
      AV57Weboperariosds_4_openom1 = AV38OpeNom1 ;
      AV58Weboperariosds_5_dynamicfiltersenabled2 = AV39DynamicFiltersEnabled2 ;
      AV59Weboperariosds_6_dynamicfiltersselector2 = AV40DynamicFiltersSelector2 ;
      AV60Weboperariosds_7_dynamicfiltersoperator2 = AV41DynamicFiltersOperator2 ;
      AV61Weboperariosds_8_openom2 = AV42OpeNom2 ;
      AV62Weboperariosds_9_dynamicfiltersenabled3 = AV43DynamicFiltersEnabled3 ;
      AV63Weboperariosds_10_dynamicfiltersselector3 = AV44DynamicFiltersSelector3 ;
      AV64Weboperariosds_11_dynamicfiltersoperator3 = AV45DynamicFiltersOperator3 ;
      AV65Weboperariosds_12_openom3 = AV46OpeNom3 ;
      AV66Weboperariosds_13_tfopecod = AV10TFOpeCod ;
      AV67Weboperariosds_14_tfopecod_to = AV11TFOpeCod_To ;
      AV68Weboperariosds_15_tfopenom = AV12TFOpeNom ;
      AV69Weboperariosds_16_tfopenom_sel = AV13TFOpeNom_Sel ;
      AV70Weboperariosds_17_tfopenom2 = AV14TFOpeNom2 ;
      AV71Weboperariosds_18_tfopenom2_sel = AV15TFOpeNom2_Sel ;
      AV72Weboperariosds_19_tfopeact = AV16TFOpeAct ;
      AV73Weboperariosds_20_tfopeact_sel = AV17TFOpeAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Weboperariosds_1_filterfulltext ,
                                           AV55Weboperariosds_2_dynamicfiltersselector1 ,
                                           Short.valueOf(AV56Weboperariosds_3_dynamicfiltersoperator1) ,
                                           AV57Weboperariosds_4_openom1 ,
                                           Boolean.valueOf(AV58Weboperariosds_5_dynamicfiltersenabled2) ,
                                           AV59Weboperariosds_6_dynamicfiltersselector2 ,
                                           Short.valueOf(AV60Weboperariosds_7_dynamicfiltersoperator2) ,
                                           AV61Weboperariosds_8_openom2 ,
                                           Boolean.valueOf(AV62Weboperariosds_9_dynamicfiltersenabled3) ,
                                           AV63Weboperariosds_10_dynamicfiltersselector3 ,
                                           Short.valueOf(AV64Weboperariosds_11_dynamicfiltersoperator3) ,
                                           AV65Weboperariosds_12_openom3 ,
                                           Integer.valueOf(AV66Weboperariosds_13_tfopecod) ,
                                           Integer.valueOf(AV67Weboperariosds_14_tfopecod_to) ,
                                           AV69Weboperariosds_16_tfopenom_sel ,
                                           AV68Weboperariosds_15_tfopenom ,
                                           AV71Weboperariosds_18_tfopenom2_sel ,
                                           AV70Weboperariosds_17_tfopenom2 ,
                                           AV73Weboperariosds_20_tfopeact_sel ,
                                           AV72Weboperariosds_19_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV57Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV57Weboperariosds_4_openom1), 30, "%") ;
      lV57Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV57Weboperariosds_4_openom1), 30, "%") ;
      lV61Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV61Weboperariosds_8_openom2), 30, "%") ;
      lV61Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV61Weboperariosds_8_openom2), 30, "%") ;
      lV65Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_12_openom3), 30, "%") ;
      lV65Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_12_openom3), 30, "%") ;
      lV68Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV68Weboperariosds_15_tfopenom), 30, "%") ;
      lV70Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV70Weboperariosds_17_tfopenom2), 30, "%") ;
      lV72Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV72Weboperariosds_19_tfopeact), 1, "%") ;
      /* Using cursor P08B52 */
      pr_default.execute(0, new Object[] {lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV57Weboperariosds_4_openom1, lV57Weboperariosds_4_openom1, lV61Weboperariosds_8_openom2, lV61Weboperariosds_8_openom2, lV65Weboperariosds_12_openom3, lV65Weboperariosds_12_openom3, Integer.valueOf(AV66Weboperariosds_13_tfopecod), Integer.valueOf(AV67Weboperariosds_14_tfopecod_to), lV68Weboperariosds_15_tfopenom, AV69Weboperariosds_16_tfopenom_sel, lV70Weboperariosds_17_tfopenom2, AV71Weboperariosds_18_tfopenom2_sel, lV72Weboperariosds_19_tfopeact, AV73Weboperariosds_20_tfopeact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8B52 = false ;
         A653OpeNom = P08B52_A653OpeNom[0] ;
         n653OpeNom = P08B52_n653OpeNom[0] ;
         A8482OpeAct = P08B52_A8482OpeAct[0] ;
         n8482OpeAct = P08B52_n8482OpeAct[0] ;
         A6869OpeNom2 = P08B52_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08B52_n6869OpeNom2[0] ;
         A652OpeCod = P08B52_A652OpeCod[0] ;
         A396EmprCod = P08B52_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08B52_A653OpeNom[0], A653OpeNom) == 0 ) )
         {
            brk8B52 = false ;
            A652OpeCod = P08B52_A652OpeCod[0] ;
            A396EmprCod = P08B52_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8B52 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A653OpeNom)==0) )
         {
            AV22Option = A653OpeNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8B52 )
         {
            brk8B52 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADOPENOM2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFOpeNom2 = AV18SearchTxt ;
      AV15TFOpeNom2_Sel = "" ;
      AV54Weboperariosds_1_filterfulltext = AV49FilterFullText ;
      AV55Weboperariosds_2_dynamicfiltersselector1 = AV36DynamicFiltersSelector1 ;
      AV56Weboperariosds_3_dynamicfiltersoperator1 = AV37DynamicFiltersOperator1 ;
      AV57Weboperariosds_4_openom1 = AV38OpeNom1 ;
      AV58Weboperariosds_5_dynamicfiltersenabled2 = AV39DynamicFiltersEnabled2 ;
      AV59Weboperariosds_6_dynamicfiltersselector2 = AV40DynamicFiltersSelector2 ;
      AV60Weboperariosds_7_dynamicfiltersoperator2 = AV41DynamicFiltersOperator2 ;
      AV61Weboperariosds_8_openom2 = AV42OpeNom2 ;
      AV62Weboperariosds_9_dynamicfiltersenabled3 = AV43DynamicFiltersEnabled3 ;
      AV63Weboperariosds_10_dynamicfiltersselector3 = AV44DynamicFiltersSelector3 ;
      AV64Weboperariosds_11_dynamicfiltersoperator3 = AV45DynamicFiltersOperator3 ;
      AV65Weboperariosds_12_openom3 = AV46OpeNom3 ;
      AV66Weboperariosds_13_tfopecod = AV10TFOpeCod ;
      AV67Weboperariosds_14_tfopecod_to = AV11TFOpeCod_To ;
      AV68Weboperariosds_15_tfopenom = AV12TFOpeNom ;
      AV69Weboperariosds_16_tfopenom_sel = AV13TFOpeNom_Sel ;
      AV70Weboperariosds_17_tfopenom2 = AV14TFOpeNom2 ;
      AV71Weboperariosds_18_tfopenom2_sel = AV15TFOpeNom2_Sel ;
      AV72Weboperariosds_19_tfopeact = AV16TFOpeAct ;
      AV73Weboperariosds_20_tfopeact_sel = AV17TFOpeAct_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Weboperariosds_1_filterfulltext ,
                                           AV55Weboperariosds_2_dynamicfiltersselector1 ,
                                           Short.valueOf(AV56Weboperariosds_3_dynamicfiltersoperator1) ,
                                           AV57Weboperariosds_4_openom1 ,
                                           Boolean.valueOf(AV58Weboperariosds_5_dynamicfiltersenabled2) ,
                                           AV59Weboperariosds_6_dynamicfiltersselector2 ,
                                           Short.valueOf(AV60Weboperariosds_7_dynamicfiltersoperator2) ,
                                           AV61Weboperariosds_8_openom2 ,
                                           Boolean.valueOf(AV62Weboperariosds_9_dynamicfiltersenabled3) ,
                                           AV63Weboperariosds_10_dynamicfiltersselector3 ,
                                           Short.valueOf(AV64Weboperariosds_11_dynamicfiltersoperator3) ,
                                           AV65Weboperariosds_12_openom3 ,
                                           Integer.valueOf(AV66Weboperariosds_13_tfopecod) ,
                                           Integer.valueOf(AV67Weboperariosds_14_tfopecod_to) ,
                                           AV69Weboperariosds_16_tfopenom_sel ,
                                           AV68Weboperariosds_15_tfopenom ,
                                           AV71Weboperariosds_18_tfopenom2_sel ,
                                           AV70Weboperariosds_17_tfopenom2 ,
                                           AV73Weboperariosds_20_tfopeact_sel ,
                                           AV72Weboperariosds_19_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV57Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV57Weboperariosds_4_openom1), 30, "%") ;
      lV57Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV57Weboperariosds_4_openom1), 30, "%") ;
      lV61Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV61Weboperariosds_8_openom2), 30, "%") ;
      lV61Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV61Weboperariosds_8_openom2), 30, "%") ;
      lV65Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_12_openom3), 30, "%") ;
      lV65Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_12_openom3), 30, "%") ;
      lV68Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV68Weboperariosds_15_tfopenom), 30, "%") ;
      lV70Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV70Weboperariosds_17_tfopenom2), 30, "%") ;
      lV72Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV72Weboperariosds_19_tfopeact), 1, "%") ;
      /* Using cursor P08B53 */
      pr_default.execute(1, new Object[] {lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV57Weboperariosds_4_openom1, lV57Weboperariosds_4_openom1, lV61Weboperariosds_8_openom2, lV61Weboperariosds_8_openom2, lV65Weboperariosds_12_openom3, lV65Weboperariosds_12_openom3, Integer.valueOf(AV66Weboperariosds_13_tfopecod), Integer.valueOf(AV67Weboperariosds_14_tfopecod_to), lV68Weboperariosds_15_tfopenom, AV69Weboperariosds_16_tfopenom_sel, lV70Weboperariosds_17_tfopenom2, AV71Weboperariosds_18_tfopenom2_sel, lV72Weboperariosds_19_tfopeact, AV73Weboperariosds_20_tfopeact_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8B54 = false ;
         A6869OpeNom2 = P08B53_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08B53_n6869OpeNom2[0] ;
         A8482OpeAct = P08B53_A8482OpeAct[0] ;
         n8482OpeAct = P08B53_n8482OpeAct[0] ;
         A652OpeCod = P08B53_A652OpeCod[0] ;
         A653OpeNom = P08B53_A653OpeNom[0] ;
         n653OpeNom = P08B53_n653OpeNom[0] ;
         A396EmprCod = P08B53_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08B53_A6869OpeNom2[0], A6869OpeNom2) == 0 ) )
         {
            brk8B54 = false ;
            A652OpeCod = P08B53_A652OpeCod[0] ;
            A396EmprCod = P08B53_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8B54 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6869OpeNom2)==0) )
         {
            AV22Option = A6869OpeNom2 ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8B54 )
         {
            brk8B54 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADOPEACTOPTIONS' Routine */
      returnInSub = false ;
      AV16TFOpeAct = AV18SearchTxt ;
      AV17TFOpeAct_Sel = "" ;
      AV54Weboperariosds_1_filterfulltext = AV49FilterFullText ;
      AV55Weboperariosds_2_dynamicfiltersselector1 = AV36DynamicFiltersSelector1 ;
      AV56Weboperariosds_3_dynamicfiltersoperator1 = AV37DynamicFiltersOperator1 ;
      AV57Weboperariosds_4_openom1 = AV38OpeNom1 ;
      AV58Weboperariosds_5_dynamicfiltersenabled2 = AV39DynamicFiltersEnabled2 ;
      AV59Weboperariosds_6_dynamicfiltersselector2 = AV40DynamicFiltersSelector2 ;
      AV60Weboperariosds_7_dynamicfiltersoperator2 = AV41DynamicFiltersOperator2 ;
      AV61Weboperariosds_8_openom2 = AV42OpeNom2 ;
      AV62Weboperariosds_9_dynamicfiltersenabled3 = AV43DynamicFiltersEnabled3 ;
      AV63Weboperariosds_10_dynamicfiltersselector3 = AV44DynamicFiltersSelector3 ;
      AV64Weboperariosds_11_dynamicfiltersoperator3 = AV45DynamicFiltersOperator3 ;
      AV65Weboperariosds_12_openom3 = AV46OpeNom3 ;
      AV66Weboperariosds_13_tfopecod = AV10TFOpeCod ;
      AV67Weboperariosds_14_tfopecod_to = AV11TFOpeCod_To ;
      AV68Weboperariosds_15_tfopenom = AV12TFOpeNom ;
      AV69Weboperariosds_16_tfopenom_sel = AV13TFOpeNom_Sel ;
      AV70Weboperariosds_17_tfopenom2 = AV14TFOpeNom2 ;
      AV71Weboperariosds_18_tfopenom2_sel = AV15TFOpeNom2_Sel ;
      AV72Weboperariosds_19_tfopeact = AV16TFOpeAct ;
      AV73Weboperariosds_20_tfopeact_sel = AV17TFOpeAct_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV54Weboperariosds_1_filterfulltext ,
                                           AV55Weboperariosds_2_dynamicfiltersselector1 ,
                                           Short.valueOf(AV56Weboperariosds_3_dynamicfiltersoperator1) ,
                                           AV57Weboperariosds_4_openom1 ,
                                           Boolean.valueOf(AV58Weboperariosds_5_dynamicfiltersenabled2) ,
                                           AV59Weboperariosds_6_dynamicfiltersselector2 ,
                                           Short.valueOf(AV60Weboperariosds_7_dynamicfiltersoperator2) ,
                                           AV61Weboperariosds_8_openom2 ,
                                           Boolean.valueOf(AV62Weboperariosds_9_dynamicfiltersenabled3) ,
                                           AV63Weboperariosds_10_dynamicfiltersselector3 ,
                                           Short.valueOf(AV64Weboperariosds_11_dynamicfiltersoperator3) ,
                                           AV65Weboperariosds_12_openom3 ,
                                           Integer.valueOf(AV66Weboperariosds_13_tfopecod) ,
                                           Integer.valueOf(AV67Weboperariosds_14_tfopecod_to) ,
                                           AV69Weboperariosds_16_tfopenom_sel ,
                                           AV68Weboperariosds_15_tfopenom ,
                                           AV71Weboperariosds_18_tfopenom2_sel ,
                                           AV70Weboperariosds_17_tfopenom2 ,
                                           AV73Weboperariosds_20_tfopeact_sel ,
                                           AV72Weboperariosds_19_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV54Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Weboperariosds_1_filterfulltext), "%", "") ;
      lV57Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV57Weboperariosds_4_openom1), 30, "%") ;
      lV57Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV57Weboperariosds_4_openom1), 30, "%") ;
      lV61Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV61Weboperariosds_8_openom2), 30, "%") ;
      lV61Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV61Weboperariosds_8_openom2), 30, "%") ;
      lV65Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_12_openom3), 30, "%") ;
      lV65Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_12_openom3), 30, "%") ;
      lV68Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV68Weboperariosds_15_tfopenom), 30, "%") ;
      lV70Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV70Weboperariosds_17_tfopenom2), 30, "%") ;
      lV72Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV72Weboperariosds_19_tfopeact), 1, "%") ;
      /* Using cursor P08B54 */
      pr_default.execute(2, new Object[] {lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV54Weboperariosds_1_filterfulltext, lV57Weboperariosds_4_openom1, lV57Weboperariosds_4_openom1, lV61Weboperariosds_8_openom2, lV61Weboperariosds_8_openom2, lV65Weboperariosds_12_openom3, lV65Weboperariosds_12_openom3, Integer.valueOf(AV66Weboperariosds_13_tfopecod), Integer.valueOf(AV67Weboperariosds_14_tfopecod_to), lV68Weboperariosds_15_tfopenom, AV69Weboperariosds_16_tfopenom_sel, lV70Weboperariosds_17_tfopenom2, AV71Weboperariosds_18_tfopenom2_sel, lV72Weboperariosds_19_tfopeact, AV73Weboperariosds_20_tfopeact_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8B56 = false ;
         A8482OpeAct = P08B54_A8482OpeAct[0] ;
         n8482OpeAct = P08B54_n8482OpeAct[0] ;
         A6869OpeNom2 = P08B54_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08B54_n6869OpeNom2[0] ;
         A652OpeCod = P08B54_A652OpeCod[0] ;
         A653OpeNom = P08B54_A653OpeNom[0] ;
         n653OpeNom = P08B54_n653OpeNom[0] ;
         A396EmprCod = P08B54_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08B54_A8482OpeAct[0], A8482OpeAct) == 0 ) )
         {
            brk8B56 = false ;
            A652OpeCod = P08B54_A652OpeCod[0] ;
            A396EmprCod = P08B54_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8B56 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A8482OpeAct)==0) )
         {
            AV22Option = A8482OpeAct ;
            AV25OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A8482OpeAct, "@!"))) ;
            AV23Options.add(AV22Option, 0);
            AV26OptionsDesc.add(AV25OptionDesc, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8B56 )
         {
            brk8B56 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = weboperariosgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = weboperariosgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = weboperariosgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49FilterFullText = "" ;
      AV12TFOpeNom = "" ;
      AV13TFOpeNom_Sel = "" ;
      AV14TFOpeNom2 = "" ;
      AV15TFOpeNom2_Sel = "" ;
      AV16TFOpeAct = "" ;
      AV17TFOpeAct_Sel = "" ;
      AV35GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV36DynamicFiltersSelector1 = "" ;
      AV38OpeNom1 = "" ;
      AV40DynamicFiltersSelector2 = "" ;
      AV42OpeNom2 = "" ;
      AV44DynamicFiltersSelector3 = "" ;
      AV46OpeNom3 = "" ;
      A653OpeNom = "" ;
      AV54Weboperariosds_1_filterfulltext = "" ;
      AV55Weboperariosds_2_dynamicfiltersselector1 = "" ;
      AV57Weboperariosds_4_openom1 = "" ;
      AV59Weboperariosds_6_dynamicfiltersselector2 = "" ;
      AV61Weboperariosds_8_openom2 = "" ;
      AV63Weboperariosds_10_dynamicfiltersselector3 = "" ;
      AV65Weboperariosds_12_openom3 = "" ;
      AV68Weboperariosds_15_tfopenom = "" ;
      AV69Weboperariosds_16_tfopenom_sel = "" ;
      AV70Weboperariosds_17_tfopenom2 = "" ;
      AV71Weboperariosds_18_tfopenom2_sel = "" ;
      AV72Weboperariosds_19_tfopeact = "" ;
      AV73Weboperariosds_20_tfopeact_sel = "" ;
      scmdbuf = "" ;
      lV54Weboperariosds_1_filterfulltext = "" ;
      lV57Weboperariosds_4_openom1 = "" ;
      lV61Weboperariosds_8_openom2 = "" ;
      lV65Weboperariosds_12_openom3 = "" ;
      lV68Weboperariosds_15_tfopenom = "" ;
      lV70Weboperariosds_17_tfopenom2 = "" ;
      lV72Weboperariosds_19_tfopeact = "" ;
      A6869OpeNom2 = "" ;
      A8482OpeAct = "" ;
      P08B52_A653OpeNom = new String[] {""} ;
      P08B52_n653OpeNom = new boolean[] {false} ;
      P08B52_A8482OpeAct = new String[] {""} ;
      P08B52_n8482OpeAct = new boolean[] {false} ;
      P08B52_A6869OpeNom2 = new String[] {""} ;
      P08B52_n6869OpeNom2 = new boolean[] {false} ;
      P08B52_A652OpeCod = new int[1] ;
      P08B52_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P08B53_A6869OpeNom2 = new String[] {""} ;
      P08B53_n6869OpeNom2 = new boolean[] {false} ;
      P08B53_A8482OpeAct = new String[] {""} ;
      P08B53_n8482OpeAct = new boolean[] {false} ;
      P08B53_A652OpeCod = new int[1] ;
      P08B53_A653OpeNom = new String[] {""} ;
      P08B53_n653OpeNom = new boolean[] {false} ;
      P08B53_A396EmprCod = new String[] {""} ;
      P08B54_A8482OpeAct = new String[] {""} ;
      P08B54_n8482OpeAct = new boolean[] {false} ;
      P08B54_A6869OpeNom2 = new String[] {""} ;
      P08B54_n6869OpeNom2 = new boolean[] {false} ;
      P08B54_A652OpeCod = new int[1] ;
      P08B54_A653OpeNom = new String[] {""} ;
      P08B54_n653OpeNom = new boolean[] {false} ;
      P08B54_A396EmprCod = new String[] {""} ;
      AV25OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.weboperariosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08B52_A653OpeNom, P08B52_n653OpeNom, P08B52_A8482OpeAct, P08B52_n8482OpeAct, P08B52_A6869OpeNom2, P08B52_n6869OpeNom2, P08B52_A652OpeCod, P08B52_A396EmprCod
            }
            , new Object[] {
            P08B53_A6869OpeNom2, P08B53_n6869OpeNom2, P08B53_A8482OpeAct, P08B53_n8482OpeAct, P08B53_A652OpeCod, P08B53_A653OpeNom, P08B53_n653OpeNom, P08B53_A396EmprCod
            }
            , new Object[] {
            P08B54_A8482OpeAct, P08B54_n8482OpeAct, P08B54_A6869OpeNom2, P08B54_n6869OpeNom2, P08B54_A652OpeCod, P08B54_A653OpeNom, P08B54_n653OpeNom, P08B54_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV37DynamicFiltersOperator1 ;
   private short AV41DynamicFiltersOperator2 ;
   private short AV45DynamicFiltersOperator3 ;
   private short AV56Weboperariosds_3_dynamicfiltersoperator1 ;
   private short AV60Weboperariosds_7_dynamicfiltersoperator2 ;
   private short AV64Weboperariosds_11_dynamicfiltersoperator3 ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV10TFOpeCod ;
   private int AV11TFOpeCod_To ;
   private int AV66Weboperariosds_13_tfopecod ;
   private int AV67Weboperariosds_14_tfopecod_to ;
   private int A652OpeCod ;
   private long AV30count ;
   private String AV12TFOpeNom ;
   private String AV13TFOpeNom_Sel ;
   private String AV14TFOpeNom2 ;
   private String AV15TFOpeNom2_Sel ;
   private String AV16TFOpeAct ;
   private String AV17TFOpeAct_Sel ;
   private String AV38OpeNom1 ;
   private String AV42OpeNom2 ;
   private String AV46OpeNom3 ;
   private String A653OpeNom ;
   private String AV57Weboperariosds_4_openom1 ;
   private String AV61Weboperariosds_8_openom2 ;
   private String AV65Weboperariosds_12_openom3 ;
   private String AV68Weboperariosds_15_tfopenom ;
   private String AV69Weboperariosds_16_tfopenom_sel ;
   private String AV70Weboperariosds_17_tfopenom2 ;
   private String AV71Weboperariosds_18_tfopenom2_sel ;
   private String AV72Weboperariosds_19_tfopeact ;
   private String AV73Weboperariosds_20_tfopeact_sel ;
   private String scmdbuf ;
   private String lV57Weboperariosds_4_openom1 ;
   private String lV61Weboperariosds_8_openom2 ;
   private String lV65Weboperariosds_12_openom3 ;
   private String lV68Weboperariosds_15_tfopenom ;
   private String lV70Weboperariosds_17_tfopenom2 ;
   private String lV72Weboperariosds_19_tfopeact ;
   private String A6869OpeNom2 ;
   private String A8482OpeAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean AV39DynamicFiltersEnabled2 ;
   private boolean AV43DynamicFiltersEnabled3 ;
   private boolean AV58Weboperariosds_5_dynamicfiltersenabled2 ;
   private boolean AV62Weboperariosds_9_dynamicfiltersenabled3 ;
   private boolean brk8B52 ;
   private boolean n653OpeNom ;
   private boolean n8482OpeAct ;
   private boolean n6869OpeNom2 ;
   private boolean brk8B54 ;
   private boolean brk8B56 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV49FilterFullText ;
   private String AV36DynamicFiltersSelector1 ;
   private String AV40DynamicFiltersSelector2 ;
   private String AV44DynamicFiltersSelector3 ;
   private String AV54Weboperariosds_1_filterfulltext ;
   private String AV55Weboperariosds_2_dynamicfiltersselector1 ;
   private String AV59Weboperariosds_6_dynamicfiltersselector2 ;
   private String AV63Weboperariosds_10_dynamicfiltersselector3 ;
   private String lV54Weboperariosds_1_filterfulltext ;
   private String AV22Option ;
   private String AV25OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08B52_A653OpeNom ;
   private boolean[] P08B52_n653OpeNom ;
   private String[] P08B52_A8482OpeAct ;
   private boolean[] P08B52_n8482OpeAct ;
   private String[] P08B52_A6869OpeNom2 ;
   private boolean[] P08B52_n6869OpeNom2 ;
   private int[] P08B52_A652OpeCod ;
   private String[] P08B52_A396EmprCod ;
   private String[] P08B53_A6869OpeNom2 ;
   private boolean[] P08B53_n6869OpeNom2 ;
   private String[] P08B53_A8482OpeAct ;
   private boolean[] P08B53_n8482OpeAct ;
   private int[] P08B53_A652OpeCod ;
   private String[] P08B53_A653OpeNom ;
   private boolean[] P08B53_n653OpeNom ;
   private String[] P08B53_A396EmprCod ;
   private String[] P08B54_A8482OpeAct ;
   private boolean[] P08B54_n8482OpeAct ;
   private String[] P08B54_A6869OpeNom2 ;
   private boolean[] P08B54_n6869OpeNom2 ;
   private int[] P08B54_A652OpeCod ;
   private String[] P08B54_A653OpeNom ;
   private boolean[] P08B54_n653OpeNom ;
   private String[] P08B54_A396EmprCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV35GridStateDynamicFilter ;
}

final  class weboperariosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08B52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Weboperariosds_1_filterfulltext ,
                                          String AV55Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV56Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV57Weboperariosds_4_openom1 ,
                                          boolean AV58Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV59Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV60Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV61Weboperariosds_8_openom2 ,
                                          boolean AV62Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV63Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV64Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV65Weboperariosds_12_openom3 ,
                                          int AV66Weboperariosds_13_tfopecod ,
                                          int AV67Weboperariosds_14_tfopecod_to ,
                                          String AV69Weboperariosds_16_tfopenom_sel ,
                                          String AV68Weboperariosds_15_tfopenom ,
                                          String AV71Weboperariosds_18_tfopenom2_sel ,
                                          String AV70Weboperariosds_17_tfopenom2 ,
                                          String AV73Weboperariosds_20_tfopeact_sel ,
                                          String AV72Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT OpeNom, OpeAct, OpeNom2, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV54Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV55Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV56Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV57Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV55Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV56Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV57Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV58Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV59Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV60Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV61Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( AV58Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV59Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV60Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV61Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV62Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV63Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( AV62Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV63Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV70Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV72Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08B53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Weboperariosds_1_filterfulltext ,
                                          String AV55Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV56Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV57Weboperariosds_4_openom1 ,
                                          boolean AV58Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV59Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV60Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV61Weboperariosds_8_openom2 ,
                                          boolean AV62Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV63Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV64Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV65Weboperariosds_12_openom3 ,
                                          int AV66Weboperariosds_13_tfopecod ,
                                          int AV67Weboperariosds_14_tfopecod_to ,
                                          String AV69Weboperariosds_16_tfopenom_sel ,
                                          String AV68Weboperariosds_15_tfopenom ,
                                          String AV71Weboperariosds_18_tfopenom2_sel ,
                                          String AV70Weboperariosds_17_tfopenom2 ,
                                          String AV73Weboperariosds_20_tfopeact_sel ,
                                          String AV72Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT OpeNom2, OpeAct, OpeCod, OpeNom, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV54Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV55Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV56Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV57Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV55Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV56Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV57Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( AV58Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV59Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV60Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV61Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( AV58Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV59Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV60Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV61Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( AV62Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV63Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( AV62Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV63Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV70Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV72Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeNom2" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08B54( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Weboperariosds_1_filterfulltext ,
                                          String AV55Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV56Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV57Weboperariosds_4_openom1 ,
                                          boolean AV58Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV59Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV60Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV61Weboperariosds_8_openom2 ,
                                          boolean AV62Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV63Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV64Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV65Weboperariosds_12_openom3 ,
                                          int AV66Weboperariosds_13_tfopecod ,
                                          int AV67Weboperariosds_14_tfopecod_to ,
                                          String AV69Weboperariosds_16_tfopenom_sel ,
                                          String AV68Weboperariosds_15_tfopenom ,
                                          String AV71Weboperariosds_18_tfopenom2_sel ,
                                          String AV70Weboperariosds_17_tfopenom2 ,
                                          String AV73Weboperariosds_20_tfopeact_sel ,
                                          String AV72Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT OpeAct, OpeNom2, OpeCod, OpeNom, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV54Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV55Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV56Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV57Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV55Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV56Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV57Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV58Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV59Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV60Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV61Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( AV58Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV59Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV60Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV61Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV62Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV63Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( AV62Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV63Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV70Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV72Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeAct" ;
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
                  return conditional_P08B52(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 1 :
                  return conditional_P08B53(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 2 :
                  return conditional_P08B54(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08B52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B54", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
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
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
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
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

