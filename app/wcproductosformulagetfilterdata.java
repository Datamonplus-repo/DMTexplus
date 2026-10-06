package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcproductosformulagetfilterdata extends GXProcedure
{
   public wcproductosformulagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproductosformulagetfilterdata.class ), "" );
   }

   public wcproductosformulagetfilterdata( int remoteHandle ,
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
      wcproductosformulagetfilterdata.this.aP5 = new String[] {""};
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
      wcproductosformulagetfilterdata.this.AV22DDOName = aP0;
      wcproductosformulagetfilterdata.this.AV20SearchTxt = aP1;
      wcproductosformulagetfilterdata.this.AV21SearchTxtTo = aP2;
      wcproductosformulagetfilterdata.this.aP3 = aP3;
      wcproductosformulagetfilterdata.this.aP4 = aP4;
      wcproductosformulagetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV33Session.getValue("WCProductosFormulaGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCProductosFormulaGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WCProductosFormulaGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIN") == 0 )
         {
            AV10TFPrdLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrdLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDCAN") == 0 )
         {
            AV16TFForPrdCan = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFForPrdCan_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV18TFForPrdDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV19TFForPrdDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDNOR") == 0 )
         {
            AV40TFForPrdNor = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFForPrdNor_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOL") == 0 )
         {
            AV39Fornumcol = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV20SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV49Wcproductosformulads_1_tfprdlin = AV10TFPrdLin ;
      AV50Wcproductosformulads_2_tfprdlin_to = AV11TFPrdLin_To ;
      AV51Wcproductosformulads_3_tfprdnum = AV12TFPrdNum ;
      AV52Wcproductosformulads_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV53Wcproductosformulads_5_tfprdnom = AV14TFPrdNom ;
      AV54Wcproductosformulads_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV55Wcproductosformulads_7_tfforprdcan = AV16TFForPrdCan ;
      AV56Wcproductosformulads_8_tfforprdcan_to = AV17TFForPrdCan_To ;
      AV57Wcproductosformulads_9_tfforprddsc = AV18TFForPrdDsc ;
      AV58Wcproductosformulads_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV59Wcproductosformulads_11_tfforprdnor = AV40TFForPrdNor ;
      AV60Wcproductosformulads_12_tfforprdnor_to = AV41TFForPrdNor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV49Wcproductosformulads_1_tfprdlin) ,
                                           Short.valueOf(AV50Wcproductosformulads_2_tfprdlin_to) ,
                                           AV52Wcproductosformulads_4_tfprdnum_sel ,
                                           AV51Wcproductosformulads_3_tfprdnum ,
                                           AV54Wcproductosformulads_6_tfprdnom_sel ,
                                           AV53Wcproductosformulads_5_tfprdnom ,
                                           AV55Wcproductosformulads_7_tfforprdcan ,
                                           AV56Wcproductosformulads_8_tfforprdcan_to ,
                                           AV58Wcproductosformulads_10_tfforprddsc_sel ,
                                           AV57Wcproductosformulads_9_tfforprddsc ,
                                           Short.valueOf(AV59Wcproductosformulads_11_tfforprdnor) ,
                                           Short.valueOf(AV60Wcproductosformulads_12_tfforprdnor_to) ,
                                           Short.valueOf(A715PrdLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A487ForPrdCan ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A489ForPrdNor) ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV39Fornumcol) ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcproductosformulads_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Wcproductosformulads_3_tfprdnum), 6, "%") ;
      lV53Wcproductosformulads_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Wcproductosformulads_5_tfprdnom), 26, "%") ;
      lV57Wcproductosformulads_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV57Wcproductosformulads_9_tfforprddsc), 5, "%") ;
      /* Using cursor P08KB2 */
      pr_default.execute(0, new Object[] {AV38Emprcod, Integer.valueOf(AV39Fornumcol), Short.valueOf(AV49Wcproductosformulads_1_tfprdlin), Short.valueOf(AV50Wcproductosformulads_2_tfprdlin_to), lV51Wcproductosformulads_3_tfprdnum, AV52Wcproductosformulads_4_tfprdnum_sel, lV53Wcproductosformulads_5_tfprdnom, AV54Wcproductosformulads_6_tfprdnom_sel, AV55Wcproductosformulads_7_tfforprdcan, AV56Wcproductosformulads_8_tfforprdcan_to, lV57Wcproductosformulads_9_tfforprddsc, AV58Wcproductosformulads_10_tfforprddsc_sel, Short.valueOf(AV59Wcproductosformulads_11_tfforprdnor), Short.valueOf(AV60Wcproductosformulads_12_tfforprdnor_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8KB2 = false ;
         A490ForPrdUMe = P08KB2_A490ForPrdUMe[0] ;
         A396EmprCod = P08KB2_A396EmprCod[0] ;
         A719PrdNum = P08KB2_A719PrdNum[0] ;
         A486ForNumCol = P08KB2_A486ForNumCol[0] ;
         A489ForPrdNor = P08KB2_A489ForPrdNor[0] ;
         A488ForPrdDsc = P08KB2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KB2_n488ForPrdDsc[0] ;
         A487ForPrdCan = P08KB2_A487ForPrdCan[0] ;
         A718PrdNom = P08KB2_A718PrdNom[0] ;
         A715PrdLin = P08KB2_A715PrdLin[0] ;
         A488ForPrdDsc = P08KB2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KB2_n488ForPrdDsc[0] ;
         A718PrdNom = P08KB2_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08KB2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08KB2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8KB2 = false ;
            A486ForNumCol = P08KB2_A486ForNumCol[0] ;
            A715PrdLin = P08KB2_A715PrdLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8KB2 = true ;
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
         if ( ! brk8KB2 )
         {
            brk8KB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV20SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV49Wcproductosformulads_1_tfprdlin = AV10TFPrdLin ;
      AV50Wcproductosformulads_2_tfprdlin_to = AV11TFPrdLin_To ;
      AV51Wcproductosformulads_3_tfprdnum = AV12TFPrdNum ;
      AV52Wcproductosformulads_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV53Wcproductosformulads_5_tfprdnom = AV14TFPrdNom ;
      AV54Wcproductosformulads_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV55Wcproductosformulads_7_tfforprdcan = AV16TFForPrdCan ;
      AV56Wcproductosformulads_8_tfforprdcan_to = AV17TFForPrdCan_To ;
      AV57Wcproductosformulads_9_tfforprddsc = AV18TFForPrdDsc ;
      AV58Wcproductosformulads_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV59Wcproductosformulads_11_tfforprdnor = AV40TFForPrdNor ;
      AV60Wcproductosformulads_12_tfforprdnor_to = AV41TFForPrdNor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV49Wcproductosformulads_1_tfprdlin) ,
                                           Short.valueOf(AV50Wcproductosformulads_2_tfprdlin_to) ,
                                           AV52Wcproductosformulads_4_tfprdnum_sel ,
                                           AV51Wcproductosformulads_3_tfprdnum ,
                                           AV54Wcproductosformulads_6_tfprdnom_sel ,
                                           AV53Wcproductosformulads_5_tfprdnom ,
                                           AV55Wcproductosformulads_7_tfforprdcan ,
                                           AV56Wcproductosformulads_8_tfforprdcan_to ,
                                           AV58Wcproductosformulads_10_tfforprddsc_sel ,
                                           AV57Wcproductosformulads_9_tfforprddsc ,
                                           Short.valueOf(AV59Wcproductosformulads_11_tfforprdnor) ,
                                           Short.valueOf(AV60Wcproductosformulads_12_tfforprdnor_to) ,
                                           Short.valueOf(A715PrdLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A487ForPrdCan ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A489ForPrdNor) ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV39Fornumcol) ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcproductosformulads_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Wcproductosformulads_3_tfprdnum), 6, "%") ;
      lV53Wcproductosformulads_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Wcproductosformulads_5_tfprdnom), 26, "%") ;
      lV57Wcproductosformulads_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV57Wcproductosformulads_9_tfforprddsc), 5, "%") ;
      /* Using cursor P08KB3 */
      pr_default.execute(1, new Object[] {AV38Emprcod, Integer.valueOf(AV39Fornumcol), Short.valueOf(AV49Wcproductosformulads_1_tfprdlin), Short.valueOf(AV50Wcproductosformulads_2_tfprdlin_to), lV51Wcproductosformulads_3_tfprdnum, AV52Wcproductosformulads_4_tfprdnum_sel, lV53Wcproductosformulads_5_tfprdnom, AV54Wcproductosformulads_6_tfprdnom_sel, AV55Wcproductosformulads_7_tfforprdcan, AV56Wcproductosformulads_8_tfforprdcan_to, lV57Wcproductosformulads_9_tfforprddsc, AV58Wcproductosformulads_10_tfforprddsc_sel, Short.valueOf(AV59Wcproductosformulads_11_tfforprdnor), Short.valueOf(AV60Wcproductosformulads_12_tfforprdnor_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8KB4 = false ;
         A490ForPrdUMe = P08KB3_A490ForPrdUMe[0] ;
         A719PrdNum = P08KB3_A719PrdNum[0] ;
         A396EmprCod = P08KB3_A396EmprCod[0] ;
         A486ForNumCol = P08KB3_A486ForNumCol[0] ;
         A489ForPrdNor = P08KB3_A489ForPrdNor[0] ;
         A488ForPrdDsc = P08KB3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KB3_n488ForPrdDsc[0] ;
         A487ForPrdCan = P08KB3_A487ForPrdCan[0] ;
         A718PrdNom = P08KB3_A718PrdNom[0] ;
         A715PrdLin = P08KB3_A715PrdLin[0] ;
         A718PrdNom = P08KB3_A718PrdNom[0] ;
         A488ForPrdDsc = P08KB3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KB3_n488ForPrdDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08KB3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08KB3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8KB4 = false ;
            A486ForNumCol = P08KB3_A486ForNumCol[0] ;
            A715PrdLin = P08KB3_A715PrdLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8KB4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV24Option = A718PrdNom ;
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
         if ( ! brk8KB4 )
         {
            brk8KB4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForPrdDsc = AV20SearchTxt ;
      AV19TFForPrdDsc_Sel = "" ;
      AV49Wcproductosformulads_1_tfprdlin = AV10TFPrdLin ;
      AV50Wcproductosformulads_2_tfprdlin_to = AV11TFPrdLin_To ;
      AV51Wcproductosformulads_3_tfprdnum = AV12TFPrdNum ;
      AV52Wcproductosformulads_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV53Wcproductosformulads_5_tfprdnom = AV14TFPrdNom ;
      AV54Wcproductosformulads_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV55Wcproductosformulads_7_tfforprdcan = AV16TFForPrdCan ;
      AV56Wcproductosformulads_8_tfforprdcan_to = AV17TFForPrdCan_To ;
      AV57Wcproductosformulads_9_tfforprddsc = AV18TFForPrdDsc ;
      AV58Wcproductosformulads_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV59Wcproductosformulads_11_tfforprdnor = AV40TFForPrdNor ;
      AV60Wcproductosformulads_12_tfforprdnor_to = AV41TFForPrdNor_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV49Wcproductosformulads_1_tfprdlin) ,
                                           Short.valueOf(AV50Wcproductosformulads_2_tfprdlin_to) ,
                                           AV52Wcproductosformulads_4_tfprdnum_sel ,
                                           AV51Wcproductosformulads_3_tfprdnum ,
                                           AV54Wcproductosformulads_6_tfprdnom_sel ,
                                           AV53Wcproductosformulads_5_tfprdnom ,
                                           AV55Wcproductosformulads_7_tfforprdcan ,
                                           AV56Wcproductosformulads_8_tfforprdcan_to ,
                                           AV58Wcproductosformulads_10_tfforprddsc_sel ,
                                           AV57Wcproductosformulads_9_tfforprddsc ,
                                           Short.valueOf(AV59Wcproductosformulads_11_tfforprdnor) ,
                                           Short.valueOf(AV60Wcproductosformulads_12_tfforprdnor_to) ,
                                           Short.valueOf(A715PrdLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A487ForPrdCan ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A489ForPrdNor) ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV39Fornumcol) ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcproductosformulads_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Wcproductosformulads_3_tfprdnum), 6, "%") ;
      lV53Wcproductosformulads_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Wcproductosformulads_5_tfprdnom), 26, "%") ;
      lV57Wcproductosformulads_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV57Wcproductosformulads_9_tfforprddsc), 5, "%") ;
      /* Using cursor P08KB4 */
      pr_default.execute(2, new Object[] {AV38Emprcod, Integer.valueOf(AV39Fornumcol), Short.valueOf(AV49Wcproductosformulads_1_tfprdlin), Short.valueOf(AV50Wcproductosformulads_2_tfprdlin_to), lV51Wcproductosformulads_3_tfprdnum, AV52Wcproductosformulads_4_tfprdnum_sel, lV53Wcproductosformulads_5_tfprdnom, AV54Wcproductosformulads_6_tfprdnom_sel, AV55Wcproductosformulads_7_tfforprdcan, AV56Wcproductosformulads_8_tfforprdcan_to, lV57Wcproductosformulads_9_tfforprddsc, AV58Wcproductosformulads_10_tfforprddsc_sel, Short.valueOf(AV59Wcproductosformulads_11_tfforprdnor), Short.valueOf(AV60Wcproductosformulads_12_tfforprdnor_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8KB6 = false ;
         A490ForPrdUMe = P08KB4_A490ForPrdUMe[0] ;
         A396EmprCod = P08KB4_A396EmprCod[0] ;
         A486ForNumCol = P08KB4_A486ForNumCol[0] ;
         A489ForPrdNor = P08KB4_A489ForPrdNor[0] ;
         A488ForPrdDsc = P08KB4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KB4_n488ForPrdDsc[0] ;
         A487ForPrdCan = P08KB4_A487ForPrdCan[0] ;
         A718PrdNom = P08KB4_A718PrdNom[0] ;
         A719PrdNum = P08KB4_A719PrdNum[0] ;
         A715PrdLin = P08KB4_A715PrdLin[0] ;
         A488ForPrdDsc = P08KB4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KB4_n488ForPrdDsc[0] ;
         A718PrdNom = P08KB4_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08KB4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08KB4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk8KB6 = false ;
            A486ForNumCol = P08KB4_A486ForNumCol[0] ;
            A715PrdLin = P08KB4_A715PrdLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8KB6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV24Option = A488ForPrdDsc ;
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
         if ( ! brk8KB6 )
         {
            brk8KB6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcproductosformulagetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = wcproductosformulagetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = wcproductosformulagetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV16TFForPrdCan = DecimalUtil.ZERO ;
      AV17TFForPrdCan_To = DecimalUtil.ZERO ;
      AV18TFForPrdDsc = "" ;
      AV19TFForPrdDsc_Sel = "" ;
      AV38Emprcod = "" ;
      A719PrdNum = "" ;
      AV51Wcproductosformulads_3_tfprdnum = "" ;
      AV52Wcproductosformulads_4_tfprdnum_sel = "" ;
      AV53Wcproductosformulads_5_tfprdnom = "" ;
      AV54Wcproductosformulads_6_tfprdnom_sel = "" ;
      AV55Wcproductosformulads_7_tfforprdcan = DecimalUtil.ZERO ;
      AV56Wcproductosformulads_8_tfforprdcan_to = DecimalUtil.ZERO ;
      AV57Wcproductosformulads_9_tfforprddsc = "" ;
      AV58Wcproductosformulads_10_tfforprddsc_sel = "" ;
      scmdbuf = "" ;
      lV51Wcproductosformulads_3_tfprdnum = "" ;
      lV53Wcproductosformulads_5_tfprdnom = "" ;
      lV57Wcproductosformulads_9_tfforprddsc = "" ;
      A718PrdNom = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A396EmprCod = "" ;
      P08KB2_A490ForPrdUMe = new byte[1] ;
      P08KB2_A396EmprCod = new String[] {""} ;
      P08KB2_A719PrdNum = new String[] {""} ;
      P08KB2_A486ForNumCol = new int[1] ;
      P08KB2_A489ForPrdNor = new short[1] ;
      P08KB2_A488ForPrdDsc = new String[] {""} ;
      P08KB2_n488ForPrdDsc = new boolean[] {false} ;
      P08KB2_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KB2_A718PrdNom = new String[] {""} ;
      P08KB2_A715PrdLin = new short[1] ;
      AV24Option = "" ;
      P08KB3_A490ForPrdUMe = new byte[1] ;
      P08KB3_A719PrdNum = new String[] {""} ;
      P08KB3_A396EmprCod = new String[] {""} ;
      P08KB3_A486ForNumCol = new int[1] ;
      P08KB3_A489ForPrdNor = new short[1] ;
      P08KB3_A488ForPrdDsc = new String[] {""} ;
      P08KB3_n488ForPrdDsc = new boolean[] {false} ;
      P08KB3_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KB3_A718PrdNom = new String[] {""} ;
      P08KB3_A715PrdLin = new short[1] ;
      P08KB4_A490ForPrdUMe = new byte[1] ;
      P08KB4_A396EmprCod = new String[] {""} ;
      P08KB4_A486ForNumCol = new int[1] ;
      P08KB4_A489ForPrdNor = new short[1] ;
      P08KB4_A488ForPrdDsc = new String[] {""} ;
      P08KB4_n488ForPrdDsc = new boolean[] {false} ;
      P08KB4_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KB4_A718PrdNom = new String[] {""} ;
      P08KB4_A719PrdNum = new String[] {""} ;
      P08KB4_A715PrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcproductosformulagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08KB2_A490ForPrdUMe, P08KB2_A396EmprCod, P08KB2_A719PrdNum, P08KB2_A486ForNumCol, P08KB2_A489ForPrdNor, P08KB2_A488ForPrdDsc, P08KB2_n488ForPrdDsc, P08KB2_A487ForPrdCan, P08KB2_A718PrdNom, P08KB2_A715PrdLin
            }
            , new Object[] {
            P08KB3_A490ForPrdUMe, P08KB3_A719PrdNum, P08KB3_A396EmprCod, P08KB3_A486ForNumCol, P08KB3_A489ForPrdNor, P08KB3_A488ForPrdDsc, P08KB3_n488ForPrdDsc, P08KB3_A487ForPrdCan, P08KB3_A718PrdNom, P08KB3_A715PrdLin
            }
            , new Object[] {
            P08KB4_A490ForPrdUMe, P08KB4_A396EmprCod, P08KB4_A486ForNumCol, P08KB4_A489ForPrdNor, P08KB4_A488ForPrdDsc, P08KB4_n488ForPrdDsc, P08KB4_A487ForPrdCan, P08KB4_A718PrdNom, P08KB4_A719PrdNum, P08KB4_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private short AV10TFPrdLin ;
   private short AV11TFPrdLin_To ;
   private short AV40TFForPrdNor ;
   private short AV41TFForPrdNor_To ;
   private short AV49Wcproductosformulads_1_tfprdlin ;
   private short AV50Wcproductosformulads_2_tfprdlin_to ;
   private short AV59Wcproductosformulads_11_tfforprdnor ;
   private short AV60Wcproductosformulads_12_tfforprdnor_to ;
   private short A715PrdLin ;
   private short A489ForPrdNor ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV39Fornumcol ;
   private int A486ForNumCol ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV16TFForPrdCan ;
   private java.math.BigDecimal AV17TFForPrdCan_To ;
   private java.math.BigDecimal AV55Wcproductosformulads_7_tfforprdcan ;
   private java.math.BigDecimal AV56Wcproductosformulads_8_tfforprdcan_to ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV18TFForPrdDsc ;
   private String AV19TFForPrdDsc_Sel ;
   private String AV38Emprcod ;
   private String A719PrdNum ;
   private String AV51Wcproductosformulads_3_tfprdnum ;
   private String AV52Wcproductosformulads_4_tfprdnum_sel ;
   private String AV53Wcproductosformulads_5_tfprdnom ;
   private String AV54Wcproductosformulads_6_tfprdnom_sel ;
   private String AV57Wcproductosformulads_9_tfforprddsc ;
   private String AV58Wcproductosformulads_10_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV51Wcproductosformulads_3_tfprdnum ;
   private String lV53Wcproductosformulads_5_tfprdnom ;
   private String lV57Wcproductosformulads_9_tfforprddsc ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8KB2 ;
   private boolean n488ForPrdDsc ;
   private boolean brk8KB4 ;
   private boolean brk8KB6 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08KB2_A490ForPrdUMe ;
   private String[] P08KB2_A396EmprCod ;
   private String[] P08KB2_A719PrdNum ;
   private int[] P08KB2_A486ForNumCol ;
   private short[] P08KB2_A489ForPrdNor ;
   private String[] P08KB2_A488ForPrdDsc ;
   private boolean[] P08KB2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KB2_A487ForPrdCan ;
   private String[] P08KB2_A718PrdNom ;
   private short[] P08KB2_A715PrdLin ;
   private byte[] P08KB3_A490ForPrdUMe ;
   private String[] P08KB3_A719PrdNum ;
   private String[] P08KB3_A396EmprCod ;
   private int[] P08KB3_A486ForNumCol ;
   private short[] P08KB3_A489ForPrdNor ;
   private String[] P08KB3_A488ForPrdDsc ;
   private boolean[] P08KB3_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KB3_A487ForPrdCan ;
   private String[] P08KB3_A718PrdNom ;
   private short[] P08KB3_A715PrdLin ;
   private byte[] P08KB4_A490ForPrdUMe ;
   private String[] P08KB4_A396EmprCod ;
   private int[] P08KB4_A486ForNumCol ;
   private short[] P08KB4_A489ForPrdNor ;
   private String[] P08KB4_A488ForPrdDsc ;
   private boolean[] P08KB4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KB4_A487ForPrdCan ;
   private String[] P08KB4_A718PrdNom ;
   private String[] P08KB4_A719PrdNum ;
   private short[] P08KB4_A715PrdLin ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wcproductosformulagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV49Wcproductosformulads_1_tfprdlin ,
                                          short AV50Wcproductosformulads_2_tfprdlin_to ,
                                          String AV52Wcproductosformulads_4_tfprdnum_sel ,
                                          String AV51Wcproductosformulads_3_tfprdnum ,
                                          String AV54Wcproductosformulads_6_tfprdnom_sel ,
                                          String AV53Wcproductosformulads_5_tfprdnom ,
                                          java.math.BigDecimal AV55Wcproductosformulads_7_tfforprdcan ,
                                          java.math.BigDecimal AV56Wcproductosformulads_8_tfforprdcan_to ,
                                          String AV58Wcproductosformulads_10_tfforprddsc_sel ,
                                          String AV57Wcproductosformulads_9_tfforprddsc ,
                                          short AV59Wcproductosformulads_11_tfforprdnor ,
                                          short AV60Wcproductosformulads_12_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          int A486ForNumCol ,
                                          int AV39Fornumcol ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.PrdNum, T1.ForNumCol, T1.ForPrdNor, T2.ForPrdDsc, T1.ForPrdCan, T3.PrdNom, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPUNMEPR" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV49Wcproductosformulads_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Wcproductosformulads_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Wcproductosformulads_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcproductosformulads_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcproductosformulads_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Wcproductosformulads_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Wcproductosformulads_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Wcproductosformulads_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcproductosformulads_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcproductosformulads_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcproductosformulads_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcproductosformulads_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcproductosformulads_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcproductosformulads_11_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Wcproductosformulads_12_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08KB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV49Wcproductosformulads_1_tfprdlin ,
                                          short AV50Wcproductosformulads_2_tfprdlin_to ,
                                          String AV52Wcproductosformulads_4_tfprdnum_sel ,
                                          String AV51Wcproductosformulads_3_tfprdnum ,
                                          String AV54Wcproductosformulads_6_tfprdnom_sel ,
                                          String AV53Wcproductosformulads_5_tfprdnom ,
                                          java.math.BigDecimal AV55Wcproductosformulads_7_tfforprdcan ,
                                          java.math.BigDecimal AV56Wcproductosformulads_8_tfforprdcan_to ,
                                          String AV58Wcproductosformulads_10_tfforprddsc_sel ,
                                          String AV57Wcproductosformulads_9_tfforprddsc ,
                                          short AV59Wcproductosformulads_11_tfforprdnor ,
                                          short AV60Wcproductosformulads_12_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          int A486ForNumCol ,
                                          int AV39Fornumcol ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.PrdNum, T1.EmprCod, T1.ForNumCol, T1.ForPrdNor, T3.ForPrdDsc, T1.ForPrdCan, T2.PrdNom, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV49Wcproductosformulads_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Wcproductosformulads_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Wcproductosformulads_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcproductosformulads_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcproductosformulads_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Wcproductosformulads_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Wcproductosformulads_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Wcproductosformulads_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcproductosformulads_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcproductosformulads_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcproductosformulads_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcproductosformulads_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcproductosformulads_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcproductosformulads_11_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Wcproductosformulads_12_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08KB4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV49Wcproductosformulads_1_tfprdlin ,
                                          short AV50Wcproductosformulads_2_tfprdlin_to ,
                                          String AV52Wcproductosformulads_4_tfprdnum_sel ,
                                          String AV51Wcproductosformulads_3_tfprdnum ,
                                          String AV54Wcproductosformulads_6_tfprdnom_sel ,
                                          String AV53Wcproductosformulads_5_tfprdnom ,
                                          java.math.BigDecimal AV55Wcproductosformulads_7_tfforprdcan ,
                                          java.math.BigDecimal AV56Wcproductosformulads_8_tfforprdcan_to ,
                                          String AV58Wcproductosformulads_10_tfforprddsc_sel ,
                                          String AV57Wcproductosformulads_9_tfforprddsc ,
                                          short AV59Wcproductosformulads_11_tfforprdnor ,
                                          short AV60Wcproductosformulads_12_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          int A486ForNumCol ,
                                          int AV39Fornumcol ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForNumCol, T1.ForPrdNor, T2.ForPrdDsc, T1.ForPrdCan, T3.PrdNom, T1.PrdNum, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPUNMEPR" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV49Wcproductosformulads_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Wcproductosformulads_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Wcproductosformulads_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcproductosformulads_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcproductosformulads_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Wcproductosformulads_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Wcproductosformulads_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Wcproductosformulads_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcproductosformulads_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcproductosformulads_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcproductosformulads_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcproductosformulads_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcproductosformulads_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcproductosformulads_11_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Wcproductosformulads_12_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
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
                  return conditional_P08KB2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 1 :
                  return conditional_P08KB3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 2 :
                  return conditional_P08KB4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KB4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
      }
   }

}

