package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class bcprodgetfilterdata extends GXProcedure
{
   public bcprodgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( bcprodgetfilterdata.class ), "" );
   }

   public bcprodgetfilterdata( int remoteHandle ,
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
      bcprodgetfilterdata.this.aP5 = new String[] {""};
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
      bcprodgetfilterdata.this.AV22DDOName = aP0;
      bcprodgetfilterdata.this.AV20SearchTxt = aP1;
      bcprodgetfilterdata.this.AV21SearchTxtTo = aP2;
      bcprodgetfilterdata.this.aP3 = aP3;
      bcprodgetfilterdata.this.aP4 = aP4;
      bcprodgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDUCPDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDUCPDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRVNIF") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNIFOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("BCPRODGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "BCPRODGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("BCPRODGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV14TFPrdPreAct = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdPreAct_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV16TFPrdUcpDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV17TFPrdUcpDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV18TFPrvNif = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV19TFPrvNif_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
      if ( AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV37GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV38DynamicFiltersSelector1 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV38DynamicFiltersSelector1, "PRDNOM") == 0 )
         {
            AV39DynamicFiltersOperator1 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV40PrdNom1 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
         }
         if ( AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV41DynamicFiltersEnabled2 = true ;
            AV37GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV42DynamicFiltersSelector2 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV42DynamicFiltersSelector2, "PRDNOM") == 0 )
            {
               AV43DynamicFiltersOperator2 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV44PrdNom2 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            }
            if ( AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV45DynamicFiltersEnabled3 = true ;
               AV37GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV46DynamicFiltersSelector3 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV46DynamicFiltersSelector3, "PRDNOM") == 0 )
               {
                  AV47DynamicFiltersOperator3 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV48PrdNom3 = AV37GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               }
            }
         }
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV20SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV54Core_bcprodds_1_dynamicfiltersselector1 = AV38DynamicFiltersSelector1 ;
      AV55Core_bcprodds_2_dynamicfiltersoperator1 = AV39DynamicFiltersOperator1 ;
      AV56Core_bcprodds_3_prdnom1 = AV40PrdNom1 ;
      AV57Core_bcprodds_4_dynamicfiltersenabled2 = AV41DynamicFiltersEnabled2 ;
      AV58Core_bcprodds_5_dynamicfiltersselector2 = AV42DynamicFiltersSelector2 ;
      AV59Core_bcprodds_6_dynamicfiltersoperator2 = AV43DynamicFiltersOperator2 ;
      AV60Core_bcprodds_7_prdnom2 = AV44PrdNom2 ;
      AV61Core_bcprodds_8_dynamicfiltersenabled3 = AV45DynamicFiltersEnabled3 ;
      AV62Core_bcprodds_9_dynamicfiltersselector3 = AV46DynamicFiltersSelector3 ;
      AV63Core_bcprodds_10_dynamicfiltersoperator3 = AV47DynamicFiltersOperator3 ;
      AV64Core_bcprodds_11_prdnom3 = AV48PrdNom3 ;
      AV65Core_bcprodds_12_tfprdnum = AV10TFPrdNum ;
      AV66Core_bcprodds_13_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV67Core_bcprodds_14_tfprdnom = AV12TFPrdNom ;
      AV68Core_bcprodds_15_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV69Core_bcprodds_16_tfprdpreact = AV14TFPrdPreAct ;
      AV70Core_bcprodds_17_tfprdpreact_to = AV15TFPrdPreAct_To ;
      AV71Core_bcprodds_18_tfprducpdsc = AV16TFPrdUcpDsc ;
      AV72Core_bcprodds_19_tfprducpdsc_sel = AV17TFPrdUcpDsc_Sel ;
      AV73Core_bcprodds_20_tfprvnif = AV18TFPrvNif ;
      AV74Core_bcprodds_21_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                           Short.valueOf(AV55Core_bcprodds_2_dynamicfiltersoperator1) ,
                                           AV56Core_bcprodds_3_prdnom1 ,
                                           Boolean.valueOf(AV57Core_bcprodds_4_dynamicfiltersenabled2) ,
                                           AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                           Short.valueOf(AV59Core_bcprodds_6_dynamicfiltersoperator2) ,
                                           AV60Core_bcprodds_7_prdnom2 ,
                                           Boolean.valueOf(AV61Core_bcprodds_8_dynamicfiltersenabled3) ,
                                           AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                           Short.valueOf(AV63Core_bcprodds_10_dynamicfiltersoperator3) ,
                                           AV64Core_bcprodds_11_prdnom3 ,
                                           AV66Core_bcprodds_13_tfprdnum_sel ,
                                           AV65Core_bcprodds_12_tfprdnum ,
                                           AV68Core_bcprodds_15_tfprdnom_sel ,
                                           AV67Core_bcprodds_14_tfprdnom ,
                                           AV69Core_bcprodds_16_tfprdpreact ,
                                           AV70Core_bcprodds_17_tfprdpreact_to ,
                                           AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                           AV71Core_bcprodds_18_tfprducpdsc ,
                                           AV74Core_bcprodds_21_tfprvnif_sel ,
                                           AV73Core_bcprodds_20_tfprvnif ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A724PrdPreAct ,
                                           A737PrdUcpDsc ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV49EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV65Core_bcprodds_12_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Core_bcprodds_12_tfprdnum), 6, "%") ;
      lV67Core_bcprodds_14_tfprdnom = GXutil.padr( GXutil.rtrim( AV67Core_bcprodds_14_tfprdnom), 26, "%") ;
      lV71Core_bcprodds_18_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV71Core_bcprodds_18_tfprducpdsc), 8, "%") ;
      lV73Core_bcprodds_20_tfprvnif = GXutil.padr( GXutil.rtrim( AV73Core_bcprodds_20_tfprvnif), 20, "%") ;
      /* Using cursor P07ZQ2 */
      pr_default.execute(0, new Object[] {AV49EmprCod, lV56Core_bcprodds_3_prdnom1, lV56Core_bcprodds_3_prdnom1, lV60Core_bcprodds_7_prdnom2, lV60Core_bcprodds_7_prdnom2, lV64Core_bcprodds_11_prdnom3, lV64Core_bcprodds_11_prdnom3, lV65Core_bcprodds_12_tfprdnum, AV66Core_bcprodds_13_tfprdnum_sel, lV67Core_bcprodds_14_tfprdnom, AV68Core_bcprodds_15_tfprdnom_sel, AV69Core_bcprodds_16_tfprdpreact, AV70Core_bcprodds_17_tfprdpreact_to, lV71Core_bcprodds_18_tfprducpdsc, AV72Core_bcprodds_19_tfprducpdsc_sel, lV73Core_bcprodds_20_tfprvnif, AV74Core_bcprodds_21_tfprvnif_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7ZQ2 = false ;
         A795PrvNum = P07ZQ2_A795PrvNum[0] ;
         A742PrdUniCom = P07ZQ2_A742PrdUniCom[0] ;
         A396EmprCod = P07ZQ2_A396EmprCod[0] ;
         A719PrdNum = P07ZQ2_A719PrdNum[0] ;
         A3936PrdEqLP = P07ZQ2_A3936PrdEqLP[0] ;
         A856ValCod = P07ZQ2_A856ValCod[0] ;
         A793PrvNif = P07ZQ2_A793PrvNif[0] ;
         n793PrvNif = P07ZQ2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZQ2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ2_n737PrdUcpDsc[0] ;
         A724PrdPreAct = P07ZQ2_A724PrdPreAct[0] ;
         A718PrdNom = P07ZQ2_A718PrdNom[0] ;
         A793PrvNif = P07ZQ2_A793PrvNif[0] ;
         n793PrvNif = P07ZQ2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZQ2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ2_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07ZQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07ZQ2_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk7ZQ2 = false ;
               AV32count = (long)(AV32count+1) ;
               brk7ZQ2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
            {
               AV24Option = A719PrdNum ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZQ2 )
         {
            brk7ZQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV20SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV54Core_bcprodds_1_dynamicfiltersselector1 = AV38DynamicFiltersSelector1 ;
      AV55Core_bcprodds_2_dynamicfiltersoperator1 = AV39DynamicFiltersOperator1 ;
      AV56Core_bcprodds_3_prdnom1 = AV40PrdNom1 ;
      AV57Core_bcprodds_4_dynamicfiltersenabled2 = AV41DynamicFiltersEnabled2 ;
      AV58Core_bcprodds_5_dynamicfiltersselector2 = AV42DynamicFiltersSelector2 ;
      AV59Core_bcprodds_6_dynamicfiltersoperator2 = AV43DynamicFiltersOperator2 ;
      AV60Core_bcprodds_7_prdnom2 = AV44PrdNom2 ;
      AV61Core_bcprodds_8_dynamicfiltersenabled3 = AV45DynamicFiltersEnabled3 ;
      AV62Core_bcprodds_9_dynamicfiltersselector3 = AV46DynamicFiltersSelector3 ;
      AV63Core_bcprodds_10_dynamicfiltersoperator3 = AV47DynamicFiltersOperator3 ;
      AV64Core_bcprodds_11_prdnom3 = AV48PrdNom3 ;
      AV65Core_bcprodds_12_tfprdnum = AV10TFPrdNum ;
      AV66Core_bcprodds_13_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV67Core_bcprodds_14_tfprdnom = AV12TFPrdNom ;
      AV68Core_bcprodds_15_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV69Core_bcprodds_16_tfprdpreact = AV14TFPrdPreAct ;
      AV70Core_bcprodds_17_tfprdpreact_to = AV15TFPrdPreAct_To ;
      AV71Core_bcprodds_18_tfprducpdsc = AV16TFPrdUcpDsc ;
      AV72Core_bcprodds_19_tfprducpdsc_sel = AV17TFPrdUcpDsc_Sel ;
      AV73Core_bcprodds_20_tfprvnif = AV18TFPrvNif ;
      AV74Core_bcprodds_21_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                           Short.valueOf(AV55Core_bcprodds_2_dynamicfiltersoperator1) ,
                                           AV56Core_bcprodds_3_prdnom1 ,
                                           Boolean.valueOf(AV57Core_bcprodds_4_dynamicfiltersenabled2) ,
                                           AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                           Short.valueOf(AV59Core_bcprodds_6_dynamicfiltersoperator2) ,
                                           AV60Core_bcprodds_7_prdnom2 ,
                                           Boolean.valueOf(AV61Core_bcprodds_8_dynamicfiltersenabled3) ,
                                           AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                           Short.valueOf(AV63Core_bcprodds_10_dynamicfiltersoperator3) ,
                                           AV64Core_bcprodds_11_prdnom3 ,
                                           AV66Core_bcprodds_13_tfprdnum_sel ,
                                           AV65Core_bcprodds_12_tfprdnum ,
                                           AV68Core_bcprodds_15_tfprdnom_sel ,
                                           AV67Core_bcprodds_14_tfprdnom ,
                                           AV69Core_bcprodds_16_tfprdpreact ,
                                           AV70Core_bcprodds_17_tfprdpreact_to ,
                                           AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                           AV71Core_bcprodds_18_tfprducpdsc ,
                                           AV74Core_bcprodds_21_tfprvnif_sel ,
                                           AV73Core_bcprodds_20_tfprvnif ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A724PrdPreAct ,
                                           A737PrdUcpDsc ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV49EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV65Core_bcprodds_12_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Core_bcprodds_12_tfprdnum), 6, "%") ;
      lV67Core_bcprodds_14_tfprdnom = GXutil.padr( GXutil.rtrim( AV67Core_bcprodds_14_tfprdnom), 26, "%") ;
      lV71Core_bcprodds_18_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV71Core_bcprodds_18_tfprducpdsc), 8, "%") ;
      lV73Core_bcprodds_20_tfprvnif = GXutil.padr( GXutil.rtrim( AV73Core_bcprodds_20_tfprvnif), 20, "%") ;
      /* Using cursor P07ZQ3 */
      pr_default.execute(1, new Object[] {AV49EmprCod, lV56Core_bcprodds_3_prdnom1, lV56Core_bcprodds_3_prdnom1, lV60Core_bcprodds_7_prdnom2, lV60Core_bcprodds_7_prdnom2, lV64Core_bcprodds_11_prdnom3, lV64Core_bcprodds_11_prdnom3, lV65Core_bcprodds_12_tfprdnum, AV66Core_bcprodds_13_tfprdnum_sel, lV67Core_bcprodds_14_tfprdnom, AV68Core_bcprodds_15_tfprdnom_sel, AV69Core_bcprodds_16_tfprdpreact, AV70Core_bcprodds_17_tfprdpreact_to, lV71Core_bcprodds_18_tfprducpdsc, AV72Core_bcprodds_19_tfprducpdsc_sel, lV73Core_bcprodds_20_tfprvnif, AV74Core_bcprodds_21_tfprvnif_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk7ZQ4 = false ;
         A795PrvNum = P07ZQ3_A795PrvNum[0] ;
         A742PrdUniCom = P07ZQ3_A742PrdUniCom[0] ;
         A396EmprCod = P07ZQ3_A396EmprCod[0] ;
         A718PrdNom = P07ZQ3_A718PrdNom[0] ;
         A3936PrdEqLP = P07ZQ3_A3936PrdEqLP[0] ;
         A856ValCod = P07ZQ3_A856ValCod[0] ;
         A793PrvNif = P07ZQ3_A793PrvNif[0] ;
         n793PrvNif = P07ZQ3_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZQ3_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ3_n737PrdUcpDsc[0] ;
         A724PrdPreAct = P07ZQ3_A724PrdPreAct[0] ;
         A719PrdNum = P07ZQ3_A719PrdNum[0] ;
         A793PrvNif = P07ZQ3_A793PrvNif[0] ;
         n793PrvNif = P07ZQ3_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZQ3_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ3_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07ZQ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07ZQ3_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk7ZQ4 = false ;
               A719PrdNum = P07ZQ3_A719PrdNum[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7ZQ4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
            {
               AV24Option = A718PrdNom ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZQ4 )
         {
            brk7ZQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDUCPDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdUcpDsc = AV20SearchTxt ;
      AV17TFPrdUcpDsc_Sel = "" ;
      AV54Core_bcprodds_1_dynamicfiltersselector1 = AV38DynamicFiltersSelector1 ;
      AV55Core_bcprodds_2_dynamicfiltersoperator1 = AV39DynamicFiltersOperator1 ;
      AV56Core_bcprodds_3_prdnom1 = AV40PrdNom1 ;
      AV57Core_bcprodds_4_dynamicfiltersenabled2 = AV41DynamicFiltersEnabled2 ;
      AV58Core_bcprodds_5_dynamicfiltersselector2 = AV42DynamicFiltersSelector2 ;
      AV59Core_bcprodds_6_dynamicfiltersoperator2 = AV43DynamicFiltersOperator2 ;
      AV60Core_bcprodds_7_prdnom2 = AV44PrdNom2 ;
      AV61Core_bcprodds_8_dynamicfiltersenabled3 = AV45DynamicFiltersEnabled3 ;
      AV62Core_bcprodds_9_dynamicfiltersselector3 = AV46DynamicFiltersSelector3 ;
      AV63Core_bcprodds_10_dynamicfiltersoperator3 = AV47DynamicFiltersOperator3 ;
      AV64Core_bcprodds_11_prdnom3 = AV48PrdNom3 ;
      AV65Core_bcprodds_12_tfprdnum = AV10TFPrdNum ;
      AV66Core_bcprodds_13_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV67Core_bcprodds_14_tfprdnom = AV12TFPrdNom ;
      AV68Core_bcprodds_15_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV69Core_bcprodds_16_tfprdpreact = AV14TFPrdPreAct ;
      AV70Core_bcprodds_17_tfprdpreact_to = AV15TFPrdPreAct_To ;
      AV71Core_bcprodds_18_tfprducpdsc = AV16TFPrdUcpDsc ;
      AV72Core_bcprodds_19_tfprducpdsc_sel = AV17TFPrdUcpDsc_Sel ;
      AV73Core_bcprodds_20_tfprvnif = AV18TFPrvNif ;
      AV74Core_bcprodds_21_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                           Short.valueOf(AV55Core_bcprodds_2_dynamicfiltersoperator1) ,
                                           AV56Core_bcprodds_3_prdnom1 ,
                                           Boolean.valueOf(AV57Core_bcprodds_4_dynamicfiltersenabled2) ,
                                           AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                           Short.valueOf(AV59Core_bcprodds_6_dynamicfiltersoperator2) ,
                                           AV60Core_bcprodds_7_prdnom2 ,
                                           Boolean.valueOf(AV61Core_bcprodds_8_dynamicfiltersenabled3) ,
                                           AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                           Short.valueOf(AV63Core_bcprodds_10_dynamicfiltersoperator3) ,
                                           AV64Core_bcprodds_11_prdnom3 ,
                                           AV66Core_bcprodds_13_tfprdnum_sel ,
                                           AV65Core_bcprodds_12_tfprdnum ,
                                           AV68Core_bcprodds_15_tfprdnom_sel ,
                                           AV67Core_bcprodds_14_tfprdnom ,
                                           AV69Core_bcprodds_16_tfprdpreact ,
                                           AV70Core_bcprodds_17_tfprdpreact_to ,
                                           AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                           AV71Core_bcprodds_18_tfprducpdsc ,
                                           AV74Core_bcprodds_21_tfprvnif_sel ,
                                           AV73Core_bcprodds_20_tfprvnif ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A724PrdPreAct ,
                                           A737PrdUcpDsc ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV49EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV65Core_bcprodds_12_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Core_bcprodds_12_tfprdnum), 6, "%") ;
      lV67Core_bcprodds_14_tfprdnom = GXutil.padr( GXutil.rtrim( AV67Core_bcprodds_14_tfprdnom), 26, "%") ;
      lV71Core_bcprodds_18_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV71Core_bcprodds_18_tfprducpdsc), 8, "%") ;
      lV73Core_bcprodds_20_tfprvnif = GXutil.padr( GXutil.rtrim( AV73Core_bcprodds_20_tfprvnif), 20, "%") ;
      /* Using cursor P07ZQ4 */
      pr_default.execute(2, new Object[] {AV49EmprCod, lV56Core_bcprodds_3_prdnom1, lV56Core_bcprodds_3_prdnom1, lV60Core_bcprodds_7_prdnom2, lV60Core_bcprodds_7_prdnom2, lV64Core_bcprodds_11_prdnom3, lV64Core_bcprodds_11_prdnom3, lV65Core_bcprodds_12_tfprdnum, AV66Core_bcprodds_13_tfprdnum_sel, lV67Core_bcprodds_14_tfprdnom, AV68Core_bcprodds_15_tfprdnom_sel, AV69Core_bcprodds_16_tfprdpreact, AV70Core_bcprodds_17_tfprdpreact_to, lV71Core_bcprodds_18_tfprducpdsc, AV72Core_bcprodds_19_tfprducpdsc_sel, lV73Core_bcprodds_20_tfprvnif, AV74Core_bcprodds_21_tfprvnif_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk7ZQ6 = false ;
         A795PrvNum = P07ZQ4_A795PrvNum[0] ;
         A742PrdUniCom = P07ZQ4_A742PrdUniCom[0] ;
         A396EmprCod = P07ZQ4_A396EmprCod[0] ;
         A3936PrdEqLP = P07ZQ4_A3936PrdEqLP[0] ;
         A856ValCod = P07ZQ4_A856ValCod[0] ;
         A793PrvNif = P07ZQ4_A793PrvNif[0] ;
         n793PrvNif = P07ZQ4_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZQ4_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ4_n737PrdUcpDsc[0] ;
         A724PrdPreAct = P07ZQ4_A724PrdPreAct[0] ;
         A719PrdNum = P07ZQ4_A719PrdNum[0] ;
         A718PrdNom = P07ZQ4_A718PrdNom[0] ;
         A793PrvNif = P07ZQ4_A793PrvNif[0] ;
         n793PrvNif = P07ZQ4_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZQ4_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ4_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P07ZQ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P07ZQ4_A742PrdUniCom[0] == A742PrdUniCom ) )
            {
               brk7ZQ6 = false ;
               A719PrdNum = P07ZQ4_A719PrdNum[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7ZQ6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A737PrdUcpDsc)==0) )
            {
               AV24Option = A737PrdUcpDsc ;
               AV23InsertIndex = 1 ;
               while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
               {
                  AV23InsertIndex = (int)(AV23InsertIndex+1) ;
               }
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZQ6 )
         {
            brk7ZQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRVNIFOPTIONS' Routine */
      returnInSub = false ;
      AV18TFPrvNif = AV20SearchTxt ;
      AV19TFPrvNif_Sel = "" ;
      AV54Core_bcprodds_1_dynamicfiltersselector1 = AV38DynamicFiltersSelector1 ;
      AV55Core_bcprodds_2_dynamicfiltersoperator1 = AV39DynamicFiltersOperator1 ;
      AV56Core_bcprodds_3_prdnom1 = AV40PrdNom1 ;
      AV57Core_bcprodds_4_dynamicfiltersenabled2 = AV41DynamicFiltersEnabled2 ;
      AV58Core_bcprodds_5_dynamicfiltersselector2 = AV42DynamicFiltersSelector2 ;
      AV59Core_bcprodds_6_dynamicfiltersoperator2 = AV43DynamicFiltersOperator2 ;
      AV60Core_bcprodds_7_prdnom2 = AV44PrdNom2 ;
      AV61Core_bcprodds_8_dynamicfiltersenabled3 = AV45DynamicFiltersEnabled3 ;
      AV62Core_bcprodds_9_dynamicfiltersselector3 = AV46DynamicFiltersSelector3 ;
      AV63Core_bcprodds_10_dynamicfiltersoperator3 = AV47DynamicFiltersOperator3 ;
      AV64Core_bcprodds_11_prdnom3 = AV48PrdNom3 ;
      AV65Core_bcprodds_12_tfprdnum = AV10TFPrdNum ;
      AV66Core_bcprodds_13_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV67Core_bcprodds_14_tfprdnom = AV12TFPrdNom ;
      AV68Core_bcprodds_15_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV69Core_bcprodds_16_tfprdpreact = AV14TFPrdPreAct ;
      AV70Core_bcprodds_17_tfprdpreact_to = AV15TFPrdPreAct_To ;
      AV71Core_bcprodds_18_tfprducpdsc = AV16TFPrdUcpDsc ;
      AV72Core_bcprodds_19_tfprducpdsc_sel = AV17TFPrdUcpDsc_Sel ;
      AV73Core_bcprodds_20_tfprvnif = AV18TFPrvNif ;
      AV74Core_bcprodds_21_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                           Short.valueOf(AV55Core_bcprodds_2_dynamicfiltersoperator1) ,
                                           AV56Core_bcprodds_3_prdnom1 ,
                                           Boolean.valueOf(AV57Core_bcprodds_4_dynamicfiltersenabled2) ,
                                           AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                           Short.valueOf(AV59Core_bcprodds_6_dynamicfiltersoperator2) ,
                                           AV60Core_bcprodds_7_prdnom2 ,
                                           Boolean.valueOf(AV61Core_bcprodds_8_dynamicfiltersenabled3) ,
                                           AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                           Short.valueOf(AV63Core_bcprodds_10_dynamicfiltersoperator3) ,
                                           AV64Core_bcprodds_11_prdnom3 ,
                                           AV66Core_bcprodds_13_tfprdnum_sel ,
                                           AV65Core_bcprodds_12_tfprdnum ,
                                           AV68Core_bcprodds_15_tfprdnom_sel ,
                                           AV67Core_bcprodds_14_tfprdnom ,
                                           AV69Core_bcprodds_16_tfprdpreact ,
                                           AV70Core_bcprodds_17_tfprdpreact_to ,
                                           AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                           AV71Core_bcprodds_18_tfprducpdsc ,
                                           AV74Core_bcprodds_21_tfprvnif_sel ,
                                           AV73Core_bcprodds_20_tfprvnif ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A724PrdPreAct ,
                                           A737PrdUcpDsc ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV56Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV56Core_bcprodds_3_prdnom1), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV60Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV60Core_bcprodds_7_prdnom2), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV64Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV64Core_bcprodds_11_prdnom3), 26, "%") ;
      lV65Core_bcprodds_12_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Core_bcprodds_12_tfprdnum), 6, "%") ;
      lV67Core_bcprodds_14_tfprdnom = GXutil.padr( GXutil.rtrim( AV67Core_bcprodds_14_tfprdnom), 26, "%") ;
      lV71Core_bcprodds_18_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV71Core_bcprodds_18_tfprducpdsc), 8, "%") ;
      lV73Core_bcprodds_20_tfprvnif = GXutil.padr( GXutil.rtrim( AV73Core_bcprodds_20_tfprvnif), 20, "%") ;
      /* Using cursor P07ZQ5 */
      pr_default.execute(3, new Object[] {AV49EmprCod, lV56Core_bcprodds_3_prdnom1, lV56Core_bcprodds_3_prdnom1, lV60Core_bcprodds_7_prdnom2, lV60Core_bcprodds_7_prdnom2, lV64Core_bcprodds_11_prdnom3, lV64Core_bcprodds_11_prdnom3, lV65Core_bcprodds_12_tfprdnum, AV66Core_bcprodds_13_tfprdnum_sel, lV67Core_bcprodds_14_tfprdnom, AV68Core_bcprodds_15_tfprdnom_sel, AV69Core_bcprodds_16_tfprdpreact, AV70Core_bcprodds_17_tfprdpreact_to, lV71Core_bcprodds_18_tfprducpdsc, AV72Core_bcprodds_19_tfprducpdsc_sel, lV73Core_bcprodds_20_tfprvnif, AV74Core_bcprodds_21_tfprvnif_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk7ZQ8 = false ;
         A795PrvNum = P07ZQ5_A795PrvNum[0] ;
         A742PrdUniCom = P07ZQ5_A742PrdUniCom[0] ;
         A396EmprCod = P07ZQ5_A396EmprCod[0] ;
         A856ValCod = P07ZQ5_A856ValCod[0] ;
         A793PrvNif = P07ZQ5_A793PrvNif[0] ;
         n793PrvNif = P07ZQ5_n793PrvNif[0] ;
         A3936PrdEqLP = P07ZQ5_A3936PrdEqLP[0] ;
         A737PrdUcpDsc = P07ZQ5_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ5_n737PrdUcpDsc[0] ;
         A724PrdPreAct = P07ZQ5_A724PrdPreAct[0] ;
         A719PrdNum = P07ZQ5_A719PrdNum[0] ;
         A718PrdNom = P07ZQ5_A718PrdNom[0] ;
         A793PrvNif = P07ZQ5_A793PrvNif[0] ;
         n793PrvNif = P07ZQ5_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZQ5_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZQ5_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P07ZQ5_A793PrvNif[0], A793PrvNif) == 0 ) )
            {
               brk7ZQ8 = false ;
               A795PrvNum = P07ZQ5_A795PrvNum[0] ;
               A396EmprCod = P07ZQ5_A396EmprCod[0] ;
               A719PrdNum = P07ZQ5_A719PrdNum[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7ZQ8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A793PrvNif)==0) )
            {
               AV24Option = A793PrvNif ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZQ8 )
         {
            brk7ZQ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = bcprodgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = bcprodgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = bcprodgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdPreAct = DecimalUtil.ZERO ;
      AV15TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV16TFPrdUcpDsc = "" ;
      AV17TFPrdUcpDsc_Sel = "" ;
      AV18TFPrvNif = "" ;
      AV19TFPrvNif_Sel = "" ;
      AV37GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV38DynamicFiltersSelector1 = "" ;
      AV40PrdNom1 = "" ;
      AV42DynamicFiltersSelector2 = "" ;
      AV44PrdNom2 = "" ;
      AV46DynamicFiltersSelector3 = "" ;
      AV48PrdNom3 = "" ;
      A719PrdNum = "" ;
      AV54Core_bcprodds_1_dynamicfiltersselector1 = "" ;
      AV56Core_bcprodds_3_prdnom1 = "" ;
      AV58Core_bcprodds_5_dynamicfiltersselector2 = "" ;
      AV60Core_bcprodds_7_prdnom2 = "" ;
      AV62Core_bcprodds_9_dynamicfiltersselector3 = "" ;
      AV64Core_bcprodds_11_prdnom3 = "" ;
      AV65Core_bcprodds_12_tfprdnum = "" ;
      AV66Core_bcprodds_13_tfprdnum_sel = "" ;
      AV67Core_bcprodds_14_tfprdnom = "" ;
      AV68Core_bcprodds_15_tfprdnom_sel = "" ;
      AV69Core_bcprodds_16_tfprdpreact = DecimalUtil.ZERO ;
      AV70Core_bcprodds_17_tfprdpreact_to = DecimalUtil.ZERO ;
      AV71Core_bcprodds_18_tfprducpdsc = "" ;
      AV72Core_bcprodds_19_tfprducpdsc_sel = "" ;
      AV73Core_bcprodds_20_tfprvnif = "" ;
      AV74Core_bcprodds_21_tfprvnif_sel = "" ;
      scmdbuf = "" ;
      lV56Core_bcprodds_3_prdnom1 = "" ;
      lV60Core_bcprodds_7_prdnom2 = "" ;
      lV64Core_bcprodds_11_prdnom3 = "" ;
      lV65Core_bcprodds_12_tfprdnum = "" ;
      lV67Core_bcprodds_14_tfprdnom = "" ;
      lV71Core_bcprodds_18_tfprducpdsc = "" ;
      lV73Core_bcprodds_20_tfprvnif = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A793PrvNif = "" ;
      A3936PrdEqLP = "" ;
      AV49EmprCod = "" ;
      A396EmprCod = "" ;
      P07ZQ2_A795PrvNum = new int[1] ;
      P07ZQ2_A742PrdUniCom = new byte[1] ;
      P07ZQ2_A396EmprCod = new String[] {""} ;
      P07ZQ2_A719PrdNum = new String[] {""} ;
      P07ZQ2_A3936PrdEqLP = new String[] {""} ;
      P07ZQ2_A856ValCod = new byte[1] ;
      P07ZQ2_A793PrvNif = new String[] {""} ;
      P07ZQ2_n793PrvNif = new boolean[] {false} ;
      P07ZQ2_A737PrdUcpDsc = new String[] {""} ;
      P07ZQ2_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZQ2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZQ2_A718PrdNom = new String[] {""} ;
      AV24Option = "" ;
      P07ZQ3_A795PrvNum = new int[1] ;
      P07ZQ3_A742PrdUniCom = new byte[1] ;
      P07ZQ3_A396EmprCod = new String[] {""} ;
      P07ZQ3_A718PrdNom = new String[] {""} ;
      P07ZQ3_A3936PrdEqLP = new String[] {""} ;
      P07ZQ3_A856ValCod = new byte[1] ;
      P07ZQ3_A793PrvNif = new String[] {""} ;
      P07ZQ3_n793PrvNif = new boolean[] {false} ;
      P07ZQ3_A737PrdUcpDsc = new String[] {""} ;
      P07ZQ3_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZQ3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZQ3_A719PrdNum = new String[] {""} ;
      P07ZQ4_A795PrvNum = new int[1] ;
      P07ZQ4_A742PrdUniCom = new byte[1] ;
      P07ZQ4_A396EmprCod = new String[] {""} ;
      P07ZQ4_A3936PrdEqLP = new String[] {""} ;
      P07ZQ4_A856ValCod = new byte[1] ;
      P07ZQ4_A793PrvNif = new String[] {""} ;
      P07ZQ4_n793PrvNif = new boolean[] {false} ;
      P07ZQ4_A737PrdUcpDsc = new String[] {""} ;
      P07ZQ4_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZQ4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZQ4_A719PrdNum = new String[] {""} ;
      P07ZQ4_A718PrdNom = new String[] {""} ;
      P07ZQ5_A795PrvNum = new int[1] ;
      P07ZQ5_A742PrdUniCom = new byte[1] ;
      P07ZQ5_A396EmprCod = new String[] {""} ;
      P07ZQ5_A856ValCod = new byte[1] ;
      P07ZQ5_A793PrvNif = new String[] {""} ;
      P07ZQ5_n793PrvNif = new boolean[] {false} ;
      P07ZQ5_A3936PrdEqLP = new String[] {""} ;
      P07ZQ5_A737PrdUcpDsc = new String[] {""} ;
      P07ZQ5_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZQ5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZQ5_A719PrdNum = new String[] {""} ;
      P07ZQ5_A718PrdNom = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.bcprodgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07ZQ2_A795PrvNum, P07ZQ2_A742PrdUniCom, P07ZQ2_A396EmprCod, P07ZQ2_A719PrdNum, P07ZQ2_A3936PrdEqLP, P07ZQ2_A856ValCod, P07ZQ2_A793PrvNif, P07ZQ2_n793PrvNif, P07ZQ2_A737PrdUcpDsc, P07ZQ2_n737PrdUcpDsc,
            P07ZQ2_A724PrdPreAct, P07ZQ2_A718PrdNom
            }
            , new Object[] {
            P07ZQ3_A795PrvNum, P07ZQ3_A742PrdUniCom, P07ZQ3_A396EmprCod, P07ZQ3_A718PrdNom, P07ZQ3_A3936PrdEqLP, P07ZQ3_A856ValCod, P07ZQ3_A793PrvNif, P07ZQ3_n793PrvNif, P07ZQ3_A737PrdUcpDsc, P07ZQ3_n737PrdUcpDsc,
            P07ZQ3_A724PrdPreAct, P07ZQ3_A719PrdNum
            }
            , new Object[] {
            P07ZQ4_A795PrvNum, P07ZQ4_A742PrdUniCom, P07ZQ4_A396EmprCod, P07ZQ4_A3936PrdEqLP, P07ZQ4_A856ValCod, P07ZQ4_A793PrvNif, P07ZQ4_n793PrvNif, P07ZQ4_A737PrdUcpDsc, P07ZQ4_n737PrdUcpDsc, P07ZQ4_A724PrdPreAct,
            P07ZQ4_A719PrdNum, P07ZQ4_A718PrdNom
            }
            , new Object[] {
            P07ZQ5_A795PrvNum, P07ZQ5_A742PrdUniCom, P07ZQ5_A396EmprCod, P07ZQ5_A856ValCod, P07ZQ5_A793PrvNif, P07ZQ5_n793PrvNif, P07ZQ5_A3936PrdEqLP, P07ZQ5_A737PrdUcpDsc, P07ZQ5_n737PrdUcpDsc, P07ZQ5_A724PrdPreAct,
            P07ZQ5_A719PrdNum, P07ZQ5_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A742PrdUniCom ;
   private short AV39DynamicFiltersOperator1 ;
   private short AV43DynamicFiltersOperator2 ;
   private short AV47DynamicFiltersOperator3 ;
   private short AV55Core_bcprodds_2_dynamicfiltersoperator1 ;
   private short AV59Core_bcprodds_6_dynamicfiltersoperator2 ;
   private short AV63Core_bcprodds_10_dynamicfiltersoperator3 ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int A795PrvNum ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV14TFPrdPreAct ;
   private java.math.BigDecimal AV15TFPrdPreAct_To ;
   private java.math.BigDecimal AV69Core_bcprodds_16_tfprdpreact ;
   private java.math.BigDecimal AV70Core_bcprodds_17_tfprdpreact_to ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV16TFPrdUcpDsc ;
   private String AV17TFPrdUcpDsc_Sel ;
   private String AV18TFPrvNif ;
   private String AV19TFPrvNif_Sel ;
   private String AV40PrdNom1 ;
   private String AV44PrdNom2 ;
   private String AV48PrdNom3 ;
   private String A719PrdNum ;
   private String AV56Core_bcprodds_3_prdnom1 ;
   private String AV60Core_bcprodds_7_prdnom2 ;
   private String AV64Core_bcprodds_11_prdnom3 ;
   private String AV65Core_bcprodds_12_tfprdnum ;
   private String AV66Core_bcprodds_13_tfprdnum_sel ;
   private String AV67Core_bcprodds_14_tfprdnom ;
   private String AV68Core_bcprodds_15_tfprdnom_sel ;
   private String AV71Core_bcprodds_18_tfprducpdsc ;
   private String AV72Core_bcprodds_19_tfprducpdsc_sel ;
   private String AV73Core_bcprodds_20_tfprvnif ;
   private String AV74Core_bcprodds_21_tfprvnif_sel ;
   private String scmdbuf ;
   private String lV56Core_bcprodds_3_prdnom1 ;
   private String lV60Core_bcprodds_7_prdnom2 ;
   private String lV64Core_bcprodds_11_prdnom3 ;
   private String lV65Core_bcprodds_12_tfprdnum ;
   private String lV67Core_bcprodds_14_tfprdnom ;
   private String lV71Core_bcprodds_18_tfprducpdsc ;
   private String lV73Core_bcprodds_20_tfprvnif ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String A793PrvNif ;
   private String A3936PrdEqLP ;
   private String AV49EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean AV41DynamicFiltersEnabled2 ;
   private boolean AV45DynamicFiltersEnabled3 ;
   private boolean AV57Core_bcprodds_4_dynamicfiltersenabled2 ;
   private boolean AV61Core_bcprodds_8_dynamicfiltersenabled3 ;
   private boolean brk7ZQ2 ;
   private boolean n793PrvNif ;
   private boolean n737PrdUcpDsc ;
   private boolean brk7ZQ4 ;
   private boolean brk7ZQ6 ;
   private boolean brk7ZQ8 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV38DynamicFiltersSelector1 ;
   private String AV42DynamicFiltersSelector2 ;
   private String AV46DynamicFiltersSelector3 ;
   private String AV54Core_bcprodds_1_dynamicfiltersselector1 ;
   private String AV58Core_bcprodds_5_dynamicfiltersselector2 ;
   private String AV62Core_bcprodds_9_dynamicfiltersselector3 ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P07ZQ2_A795PrvNum ;
   private byte[] P07ZQ2_A742PrdUniCom ;
   private String[] P07ZQ2_A396EmprCod ;
   private String[] P07ZQ2_A719PrdNum ;
   private String[] P07ZQ2_A3936PrdEqLP ;
   private byte[] P07ZQ2_A856ValCod ;
   private String[] P07ZQ2_A793PrvNif ;
   private boolean[] P07ZQ2_n793PrvNif ;
   private String[] P07ZQ2_A737PrdUcpDsc ;
   private boolean[] P07ZQ2_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P07ZQ2_A724PrdPreAct ;
   private String[] P07ZQ2_A718PrdNom ;
   private int[] P07ZQ3_A795PrvNum ;
   private byte[] P07ZQ3_A742PrdUniCom ;
   private String[] P07ZQ3_A396EmprCod ;
   private String[] P07ZQ3_A718PrdNom ;
   private String[] P07ZQ3_A3936PrdEqLP ;
   private byte[] P07ZQ3_A856ValCod ;
   private String[] P07ZQ3_A793PrvNif ;
   private boolean[] P07ZQ3_n793PrvNif ;
   private String[] P07ZQ3_A737PrdUcpDsc ;
   private boolean[] P07ZQ3_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P07ZQ3_A724PrdPreAct ;
   private String[] P07ZQ3_A719PrdNum ;
   private int[] P07ZQ4_A795PrvNum ;
   private byte[] P07ZQ4_A742PrdUniCom ;
   private String[] P07ZQ4_A396EmprCod ;
   private String[] P07ZQ4_A3936PrdEqLP ;
   private byte[] P07ZQ4_A856ValCod ;
   private String[] P07ZQ4_A793PrvNif ;
   private boolean[] P07ZQ4_n793PrvNif ;
   private String[] P07ZQ4_A737PrdUcpDsc ;
   private boolean[] P07ZQ4_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P07ZQ4_A724PrdPreAct ;
   private String[] P07ZQ4_A719PrdNum ;
   private String[] P07ZQ4_A718PrdNom ;
   private int[] P07ZQ5_A795PrvNum ;
   private byte[] P07ZQ5_A742PrdUniCom ;
   private String[] P07ZQ5_A396EmprCod ;
   private byte[] P07ZQ5_A856ValCod ;
   private String[] P07ZQ5_A793PrvNif ;
   private boolean[] P07ZQ5_n793PrvNif ;
   private String[] P07ZQ5_A3936PrdEqLP ;
   private String[] P07ZQ5_A737PrdUcpDsc ;
   private boolean[] P07ZQ5_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P07ZQ5_A724PrdPreAct ;
   private String[] P07ZQ5_A719PrdNum ;
   private String[] P07ZQ5_A718PrdNom ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV37GridStateDynamicFilter ;
}

final  class bcprodgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                          short AV55Core_bcprodds_2_dynamicfiltersoperator1 ,
                                          String AV56Core_bcprodds_3_prdnom1 ,
                                          boolean AV57Core_bcprodds_4_dynamicfiltersenabled2 ,
                                          String AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                          short AV59Core_bcprodds_6_dynamicfiltersoperator2 ,
                                          String AV60Core_bcprodds_7_prdnom2 ,
                                          boolean AV61Core_bcprodds_8_dynamicfiltersenabled3 ,
                                          String AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                          short AV63Core_bcprodds_10_dynamicfiltersoperator3 ,
                                          String AV64Core_bcprodds_11_prdnom3 ,
                                          String AV66Core_bcprodds_13_tfprdnum_sel ,
                                          String AV65Core_bcprodds_12_tfprdnum ,
                                          String AV68Core_bcprodds_15_tfprdnom_sel ,
                                          String AV67Core_bcprodds_14_tfprdnom ,
                                          java.math.BigDecimal AV69Core_bcprodds_16_tfprdpreact ,
                                          java.math.BigDecimal AV70Core_bcprodds_17_tfprdpreact_to ,
                                          String AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                          String AV71Core_bcprodds_18_tfprducpdsc ,
                                          String AV74Core_bcprodds_21_tfprvnif_sel ,
                                          String AV73Core_bcprodds_20_tfprvnif ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A737PrdUcpDsc ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          byte A856ValCod ,
                                          String AV49EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PrdNum, T1.PrdEqLP, T1.ValCod, T2.PrvNif, T3.UniDsc AS PrdUcpDsc, T1.PrdPreAct, T1.PrdNom FROM ((TXPPRODUC" ;
      scmdbuf += " T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Core_bcprodds_12_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNum like ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_bcprodds_14_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Core_bcprodds_16_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Core_bcprodds_17_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_bcprodds_18_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(T3.UniDsc like ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV73Core_bcprodds_20_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(T2.PrvNif like ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P07ZQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                          short AV55Core_bcprodds_2_dynamicfiltersoperator1 ,
                                          String AV56Core_bcprodds_3_prdnom1 ,
                                          boolean AV57Core_bcprodds_4_dynamicfiltersenabled2 ,
                                          String AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                          short AV59Core_bcprodds_6_dynamicfiltersoperator2 ,
                                          String AV60Core_bcprodds_7_prdnom2 ,
                                          boolean AV61Core_bcprodds_8_dynamicfiltersenabled3 ,
                                          String AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                          short AV63Core_bcprodds_10_dynamicfiltersoperator3 ,
                                          String AV64Core_bcprodds_11_prdnom3 ,
                                          String AV66Core_bcprodds_13_tfprdnum_sel ,
                                          String AV65Core_bcprodds_12_tfprdnum ,
                                          String AV68Core_bcprodds_15_tfprdnom_sel ,
                                          String AV67Core_bcprodds_14_tfprdnom ,
                                          java.math.BigDecimal AV69Core_bcprodds_16_tfprdpreact ,
                                          java.math.BigDecimal AV70Core_bcprodds_17_tfprdpreact_to ,
                                          String AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                          String AV71Core_bcprodds_18_tfprducpdsc ,
                                          String AV74Core_bcprodds_21_tfprvnif_sel ,
                                          String AV73Core_bcprodds_20_tfprvnif ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A737PrdUcpDsc ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          byte A856ValCod ,
                                          String AV49EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[17];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PrdNom, T1.PrdEqLP, T1.ValCod, T2.PrvNif, T3.UniDsc AS PrdUcpDsc, T1.PrdPreAct, T1.PrdNum FROM ((TXPPRODUC" ;
      scmdbuf += " T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Core_bcprodds_12_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNum like ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_bcprodds_14_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Core_bcprodds_16_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Core_bcprodds_17_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_bcprodds_18_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(T3.UniDsc like ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV73Core_bcprodds_20_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(T2.PrvNif like ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P07ZQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                          short AV55Core_bcprodds_2_dynamicfiltersoperator1 ,
                                          String AV56Core_bcprodds_3_prdnom1 ,
                                          boolean AV57Core_bcprodds_4_dynamicfiltersenabled2 ,
                                          String AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                          short AV59Core_bcprodds_6_dynamicfiltersoperator2 ,
                                          String AV60Core_bcprodds_7_prdnom2 ,
                                          boolean AV61Core_bcprodds_8_dynamicfiltersenabled3 ,
                                          String AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                          short AV63Core_bcprodds_10_dynamicfiltersoperator3 ,
                                          String AV64Core_bcprodds_11_prdnom3 ,
                                          String AV66Core_bcprodds_13_tfprdnum_sel ,
                                          String AV65Core_bcprodds_12_tfprdnum ,
                                          String AV68Core_bcprodds_15_tfprdnom_sel ,
                                          String AV67Core_bcprodds_14_tfprdnom ,
                                          java.math.BigDecimal AV69Core_bcprodds_16_tfprdpreact ,
                                          java.math.BigDecimal AV70Core_bcprodds_17_tfprdpreact_to ,
                                          String AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                          String AV71Core_bcprodds_18_tfprducpdsc ,
                                          String AV74Core_bcprodds_21_tfprvnif_sel ,
                                          String AV73Core_bcprodds_20_tfprvnif ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A737PrdUcpDsc ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          byte A856ValCod ,
                                          String AV49EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PrdEqLP, T1.ValCod, T2.PrvNif, T3.UniDsc AS PrdUcpDsc, T1.PrdPreAct, T1.PrdNum, T1.PrdNom FROM ((TXPPRODUC" ;
      scmdbuf += " T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Core_bcprodds_12_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNum like ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_bcprodds_14_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Core_bcprodds_16_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Core_bcprodds_17_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_bcprodds_18_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(T3.UniDsc like ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV73Core_bcprodds_20_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(T2.PrvNif like ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdUniCom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P07ZQ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Core_bcprodds_1_dynamicfiltersselector1 ,
                                          short AV55Core_bcprodds_2_dynamicfiltersoperator1 ,
                                          String AV56Core_bcprodds_3_prdnom1 ,
                                          boolean AV57Core_bcprodds_4_dynamicfiltersenabled2 ,
                                          String AV58Core_bcprodds_5_dynamicfiltersselector2 ,
                                          short AV59Core_bcprodds_6_dynamicfiltersoperator2 ,
                                          String AV60Core_bcprodds_7_prdnom2 ,
                                          boolean AV61Core_bcprodds_8_dynamicfiltersenabled3 ,
                                          String AV62Core_bcprodds_9_dynamicfiltersselector3 ,
                                          short AV63Core_bcprodds_10_dynamicfiltersoperator3 ,
                                          String AV64Core_bcprodds_11_prdnom3 ,
                                          String AV66Core_bcprodds_13_tfprdnum_sel ,
                                          String AV65Core_bcprodds_12_tfprdnum ,
                                          String AV68Core_bcprodds_15_tfprdnom_sel ,
                                          String AV67Core_bcprodds_14_tfprdnom ,
                                          java.math.BigDecimal AV69Core_bcprodds_16_tfprdpreact ,
                                          java.math.BigDecimal AV70Core_bcprodds_17_tfprdpreact_to ,
                                          String AV72Core_bcprodds_19_tfprducpdsc_sel ,
                                          String AV71Core_bcprodds_18_tfprducpdsc ,
                                          String AV74Core_bcprodds_21_tfprvnif_sel ,
                                          String AV73Core_bcprodds_20_tfprvnif ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A737PrdUcpDsc ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.ValCod, T2.PrvNif, T1.PrdEqLP, T3.UniDsc AS PrdUcpDsc, T1.PrdPreAct, T1.PrdNum, T1.PrdNom FROM ((TXPPRODUC" ;
      scmdbuf += " T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV54Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV55Core_bcprodds_2_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV56Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV57Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV58Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV59Core_bcprodds_6_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV60Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV61Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV62Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV63Core_bcprodds_10_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV64Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Core_bcprodds_12_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNum like ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Core_bcprodds_13_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_bcprodds_14_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_bcprodds_15_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Core_bcprodds_16_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Core_bcprodds_17_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_bcprodds_18_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(T3.UniDsc like ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_bcprodds_19_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV73Core_bcprodds_20_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(T2.PrvNif like ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Core_bcprodds_21_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrvNif" ;
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
                  return conditional_P07ZQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Boolean) dynConstraints[3]).booleanValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P07ZQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Boolean) dynConstraints[3]).booleanValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P07ZQ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Boolean) dynConstraints[3]).booleanValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 3 :
                  return conditional_P07ZQ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Boolean) dynConstraints[3]).booleanValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZQ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               return;
      }
   }

}

