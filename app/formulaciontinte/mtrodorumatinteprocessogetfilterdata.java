package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mtrodorumatinteprocessogetfilterdata extends GXProcedure
{
   public mtrodorumatinteprocessogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtrodorumatinteprocessogetfilterdata.class ), "" );
   }

   public mtrodorumatinteprocessogetfilterdata( int remoteHandle ,
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
      mtrodorumatinteprocessogetfilterdata.this.aP5 = new String[] {""};
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
      mtrodorumatinteprocessogetfilterdata.this.AV34DDOName = aP0;
      mtrodorumatinteprocessogetfilterdata.this.AV35SearchTxt = aP1;
      mtrodorumatinteprocessogetfilterdata.this.AV36SearchTxtTo = aP2;
      mtrodorumatinteprocessogetfilterdata.this.aP3 = aP3;
      mtrodorumatinteprocessogetfilterdata.this.aP4 = aP4;
      mtrodorumatinteprocessogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PROFORCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PROFORDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PROFORFR") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORFROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("FormulacionTinte.MtroDorumaTinteProcessoGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.MtroDorumaTinteProcessoGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FormulacionTinte.MtroDorumaTinteProcessoGridState"), null, null);
      }
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORL") == 0 )
         {
            AV46TFProForL = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFProForL_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV75TFProForCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV76TFProForCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV56TFProForDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV57TFProForDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORFR") == 0 )
         {
            AV58TFProForFR = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORFR_SEL") == 0 )
         {
            AV59TFProForFR_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORRBN") == 0 )
         {
            AV62TFProForrbn = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFProForrbn_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORFABS") == 0 )
         {
            AV71TFProforFabs = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV72TFProforFabs_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFONPRG") == 0 )
         {
            AV60TFProFoNPrg = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFProFoNPrg_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODE") == 0 )
         {
            Gx_mode = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV40CliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV41ForSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV42ForColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV43ForColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV44TipColCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOL") == 0 )
         {
            AV73ForNumCol = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORRELBAN") == 0 )
         {
            AV74ForRelBan = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV75TFProForCod = AV35SearchTxt ;
      AV76TFProForCod_Sel = "" ;
      AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV46TFProForL ;
      AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV47TFProForL_To ;
      AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV75TFProForCod ;
      AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV76TFProForCod_Sel ;
      AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV56TFProForDsc ;
      AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV57TFProForDsc_Sel ;
      AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV58TFProForFR ;
      AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV59TFProForFR_Sel ;
      AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV62TFProForrbn ;
      AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV63TFProForrbn_To ;
      AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV71TFProforFabs ;
      AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV72TFProforFabs_To ;
      AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV60TFProFoNPrg ;
      AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV61TFProFoNPrg_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) ,
                                           Short.valueOf(AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) ,
                                           AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                           AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                           AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                           AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                           AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                           AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                           AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                           AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                           AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                           AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                           Integer.valueOf(AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) ,
                                           Integer.valueOf(AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) ,
                                           Short.valueOf(A1160ProForL) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A6549ProForFR ,
                                           A8656ProForrbn ,
                                           A14198ProforFabs ,
                                           Integer.valueOf(A7802ProFoNPrg) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV40CliCod) ,
                                           A494ForSer ,
                                           AV41ForSer ,
                                           A482ForColNom ,
                                           AV42ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Integer.valueOf(AV43ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(AV44TipColCod) ,
                                           AV45EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod), 6, "%") ;
      lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc), 30, "%") ;
      lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr), 1, "%") ;
      /* Using cursor P0ADJ2 */
      pr_default.execute(0, new Object[] {AV45EmprCod, Integer.valueOf(AV40CliCod), AV41ForSer, AV42ForColNom, Integer.valueOf(AV43ForColNum), Byte.valueOf(AV44TipColCod), Short.valueOf(AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl), Short.valueOf(AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to), lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod, AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel, lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc, AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel, lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr, AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel, AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn, AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to, AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs, AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to, Integer.valueOf(AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg), Integer.valueOf(AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkADJ2 = false ;
         A396EmprCod = P0ADJ2_A396EmprCod[0] ;
         A764ProForCod = P0ADJ2_A764ProForCod[0] ;
         A831TipColCod = P0ADJ2_A831TipColCod[0] ;
         A483ForColNum = P0ADJ2_A483ForColNum[0] ;
         A482ForColNom = P0ADJ2_A482ForColNom[0] ;
         A494ForSer = P0ADJ2_A494ForSer[0] ;
         A252CliCod = P0ADJ2_A252CliCod[0] ;
         A7802ProFoNPrg = P0ADJ2_A7802ProFoNPrg[0] ;
         A14198ProforFabs = P0ADJ2_A14198ProforFabs[0] ;
         A8656ProForrbn = P0ADJ2_A8656ProForrbn[0] ;
         A6549ProForFR = P0ADJ2_A6549ProForFR[0] ;
         A766ProForDsc = P0ADJ2_A766ProForDsc[0] ;
         A1160ProForL = P0ADJ2_A1160ProForL[0] ;
         A766ProForDsc = P0ADJ2_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ADJ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ADJ2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brkADJ2 = false ;
            A831TipColCod = P0ADJ2_A831TipColCod[0] ;
            A483ForColNum = P0ADJ2_A483ForColNum[0] ;
            A482ForColNom = P0ADJ2_A482ForColNom[0] ;
            A494ForSer = P0ADJ2_A494ForSer[0] ;
            A252CliCod = P0ADJ2_A252CliCod[0] ;
            A1160ProForL = P0ADJ2_A1160ProForL[0] ;
            AV28count = (long)(AV28count+1) ;
            brkADJ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV23Option = A764ProForCod ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADJ2 )
         {
            brkADJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV56TFProForDsc = AV35SearchTxt ;
      AV57TFProForDsc_Sel = "" ;
      AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV46TFProForL ;
      AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV47TFProForL_To ;
      AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV75TFProForCod ;
      AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV76TFProForCod_Sel ;
      AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV56TFProForDsc ;
      AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV57TFProForDsc_Sel ;
      AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV58TFProForFR ;
      AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV59TFProForFR_Sel ;
      AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV62TFProForrbn ;
      AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV63TFProForrbn_To ;
      AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV71TFProforFabs ;
      AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV72TFProforFabs_To ;
      AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV60TFProFoNPrg ;
      AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV61TFProFoNPrg_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) ,
                                           Short.valueOf(AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) ,
                                           AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                           AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                           AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                           AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                           AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                           AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                           AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                           AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                           AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                           AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                           Integer.valueOf(AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) ,
                                           Integer.valueOf(AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) ,
                                           Short.valueOf(A1160ProForL) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A6549ProForFR ,
                                           A8656ProForrbn ,
                                           A14198ProforFabs ,
                                           Integer.valueOf(A7802ProFoNPrg) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV40CliCod) ,
                                           A494ForSer ,
                                           AV41ForSer ,
                                           A482ForColNom ,
                                           AV42ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Integer.valueOf(AV43ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(AV44TipColCod) ,
                                           AV45EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod), 6, "%") ;
      lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc), 30, "%") ;
      lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr), 1, "%") ;
      /* Using cursor P0ADJ3 */
      pr_default.execute(1, new Object[] {AV45EmprCod, Integer.valueOf(AV40CliCod), AV41ForSer, AV42ForColNom, Integer.valueOf(AV43ForColNum), Byte.valueOf(AV44TipColCod), Short.valueOf(AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl), Short.valueOf(AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to), lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod, AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel, lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc, AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel, lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr, AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel, AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn, AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to, AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs, AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to, Integer.valueOf(AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg), Integer.valueOf(AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkADJ4 = false ;
         A764ProForCod = P0ADJ3_A764ProForCod[0] ;
         A396EmprCod = P0ADJ3_A396EmprCod[0] ;
         A831TipColCod = P0ADJ3_A831TipColCod[0] ;
         A483ForColNum = P0ADJ3_A483ForColNum[0] ;
         A482ForColNom = P0ADJ3_A482ForColNom[0] ;
         A494ForSer = P0ADJ3_A494ForSer[0] ;
         A252CliCod = P0ADJ3_A252CliCod[0] ;
         A7802ProFoNPrg = P0ADJ3_A7802ProFoNPrg[0] ;
         A14198ProforFabs = P0ADJ3_A14198ProforFabs[0] ;
         A8656ProForrbn = P0ADJ3_A8656ProForrbn[0] ;
         A6549ProForFR = P0ADJ3_A6549ProForFR[0] ;
         A766ProForDsc = P0ADJ3_A766ProForDsc[0] ;
         A1160ProForL = P0ADJ3_A1160ProForL[0] ;
         A766ProForDsc = P0ADJ3_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ADJ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ADJ3_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brkADJ4 = false ;
            A831TipColCod = P0ADJ3_A831TipColCod[0] ;
            A483ForColNum = P0ADJ3_A483ForColNum[0] ;
            A482ForColNom = P0ADJ3_A482ForColNom[0] ;
            A494ForSer = P0ADJ3_A494ForSer[0] ;
            A252CliCod = P0ADJ3_A252CliCod[0] ;
            A1160ProForL = P0ADJ3_A1160ProForL[0] ;
            AV28count = (long)(AV28count+1) ;
            brkADJ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV23Option = A766ProForDsc ;
            AV22InsertIndex = 1 ;
            while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
            {
               AV22InsertIndex = (int)(AV22InsertIndex+1) ;
            }
            AV24Options.add(AV23Option, AV22InsertIndex);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADJ4 )
         {
            brkADJ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROFORFROPTIONS' Routine */
      returnInSub = false ;
      AV58TFProForFR = AV35SearchTxt ;
      AV59TFProForFR_Sel = "" ;
      AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV46TFProForL ;
      AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV47TFProForL_To ;
      AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV75TFProForCod ;
      AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV76TFProForCod_Sel ;
      AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV56TFProForDsc ;
      AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV57TFProForDsc_Sel ;
      AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV58TFProForFR ;
      AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV59TFProForFR_Sel ;
      AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV62TFProForrbn ;
      AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV63TFProForrbn_To ;
      AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV71TFProforFabs ;
      AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV72TFProforFabs_To ;
      AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV60TFProFoNPrg ;
      AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV61TFProFoNPrg_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) ,
                                           Short.valueOf(AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) ,
                                           AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                           AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                           AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                           AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                           AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                           AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                           AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                           AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                           AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                           AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                           Integer.valueOf(AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) ,
                                           Integer.valueOf(AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) ,
                                           Short.valueOf(A1160ProForL) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A6549ProForFR ,
                                           A8656ProForrbn ,
                                           A14198ProforFabs ,
                                           Integer.valueOf(A7802ProFoNPrg) ,
                                           A396EmprCod ,
                                           AV45EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV40CliCod) ,
                                           A494ForSer ,
                                           AV41ForSer ,
                                           A482ForColNom ,
                                           AV42ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Integer.valueOf(AV43ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(AV44TipColCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod), 6, "%") ;
      lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc), 30, "%") ;
      lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr), 1, "%") ;
      /* Using cursor P0ADJ4 */
      pr_default.execute(2, new Object[] {AV45EmprCod, Integer.valueOf(AV40CliCod), AV41ForSer, AV42ForColNom, Integer.valueOf(AV43ForColNum), Byte.valueOf(AV44TipColCod), Short.valueOf(AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl), Short.valueOf(AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to), lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod, AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel, lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc, AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel, lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr, AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel, AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn, AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to, AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs, AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to, Integer.valueOf(AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg), Integer.valueOf(AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkADJ6 = false ;
         A396EmprCod = P0ADJ4_A396EmprCod[0] ;
         A252CliCod = P0ADJ4_A252CliCod[0] ;
         A494ForSer = P0ADJ4_A494ForSer[0] ;
         A482ForColNom = P0ADJ4_A482ForColNom[0] ;
         A483ForColNum = P0ADJ4_A483ForColNum[0] ;
         A831TipColCod = P0ADJ4_A831TipColCod[0] ;
         A6549ProForFR = P0ADJ4_A6549ProForFR[0] ;
         A7802ProFoNPrg = P0ADJ4_A7802ProFoNPrg[0] ;
         A14198ProforFabs = P0ADJ4_A14198ProforFabs[0] ;
         A8656ProForrbn = P0ADJ4_A8656ProForrbn[0] ;
         A766ProForDsc = P0ADJ4_A766ProForDsc[0] ;
         A764ProForCod = P0ADJ4_A764ProForCod[0] ;
         A1160ProForL = P0ADJ4_A1160ProForL[0] ;
         A766ProForDsc = P0ADJ4_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ADJ4_A6549ProForFR[0], A6549ProForFR) == 0 ) )
         {
            brkADJ6 = false ;
            A396EmprCod = P0ADJ4_A396EmprCod[0] ;
            A252CliCod = P0ADJ4_A252CliCod[0] ;
            A494ForSer = P0ADJ4_A494ForSer[0] ;
            A482ForColNom = P0ADJ4_A482ForColNom[0] ;
            A483ForColNum = P0ADJ4_A483ForColNum[0] ;
            A831TipColCod = P0ADJ4_A831TipColCod[0] ;
            A1160ProForL = P0ADJ4_A1160ProForL[0] ;
            AV28count = (long)(AV28count+1) ;
            brkADJ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A6549ProForFR)==0) )
         {
            AV23Option = A6549ProForFR ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADJ6 )
         {
            brkADJ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mtrodorumatinteprocessogetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = mtrodorumatinteprocessogetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = mtrodorumatinteprocessogetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV75TFProForCod = "" ;
      AV76TFProForCod_Sel = "" ;
      AV56TFProForDsc = "" ;
      AV57TFProForDsc_Sel = "" ;
      AV58TFProForFR = "" ;
      AV59TFProForFR_Sel = "" ;
      AV62TFProForrbn = DecimalUtil.ZERO ;
      AV63TFProForrbn_To = DecimalUtil.ZERO ;
      AV71TFProforFabs = DecimalUtil.ZERO ;
      AV72TFProforFabs_To = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      AV41ForSer = "" ;
      AV42ForColNom = "" ;
      AV74ForRelBan = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = "" ;
      AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = "" ;
      AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = "" ;
      AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = "" ;
      AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = "" ;
      AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = "" ;
      AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = DecimalUtil.ZERO ;
      AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = DecimalUtil.ZERO ;
      AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = DecimalUtil.ZERO ;
      AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = "" ;
      lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = "" ;
      lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = "" ;
      A766ProForDsc = "" ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A14198ProforFabs = DecimalUtil.ZERO ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      AV45EmprCod = "" ;
      A396EmprCod = "" ;
      P0ADJ2_A396EmprCod = new String[] {""} ;
      P0ADJ2_A764ProForCod = new String[] {""} ;
      P0ADJ2_A831TipColCod = new byte[1] ;
      P0ADJ2_A483ForColNum = new int[1] ;
      P0ADJ2_A482ForColNom = new String[] {""} ;
      P0ADJ2_A494ForSer = new String[] {""} ;
      P0ADJ2_A252CliCod = new int[1] ;
      P0ADJ2_A7802ProFoNPrg = new int[1] ;
      P0ADJ2_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADJ2_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADJ2_A6549ProForFR = new String[] {""} ;
      P0ADJ2_A766ProForDsc = new String[] {""} ;
      P0ADJ2_A1160ProForL = new short[1] ;
      AV23Option = "" ;
      P0ADJ3_A764ProForCod = new String[] {""} ;
      P0ADJ3_A396EmprCod = new String[] {""} ;
      P0ADJ3_A831TipColCod = new byte[1] ;
      P0ADJ3_A483ForColNum = new int[1] ;
      P0ADJ3_A482ForColNom = new String[] {""} ;
      P0ADJ3_A494ForSer = new String[] {""} ;
      P0ADJ3_A252CliCod = new int[1] ;
      P0ADJ3_A7802ProFoNPrg = new int[1] ;
      P0ADJ3_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADJ3_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADJ3_A6549ProForFR = new String[] {""} ;
      P0ADJ3_A766ProForDsc = new String[] {""} ;
      P0ADJ3_A1160ProForL = new short[1] ;
      P0ADJ4_A396EmprCod = new String[] {""} ;
      P0ADJ4_A252CliCod = new int[1] ;
      P0ADJ4_A494ForSer = new String[] {""} ;
      P0ADJ4_A482ForColNom = new String[] {""} ;
      P0ADJ4_A483ForColNum = new int[1] ;
      P0ADJ4_A831TipColCod = new byte[1] ;
      P0ADJ4_A6549ProForFR = new String[] {""} ;
      P0ADJ4_A7802ProFoNPrg = new int[1] ;
      P0ADJ4_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADJ4_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADJ4_A766ProForDsc = new String[] {""} ;
      P0ADJ4_A764ProForCod = new String[] {""} ;
      P0ADJ4_A1160ProForL = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtrodorumatinteprocessogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADJ2_A396EmprCod, P0ADJ2_A764ProForCod, P0ADJ2_A831TipColCod, P0ADJ2_A483ForColNum, P0ADJ2_A482ForColNom, P0ADJ2_A494ForSer, P0ADJ2_A252CliCod, P0ADJ2_A7802ProFoNPrg, P0ADJ2_A14198ProforFabs, P0ADJ2_A8656ProForrbn,
            P0ADJ2_A6549ProForFR, P0ADJ2_A766ProForDsc, P0ADJ2_A1160ProForL
            }
            , new Object[] {
            P0ADJ3_A764ProForCod, P0ADJ3_A396EmprCod, P0ADJ3_A831TipColCod, P0ADJ3_A483ForColNum, P0ADJ3_A482ForColNom, P0ADJ3_A494ForSer, P0ADJ3_A252CliCod, P0ADJ3_A7802ProFoNPrg, P0ADJ3_A14198ProforFabs, P0ADJ3_A8656ProForrbn,
            P0ADJ3_A6549ProForFR, P0ADJ3_A766ProForDsc, P0ADJ3_A1160ProForL
            }
            , new Object[] {
            P0ADJ4_A396EmprCod, P0ADJ4_A252CliCod, P0ADJ4_A494ForSer, P0ADJ4_A482ForColNom, P0ADJ4_A483ForColNum, P0ADJ4_A831TipColCod, P0ADJ4_A6549ProForFR, P0ADJ4_A7802ProFoNPrg, P0ADJ4_A14198ProforFabs, P0ADJ4_A8656ProForrbn,
            P0ADJ4_A766ProForDsc, P0ADJ4_A764ProForCod, P0ADJ4_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44TipColCod ;
   private byte A831TipColCod ;
   private short AV46TFProForL ;
   private short AV47TFProForL_To ;
   private short AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl ;
   private short AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV79GXV1 ;
   private int AV60TFProFoNPrg ;
   private int AV61TFProFoNPrg_To ;
   private int AV40CliCod ;
   private int AV43ForColNum ;
   private int AV73ForNumCol ;
   private int AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg ;
   private int AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to ;
   private int A7802ProFoNPrg ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV22InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV62TFProForrbn ;
   private java.math.BigDecimal AV63TFProForrbn_To ;
   private java.math.BigDecimal AV71TFProforFabs ;
   private java.math.BigDecimal AV72TFProforFabs_To ;
   private java.math.BigDecimal AV74ForRelBan ;
   private java.math.BigDecimal AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ;
   private java.math.BigDecimal AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ;
   private java.math.BigDecimal AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ;
   private java.math.BigDecimal AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal A14198ProforFabs ;
   private String AV75TFProForCod ;
   private String AV76TFProForCod_Sel ;
   private String AV56TFProForDsc ;
   private String AV57TFProForDsc_Sel ;
   private String AV58TFProForFR ;
   private String AV59TFProForFR_Sel ;
   private String Gx_mode ;
   private String AV41ForSer ;
   private String AV42ForColNom ;
   private String A764ProForCod ;
   private String AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ;
   private String AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ;
   private String AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ;
   private String AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ;
   private String AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ;
   private String AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ;
   private String scmdbuf ;
   private String lV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ;
   private String lV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ;
   private String lV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ;
   private String A766ProForDsc ;
   private String A6549ProForFR ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV45EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkADJ2 ;
   private boolean brkADJ4 ;
   private boolean brkADJ6 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADJ2_A396EmprCod ;
   private String[] P0ADJ2_A764ProForCod ;
   private byte[] P0ADJ2_A831TipColCod ;
   private int[] P0ADJ2_A483ForColNum ;
   private String[] P0ADJ2_A482ForColNom ;
   private String[] P0ADJ2_A494ForSer ;
   private int[] P0ADJ2_A252CliCod ;
   private int[] P0ADJ2_A7802ProFoNPrg ;
   private java.math.BigDecimal[] P0ADJ2_A14198ProforFabs ;
   private java.math.BigDecimal[] P0ADJ2_A8656ProForrbn ;
   private String[] P0ADJ2_A6549ProForFR ;
   private String[] P0ADJ2_A766ProForDsc ;
   private short[] P0ADJ2_A1160ProForL ;
   private String[] P0ADJ3_A764ProForCod ;
   private String[] P0ADJ3_A396EmprCod ;
   private byte[] P0ADJ3_A831TipColCod ;
   private int[] P0ADJ3_A483ForColNum ;
   private String[] P0ADJ3_A482ForColNom ;
   private String[] P0ADJ3_A494ForSer ;
   private int[] P0ADJ3_A252CliCod ;
   private int[] P0ADJ3_A7802ProFoNPrg ;
   private java.math.BigDecimal[] P0ADJ3_A14198ProforFabs ;
   private java.math.BigDecimal[] P0ADJ3_A8656ProForrbn ;
   private String[] P0ADJ3_A6549ProForFR ;
   private String[] P0ADJ3_A766ProForDsc ;
   private short[] P0ADJ3_A1160ProForL ;
   private String[] P0ADJ4_A396EmprCod ;
   private int[] P0ADJ4_A252CliCod ;
   private String[] P0ADJ4_A494ForSer ;
   private String[] P0ADJ4_A482ForColNom ;
   private int[] P0ADJ4_A483ForColNum ;
   private byte[] P0ADJ4_A831TipColCod ;
   private String[] P0ADJ4_A6549ProForFR ;
   private int[] P0ADJ4_A7802ProFoNPrg ;
   private java.math.BigDecimal[] P0ADJ4_A14198ProforFabs ;
   private java.math.BigDecimal[] P0ADJ4_A8656ProForrbn ;
   private String[] P0ADJ4_A766ProForDsc ;
   private String[] P0ADJ4_A764ProForCod ;
   private short[] P0ADJ4_A1160ProForL ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class mtrodorumatinteprocessogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl ,
                                          short AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to ,
                                          String AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                          String AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                          String AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                          String AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                          String AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                          String AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                          java.math.BigDecimal AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                          java.math.BigDecimal AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                          java.math.BigDecimal AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                          java.math.BigDecimal AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                          int AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg ,
                                          int AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A6549ProForFR ,
                                          java.math.BigDecimal A8656ProForrbn ,
                                          java.math.BigDecimal A14198ProforFabs ,
                                          int A7802ProFoNPrg ,
                                          int A252CliCod ,
                                          int AV40CliCod ,
                                          String A494ForSer ,
                                          String AV41ForSer ,
                                          String A482ForColNom ,
                                          String AV42ForColNom ,
                                          int A483ForColNum ,
                                          int AV43ForColNum ,
                                          byte A831TipColCod ,
                                          byte AV44TipColCod ,
                                          String AV45EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ProFoNPrg, T1.ProforFabs, T1.ProForrbn, T1.ProForFR, T2.ProForDsc," ;
      scmdbuf += " T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ForSer = ?)");
      addWhere(sWhereString, "(T1.ForColNom = ?)");
      addWhere(sWhereString, "(T1.ForColNum = ?)");
      addWhere(sWhereString, "(T1.TipColCod = ?)");
      if ( ! (0==AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForFR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForFR = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ADJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl ,
                                          short AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to ,
                                          String AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                          String AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                          String AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                          String AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                          String AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                          String AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                          java.math.BigDecimal AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                          java.math.BigDecimal AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                          java.math.BigDecimal AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                          java.math.BigDecimal AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                          int AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg ,
                                          int AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A6549ProForFR ,
                                          java.math.BigDecimal A8656ProForrbn ,
                                          java.math.BigDecimal A14198ProforFabs ,
                                          int A7802ProFoNPrg ,
                                          int A252CliCod ,
                                          int AV40CliCod ,
                                          String A494ForSer ,
                                          String AV41ForSer ,
                                          String A482ForColNom ,
                                          String AV42ForColNom ,
                                          int A483ForColNum ,
                                          int AV43ForColNum ,
                                          byte A831TipColCod ,
                                          byte AV44TipColCod ,
                                          String AV45EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ProFoNPrg, T1.ProforFabs, T1.ProForrbn, T1.ProForFR, T2.ProForDsc," ;
      scmdbuf += " T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ForSer = ?)");
      addWhere(sWhereString, "(T1.ForColNom = ?)");
      addWhere(sWhereString, "(T1.ForColNum = ?)");
      addWhere(sWhereString, "(T1.TipColCod = ?)");
      if ( ! (0==AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForFR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForFR = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ADJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl ,
                                          short AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to ,
                                          String AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                          String AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                          String AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                          String AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                          String AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                          String AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                          java.math.BigDecimal AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                          java.math.BigDecimal AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                          java.math.BigDecimal AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                          java.math.BigDecimal AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                          int AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg ,
                                          int AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A6549ProForFR ,
                                          java.math.BigDecimal A8656ProForrbn ,
                                          java.math.BigDecimal A14198ProforFabs ,
                                          int A7802ProFoNPrg ,
                                          String A396EmprCod ,
                                          String AV45EmprCod ,
                                          int A252CliCod ,
                                          int AV40CliCod ,
                                          String A494ForSer ,
                                          String AV41ForSer ,
                                          String A482ForColNom ,
                                          String AV42ForColNom ,
                                          int A483ForColNum ,
                                          int AV43ForColNum ,
                                          byte A831TipColCod ,
                                          byte AV44TipColCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForFR, T1.ProFoNPrg, T1.ProforFabs, T1.ProForrbn, T2.ProForDsc, T1.ProForCod," ;
      scmdbuf += " T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ForSer = ?)");
      addWhere(sWhereString, "(T1.ForColNom = ?)");
      addWhere(sWhereString, "(T1.ForColNum = ?)");
      addWhere(sWhereString, "(T1.TipColCod = ?)");
      if ( ! (0==AV82Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForFR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForFR = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForFR" ;
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
                  return conditional_P0ADJ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P0ADJ3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_P0ADJ4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((short[]) buf[12])[0] = rslt.getShort(13);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               return;
      }
   }

}

