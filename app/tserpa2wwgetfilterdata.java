package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tserpa2wwgetfilterdata extends GXProcedure
{
   public tserpa2wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tserpa2wwgetfilterdata.class ), "" );
   }

   public tserpa2wwgetfilterdata( int remoteHandle ,
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
      tserpa2wwgetfilterdata.this.aP5 = new String[] {""};
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
      tserpa2wwgetfilterdata.this.AV40DDOName = aP0;
      tserpa2wwgetfilterdata.this.AV41SearchTxt = aP1;
      tserpa2wwgetfilterdata.this.AV42SearchTxtTo = aP2;
      tserpa2wwgetfilterdata.this.aP3 = aP3;
      tserpa2wwgetfilterdata.this.aP4 = aP4;
      tserpa2wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PARFASVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADPARFASVALOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PARUNDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPARUNDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PARFASVL2") == 0 )
      {
         /* Execute user subroutine: 'LOADPARFASVL2OPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PARFASVMN") == 0 )
      {
         /* Execute user subroutine: 'LOADPARFASVMNOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PARFASVMX") == 0 )
      {
         /* Execute user subroutine: 'LOADPARFASVMXOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PARTIT") == 0 )
      {
         /* Execute user subroutine: 'LOADPARTITOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PARFASOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADPARFASOBSOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV43OptionsJson = AV30Options.toJSonString(false) ;
      AV44OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV33OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("TSERPA2WWGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TSERPA2WWGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("TSERPA2WWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVAL") == 0 )
         {
            AV10TFParFasVal = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVAL_SEL") == 0 )
         {
            AV11TFParFasVal_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDID") == 0 )
         {
            AV12TFParUndID = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFParUndID_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC") == 0 )
         {
            AV14TFParUndDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC_SEL") == 0 )
         {
            AV15TFParUndDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVL2") == 0 )
         {
            AV16TFParFasVl2 = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVL2_SEL") == 0 )
         {
            AV17TFParFasVl2_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVMN") == 0 )
         {
            AV18TFParFasVmn = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVMN_SEL") == 0 )
         {
            AV19TFParFasVmn_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVMX") == 0 )
         {
            AV20TFParFasVmx = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASVMX_SEL") == 0 )
         {
            AV21TFParFasVmx_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARNVAR") == 0 )
         {
            AV22TFParNVar = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFParNVar_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARTIT") == 0 )
         {
            AV24TFParTit = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARTIT_SEL") == 0 )
         {
            AV25TFParTit_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASOBS") == 0 )
         {
            AV26TFParFasObs = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASOBS_SEL") == 0 )
         {
            AV27TFParFasObs_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPARFASVALOPTIONS' Routine */
      returnInSub = false ;
      AV10TFParFasVal = AV41SearchTxt ;
      AV11TFParFasVal_Sel = "" ;
      AV51Tserpa2wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tserpa2wwds_2_tfparfasval = AV10TFParFasVal ;
      AV53Tserpa2wwds_3_tfparfasval_sel = AV11TFParFasVal_Sel ;
      AV54Tserpa2wwds_4_tfparundid = AV12TFParUndID ;
      AV55Tserpa2wwds_5_tfparundid_to = AV13TFParUndID_To ;
      AV56Tserpa2wwds_6_tfparunddsc = AV14TFParUndDsc ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = AV15TFParUndDsc_Sel ;
      AV58Tserpa2wwds_8_tfparfasvl2 = AV16TFParFasVl2 ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = AV17TFParFasVl2_Sel ;
      AV60Tserpa2wwds_10_tfparfasvmn = AV18TFParFasVmn ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = AV19TFParFasVmn_Sel ;
      AV62Tserpa2wwds_12_tfparfasvmx = AV20TFParFasVmx ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = AV21TFParFasVmx_Sel ;
      AV64Tserpa2wwds_14_tfparnvar = AV22TFParNVar ;
      AV65Tserpa2wwds_15_tfparnvar_to = AV23TFParNVar_To ;
      AV66Tserpa2wwds_16_tfpartit = AV24TFParTit ;
      AV67Tserpa2wwds_17_tfpartit_sel = AV25TFParTit_Sel ;
      AV68Tserpa2wwds_18_tfparfasobs = AV26TFParFasObs ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = AV27TFParFasObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Tserpa2wwds_1_filterfulltext ,
                                           AV53Tserpa2wwds_3_tfparfasval_sel ,
                                           AV52Tserpa2wwds_2_tfparfasval ,
                                           Short.valueOf(AV54Tserpa2wwds_4_tfparundid) ,
                                           Short.valueOf(AV55Tserpa2wwds_5_tfparundid_to) ,
                                           AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                           AV56Tserpa2wwds_6_tfparunddsc ,
                                           AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                           AV58Tserpa2wwds_8_tfparfasvl2 ,
                                           AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                           AV60Tserpa2wwds_10_tfparfasvmn ,
                                           AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                           AV62Tserpa2wwds_12_tfparfasvmx ,
                                           Short.valueOf(AV64Tserpa2wwds_14_tfparnvar) ,
                                           Short.valueOf(AV65Tserpa2wwds_15_tfparnvar_to) ,
                                           AV67Tserpa2wwds_17_tfpartit_sel ,
                                           AV66Tserpa2wwds_16_tfpartit ,
                                           AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                           AV68Tserpa2wwds_18_tfparfasobs ,
                                           A1668ParFasVal ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           A12670ParFasVl2 ,
                                           A14061ParFasVmn ,
                                           A14060ParFasVmx ,
                                           Short.valueOf(A10584ParNVar) ,
                                           A10585ParTit ,
                                           A1673ParFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7S2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA7S2 = false ;
         A396EmprCod = P0A7S2_A396EmprCod[0] ;
         A252CliCod = P0A7S2_A252CliCod[0] ;
         A65ArtCod = P0A7S2_A65ArtCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) )
         {
            brkA7S2 = false ;
            A396EmprCod = P0A7S2_A396EmprCod[0] ;
            A252CliCod = P0A7S2_A252CliCod[0] ;
            A65ArtCod = P0A7S2_A65ArtCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brkA7S2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1668ParFasVal)==0) )
         {
            AV29Option = A1668ParFasVal ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7S2 )
         {
            brkA7S2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPARUNDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFParUndDsc = AV41SearchTxt ;
      AV15TFParUndDsc_Sel = "" ;
      AV51Tserpa2wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tserpa2wwds_2_tfparfasval = AV10TFParFasVal ;
      AV53Tserpa2wwds_3_tfparfasval_sel = AV11TFParFasVal_Sel ;
      AV54Tserpa2wwds_4_tfparundid = AV12TFParUndID ;
      AV55Tserpa2wwds_5_tfparundid_to = AV13TFParUndID_To ;
      AV56Tserpa2wwds_6_tfparunddsc = AV14TFParUndDsc ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = AV15TFParUndDsc_Sel ;
      AV58Tserpa2wwds_8_tfparfasvl2 = AV16TFParFasVl2 ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = AV17TFParFasVl2_Sel ;
      AV60Tserpa2wwds_10_tfparfasvmn = AV18TFParFasVmn ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = AV19TFParFasVmn_Sel ;
      AV62Tserpa2wwds_12_tfparfasvmx = AV20TFParFasVmx ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = AV21TFParFasVmx_Sel ;
      AV64Tserpa2wwds_14_tfparnvar = AV22TFParNVar ;
      AV65Tserpa2wwds_15_tfparnvar_to = AV23TFParNVar_To ;
      AV66Tserpa2wwds_16_tfpartit = AV24TFParTit ;
      AV67Tserpa2wwds_17_tfpartit_sel = AV25TFParTit_Sel ;
      AV68Tserpa2wwds_18_tfparfasobs = AV26TFParFasObs ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = AV27TFParFasObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Tserpa2wwds_1_filterfulltext ,
                                           AV53Tserpa2wwds_3_tfparfasval_sel ,
                                           AV52Tserpa2wwds_2_tfparfasval ,
                                           Short.valueOf(AV54Tserpa2wwds_4_tfparundid) ,
                                           Short.valueOf(AV55Tserpa2wwds_5_tfparundid_to) ,
                                           AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                           AV56Tserpa2wwds_6_tfparunddsc ,
                                           AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                           AV58Tserpa2wwds_8_tfparfasvl2 ,
                                           AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                           AV60Tserpa2wwds_10_tfparfasvmn ,
                                           AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                           AV62Tserpa2wwds_12_tfparfasvmx ,
                                           Short.valueOf(AV64Tserpa2wwds_14_tfparnvar) ,
                                           Short.valueOf(AV65Tserpa2wwds_15_tfparnvar_to) ,
                                           AV67Tserpa2wwds_17_tfpartit_sel ,
                                           AV66Tserpa2wwds_16_tfpartit ,
                                           AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                           AV68Tserpa2wwds_18_tfparfasobs ,
                                           A1668ParFasVal ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           A12670ParFasVl2 ,
                                           A14061ParFasVmn ,
                                           A14060ParFasVmx ,
                                           Short.valueOf(A10584ParNVar) ,
                                           A10585ParTit ,
                                           A1673ParFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7S3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA7S4 = false ;
         A396EmprCod = P0A7S3_A396EmprCod[0] ;
         A252CliCod = P0A7S3_A252CliCod[0] ;
         A65ArtCod = P0A7S3_A65ArtCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkA7S4 = false ;
            A396EmprCod = P0A7S3_A396EmprCod[0] ;
            A252CliCod = P0A7S3_A252CliCod[0] ;
            A65ArtCod = P0A7S3_A65ArtCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brkA7S4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13204ParUndDsc)==0) )
         {
            AV29Option = A13204ParUndDsc ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7S4 )
         {
            brkA7S4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPARFASVL2OPTIONS' Routine */
      returnInSub = false ;
      AV16TFParFasVl2 = AV41SearchTxt ;
      AV17TFParFasVl2_Sel = "" ;
      AV51Tserpa2wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tserpa2wwds_2_tfparfasval = AV10TFParFasVal ;
      AV53Tserpa2wwds_3_tfparfasval_sel = AV11TFParFasVal_Sel ;
      AV54Tserpa2wwds_4_tfparundid = AV12TFParUndID ;
      AV55Tserpa2wwds_5_tfparundid_to = AV13TFParUndID_To ;
      AV56Tserpa2wwds_6_tfparunddsc = AV14TFParUndDsc ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = AV15TFParUndDsc_Sel ;
      AV58Tserpa2wwds_8_tfparfasvl2 = AV16TFParFasVl2 ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = AV17TFParFasVl2_Sel ;
      AV60Tserpa2wwds_10_tfparfasvmn = AV18TFParFasVmn ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = AV19TFParFasVmn_Sel ;
      AV62Tserpa2wwds_12_tfparfasvmx = AV20TFParFasVmx ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = AV21TFParFasVmx_Sel ;
      AV64Tserpa2wwds_14_tfparnvar = AV22TFParNVar ;
      AV65Tserpa2wwds_15_tfparnvar_to = AV23TFParNVar_To ;
      AV66Tserpa2wwds_16_tfpartit = AV24TFParTit ;
      AV67Tserpa2wwds_17_tfpartit_sel = AV25TFParTit_Sel ;
      AV68Tserpa2wwds_18_tfparfasobs = AV26TFParFasObs ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = AV27TFParFasObs_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV51Tserpa2wwds_1_filterfulltext ,
                                           AV53Tserpa2wwds_3_tfparfasval_sel ,
                                           AV52Tserpa2wwds_2_tfparfasval ,
                                           Short.valueOf(AV54Tserpa2wwds_4_tfparundid) ,
                                           Short.valueOf(AV55Tserpa2wwds_5_tfparundid_to) ,
                                           AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                           AV56Tserpa2wwds_6_tfparunddsc ,
                                           AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                           AV58Tserpa2wwds_8_tfparfasvl2 ,
                                           AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                           AV60Tserpa2wwds_10_tfparfasvmn ,
                                           AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                           AV62Tserpa2wwds_12_tfparfasvmx ,
                                           Short.valueOf(AV64Tserpa2wwds_14_tfparnvar) ,
                                           Short.valueOf(AV65Tserpa2wwds_15_tfparnvar_to) ,
                                           AV67Tserpa2wwds_17_tfpartit_sel ,
                                           AV66Tserpa2wwds_16_tfpartit ,
                                           AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                           AV68Tserpa2wwds_18_tfparfasobs ,
                                           A1668ParFasVal ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           A12670ParFasVl2 ,
                                           A14061ParFasVmn ,
                                           A14060ParFasVmx ,
                                           Short.valueOf(A10584ParNVar) ,
                                           A10585ParTit ,
                                           A1673ParFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7S4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA7S6 = false ;
         A396EmprCod = P0A7S4_A396EmprCod[0] ;
         A252CliCod = P0A7S4_A252CliCod[0] ;
         A65ArtCod = P0A7S4_A65ArtCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) )
         {
            brkA7S6 = false ;
            A396EmprCod = P0A7S4_A396EmprCod[0] ;
            A252CliCod = P0A7S4_A252CliCod[0] ;
            A65ArtCod = P0A7S4_A65ArtCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brkA7S6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A12670ParFasVl2)==0) )
         {
            AV29Option = A12670ParFasVl2 ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7S6 )
         {
            brkA7S6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPARFASVMNOPTIONS' Routine */
      returnInSub = false ;
      AV18TFParFasVmn = AV41SearchTxt ;
      AV19TFParFasVmn_Sel = "" ;
      AV51Tserpa2wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tserpa2wwds_2_tfparfasval = AV10TFParFasVal ;
      AV53Tserpa2wwds_3_tfparfasval_sel = AV11TFParFasVal_Sel ;
      AV54Tserpa2wwds_4_tfparundid = AV12TFParUndID ;
      AV55Tserpa2wwds_5_tfparundid_to = AV13TFParUndID_To ;
      AV56Tserpa2wwds_6_tfparunddsc = AV14TFParUndDsc ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = AV15TFParUndDsc_Sel ;
      AV58Tserpa2wwds_8_tfparfasvl2 = AV16TFParFasVl2 ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = AV17TFParFasVl2_Sel ;
      AV60Tserpa2wwds_10_tfparfasvmn = AV18TFParFasVmn ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = AV19TFParFasVmn_Sel ;
      AV62Tserpa2wwds_12_tfparfasvmx = AV20TFParFasVmx ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = AV21TFParFasVmx_Sel ;
      AV64Tserpa2wwds_14_tfparnvar = AV22TFParNVar ;
      AV65Tserpa2wwds_15_tfparnvar_to = AV23TFParNVar_To ;
      AV66Tserpa2wwds_16_tfpartit = AV24TFParTit ;
      AV67Tserpa2wwds_17_tfpartit_sel = AV25TFParTit_Sel ;
      AV68Tserpa2wwds_18_tfparfasobs = AV26TFParFasObs ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = AV27TFParFasObs_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV51Tserpa2wwds_1_filterfulltext ,
                                           AV53Tserpa2wwds_3_tfparfasval_sel ,
                                           AV52Tserpa2wwds_2_tfparfasval ,
                                           Short.valueOf(AV54Tserpa2wwds_4_tfparundid) ,
                                           Short.valueOf(AV55Tserpa2wwds_5_tfparundid_to) ,
                                           AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                           AV56Tserpa2wwds_6_tfparunddsc ,
                                           AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                           AV58Tserpa2wwds_8_tfparfasvl2 ,
                                           AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                           AV60Tserpa2wwds_10_tfparfasvmn ,
                                           AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                           AV62Tserpa2wwds_12_tfparfasvmx ,
                                           Short.valueOf(AV64Tserpa2wwds_14_tfparnvar) ,
                                           Short.valueOf(AV65Tserpa2wwds_15_tfparnvar_to) ,
                                           AV67Tserpa2wwds_17_tfpartit_sel ,
                                           AV66Tserpa2wwds_16_tfpartit ,
                                           AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                           AV68Tserpa2wwds_18_tfparfasobs ,
                                           A1668ParFasVal ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           A12670ParFasVl2 ,
                                           A14061ParFasVmn ,
                                           A14060ParFasVmx ,
                                           Short.valueOf(A10584ParNVar) ,
                                           A10585ParTit ,
                                           A1673ParFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7S5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA7S8 = false ;
         A396EmprCod = P0A7S5_A396EmprCod[0] ;
         A252CliCod = P0A7S5_A252CliCod[0] ;
         A65ArtCod = P0A7S5_A65ArtCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(3) != 101) )
         {
            brkA7S8 = false ;
            A396EmprCod = P0A7S5_A396EmprCod[0] ;
            A252CliCod = P0A7S5_A252CliCod[0] ;
            A65ArtCod = P0A7S5_A65ArtCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brkA7S8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14061ParFasVmn)==0) )
         {
            AV29Option = A14061ParFasVmn ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7S8 )
         {
            brkA7S8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPARFASVMXOPTIONS' Routine */
      returnInSub = false ;
      AV20TFParFasVmx = AV41SearchTxt ;
      AV21TFParFasVmx_Sel = "" ;
      AV51Tserpa2wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tserpa2wwds_2_tfparfasval = AV10TFParFasVal ;
      AV53Tserpa2wwds_3_tfparfasval_sel = AV11TFParFasVal_Sel ;
      AV54Tserpa2wwds_4_tfparundid = AV12TFParUndID ;
      AV55Tserpa2wwds_5_tfparundid_to = AV13TFParUndID_To ;
      AV56Tserpa2wwds_6_tfparunddsc = AV14TFParUndDsc ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = AV15TFParUndDsc_Sel ;
      AV58Tserpa2wwds_8_tfparfasvl2 = AV16TFParFasVl2 ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = AV17TFParFasVl2_Sel ;
      AV60Tserpa2wwds_10_tfparfasvmn = AV18TFParFasVmn ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = AV19TFParFasVmn_Sel ;
      AV62Tserpa2wwds_12_tfparfasvmx = AV20TFParFasVmx ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = AV21TFParFasVmx_Sel ;
      AV64Tserpa2wwds_14_tfparnvar = AV22TFParNVar ;
      AV65Tserpa2wwds_15_tfparnvar_to = AV23TFParNVar_To ;
      AV66Tserpa2wwds_16_tfpartit = AV24TFParTit ;
      AV67Tserpa2wwds_17_tfpartit_sel = AV25TFParTit_Sel ;
      AV68Tserpa2wwds_18_tfparfasobs = AV26TFParFasObs ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = AV27TFParFasObs_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV51Tserpa2wwds_1_filterfulltext ,
                                           AV53Tserpa2wwds_3_tfparfasval_sel ,
                                           AV52Tserpa2wwds_2_tfparfasval ,
                                           Short.valueOf(AV54Tserpa2wwds_4_tfparundid) ,
                                           Short.valueOf(AV55Tserpa2wwds_5_tfparundid_to) ,
                                           AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                           AV56Tserpa2wwds_6_tfparunddsc ,
                                           AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                           AV58Tserpa2wwds_8_tfparfasvl2 ,
                                           AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                           AV60Tserpa2wwds_10_tfparfasvmn ,
                                           AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                           AV62Tserpa2wwds_12_tfparfasvmx ,
                                           Short.valueOf(AV64Tserpa2wwds_14_tfparnvar) ,
                                           Short.valueOf(AV65Tserpa2wwds_15_tfparnvar_to) ,
                                           AV67Tserpa2wwds_17_tfpartit_sel ,
                                           AV66Tserpa2wwds_16_tfpartit ,
                                           AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                           AV68Tserpa2wwds_18_tfparfasobs ,
                                           A1668ParFasVal ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           A12670ParFasVl2 ,
                                           A14061ParFasVmn ,
                                           A14060ParFasVmx ,
                                           Short.valueOf(A10584ParNVar) ,
                                           A10585ParTit ,
                                           A1673ParFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7S6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA7S10 = false ;
         A396EmprCod = P0A7S6_A396EmprCod[0] ;
         A252CliCod = P0A7S6_A252CliCod[0] ;
         A65ArtCod = P0A7S6_A65ArtCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            brkA7S10 = false ;
            A396EmprCod = P0A7S6_A396EmprCod[0] ;
            A252CliCod = P0A7S6_A252CliCod[0] ;
            A65ArtCod = P0A7S6_A65ArtCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brkA7S10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A14060ParFasVmx)==0) )
         {
            AV29Option = A14060ParFasVmx ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7S10 )
         {
            brkA7S10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPARTITOPTIONS' Routine */
      returnInSub = false ;
      AV24TFParTit = AV41SearchTxt ;
      AV25TFParTit_Sel = "" ;
      AV51Tserpa2wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tserpa2wwds_2_tfparfasval = AV10TFParFasVal ;
      AV53Tserpa2wwds_3_tfparfasval_sel = AV11TFParFasVal_Sel ;
      AV54Tserpa2wwds_4_tfparundid = AV12TFParUndID ;
      AV55Tserpa2wwds_5_tfparundid_to = AV13TFParUndID_To ;
      AV56Tserpa2wwds_6_tfparunddsc = AV14TFParUndDsc ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = AV15TFParUndDsc_Sel ;
      AV58Tserpa2wwds_8_tfparfasvl2 = AV16TFParFasVl2 ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = AV17TFParFasVl2_Sel ;
      AV60Tserpa2wwds_10_tfparfasvmn = AV18TFParFasVmn ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = AV19TFParFasVmn_Sel ;
      AV62Tserpa2wwds_12_tfparfasvmx = AV20TFParFasVmx ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = AV21TFParFasVmx_Sel ;
      AV64Tserpa2wwds_14_tfparnvar = AV22TFParNVar ;
      AV65Tserpa2wwds_15_tfparnvar_to = AV23TFParNVar_To ;
      AV66Tserpa2wwds_16_tfpartit = AV24TFParTit ;
      AV67Tserpa2wwds_17_tfpartit_sel = AV25TFParTit_Sel ;
      AV68Tserpa2wwds_18_tfparfasobs = AV26TFParFasObs ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = AV27TFParFasObs_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV51Tserpa2wwds_1_filterfulltext ,
                                           AV53Tserpa2wwds_3_tfparfasval_sel ,
                                           AV52Tserpa2wwds_2_tfparfasval ,
                                           Short.valueOf(AV54Tserpa2wwds_4_tfparundid) ,
                                           Short.valueOf(AV55Tserpa2wwds_5_tfparundid_to) ,
                                           AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                           AV56Tserpa2wwds_6_tfparunddsc ,
                                           AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                           AV58Tserpa2wwds_8_tfparfasvl2 ,
                                           AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                           AV60Tserpa2wwds_10_tfparfasvmn ,
                                           AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                           AV62Tserpa2wwds_12_tfparfasvmx ,
                                           Short.valueOf(AV64Tserpa2wwds_14_tfparnvar) ,
                                           Short.valueOf(AV65Tserpa2wwds_15_tfparnvar_to) ,
                                           AV67Tserpa2wwds_17_tfpartit_sel ,
                                           AV66Tserpa2wwds_16_tfpartit ,
                                           AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                           AV68Tserpa2wwds_18_tfparfasobs ,
                                           A1668ParFasVal ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           A12670ParFasVl2 ,
                                           A14061ParFasVmn ,
                                           A14060ParFasVmx ,
                                           Short.valueOf(A10584ParNVar) ,
                                           A10585ParTit ,
                                           A1673ParFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7S7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkA7S12 = false ;
         A396EmprCod = P0A7S7_A396EmprCod[0] ;
         A252CliCod = P0A7S7_A252CliCod[0] ;
         A65ArtCod = P0A7S7_A65ArtCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(5) != 101) )
         {
            brkA7S12 = false ;
            A396EmprCod = P0A7S7_A396EmprCod[0] ;
            A252CliCod = P0A7S7_A252CliCod[0] ;
            A65ArtCod = P0A7S7_A65ArtCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brkA7S12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A10585ParTit)==0) )
         {
            AV29Option = A10585ParTit ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7S12 )
         {
            brkA7S12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPARFASOBSOPTIONS' Routine */
      returnInSub = false ;
      AV26TFParFasObs = AV41SearchTxt ;
      AV27TFParFasObs_Sel = "" ;
      AV51Tserpa2wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tserpa2wwds_2_tfparfasval = AV10TFParFasVal ;
      AV53Tserpa2wwds_3_tfparfasval_sel = AV11TFParFasVal_Sel ;
      AV54Tserpa2wwds_4_tfparundid = AV12TFParUndID ;
      AV55Tserpa2wwds_5_tfparundid_to = AV13TFParUndID_To ;
      AV56Tserpa2wwds_6_tfparunddsc = AV14TFParUndDsc ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = AV15TFParUndDsc_Sel ;
      AV58Tserpa2wwds_8_tfparfasvl2 = AV16TFParFasVl2 ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = AV17TFParFasVl2_Sel ;
      AV60Tserpa2wwds_10_tfparfasvmn = AV18TFParFasVmn ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = AV19TFParFasVmn_Sel ;
      AV62Tserpa2wwds_12_tfparfasvmx = AV20TFParFasVmx ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = AV21TFParFasVmx_Sel ;
      AV64Tserpa2wwds_14_tfparnvar = AV22TFParNVar ;
      AV65Tserpa2wwds_15_tfparnvar_to = AV23TFParNVar_To ;
      AV66Tserpa2wwds_16_tfpartit = AV24TFParTit ;
      AV67Tserpa2wwds_17_tfpartit_sel = AV25TFParTit_Sel ;
      AV68Tserpa2wwds_18_tfparfasobs = AV26TFParFasObs ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = AV27TFParFasObs_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV51Tserpa2wwds_1_filterfulltext ,
                                           AV53Tserpa2wwds_3_tfparfasval_sel ,
                                           AV52Tserpa2wwds_2_tfparfasval ,
                                           Short.valueOf(AV54Tserpa2wwds_4_tfparundid) ,
                                           Short.valueOf(AV55Tserpa2wwds_5_tfparundid_to) ,
                                           AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                           AV56Tserpa2wwds_6_tfparunddsc ,
                                           AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                           AV58Tserpa2wwds_8_tfparfasvl2 ,
                                           AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                           AV60Tserpa2wwds_10_tfparfasvmn ,
                                           AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                           AV62Tserpa2wwds_12_tfparfasvmx ,
                                           Short.valueOf(AV64Tserpa2wwds_14_tfparnvar) ,
                                           Short.valueOf(AV65Tserpa2wwds_15_tfparnvar_to) ,
                                           AV67Tserpa2wwds_17_tfpartit_sel ,
                                           AV66Tserpa2wwds_16_tfpartit ,
                                           AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                           AV68Tserpa2wwds_18_tfparfasobs ,
                                           A1668ParFasVal ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           A12670ParFasVl2 ,
                                           A14061ParFasVmn ,
                                           A14060ParFasVmx ,
                                           Short.valueOf(A10584ParNVar) ,
                                           A10585ParTit ,
                                           A1673ParFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7S8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkA7S14 = false ;
         A396EmprCod = P0A7S8_A396EmprCod[0] ;
         A252CliCod = P0A7S8_A252CliCod[0] ;
         A65ArtCod = P0A7S8_A65ArtCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(6) != 101) )
         {
            brkA7S14 = false ;
            A396EmprCod = P0A7S8_A396EmprCod[0] ;
            A252CliCod = P0A7S8_A252CliCod[0] ;
            A65ArtCod = P0A7S8_A65ArtCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brkA7S14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A1673ParFasObs)==0) )
         {
            AV29Option = A1673ParFasObs ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7S14 )
         {
            brkA7S14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tserpa2wwgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = tserpa2wwgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = tserpa2wwgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43OptionsJson = "" ;
      AV44OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV10TFParFasVal = "" ;
      AV11TFParFasVal_Sel = "" ;
      AV14TFParUndDsc = "" ;
      AV15TFParUndDsc_Sel = "" ;
      AV16TFParFasVl2 = "" ;
      AV17TFParFasVl2_Sel = "" ;
      AV18TFParFasVmn = "" ;
      AV19TFParFasVmn_Sel = "" ;
      AV20TFParFasVmx = "" ;
      AV21TFParFasVmx_Sel = "" ;
      AV24TFParTit = "" ;
      AV25TFParTit_Sel = "" ;
      AV26TFParFasObs = "" ;
      AV27TFParFasObs_Sel = "" ;
      A1668ParFasVal = "" ;
      AV51Tserpa2wwds_1_filterfulltext = "" ;
      AV52Tserpa2wwds_2_tfparfasval = "" ;
      AV53Tserpa2wwds_3_tfparfasval_sel = "" ;
      AV56Tserpa2wwds_6_tfparunddsc = "" ;
      AV57Tserpa2wwds_7_tfparunddsc_sel = "" ;
      AV58Tserpa2wwds_8_tfparfasvl2 = "" ;
      AV59Tserpa2wwds_9_tfparfasvl2_sel = "" ;
      AV60Tserpa2wwds_10_tfparfasvmn = "" ;
      AV61Tserpa2wwds_11_tfparfasvmn_sel = "" ;
      AV62Tserpa2wwds_12_tfparfasvmx = "" ;
      AV63Tserpa2wwds_13_tfparfasvmx_sel = "" ;
      AV66Tserpa2wwds_16_tfpartit = "" ;
      AV67Tserpa2wwds_17_tfpartit_sel = "" ;
      AV68Tserpa2wwds_18_tfparfasobs = "" ;
      AV69Tserpa2wwds_19_tfparfasobs_sel = "" ;
      scmdbuf = "" ;
      A13204ParUndDsc = "" ;
      A12670ParFasVl2 = "" ;
      A14061ParFasVmn = "" ;
      A14060ParFasVmx = "" ;
      A10585ParTit = "" ;
      A1673ParFasObs = "" ;
      P0A7S2_A396EmprCod = new String[] {""} ;
      P0A7S2_A252CliCod = new int[1] ;
      P0A7S2_A65ArtCod = new String[] {""} ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      AV29Option = "" ;
      P0A7S3_A396EmprCod = new String[] {""} ;
      P0A7S3_A252CliCod = new int[1] ;
      P0A7S3_A65ArtCod = new String[] {""} ;
      P0A7S4_A396EmprCod = new String[] {""} ;
      P0A7S4_A252CliCod = new int[1] ;
      P0A7S4_A65ArtCod = new String[] {""} ;
      P0A7S5_A396EmprCod = new String[] {""} ;
      P0A7S5_A252CliCod = new int[1] ;
      P0A7S5_A65ArtCod = new String[] {""} ;
      P0A7S6_A396EmprCod = new String[] {""} ;
      P0A7S6_A252CliCod = new int[1] ;
      P0A7S6_A65ArtCod = new String[] {""} ;
      P0A7S7_A396EmprCod = new String[] {""} ;
      P0A7S7_A252CliCod = new int[1] ;
      P0A7S7_A65ArtCod = new String[] {""} ;
      P0A7S8_A396EmprCod = new String[] {""} ;
      P0A7S8_A252CliCod = new int[1] ;
      P0A7S8_A65ArtCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tserpa2wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A7S2_A396EmprCod, P0A7S2_A252CliCod, P0A7S2_A65ArtCod
            }
            , new Object[] {
            P0A7S3_A396EmprCod, P0A7S3_A252CliCod, P0A7S3_A65ArtCod
            }
            , new Object[] {
            P0A7S4_A396EmprCod, P0A7S4_A252CliCod, P0A7S4_A65ArtCod
            }
            , new Object[] {
            P0A7S5_A396EmprCod, P0A7S5_A252CliCod, P0A7S5_A65ArtCod
            }
            , new Object[] {
            P0A7S6_A396EmprCod, P0A7S6_A252CliCod, P0A7S6_A65ArtCod
            }
            , new Object[] {
            P0A7S7_A396EmprCod, P0A7S7_A252CliCod, P0A7S7_A65ArtCod
            }
            , new Object[] {
            P0A7S8_A396EmprCod, P0A7S8_A252CliCod, P0A7S8_A65ArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12TFParUndID ;
   private short AV13TFParUndID_To ;
   private short AV22TFParNVar ;
   private short AV23TFParNVar_To ;
   private short AV54Tserpa2wwds_4_tfparundid ;
   private short AV55Tserpa2wwds_5_tfparundid_to ;
   private short AV64Tserpa2wwds_14_tfparnvar ;
   private short AV65Tserpa2wwds_15_tfparnvar_to ;
   private short A13203ParUndID ;
   private short A10584ParNVar ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int A252CliCod ;
   private long AV34count ;
   private String AV10TFParFasVal ;
   private String AV11TFParFasVal_Sel ;
   private String AV14TFParUndDsc ;
   private String AV15TFParUndDsc_Sel ;
   private String AV16TFParFasVl2 ;
   private String AV17TFParFasVl2_Sel ;
   private String AV18TFParFasVmn ;
   private String AV19TFParFasVmn_Sel ;
   private String AV20TFParFasVmx ;
   private String AV21TFParFasVmx_Sel ;
   private String AV24TFParTit ;
   private String AV25TFParTit_Sel ;
   private String AV26TFParFasObs ;
   private String AV27TFParFasObs_Sel ;
   private String A1668ParFasVal ;
   private String AV52Tserpa2wwds_2_tfparfasval ;
   private String AV53Tserpa2wwds_3_tfparfasval_sel ;
   private String AV56Tserpa2wwds_6_tfparunddsc ;
   private String AV57Tserpa2wwds_7_tfparunddsc_sel ;
   private String AV58Tserpa2wwds_8_tfparfasvl2 ;
   private String AV59Tserpa2wwds_9_tfparfasvl2_sel ;
   private String AV60Tserpa2wwds_10_tfparfasvmn ;
   private String AV61Tserpa2wwds_11_tfparfasvmn_sel ;
   private String AV62Tserpa2wwds_12_tfparfasvmx ;
   private String AV63Tserpa2wwds_13_tfparfasvmx_sel ;
   private String AV66Tserpa2wwds_16_tfpartit ;
   private String AV67Tserpa2wwds_17_tfpartit_sel ;
   private String AV68Tserpa2wwds_18_tfparfasobs ;
   private String AV69Tserpa2wwds_19_tfparfasobs_sel ;
   private String scmdbuf ;
   private String A13204ParUndDsc ;
   private String A12670ParFasVl2 ;
   private String A14061ParFasVmn ;
   private String A14060ParFasVmx ;
   private String A10585ParTit ;
   private String A1673ParFasObs ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private boolean returnInSub ;
   private boolean brkA7S2 ;
   private boolean brkA7S4 ;
   private boolean brkA7S6 ;
   private boolean brkA7S8 ;
   private boolean brkA7S10 ;
   private boolean brkA7S12 ;
   private boolean brkA7S14 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Tserpa2wwds_1_filterfulltext ;
   private String AV29Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A7S2_A396EmprCod ;
   private int[] P0A7S2_A252CliCod ;
   private String[] P0A7S2_A65ArtCod ;
   private String[] P0A7S3_A396EmprCod ;
   private int[] P0A7S3_A252CliCod ;
   private String[] P0A7S3_A65ArtCod ;
   private String[] P0A7S4_A396EmprCod ;
   private int[] P0A7S4_A252CliCod ;
   private String[] P0A7S4_A65ArtCod ;
   private String[] P0A7S5_A396EmprCod ;
   private int[] P0A7S5_A252CliCod ;
   private String[] P0A7S5_A65ArtCod ;
   private String[] P0A7S6_A396EmprCod ;
   private int[] P0A7S6_A252CliCod ;
   private String[] P0A7S6_A65ArtCod ;
   private String[] P0A7S7_A396EmprCod ;
   private int[] P0A7S7_A252CliCod ;
   private String[] P0A7S7_A65ArtCod ;
   private String[] P0A7S8_A396EmprCod ;
   private int[] P0A7S8_A252CliCod ;
   private String[] P0A7S8_A65ArtCod ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class tserpa2wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A7S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tserpa2wwds_1_filterfulltext ,
                                          String AV53Tserpa2wwds_3_tfparfasval_sel ,
                                          String AV52Tserpa2wwds_2_tfparfasval ,
                                          short AV54Tserpa2wwds_4_tfparundid ,
                                          short AV55Tserpa2wwds_5_tfparundid_to ,
                                          String AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                          String AV56Tserpa2wwds_6_tfparunddsc ,
                                          String AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                          String AV58Tserpa2wwds_8_tfparfasvl2 ,
                                          String AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                          String AV60Tserpa2wwds_10_tfparfasvmn ,
                                          String AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                          String AV62Tserpa2wwds_12_tfparfasvmx ,
                                          short AV64Tserpa2wwds_14_tfparnvar ,
                                          short AV65Tserpa2wwds_15_tfparnvar_to ,
                                          String AV67Tserpa2wwds_17_tfpartit_sel ,
                                          String AV66Tserpa2wwds_16_tfpartit ,
                                          String AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                          String AV68Tserpa2wwds_18_tfparfasobs ,
                                          String A1668ParFasVal ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          String A12670ParFasVl2 ,
                                          String A14061ParFasVmn ,
                                          String A14060ParFasVmx ,
                                          short A10584ParNVar ,
                                          String A10585ParTit ,
                                          String A1673ParFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      scmdbuf += sWhereString ;
      GXv_Object2[0] = scmdbuf ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_P0A7S3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tserpa2wwds_1_filterfulltext ,
                                          String AV53Tserpa2wwds_3_tfparfasval_sel ,
                                          String AV52Tserpa2wwds_2_tfparfasval ,
                                          short AV54Tserpa2wwds_4_tfparundid ,
                                          short AV55Tserpa2wwds_5_tfparundid_to ,
                                          String AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                          String AV56Tserpa2wwds_6_tfparunddsc ,
                                          String AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                          String AV58Tserpa2wwds_8_tfparfasvl2 ,
                                          String AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                          String AV60Tserpa2wwds_10_tfparfasvmn ,
                                          String AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                          String AV62Tserpa2wwds_12_tfparfasvmx ,
                                          short AV64Tserpa2wwds_14_tfparnvar ,
                                          short AV65Tserpa2wwds_15_tfparnvar_to ,
                                          String AV67Tserpa2wwds_17_tfpartit_sel ,
                                          String AV66Tserpa2wwds_16_tfpartit ,
                                          String AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                          String AV68Tserpa2wwds_18_tfparfasobs ,
                                          String A1668ParFasVal ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          String A12670ParFasVl2 ,
                                          String A14061ParFasVmn ,
                                          String A14060ParFasVmx ,
                                          short A10584ParNVar ,
                                          String A10585ParTit ,
                                          String A1673ParFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      scmdbuf += sWhereString ;
      GXv_Object4[0] = scmdbuf ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P0A7S4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tserpa2wwds_1_filterfulltext ,
                                          String AV53Tserpa2wwds_3_tfparfasval_sel ,
                                          String AV52Tserpa2wwds_2_tfparfasval ,
                                          short AV54Tserpa2wwds_4_tfparundid ,
                                          short AV55Tserpa2wwds_5_tfparundid_to ,
                                          String AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                          String AV56Tserpa2wwds_6_tfparunddsc ,
                                          String AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                          String AV58Tserpa2wwds_8_tfparfasvl2 ,
                                          String AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                          String AV60Tserpa2wwds_10_tfparfasvmn ,
                                          String AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                          String AV62Tserpa2wwds_12_tfparfasvmx ,
                                          short AV64Tserpa2wwds_14_tfparnvar ,
                                          short AV65Tserpa2wwds_15_tfparnvar_to ,
                                          String AV67Tserpa2wwds_17_tfpartit_sel ,
                                          String AV66Tserpa2wwds_16_tfpartit ,
                                          String AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                          String AV68Tserpa2wwds_18_tfparfasobs ,
                                          String A1668ParFasVal ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          String A12670ParFasVl2 ,
                                          String A14061ParFasVmn ,
                                          String A14060ParFasVmx ,
                                          short A10584ParNVar ,
                                          String A10585ParTit ,
                                          String A1673ParFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      scmdbuf += sWhereString ;
      GXv_Object6[0] = scmdbuf ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A7S5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tserpa2wwds_1_filterfulltext ,
                                          String AV53Tserpa2wwds_3_tfparfasval_sel ,
                                          String AV52Tserpa2wwds_2_tfparfasval ,
                                          short AV54Tserpa2wwds_4_tfparundid ,
                                          short AV55Tserpa2wwds_5_tfparundid_to ,
                                          String AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                          String AV56Tserpa2wwds_6_tfparunddsc ,
                                          String AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                          String AV58Tserpa2wwds_8_tfparfasvl2 ,
                                          String AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                          String AV60Tserpa2wwds_10_tfparfasvmn ,
                                          String AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                          String AV62Tserpa2wwds_12_tfparfasvmx ,
                                          short AV64Tserpa2wwds_14_tfparnvar ,
                                          short AV65Tserpa2wwds_15_tfparnvar_to ,
                                          String AV67Tserpa2wwds_17_tfpartit_sel ,
                                          String AV66Tserpa2wwds_16_tfpartit ,
                                          String AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                          String AV68Tserpa2wwds_18_tfparfasobs ,
                                          String A1668ParFasVal ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          String A12670ParFasVl2 ,
                                          String A14061ParFasVmn ,
                                          String A14060ParFasVmx ,
                                          short A10584ParNVar ,
                                          String A10585ParTit ,
                                          String A1673ParFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      scmdbuf += sWhereString ;
      GXv_Object8[0] = scmdbuf ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P0A7S6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tserpa2wwds_1_filterfulltext ,
                                          String AV53Tserpa2wwds_3_tfparfasval_sel ,
                                          String AV52Tserpa2wwds_2_tfparfasval ,
                                          short AV54Tserpa2wwds_4_tfparundid ,
                                          short AV55Tserpa2wwds_5_tfparundid_to ,
                                          String AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                          String AV56Tserpa2wwds_6_tfparunddsc ,
                                          String AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                          String AV58Tserpa2wwds_8_tfparfasvl2 ,
                                          String AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                          String AV60Tserpa2wwds_10_tfparfasvmn ,
                                          String AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                          String AV62Tserpa2wwds_12_tfparfasvmx ,
                                          short AV64Tserpa2wwds_14_tfparnvar ,
                                          short AV65Tserpa2wwds_15_tfparnvar_to ,
                                          String AV67Tserpa2wwds_17_tfpartit_sel ,
                                          String AV66Tserpa2wwds_16_tfpartit ,
                                          String AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                          String AV68Tserpa2wwds_18_tfparfasobs ,
                                          String A1668ParFasVal ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          String A12670ParFasVl2 ,
                                          String A14061ParFasVmn ,
                                          String A14060ParFasVmx ,
                                          short A10584ParNVar ,
                                          String A10585ParTit ,
                                          String A1673ParFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      scmdbuf += sWhereString ;
      GXv_Object10[0] = scmdbuf ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P0A7S7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tserpa2wwds_1_filterfulltext ,
                                          String AV53Tserpa2wwds_3_tfparfasval_sel ,
                                          String AV52Tserpa2wwds_2_tfparfasval ,
                                          short AV54Tserpa2wwds_4_tfparundid ,
                                          short AV55Tserpa2wwds_5_tfparundid_to ,
                                          String AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                          String AV56Tserpa2wwds_6_tfparunddsc ,
                                          String AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                          String AV58Tserpa2wwds_8_tfparfasvl2 ,
                                          String AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                          String AV60Tserpa2wwds_10_tfparfasvmn ,
                                          String AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                          String AV62Tserpa2wwds_12_tfparfasvmx ,
                                          short AV64Tserpa2wwds_14_tfparnvar ,
                                          short AV65Tserpa2wwds_15_tfparnvar_to ,
                                          String AV67Tserpa2wwds_17_tfpartit_sel ,
                                          String AV66Tserpa2wwds_16_tfpartit ,
                                          String AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                          String AV68Tserpa2wwds_18_tfparfasobs ,
                                          String A1668ParFasVal ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          String A12670ParFasVl2 ,
                                          String A14061ParFasVmn ,
                                          String A14060ParFasVmx ,
                                          short A10584ParNVar ,
                                          String A10585ParTit ,
                                          String A1673ParFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      scmdbuf += sWhereString ;
      GXv_Object12[0] = scmdbuf ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0A7S8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tserpa2wwds_1_filterfulltext ,
                                          String AV53Tserpa2wwds_3_tfparfasval_sel ,
                                          String AV52Tserpa2wwds_2_tfparfasval ,
                                          short AV54Tserpa2wwds_4_tfparundid ,
                                          short AV55Tserpa2wwds_5_tfparundid_to ,
                                          String AV57Tserpa2wwds_7_tfparunddsc_sel ,
                                          String AV56Tserpa2wwds_6_tfparunddsc ,
                                          String AV59Tserpa2wwds_9_tfparfasvl2_sel ,
                                          String AV58Tserpa2wwds_8_tfparfasvl2 ,
                                          String AV61Tserpa2wwds_11_tfparfasvmn_sel ,
                                          String AV60Tserpa2wwds_10_tfparfasvmn ,
                                          String AV63Tserpa2wwds_13_tfparfasvmx_sel ,
                                          String AV62Tserpa2wwds_12_tfparfasvmx ,
                                          short AV64Tserpa2wwds_14_tfparnvar ,
                                          short AV65Tserpa2wwds_15_tfparnvar_to ,
                                          String AV67Tserpa2wwds_17_tfpartit_sel ,
                                          String AV66Tserpa2wwds_16_tfpartit ,
                                          String AV69Tserpa2wwds_19_tfparfasobs_sel ,
                                          String AV68Tserpa2wwds_18_tfparfasobs ,
                                          String A1668ParFasVal ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          String A12670ParFasVl2 ,
                                          String A14061ParFasVmn ,
                                          String A14060ParFasVmx ,
                                          short A10584ParNVar ,
                                          String A10585ParTit ,
                                          String A1673ParFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      scmdbuf += sWhereString ;
      GXv_Object14[0] = scmdbuf ;
      return GXv_Object14 ;
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
                  return conditional_P0A7S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P0A7S3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 2 :
                  return conditional_P0A7S4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 3 :
                  return conditional_P0A7S5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 4 :
                  return conditional_P0A7S6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 5 :
                  return conditional_P0A7S7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 6 :
                  return conditional_P0A7S8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7S3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7S4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7S5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7S6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7S7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7S8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
      }
   }

}

