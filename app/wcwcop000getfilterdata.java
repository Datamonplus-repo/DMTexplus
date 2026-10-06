package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcop000getfilterdata extends GXProcedure
{
   public wcwcop000getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcop000getfilterdata.class ), "" );
   }

   public wcwcop000getfilterdata( int remoteHandle ,
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
      wcwcop000getfilterdata.this.aP5 = new String[] {""};
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
      wcwcop000getfilterdata.this.AV26DDOName = aP0;
      wcwcop000getfilterdata.this.AV24SearchTxt = aP1;
      wcwcop000getfilterdata.this.AV25SearchTxtTo = aP2;
      wcwcop000getfilterdata.this.aP3 = aP3;
      wcwcop000getfilterdata.this.aP4 = aP4;
      wcwcop000getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRDNOM") == 0 )
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
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WCWcop000GridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcop000GridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WCWcop000GridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PRDNUM") == 0 )
         {
            AV43PrdNum = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV14TFPrdExiAlm = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdExiAlm_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV16TFPrdCanRes = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdCanRes_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV18TFPrdCanPen = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrdCanPen_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDSTKMINU") == 0 )
         {
            AV20TFPrdStkMinU = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPrdStkMinU_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMUCO") == 0 )
         {
            AV22TFPrdNumUco = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdNumUco_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV44Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV42PrvNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNOM") == 0 )
         {
            AV45PrvNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV24SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV50Core_wcwcop000ds_1_prdnum = AV43PrdNum ;
      AV51Core_wcwcop000ds_2_tfprdnum = AV10TFPrdNum ;
      AV52Core_wcwcop000ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Core_wcwcop000ds_4_tfprdnom = AV12TFPrdNom ;
      AV54Core_wcwcop000ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Core_wcwcop000ds_6_tfprdexialm = AV14TFPrdExiAlm ;
      AV56Core_wcwcop000ds_7_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV57Core_wcwcop000ds_8_tfprdcanres = AV16TFPrdCanRes ;
      AV58Core_wcwcop000ds_9_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV59Core_wcwcop000ds_10_tfprdcanpen = AV18TFPrdCanPen ;
      AV60Core_wcwcop000ds_11_tfprdcanpen_to = AV19TFPrdCanPen_To ;
      AV61Core_wcwcop000ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV62Core_wcwcop000ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV63Core_wcwcop000ds_14_tfprdnumuco = AV22TFPrdNumUco ;
      AV64Core_wcwcop000ds_15_tfprdnumuco_to = AV23TFPrdNumUco_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Core_wcwcop000ds_1_prdnum ,
                                           AV52Core_wcwcop000ds_3_tfprdnum_sel ,
                                           AV51Core_wcwcop000ds_2_tfprdnum ,
                                           AV54Core_wcwcop000ds_5_tfprdnom_sel ,
                                           AV53Core_wcwcop000ds_4_tfprdnom ,
                                           AV55Core_wcwcop000ds_6_tfprdexialm ,
                                           AV56Core_wcwcop000ds_7_tfprdexialm_to ,
                                           AV57Core_wcwcop000ds_8_tfprdcanres ,
                                           AV58Core_wcwcop000ds_9_tfprdcanres_to ,
                                           AV59Core_wcwcop000ds_10_tfprdcanpen ,
                                           AV60Core_wcwcop000ds_11_tfprdcanpen_to ,
                                           AV61Core_wcwcop000ds_12_tfprdstkminu ,
                                           AV62Core_wcwcop000ds_13_tfprdstkminu_to ,
                                           AV63Core_wcwcop000ds_14_tfprdnumuco ,
                                           AV64Core_wcwcop000ds_15_tfprdnumuco_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A732PrdStkMinU ,
                                           A721PrdNumUco ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV42PrvNum) ,
                                           AV44Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Core_wcwcop000ds_1_prdnum = GXutil.padr( GXutil.rtrim( AV50Core_wcwcop000ds_1_prdnum), 6, "%") ;
      lV51Core_wcwcop000ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Core_wcwcop000ds_2_tfprdnum), 6, "%") ;
      lV53Core_wcwcop000ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Core_wcwcop000ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08OH2 */
      pr_default.execute(0, new Object[] {AV44Emprcod, Integer.valueOf(AV42PrvNum), lV50Core_wcwcop000ds_1_prdnum, lV51Core_wcwcop000ds_2_tfprdnum, AV52Core_wcwcop000ds_3_tfprdnum_sel, lV53Core_wcwcop000ds_4_tfprdnom, AV54Core_wcwcop000ds_5_tfprdnom_sel, AV55Core_wcwcop000ds_6_tfprdexialm, AV56Core_wcwcop000ds_7_tfprdexialm_to, AV57Core_wcwcop000ds_8_tfprdcanres, AV58Core_wcwcop000ds_9_tfprdcanres_to, AV59Core_wcwcop000ds_10_tfprdcanpen, AV60Core_wcwcop000ds_11_tfprdcanpen_to, AV61Core_wcwcop000ds_12_tfprdstkminu, AV62Core_wcwcop000ds_13_tfprdstkminu_to, AV63Core_wcwcop000ds_14_tfprdnumuco, AV64Core_wcwcop000ds_15_tfprdnumuco_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8OH2 = false ;
         A396EmprCod = P08OH2_A396EmprCod[0] ;
         A719PrdNum = P08OH2_A719PrdNum[0] ;
         A795PrvNum = P08OH2_A795PrvNum[0] ;
         A721PrdNumUco = P08OH2_A721PrdNumUco[0] ;
         A732PrdStkMinU = P08OH2_A732PrdStkMinU[0] ;
         A684PrdCanPen = P08OH2_A684PrdCanPen[0] ;
         A685PrdCanRes = P08OH2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08OH2_A704PrdExiAlm[0] ;
         A718PrdNom = P08OH2_A718PrdNom[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08OH2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08OH2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8OH2 = false ;
            AV36count = (long)(AV36count+1) ;
            brk8OH2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV28Option = A719PrdNum ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OH2 )
         {
            brk8OH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV24SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV50Core_wcwcop000ds_1_prdnum = AV43PrdNum ;
      AV51Core_wcwcop000ds_2_tfprdnum = AV10TFPrdNum ;
      AV52Core_wcwcop000ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Core_wcwcop000ds_4_tfprdnom = AV12TFPrdNom ;
      AV54Core_wcwcop000ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Core_wcwcop000ds_6_tfprdexialm = AV14TFPrdExiAlm ;
      AV56Core_wcwcop000ds_7_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV57Core_wcwcop000ds_8_tfprdcanres = AV16TFPrdCanRes ;
      AV58Core_wcwcop000ds_9_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV59Core_wcwcop000ds_10_tfprdcanpen = AV18TFPrdCanPen ;
      AV60Core_wcwcop000ds_11_tfprdcanpen_to = AV19TFPrdCanPen_To ;
      AV61Core_wcwcop000ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV62Core_wcwcop000ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV63Core_wcwcop000ds_14_tfprdnumuco = AV22TFPrdNumUco ;
      AV64Core_wcwcop000ds_15_tfprdnumuco_to = AV23TFPrdNumUco_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Core_wcwcop000ds_1_prdnum ,
                                           AV52Core_wcwcop000ds_3_tfprdnum_sel ,
                                           AV51Core_wcwcop000ds_2_tfprdnum ,
                                           AV54Core_wcwcop000ds_5_tfprdnom_sel ,
                                           AV53Core_wcwcop000ds_4_tfprdnom ,
                                           AV55Core_wcwcop000ds_6_tfprdexialm ,
                                           AV56Core_wcwcop000ds_7_tfprdexialm_to ,
                                           AV57Core_wcwcop000ds_8_tfprdcanres ,
                                           AV58Core_wcwcop000ds_9_tfprdcanres_to ,
                                           AV59Core_wcwcop000ds_10_tfprdcanpen ,
                                           AV60Core_wcwcop000ds_11_tfprdcanpen_to ,
                                           AV61Core_wcwcop000ds_12_tfprdstkminu ,
                                           AV62Core_wcwcop000ds_13_tfprdstkminu_to ,
                                           AV63Core_wcwcop000ds_14_tfprdnumuco ,
                                           AV64Core_wcwcop000ds_15_tfprdnumuco_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A732PrdStkMinU ,
                                           A721PrdNumUco ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV42PrvNum) ,
                                           AV44Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Core_wcwcop000ds_1_prdnum = GXutil.padr( GXutil.rtrim( AV50Core_wcwcop000ds_1_prdnum), 6, "%") ;
      lV51Core_wcwcop000ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Core_wcwcop000ds_2_tfprdnum), 6, "%") ;
      lV53Core_wcwcop000ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Core_wcwcop000ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08OH3 */
      pr_default.execute(1, new Object[] {AV44Emprcod, Integer.valueOf(AV42PrvNum), lV50Core_wcwcop000ds_1_prdnum, lV51Core_wcwcop000ds_2_tfprdnum, AV52Core_wcwcop000ds_3_tfprdnum_sel, lV53Core_wcwcop000ds_4_tfprdnom, AV54Core_wcwcop000ds_5_tfprdnom_sel, AV55Core_wcwcop000ds_6_tfprdexialm, AV56Core_wcwcop000ds_7_tfprdexialm_to, AV57Core_wcwcop000ds_8_tfprdcanres, AV58Core_wcwcop000ds_9_tfprdcanres_to, AV59Core_wcwcop000ds_10_tfprdcanpen, AV60Core_wcwcop000ds_11_tfprdcanpen_to, AV61Core_wcwcop000ds_12_tfprdstkminu, AV62Core_wcwcop000ds_13_tfprdstkminu_to, AV63Core_wcwcop000ds_14_tfprdnumuco, AV64Core_wcwcop000ds_15_tfprdnumuco_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8OH4 = false ;
         A396EmprCod = P08OH3_A396EmprCod[0] ;
         A718PrdNom = P08OH3_A718PrdNom[0] ;
         A795PrvNum = P08OH3_A795PrvNum[0] ;
         A721PrdNumUco = P08OH3_A721PrdNumUco[0] ;
         A732PrdStkMinU = P08OH3_A732PrdStkMinU[0] ;
         A684PrdCanPen = P08OH3_A684PrdCanPen[0] ;
         A685PrdCanRes = P08OH3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08OH3_A704PrdExiAlm[0] ;
         A719PrdNum = P08OH3_A719PrdNum[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08OH3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08OH3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8OH4 = false ;
            A719PrdNum = P08OH3_A719PrdNum[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8OH4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV28Option = A718PrdNom ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OH4 )
         {
            brk8OH4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcop000getfilterdata.this.AV30OptionsJson;
      this.aP4[0] = wcwcop000getfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = wcwcop000getfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV43PrdNum = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdExiAlm = DecimalUtil.ZERO ;
      AV15TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV16TFPrdCanRes = DecimalUtil.ZERO ;
      AV17TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV18TFPrdCanPen = DecimalUtil.ZERO ;
      AV19TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV20TFPrdStkMinU = DecimalUtil.ZERO ;
      AV21TFPrdStkMinU_To = DecimalUtil.ZERO ;
      AV22TFPrdNumUco = DecimalUtil.ZERO ;
      AV23TFPrdNumUco_To = DecimalUtil.ZERO ;
      AV44Emprcod = "" ;
      AV45PrvNom = "" ;
      A719PrdNum = "" ;
      AV50Core_wcwcop000ds_1_prdnum = "" ;
      AV51Core_wcwcop000ds_2_tfprdnum = "" ;
      AV52Core_wcwcop000ds_3_tfprdnum_sel = "" ;
      AV53Core_wcwcop000ds_4_tfprdnom = "" ;
      AV54Core_wcwcop000ds_5_tfprdnom_sel = "" ;
      AV55Core_wcwcop000ds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV56Core_wcwcop000ds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      AV57Core_wcwcop000ds_8_tfprdcanres = DecimalUtil.ZERO ;
      AV58Core_wcwcop000ds_9_tfprdcanres_to = DecimalUtil.ZERO ;
      AV59Core_wcwcop000ds_10_tfprdcanpen = DecimalUtil.ZERO ;
      AV60Core_wcwcop000ds_11_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV61Core_wcwcop000ds_12_tfprdstkminu = DecimalUtil.ZERO ;
      AV62Core_wcwcop000ds_13_tfprdstkminu_to = DecimalUtil.ZERO ;
      AV63Core_wcwcop000ds_14_tfprdnumuco = DecimalUtil.ZERO ;
      AV64Core_wcwcop000ds_15_tfprdnumuco_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV50Core_wcwcop000ds_1_prdnum = "" ;
      lV51Core_wcwcop000ds_2_tfprdnum = "" ;
      lV53Core_wcwcop000ds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08OH2_A396EmprCod = new String[] {""} ;
      P08OH2_A719PrdNum = new String[] {""} ;
      P08OH2_A795PrvNum = new int[1] ;
      P08OH2_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH2_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH2_A718PrdNom = new String[] {""} ;
      AV28Option = "" ;
      P08OH3_A396EmprCod = new String[] {""} ;
      P08OH3_A718PrdNom = new String[] {""} ;
      P08OH3_A795PrvNum = new int[1] ;
      P08OH3_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH3_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OH3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcop000getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08OH2_A396EmprCod, P08OH2_A719PrdNum, P08OH2_A795PrvNum, P08OH2_A721PrdNumUco, P08OH2_A732PrdStkMinU, P08OH2_A684PrdCanPen, P08OH2_A685PrdCanRes, P08OH2_A704PrdExiAlm, P08OH2_A718PrdNom
            }
            , new Object[] {
            P08OH3_A396EmprCod, P08OH3_A718PrdNom, P08OH3_A795PrvNum, P08OH3_A721PrdNumUco, P08OH3_A732PrdStkMinU, P08OH3_A684PrdCanPen, P08OH3_A685PrdCanRes, P08OH3_A704PrdExiAlm, P08OH3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV48GXV1 ;
   private int AV42PrvNum ;
   private int A795PrvNum ;
   private long AV36count ;
   private java.math.BigDecimal AV14TFPrdExiAlm ;
   private java.math.BigDecimal AV15TFPrdExiAlm_To ;
   private java.math.BigDecimal AV16TFPrdCanRes ;
   private java.math.BigDecimal AV17TFPrdCanRes_To ;
   private java.math.BigDecimal AV18TFPrdCanPen ;
   private java.math.BigDecimal AV19TFPrdCanPen_To ;
   private java.math.BigDecimal AV20TFPrdStkMinU ;
   private java.math.BigDecimal AV21TFPrdStkMinU_To ;
   private java.math.BigDecimal AV22TFPrdNumUco ;
   private java.math.BigDecimal AV23TFPrdNumUco_To ;
   private java.math.BigDecimal AV55Core_wcwcop000ds_6_tfprdexialm ;
   private java.math.BigDecimal AV56Core_wcwcop000ds_7_tfprdexialm_to ;
   private java.math.BigDecimal AV57Core_wcwcop000ds_8_tfprdcanres ;
   private java.math.BigDecimal AV58Core_wcwcop000ds_9_tfprdcanres_to ;
   private java.math.BigDecimal AV59Core_wcwcop000ds_10_tfprdcanpen ;
   private java.math.BigDecimal AV60Core_wcwcop000ds_11_tfprdcanpen_to ;
   private java.math.BigDecimal AV61Core_wcwcop000ds_12_tfprdstkminu ;
   private java.math.BigDecimal AV62Core_wcwcop000ds_13_tfprdstkminu_to ;
   private java.math.BigDecimal AV63Core_wcwcop000ds_14_tfprdnumuco ;
   private java.math.BigDecimal AV64Core_wcwcop000ds_15_tfprdnumuco_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A721PrdNumUco ;
   private String AV43PrdNum ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV44Emprcod ;
   private String AV45PrvNom ;
   private String A719PrdNum ;
   private String AV50Core_wcwcop000ds_1_prdnum ;
   private String AV51Core_wcwcop000ds_2_tfprdnum ;
   private String AV52Core_wcwcop000ds_3_tfprdnum_sel ;
   private String AV53Core_wcwcop000ds_4_tfprdnom ;
   private String AV54Core_wcwcop000ds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV50Core_wcwcop000ds_1_prdnum ;
   private String lV51Core_wcwcop000ds_2_tfprdnum ;
   private String lV53Core_wcwcop000ds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8OH2 ;
   private boolean brk8OH4 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08OH2_A396EmprCod ;
   private String[] P08OH2_A719PrdNum ;
   private int[] P08OH2_A795PrvNum ;
   private java.math.BigDecimal[] P08OH2_A721PrdNumUco ;
   private java.math.BigDecimal[] P08OH2_A732PrdStkMinU ;
   private java.math.BigDecimal[] P08OH2_A684PrdCanPen ;
   private java.math.BigDecimal[] P08OH2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08OH2_A704PrdExiAlm ;
   private String[] P08OH2_A718PrdNom ;
   private String[] P08OH3_A396EmprCod ;
   private String[] P08OH3_A718PrdNom ;
   private int[] P08OH3_A795PrvNum ;
   private java.math.BigDecimal[] P08OH3_A721PrdNumUco ;
   private java.math.BigDecimal[] P08OH3_A732PrdStkMinU ;
   private java.math.BigDecimal[] P08OH3_A684PrdCanPen ;
   private java.math.BigDecimal[] P08OH3_A685PrdCanRes ;
   private java.math.BigDecimal[] P08OH3_A704PrdExiAlm ;
   private String[] P08OH3_A719PrdNum ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class wcwcop000getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Core_wcwcop000ds_1_prdnum ,
                                          String AV52Core_wcwcop000ds_3_tfprdnum_sel ,
                                          String AV51Core_wcwcop000ds_2_tfprdnum ,
                                          String AV54Core_wcwcop000ds_5_tfprdnom_sel ,
                                          String AV53Core_wcwcop000ds_4_tfprdnom ,
                                          java.math.BigDecimal AV55Core_wcwcop000ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV56Core_wcwcop000ds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV57Core_wcwcop000ds_8_tfprdcanres ,
                                          java.math.BigDecimal AV58Core_wcwcop000ds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV59Core_wcwcop000ds_10_tfprdcanpen ,
                                          java.math.BigDecimal AV60Core_wcwcop000ds_11_tfprdcanpen_to ,
                                          java.math.BigDecimal AV61Core_wcwcop000ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV62Core_wcwcop000ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV63Core_wcwcop000ds_14_tfprdnumuco ,
                                          java.math.BigDecimal AV64Core_wcwcop000ds_15_tfprdnumuco_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A721PrdNumUco ,
                                          int A795PrvNum ,
                                          int AV42PrvNum ,
                                          String AV44Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, PrvNum, PrdNumUco, PrdStkMinU, PrdCanPen, PrdCanRes, PrdExiAlm, PrdNom FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV50Core_wcwcop000ds_1_prdnum)==0) )
      {
         addWhere(sWhereString, "(PrdNum like ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Core_wcwcop000ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Core_wcwcop000ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(PrdNum like ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Core_wcwcop000ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Core_wcwcop000ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Core_wcwcop000ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(PrdNom like ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Core_wcwcop000ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Core_wcwcop000ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Core_wcwcop000ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Core_wcwcop000ds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Core_wcwcop000ds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Core_wcwcop000ds_10_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(PrdCanPen >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Core_wcwcop000ds_11_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(PrdCanPen <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Core_wcwcop000ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Core_wcwcop000ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Core_wcwcop000ds_14_tfprdnumuco)==0) )
      {
         addWhere(sWhereString, "(PrdNumUco >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Core_wcwcop000ds_15_tfprdnumuco_to)==0) )
      {
         addWhere(sWhereString, "(PrdNumUco <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08OH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Core_wcwcop000ds_1_prdnum ,
                                          String AV52Core_wcwcop000ds_3_tfprdnum_sel ,
                                          String AV51Core_wcwcop000ds_2_tfprdnum ,
                                          String AV54Core_wcwcop000ds_5_tfprdnom_sel ,
                                          String AV53Core_wcwcop000ds_4_tfprdnom ,
                                          java.math.BigDecimal AV55Core_wcwcop000ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV56Core_wcwcop000ds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV57Core_wcwcop000ds_8_tfprdcanres ,
                                          java.math.BigDecimal AV58Core_wcwcop000ds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV59Core_wcwcop000ds_10_tfprdcanpen ,
                                          java.math.BigDecimal AV60Core_wcwcop000ds_11_tfprdcanpen_to ,
                                          java.math.BigDecimal AV61Core_wcwcop000ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV62Core_wcwcop000ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV63Core_wcwcop000ds_14_tfprdnumuco ,
                                          java.math.BigDecimal AV64Core_wcwcop000ds_15_tfprdnumuco_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A721PrdNumUco ,
                                          int A795PrvNum ,
                                          int AV42PrvNum ,
                                          String AV44Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[17];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNom, PrvNum, PrdNumUco, PrdStkMinU, PrdCanPen, PrdCanRes, PrdExiAlm, PrdNum FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV50Core_wcwcop000ds_1_prdnum)==0) )
      {
         addWhere(sWhereString, "(PrdNum like ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Core_wcwcop000ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Core_wcwcop000ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(PrdNum like ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Core_wcwcop000ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Core_wcwcop000ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Core_wcwcop000ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(PrdNom like ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Core_wcwcop000ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Core_wcwcop000ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Core_wcwcop000ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Core_wcwcop000ds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(PrdCanRes >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Core_wcwcop000ds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(PrdCanRes <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Core_wcwcop000ds_10_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(PrdCanPen >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Core_wcwcop000ds_11_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(PrdCanPen <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Core_wcwcop000ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Core_wcwcop000ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Core_wcwcop000ds_14_tfprdnumuco)==0) )
      {
         addWhere(sWhereString, "(PrdNumUco >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Core_wcwcop000ds_15_tfprdnumuco_to)==0) )
      {
         addWhere(sWhereString, "(PrdNumUco <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNom" ;
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
                  return conditional_P08OH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] );
            case 1 :
                  return conditional_P08OH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               return;
      }
   }

}

