package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mtoformulastinte_procesoswwgetfilterdata extends GXProcedure
{
   public mtoformulastinte_procesoswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastinte_procesoswwgetfilterdata.class ), "" );
   }

   public mtoformulastinte_procesoswwgetfilterdata( int remoteHandle ,
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
      mtoformulastinte_procesoswwgetfilterdata.this.aP5 = new String[] {""};
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
      mtoformulastinte_procesoswwgetfilterdata.this.AV32DDOName = aP0;
      mtoformulastinte_procesoswwgetfilterdata.this.AV30SearchTxt = aP1;
      mtoformulastinte_procesoswwgetfilterdata.this.AV31SearchTxtTo = aP2;
      mtoformulastinte_procesoswwgetfilterdata.this.aP3 = aP3;
      mtoformulastinte_procesoswwgetfilterdata.this.aP4 = aP4;
      mtoformulastinte_procesoswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV18TFForSer = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV19TFForSer_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV20TFForSerDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV21TFForSerDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV22TFForColNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV23TFForColNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV24TFForColNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFForColNum_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV26TFTipColCod = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFTipColCod_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTLIN") == 0 )
         {
            AV28TFForUltLin = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFForUltLin_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV30SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV48FilterFullText ;
      AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV12TFEmprNom ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV14TFCliCod ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV16TFCliNom ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV18TFForSer ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV19TFForSer_Sel ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV20TFForSerDsc ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV22TFForColNom ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV24TFForColNum ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV26TFTipColCod ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV28TFForUltLin ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV29TFForUltLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095D2 */
      pr_default.execute(0, new Object[] {lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk95D2 = false ;
         A396EmprCod = P095D2_A396EmprCod[0] ;
         A1159ForUltLin = P095D2_A1159ForUltLin[0] ;
         n1159ForUltLin = P095D2_n1159ForUltLin[0] ;
         A831TipColCod = P095D2_A831TipColCod[0] ;
         A483ForColNum = P095D2_A483ForColNum[0] ;
         A482ForColNom = P095D2_A482ForColNom[0] ;
         A5742ForSerDsc = P095D2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095D2_n5742ForSerDsc[0] ;
         A494ForSer = P095D2_A494ForSer[0] ;
         A279CliNom = P095D2_A279CliNom[0] ;
         A252CliCod = P095D2_A252CliCod[0] ;
         A407EmprNom = P095D2_A407EmprNom[0] ;
         n407EmprNom = P095D2_n407EmprNom[0] ;
         A407EmprNom = P095D2_A407EmprNom[0] ;
         n407EmprNom = P095D2_n407EmprNom[0] ;
         A279CliNom = P095D2_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P095D2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk95D2 = false ;
            A831TipColCod = P095D2_A831TipColCod[0] ;
            A483ForColNum = P095D2_A483ForColNum[0] ;
            A482ForColNom = P095D2_A482ForColNom[0] ;
            A494ForSer = P095D2_A494ForSer[0] ;
            A252CliCod = P095D2_A252CliCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk95D2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV34Option = A396EmprCod ;
            AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV38OptionsDesc.add(AV37OptionDesc, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95D2 )
         {
            brk95D2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV30SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV48FilterFullText ;
      AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV12TFEmprNom ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV14TFCliCod ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV16TFCliNom ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV18TFForSer ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV19TFForSer_Sel ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV20TFForSerDsc ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV22TFForColNom ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV24TFForColNum ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV26TFTipColCod ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV28TFForUltLin ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV29TFForUltLin_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095D3 */
      pr_default.execute(1, new Object[] {lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk95D4 = false ;
         A407EmprNom = P095D3_A407EmprNom[0] ;
         n407EmprNom = P095D3_n407EmprNom[0] ;
         A1159ForUltLin = P095D3_A1159ForUltLin[0] ;
         n1159ForUltLin = P095D3_n1159ForUltLin[0] ;
         A831TipColCod = P095D3_A831TipColCod[0] ;
         A483ForColNum = P095D3_A483ForColNum[0] ;
         A482ForColNom = P095D3_A482ForColNom[0] ;
         A5742ForSerDsc = P095D3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095D3_n5742ForSerDsc[0] ;
         A494ForSer = P095D3_A494ForSer[0] ;
         A279CliNom = P095D3_A279CliNom[0] ;
         A252CliCod = P095D3_A252CliCod[0] ;
         A396EmprCod = P095D3_A396EmprCod[0] ;
         A407EmprNom = P095D3_A407EmprNom[0] ;
         n407EmprNom = P095D3_n407EmprNom[0] ;
         A279CliNom = P095D3_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P095D3_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk95D4 = false ;
            A831TipColCod = P095D3_A831TipColCod[0] ;
            A483ForColNum = P095D3_A483ForColNum[0] ;
            A482ForColNom = P095D3_A482ForColNom[0] ;
            A494ForSer = P095D3_A494ForSer[0] ;
            A252CliCod = P095D3_A252CliCod[0] ;
            A396EmprCod = P095D3_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk95D4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV34Option = A407EmprNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95D4 )
         {
            brk95D4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV30SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV48FilterFullText ;
      AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV12TFEmprNom ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV14TFCliCod ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV16TFCliNom ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV18TFForSer ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV19TFForSer_Sel ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV20TFForSerDsc ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV22TFForColNom ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV24TFForColNum ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV26TFTipColCod ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV28TFForUltLin ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV29TFForUltLin_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095D4 */
      pr_default.execute(2, new Object[] {lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk95D6 = false ;
         A279CliNom = P095D4_A279CliNom[0] ;
         A1159ForUltLin = P095D4_A1159ForUltLin[0] ;
         n1159ForUltLin = P095D4_n1159ForUltLin[0] ;
         A831TipColCod = P095D4_A831TipColCod[0] ;
         A483ForColNum = P095D4_A483ForColNum[0] ;
         A482ForColNom = P095D4_A482ForColNom[0] ;
         A5742ForSerDsc = P095D4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095D4_n5742ForSerDsc[0] ;
         A494ForSer = P095D4_A494ForSer[0] ;
         A252CliCod = P095D4_A252CliCod[0] ;
         A407EmprNom = P095D4_A407EmprNom[0] ;
         n407EmprNom = P095D4_n407EmprNom[0] ;
         A396EmprCod = P095D4_A396EmprCod[0] ;
         A407EmprNom = P095D4_A407EmprNom[0] ;
         n407EmprNom = P095D4_n407EmprNom[0] ;
         A279CliNom = P095D4_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P095D4_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk95D6 = false ;
            A831TipColCod = P095D4_A831TipColCod[0] ;
            A483ForColNum = P095D4_A483ForColNum[0] ;
            A482ForColNom = P095D4_A482ForColNom[0] ;
            A494ForSer = P095D4_A494ForSer[0] ;
            A252CliCod = P095D4_A252CliCod[0] ;
            A396EmprCod = P095D4_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk95D6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV34Option = A279CliNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95D6 )
         {
            brk95D6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV18TFForSer = AV30SearchTxt ;
      AV19TFForSer_Sel = "" ;
      AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV48FilterFullText ;
      AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV12TFEmprNom ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV14TFCliCod ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV16TFCliNom ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV18TFForSer ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV19TFForSer_Sel ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV20TFForSerDsc ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV22TFForColNom ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV24TFForColNum ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV26TFTipColCod ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV28TFForUltLin ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV29TFForUltLin_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095D5 */
      pr_default.execute(3, new Object[] {lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk95D8 = false ;
         A494ForSer = P095D5_A494ForSer[0] ;
         A1159ForUltLin = P095D5_A1159ForUltLin[0] ;
         n1159ForUltLin = P095D5_n1159ForUltLin[0] ;
         A831TipColCod = P095D5_A831TipColCod[0] ;
         A483ForColNum = P095D5_A483ForColNum[0] ;
         A482ForColNom = P095D5_A482ForColNom[0] ;
         A5742ForSerDsc = P095D5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095D5_n5742ForSerDsc[0] ;
         A279CliNom = P095D5_A279CliNom[0] ;
         A252CliCod = P095D5_A252CliCod[0] ;
         A407EmprNom = P095D5_A407EmprNom[0] ;
         n407EmprNom = P095D5_n407EmprNom[0] ;
         A396EmprCod = P095D5_A396EmprCod[0] ;
         A407EmprNom = P095D5_A407EmprNom[0] ;
         n407EmprNom = P095D5_n407EmprNom[0] ;
         A279CliNom = P095D5_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P095D5_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk95D8 = false ;
            A831TipColCod = P095D5_A831TipColCod[0] ;
            A483ForColNum = P095D5_A483ForColNum[0] ;
            A482ForColNom = P095D5_A482ForColNom[0] ;
            A252CliCod = P095D5_A252CliCod[0] ;
            A396EmprCod = P095D5_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk95D8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV34Option = A494ForSer ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95D8 )
         {
            brk95D8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFForSerDsc = AV30SearchTxt ;
      AV21TFForSerDsc_Sel = "" ;
      AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV48FilterFullText ;
      AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV12TFEmprNom ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV14TFCliCod ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV16TFCliNom ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV18TFForSer ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV19TFForSer_Sel ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV20TFForSerDsc ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV22TFForColNom ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV24TFForColNum ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV26TFTipColCod ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV28TFForUltLin ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV29TFForUltLin_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095D6 */
      pr_default.execute(4, new Object[] {lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk95D10 = false ;
         A5742ForSerDsc = P095D6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095D6_n5742ForSerDsc[0] ;
         A1159ForUltLin = P095D6_A1159ForUltLin[0] ;
         n1159ForUltLin = P095D6_n1159ForUltLin[0] ;
         A831TipColCod = P095D6_A831TipColCod[0] ;
         A483ForColNum = P095D6_A483ForColNum[0] ;
         A482ForColNom = P095D6_A482ForColNom[0] ;
         A494ForSer = P095D6_A494ForSer[0] ;
         A279CliNom = P095D6_A279CliNom[0] ;
         A252CliCod = P095D6_A252CliCod[0] ;
         A407EmprNom = P095D6_A407EmprNom[0] ;
         n407EmprNom = P095D6_n407EmprNom[0] ;
         A396EmprCod = P095D6_A396EmprCod[0] ;
         A407EmprNom = P095D6_A407EmprNom[0] ;
         n407EmprNom = P095D6_n407EmprNom[0] ;
         A279CliNom = P095D6_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P095D6_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk95D10 = false ;
            A831TipColCod = P095D6_A831TipColCod[0] ;
            A483ForColNum = P095D6_A483ForColNum[0] ;
            A482ForColNom = P095D6_A482ForColNom[0] ;
            A494ForSer = P095D6_A494ForSer[0] ;
            A252CliCod = P095D6_A252CliCod[0] ;
            A396EmprCod = P095D6_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk95D10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV34Option = A5742ForSerDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95D10 )
         {
            brk95D10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFForColNom = AV30SearchTxt ;
      AV23TFForColNom_Sel = "" ;
      AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV48FilterFullText ;
      AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV12TFEmprNom ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV14TFCliCod ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV16TFCliNom ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV18TFForSer ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV19TFForSer_Sel ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV20TFForSerDsc ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV22TFForColNom ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV24TFForColNum ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV26TFTipColCod ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV28TFForUltLin ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV29TFForUltLin_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095D7 */
      pr_default.execute(5, new Object[] {lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk95D12 = false ;
         A482ForColNom = P095D7_A482ForColNom[0] ;
         A1159ForUltLin = P095D7_A1159ForUltLin[0] ;
         n1159ForUltLin = P095D7_n1159ForUltLin[0] ;
         A831TipColCod = P095D7_A831TipColCod[0] ;
         A483ForColNum = P095D7_A483ForColNum[0] ;
         A5742ForSerDsc = P095D7_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095D7_n5742ForSerDsc[0] ;
         A494ForSer = P095D7_A494ForSer[0] ;
         A279CliNom = P095D7_A279CliNom[0] ;
         A252CliCod = P095D7_A252CliCod[0] ;
         A407EmprNom = P095D7_A407EmprNom[0] ;
         n407EmprNom = P095D7_n407EmprNom[0] ;
         A396EmprCod = P095D7_A396EmprCod[0] ;
         A407EmprNom = P095D7_A407EmprNom[0] ;
         n407EmprNom = P095D7_n407EmprNom[0] ;
         A279CliNom = P095D7_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P095D7_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk95D12 = false ;
            A831TipColCod = P095D7_A831TipColCod[0] ;
            A483ForColNum = P095D7_A483ForColNum[0] ;
            A494ForSer = P095D7_A494ForSer[0] ;
            A252CliCod = P095D7_A252CliCod[0] ;
            A396EmprCod = P095D7_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk95D12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV34Option = A482ForColNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95D12 )
         {
            brk95D12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mtoformulastinte_procesoswwgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = mtoformulastinte_procesoswwgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = mtoformulastinte_procesoswwgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFForSer = "" ;
      AV19TFForSer_Sel = "" ;
      AV20TFForSerDsc = "" ;
      AV21TFForSerDsc_Sel = "" ;
      AV22TFForColNom = "" ;
      AV23TFForColNom_Sel = "" ;
      A396EmprCod = "" ;
      AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = "" ;
      AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = "" ;
      AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = "" ;
      AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = "" ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = "" ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = "" ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = "" ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = "" ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = "" ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = "" ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = "" ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = "" ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = "" ;
      scmdbuf = "" ;
      lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = "" ;
      lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = "" ;
      lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = "" ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = "" ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = "" ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = "" ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      P095D2_A396EmprCod = new String[] {""} ;
      P095D2_A1159ForUltLin = new short[1] ;
      P095D2_n1159ForUltLin = new boolean[] {false} ;
      P095D2_A831TipColCod = new byte[1] ;
      P095D2_A483ForColNum = new int[1] ;
      P095D2_A482ForColNom = new String[] {""} ;
      P095D2_A5742ForSerDsc = new String[] {""} ;
      P095D2_n5742ForSerDsc = new boolean[] {false} ;
      P095D2_A494ForSer = new String[] {""} ;
      P095D2_A279CliNom = new String[] {""} ;
      P095D2_A252CliCod = new int[1] ;
      P095D2_A407EmprNom = new String[] {""} ;
      P095D2_n407EmprNom = new boolean[] {false} ;
      AV34Option = "" ;
      AV37OptionDesc = "" ;
      P095D3_A407EmprNom = new String[] {""} ;
      P095D3_n407EmprNom = new boolean[] {false} ;
      P095D3_A1159ForUltLin = new short[1] ;
      P095D3_n1159ForUltLin = new boolean[] {false} ;
      P095D3_A831TipColCod = new byte[1] ;
      P095D3_A483ForColNum = new int[1] ;
      P095D3_A482ForColNom = new String[] {""} ;
      P095D3_A5742ForSerDsc = new String[] {""} ;
      P095D3_n5742ForSerDsc = new boolean[] {false} ;
      P095D3_A494ForSer = new String[] {""} ;
      P095D3_A279CliNom = new String[] {""} ;
      P095D3_A252CliCod = new int[1] ;
      P095D3_A396EmprCod = new String[] {""} ;
      P095D4_A279CliNom = new String[] {""} ;
      P095D4_A1159ForUltLin = new short[1] ;
      P095D4_n1159ForUltLin = new boolean[] {false} ;
      P095D4_A831TipColCod = new byte[1] ;
      P095D4_A483ForColNum = new int[1] ;
      P095D4_A482ForColNom = new String[] {""} ;
      P095D4_A5742ForSerDsc = new String[] {""} ;
      P095D4_n5742ForSerDsc = new boolean[] {false} ;
      P095D4_A494ForSer = new String[] {""} ;
      P095D4_A252CliCod = new int[1] ;
      P095D4_A407EmprNom = new String[] {""} ;
      P095D4_n407EmprNom = new boolean[] {false} ;
      P095D4_A396EmprCod = new String[] {""} ;
      P095D5_A494ForSer = new String[] {""} ;
      P095D5_A1159ForUltLin = new short[1] ;
      P095D5_n1159ForUltLin = new boolean[] {false} ;
      P095D5_A831TipColCod = new byte[1] ;
      P095D5_A483ForColNum = new int[1] ;
      P095D5_A482ForColNom = new String[] {""} ;
      P095D5_A5742ForSerDsc = new String[] {""} ;
      P095D5_n5742ForSerDsc = new boolean[] {false} ;
      P095D5_A279CliNom = new String[] {""} ;
      P095D5_A252CliCod = new int[1] ;
      P095D5_A407EmprNom = new String[] {""} ;
      P095D5_n407EmprNom = new boolean[] {false} ;
      P095D5_A396EmprCod = new String[] {""} ;
      P095D6_A5742ForSerDsc = new String[] {""} ;
      P095D6_n5742ForSerDsc = new boolean[] {false} ;
      P095D6_A1159ForUltLin = new short[1] ;
      P095D6_n1159ForUltLin = new boolean[] {false} ;
      P095D6_A831TipColCod = new byte[1] ;
      P095D6_A483ForColNum = new int[1] ;
      P095D6_A482ForColNom = new String[] {""} ;
      P095D6_A494ForSer = new String[] {""} ;
      P095D6_A279CliNom = new String[] {""} ;
      P095D6_A252CliCod = new int[1] ;
      P095D6_A407EmprNom = new String[] {""} ;
      P095D6_n407EmprNom = new boolean[] {false} ;
      P095D6_A396EmprCod = new String[] {""} ;
      P095D7_A482ForColNom = new String[] {""} ;
      P095D7_A1159ForUltLin = new short[1] ;
      P095D7_n1159ForUltLin = new boolean[] {false} ;
      P095D7_A831TipColCod = new byte[1] ;
      P095D7_A483ForColNum = new int[1] ;
      P095D7_A5742ForSerDsc = new String[] {""} ;
      P095D7_n5742ForSerDsc = new boolean[] {false} ;
      P095D7_A494ForSer = new String[] {""} ;
      P095D7_A279CliNom = new String[] {""} ;
      P095D7_A252CliCod = new int[1] ;
      P095D7_A407EmprNom = new String[] {""} ;
      P095D7_n407EmprNom = new boolean[] {false} ;
      P095D7_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesoswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P095D2_A396EmprCod, P095D2_A1159ForUltLin, P095D2_n1159ForUltLin, P095D2_A831TipColCod, P095D2_A483ForColNum, P095D2_A482ForColNom, P095D2_A5742ForSerDsc, P095D2_n5742ForSerDsc, P095D2_A494ForSer, P095D2_A279CliNom,
            P095D2_A252CliCod, P095D2_A407EmprNom, P095D2_n407EmprNom
            }
            , new Object[] {
            P095D3_A407EmprNom, P095D3_n407EmprNom, P095D3_A1159ForUltLin, P095D3_n1159ForUltLin, P095D3_A831TipColCod, P095D3_A483ForColNum, P095D3_A482ForColNom, P095D3_A5742ForSerDsc, P095D3_n5742ForSerDsc, P095D3_A494ForSer,
            P095D3_A279CliNom, P095D3_A252CliCod, P095D3_A396EmprCod
            }
            , new Object[] {
            P095D4_A279CliNom, P095D4_A1159ForUltLin, P095D4_n1159ForUltLin, P095D4_A831TipColCod, P095D4_A483ForColNum, P095D4_A482ForColNom, P095D4_A5742ForSerDsc, P095D4_n5742ForSerDsc, P095D4_A494ForSer, P095D4_A252CliCod,
            P095D4_A407EmprNom, P095D4_n407EmprNom, P095D4_A396EmprCod
            }
            , new Object[] {
            P095D5_A494ForSer, P095D5_A1159ForUltLin, P095D5_n1159ForUltLin, P095D5_A831TipColCod, P095D5_A483ForColNum, P095D5_A482ForColNom, P095D5_A5742ForSerDsc, P095D5_n5742ForSerDsc, P095D5_A279CliNom, P095D5_A252CliCod,
            P095D5_A407EmprNom, P095D5_n407EmprNom, P095D5_A396EmprCod
            }
            , new Object[] {
            P095D6_A5742ForSerDsc, P095D6_n5742ForSerDsc, P095D6_A1159ForUltLin, P095D6_n1159ForUltLin, P095D6_A831TipColCod, P095D6_A483ForColNum, P095D6_A482ForColNom, P095D6_A494ForSer, P095D6_A279CliNom, P095D6_A252CliCod,
            P095D6_A407EmprNom, P095D6_n407EmprNom, P095D6_A396EmprCod
            }
            , new Object[] {
            P095D7_A482ForColNom, P095D7_A1159ForUltLin, P095D7_n1159ForUltLin, P095D7_A831TipColCod, P095D7_A483ForColNum, P095D7_A5742ForSerDsc, P095D7_n5742ForSerDsc, P095D7_A494ForSer, P095D7_A279CliNom, P095D7_A252CliCod,
            P095D7_A407EmprNom, P095D7_n407EmprNom, P095D7_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26TFTipColCod ;
   private byte AV27TFTipColCod_To ;
   private byte AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ;
   private byte AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short AV28TFForUltLin ;
   private short AV29TFForUltLin_To ;
   private short AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ;
   private short AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ;
   private short A1159ForUltLin ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV24TFForColNum ;
   private int AV25TFForColNum_To ;
   private int AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ;
   private int AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ;
   private int AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ;
   private int AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private long AV42count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFForSer ;
   private String AV19TFForSer_Sel ;
   private String AV20TFForSerDsc ;
   private String AV21TFForSerDsc_Sel ;
   private String AV22TFForColNom ;
   private String AV23TFForColNom_Sel ;
   private String A396EmprCod ;
   private String AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ;
   private String AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ;
   private String AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ;
   private String AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ;
   private String AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ;
   private String AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ;
   private String AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ;
   private String AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ;
   private String AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ;
   private String AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ;
   private String AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ;
   private String AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ;
   private String scmdbuf ;
   private String lV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ;
   private String lV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ;
   private String lV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ;
   private String lV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ;
   private String lV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ;
   private String lV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private boolean returnInSub ;
   private boolean brk95D2 ;
   private boolean n1159ForUltLin ;
   private boolean n5742ForSerDsc ;
   private boolean n407EmprNom ;
   private boolean brk95D4 ;
   private boolean brk95D6 ;
   private boolean brk95D8 ;
   private boolean brk95D10 ;
   private boolean brk95D12 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ;
   private String lV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P095D2_A396EmprCod ;
   private short[] P095D2_A1159ForUltLin ;
   private boolean[] P095D2_n1159ForUltLin ;
   private byte[] P095D2_A831TipColCod ;
   private int[] P095D2_A483ForColNum ;
   private String[] P095D2_A482ForColNom ;
   private String[] P095D2_A5742ForSerDsc ;
   private boolean[] P095D2_n5742ForSerDsc ;
   private String[] P095D2_A494ForSer ;
   private String[] P095D2_A279CliNom ;
   private int[] P095D2_A252CliCod ;
   private String[] P095D2_A407EmprNom ;
   private boolean[] P095D2_n407EmprNom ;
   private String[] P095D3_A407EmprNom ;
   private boolean[] P095D3_n407EmprNom ;
   private short[] P095D3_A1159ForUltLin ;
   private boolean[] P095D3_n1159ForUltLin ;
   private byte[] P095D3_A831TipColCod ;
   private int[] P095D3_A483ForColNum ;
   private String[] P095D3_A482ForColNom ;
   private String[] P095D3_A5742ForSerDsc ;
   private boolean[] P095D3_n5742ForSerDsc ;
   private String[] P095D3_A494ForSer ;
   private String[] P095D3_A279CliNom ;
   private int[] P095D3_A252CliCod ;
   private String[] P095D3_A396EmprCod ;
   private String[] P095D4_A279CliNom ;
   private short[] P095D4_A1159ForUltLin ;
   private boolean[] P095D4_n1159ForUltLin ;
   private byte[] P095D4_A831TipColCod ;
   private int[] P095D4_A483ForColNum ;
   private String[] P095D4_A482ForColNom ;
   private String[] P095D4_A5742ForSerDsc ;
   private boolean[] P095D4_n5742ForSerDsc ;
   private String[] P095D4_A494ForSer ;
   private int[] P095D4_A252CliCod ;
   private String[] P095D4_A407EmprNom ;
   private boolean[] P095D4_n407EmprNom ;
   private String[] P095D4_A396EmprCod ;
   private String[] P095D5_A494ForSer ;
   private short[] P095D5_A1159ForUltLin ;
   private boolean[] P095D5_n1159ForUltLin ;
   private byte[] P095D5_A831TipColCod ;
   private int[] P095D5_A483ForColNum ;
   private String[] P095D5_A482ForColNom ;
   private String[] P095D5_A5742ForSerDsc ;
   private boolean[] P095D5_n5742ForSerDsc ;
   private String[] P095D5_A279CliNom ;
   private int[] P095D5_A252CliCod ;
   private String[] P095D5_A407EmprNom ;
   private boolean[] P095D5_n407EmprNom ;
   private String[] P095D5_A396EmprCod ;
   private String[] P095D6_A5742ForSerDsc ;
   private boolean[] P095D6_n5742ForSerDsc ;
   private short[] P095D6_A1159ForUltLin ;
   private boolean[] P095D6_n1159ForUltLin ;
   private byte[] P095D6_A831TipColCod ;
   private int[] P095D6_A483ForColNum ;
   private String[] P095D6_A482ForColNom ;
   private String[] P095D6_A494ForSer ;
   private String[] P095D6_A279CliNom ;
   private int[] P095D6_A252CliCod ;
   private String[] P095D6_A407EmprNom ;
   private boolean[] P095D6_n407EmprNom ;
   private String[] P095D6_A396EmprCod ;
   private String[] P095D7_A482ForColNom ;
   private short[] P095D7_A1159ForUltLin ;
   private boolean[] P095D7_n1159ForUltLin ;
   private byte[] P095D7_A831TipColCod ;
   private int[] P095D7_A483ForColNum ;
   private String[] P095D7_A5742ForSerDsc ;
   private boolean[] P095D7_n5742ForSerDsc ;
   private String[] P095D7_A494ForSer ;
   private String[] P095D7_A279CliNom ;
   private int[] P095D7_A252CliCod ;
   private String[] P095D7_A407EmprNom ;
   private boolean[] P095D7_n407EmprNom ;
   private String[] P095D7_A396EmprCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class mtoformulastinte_procesoswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod, T2.EmprNom FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P095D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[30];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod, T1.EmprCod FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P095D4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.CliNom, T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod, T2.EmprNom, T1.EmprCod FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P095D5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ForSer, T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T3.CliNom, T1.CliCod, T2.EmprNom, T1.EmprCod FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P095D6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[30];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForSerDsc, T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T3.CliNom, T1.CliCod, T2.EmprNom, T1.EmprCod FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P095D7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[30];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ForColNom, T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod, T2.EmprNom, T1.EmprCod FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P095D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() );
            case 1 :
                  return conditional_P095D3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() );
            case 2 :
                  return conditional_P095D4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() );
            case 3 :
                  return conditional_P095D5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() );
            case 4 :
                  return conditional_P095D6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() );
            case 5 :
                  return conditional_P095D7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095D4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095D5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095D6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095D7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
      }
   }

}

