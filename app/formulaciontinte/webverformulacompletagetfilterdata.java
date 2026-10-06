package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webverformulacompletagetfilterdata extends GXProcedure
{
   public webverformulacompletagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webverformulacompletagetfilterdata.class ), "" );
   }

   public webverformulacompletagetfilterdata( int remoteHandle ,
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
      webverformulacompletagetfilterdata.this.aP5 = new String[] {""};
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
      webverformulacompletagetfilterdata.this.AV30DDOName = aP0;
      webverformulacompletagetfilterdata.this.AV28SearchTxt = aP1;
      webverformulacompletagetfilterdata.this.AV29SearchTxtTo = aP2;
      webverformulacompletagetfilterdata.this.aP3 = aP3;
      webverformulacompletagetfilterdata.this.aP4 = aP4;
      webverformulacompletagetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PROFORCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("FormulacionTinte.WebVerFormulaCompletaGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WebVerFormulaCompletaGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("FormulacionTinte.WebVerFormulaCompletaGridState"), null, null);
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMLIN") == 0 )
         {
            AV10TFEscMLin = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFEscMLin_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV12TFProForCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV13TFProForCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV14TFProForDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV15TFProForDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV16TFPrdNum = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV17TFPrdNum_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV18TFPrdNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV19TFPrdNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMFACCON") == 0 )
         {
            AV20TFEscMFacCon = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFEscMFacCon_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV22TFForPrdDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV23TFForPrdDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMCAN") == 0 )
         {
            AV24TFEscMCan = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFEscMCan_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV46Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV51CliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV52ForSer = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV53ForColNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV54ForColNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV55TipColCod = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&STATION") == 0 )
         {
            AV47Station = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORRELBAN") == 0 )
         {
            AV48ForRelBan = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForCod = AV28SearchTxt ;
      AV13TFProForCod_Sel = "" ;
      AV60Formulaciontinte_webverformulacompletads_1_tfescmlin = AV10TFEscMLin ;
      AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to = AV11TFEscMLin_To ;
      AV62Formulaciontinte_webverformulacompletads_3_tfproforcod = AV12TFProForCod ;
      AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = AV14TFProForDsc ;
      AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV66Formulaciontinte_webverformulacompletads_7_tfprdnum = AV16TFPrdNum ;
      AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = AV17TFPrdNum_Sel ;
      AV68Formulaciontinte_webverformulacompletads_9_tfprdnom = AV18TFPrdNom ;
      AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = AV19TFPrdNom_Sel ;
      AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon = AV20TFEscMFacCon ;
      AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = AV21TFEscMFacCon_To ;
      AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = AV22TFForPrdDsc ;
      AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV74Formulaciontinte_webverformulacompletads_15_tfescmcan = AV24TFEscMCan ;
      AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to = AV25TFEscMCan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) ,
                                           Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) ,
                                           AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                           AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                           AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                           AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                           AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                           AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                           AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                           AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                           AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                           AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                           AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                           AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                           AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                           AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                           Integer.valueOf(A887EscMLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4712EscMFacCon ,
                                           A488ForPrdDsc ,
                                           A890EscMCan ,
                                           A910Workstat ,
                                           AV47Station ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_webverformulacompletads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_webverformulacompletads_3_tfproforcod), 6, "%") ;
      lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc), 30, "%") ;
      lV66Formulaciontinte_webverformulacompletads_7_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_webverformulacompletads_7_tfprdnum), 6, "%") ;
      lV68Formulaciontinte_webverformulacompletads_9_tfprdnom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_webverformulacompletads_9_tfprdnom), 26, "%") ;
      lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc), 5, "%") ;
      /* Using cursor P08KG2 */
      pr_default.execute(0, new Object[] {AV46Emprcod, AV47Station, Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin), Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to), lV62Formulaciontinte_webverformulacompletads_3_tfproforcod, AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel, lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc, AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel, lV66Formulaciontinte_webverformulacompletads_7_tfprdnum, AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel, lV68Formulaciontinte_webverformulacompletads_9_tfprdnom, AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to, lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc, AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8KG2 = false ;
         A490ForPrdUMe = P08KG2_A490ForPrdUMe[0] ;
         A396EmprCod = P08KG2_A396EmprCod[0] ;
         A764ProForCod = P08KG2_A764ProForCod[0] ;
         A910Workstat = P08KG2_A910Workstat[0] ;
         A890EscMCan = P08KG2_A890EscMCan[0] ;
         A488ForPrdDsc = P08KG2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG2_n488ForPrdDsc[0] ;
         A4712EscMFacCon = P08KG2_A4712EscMFacCon[0] ;
         A718PrdNom = P08KG2_A718PrdNom[0] ;
         A719PrdNum = P08KG2_A719PrdNum[0] ;
         A766ProForDsc = P08KG2_A766ProForDsc[0] ;
         A887EscMLin = P08KG2_A887EscMLin[0] ;
         A488ForPrdDsc = P08KG2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG2_n488ForPrdDsc[0] ;
         A766ProForDsc = P08KG2_A766ProForDsc[0] ;
         A718PrdNom = P08KG2_A718PrdNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08KG2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08KG2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk8KG2 = false ;
            A910Workstat = P08KG2_A910Workstat[0] ;
            A887EscMLin = P08KG2_A887EscMLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8KG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV32Option = A764ProForCod ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KG2 )
         {
            brk8KG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc = AV28SearchTxt ;
      AV15TFProForDsc_Sel = "" ;
      AV60Formulaciontinte_webverformulacompletads_1_tfescmlin = AV10TFEscMLin ;
      AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to = AV11TFEscMLin_To ;
      AV62Formulaciontinte_webverformulacompletads_3_tfproforcod = AV12TFProForCod ;
      AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = AV14TFProForDsc ;
      AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV66Formulaciontinte_webverformulacompletads_7_tfprdnum = AV16TFPrdNum ;
      AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = AV17TFPrdNum_Sel ;
      AV68Formulaciontinte_webverformulacompletads_9_tfprdnom = AV18TFPrdNom ;
      AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = AV19TFPrdNom_Sel ;
      AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon = AV20TFEscMFacCon ;
      AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = AV21TFEscMFacCon_To ;
      AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = AV22TFForPrdDsc ;
      AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV74Formulaciontinte_webverformulacompletads_15_tfescmcan = AV24TFEscMCan ;
      AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to = AV25TFEscMCan_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) ,
                                           Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) ,
                                           AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                           AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                           AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                           AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                           AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                           AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                           AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                           AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                           AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                           AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                           AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                           AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                           AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                           AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                           Integer.valueOf(A887EscMLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4712EscMFacCon ,
                                           A488ForPrdDsc ,
                                           A890EscMCan ,
                                           A910Workstat ,
                                           AV47Station ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_webverformulacompletads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_webverformulacompletads_3_tfproforcod), 6, "%") ;
      lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc), 30, "%") ;
      lV66Formulaciontinte_webverformulacompletads_7_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_webverformulacompletads_7_tfprdnum), 6, "%") ;
      lV68Formulaciontinte_webverformulacompletads_9_tfprdnom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_webverformulacompletads_9_tfprdnom), 26, "%") ;
      lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc), 5, "%") ;
      /* Using cursor P08KG3 */
      pr_default.execute(1, new Object[] {AV46Emprcod, AV47Station, Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin), Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to), lV62Formulaciontinte_webverformulacompletads_3_tfproforcod, AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel, lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc, AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel, lV66Formulaciontinte_webverformulacompletads_7_tfprdnum, AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel, lV68Formulaciontinte_webverformulacompletads_9_tfprdnom, AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to, lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc, AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8KG4 = false ;
         A490ForPrdUMe = P08KG3_A490ForPrdUMe[0] ;
         A764ProForCod = P08KG3_A764ProForCod[0] ;
         A396EmprCod = P08KG3_A396EmprCod[0] ;
         A910Workstat = P08KG3_A910Workstat[0] ;
         A890EscMCan = P08KG3_A890EscMCan[0] ;
         A488ForPrdDsc = P08KG3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG3_n488ForPrdDsc[0] ;
         A4712EscMFacCon = P08KG3_A4712EscMFacCon[0] ;
         A718PrdNom = P08KG3_A718PrdNom[0] ;
         A719PrdNum = P08KG3_A719PrdNum[0] ;
         A766ProForDsc = P08KG3_A766ProForDsc[0] ;
         A887EscMLin = P08KG3_A887EscMLin[0] ;
         A766ProForDsc = P08KG3_A766ProForDsc[0] ;
         A488ForPrdDsc = P08KG3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG3_n488ForPrdDsc[0] ;
         A718PrdNom = P08KG3_A718PrdNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08KG3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08KG3_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk8KG4 = false ;
            A910Workstat = P08KG3_A910Workstat[0] ;
            A887EscMLin = P08KG3_A887EscMLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8KG4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV32Option = A766ProForDsc ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            AV33Options.add(AV32Option, AV31InsertIndex);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KG4 )
         {
            brk8KG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNum = AV28SearchTxt ;
      AV17TFPrdNum_Sel = "" ;
      AV60Formulaciontinte_webverformulacompletads_1_tfescmlin = AV10TFEscMLin ;
      AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to = AV11TFEscMLin_To ;
      AV62Formulaciontinte_webverformulacompletads_3_tfproforcod = AV12TFProForCod ;
      AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = AV14TFProForDsc ;
      AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV66Formulaciontinte_webverformulacompletads_7_tfprdnum = AV16TFPrdNum ;
      AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = AV17TFPrdNum_Sel ;
      AV68Formulaciontinte_webverformulacompletads_9_tfprdnom = AV18TFPrdNom ;
      AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = AV19TFPrdNom_Sel ;
      AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon = AV20TFEscMFacCon ;
      AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = AV21TFEscMFacCon_To ;
      AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = AV22TFForPrdDsc ;
      AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV74Formulaciontinte_webverformulacompletads_15_tfescmcan = AV24TFEscMCan ;
      AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to = AV25TFEscMCan_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) ,
                                           Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) ,
                                           AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                           AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                           AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                           AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                           AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                           AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                           AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                           AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                           AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                           AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                           AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                           AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                           AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                           AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                           Integer.valueOf(A887EscMLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4712EscMFacCon ,
                                           A488ForPrdDsc ,
                                           A890EscMCan ,
                                           A910Workstat ,
                                           AV47Station ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_webverformulacompletads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_webverformulacompletads_3_tfproforcod), 6, "%") ;
      lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc), 30, "%") ;
      lV66Formulaciontinte_webverformulacompletads_7_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_webverformulacompletads_7_tfprdnum), 6, "%") ;
      lV68Formulaciontinte_webverformulacompletads_9_tfprdnom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_webverformulacompletads_9_tfprdnom), 26, "%") ;
      lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc), 5, "%") ;
      /* Using cursor P08KG4 */
      pr_default.execute(2, new Object[] {AV46Emprcod, AV47Station, Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin), Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to), lV62Formulaciontinte_webverformulacompletads_3_tfproforcod, AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel, lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc, AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel, lV66Formulaciontinte_webverformulacompletads_7_tfprdnum, AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel, lV68Formulaciontinte_webverformulacompletads_9_tfprdnom, AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to, lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc, AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8KG6 = false ;
         A490ForPrdUMe = P08KG4_A490ForPrdUMe[0] ;
         A396EmprCod = P08KG4_A396EmprCod[0] ;
         A719PrdNum = P08KG4_A719PrdNum[0] ;
         A910Workstat = P08KG4_A910Workstat[0] ;
         A890EscMCan = P08KG4_A890EscMCan[0] ;
         A488ForPrdDsc = P08KG4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG4_n488ForPrdDsc[0] ;
         A4712EscMFacCon = P08KG4_A4712EscMFacCon[0] ;
         A718PrdNom = P08KG4_A718PrdNom[0] ;
         A766ProForDsc = P08KG4_A766ProForDsc[0] ;
         A764ProForCod = P08KG4_A764ProForCod[0] ;
         A887EscMLin = P08KG4_A887EscMLin[0] ;
         A488ForPrdDsc = P08KG4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG4_n488ForPrdDsc[0] ;
         A718PrdNom = P08KG4_A718PrdNom[0] ;
         A766ProForDsc = P08KG4_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08KG4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08KG4_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8KG6 = false ;
            A910Workstat = P08KG4_A910Workstat[0] ;
            A887EscMLin = P08KG4_A887EscMLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8KG6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV32Option = A719PrdNum ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KG6 )
         {
            brk8KG6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFPrdNom = AV28SearchTxt ;
      AV19TFPrdNom_Sel = "" ;
      AV60Formulaciontinte_webverformulacompletads_1_tfescmlin = AV10TFEscMLin ;
      AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to = AV11TFEscMLin_To ;
      AV62Formulaciontinte_webverformulacompletads_3_tfproforcod = AV12TFProForCod ;
      AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = AV14TFProForDsc ;
      AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV66Formulaciontinte_webverformulacompletads_7_tfprdnum = AV16TFPrdNum ;
      AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = AV17TFPrdNum_Sel ;
      AV68Formulaciontinte_webverformulacompletads_9_tfprdnom = AV18TFPrdNom ;
      AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = AV19TFPrdNom_Sel ;
      AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon = AV20TFEscMFacCon ;
      AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = AV21TFEscMFacCon_To ;
      AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = AV22TFForPrdDsc ;
      AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV74Formulaciontinte_webverformulacompletads_15_tfescmcan = AV24TFEscMCan ;
      AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to = AV25TFEscMCan_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) ,
                                           Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) ,
                                           AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                           AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                           AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                           AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                           AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                           AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                           AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                           AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                           AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                           AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                           AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                           AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                           AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                           AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                           Integer.valueOf(A887EscMLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4712EscMFacCon ,
                                           A488ForPrdDsc ,
                                           A890EscMCan ,
                                           A910Workstat ,
                                           AV47Station ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_webverformulacompletads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_webverformulacompletads_3_tfproforcod), 6, "%") ;
      lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc), 30, "%") ;
      lV66Formulaciontinte_webverformulacompletads_7_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_webverformulacompletads_7_tfprdnum), 6, "%") ;
      lV68Formulaciontinte_webverformulacompletads_9_tfprdnom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_webverformulacompletads_9_tfprdnom), 26, "%") ;
      lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc), 5, "%") ;
      /* Using cursor P08KG5 */
      pr_default.execute(3, new Object[] {AV46Emprcod, AV47Station, Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin), Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to), lV62Formulaciontinte_webverformulacompletads_3_tfproforcod, AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel, lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc, AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel, lV66Formulaciontinte_webverformulacompletads_7_tfprdnum, AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel, lV68Formulaciontinte_webverformulacompletads_9_tfprdnom, AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to, lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc, AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8KG8 = false ;
         A490ForPrdUMe = P08KG5_A490ForPrdUMe[0] ;
         A719PrdNum = P08KG5_A719PrdNum[0] ;
         A396EmprCod = P08KG5_A396EmprCod[0] ;
         A910Workstat = P08KG5_A910Workstat[0] ;
         A890EscMCan = P08KG5_A890EscMCan[0] ;
         A488ForPrdDsc = P08KG5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG5_n488ForPrdDsc[0] ;
         A4712EscMFacCon = P08KG5_A4712EscMFacCon[0] ;
         A718PrdNom = P08KG5_A718PrdNom[0] ;
         A766ProForDsc = P08KG5_A766ProForDsc[0] ;
         A764ProForCod = P08KG5_A764ProForCod[0] ;
         A887EscMLin = P08KG5_A887EscMLin[0] ;
         A718PrdNom = P08KG5_A718PrdNom[0] ;
         A488ForPrdDsc = P08KG5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG5_n488ForPrdDsc[0] ;
         A766ProForDsc = P08KG5_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08KG5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08KG5_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8KG8 = false ;
            A910Workstat = P08KG5_A910Workstat[0] ;
            A887EscMLin = P08KG5_A887EscMLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8KG8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV32Option = A718PrdNom ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            AV33Options.add(AV32Option, AV31InsertIndex);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KG8 )
         {
            brk8KG8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFForPrdDsc = AV28SearchTxt ;
      AV23TFForPrdDsc_Sel = "" ;
      AV60Formulaciontinte_webverformulacompletads_1_tfescmlin = AV10TFEscMLin ;
      AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to = AV11TFEscMLin_To ;
      AV62Formulaciontinte_webverformulacompletads_3_tfproforcod = AV12TFProForCod ;
      AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = AV14TFProForDsc ;
      AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV66Formulaciontinte_webverformulacompletads_7_tfprdnum = AV16TFPrdNum ;
      AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = AV17TFPrdNum_Sel ;
      AV68Formulaciontinte_webverformulacompletads_9_tfprdnom = AV18TFPrdNom ;
      AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = AV19TFPrdNom_Sel ;
      AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon = AV20TFEscMFacCon ;
      AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = AV21TFEscMFacCon_To ;
      AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = AV22TFForPrdDsc ;
      AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV74Formulaciontinte_webverformulacompletads_15_tfescmcan = AV24TFEscMCan ;
      AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to = AV25TFEscMCan_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) ,
                                           Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) ,
                                           AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                           AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                           AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                           AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                           AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                           AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                           AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                           AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                           AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                           AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                           AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                           AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                           AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                           AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                           Integer.valueOf(A887EscMLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4712EscMFacCon ,
                                           A488ForPrdDsc ,
                                           A890EscMCan ,
                                           A910Workstat ,
                                           AV47Station ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_webverformulacompletads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_webverformulacompletads_3_tfproforcod), 6, "%") ;
      lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc), 30, "%") ;
      lV66Formulaciontinte_webverformulacompletads_7_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_webverformulacompletads_7_tfprdnum), 6, "%") ;
      lV68Formulaciontinte_webverformulacompletads_9_tfprdnom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_webverformulacompletads_9_tfprdnom), 26, "%") ;
      lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc), 5, "%") ;
      /* Using cursor P08KG6 */
      pr_default.execute(4, new Object[] {AV46Emprcod, AV47Station, Integer.valueOf(AV60Formulaciontinte_webverformulacompletads_1_tfescmlin), Integer.valueOf(AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to), lV62Formulaciontinte_webverformulacompletads_3_tfproforcod, AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel, lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc, AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel, lV66Formulaciontinte_webverformulacompletads_7_tfprdnum, AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel, lV68Formulaciontinte_webverformulacompletads_9_tfprdnom, AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to, lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc, AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8KG10 = false ;
         A490ForPrdUMe = P08KG6_A490ForPrdUMe[0] ;
         A396EmprCod = P08KG6_A396EmprCod[0] ;
         A910Workstat = P08KG6_A910Workstat[0] ;
         A890EscMCan = P08KG6_A890EscMCan[0] ;
         A488ForPrdDsc = P08KG6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG6_n488ForPrdDsc[0] ;
         A4712EscMFacCon = P08KG6_A4712EscMFacCon[0] ;
         A718PrdNom = P08KG6_A718PrdNom[0] ;
         A719PrdNum = P08KG6_A719PrdNum[0] ;
         A766ProForDsc = P08KG6_A766ProForDsc[0] ;
         A764ProForCod = P08KG6_A764ProForCod[0] ;
         A887EscMLin = P08KG6_A887EscMLin[0] ;
         A488ForPrdDsc = P08KG6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KG6_n488ForPrdDsc[0] ;
         A718PrdNom = P08KG6_A718PrdNom[0] ;
         A766ProForDsc = P08KG6_A766ProForDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08KG6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08KG6_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk8KG10 = false ;
            A910Workstat = P08KG6_A910Workstat[0] ;
            A887EscMLin = P08KG6_A887EscMLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8KG10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV32Option = A488ForPrdDsc ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            AV33Options.add(AV32Option, AV31InsertIndex);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KG10 )
         {
            brk8KG10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webverformulacompletagetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = webverformulacompletagetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = webverformulacompletagetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFProForCod = "" ;
      AV13TFProForCod_Sel = "" ;
      AV14TFProForDsc = "" ;
      AV15TFProForDsc_Sel = "" ;
      AV16TFPrdNum = "" ;
      AV17TFPrdNum_Sel = "" ;
      AV18TFPrdNom = "" ;
      AV19TFPrdNom_Sel = "" ;
      AV20TFEscMFacCon = DecimalUtil.ZERO ;
      AV21TFEscMFacCon_To = DecimalUtil.ZERO ;
      AV22TFForPrdDsc = "" ;
      AV23TFForPrdDsc_Sel = "" ;
      AV24TFEscMCan = DecimalUtil.ZERO ;
      AV25TFEscMCan_To = DecimalUtil.ZERO ;
      AV46Emprcod = "" ;
      AV52ForSer = "" ;
      AV53ForColNom = "" ;
      AV47Station = "" ;
      AV48ForRelBan = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      AV62Formulaciontinte_webverformulacompletads_3_tfproforcod = "" ;
      AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = "" ;
      AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = "" ;
      AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = "" ;
      AV66Formulaciontinte_webverformulacompletads_7_tfprdnum = "" ;
      AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = "" ;
      AV68Formulaciontinte_webverformulacompletads_9_tfprdnom = "" ;
      AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = "" ;
      AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon = DecimalUtil.ZERO ;
      AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = DecimalUtil.ZERO ;
      AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = "" ;
      AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = "" ;
      AV74Formulaciontinte_webverformulacompletads_15_tfescmcan = DecimalUtil.ZERO ;
      AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV62Formulaciontinte_webverformulacompletads_3_tfproforcod = "" ;
      lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc = "" ;
      lV66Formulaciontinte_webverformulacompletads_7_tfprdnum = "" ;
      lV68Formulaciontinte_webverformulacompletads_9_tfprdnom = "" ;
      lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc = "" ;
      A766ProForDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A890EscMCan = DecimalUtil.ZERO ;
      A910Workstat = "" ;
      A396EmprCod = "" ;
      P08KG2_A490ForPrdUMe = new byte[1] ;
      P08KG2_A396EmprCod = new String[] {""} ;
      P08KG2_A764ProForCod = new String[] {""} ;
      P08KG2_A910Workstat = new String[] {""} ;
      P08KG2_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG2_A488ForPrdDsc = new String[] {""} ;
      P08KG2_n488ForPrdDsc = new boolean[] {false} ;
      P08KG2_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG2_A718PrdNom = new String[] {""} ;
      P08KG2_A719PrdNum = new String[] {""} ;
      P08KG2_A766ProForDsc = new String[] {""} ;
      P08KG2_A887EscMLin = new int[1] ;
      AV32Option = "" ;
      P08KG3_A490ForPrdUMe = new byte[1] ;
      P08KG3_A764ProForCod = new String[] {""} ;
      P08KG3_A396EmprCod = new String[] {""} ;
      P08KG3_A910Workstat = new String[] {""} ;
      P08KG3_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG3_A488ForPrdDsc = new String[] {""} ;
      P08KG3_n488ForPrdDsc = new boolean[] {false} ;
      P08KG3_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG3_A718PrdNom = new String[] {""} ;
      P08KG3_A719PrdNum = new String[] {""} ;
      P08KG3_A766ProForDsc = new String[] {""} ;
      P08KG3_A887EscMLin = new int[1] ;
      P08KG4_A490ForPrdUMe = new byte[1] ;
      P08KG4_A396EmprCod = new String[] {""} ;
      P08KG4_A719PrdNum = new String[] {""} ;
      P08KG4_A910Workstat = new String[] {""} ;
      P08KG4_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG4_A488ForPrdDsc = new String[] {""} ;
      P08KG4_n488ForPrdDsc = new boolean[] {false} ;
      P08KG4_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG4_A718PrdNom = new String[] {""} ;
      P08KG4_A766ProForDsc = new String[] {""} ;
      P08KG4_A764ProForCod = new String[] {""} ;
      P08KG4_A887EscMLin = new int[1] ;
      P08KG5_A490ForPrdUMe = new byte[1] ;
      P08KG5_A719PrdNum = new String[] {""} ;
      P08KG5_A396EmprCod = new String[] {""} ;
      P08KG5_A910Workstat = new String[] {""} ;
      P08KG5_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG5_A488ForPrdDsc = new String[] {""} ;
      P08KG5_n488ForPrdDsc = new boolean[] {false} ;
      P08KG5_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG5_A718PrdNom = new String[] {""} ;
      P08KG5_A766ProForDsc = new String[] {""} ;
      P08KG5_A764ProForCod = new String[] {""} ;
      P08KG5_A887EscMLin = new int[1] ;
      P08KG6_A490ForPrdUMe = new byte[1] ;
      P08KG6_A396EmprCod = new String[] {""} ;
      P08KG6_A910Workstat = new String[] {""} ;
      P08KG6_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG6_A488ForPrdDsc = new String[] {""} ;
      P08KG6_n488ForPrdDsc = new boolean[] {false} ;
      P08KG6_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KG6_A718PrdNom = new String[] {""} ;
      P08KG6_A719PrdNum = new String[] {""} ;
      P08KG6_A766ProForDsc = new String[] {""} ;
      P08KG6_A764ProForCod = new String[] {""} ;
      P08KG6_A887EscMLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.webverformulacompletagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08KG2_A490ForPrdUMe, P08KG2_A396EmprCod, P08KG2_A764ProForCod, P08KG2_A910Workstat, P08KG2_A890EscMCan, P08KG2_A488ForPrdDsc, P08KG2_n488ForPrdDsc, P08KG2_A4712EscMFacCon, P08KG2_A718PrdNom, P08KG2_A719PrdNum,
            P08KG2_A766ProForDsc, P08KG2_A887EscMLin
            }
            , new Object[] {
            P08KG3_A490ForPrdUMe, P08KG3_A764ProForCod, P08KG3_A396EmprCod, P08KG3_A910Workstat, P08KG3_A890EscMCan, P08KG3_A488ForPrdDsc, P08KG3_n488ForPrdDsc, P08KG3_A4712EscMFacCon, P08KG3_A718PrdNom, P08KG3_A719PrdNum,
            P08KG3_A766ProForDsc, P08KG3_A887EscMLin
            }
            , new Object[] {
            P08KG4_A490ForPrdUMe, P08KG4_A396EmprCod, P08KG4_A719PrdNum, P08KG4_A910Workstat, P08KG4_A890EscMCan, P08KG4_A488ForPrdDsc, P08KG4_n488ForPrdDsc, P08KG4_A4712EscMFacCon, P08KG4_A718PrdNom, P08KG4_A766ProForDsc,
            P08KG4_A764ProForCod, P08KG4_A887EscMLin
            }
            , new Object[] {
            P08KG5_A490ForPrdUMe, P08KG5_A719PrdNum, P08KG5_A396EmprCod, P08KG5_A910Workstat, P08KG5_A890EscMCan, P08KG5_A488ForPrdDsc, P08KG5_n488ForPrdDsc, P08KG5_A4712EscMFacCon, P08KG5_A718PrdNom, P08KG5_A766ProForDsc,
            P08KG5_A764ProForCod, P08KG5_A887EscMLin
            }
            , new Object[] {
            P08KG6_A490ForPrdUMe, P08KG6_A396EmprCod, P08KG6_A910Workstat, P08KG6_A890EscMCan, P08KG6_A488ForPrdDsc, P08KG6_n488ForPrdDsc, P08KG6_A4712EscMFacCon, P08KG6_A718PrdNom, P08KG6_A719PrdNum, P08KG6_A766ProForDsc,
            P08KG6_A764ProForCod, P08KG6_A887EscMLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55TipColCod ;
   private byte A490ForPrdUMe ;
   private short Gx_err ;
   private int AV58GXV1 ;
   private int AV10TFEscMLin ;
   private int AV11TFEscMLin_To ;
   private int AV51CliCod ;
   private int AV54ForColNum ;
   private int AV60Formulaciontinte_webverformulacompletads_1_tfescmlin ;
   private int AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to ;
   private int A887EscMLin ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV20TFEscMFacCon ;
   private java.math.BigDecimal AV21TFEscMFacCon_To ;
   private java.math.BigDecimal AV24TFEscMCan ;
   private java.math.BigDecimal AV25TFEscMCan_To ;
   private java.math.BigDecimal AV48ForRelBan ;
   private java.math.BigDecimal AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ;
   private java.math.BigDecimal AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ;
   private java.math.BigDecimal AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ;
   private java.math.BigDecimal AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private String AV12TFProForCod ;
   private String AV13TFProForCod_Sel ;
   private String AV14TFProForDsc ;
   private String AV15TFProForDsc_Sel ;
   private String AV16TFPrdNum ;
   private String AV17TFPrdNum_Sel ;
   private String AV18TFPrdNom ;
   private String AV19TFPrdNom_Sel ;
   private String AV22TFForPrdDsc ;
   private String AV23TFForPrdDsc_Sel ;
   private String AV46Emprcod ;
   private String AV52ForSer ;
   private String AV53ForColNom ;
   private String AV47Station ;
   private String A764ProForCod ;
   private String AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ;
   private String AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ;
   private String AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ;
   private String AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ;
   private String AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ;
   private String AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ;
   private String AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ;
   private String AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ;
   private String AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ;
   private String AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV62Formulaciontinte_webverformulacompletads_3_tfproforcod ;
   private String lV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ;
   private String lV66Formulaciontinte_webverformulacompletads_7_tfprdnum ;
   private String lV68Formulaciontinte_webverformulacompletads_9_tfprdnom ;
   private String lV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ;
   private String A766ProForDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A910Workstat ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8KG2 ;
   private boolean n488ForPrdDsc ;
   private boolean brk8KG4 ;
   private boolean brk8KG6 ;
   private boolean brk8KG8 ;
   private boolean brk8KG10 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08KG2_A490ForPrdUMe ;
   private String[] P08KG2_A396EmprCod ;
   private String[] P08KG2_A764ProForCod ;
   private String[] P08KG2_A910Workstat ;
   private java.math.BigDecimal[] P08KG2_A890EscMCan ;
   private String[] P08KG2_A488ForPrdDsc ;
   private boolean[] P08KG2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KG2_A4712EscMFacCon ;
   private String[] P08KG2_A718PrdNom ;
   private String[] P08KG2_A719PrdNum ;
   private String[] P08KG2_A766ProForDsc ;
   private int[] P08KG2_A887EscMLin ;
   private byte[] P08KG3_A490ForPrdUMe ;
   private String[] P08KG3_A764ProForCod ;
   private String[] P08KG3_A396EmprCod ;
   private String[] P08KG3_A910Workstat ;
   private java.math.BigDecimal[] P08KG3_A890EscMCan ;
   private String[] P08KG3_A488ForPrdDsc ;
   private boolean[] P08KG3_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KG3_A4712EscMFacCon ;
   private String[] P08KG3_A718PrdNom ;
   private String[] P08KG3_A719PrdNum ;
   private String[] P08KG3_A766ProForDsc ;
   private int[] P08KG3_A887EscMLin ;
   private byte[] P08KG4_A490ForPrdUMe ;
   private String[] P08KG4_A396EmprCod ;
   private String[] P08KG4_A719PrdNum ;
   private String[] P08KG4_A910Workstat ;
   private java.math.BigDecimal[] P08KG4_A890EscMCan ;
   private String[] P08KG4_A488ForPrdDsc ;
   private boolean[] P08KG4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KG4_A4712EscMFacCon ;
   private String[] P08KG4_A718PrdNom ;
   private String[] P08KG4_A766ProForDsc ;
   private String[] P08KG4_A764ProForCod ;
   private int[] P08KG4_A887EscMLin ;
   private byte[] P08KG5_A490ForPrdUMe ;
   private String[] P08KG5_A719PrdNum ;
   private String[] P08KG5_A396EmprCod ;
   private String[] P08KG5_A910Workstat ;
   private java.math.BigDecimal[] P08KG5_A890EscMCan ;
   private String[] P08KG5_A488ForPrdDsc ;
   private boolean[] P08KG5_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KG5_A4712EscMFacCon ;
   private String[] P08KG5_A718PrdNom ;
   private String[] P08KG5_A766ProForDsc ;
   private String[] P08KG5_A764ProForCod ;
   private int[] P08KG5_A887EscMLin ;
   private byte[] P08KG6_A490ForPrdUMe ;
   private String[] P08KG6_A396EmprCod ;
   private String[] P08KG6_A910Workstat ;
   private java.math.BigDecimal[] P08KG6_A890EscMCan ;
   private String[] P08KG6_A488ForPrdDsc ;
   private boolean[] P08KG6_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KG6_A4712EscMFacCon ;
   private String[] P08KG6_A718PrdNom ;
   private String[] P08KG6_A719PrdNum ;
   private String[] P08KG6_A766ProForDsc ;
   private String[] P08KG6_A764ProForCod ;
   private int[] P08KG6_A887EscMLin ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class webverformulacompletagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV60Formulaciontinte_webverformulacompletads_1_tfescmlin ,
                                          int AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to ,
                                          String AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                          String AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                          String AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                          String AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                          String AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                          String AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                          String AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                          String AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                          java.math.BigDecimal AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                          java.math.BigDecimal AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                          String AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                          String AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                          java.math.BigDecimal AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                          java.math.BigDecimal AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                          int A887EscMLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4712EscMFacCon ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A890EscMCan ,
                                          String A910Workstat ,
                                          String AV47Station ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.Workstat, T1.EscMCan, T2.ForPrdDsc, T1.EscMFacCon, T4.PrdNom, T1.PrdNum, T3.ProForDsc, T1.EscMLin FROM (((TXPESCMAN" ;
      scmdbuf += " T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod)" ;
      scmdbuf += " INNER JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Workstat = ?)");
      if ( ! (0==AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) )
      {
         addWhere(sWhereString, "(T1.EscMLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) )
      {
         addWhere(sWhereString, "(T1.EscMLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_webverformulacompletads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_webverformulacompletads_7_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_webverformulacompletads_9_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08KG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV60Formulaciontinte_webverformulacompletads_1_tfescmlin ,
                                          int AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to ,
                                          String AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                          String AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                          String AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                          String AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                          String AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                          String AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                          String AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                          String AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                          java.math.BigDecimal AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                          java.math.BigDecimal AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                          String AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                          String AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                          java.math.BigDecimal AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                          java.math.BigDecimal AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                          int A887EscMLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4712EscMFacCon ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A890EscMCan ,
                                          String A910Workstat ,
                                          String AV47Station ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.ProForCod, T1.EmprCod, T1.Workstat, T1.EscMCan, T3.ForPrdDsc, T1.EscMFacCon, T4.PrdNom, T1.PrdNum, T2.ProForDsc, T1.EscMLin FROM (((TXPESCMAN" ;
      scmdbuf += " T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      scmdbuf += " INNER JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Workstat = ?)");
      if ( ! (0==AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) )
      {
         addWhere(sWhereString, "(T1.EscMLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) )
      {
         addWhere(sWhereString, "(T1.EscMLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_webverformulacompletads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_webverformulacompletads_7_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_webverformulacompletads_9_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrdNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08KG4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV60Formulaciontinte_webverformulacompletads_1_tfescmlin ,
                                          int AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to ,
                                          String AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                          String AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                          String AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                          String AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                          String AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                          String AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                          String AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                          String AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                          java.math.BigDecimal AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                          java.math.BigDecimal AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                          String AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                          String AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                          java.math.BigDecimal AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                          java.math.BigDecimal AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                          int A887EscMLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4712EscMFacCon ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A890EscMCan ,
                                          String A910Workstat ,
                                          String AV47Station ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.PrdNum, T1.Workstat, T1.EscMCan, T2.ForPrdDsc, T1.EscMFacCon, T3.PrdNom, T4.ProForDsc, T1.ProForCod, T1.EscMLin FROM (((TXPESCMAN" ;
      scmdbuf += " T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      scmdbuf += " INNER JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Workstat = ?)");
      if ( ! (0==AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) )
      {
         addWhere(sWhereString, "(T1.EscMLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) )
      {
         addWhere(sWhereString, "(T1.EscMLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_webverformulacompletads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_webverformulacompletads_7_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_webverformulacompletads_9_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08KG5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV60Formulaciontinte_webverformulacompletads_1_tfescmlin ,
                                          int AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to ,
                                          String AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                          String AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                          String AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                          String AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                          String AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                          String AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                          String AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                          String AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                          java.math.BigDecimal AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                          java.math.BigDecimal AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                          String AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                          String AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                          java.math.BigDecimal AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                          java.math.BigDecimal AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                          int A887EscMLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4712EscMFacCon ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A890EscMCan ,
                                          String A910Workstat ,
                                          String AV47Station ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.PrdNum, T1.EmprCod, T1.Workstat, T1.EscMCan, T3.ForPrdDsc, T1.EscMFacCon, T2.PrdNom, T4.ProForDsc, T1.ProForCod, T1.EscMLin FROM (((TXPESCMAN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      scmdbuf += " INNER JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Workstat = ?)");
      if ( ! (0==AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) )
      {
         addWhere(sWhereString, "(T1.EscMLin >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) )
      {
         addWhere(sWhereString, "(T1.EscMLin <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_webverformulacompletads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_webverformulacompletads_7_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_webverformulacompletads_9_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08KG6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV60Formulaciontinte_webverformulacompletads_1_tfescmlin ,
                                          int AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to ,
                                          String AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                          String AV62Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                          String AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                          String AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                          String AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                          String AV66Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                          String AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                          String AV68Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                          java.math.BigDecimal AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                          java.math.BigDecimal AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                          String AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                          String AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                          java.math.BigDecimal AV74Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                          java.math.BigDecimal AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                          int A887EscMLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4712EscMFacCon ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A890EscMCan ,
                                          String A910Workstat ,
                                          String AV47Station ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[18];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Workstat, T1.EscMCan, T2.ForPrdDsc, T1.EscMFacCon, T3.PrdNom, T1.PrdNum, T4.ProForDsc, T1.ProForCod, T1.EscMLin FROM (((TXPESCMAN" ;
      scmdbuf += " T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      scmdbuf += " INNER JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Workstat = ?)");
      if ( ! (0==AV60Formulaciontinte_webverformulacompletads_1_tfescmlin) )
      {
         addWhere(sWhereString, "(T1.EscMLin >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_webverformulacompletads_2_tfescmlin_to) )
      {
         addWhere(sWhereString, "(T1.EscMLin <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_webverformulacompletads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_webverformulacompletads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_webverformulacompletads_7_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_webverformulacompletads_9_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Formulaciontinte_webverformulacompletads_11_tfescmfaccon)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_webverformulacompletads_13_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_webverformulacompletads_15_tfescmcan)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_webverformulacompletads_16_tfescmcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
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
                  return conditional_P08KG2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P08KG3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 2 :
                  return conditional_P08KG4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 3 :
                  return conditional_P08KG5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 4 :
                  return conditional_P08KG6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KG4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KG5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KG6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
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
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
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
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
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
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
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
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
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
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
      }
   }

}

