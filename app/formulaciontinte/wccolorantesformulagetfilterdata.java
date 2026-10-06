package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccolorantesformulagetfilterdata extends GXProcedure
{
   public wccolorantesformulagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccolorantesformulagetfilterdata.class ), "" );
   }

   public wccolorantesformulagetfilterdata( int remoteHandle ,
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
      wccolorantesformulagetfilterdata.this.aP5 = new String[] {""};
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
      wccolorantesformulagetfilterdata.this.AV22DDOName = aP0;
      wccolorantesformulagetfilterdata.this.AV20SearchTxt = aP1;
      wccolorantesformulagetfilterdata.this.AV21SearchTxtTo = aP2;
      wccolorantesformulagetfilterdata.this.aP3 = aP3;
      wccolorantesformulagetfilterdata.this.aP4 = aP4;
      wccolorantesformulagetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV33Session.getValue("FormulacionTinte.WCColorantesFormulaGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCColorantesFormulaGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("FormulacionTinte.WCColorantesFormulaGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLLIN") == 0 )
         {
            AV10TFColLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFColLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV18TFForPrdDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV19TFForPrdDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCAN") == 0 )
         {
            AV16TFForCan = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFForCan_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOL") == 0 )
         {
            AV39Fornumcol = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV20SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV47Formulaciontinte_wccolorantesformulads_1_tfcollin = AV10TFColLin ;
      AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to = AV11TFColLin_To ;
      AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = AV12TFPrdNum ;
      AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = AV14TFPrdNom ;
      AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = AV18TFForPrdDsc ;
      AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV55Formulaciontinte_wccolorantesformulads_9_tfforcan = AV16TFForCan ;
      AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to = AV17TFForCan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV47Formulaciontinte_wccolorantesformulads_1_tfcollin) ,
                                           Short.valueOf(AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to) ,
                                           AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel ,
                                           AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ,
                                           AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel ,
                                           AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ,
                                           AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel ,
                                           AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ,
                                           AV55Formulaciontinte_wccolorantesformulads_9_tfforcan ,
                                           AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A488ForPrdDsc ,
                                           A481ForCan ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV39Fornumcol) ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum), 6, "%") ;
      lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom), 26, "%") ;
      lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc), 5, "%") ;
      /* Using cursor P08K72 */
      pr_default.execute(0, new Object[] {AV38Emprcod, Integer.valueOf(AV39Fornumcol), Short.valueOf(AV47Formulaciontinte_wccolorantesformulads_1_tfcollin), Short.valueOf(AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to), lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum, AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel, lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom, AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel, lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc, AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel, AV55Formulaciontinte_wccolorantesformulads_9_tfforcan, AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8K72 = false ;
         A490ForPrdUMe = P08K72_A490ForPrdUMe[0] ;
         A396EmprCod = P08K72_A396EmprCod[0] ;
         A719PrdNum = P08K72_A719PrdNum[0] ;
         A486ForNumCol = P08K72_A486ForNumCol[0] ;
         A481ForCan = P08K72_A481ForCan[0] ;
         A488ForPrdDsc = P08K72_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08K72_n488ForPrdDsc[0] ;
         A718PrdNom = P08K72_A718PrdNom[0] ;
         A309ColLin = P08K72_A309ColLin[0] ;
         A488ForPrdDsc = P08K72_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08K72_n488ForPrdDsc[0] ;
         A718PrdNom = P08K72_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08K72_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08K72_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8K72 = false ;
            A486ForNumCol = P08K72_A486ForNumCol[0] ;
            A309ColLin = P08K72_A309ColLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8K72 = true ;
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
         if ( ! brk8K72 )
         {
            brk8K72 = true ;
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
      AV47Formulaciontinte_wccolorantesformulads_1_tfcollin = AV10TFColLin ;
      AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to = AV11TFColLin_To ;
      AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = AV12TFPrdNum ;
      AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = AV14TFPrdNom ;
      AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = AV18TFForPrdDsc ;
      AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV55Formulaciontinte_wccolorantesformulads_9_tfforcan = AV16TFForCan ;
      AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to = AV17TFForCan_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV47Formulaciontinte_wccolorantesformulads_1_tfcollin) ,
                                           Short.valueOf(AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to) ,
                                           AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel ,
                                           AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ,
                                           AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel ,
                                           AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ,
                                           AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel ,
                                           AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ,
                                           AV55Formulaciontinte_wccolorantesformulads_9_tfforcan ,
                                           AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A488ForPrdDsc ,
                                           A481ForCan ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV39Fornumcol) ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum), 6, "%") ;
      lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom), 26, "%") ;
      lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc), 5, "%") ;
      /* Using cursor P08K73 */
      pr_default.execute(1, new Object[] {AV38Emprcod, Integer.valueOf(AV39Fornumcol), Short.valueOf(AV47Formulaciontinte_wccolorantesformulads_1_tfcollin), Short.valueOf(AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to), lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum, AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel, lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom, AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel, lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc, AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel, AV55Formulaciontinte_wccolorantesformulads_9_tfforcan, AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8K74 = false ;
         A490ForPrdUMe = P08K73_A490ForPrdUMe[0] ;
         A719PrdNum = P08K73_A719PrdNum[0] ;
         A396EmprCod = P08K73_A396EmprCod[0] ;
         A486ForNumCol = P08K73_A486ForNumCol[0] ;
         A481ForCan = P08K73_A481ForCan[0] ;
         A488ForPrdDsc = P08K73_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08K73_n488ForPrdDsc[0] ;
         A718PrdNom = P08K73_A718PrdNom[0] ;
         A309ColLin = P08K73_A309ColLin[0] ;
         A718PrdNom = P08K73_A718PrdNom[0] ;
         A488ForPrdDsc = P08K73_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08K73_n488ForPrdDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08K73_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08K73_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8K74 = false ;
            A486ForNumCol = P08K73_A486ForNumCol[0] ;
            A309ColLin = P08K73_A309ColLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8K74 = true ;
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
         if ( ! brk8K74 )
         {
            brk8K74 = true ;
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
      AV47Formulaciontinte_wccolorantesformulads_1_tfcollin = AV10TFColLin ;
      AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to = AV11TFColLin_To ;
      AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = AV12TFPrdNum ;
      AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = AV14TFPrdNom ;
      AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = AV18TFForPrdDsc ;
      AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV55Formulaciontinte_wccolorantesformulads_9_tfforcan = AV16TFForCan ;
      AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to = AV17TFForCan_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV47Formulaciontinte_wccolorantesformulads_1_tfcollin) ,
                                           Short.valueOf(AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to) ,
                                           AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel ,
                                           AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ,
                                           AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel ,
                                           AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ,
                                           AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel ,
                                           AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ,
                                           AV55Formulaciontinte_wccolorantesformulads_9_tfforcan ,
                                           AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A488ForPrdDsc ,
                                           A481ForCan ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV39Fornumcol) ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum), 6, "%") ;
      lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom), 26, "%") ;
      lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc), 5, "%") ;
      /* Using cursor P08K74 */
      pr_default.execute(2, new Object[] {AV38Emprcod, Integer.valueOf(AV39Fornumcol), Short.valueOf(AV47Formulaciontinte_wccolorantesformulads_1_tfcollin), Short.valueOf(AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to), lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum, AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel, lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom, AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel, lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc, AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel, AV55Formulaciontinte_wccolorantesformulads_9_tfforcan, AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8K76 = false ;
         A490ForPrdUMe = P08K74_A490ForPrdUMe[0] ;
         A396EmprCod = P08K74_A396EmprCod[0] ;
         A486ForNumCol = P08K74_A486ForNumCol[0] ;
         A481ForCan = P08K74_A481ForCan[0] ;
         A488ForPrdDsc = P08K74_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08K74_n488ForPrdDsc[0] ;
         A718PrdNom = P08K74_A718PrdNom[0] ;
         A719PrdNum = P08K74_A719PrdNum[0] ;
         A309ColLin = P08K74_A309ColLin[0] ;
         A488ForPrdDsc = P08K74_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08K74_n488ForPrdDsc[0] ;
         A718PrdNom = P08K74_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08K74_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08K74_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk8K76 = false ;
            A486ForNumCol = P08K74_A486ForNumCol[0] ;
            A309ColLin = P08K74_A309ColLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8K76 = true ;
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
         if ( ! brk8K76 )
         {
            brk8K76 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wccolorantesformulagetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = wccolorantesformulagetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = wccolorantesformulagetfilterdata.this.AV31OptionIndexesJson;
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
      AV18TFForPrdDsc = "" ;
      AV19TFForPrdDsc_Sel = "" ;
      AV16TFForCan = DecimalUtil.ZERO ;
      AV17TFForCan_To = DecimalUtil.ZERO ;
      AV38Emprcod = "" ;
      A719PrdNum = "" ;
      AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = "" ;
      AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel = "" ;
      AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = "" ;
      AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel = "" ;
      AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = "" ;
      AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel = "" ;
      AV55Formulaciontinte_wccolorantesformulads_9_tfforcan = DecimalUtil.ZERO ;
      AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum = "" ;
      lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom = "" ;
      lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc = "" ;
      A718PrdNom = "" ;
      A488ForPrdDsc = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08K72_A490ForPrdUMe = new byte[1] ;
      P08K72_A396EmprCod = new String[] {""} ;
      P08K72_A719PrdNum = new String[] {""} ;
      P08K72_A486ForNumCol = new int[1] ;
      P08K72_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08K72_A488ForPrdDsc = new String[] {""} ;
      P08K72_n488ForPrdDsc = new boolean[] {false} ;
      P08K72_A718PrdNom = new String[] {""} ;
      P08K72_A309ColLin = new short[1] ;
      AV24Option = "" ;
      P08K73_A490ForPrdUMe = new byte[1] ;
      P08K73_A719PrdNum = new String[] {""} ;
      P08K73_A396EmprCod = new String[] {""} ;
      P08K73_A486ForNumCol = new int[1] ;
      P08K73_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08K73_A488ForPrdDsc = new String[] {""} ;
      P08K73_n488ForPrdDsc = new boolean[] {false} ;
      P08K73_A718PrdNom = new String[] {""} ;
      P08K73_A309ColLin = new short[1] ;
      P08K74_A490ForPrdUMe = new byte[1] ;
      P08K74_A396EmprCod = new String[] {""} ;
      P08K74_A486ForNumCol = new int[1] ;
      P08K74_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08K74_A488ForPrdDsc = new String[] {""} ;
      P08K74_n488ForPrdDsc = new boolean[] {false} ;
      P08K74_A718PrdNom = new String[] {""} ;
      P08K74_A719PrdNum = new String[] {""} ;
      P08K74_A309ColLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wccolorantesformulagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08K72_A490ForPrdUMe, P08K72_A396EmprCod, P08K72_A719PrdNum, P08K72_A486ForNumCol, P08K72_A481ForCan, P08K72_A488ForPrdDsc, P08K72_n488ForPrdDsc, P08K72_A718PrdNom, P08K72_A309ColLin
            }
            , new Object[] {
            P08K73_A490ForPrdUMe, P08K73_A719PrdNum, P08K73_A396EmprCod, P08K73_A486ForNumCol, P08K73_A481ForCan, P08K73_A488ForPrdDsc, P08K73_n488ForPrdDsc, P08K73_A718PrdNom, P08K73_A309ColLin
            }
            , new Object[] {
            P08K74_A490ForPrdUMe, P08K74_A396EmprCod, P08K74_A486ForNumCol, P08K74_A481ForCan, P08K74_A488ForPrdDsc, P08K74_n488ForPrdDsc, P08K74_A718PrdNom, P08K74_A719PrdNum, P08K74_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private short AV10TFColLin ;
   private short AV11TFColLin_To ;
   private short AV47Formulaciontinte_wccolorantesformulads_1_tfcollin ;
   private short AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV39Fornumcol ;
   private int A486ForNumCol ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV16TFForCan ;
   private java.math.BigDecimal AV17TFForCan_To ;
   private java.math.BigDecimal AV55Formulaciontinte_wccolorantesformulads_9_tfforcan ;
   private java.math.BigDecimal AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to ;
   private java.math.BigDecimal A481ForCan ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV18TFForPrdDsc ;
   private String AV19TFForPrdDsc_Sel ;
   private String AV38Emprcod ;
   private String A719PrdNum ;
   private String AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ;
   private String AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel ;
   private String AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ;
   private String AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel ;
   private String AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ;
   private String AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ;
   private String lV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ;
   private String lV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8K72 ;
   private boolean n488ForPrdDsc ;
   private boolean brk8K74 ;
   private boolean brk8K76 ;
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
   private byte[] P08K72_A490ForPrdUMe ;
   private String[] P08K72_A396EmprCod ;
   private String[] P08K72_A719PrdNum ;
   private int[] P08K72_A486ForNumCol ;
   private java.math.BigDecimal[] P08K72_A481ForCan ;
   private String[] P08K72_A488ForPrdDsc ;
   private boolean[] P08K72_n488ForPrdDsc ;
   private String[] P08K72_A718PrdNom ;
   private short[] P08K72_A309ColLin ;
   private byte[] P08K73_A490ForPrdUMe ;
   private String[] P08K73_A719PrdNum ;
   private String[] P08K73_A396EmprCod ;
   private int[] P08K73_A486ForNumCol ;
   private java.math.BigDecimal[] P08K73_A481ForCan ;
   private String[] P08K73_A488ForPrdDsc ;
   private boolean[] P08K73_n488ForPrdDsc ;
   private String[] P08K73_A718PrdNom ;
   private short[] P08K73_A309ColLin ;
   private byte[] P08K74_A490ForPrdUMe ;
   private String[] P08K74_A396EmprCod ;
   private int[] P08K74_A486ForNumCol ;
   private java.math.BigDecimal[] P08K74_A481ForCan ;
   private String[] P08K74_A488ForPrdDsc ;
   private boolean[] P08K74_n488ForPrdDsc ;
   private String[] P08K74_A718PrdNom ;
   private String[] P08K74_A719PrdNum ;
   private short[] P08K74_A309ColLin ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wccolorantesformulagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08K72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV47Formulaciontinte_wccolorantesformulads_1_tfcollin ,
                                          short AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to ,
                                          String AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel ,
                                          String AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ,
                                          String AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel ,
                                          String AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ,
                                          String AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel ,
                                          String AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ,
                                          java.math.BigDecimal AV55Formulaciontinte_wccolorantesformulads_9_tfforcan ,
                                          java.math.BigDecimal AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A481ForCan ,
                                          int A486ForNumCol ,
                                          int AV39Fornumcol ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.PrdNum, T1.ForNumCol, T1.ForCan, T2.ForPrdDsc, T3.PrdNom, T1.ColLin FROM ((TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV47Formulaciontinte_wccolorantesformulads_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_wccolorantesformulads_9_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08K73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV47Formulaciontinte_wccolorantesformulads_1_tfcollin ,
                                          short AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to ,
                                          String AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel ,
                                          String AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ,
                                          String AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel ,
                                          String AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ,
                                          String AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel ,
                                          String AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ,
                                          java.math.BigDecimal AV55Formulaciontinte_wccolorantesformulads_9_tfforcan ,
                                          java.math.BigDecimal AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A481ForCan ,
                                          int A486ForNumCol ,
                                          int AV39Fornumcol ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.PrdNum, T1.EmprCod, T1.ForNumCol, T1.ForCan, T3.ForPrdDsc, T2.PrdNom, T1.ColLin FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV47Formulaciontinte_wccolorantesformulads_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_wccolorantesformulads_9_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08K74( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV47Formulaciontinte_wccolorantesformulads_1_tfcollin ,
                                          short AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to ,
                                          String AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel ,
                                          String AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum ,
                                          String AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel ,
                                          String AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom ,
                                          String AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel ,
                                          String AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc ,
                                          java.math.BigDecimal AV55Formulaciontinte_wccolorantesformulads_9_tfforcan ,
                                          java.math.BigDecimal AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A481ForCan ,
                                          int A486ForNumCol ,
                                          int AV39Fornumcol ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForNumCol, T1.ForCan, T2.ForPrdDsc, T3.PrdNom, T1.PrdNum, T1.ColLin FROM ((TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV47Formulaciontinte_wccolorantesformulads_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV48Formulaciontinte_wccolorantesformulads_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_wccolorantesformulads_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_wccolorantesformulads_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_wccolorantesformulads_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_wccolorantesformulads_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_wccolorantesformulads_7_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_wccolorantesformulads_8_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_wccolorantesformulads_9_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Formulaciontinte_wccolorantesformulads_10_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
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
                  return conditional_P08K72(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P08K73(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 2 :
                  return conditional_P08K74(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08K72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08K73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08K74", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               return;
      }
   }

}

