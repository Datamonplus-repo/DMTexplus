package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesoquimico_3getfilterdata extends GXProcedure
{
   public procesoquimico_3getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_3getfilterdata.class ), "" );
   }

   public procesoquimico_3getfilterdata( int remoteHandle ,
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
      procesoquimico_3getfilterdata.this.aP5 = new String[] {""};
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
      procesoquimico_3getfilterdata.this.AV42DDOName = aP0;
      procesoquimico_3getfilterdata.this.AV43SearchTxt = aP1;
      procesoquimico_3getfilterdata.this.AV44SearchTxtTo = aP2;
      procesoquimico_3getfilterdata.this.aP3 = aP3;
      procesoquimico_3getfilterdata.this.aP4 = aP4;
      procesoquimico_3getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_PROFORPRD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORPRDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_PROFORDES") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDESOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FORPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_PROFORCLA") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCLAOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_PROFORCLV") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCLVOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV45OptionsJson = AV32Options.toJSonString(false) ;
      AV46OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV35OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("FormulacionTinte.ProcesoQuimico_3GridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProcesoQuimico_3GridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("FormulacionTinte.ProcesoQuimico_3GridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORLIN") == 0 )
         {
            AV10TFProForLin = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFProForLin_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORPRD") == 0 )
         {
            AV12TFProForPrd = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORPRD_SEL") == 0 )
         {
            AV13TFProForPrd_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDES") == 0 )
         {
            AV14TFProForDes = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDES_SEL") == 0 )
         {
            AV15TFProForDes_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCAN") == 0 )
         {
            AV20TFProForCan = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFProForCan_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV18TFForPrdDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV19TFForPrdDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORNRO") == 0 )
         {
            AV22TFProForNro = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFProForNro_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTNQ") == 0 )
         {
            AV24TFProForTnq = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFProForTnq_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA") == 0 )
         {
            AV26TFProForCla = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA_SEL") == 0 )
         {
            AV27TFProForCla_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV") == 0 )
         {
            AV28TFProForClv = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV_SEL") == 0 )
         {
            AV29TFProForClv_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV49Proforcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORDSC") == 0 )
         {
            AV50ProForDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORDSC2") == 0 )
         {
            AV51ProForDsc2 = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORPRDOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForPrd = AV43SearchTxt ;
      AV13TFProForPrd_Sel = "" ;
      AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV10TFProForLin ;
      AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV11TFProForLin_To ;
      AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV12TFProForPrd ;
      AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV14TFProForDes ;
      AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV20TFProForCan ;
      AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV21TFProForCan_To ;
      AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV22TFProForNro ;
      AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV23TFProForNro_To ;
      AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV24TFProForTnq ;
      AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV25TFProForTnq_To ;
      AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV26TFProForCla ;
      AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV27TFProForCla_Sel ;
      AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV28TFProForClv ;
      AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV29TFProForClv_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) ,
                                           Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) ,
                                           AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                           AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                           AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                           AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                           AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                           AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                           AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                           AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                           Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) ,
                                           Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) ,
                                           Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) ,
                                           Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) ,
                                           AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                           AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                           AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                           AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           A764ProForCod ,
                                           AV49Proforcod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd), 6, "%") ;
      lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes), 26, "%") ;
      lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc), 5, "%") ;
      lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla), 16, "%") ;
      lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv), 30, "%") ;
      /* Using cursor P09T32 */
      pr_default.execute(0, new Object[] {AV48Emprcod, AV49Proforcod, Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin), Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to), lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd, AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel, lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes, AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to, lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc, AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel, Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro), Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to), Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq), Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to), lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla, AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel, lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv, AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9T32 = false ;
         A490ForPrdUMe = P09T32_A490ForPrdUMe[0] ;
         A396EmprCod = P09T32_A396EmprCod[0] ;
         A764ProForCod = P09T32_A764ProForCod[0] ;
         A770ProForPrd = P09T32_A770ProForPrd[0] ;
         A5358ProForClv = P09T32_A5358ProForClv[0] ;
         A763ProForCla = P09T32_A763ProForCla[0] ;
         A3379ProForTnq = P09T32_A3379ProForTnq[0] ;
         A1645ProForNro = P09T32_A1645ProForNro[0] ;
         A488ForPrdDsc = P09T32_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T32_n488ForPrdDsc[0] ;
         A762ProForCan = P09T32_A762ProForCan[0] ;
         A765ProForDes = P09T32_A765ProForDes[0] ;
         A767ProForLin = P09T32_A767ProForLin[0] ;
         A488ForPrdDsc = P09T32_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T32_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09T32_A770ProForPrd[0], A770ProForPrd) == 0 ) )
         {
            brk9T32 = false ;
            A396EmprCod = P09T32_A396EmprCod[0] ;
            A764ProForCod = P09T32_A764ProForCod[0] ;
            A767ProForLin = P09T32_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9T32 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A770ProForPrd)==0) )
         {
            AV31Option = A770ProForPrd ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9T32 )
         {
            brk9T32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDESOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDes = AV43SearchTxt ;
      AV15TFProForDes_Sel = "" ;
      AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV10TFProForLin ;
      AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV11TFProForLin_To ;
      AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV12TFProForPrd ;
      AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV14TFProForDes ;
      AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV20TFProForCan ;
      AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV21TFProForCan_To ;
      AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV22TFProForNro ;
      AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV23TFProForNro_To ;
      AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV24TFProForTnq ;
      AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV25TFProForTnq_To ;
      AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV26TFProForCla ;
      AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV27TFProForCla_Sel ;
      AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV28TFProForClv ;
      AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV29TFProForClv_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) ,
                                           Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) ,
                                           AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                           AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                           AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                           AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                           AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                           AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                           AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                           AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                           Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) ,
                                           Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) ,
                                           Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) ,
                                           Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) ,
                                           AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                           AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                           AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                           AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           A764ProForCod ,
                                           AV49Proforcod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd), 6, "%") ;
      lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes), 26, "%") ;
      lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc), 5, "%") ;
      lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla), 16, "%") ;
      lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv), 30, "%") ;
      /* Using cursor P09T33 */
      pr_default.execute(1, new Object[] {AV48Emprcod, AV49Proforcod, Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin), Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to), lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd, AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel, lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes, AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to, lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc, AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel, Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro), Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to), Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq), Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to), lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla, AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel, lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv, AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9T34 = false ;
         A490ForPrdUMe = P09T33_A490ForPrdUMe[0] ;
         A396EmprCod = P09T33_A396EmprCod[0] ;
         A764ProForCod = P09T33_A764ProForCod[0] ;
         A765ProForDes = P09T33_A765ProForDes[0] ;
         A5358ProForClv = P09T33_A5358ProForClv[0] ;
         A763ProForCla = P09T33_A763ProForCla[0] ;
         A3379ProForTnq = P09T33_A3379ProForTnq[0] ;
         A1645ProForNro = P09T33_A1645ProForNro[0] ;
         A488ForPrdDsc = P09T33_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T33_n488ForPrdDsc[0] ;
         A762ProForCan = P09T33_A762ProForCan[0] ;
         A770ProForPrd = P09T33_A770ProForPrd[0] ;
         A767ProForLin = P09T33_A767ProForLin[0] ;
         A488ForPrdDsc = P09T33_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T33_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09T33_A765ProForDes[0], A765ProForDes) == 0 ) )
         {
            brk9T34 = false ;
            A396EmprCod = P09T33_A396EmprCod[0] ;
            A764ProForCod = P09T33_A764ProForCod[0] ;
            A767ProForLin = P09T33_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9T34 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A765ProForDes)==0) )
         {
            AV31Option = A765ProForDes ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9T34 )
         {
            brk9T34 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForPrdDsc = AV43SearchTxt ;
      AV19TFForPrdDsc_Sel = "" ;
      AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV10TFProForLin ;
      AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV11TFProForLin_To ;
      AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV12TFProForPrd ;
      AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV14TFProForDes ;
      AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV20TFProForCan ;
      AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV21TFProForCan_To ;
      AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV22TFProForNro ;
      AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV23TFProForNro_To ;
      AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV24TFProForTnq ;
      AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV25TFProForTnq_To ;
      AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV26TFProForCla ;
      AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV27TFProForCla_Sel ;
      AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV28TFProForClv ;
      AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV29TFProForClv_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) ,
                                           Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) ,
                                           AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                           AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                           AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                           AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                           AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                           AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                           AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                           AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                           Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) ,
                                           Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) ,
                                           Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) ,
                                           Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) ,
                                           AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                           AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                           AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                           AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           A764ProForCod ,
                                           AV49Proforcod ,
                                           AV48Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd), 6, "%") ;
      lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes), 26, "%") ;
      lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc), 5, "%") ;
      lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla), 16, "%") ;
      lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv), 30, "%") ;
      /* Using cursor P09T34 */
      pr_default.execute(2, new Object[] {AV48Emprcod, AV49Proforcod, Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin), Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to), lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd, AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel, lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes, AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to, lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc, AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel, Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro), Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to), Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq), Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to), lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla, AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel, lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv, AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9T36 = false ;
         A490ForPrdUMe = P09T34_A490ForPrdUMe[0] ;
         A396EmprCod = P09T34_A396EmprCod[0] ;
         A764ProForCod = P09T34_A764ProForCod[0] ;
         A5358ProForClv = P09T34_A5358ProForClv[0] ;
         A763ProForCla = P09T34_A763ProForCla[0] ;
         A3379ProForTnq = P09T34_A3379ProForTnq[0] ;
         A1645ProForNro = P09T34_A1645ProForNro[0] ;
         A488ForPrdDsc = P09T34_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T34_n488ForPrdDsc[0] ;
         A762ProForCan = P09T34_A762ProForCan[0] ;
         A765ProForDes = P09T34_A765ProForDes[0] ;
         A770ProForPrd = P09T34_A770ProForPrd[0] ;
         A767ProForLin = P09T34_A767ProForLin[0] ;
         A488ForPrdDsc = P09T34_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T34_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09T34_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09T34_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk9T36 = false ;
            A764ProForCod = P09T34_A764ProForCod[0] ;
            A767ProForLin = P09T34_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9T36 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV31Option = A488ForPrdDsc ;
            AV30InsertIndex = 1 ;
            while ( ( AV30InsertIndex <= AV32Options.size() ) && ( GXutil.strcmp((String)AV32Options.elementAt(-1+AV30InsertIndex), AV31Option) < 0 ) )
            {
               AV30InsertIndex = (int)(AV30InsertIndex+1) ;
            }
            AV32Options.add(AV31Option, AV30InsertIndex);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV30InsertIndex);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9T36 )
         {
            brk9T36 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROFORCLAOPTIONS' Routine */
      returnInSub = false ;
      AV26TFProForCla = AV43SearchTxt ;
      AV27TFProForCla_Sel = "" ;
      AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV10TFProForLin ;
      AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV11TFProForLin_To ;
      AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV12TFProForPrd ;
      AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV14TFProForDes ;
      AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV20TFProForCan ;
      AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV21TFProForCan_To ;
      AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV22TFProForNro ;
      AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV23TFProForNro_To ;
      AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV24TFProForTnq ;
      AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV25TFProForTnq_To ;
      AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV26TFProForCla ;
      AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV27TFProForCla_Sel ;
      AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV28TFProForClv ;
      AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV29TFProForClv_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) ,
                                           Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) ,
                                           AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                           AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                           AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                           AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                           AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                           AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                           AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                           AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                           Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) ,
                                           Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) ,
                                           Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) ,
                                           Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) ,
                                           AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                           AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                           AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                           AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           A764ProForCod ,
                                           AV49Proforcod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd), 6, "%") ;
      lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes), 26, "%") ;
      lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc), 5, "%") ;
      lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla), 16, "%") ;
      lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv), 30, "%") ;
      /* Using cursor P09T35 */
      pr_default.execute(3, new Object[] {AV48Emprcod, AV49Proforcod, Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin), Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to), lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd, AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel, lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes, AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to, lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc, AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel, Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro), Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to), Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq), Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to), lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla, AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel, lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv, AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9T38 = false ;
         A490ForPrdUMe = P09T35_A490ForPrdUMe[0] ;
         A396EmprCod = P09T35_A396EmprCod[0] ;
         A764ProForCod = P09T35_A764ProForCod[0] ;
         A763ProForCla = P09T35_A763ProForCla[0] ;
         A5358ProForClv = P09T35_A5358ProForClv[0] ;
         A3379ProForTnq = P09T35_A3379ProForTnq[0] ;
         A1645ProForNro = P09T35_A1645ProForNro[0] ;
         A488ForPrdDsc = P09T35_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T35_n488ForPrdDsc[0] ;
         A762ProForCan = P09T35_A762ProForCan[0] ;
         A765ProForDes = P09T35_A765ProForDes[0] ;
         A770ProForPrd = P09T35_A770ProForPrd[0] ;
         A767ProForLin = P09T35_A767ProForLin[0] ;
         A488ForPrdDsc = P09T35_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T35_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09T35_A763ProForCla[0], A763ProForCla) == 0 ) )
         {
            brk9T38 = false ;
            A396EmprCod = P09T35_A396EmprCod[0] ;
            A764ProForCod = P09T35_A764ProForCod[0] ;
            A767ProForLin = P09T35_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9T38 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A763ProForCla)==0) )
         {
            AV31Option = A763ProForCla ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9T38 )
         {
            brk9T38 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPROFORCLVOPTIONS' Routine */
      returnInSub = false ;
      AV28TFProForClv = AV43SearchTxt ;
      AV29TFProForClv_Sel = "" ;
      AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV10TFProForLin ;
      AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV11TFProForLin_To ;
      AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV12TFProForPrd ;
      AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV14TFProForDes ;
      AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV20TFProForCan ;
      AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV21TFProForCan_To ;
      AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV22TFProForNro ;
      AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV23TFProForNro_To ;
      AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV24TFProForTnq ;
      AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV25TFProForTnq_To ;
      AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV26TFProForCla ;
      AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV27TFProForCla_Sel ;
      AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV28TFProForClv ;
      AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV29TFProForClv_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) ,
                                           Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) ,
                                           AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                           AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                           AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                           AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                           AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                           AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                           AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                           AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                           Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) ,
                                           Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) ,
                                           Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) ,
                                           Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) ,
                                           AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                           AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                           AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                           AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           A764ProForCod ,
                                           AV49Proforcod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd), 6, "%") ;
      lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes), 26, "%") ;
      lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc), 5, "%") ;
      lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla), 16, "%") ;
      lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv), 30, "%") ;
      /* Using cursor P09T36 */
      pr_default.execute(4, new Object[] {AV48Emprcod, AV49Proforcod, Short.valueOf(AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin), Short.valueOf(AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to), lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd, AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel, lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes, AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to, lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc, AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel, Byte.valueOf(AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro), Byte.valueOf(AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to), Byte.valueOf(AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq), Byte.valueOf(AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to), lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla, AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel, lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv, AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9T310 = false ;
         A490ForPrdUMe = P09T36_A490ForPrdUMe[0] ;
         A396EmprCod = P09T36_A396EmprCod[0] ;
         A764ProForCod = P09T36_A764ProForCod[0] ;
         A5358ProForClv = P09T36_A5358ProForClv[0] ;
         A763ProForCla = P09T36_A763ProForCla[0] ;
         A3379ProForTnq = P09T36_A3379ProForTnq[0] ;
         A1645ProForNro = P09T36_A1645ProForNro[0] ;
         A488ForPrdDsc = P09T36_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T36_n488ForPrdDsc[0] ;
         A762ProForCan = P09T36_A762ProForCan[0] ;
         A765ProForDes = P09T36_A765ProForDes[0] ;
         A770ProForPrd = P09T36_A770ProForPrd[0] ;
         A767ProForLin = P09T36_A767ProForLin[0] ;
         A488ForPrdDsc = P09T36_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09T36_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09T36_A5358ProForClv[0], A5358ProForClv) == 0 ) )
         {
            brk9T310 = false ;
            A396EmprCod = P09T36_A396EmprCod[0] ;
            A764ProForCod = P09T36_A764ProForCod[0] ;
            A767ProForLin = P09T36_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9T310 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5358ProForClv)==0) )
         {
            AV31Option = A5358ProForClv ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9T310 )
         {
            brk9T310 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = procesoquimico_3getfilterdata.this.AV45OptionsJson;
      this.aP4[0] = procesoquimico_3getfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = procesoquimico_3getfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45OptionsJson = "" ;
      AV46OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFProForPrd = "" ;
      AV13TFProForPrd_Sel = "" ;
      AV14TFProForDes = "" ;
      AV15TFProForDes_Sel = "" ;
      AV20TFProForCan = DecimalUtil.ZERO ;
      AV21TFProForCan_To = DecimalUtil.ZERO ;
      AV18TFForPrdDsc = "" ;
      AV19TFForPrdDsc_Sel = "" ;
      AV26TFProForCla = "" ;
      AV27TFProForCla_Sel = "" ;
      AV28TFProForClv = "" ;
      AV29TFProForClv_Sel = "" ;
      AV48Emprcod = "" ;
      AV49Proforcod = "" ;
      AV50ProForDsc = "" ;
      AV51ProForDsc2 = "" ;
      A770ProForPrd = "" ;
      AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = "" ;
      AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = "" ;
      AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = "" ;
      AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = "" ;
      AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan = DecimalUtil.ZERO ;
      AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = DecimalUtil.ZERO ;
      AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = "" ;
      AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = "" ;
      AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = "" ;
      AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = "" ;
      AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = "" ;
      AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = "" ;
      scmdbuf = "" ;
      lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd = "" ;
      lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes = "" ;
      lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = "" ;
      lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla = "" ;
      lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P09T32_A490ForPrdUMe = new byte[1] ;
      P09T32_A396EmprCod = new String[] {""} ;
      P09T32_A764ProForCod = new String[] {""} ;
      P09T32_A770ProForPrd = new String[] {""} ;
      P09T32_A5358ProForClv = new String[] {""} ;
      P09T32_A763ProForCla = new String[] {""} ;
      P09T32_A3379ProForTnq = new byte[1] ;
      P09T32_A1645ProForNro = new byte[1] ;
      P09T32_A488ForPrdDsc = new String[] {""} ;
      P09T32_n488ForPrdDsc = new boolean[] {false} ;
      P09T32_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09T32_A765ProForDes = new String[] {""} ;
      P09T32_A767ProForLin = new short[1] ;
      AV31Option = "" ;
      P09T33_A490ForPrdUMe = new byte[1] ;
      P09T33_A396EmprCod = new String[] {""} ;
      P09T33_A764ProForCod = new String[] {""} ;
      P09T33_A765ProForDes = new String[] {""} ;
      P09T33_A5358ProForClv = new String[] {""} ;
      P09T33_A763ProForCla = new String[] {""} ;
      P09T33_A3379ProForTnq = new byte[1] ;
      P09T33_A1645ProForNro = new byte[1] ;
      P09T33_A488ForPrdDsc = new String[] {""} ;
      P09T33_n488ForPrdDsc = new boolean[] {false} ;
      P09T33_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09T33_A770ProForPrd = new String[] {""} ;
      P09T33_A767ProForLin = new short[1] ;
      P09T34_A490ForPrdUMe = new byte[1] ;
      P09T34_A396EmprCod = new String[] {""} ;
      P09T34_A764ProForCod = new String[] {""} ;
      P09T34_A5358ProForClv = new String[] {""} ;
      P09T34_A763ProForCla = new String[] {""} ;
      P09T34_A3379ProForTnq = new byte[1] ;
      P09T34_A1645ProForNro = new byte[1] ;
      P09T34_A488ForPrdDsc = new String[] {""} ;
      P09T34_n488ForPrdDsc = new boolean[] {false} ;
      P09T34_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09T34_A765ProForDes = new String[] {""} ;
      P09T34_A770ProForPrd = new String[] {""} ;
      P09T34_A767ProForLin = new short[1] ;
      P09T35_A490ForPrdUMe = new byte[1] ;
      P09T35_A396EmprCod = new String[] {""} ;
      P09T35_A764ProForCod = new String[] {""} ;
      P09T35_A763ProForCla = new String[] {""} ;
      P09T35_A5358ProForClv = new String[] {""} ;
      P09T35_A3379ProForTnq = new byte[1] ;
      P09T35_A1645ProForNro = new byte[1] ;
      P09T35_A488ForPrdDsc = new String[] {""} ;
      P09T35_n488ForPrdDsc = new boolean[] {false} ;
      P09T35_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09T35_A765ProForDes = new String[] {""} ;
      P09T35_A770ProForPrd = new String[] {""} ;
      P09T35_A767ProForLin = new short[1] ;
      P09T36_A490ForPrdUMe = new byte[1] ;
      P09T36_A396EmprCod = new String[] {""} ;
      P09T36_A764ProForCod = new String[] {""} ;
      P09T36_A5358ProForClv = new String[] {""} ;
      P09T36_A763ProForCla = new String[] {""} ;
      P09T36_A3379ProForTnq = new byte[1] ;
      P09T36_A1645ProForNro = new byte[1] ;
      P09T36_A488ForPrdDsc = new String[] {""} ;
      P09T36_n488ForPrdDsc = new boolean[] {false} ;
      P09T36_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09T36_A765ProForDes = new String[] {""} ;
      P09T36_A770ProForPrd = new String[] {""} ;
      P09T36_A767ProForLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_3getfilterdata__default(),
         new Object[] {
             new Object[] {
            P09T32_A490ForPrdUMe, P09T32_A396EmprCod, P09T32_A764ProForCod, P09T32_A770ProForPrd, P09T32_A5358ProForClv, P09T32_A763ProForCla, P09T32_A3379ProForTnq, P09T32_A1645ProForNro, P09T32_A488ForPrdDsc, P09T32_n488ForPrdDsc,
            P09T32_A762ProForCan, P09T32_A765ProForDes, P09T32_A767ProForLin
            }
            , new Object[] {
            P09T33_A490ForPrdUMe, P09T33_A396EmprCod, P09T33_A764ProForCod, P09T33_A765ProForDes, P09T33_A5358ProForClv, P09T33_A763ProForCla, P09T33_A3379ProForTnq, P09T33_A1645ProForNro, P09T33_A488ForPrdDsc, P09T33_n488ForPrdDsc,
            P09T33_A762ProForCan, P09T33_A770ProForPrd, P09T33_A767ProForLin
            }
            , new Object[] {
            P09T34_A490ForPrdUMe, P09T34_A396EmprCod, P09T34_A764ProForCod, P09T34_A5358ProForClv, P09T34_A763ProForCla, P09T34_A3379ProForTnq, P09T34_A1645ProForNro, P09T34_A488ForPrdDsc, P09T34_n488ForPrdDsc, P09T34_A762ProForCan,
            P09T34_A765ProForDes, P09T34_A770ProForPrd, P09T34_A767ProForLin
            }
            , new Object[] {
            P09T35_A490ForPrdUMe, P09T35_A396EmprCod, P09T35_A764ProForCod, P09T35_A763ProForCla, P09T35_A5358ProForClv, P09T35_A3379ProForTnq, P09T35_A1645ProForNro, P09T35_A488ForPrdDsc, P09T35_n488ForPrdDsc, P09T35_A762ProForCan,
            P09T35_A765ProForDes, P09T35_A770ProForPrd, P09T35_A767ProForLin
            }
            , new Object[] {
            P09T36_A490ForPrdUMe, P09T36_A396EmprCod, P09T36_A764ProForCod, P09T36_A5358ProForClv, P09T36_A763ProForCla, P09T36_A3379ProForTnq, P09T36_A1645ProForNro, P09T36_A488ForPrdDsc, P09T36_n488ForPrdDsc, P09T36_A762ProForCan,
            P09T36_A765ProForDes, P09T36_A770ProForPrd, P09T36_A767ProForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFProForNro ;
   private byte AV23TFProForNro_To ;
   private byte AV24TFProForTnq ;
   private byte AV25TFProForTnq_To ;
   private byte AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro ;
   private byte AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ;
   private byte AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ;
   private byte AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte A490ForPrdUMe ;
   private short AV10TFProForLin ;
   private short AV11TFProForLin_To ;
   private short AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin ;
   private short AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV30InsertIndex ;
   private long AV36count ;
   private java.math.BigDecimal AV20TFProForCan ;
   private java.math.BigDecimal AV21TFProForCan_To ;
   private java.math.BigDecimal AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ;
   private java.math.BigDecimal AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ;
   private java.math.BigDecimal A762ProForCan ;
   private String AV12TFProForPrd ;
   private String AV13TFProForPrd_Sel ;
   private String AV14TFProForDes ;
   private String AV15TFProForDes_Sel ;
   private String AV18TFForPrdDsc ;
   private String AV19TFForPrdDsc_Sel ;
   private String AV26TFProForCla ;
   private String AV27TFProForCla_Sel ;
   private String AV28TFProForClv ;
   private String AV29TFProForClv_Sel ;
   private String AV48Emprcod ;
   private String AV49Proforcod ;
   private String AV50ProForDsc ;
   private String AV51ProForDsc2 ;
   private String A770ProForPrd ;
   private String AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ;
   private String AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ;
   private String AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ;
   private String AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ;
   private String AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ;
   private String AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ;
   private String AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ;
   private String AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ;
   private String AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ;
   private String AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ;
   private String scmdbuf ;
   private String lV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ;
   private String lV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ;
   private String lV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ;
   private String lV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ;
   private String lV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ;
   private String A765ProForDes ;
   private String A488ForPrdDsc ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private boolean returnInSub ;
   private boolean brk9T32 ;
   private boolean n488ForPrdDsc ;
   private boolean brk9T34 ;
   private boolean brk9T36 ;
   private boolean brk9T38 ;
   private boolean brk9T310 ;
   private String AV45OptionsJson ;
   private String AV46OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV43SearchTxt ;
   private String AV44SearchTxtTo ;
   private String AV31Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09T32_A490ForPrdUMe ;
   private String[] P09T32_A396EmprCod ;
   private String[] P09T32_A764ProForCod ;
   private String[] P09T32_A770ProForPrd ;
   private String[] P09T32_A5358ProForClv ;
   private String[] P09T32_A763ProForCla ;
   private byte[] P09T32_A3379ProForTnq ;
   private byte[] P09T32_A1645ProForNro ;
   private String[] P09T32_A488ForPrdDsc ;
   private boolean[] P09T32_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09T32_A762ProForCan ;
   private String[] P09T32_A765ProForDes ;
   private short[] P09T32_A767ProForLin ;
   private byte[] P09T33_A490ForPrdUMe ;
   private String[] P09T33_A396EmprCod ;
   private String[] P09T33_A764ProForCod ;
   private String[] P09T33_A765ProForDes ;
   private String[] P09T33_A5358ProForClv ;
   private String[] P09T33_A763ProForCla ;
   private byte[] P09T33_A3379ProForTnq ;
   private byte[] P09T33_A1645ProForNro ;
   private String[] P09T33_A488ForPrdDsc ;
   private boolean[] P09T33_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09T33_A762ProForCan ;
   private String[] P09T33_A770ProForPrd ;
   private short[] P09T33_A767ProForLin ;
   private byte[] P09T34_A490ForPrdUMe ;
   private String[] P09T34_A396EmprCod ;
   private String[] P09T34_A764ProForCod ;
   private String[] P09T34_A5358ProForClv ;
   private String[] P09T34_A763ProForCla ;
   private byte[] P09T34_A3379ProForTnq ;
   private byte[] P09T34_A1645ProForNro ;
   private String[] P09T34_A488ForPrdDsc ;
   private boolean[] P09T34_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09T34_A762ProForCan ;
   private String[] P09T34_A765ProForDes ;
   private String[] P09T34_A770ProForPrd ;
   private short[] P09T34_A767ProForLin ;
   private byte[] P09T35_A490ForPrdUMe ;
   private String[] P09T35_A396EmprCod ;
   private String[] P09T35_A764ProForCod ;
   private String[] P09T35_A763ProForCla ;
   private String[] P09T35_A5358ProForClv ;
   private byte[] P09T35_A3379ProForTnq ;
   private byte[] P09T35_A1645ProForNro ;
   private String[] P09T35_A488ForPrdDsc ;
   private boolean[] P09T35_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09T35_A762ProForCan ;
   private String[] P09T35_A765ProForDes ;
   private String[] P09T35_A770ProForPrd ;
   private short[] P09T35_A767ProForLin ;
   private byte[] P09T36_A490ForPrdUMe ;
   private String[] P09T36_A396EmprCod ;
   private String[] P09T36_A764ProForCod ;
   private String[] P09T36_A5358ProForClv ;
   private String[] P09T36_A763ProForCla ;
   private byte[] P09T36_A3379ProForTnq ;
   private byte[] P09T36_A1645ProForNro ;
   private String[] P09T36_A488ForPrdDsc ;
   private boolean[] P09T36_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09T36_A762ProForCan ;
   private String[] P09T36_A765ProForDes ;
   private String[] P09T36_A770ProForPrd ;
   private short[] P09T36_A767ProForLin ;
   private GXSimpleCollection<String> AV32Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV35OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class procesoquimico_3getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09T32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin ,
                                          short AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ,
                                          String AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                          String AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                          String AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                          String AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                          java.math.BigDecimal AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                          java.math.BigDecimal AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                          String AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                          String AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                          byte AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro ,
                                          byte AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ,
                                          byte AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ,
                                          byte AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ,
                                          String AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                          String AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                          String AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                          String AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          String A396EmprCod ,
                                          String AV48Emprcod ,
                                          String A764ProForCod ,
                                          String AV49Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForPrd, T1.ProForClv, T1.ProForCla, T1.ProForTnq, T1.ProForNro, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForPrd" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09T33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin ,
                                          short AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ,
                                          String AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                          String AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                          String AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                          String AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                          java.math.BigDecimal AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                          java.math.BigDecimal AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                          String AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                          String AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                          byte AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro ,
                                          byte AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ,
                                          byte AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ,
                                          byte AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ,
                                          String AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                          String AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                          String AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                          String AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          String A396EmprCod ,
                                          String AV48Emprcod ,
                                          String A764ProForCod ,
                                          String AV49Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForDes, T1.ProForClv, T1.ProForCla, T1.ProForTnq, T1.ProForNro, T2.ForPrdDsc, T1.ProForCan, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForDes" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09T34( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin ,
                                          short AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ,
                                          String AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                          String AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                          String AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                          String AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                          java.math.BigDecimal AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                          java.math.BigDecimal AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                          String AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                          String AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                          byte AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro ,
                                          byte AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ,
                                          byte AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ,
                                          byte AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ,
                                          String AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                          String AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                          String AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                          String AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          String A764ProForCod ,
                                          String AV49Proforcod ,
                                          String AV48Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForClv, T1.ProForCla, T1.ProForTnq, T1.ProForNro, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09T35( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin ,
                                          short AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ,
                                          String AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                          String AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                          String AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                          String AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                          java.math.BigDecimal AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                          java.math.BigDecimal AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                          String AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                          String AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                          byte AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro ,
                                          byte AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ,
                                          byte AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ,
                                          byte AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ,
                                          String AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                          String AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                          String AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                          String AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          String A396EmprCod ,
                                          String AV48Emprcod ,
                                          String A764ProForCod ,
                                          String AV49Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForCla, T1.ProForClv, T1.ProForTnq, T1.ProForNro, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForCla" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09T36( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin ,
                                          short AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ,
                                          String AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                          String AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                          String AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                          String AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                          java.math.BigDecimal AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                          java.math.BigDecimal AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                          String AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                          String AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                          byte AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro ,
                                          byte AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ,
                                          byte AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ,
                                          byte AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ,
                                          String AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                          String AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                          String AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                          String AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          String A396EmprCod ,
                                          String AV48Emprcod ,
                                          String A764ProForCod ,
                                          String AV49Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[20];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForClv, T1.ProForCla, T1.ProForTnq, T1.ProForNro, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV56Formulaciontinte_procesoquimico_3ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_procesoquimico_3ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_procesoquimico_3ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Formulaciontinte_procesoquimico_3ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_procesoquimico_3ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_procesoquimico_3ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_procesoquimico_3ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_procesoquimico_3ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForClv" ;
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
                  return conditional_P09T32(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 1 :
                  return conditional_P09T33(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 2 :
                  return conditional_P09T34(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 3 :
                  return conditional_P09T35(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 4 :
                  return conditional_P09T36(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09T32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09T33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09T34", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09T35", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09T36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
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
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
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
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               return;
      }
   }

}

