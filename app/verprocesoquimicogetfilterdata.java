package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class verprocesoquimicogetfilterdata extends GXProcedure
{
   public verprocesoquimicogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( verprocesoquimicogetfilterdata.class ), "" );
   }

   public verprocesoquimicogetfilterdata( int remoteHandle ,
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
      verprocesoquimicogetfilterdata.this.aP5 = new String[] {""};
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
      verprocesoquimicogetfilterdata.this.AV42DDOName = aP0;
      verprocesoquimicogetfilterdata.this.AV43SearchTxt = aP1;
      verprocesoquimicogetfilterdata.this.AV44SearchTxtTo = aP2;
      verprocesoquimicogetfilterdata.this.aP3 = aP3;
      verprocesoquimicogetfilterdata.this.aP4 = aP4;
      verprocesoquimicogetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV37Session.getValue("VerProcesoQuimicoGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "VerProcesoQuimicoGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("VerProcesoQuimicoGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
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
            AV16TFProForCan = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFProForCan_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV18TFForPrdUMe = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFForPrdUMe_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV20TFForPrdDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV21TFForPrdDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA") == 0 )
         {
            AV22TFProForCla = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA_SEL") == 0 )
         {
            AV23TFProForCla_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV") == 0 )
         {
            AV24TFProForClv = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV_SEL") == 0 )
         {
            AV25TFProForClv_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORNRO") == 0 )
         {
            AV26TFProForNro = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFProForNro_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTNQ") == 0 )
         {
            AV28TFProForTnq = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFProForTnq_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORPRDOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForPrd = AV43SearchTxt ;
      AV13TFProForPrd_Sel = "" ;
      AV55Verprocesoquimicods_1_tfproforlin = AV10TFProForLin ;
      AV56Verprocesoquimicods_2_tfproforlin_to = AV11TFProForLin_To ;
      AV57Verprocesoquimicods_3_tfproforprd = AV12TFProForPrd ;
      AV58Verprocesoquimicods_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV59Verprocesoquimicods_5_tfprofordes = AV14TFProForDes ;
      AV60Verprocesoquimicods_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV61Verprocesoquimicods_7_tfproforcan = AV16TFProForCan ;
      AV62Verprocesoquimicods_8_tfproforcan_to = AV17TFProForCan_To ;
      AV63Verprocesoquimicods_9_tfforprdume = AV18TFForPrdUMe ;
      AV64Verprocesoquimicods_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV65Verprocesoquimicods_11_tfforprddsc = AV20TFForPrdDsc ;
      AV66Verprocesoquimicods_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV67Verprocesoquimicods_13_tfproforcla = AV22TFProForCla ;
      AV68Verprocesoquimicods_14_tfproforcla_sel = AV23TFProForCla_Sel ;
      AV69Verprocesoquimicods_15_tfproforclv = AV24TFProForClv ;
      AV70Verprocesoquimicods_16_tfproforclv_sel = AV25TFProForClv_Sel ;
      AV71Verprocesoquimicods_17_tfprofornro = AV26TFProForNro ;
      AV72Verprocesoquimicods_18_tfprofornro_to = AV27TFProForNro_To ;
      AV73Verprocesoquimicods_19_tfprofortnq = AV28TFProForTnq ;
      AV74Verprocesoquimicods_20_tfprofortnq_to = AV29TFProForTnq_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin) ,
                                           Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to) ,
                                           AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                           AV57Verprocesoquimicods_3_tfproforprd ,
                                           AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                           AV59Verprocesoquimicods_5_tfprofordes ,
                                           AV61Verprocesoquimicods_7_tfproforcan ,
                                           AV62Verprocesoquimicods_8_tfproforcan_to ,
                                           Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume) ,
                                           Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to) ,
                                           AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                           AV65Verprocesoquimicods_11_tfforprddsc ,
                                           AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                           AV67Verprocesoquimicods_13_tfproforcla ,
                                           AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                           AV69Verprocesoquimicods_15_tfproforclv ,
                                           Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro) ,
                                           Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to) ,
                                           Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq) ,
                                           Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to) ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           A764ProForCod ,
                                           AV50ProForCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Verprocesoquimicods_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV57Verprocesoquimicods_3_tfproforprd), 6, "%") ;
      lV59Verprocesoquimicods_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV59Verprocesoquimicods_5_tfprofordes), 26, "%") ;
      lV65Verprocesoquimicods_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV65Verprocesoquimicods_11_tfforprddsc), 5, "%") ;
      lV67Verprocesoquimicods_13_tfproforcla = GXutil.padr( GXutil.rtrim( AV67Verprocesoquimicods_13_tfproforcla), 16, "%") ;
      lV69Verprocesoquimicods_15_tfproforclv = GXutil.padr( GXutil.rtrim( AV69Verprocesoquimicods_15_tfproforclv), 30, "%") ;
      /* Using cursor P0ADT2 */
      pr_default.execute(0, new Object[] {AV49EmprCod, AV50ProForCod, Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin), Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to), lV57Verprocesoquimicods_3_tfproforprd, AV58Verprocesoquimicods_4_tfproforprd_sel, lV59Verprocesoquimicods_5_tfprofordes, AV60Verprocesoquimicods_6_tfprofordes_sel, AV61Verprocesoquimicods_7_tfproforcan, AV62Verprocesoquimicods_8_tfproforcan_to, Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume), Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to), lV65Verprocesoquimicods_11_tfforprddsc, AV66Verprocesoquimicods_12_tfforprddsc_sel, lV67Verprocesoquimicods_13_tfproforcla, AV68Verprocesoquimicods_14_tfproforcla_sel, lV69Verprocesoquimicods_15_tfproforclv, AV70Verprocesoquimicods_16_tfproforclv_sel, Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro), Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to), Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq), Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkADT2 = false ;
         A396EmprCod = P0ADT2_A396EmprCod[0] ;
         A764ProForCod = P0ADT2_A764ProForCod[0] ;
         A770ProForPrd = P0ADT2_A770ProForPrd[0] ;
         A3379ProForTnq = P0ADT2_A3379ProForTnq[0] ;
         A1645ProForNro = P0ADT2_A1645ProForNro[0] ;
         A5358ProForClv = P0ADT2_A5358ProForClv[0] ;
         A763ProForCla = P0ADT2_A763ProForCla[0] ;
         A488ForPrdDsc = P0ADT2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0ADT2_A490ForPrdUMe[0] ;
         A762ProForCan = P0ADT2_A762ProForCan[0] ;
         A765ProForDes = P0ADT2_A765ProForDes[0] ;
         A767ProForLin = P0ADT2_A767ProForLin[0] ;
         A488ForPrdDsc = P0ADT2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT2_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ADT2_A770ProForPrd[0], A770ProForPrd) == 0 ) )
         {
            brkADT2 = false ;
            A396EmprCod = P0ADT2_A396EmprCod[0] ;
            A764ProForCod = P0ADT2_A764ProForCod[0] ;
            A767ProForLin = P0ADT2_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkADT2 = true ;
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
         if ( ! brkADT2 )
         {
            brkADT2 = true ;
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
      AV55Verprocesoquimicods_1_tfproforlin = AV10TFProForLin ;
      AV56Verprocesoquimicods_2_tfproforlin_to = AV11TFProForLin_To ;
      AV57Verprocesoquimicods_3_tfproforprd = AV12TFProForPrd ;
      AV58Verprocesoquimicods_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV59Verprocesoquimicods_5_tfprofordes = AV14TFProForDes ;
      AV60Verprocesoquimicods_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV61Verprocesoquimicods_7_tfproforcan = AV16TFProForCan ;
      AV62Verprocesoquimicods_8_tfproforcan_to = AV17TFProForCan_To ;
      AV63Verprocesoquimicods_9_tfforprdume = AV18TFForPrdUMe ;
      AV64Verprocesoquimicods_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV65Verprocesoquimicods_11_tfforprddsc = AV20TFForPrdDsc ;
      AV66Verprocesoquimicods_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV67Verprocesoquimicods_13_tfproforcla = AV22TFProForCla ;
      AV68Verprocesoquimicods_14_tfproforcla_sel = AV23TFProForCla_Sel ;
      AV69Verprocesoquimicods_15_tfproforclv = AV24TFProForClv ;
      AV70Verprocesoquimicods_16_tfproforclv_sel = AV25TFProForClv_Sel ;
      AV71Verprocesoquimicods_17_tfprofornro = AV26TFProForNro ;
      AV72Verprocesoquimicods_18_tfprofornro_to = AV27TFProForNro_To ;
      AV73Verprocesoquimicods_19_tfprofortnq = AV28TFProForTnq ;
      AV74Verprocesoquimicods_20_tfprofortnq_to = AV29TFProForTnq_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin) ,
                                           Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to) ,
                                           AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                           AV57Verprocesoquimicods_3_tfproforprd ,
                                           AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                           AV59Verprocesoquimicods_5_tfprofordes ,
                                           AV61Verprocesoquimicods_7_tfproforcan ,
                                           AV62Verprocesoquimicods_8_tfproforcan_to ,
                                           Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume) ,
                                           Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to) ,
                                           AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                           AV65Verprocesoquimicods_11_tfforprddsc ,
                                           AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                           AV67Verprocesoquimicods_13_tfproforcla ,
                                           AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                           AV69Verprocesoquimicods_15_tfproforclv ,
                                           Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro) ,
                                           Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to) ,
                                           Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq) ,
                                           Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to) ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           A764ProForCod ,
                                           AV50ProForCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Verprocesoquimicods_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV57Verprocesoquimicods_3_tfproforprd), 6, "%") ;
      lV59Verprocesoquimicods_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV59Verprocesoquimicods_5_tfprofordes), 26, "%") ;
      lV65Verprocesoquimicods_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV65Verprocesoquimicods_11_tfforprddsc), 5, "%") ;
      lV67Verprocesoquimicods_13_tfproforcla = GXutil.padr( GXutil.rtrim( AV67Verprocesoquimicods_13_tfproforcla), 16, "%") ;
      lV69Verprocesoquimicods_15_tfproforclv = GXutil.padr( GXutil.rtrim( AV69Verprocesoquimicods_15_tfproforclv), 30, "%") ;
      /* Using cursor P0ADT3 */
      pr_default.execute(1, new Object[] {AV49EmprCod, AV50ProForCod, Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin), Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to), lV57Verprocesoquimicods_3_tfproforprd, AV58Verprocesoquimicods_4_tfproforprd_sel, lV59Verprocesoquimicods_5_tfprofordes, AV60Verprocesoquimicods_6_tfprofordes_sel, AV61Verprocesoquimicods_7_tfproforcan, AV62Verprocesoquimicods_8_tfproforcan_to, Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume), Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to), lV65Verprocesoquimicods_11_tfforprddsc, AV66Verprocesoquimicods_12_tfforprddsc_sel, lV67Verprocesoquimicods_13_tfproforcla, AV68Verprocesoquimicods_14_tfproforcla_sel, lV69Verprocesoquimicods_15_tfproforclv, AV70Verprocesoquimicods_16_tfproforclv_sel, Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro), Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to), Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq), Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkADT4 = false ;
         A396EmprCod = P0ADT3_A396EmprCod[0] ;
         A764ProForCod = P0ADT3_A764ProForCod[0] ;
         A765ProForDes = P0ADT3_A765ProForDes[0] ;
         A3379ProForTnq = P0ADT3_A3379ProForTnq[0] ;
         A1645ProForNro = P0ADT3_A1645ProForNro[0] ;
         A5358ProForClv = P0ADT3_A5358ProForClv[0] ;
         A763ProForCla = P0ADT3_A763ProForCla[0] ;
         A488ForPrdDsc = P0ADT3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT3_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0ADT3_A490ForPrdUMe[0] ;
         A762ProForCan = P0ADT3_A762ProForCan[0] ;
         A770ProForPrd = P0ADT3_A770ProForPrd[0] ;
         A767ProForLin = P0ADT3_A767ProForLin[0] ;
         A488ForPrdDsc = P0ADT3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT3_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ADT3_A765ProForDes[0], A765ProForDes) == 0 ) )
         {
            brkADT4 = false ;
            A396EmprCod = P0ADT3_A396EmprCod[0] ;
            A764ProForCod = P0ADT3_A764ProForCod[0] ;
            A767ProForLin = P0ADT3_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkADT4 = true ;
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
         if ( ! brkADT4 )
         {
            brkADT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFForPrdDsc = AV43SearchTxt ;
      AV21TFForPrdDsc_Sel = "" ;
      AV55Verprocesoquimicods_1_tfproforlin = AV10TFProForLin ;
      AV56Verprocesoquimicods_2_tfproforlin_to = AV11TFProForLin_To ;
      AV57Verprocesoquimicods_3_tfproforprd = AV12TFProForPrd ;
      AV58Verprocesoquimicods_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV59Verprocesoquimicods_5_tfprofordes = AV14TFProForDes ;
      AV60Verprocesoquimicods_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV61Verprocesoquimicods_7_tfproforcan = AV16TFProForCan ;
      AV62Verprocesoquimicods_8_tfproforcan_to = AV17TFProForCan_To ;
      AV63Verprocesoquimicods_9_tfforprdume = AV18TFForPrdUMe ;
      AV64Verprocesoquimicods_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV65Verprocesoquimicods_11_tfforprddsc = AV20TFForPrdDsc ;
      AV66Verprocesoquimicods_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV67Verprocesoquimicods_13_tfproforcla = AV22TFProForCla ;
      AV68Verprocesoquimicods_14_tfproforcla_sel = AV23TFProForCla_Sel ;
      AV69Verprocesoquimicods_15_tfproforclv = AV24TFProForClv ;
      AV70Verprocesoquimicods_16_tfproforclv_sel = AV25TFProForClv_Sel ;
      AV71Verprocesoquimicods_17_tfprofornro = AV26TFProForNro ;
      AV72Verprocesoquimicods_18_tfprofornro_to = AV27TFProForNro_To ;
      AV73Verprocesoquimicods_19_tfprofortnq = AV28TFProForTnq ;
      AV74Verprocesoquimicods_20_tfprofortnq_to = AV29TFProForTnq_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin) ,
                                           Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to) ,
                                           AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                           AV57Verprocesoquimicods_3_tfproforprd ,
                                           AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                           AV59Verprocesoquimicods_5_tfprofordes ,
                                           AV61Verprocesoquimicods_7_tfproforcan ,
                                           AV62Verprocesoquimicods_8_tfproforcan_to ,
                                           Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume) ,
                                           Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to) ,
                                           AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                           AV65Verprocesoquimicods_11_tfforprddsc ,
                                           AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                           AV67Verprocesoquimicods_13_tfproforcla ,
                                           AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                           AV69Verprocesoquimicods_15_tfproforclv ,
                                           Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro) ,
                                           Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to) ,
                                           Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq) ,
                                           Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to) ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A764ProForCod ,
                                           AV50ProForCod ,
                                           AV49EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Verprocesoquimicods_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV57Verprocesoquimicods_3_tfproforprd), 6, "%") ;
      lV59Verprocesoquimicods_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV59Verprocesoquimicods_5_tfprofordes), 26, "%") ;
      lV65Verprocesoquimicods_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV65Verprocesoquimicods_11_tfforprddsc), 5, "%") ;
      lV67Verprocesoquimicods_13_tfproforcla = GXutil.padr( GXutil.rtrim( AV67Verprocesoquimicods_13_tfproforcla), 16, "%") ;
      lV69Verprocesoquimicods_15_tfproforclv = GXutil.padr( GXutil.rtrim( AV69Verprocesoquimicods_15_tfproforclv), 30, "%") ;
      /* Using cursor P0ADT4 */
      pr_default.execute(2, new Object[] {AV49EmprCod, AV50ProForCod, Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin), Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to), lV57Verprocesoquimicods_3_tfproforprd, AV58Verprocesoquimicods_4_tfproforprd_sel, lV59Verprocesoquimicods_5_tfprofordes, AV60Verprocesoquimicods_6_tfprofordes_sel, AV61Verprocesoquimicods_7_tfproforcan, AV62Verprocesoquimicods_8_tfproforcan_to, Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume), Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to), lV65Verprocesoquimicods_11_tfforprddsc, AV66Verprocesoquimicods_12_tfforprddsc_sel, lV67Verprocesoquimicods_13_tfproforcla, AV68Verprocesoquimicods_14_tfproforcla_sel, lV69Verprocesoquimicods_15_tfproforclv, AV70Verprocesoquimicods_16_tfproforclv_sel, Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro), Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to), Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq), Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkADT6 = false ;
         A490ForPrdUMe = P0ADT4_A490ForPrdUMe[0] ;
         A396EmprCod = P0ADT4_A396EmprCod[0] ;
         A764ProForCod = P0ADT4_A764ProForCod[0] ;
         A3379ProForTnq = P0ADT4_A3379ProForTnq[0] ;
         A1645ProForNro = P0ADT4_A1645ProForNro[0] ;
         A5358ProForClv = P0ADT4_A5358ProForClv[0] ;
         A763ProForCla = P0ADT4_A763ProForCla[0] ;
         A488ForPrdDsc = P0ADT4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT4_n488ForPrdDsc[0] ;
         A762ProForCan = P0ADT4_A762ProForCan[0] ;
         A765ProForDes = P0ADT4_A765ProForDes[0] ;
         A770ProForPrd = P0ADT4_A770ProForPrd[0] ;
         A767ProForLin = P0ADT4_A767ProForLin[0] ;
         A488ForPrdDsc = P0ADT4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT4_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ADT4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ADT4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brkADT6 = false ;
            A764ProForCod = P0ADT4_A764ProForCod[0] ;
            A767ProForLin = P0ADT4_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkADT6 = true ;
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
         if ( ! brkADT6 )
         {
            brkADT6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROFORCLAOPTIONS' Routine */
      returnInSub = false ;
      AV22TFProForCla = AV43SearchTxt ;
      AV23TFProForCla_Sel = "" ;
      AV55Verprocesoquimicods_1_tfproforlin = AV10TFProForLin ;
      AV56Verprocesoquimicods_2_tfproforlin_to = AV11TFProForLin_To ;
      AV57Verprocesoquimicods_3_tfproforprd = AV12TFProForPrd ;
      AV58Verprocesoquimicods_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV59Verprocesoquimicods_5_tfprofordes = AV14TFProForDes ;
      AV60Verprocesoquimicods_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV61Verprocesoquimicods_7_tfproforcan = AV16TFProForCan ;
      AV62Verprocesoquimicods_8_tfproforcan_to = AV17TFProForCan_To ;
      AV63Verprocesoquimicods_9_tfforprdume = AV18TFForPrdUMe ;
      AV64Verprocesoquimicods_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV65Verprocesoquimicods_11_tfforprddsc = AV20TFForPrdDsc ;
      AV66Verprocesoquimicods_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV67Verprocesoquimicods_13_tfproforcla = AV22TFProForCla ;
      AV68Verprocesoquimicods_14_tfproforcla_sel = AV23TFProForCla_Sel ;
      AV69Verprocesoquimicods_15_tfproforclv = AV24TFProForClv ;
      AV70Verprocesoquimicods_16_tfproforclv_sel = AV25TFProForClv_Sel ;
      AV71Verprocesoquimicods_17_tfprofornro = AV26TFProForNro ;
      AV72Verprocesoquimicods_18_tfprofornro_to = AV27TFProForNro_To ;
      AV73Verprocesoquimicods_19_tfprofortnq = AV28TFProForTnq ;
      AV74Verprocesoquimicods_20_tfprofortnq_to = AV29TFProForTnq_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin) ,
                                           Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to) ,
                                           AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                           AV57Verprocesoquimicods_3_tfproforprd ,
                                           AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                           AV59Verprocesoquimicods_5_tfprofordes ,
                                           AV61Verprocesoquimicods_7_tfproforcan ,
                                           AV62Verprocesoquimicods_8_tfproforcan_to ,
                                           Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume) ,
                                           Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to) ,
                                           AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                           AV65Verprocesoquimicods_11_tfforprddsc ,
                                           AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                           AV67Verprocesoquimicods_13_tfproforcla ,
                                           AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                           AV69Verprocesoquimicods_15_tfproforclv ,
                                           Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro) ,
                                           Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to) ,
                                           Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq) ,
                                           Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to) ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           A764ProForCod ,
                                           AV50ProForCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Verprocesoquimicods_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV57Verprocesoquimicods_3_tfproforprd), 6, "%") ;
      lV59Verprocesoquimicods_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV59Verprocesoquimicods_5_tfprofordes), 26, "%") ;
      lV65Verprocesoquimicods_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV65Verprocesoquimicods_11_tfforprddsc), 5, "%") ;
      lV67Verprocesoquimicods_13_tfproforcla = GXutil.padr( GXutil.rtrim( AV67Verprocesoquimicods_13_tfproforcla), 16, "%") ;
      lV69Verprocesoquimicods_15_tfproforclv = GXutil.padr( GXutil.rtrim( AV69Verprocesoquimicods_15_tfproforclv), 30, "%") ;
      /* Using cursor P0ADT5 */
      pr_default.execute(3, new Object[] {AV49EmprCod, AV50ProForCod, Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin), Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to), lV57Verprocesoquimicods_3_tfproforprd, AV58Verprocesoquimicods_4_tfproforprd_sel, lV59Verprocesoquimicods_5_tfprofordes, AV60Verprocesoquimicods_6_tfprofordes_sel, AV61Verprocesoquimicods_7_tfproforcan, AV62Verprocesoquimicods_8_tfproforcan_to, Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume), Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to), lV65Verprocesoquimicods_11_tfforprddsc, AV66Verprocesoquimicods_12_tfforprddsc_sel, lV67Verprocesoquimicods_13_tfproforcla, AV68Verprocesoquimicods_14_tfproforcla_sel, lV69Verprocesoquimicods_15_tfproforclv, AV70Verprocesoquimicods_16_tfproforclv_sel, Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro), Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to), Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq), Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkADT8 = false ;
         A396EmprCod = P0ADT5_A396EmprCod[0] ;
         A764ProForCod = P0ADT5_A764ProForCod[0] ;
         A763ProForCla = P0ADT5_A763ProForCla[0] ;
         A3379ProForTnq = P0ADT5_A3379ProForTnq[0] ;
         A1645ProForNro = P0ADT5_A1645ProForNro[0] ;
         A5358ProForClv = P0ADT5_A5358ProForClv[0] ;
         A488ForPrdDsc = P0ADT5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT5_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0ADT5_A490ForPrdUMe[0] ;
         A762ProForCan = P0ADT5_A762ProForCan[0] ;
         A765ProForDes = P0ADT5_A765ProForDes[0] ;
         A770ProForPrd = P0ADT5_A770ProForPrd[0] ;
         A767ProForLin = P0ADT5_A767ProForLin[0] ;
         A488ForPrdDsc = P0ADT5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT5_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0ADT5_A763ProForCla[0], A763ProForCla) == 0 ) )
         {
            brkADT8 = false ;
            A396EmprCod = P0ADT5_A396EmprCod[0] ;
            A764ProForCod = P0ADT5_A764ProForCod[0] ;
            A767ProForLin = P0ADT5_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkADT8 = true ;
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
         if ( ! brkADT8 )
         {
            brkADT8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPROFORCLVOPTIONS' Routine */
      returnInSub = false ;
      AV24TFProForClv = AV43SearchTxt ;
      AV25TFProForClv_Sel = "" ;
      AV55Verprocesoquimicods_1_tfproforlin = AV10TFProForLin ;
      AV56Verprocesoquimicods_2_tfproforlin_to = AV11TFProForLin_To ;
      AV57Verprocesoquimicods_3_tfproforprd = AV12TFProForPrd ;
      AV58Verprocesoquimicods_4_tfproforprd_sel = AV13TFProForPrd_Sel ;
      AV59Verprocesoquimicods_5_tfprofordes = AV14TFProForDes ;
      AV60Verprocesoquimicods_6_tfprofordes_sel = AV15TFProForDes_Sel ;
      AV61Verprocesoquimicods_7_tfproforcan = AV16TFProForCan ;
      AV62Verprocesoquimicods_8_tfproforcan_to = AV17TFProForCan_To ;
      AV63Verprocesoquimicods_9_tfforprdume = AV18TFForPrdUMe ;
      AV64Verprocesoquimicods_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV65Verprocesoquimicods_11_tfforprddsc = AV20TFForPrdDsc ;
      AV66Verprocesoquimicods_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV67Verprocesoquimicods_13_tfproforcla = AV22TFProForCla ;
      AV68Verprocesoquimicods_14_tfproforcla_sel = AV23TFProForCla_Sel ;
      AV69Verprocesoquimicods_15_tfproforclv = AV24TFProForClv ;
      AV70Verprocesoquimicods_16_tfproforclv_sel = AV25TFProForClv_Sel ;
      AV71Verprocesoquimicods_17_tfprofornro = AV26TFProForNro ;
      AV72Verprocesoquimicods_18_tfprofornro_to = AV27TFProForNro_To ;
      AV73Verprocesoquimicods_19_tfprofortnq = AV28TFProForTnq ;
      AV74Verprocesoquimicods_20_tfprofortnq_to = AV29TFProForTnq_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin) ,
                                           Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to) ,
                                           AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                           AV57Verprocesoquimicods_3_tfproforprd ,
                                           AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                           AV59Verprocesoquimicods_5_tfprofordes ,
                                           AV61Verprocesoquimicods_7_tfproforcan ,
                                           AV62Verprocesoquimicods_8_tfproforcan_to ,
                                           Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume) ,
                                           Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to) ,
                                           AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                           AV65Verprocesoquimicods_11_tfforprddsc ,
                                           AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                           AV67Verprocesoquimicods_13_tfproforcla ,
                                           AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                           AV69Verprocesoquimicods_15_tfproforclv ,
                                           Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro) ,
                                           Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to) ,
                                           Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq) ,
                                           Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to) ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           A764ProForCod ,
                                           AV50ProForCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Verprocesoquimicods_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV57Verprocesoquimicods_3_tfproforprd), 6, "%") ;
      lV59Verprocesoquimicods_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV59Verprocesoquimicods_5_tfprofordes), 26, "%") ;
      lV65Verprocesoquimicods_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV65Verprocesoquimicods_11_tfforprddsc), 5, "%") ;
      lV67Verprocesoquimicods_13_tfproforcla = GXutil.padr( GXutil.rtrim( AV67Verprocesoquimicods_13_tfproforcla), 16, "%") ;
      lV69Verprocesoquimicods_15_tfproforclv = GXutil.padr( GXutil.rtrim( AV69Verprocesoquimicods_15_tfproforclv), 30, "%") ;
      /* Using cursor P0ADT6 */
      pr_default.execute(4, new Object[] {AV49EmprCod, AV50ProForCod, Short.valueOf(AV55Verprocesoquimicods_1_tfproforlin), Short.valueOf(AV56Verprocesoquimicods_2_tfproforlin_to), lV57Verprocesoquimicods_3_tfproforprd, AV58Verprocesoquimicods_4_tfproforprd_sel, lV59Verprocesoquimicods_5_tfprofordes, AV60Verprocesoquimicods_6_tfprofordes_sel, AV61Verprocesoquimicods_7_tfproforcan, AV62Verprocesoquimicods_8_tfproforcan_to, Byte.valueOf(AV63Verprocesoquimicods_9_tfforprdume), Byte.valueOf(AV64Verprocesoquimicods_10_tfforprdume_to), lV65Verprocesoquimicods_11_tfforprddsc, AV66Verprocesoquimicods_12_tfforprddsc_sel, lV67Verprocesoquimicods_13_tfproforcla, AV68Verprocesoquimicods_14_tfproforcla_sel, lV69Verprocesoquimicods_15_tfproforclv, AV70Verprocesoquimicods_16_tfproforclv_sel, Byte.valueOf(AV71Verprocesoquimicods_17_tfprofornro), Byte.valueOf(AV72Verprocesoquimicods_18_tfprofornro_to), Byte.valueOf(AV73Verprocesoquimicods_19_tfprofortnq), Byte.valueOf(AV74Verprocesoquimicods_20_tfprofortnq_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkADT10 = false ;
         A396EmprCod = P0ADT6_A396EmprCod[0] ;
         A764ProForCod = P0ADT6_A764ProForCod[0] ;
         A5358ProForClv = P0ADT6_A5358ProForClv[0] ;
         A3379ProForTnq = P0ADT6_A3379ProForTnq[0] ;
         A1645ProForNro = P0ADT6_A1645ProForNro[0] ;
         A763ProForCla = P0ADT6_A763ProForCla[0] ;
         A488ForPrdDsc = P0ADT6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT6_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0ADT6_A490ForPrdUMe[0] ;
         A762ProForCan = P0ADT6_A762ProForCan[0] ;
         A765ProForDes = P0ADT6_A765ProForDes[0] ;
         A770ProForPrd = P0ADT6_A770ProForPrd[0] ;
         A767ProForLin = P0ADT6_A767ProForLin[0] ;
         A488ForPrdDsc = P0ADT6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0ADT6_n488ForPrdDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0ADT6_A5358ProForClv[0], A5358ProForClv) == 0 ) )
         {
            brkADT10 = false ;
            A396EmprCod = P0ADT6_A396EmprCod[0] ;
            A764ProForCod = P0ADT6_A764ProForCod[0] ;
            A767ProForLin = P0ADT6_A767ProForLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkADT10 = true ;
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
         if ( ! brkADT10 )
         {
            brkADT10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = verprocesoquimicogetfilterdata.this.AV45OptionsJson;
      this.aP4[0] = verprocesoquimicogetfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = verprocesoquimicogetfilterdata.this.AV47OptionIndexesJson;
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
      AV16TFProForCan = DecimalUtil.ZERO ;
      AV17TFProForCan_To = DecimalUtil.ZERO ;
      AV20TFForPrdDsc = "" ;
      AV21TFForPrdDsc_Sel = "" ;
      AV22TFProForCla = "" ;
      AV23TFProForCla_Sel = "" ;
      AV24TFProForClv = "" ;
      AV25TFProForClv_Sel = "" ;
      A770ProForPrd = "" ;
      AV57Verprocesoquimicods_3_tfproforprd = "" ;
      AV58Verprocesoquimicods_4_tfproforprd_sel = "" ;
      AV59Verprocesoquimicods_5_tfprofordes = "" ;
      AV60Verprocesoquimicods_6_tfprofordes_sel = "" ;
      AV61Verprocesoquimicods_7_tfproforcan = DecimalUtil.ZERO ;
      AV62Verprocesoquimicods_8_tfproforcan_to = DecimalUtil.ZERO ;
      AV65Verprocesoquimicods_11_tfforprddsc = "" ;
      AV66Verprocesoquimicods_12_tfforprddsc_sel = "" ;
      AV67Verprocesoquimicods_13_tfproforcla = "" ;
      AV68Verprocesoquimicods_14_tfproforcla_sel = "" ;
      AV69Verprocesoquimicods_15_tfproforclv = "" ;
      AV70Verprocesoquimicods_16_tfproforclv_sel = "" ;
      scmdbuf = "" ;
      lV57Verprocesoquimicods_3_tfproforprd = "" ;
      lV59Verprocesoquimicods_5_tfprofordes = "" ;
      lV65Verprocesoquimicods_11_tfforprddsc = "" ;
      lV67Verprocesoquimicods_13_tfproforcla = "" ;
      lV69Verprocesoquimicods_15_tfproforclv = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A396EmprCod = "" ;
      AV49EmprCod = "" ;
      A764ProForCod = "" ;
      AV50ProForCod = "" ;
      P0ADT2_A396EmprCod = new String[] {""} ;
      P0ADT2_A764ProForCod = new String[] {""} ;
      P0ADT2_A770ProForPrd = new String[] {""} ;
      P0ADT2_A3379ProForTnq = new byte[1] ;
      P0ADT2_A1645ProForNro = new byte[1] ;
      P0ADT2_A5358ProForClv = new String[] {""} ;
      P0ADT2_A763ProForCla = new String[] {""} ;
      P0ADT2_A488ForPrdDsc = new String[] {""} ;
      P0ADT2_n488ForPrdDsc = new boolean[] {false} ;
      P0ADT2_A490ForPrdUMe = new byte[1] ;
      P0ADT2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADT2_A765ProForDes = new String[] {""} ;
      P0ADT2_A767ProForLin = new short[1] ;
      AV31Option = "" ;
      P0ADT3_A396EmprCod = new String[] {""} ;
      P0ADT3_A764ProForCod = new String[] {""} ;
      P0ADT3_A765ProForDes = new String[] {""} ;
      P0ADT3_A3379ProForTnq = new byte[1] ;
      P0ADT3_A1645ProForNro = new byte[1] ;
      P0ADT3_A5358ProForClv = new String[] {""} ;
      P0ADT3_A763ProForCla = new String[] {""} ;
      P0ADT3_A488ForPrdDsc = new String[] {""} ;
      P0ADT3_n488ForPrdDsc = new boolean[] {false} ;
      P0ADT3_A490ForPrdUMe = new byte[1] ;
      P0ADT3_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADT3_A770ProForPrd = new String[] {""} ;
      P0ADT3_A767ProForLin = new short[1] ;
      P0ADT4_A490ForPrdUMe = new byte[1] ;
      P0ADT4_A396EmprCod = new String[] {""} ;
      P0ADT4_A764ProForCod = new String[] {""} ;
      P0ADT4_A3379ProForTnq = new byte[1] ;
      P0ADT4_A1645ProForNro = new byte[1] ;
      P0ADT4_A5358ProForClv = new String[] {""} ;
      P0ADT4_A763ProForCla = new String[] {""} ;
      P0ADT4_A488ForPrdDsc = new String[] {""} ;
      P0ADT4_n488ForPrdDsc = new boolean[] {false} ;
      P0ADT4_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADT4_A765ProForDes = new String[] {""} ;
      P0ADT4_A770ProForPrd = new String[] {""} ;
      P0ADT4_A767ProForLin = new short[1] ;
      P0ADT5_A396EmprCod = new String[] {""} ;
      P0ADT5_A764ProForCod = new String[] {""} ;
      P0ADT5_A763ProForCla = new String[] {""} ;
      P0ADT5_A3379ProForTnq = new byte[1] ;
      P0ADT5_A1645ProForNro = new byte[1] ;
      P0ADT5_A5358ProForClv = new String[] {""} ;
      P0ADT5_A488ForPrdDsc = new String[] {""} ;
      P0ADT5_n488ForPrdDsc = new boolean[] {false} ;
      P0ADT5_A490ForPrdUMe = new byte[1] ;
      P0ADT5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADT5_A765ProForDes = new String[] {""} ;
      P0ADT5_A770ProForPrd = new String[] {""} ;
      P0ADT5_A767ProForLin = new short[1] ;
      P0ADT6_A396EmprCod = new String[] {""} ;
      P0ADT6_A764ProForCod = new String[] {""} ;
      P0ADT6_A5358ProForClv = new String[] {""} ;
      P0ADT6_A3379ProForTnq = new byte[1] ;
      P0ADT6_A1645ProForNro = new byte[1] ;
      P0ADT6_A763ProForCla = new String[] {""} ;
      P0ADT6_A488ForPrdDsc = new String[] {""} ;
      P0ADT6_n488ForPrdDsc = new boolean[] {false} ;
      P0ADT6_A490ForPrdUMe = new byte[1] ;
      P0ADT6_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADT6_A765ProForDes = new String[] {""} ;
      P0ADT6_A770ProForPrd = new String[] {""} ;
      P0ADT6_A767ProForLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.verprocesoquimicogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADT2_A396EmprCod, P0ADT2_A764ProForCod, P0ADT2_A770ProForPrd, P0ADT2_A3379ProForTnq, P0ADT2_A1645ProForNro, P0ADT2_A5358ProForClv, P0ADT2_A763ProForCla, P0ADT2_A488ForPrdDsc, P0ADT2_n488ForPrdDsc, P0ADT2_A490ForPrdUMe,
            P0ADT2_A762ProForCan, P0ADT2_A765ProForDes, P0ADT2_A767ProForLin
            }
            , new Object[] {
            P0ADT3_A396EmprCod, P0ADT3_A764ProForCod, P0ADT3_A765ProForDes, P0ADT3_A3379ProForTnq, P0ADT3_A1645ProForNro, P0ADT3_A5358ProForClv, P0ADT3_A763ProForCla, P0ADT3_A488ForPrdDsc, P0ADT3_n488ForPrdDsc, P0ADT3_A490ForPrdUMe,
            P0ADT3_A762ProForCan, P0ADT3_A770ProForPrd, P0ADT3_A767ProForLin
            }
            , new Object[] {
            P0ADT4_A490ForPrdUMe, P0ADT4_A396EmprCod, P0ADT4_A764ProForCod, P0ADT4_A3379ProForTnq, P0ADT4_A1645ProForNro, P0ADT4_A5358ProForClv, P0ADT4_A763ProForCla, P0ADT4_A488ForPrdDsc, P0ADT4_n488ForPrdDsc, P0ADT4_A762ProForCan,
            P0ADT4_A765ProForDes, P0ADT4_A770ProForPrd, P0ADT4_A767ProForLin
            }
            , new Object[] {
            P0ADT5_A396EmprCod, P0ADT5_A764ProForCod, P0ADT5_A763ProForCla, P0ADT5_A3379ProForTnq, P0ADT5_A1645ProForNro, P0ADT5_A5358ProForClv, P0ADT5_A488ForPrdDsc, P0ADT5_n488ForPrdDsc, P0ADT5_A490ForPrdUMe, P0ADT5_A762ProForCan,
            P0ADT5_A765ProForDes, P0ADT5_A770ProForPrd, P0ADT5_A767ProForLin
            }
            , new Object[] {
            P0ADT6_A396EmprCod, P0ADT6_A764ProForCod, P0ADT6_A5358ProForClv, P0ADT6_A3379ProForTnq, P0ADT6_A1645ProForNro, P0ADT6_A763ProForCla, P0ADT6_A488ForPrdDsc, P0ADT6_n488ForPrdDsc, P0ADT6_A490ForPrdUMe, P0ADT6_A762ProForCan,
            P0ADT6_A765ProForDes, P0ADT6_A770ProForPrd, P0ADT6_A767ProForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFForPrdUMe ;
   private byte AV19TFForPrdUMe_To ;
   private byte AV26TFProForNro ;
   private byte AV27TFProForNro_To ;
   private byte AV28TFProForTnq ;
   private byte AV29TFProForTnq_To ;
   private byte AV63Verprocesoquimicods_9_tfforprdume ;
   private byte AV64Verprocesoquimicods_10_tfforprdume_to ;
   private byte AV71Verprocesoquimicods_17_tfprofornro ;
   private byte AV72Verprocesoquimicods_18_tfprofornro_to ;
   private byte AV73Verprocesoquimicods_19_tfprofortnq ;
   private byte AV74Verprocesoquimicods_20_tfprofortnq_to ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private short AV10TFProForLin ;
   private short AV11TFProForLin_To ;
   private short AV55Verprocesoquimicods_1_tfproforlin ;
   private short AV56Verprocesoquimicods_2_tfproforlin_to ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV30InsertIndex ;
   private long AV36count ;
   private java.math.BigDecimal AV16TFProForCan ;
   private java.math.BigDecimal AV17TFProForCan_To ;
   private java.math.BigDecimal AV61Verprocesoquimicods_7_tfproforcan ;
   private java.math.BigDecimal AV62Verprocesoquimicods_8_tfproforcan_to ;
   private java.math.BigDecimal A762ProForCan ;
   private String AV12TFProForPrd ;
   private String AV13TFProForPrd_Sel ;
   private String AV14TFProForDes ;
   private String AV15TFProForDes_Sel ;
   private String AV20TFForPrdDsc ;
   private String AV21TFForPrdDsc_Sel ;
   private String AV22TFProForCla ;
   private String AV23TFProForCla_Sel ;
   private String AV24TFProForClv ;
   private String AV25TFProForClv_Sel ;
   private String A770ProForPrd ;
   private String AV57Verprocesoquimicods_3_tfproforprd ;
   private String AV58Verprocesoquimicods_4_tfproforprd_sel ;
   private String AV59Verprocesoquimicods_5_tfprofordes ;
   private String AV60Verprocesoquimicods_6_tfprofordes_sel ;
   private String AV65Verprocesoquimicods_11_tfforprddsc ;
   private String AV66Verprocesoquimicods_12_tfforprddsc_sel ;
   private String AV67Verprocesoquimicods_13_tfproforcla ;
   private String AV68Verprocesoquimicods_14_tfproforcla_sel ;
   private String AV69Verprocesoquimicods_15_tfproforclv ;
   private String AV70Verprocesoquimicods_16_tfproforclv_sel ;
   private String scmdbuf ;
   private String lV57Verprocesoquimicods_3_tfproforprd ;
   private String lV59Verprocesoquimicods_5_tfprofordes ;
   private String lV65Verprocesoquimicods_11_tfforprddsc ;
   private String lV67Verprocesoquimicods_13_tfproforcla ;
   private String lV69Verprocesoquimicods_15_tfproforclv ;
   private String A765ProForDes ;
   private String A488ForPrdDsc ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A396EmprCod ;
   private String AV49EmprCod ;
   private String A764ProForCod ;
   private String AV50ProForCod ;
   private boolean returnInSub ;
   private boolean brkADT2 ;
   private boolean n488ForPrdDsc ;
   private boolean brkADT4 ;
   private boolean brkADT6 ;
   private boolean brkADT8 ;
   private boolean brkADT10 ;
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
   private String[] P0ADT2_A396EmprCod ;
   private String[] P0ADT2_A764ProForCod ;
   private String[] P0ADT2_A770ProForPrd ;
   private byte[] P0ADT2_A3379ProForTnq ;
   private byte[] P0ADT2_A1645ProForNro ;
   private String[] P0ADT2_A5358ProForClv ;
   private String[] P0ADT2_A763ProForCla ;
   private String[] P0ADT2_A488ForPrdDsc ;
   private boolean[] P0ADT2_n488ForPrdDsc ;
   private byte[] P0ADT2_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0ADT2_A762ProForCan ;
   private String[] P0ADT2_A765ProForDes ;
   private short[] P0ADT2_A767ProForLin ;
   private String[] P0ADT3_A396EmprCod ;
   private String[] P0ADT3_A764ProForCod ;
   private String[] P0ADT3_A765ProForDes ;
   private byte[] P0ADT3_A3379ProForTnq ;
   private byte[] P0ADT3_A1645ProForNro ;
   private String[] P0ADT3_A5358ProForClv ;
   private String[] P0ADT3_A763ProForCla ;
   private String[] P0ADT3_A488ForPrdDsc ;
   private boolean[] P0ADT3_n488ForPrdDsc ;
   private byte[] P0ADT3_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0ADT3_A762ProForCan ;
   private String[] P0ADT3_A770ProForPrd ;
   private short[] P0ADT3_A767ProForLin ;
   private byte[] P0ADT4_A490ForPrdUMe ;
   private String[] P0ADT4_A396EmprCod ;
   private String[] P0ADT4_A764ProForCod ;
   private byte[] P0ADT4_A3379ProForTnq ;
   private byte[] P0ADT4_A1645ProForNro ;
   private String[] P0ADT4_A5358ProForClv ;
   private String[] P0ADT4_A763ProForCla ;
   private String[] P0ADT4_A488ForPrdDsc ;
   private boolean[] P0ADT4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0ADT4_A762ProForCan ;
   private String[] P0ADT4_A765ProForDes ;
   private String[] P0ADT4_A770ProForPrd ;
   private short[] P0ADT4_A767ProForLin ;
   private String[] P0ADT5_A396EmprCod ;
   private String[] P0ADT5_A764ProForCod ;
   private String[] P0ADT5_A763ProForCla ;
   private byte[] P0ADT5_A3379ProForTnq ;
   private byte[] P0ADT5_A1645ProForNro ;
   private String[] P0ADT5_A5358ProForClv ;
   private String[] P0ADT5_A488ForPrdDsc ;
   private boolean[] P0ADT5_n488ForPrdDsc ;
   private byte[] P0ADT5_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0ADT5_A762ProForCan ;
   private String[] P0ADT5_A765ProForDes ;
   private String[] P0ADT5_A770ProForPrd ;
   private short[] P0ADT5_A767ProForLin ;
   private String[] P0ADT6_A396EmprCod ;
   private String[] P0ADT6_A764ProForCod ;
   private String[] P0ADT6_A5358ProForClv ;
   private byte[] P0ADT6_A3379ProForTnq ;
   private byte[] P0ADT6_A1645ProForNro ;
   private String[] P0ADT6_A763ProForCla ;
   private String[] P0ADT6_A488ForPrdDsc ;
   private boolean[] P0ADT6_n488ForPrdDsc ;
   private byte[] P0ADT6_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0ADT6_A762ProForCan ;
   private String[] P0ADT6_A765ProForDes ;
   private String[] P0ADT6_A770ProForPrd ;
   private short[] P0ADT6_A767ProForLin ;
   private GXSimpleCollection<String> AV32Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV35OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class verprocesoquimicogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Verprocesoquimicods_1_tfproforlin ,
                                          short AV56Verprocesoquimicods_2_tfproforlin_to ,
                                          String AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                          String AV57Verprocesoquimicods_3_tfproforprd ,
                                          String AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                          String AV59Verprocesoquimicods_5_tfprofordes ,
                                          java.math.BigDecimal AV61Verprocesoquimicods_7_tfproforcan ,
                                          java.math.BigDecimal AV62Verprocesoquimicods_8_tfproforcan_to ,
                                          byte AV63Verprocesoquimicods_9_tfforprdume ,
                                          byte AV64Verprocesoquimicods_10_tfforprdume_to ,
                                          String AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                          String AV65Verprocesoquimicods_11_tfforprddsc ,
                                          String AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                          String AV67Verprocesoquimicods_13_tfproforcla ,
                                          String AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                          String AV69Verprocesoquimicods_15_tfproforclv ,
                                          byte AV71Verprocesoquimicods_17_tfprofornro ,
                                          byte AV72Verprocesoquimicods_18_tfprofornro_to ,
                                          byte AV73Verprocesoquimicods_19_tfprofortnq ,
                                          byte AV74Verprocesoquimicods_20_tfprofortnq_to ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          String A764ProForCod ,
                                          String AV50ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.ProForPrd, T1.ProForTnq, T1.ProForNro, T1.ProForClv, T1.ProForCla, T2.ForPrdDsc, T1.ForPrdUMe, T1.ProForCan, T1.ProForDes, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV55Verprocesoquimicods_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV56Verprocesoquimicods_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV57Verprocesoquimicods_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV59Verprocesoquimicods_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Verprocesoquimicods_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Verprocesoquimicods_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Verprocesoquimicods_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV64Verprocesoquimicods_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Verprocesoquimicods_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV67Verprocesoquimicods_13_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV69Verprocesoquimicods_15_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Verprocesoquimicods_17_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Verprocesoquimicods_18_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Verprocesoquimicods_19_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Verprocesoquimicods_20_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForPrd" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ADT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Verprocesoquimicods_1_tfproforlin ,
                                          short AV56Verprocesoquimicods_2_tfproforlin_to ,
                                          String AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                          String AV57Verprocesoquimicods_3_tfproforprd ,
                                          String AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                          String AV59Verprocesoquimicods_5_tfprofordes ,
                                          java.math.BigDecimal AV61Verprocesoquimicods_7_tfproforcan ,
                                          java.math.BigDecimal AV62Verprocesoquimicods_8_tfproforcan_to ,
                                          byte AV63Verprocesoquimicods_9_tfforprdume ,
                                          byte AV64Verprocesoquimicods_10_tfforprdume_to ,
                                          String AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                          String AV65Verprocesoquimicods_11_tfforprddsc ,
                                          String AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                          String AV67Verprocesoquimicods_13_tfproforcla ,
                                          String AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                          String AV69Verprocesoquimicods_15_tfproforclv ,
                                          byte AV71Verprocesoquimicods_17_tfprofornro ,
                                          byte AV72Verprocesoquimicods_18_tfprofornro_to ,
                                          byte AV73Verprocesoquimicods_19_tfprofortnq ,
                                          byte AV74Verprocesoquimicods_20_tfprofortnq_to ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          String A764ProForCod ,
                                          String AV50ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.ProForDes, T1.ProForTnq, T1.ProForNro, T1.ProForClv, T1.ProForCla, T2.ForPrdDsc, T1.ForPrdUMe, T1.ProForCan, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV55Verprocesoquimicods_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV56Verprocesoquimicods_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV57Verprocesoquimicods_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV59Verprocesoquimicods_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Verprocesoquimicods_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Verprocesoquimicods_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Verprocesoquimicods_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV64Verprocesoquimicods_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Verprocesoquimicods_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV67Verprocesoquimicods_13_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV69Verprocesoquimicods_15_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Verprocesoquimicods_17_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Verprocesoquimicods_18_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Verprocesoquimicods_19_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Verprocesoquimicods_20_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForDes" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ADT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Verprocesoquimicods_1_tfproforlin ,
                                          short AV56Verprocesoquimicods_2_tfproforlin_to ,
                                          String AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                          String AV57Verprocesoquimicods_3_tfproforprd ,
                                          String AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                          String AV59Verprocesoquimicods_5_tfprofordes ,
                                          java.math.BigDecimal AV61Verprocesoquimicods_7_tfproforcan ,
                                          java.math.BigDecimal AV62Verprocesoquimicods_8_tfproforcan_to ,
                                          byte AV63Verprocesoquimicods_9_tfforprdume ,
                                          byte AV64Verprocesoquimicods_10_tfforprdume_to ,
                                          String AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                          String AV65Verprocesoquimicods_11_tfforprddsc ,
                                          String AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                          String AV67Verprocesoquimicods_13_tfproforcla ,
                                          String AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                          String AV69Verprocesoquimicods_15_tfproforclv ,
                                          byte AV71Verprocesoquimicods_17_tfprofornro ,
                                          byte AV72Verprocesoquimicods_18_tfprofornro_to ,
                                          byte AV73Verprocesoquimicods_19_tfprofortnq ,
                                          byte AV74Verprocesoquimicods_20_tfprofortnq_to ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A764ProForCod ,
                                          String AV50ProForCod ,
                                          String AV49EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForTnq, T1.ProForNro, T1.ProForClv, T1.ProForCla, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV55Verprocesoquimicods_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV56Verprocesoquimicods_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV57Verprocesoquimicods_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV59Verprocesoquimicods_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Verprocesoquimicods_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Verprocesoquimicods_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Verprocesoquimicods_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV64Verprocesoquimicods_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Verprocesoquimicods_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV67Verprocesoquimicods_13_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV69Verprocesoquimicods_15_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Verprocesoquimicods_17_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Verprocesoquimicods_18_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Verprocesoquimicods_19_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Verprocesoquimicods_20_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0ADT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Verprocesoquimicods_1_tfproforlin ,
                                          short AV56Verprocesoquimicods_2_tfproforlin_to ,
                                          String AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                          String AV57Verprocesoquimicods_3_tfproforprd ,
                                          String AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                          String AV59Verprocesoquimicods_5_tfprofordes ,
                                          java.math.BigDecimal AV61Verprocesoquimicods_7_tfproforcan ,
                                          java.math.BigDecimal AV62Verprocesoquimicods_8_tfproforcan_to ,
                                          byte AV63Verprocesoquimicods_9_tfforprdume ,
                                          byte AV64Verprocesoquimicods_10_tfforprdume_to ,
                                          String AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                          String AV65Verprocesoquimicods_11_tfforprddsc ,
                                          String AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                          String AV67Verprocesoquimicods_13_tfproforcla ,
                                          String AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                          String AV69Verprocesoquimicods_15_tfproforclv ,
                                          byte AV71Verprocesoquimicods_17_tfprofornro ,
                                          byte AV72Verprocesoquimicods_18_tfprofornro_to ,
                                          byte AV73Verprocesoquimicods_19_tfprofortnq ,
                                          byte AV74Verprocesoquimicods_20_tfprofortnq_to ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          String A764ProForCod ,
                                          String AV50ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.ProForCla, T1.ProForTnq, T1.ProForNro, T1.ProForClv, T2.ForPrdDsc, T1.ForPrdUMe, T1.ProForCan, T1.ProForDes, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV55Verprocesoquimicods_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV56Verprocesoquimicods_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV57Verprocesoquimicods_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV59Verprocesoquimicods_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Verprocesoquimicods_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Verprocesoquimicods_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Verprocesoquimicods_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV64Verprocesoquimicods_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Verprocesoquimicods_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV67Verprocesoquimicods_13_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV69Verprocesoquimicods_15_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Verprocesoquimicods_17_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Verprocesoquimicods_18_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Verprocesoquimicods_19_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Verprocesoquimicods_20_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForCla" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0ADT6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Verprocesoquimicods_1_tfproforlin ,
                                          short AV56Verprocesoquimicods_2_tfproforlin_to ,
                                          String AV58Verprocesoquimicods_4_tfproforprd_sel ,
                                          String AV57Verprocesoquimicods_3_tfproforprd ,
                                          String AV60Verprocesoquimicods_6_tfprofordes_sel ,
                                          String AV59Verprocesoquimicods_5_tfprofordes ,
                                          java.math.BigDecimal AV61Verprocesoquimicods_7_tfproforcan ,
                                          java.math.BigDecimal AV62Verprocesoquimicods_8_tfproforcan_to ,
                                          byte AV63Verprocesoquimicods_9_tfforprdume ,
                                          byte AV64Verprocesoquimicods_10_tfforprdume_to ,
                                          String AV66Verprocesoquimicods_12_tfforprddsc_sel ,
                                          String AV65Verprocesoquimicods_11_tfforprddsc ,
                                          String AV68Verprocesoquimicods_14_tfproforcla_sel ,
                                          String AV67Verprocesoquimicods_13_tfproforcla ,
                                          String AV70Verprocesoquimicods_16_tfproforclv_sel ,
                                          String AV69Verprocesoquimicods_15_tfproforclv ,
                                          byte AV71Verprocesoquimicods_17_tfprofornro ,
                                          byte AV72Verprocesoquimicods_18_tfprofornro_to ,
                                          byte AV73Verprocesoquimicods_19_tfprofortnq ,
                                          byte AV74Verprocesoquimicods_20_tfprofortnq_to ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          String A764ProForCod ,
                                          String AV50ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[22];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.ProForClv, T1.ProForTnq, T1.ProForNro, T1.ProForCla, T2.ForPrdDsc, T1.ForPrdUMe, T1.ProForCan, T1.ProForDes, T1.ProForPrd, T1.ProForLin" ;
      scmdbuf += " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV55Verprocesoquimicods_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV56Verprocesoquimicods_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV57Verprocesoquimicods_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Verprocesoquimicods_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV59Verprocesoquimicods_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Verprocesoquimicods_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Verprocesoquimicods_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Verprocesoquimicods_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Verprocesoquimicods_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV64Verprocesoquimicods_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Verprocesoquimicods_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Verprocesoquimicods_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV67Verprocesoquimicods_13_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Verprocesoquimicods_14_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV69Verprocesoquimicods_15_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Verprocesoquimicods_16_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Verprocesoquimicods_17_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Verprocesoquimicods_18_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Verprocesoquimicods_19_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Verprocesoquimicods_20_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
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
                  return conditional_P0ADT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_P0ADT3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 2 :
                  return conditional_P0ADT4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 3 :
                  return conditional_P0ADT5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 4 :
                  return conditional_P0ADT6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADT6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               return;
      }
   }

}

