package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class sustitucionprocesoquimicoformulas_wcgetfilterdata extends GXProcedure
{
   public sustitucionprocesoquimicoformulas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sustitucionprocesoquimicoformulas_wcgetfilterdata.class ), "" );
   }

   public sustitucionprocesoquimicoformulas_wcgetfilterdata( int remoteHandle ,
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
      sustitucionprocesoquimicoformulas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      sustitucionprocesoquimicoformulas_wcgetfilterdata.this.AV43DDOName = aP0;
      sustitucionprocesoquimicoformulas_wcgetfilterdata.this.AV41SearchTxt = aP1;
      sustitucionprocesoquimicoformulas_wcgetfilterdata.this.AV42SearchTxtTo = aP2;
      sustitucionprocesoquimicoformulas_wcgetfilterdata.this.aP3 = aP3;
      sustitucionprocesoquimicoformulas_wcgetfilterdata.this.aP4 = aP4;
      sustitucionprocesoquimicoformulas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV46Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV49OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV51OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV43DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV43DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV43DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV43DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV43DDOName), "DDO_INTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV43DDOName), "DDO_MATDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMATDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV47OptionsJson = AV46Options.toJSonString(false) ;
      AV50OptionsDescJson = AV49OptionsDesc.toJSonString(false) ;
      AV52OptionIndexesJson = AV51OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV54Session.getValue("FormulacionTinte.SustitucionProcesoQuimicoFormulas_WCGridState"), "") == 0 )
      {
         AV56GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WCGridState"), null, null);
      }
      else
      {
         AV56GridState.fromxml(AV54Session.getValue("FormulacionTinte.SustitucionProcesoQuimicoFormulas_WCGridState"), null, null);
      }
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV56GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV57GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV56GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV60TFCliNom = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV61TFCliNom_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV62TFForSerDsc = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV63TFForSerDsc_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV16TFForColNom = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV17TFForColNom_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV18TFForColNum = (int)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFForColNum_To = (int)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV20TFTipColCod = (byte)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFTipColCod_To = (byte)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV86TFIntDsc = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV87TFIntDsc_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMATDSC") == 0 )
         {
            AV84TFMatDsc = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMATDSC_SEL") == 0 )
         {
            AV85TFMatDsc_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV64Emprcod = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV65Clicod = (int)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV66Clicod_to = (short)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV67ForColNom = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV68ForColNom_to = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV69ForColNum = (int)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV70ForColNum_to = (int)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV71ForSer = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV72ForSer_to = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD") == 0 )
         {
            AV73IntCod = (byte)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD_TO") == 0 )
         {
            AV74IntCod_to = (byte)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MATCOD") == 0 )
         {
            AV75MatCod = (short)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MATCOD_TO") == 0 )
         {
            AV76MatCod_to = (short)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV77TipColCod = (byte)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV78TipColCod_to = (short)(GXutil.lval( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV79ProForCod = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODDESTINO") == 0 )
         {
            AV80ProForCodDestino = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORDSC") == 0 )
         {
            AV81ProforDsc = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV60TFCliNom = AV41SearchTxt ;
      AV61TFCliNom_Sel = "" ;
      AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV12TFCliCod ;
      AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV13TFCliCod_To ;
      AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV60TFCliNom ;
      AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV61TFCliNom_Sel ;
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV14TFForSer ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV15TFForSer_Sel ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV62TFForSerDsc ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV63TFForSerDsc_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV16TFForColNom ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV18TFForColNum ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV19TFForColNum_To ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV20TFTipColCod ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV21TFTipColCod_To ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV86TFIntDsc ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV87TFIntDsc_Sel ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV84TFMatDsc ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV85TFMatDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                           Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                           AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                           AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                           AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                           AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                           AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                           AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                           AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                           AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                           Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                           Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                           Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                           Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                           AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                           AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                           AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                           AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                           Integer.valueOf(AV65Clicod) ,
                                           Short.valueOf(AV66Clicod_to) ,
                                           AV67ForColNom ,
                                           AV68ForColNom_to ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV70ForColNum_to) ,
                                           AV71ForSer ,
                                           AV72ForSer_to ,
                                           Byte.valueOf(AV73IntCod) ,
                                           Byte.valueOf(AV74IntCod_to) ,
                                           Short.valueOf(AV75MatCod) ,
                                           Short.valueOf(AV76MatCod_to) ,
                                           Byte.valueOf(AV77TipColCod) ,
                                           Short.valueOf(AV78TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A584IntDsc ,
                                           A627MatDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV64Emprcod ,
                                           A764ProForCod ,
                                           AV79ProForCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
      lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
      lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
      lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
      /* Using cursor P09CT2 */
      pr_default.execute(0, new Object[] {AV64Emprcod, AV79ProForCod, Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV65Clicod), Short.valueOf(AV66Clicod_to), AV67ForColNom, AV68ForColNom_to, Integer.valueOf(AV69ForColNum), Integer.valueOf(AV70ForColNum_to), AV71ForSer, AV72ForSer_to, Byte.valueOf(AV73IntCod), Byte.valueOf(AV74IntCod_to), Short.valueOf(AV75MatCod), Short.valueOf(AV76MatCod_to), Byte.valueOf(AV77TipColCod), Short.valueOf(AV78TipColCod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9CT2 = false ;
         A396EmprCod = P09CT2_A396EmprCod[0] ;
         A764ProForCod = P09CT2_A764ProForCod[0] ;
         A279CliNom = P09CT2_A279CliNom[0] ;
         A626MatCod = P09CT2_A626MatCod[0] ;
         A583IntCod = P09CT2_A583IntCod[0] ;
         A627MatDsc = P09CT2_A627MatDsc[0] ;
         n627MatDsc = P09CT2_n627MatDsc[0] ;
         A584IntDsc = P09CT2_A584IntDsc[0] ;
         n584IntDsc = P09CT2_n584IntDsc[0] ;
         A831TipColCod = P09CT2_A831TipColCod[0] ;
         A483ForColNum = P09CT2_A483ForColNum[0] ;
         A482ForColNom = P09CT2_A482ForColNom[0] ;
         A5742ForSerDsc = P09CT2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT2_n5742ForSerDsc[0] ;
         A494ForSer = P09CT2_A494ForSer[0] ;
         A252CliCod = P09CT2_A252CliCod[0] ;
         A1160ProForL = P09CT2_A1160ProForL[0] ;
         A279CliNom = P09CT2_A279CliNom[0] ;
         A626MatCod = P09CT2_A626MatCod[0] ;
         A583IntCod = P09CT2_A583IntCod[0] ;
         A5742ForSerDsc = P09CT2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT2_n5742ForSerDsc[0] ;
         A627MatDsc = P09CT2_A627MatDsc[0] ;
         n627MatDsc = P09CT2_n627MatDsc[0] ;
         A584IntDsc = P09CT2_A584IntDsc[0] ;
         n584IntDsc = P09CT2_n584IntDsc[0] ;
         AV53count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09CT2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9CT2 = false ;
            A396EmprCod = P09CT2_A396EmprCod[0] ;
            A831TipColCod = P09CT2_A831TipColCod[0] ;
            A483ForColNum = P09CT2_A483ForColNum[0] ;
            A482ForColNom = P09CT2_A482ForColNom[0] ;
            A494ForSer = P09CT2_A494ForSer[0] ;
            A252CliCod = P09CT2_A252CliCod[0] ;
            A1160ProForL = P09CT2_A1160ProForL[0] ;
            AV53count = (long)(AV53count+1) ;
            brk9CT2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV45Option = A279CliNom ;
            AV46Options.add(AV45Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV53count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CT2 )
         {
            brk9CT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV41SearchTxt ;
      AV15TFForSer_Sel = "" ;
      AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV12TFCliCod ;
      AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV13TFCliCod_To ;
      AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV60TFCliNom ;
      AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV61TFCliNom_Sel ;
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV14TFForSer ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV15TFForSer_Sel ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV62TFForSerDsc ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV63TFForSerDsc_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV16TFForColNom ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV18TFForColNum ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV19TFForColNum_To ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV20TFTipColCod ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV21TFTipColCod_To ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV86TFIntDsc ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV87TFIntDsc_Sel ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV84TFMatDsc ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV85TFMatDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                           Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                           AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                           AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                           AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                           AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                           AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                           AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                           AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                           AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                           Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                           Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                           Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                           Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                           AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                           AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                           AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                           AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                           Integer.valueOf(AV65Clicod) ,
                                           Short.valueOf(AV66Clicod_to) ,
                                           AV67ForColNom ,
                                           AV68ForColNom_to ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV70ForColNum_to) ,
                                           AV71ForSer ,
                                           AV72ForSer_to ,
                                           Byte.valueOf(AV73IntCod) ,
                                           Byte.valueOf(AV74IntCod_to) ,
                                           Short.valueOf(AV75MatCod) ,
                                           Short.valueOf(AV76MatCod_to) ,
                                           Byte.valueOf(AV77TipColCod) ,
                                           Short.valueOf(AV78TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A584IntDsc ,
                                           A627MatDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV64Emprcod ,
                                           A764ProForCod ,
                                           AV79ProForCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
      lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
      lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
      lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
      /* Using cursor P09CT3 */
      pr_default.execute(1, new Object[] {AV64Emprcod, AV79ProForCod, Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV65Clicod), Short.valueOf(AV66Clicod_to), AV67ForColNom, AV68ForColNom_to, Integer.valueOf(AV69ForColNum), Integer.valueOf(AV70ForColNum_to), AV71ForSer, AV72ForSer_to, Byte.valueOf(AV73IntCod), Byte.valueOf(AV74IntCod_to), Short.valueOf(AV75MatCod), Short.valueOf(AV76MatCod_to), Byte.valueOf(AV77TipColCod), Short.valueOf(AV78TipColCod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9CT4 = false ;
         A396EmprCod = P09CT3_A396EmprCod[0] ;
         A764ProForCod = P09CT3_A764ProForCod[0] ;
         A494ForSer = P09CT3_A494ForSer[0] ;
         A626MatCod = P09CT3_A626MatCod[0] ;
         A583IntCod = P09CT3_A583IntCod[0] ;
         A627MatDsc = P09CT3_A627MatDsc[0] ;
         n627MatDsc = P09CT3_n627MatDsc[0] ;
         A584IntDsc = P09CT3_A584IntDsc[0] ;
         n584IntDsc = P09CT3_n584IntDsc[0] ;
         A831TipColCod = P09CT3_A831TipColCod[0] ;
         A483ForColNum = P09CT3_A483ForColNum[0] ;
         A482ForColNom = P09CT3_A482ForColNom[0] ;
         A5742ForSerDsc = P09CT3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT3_n5742ForSerDsc[0] ;
         A279CliNom = P09CT3_A279CliNom[0] ;
         A252CliCod = P09CT3_A252CliCod[0] ;
         A1160ProForL = P09CT3_A1160ProForL[0] ;
         A279CliNom = P09CT3_A279CliNom[0] ;
         A626MatCod = P09CT3_A626MatCod[0] ;
         A583IntCod = P09CT3_A583IntCod[0] ;
         A5742ForSerDsc = P09CT3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT3_n5742ForSerDsc[0] ;
         A627MatDsc = P09CT3_A627MatDsc[0] ;
         n627MatDsc = P09CT3_n627MatDsc[0] ;
         A584IntDsc = P09CT3_A584IntDsc[0] ;
         n584IntDsc = P09CT3_n584IntDsc[0] ;
         AV53count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09CT3_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk9CT4 = false ;
            A396EmprCod = P09CT3_A396EmprCod[0] ;
            A831TipColCod = P09CT3_A831TipColCod[0] ;
            A483ForColNum = P09CT3_A483ForColNum[0] ;
            A482ForColNom = P09CT3_A482ForColNom[0] ;
            A252CliCod = P09CT3_A252CliCod[0] ;
            A1160ProForL = P09CT3_A1160ProForL[0] ;
            AV53count = (long)(AV53count+1) ;
            brk9CT4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV45Option = A494ForSer ;
            AV46Options.add(AV45Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV53count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CT4 )
         {
            brk9CT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV62TFForSerDsc = AV41SearchTxt ;
      AV63TFForSerDsc_Sel = "" ;
      AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV12TFCliCod ;
      AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV13TFCliCod_To ;
      AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV60TFCliNom ;
      AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV61TFCliNom_Sel ;
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV14TFForSer ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV15TFForSer_Sel ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV62TFForSerDsc ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV63TFForSerDsc_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV16TFForColNom ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV18TFForColNum ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV19TFForColNum_To ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV20TFTipColCod ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV21TFTipColCod_To ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV86TFIntDsc ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV87TFIntDsc_Sel ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV84TFMatDsc ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV85TFMatDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                           Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                           AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                           AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                           AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                           AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                           AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                           AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                           AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                           AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                           Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                           Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                           Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                           Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                           AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                           AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                           AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                           AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                           Integer.valueOf(AV65Clicod) ,
                                           Short.valueOf(AV66Clicod_to) ,
                                           AV67ForColNom ,
                                           AV68ForColNom_to ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV70ForColNum_to) ,
                                           AV71ForSer ,
                                           AV72ForSer_to ,
                                           Byte.valueOf(AV73IntCod) ,
                                           Byte.valueOf(AV74IntCod_to) ,
                                           Short.valueOf(AV75MatCod) ,
                                           Short.valueOf(AV76MatCod_to) ,
                                           Byte.valueOf(AV77TipColCod) ,
                                           Short.valueOf(AV78TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A584IntDsc ,
                                           A627MatDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV64Emprcod ,
                                           A764ProForCod ,
                                           AV79ProForCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
      lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
      lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
      lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
      /* Using cursor P09CT4 */
      pr_default.execute(2, new Object[] {AV64Emprcod, AV79ProForCod, Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV65Clicod), Short.valueOf(AV66Clicod_to), AV67ForColNom, AV68ForColNom_to, Integer.valueOf(AV69ForColNum), Integer.valueOf(AV70ForColNum_to), AV71ForSer, AV72ForSer_to, Byte.valueOf(AV73IntCod), Byte.valueOf(AV74IntCod_to), Short.valueOf(AV75MatCod), Short.valueOf(AV76MatCod_to), Byte.valueOf(AV77TipColCod), Short.valueOf(AV78TipColCod_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9CT6 = false ;
         A396EmprCod = P09CT4_A396EmprCod[0] ;
         A764ProForCod = P09CT4_A764ProForCod[0] ;
         A5742ForSerDsc = P09CT4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT4_n5742ForSerDsc[0] ;
         A626MatCod = P09CT4_A626MatCod[0] ;
         A583IntCod = P09CT4_A583IntCod[0] ;
         A627MatDsc = P09CT4_A627MatDsc[0] ;
         n627MatDsc = P09CT4_n627MatDsc[0] ;
         A584IntDsc = P09CT4_A584IntDsc[0] ;
         n584IntDsc = P09CT4_n584IntDsc[0] ;
         A831TipColCod = P09CT4_A831TipColCod[0] ;
         A483ForColNum = P09CT4_A483ForColNum[0] ;
         A482ForColNom = P09CT4_A482ForColNom[0] ;
         A494ForSer = P09CT4_A494ForSer[0] ;
         A279CliNom = P09CT4_A279CliNom[0] ;
         A252CliCod = P09CT4_A252CliCod[0] ;
         A1160ProForL = P09CT4_A1160ProForL[0] ;
         A279CliNom = P09CT4_A279CliNom[0] ;
         A5742ForSerDsc = P09CT4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT4_n5742ForSerDsc[0] ;
         A626MatCod = P09CT4_A626MatCod[0] ;
         A583IntCod = P09CT4_A583IntCod[0] ;
         A627MatDsc = P09CT4_A627MatDsc[0] ;
         n627MatDsc = P09CT4_n627MatDsc[0] ;
         A584IntDsc = P09CT4_A584IntDsc[0] ;
         n584IntDsc = P09CT4_n584IntDsc[0] ;
         AV53count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09CT4_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk9CT6 = false ;
            A396EmprCod = P09CT4_A396EmprCod[0] ;
            A831TipColCod = P09CT4_A831TipColCod[0] ;
            A483ForColNum = P09CT4_A483ForColNum[0] ;
            A482ForColNom = P09CT4_A482ForColNom[0] ;
            A494ForSer = P09CT4_A494ForSer[0] ;
            A252CliCod = P09CT4_A252CliCod[0] ;
            A1160ProForL = P09CT4_A1160ProForL[0] ;
            AV53count = (long)(AV53count+1) ;
            brk9CT6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV45Option = A5742ForSerDsc ;
            AV46Options.add(AV45Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV53count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CT6 )
         {
            brk9CT6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForColNom = AV41SearchTxt ;
      AV17TFForColNom_Sel = "" ;
      AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV12TFCliCod ;
      AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV13TFCliCod_To ;
      AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV60TFCliNom ;
      AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV61TFCliNom_Sel ;
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV14TFForSer ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV15TFForSer_Sel ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV62TFForSerDsc ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV63TFForSerDsc_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV16TFForColNom ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV18TFForColNum ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV19TFForColNum_To ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV20TFTipColCod ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV21TFTipColCod_To ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV86TFIntDsc ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV87TFIntDsc_Sel ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV84TFMatDsc ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV85TFMatDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                           Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                           AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                           AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                           AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                           AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                           AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                           AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                           AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                           AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                           Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                           Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                           Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                           Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                           AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                           AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                           AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                           AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                           Integer.valueOf(AV65Clicod) ,
                                           Short.valueOf(AV66Clicod_to) ,
                                           AV67ForColNom ,
                                           AV68ForColNom_to ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV70ForColNum_to) ,
                                           AV71ForSer ,
                                           AV72ForSer_to ,
                                           Byte.valueOf(AV73IntCod) ,
                                           Byte.valueOf(AV74IntCod_to) ,
                                           Short.valueOf(AV75MatCod) ,
                                           Short.valueOf(AV76MatCod_to) ,
                                           Byte.valueOf(AV77TipColCod) ,
                                           Short.valueOf(AV78TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A584IntDsc ,
                                           A627MatDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV64Emprcod ,
                                           A764ProForCod ,
                                           AV79ProForCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
      lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
      lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
      lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
      /* Using cursor P09CT5 */
      pr_default.execute(3, new Object[] {AV64Emprcod, AV79ProForCod, Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV65Clicod), Short.valueOf(AV66Clicod_to), AV67ForColNom, AV68ForColNom_to, Integer.valueOf(AV69ForColNum), Integer.valueOf(AV70ForColNum_to), AV71ForSer, AV72ForSer_to, Byte.valueOf(AV73IntCod), Byte.valueOf(AV74IntCod_to), Short.valueOf(AV75MatCod), Short.valueOf(AV76MatCod_to), Byte.valueOf(AV77TipColCod), Short.valueOf(AV78TipColCod_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9CT8 = false ;
         A396EmprCod = P09CT5_A396EmprCod[0] ;
         A764ProForCod = P09CT5_A764ProForCod[0] ;
         A482ForColNom = P09CT5_A482ForColNom[0] ;
         A626MatCod = P09CT5_A626MatCod[0] ;
         A583IntCod = P09CT5_A583IntCod[0] ;
         A627MatDsc = P09CT5_A627MatDsc[0] ;
         n627MatDsc = P09CT5_n627MatDsc[0] ;
         A584IntDsc = P09CT5_A584IntDsc[0] ;
         n584IntDsc = P09CT5_n584IntDsc[0] ;
         A831TipColCod = P09CT5_A831TipColCod[0] ;
         A483ForColNum = P09CT5_A483ForColNum[0] ;
         A5742ForSerDsc = P09CT5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT5_n5742ForSerDsc[0] ;
         A494ForSer = P09CT5_A494ForSer[0] ;
         A279CliNom = P09CT5_A279CliNom[0] ;
         A252CliCod = P09CT5_A252CliCod[0] ;
         A1160ProForL = P09CT5_A1160ProForL[0] ;
         A279CliNom = P09CT5_A279CliNom[0] ;
         A626MatCod = P09CT5_A626MatCod[0] ;
         A583IntCod = P09CT5_A583IntCod[0] ;
         A5742ForSerDsc = P09CT5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT5_n5742ForSerDsc[0] ;
         A627MatDsc = P09CT5_A627MatDsc[0] ;
         n627MatDsc = P09CT5_n627MatDsc[0] ;
         A584IntDsc = P09CT5_A584IntDsc[0] ;
         n584IntDsc = P09CT5_n584IntDsc[0] ;
         AV53count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09CT5_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk9CT8 = false ;
            A396EmprCod = P09CT5_A396EmprCod[0] ;
            A831TipColCod = P09CT5_A831TipColCod[0] ;
            A483ForColNum = P09CT5_A483ForColNum[0] ;
            A494ForSer = P09CT5_A494ForSer[0] ;
            A252CliCod = P09CT5_A252CliCod[0] ;
            A1160ProForL = P09CT5_A1160ProForL[0] ;
            AV53count = (long)(AV53count+1) ;
            brk9CT8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV45Option = A482ForColNom ;
            AV46Options.add(AV45Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV53count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CT8 )
         {
            brk9CT8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADINTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV86TFIntDsc = AV41SearchTxt ;
      AV87TFIntDsc_Sel = "" ;
      AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV12TFCliCod ;
      AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV13TFCliCod_To ;
      AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV60TFCliNom ;
      AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV61TFCliNom_Sel ;
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV14TFForSer ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV15TFForSer_Sel ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV62TFForSerDsc ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV63TFForSerDsc_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV16TFForColNom ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV18TFForColNum ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV19TFForColNum_To ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV20TFTipColCod ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV21TFTipColCod_To ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV86TFIntDsc ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV87TFIntDsc_Sel ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV84TFMatDsc ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV85TFMatDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                           Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                           AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                           AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                           AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                           AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                           AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                           AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                           AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                           AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                           Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                           Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                           Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                           Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                           AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                           AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                           AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                           AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                           Integer.valueOf(AV65Clicod) ,
                                           Short.valueOf(AV66Clicod_to) ,
                                           AV67ForColNom ,
                                           AV68ForColNom_to ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV70ForColNum_to) ,
                                           AV71ForSer ,
                                           AV72ForSer_to ,
                                           Byte.valueOf(AV73IntCod) ,
                                           Byte.valueOf(AV74IntCod_to) ,
                                           Short.valueOf(AV75MatCod) ,
                                           Short.valueOf(AV76MatCod_to) ,
                                           Byte.valueOf(AV77TipColCod) ,
                                           Short.valueOf(AV78TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A584IntDsc ,
                                           A627MatDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV64Emprcod ,
                                           A764ProForCod ,
                                           AV79ProForCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
      lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
      lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
      lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
      /* Using cursor P09CT6 */
      pr_default.execute(4, new Object[] {AV64Emprcod, AV79ProForCod, Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV65Clicod), Short.valueOf(AV66Clicod_to), AV67ForColNom, AV68ForColNom_to, Integer.valueOf(AV69ForColNum), Integer.valueOf(AV70ForColNum_to), AV71ForSer, AV72ForSer_to, Byte.valueOf(AV73IntCod), Byte.valueOf(AV74IntCod_to), Short.valueOf(AV75MatCod), Short.valueOf(AV76MatCod_to), Byte.valueOf(AV77TipColCod), Short.valueOf(AV78TipColCod_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9CT10 = false ;
         A396EmprCod = P09CT6_A396EmprCod[0] ;
         A764ProForCod = P09CT6_A764ProForCod[0] ;
         A584IntDsc = P09CT6_A584IntDsc[0] ;
         n584IntDsc = P09CT6_n584IntDsc[0] ;
         A626MatCod = P09CT6_A626MatCod[0] ;
         A583IntCod = P09CT6_A583IntCod[0] ;
         A627MatDsc = P09CT6_A627MatDsc[0] ;
         n627MatDsc = P09CT6_n627MatDsc[0] ;
         A831TipColCod = P09CT6_A831TipColCod[0] ;
         A483ForColNum = P09CT6_A483ForColNum[0] ;
         A482ForColNom = P09CT6_A482ForColNom[0] ;
         A5742ForSerDsc = P09CT6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT6_n5742ForSerDsc[0] ;
         A494ForSer = P09CT6_A494ForSer[0] ;
         A279CliNom = P09CT6_A279CliNom[0] ;
         A252CliCod = P09CT6_A252CliCod[0] ;
         A1160ProForL = P09CT6_A1160ProForL[0] ;
         A279CliNom = P09CT6_A279CliNom[0] ;
         A626MatCod = P09CT6_A626MatCod[0] ;
         A583IntCod = P09CT6_A583IntCod[0] ;
         A5742ForSerDsc = P09CT6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT6_n5742ForSerDsc[0] ;
         A627MatDsc = P09CT6_A627MatDsc[0] ;
         n627MatDsc = P09CT6_n627MatDsc[0] ;
         A584IntDsc = P09CT6_A584IntDsc[0] ;
         n584IntDsc = P09CT6_n584IntDsc[0] ;
         AV53count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09CT6_A584IntDsc[0], A584IntDsc) == 0 ) )
         {
            brk9CT10 = false ;
            A396EmprCod = P09CT6_A396EmprCod[0] ;
            A583IntCod = P09CT6_A583IntCod[0] ;
            A831TipColCod = P09CT6_A831TipColCod[0] ;
            A483ForColNum = P09CT6_A483ForColNum[0] ;
            A482ForColNom = P09CT6_A482ForColNom[0] ;
            A494ForSer = P09CT6_A494ForSer[0] ;
            A252CliCod = P09CT6_A252CliCod[0] ;
            A1160ProForL = P09CT6_A1160ProForL[0] ;
            A583IntCod = P09CT6_A583IntCod[0] ;
            AV53count = (long)(AV53count+1) ;
            brk9CT10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A584IntDsc)==0) )
         {
            AV45Option = A584IntDsc ;
            AV46Options.add(AV45Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV53count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CT10 )
         {
            brk9CT10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMATDSCOPTIONS' Routine */
      returnInSub = false ;
      AV84TFMatDsc = AV41SearchTxt ;
      AV85TFMatDsc_Sel = "" ;
      AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV12TFCliCod ;
      AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV13TFCliCod_To ;
      AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV60TFCliNom ;
      AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV61TFCliNom_Sel ;
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV14TFForSer ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV15TFForSer_Sel ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV62TFForSerDsc ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV63TFForSerDsc_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV16TFForColNom ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV18TFForColNum ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV19TFForColNum_To ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV20TFTipColCod ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV21TFTipColCod_To ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV86TFIntDsc ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV87TFIntDsc_Sel ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV84TFMatDsc ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV85TFMatDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                           Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                           AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                           AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                           AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                           AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                           AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                           AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                           AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                           AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                           Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                           Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                           Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                           Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                           AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                           AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                           AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                           AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                           Integer.valueOf(AV65Clicod) ,
                                           Short.valueOf(AV66Clicod_to) ,
                                           AV67ForColNom ,
                                           AV68ForColNom_to ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV70ForColNum_to) ,
                                           AV71ForSer ,
                                           AV72ForSer_to ,
                                           Byte.valueOf(AV73IntCod) ,
                                           Byte.valueOf(AV74IntCod_to) ,
                                           Short.valueOf(AV75MatCod) ,
                                           Short.valueOf(AV76MatCod_to) ,
                                           Byte.valueOf(AV77TipColCod) ,
                                           Short.valueOf(AV78TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A584IntDsc ,
                                           A627MatDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV64Emprcod ,
                                           A764ProForCod ,
                                           AV79ProForCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
      lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
      lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
      lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
      /* Using cursor P09CT7 */
      pr_default.execute(5, new Object[] {AV64Emprcod, AV79ProForCod, Integer.valueOf(AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV65Clicod), Short.valueOf(AV66Clicod_to), AV67ForColNom, AV68ForColNom_to, Integer.valueOf(AV69ForColNum), Integer.valueOf(AV70ForColNum_to), AV71ForSer, AV72ForSer_to, Byte.valueOf(AV73IntCod), Byte.valueOf(AV74IntCod_to), Short.valueOf(AV75MatCod), Short.valueOf(AV76MatCod_to), Byte.valueOf(AV77TipColCod), Short.valueOf(AV78TipColCod_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9CT12 = false ;
         A396EmprCod = P09CT7_A396EmprCod[0] ;
         A764ProForCod = P09CT7_A764ProForCod[0] ;
         A627MatDsc = P09CT7_A627MatDsc[0] ;
         n627MatDsc = P09CT7_n627MatDsc[0] ;
         A626MatCod = P09CT7_A626MatCod[0] ;
         A583IntCod = P09CT7_A583IntCod[0] ;
         A584IntDsc = P09CT7_A584IntDsc[0] ;
         n584IntDsc = P09CT7_n584IntDsc[0] ;
         A831TipColCod = P09CT7_A831TipColCod[0] ;
         A483ForColNum = P09CT7_A483ForColNum[0] ;
         A482ForColNom = P09CT7_A482ForColNom[0] ;
         A5742ForSerDsc = P09CT7_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT7_n5742ForSerDsc[0] ;
         A494ForSer = P09CT7_A494ForSer[0] ;
         A279CliNom = P09CT7_A279CliNom[0] ;
         A252CliCod = P09CT7_A252CliCod[0] ;
         A1160ProForL = P09CT7_A1160ProForL[0] ;
         A279CliNom = P09CT7_A279CliNom[0] ;
         A626MatCod = P09CT7_A626MatCod[0] ;
         A583IntCod = P09CT7_A583IntCod[0] ;
         A5742ForSerDsc = P09CT7_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09CT7_n5742ForSerDsc[0] ;
         A627MatDsc = P09CT7_A627MatDsc[0] ;
         n627MatDsc = P09CT7_n627MatDsc[0] ;
         A584IntDsc = P09CT7_A584IntDsc[0] ;
         n584IntDsc = P09CT7_n584IntDsc[0] ;
         AV53count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09CT7_A627MatDsc[0], A627MatDsc) == 0 ) )
         {
            brk9CT12 = false ;
            A396EmprCod = P09CT7_A396EmprCod[0] ;
            A626MatCod = P09CT7_A626MatCod[0] ;
            A831TipColCod = P09CT7_A831TipColCod[0] ;
            A483ForColNum = P09CT7_A483ForColNum[0] ;
            A482ForColNom = P09CT7_A482ForColNom[0] ;
            A494ForSer = P09CT7_A494ForSer[0] ;
            A252CliCod = P09CT7_A252CliCod[0] ;
            A1160ProForL = P09CT7_A1160ProForL[0] ;
            A626MatCod = P09CT7_A626MatCod[0] ;
            AV53count = (long)(AV53count+1) ;
            brk9CT12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A627MatDsc)==0) )
         {
            AV45Option = A627MatDsc ;
            AV46Options.add(AV45Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV53count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CT12 )
         {
            brk9CT12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = sustitucionprocesoquimicoformulas_wcgetfilterdata.this.AV47OptionsJson;
      this.aP4[0] = sustitucionprocesoquimicoformulas_wcgetfilterdata.this.AV50OptionsDescJson;
      this.aP5[0] = sustitucionprocesoquimicoformulas_wcgetfilterdata.this.AV52OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47OptionsJson = "" ;
      AV50OptionsDescJson = "" ;
      AV52OptionIndexesJson = "" ;
      AV46Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV49OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV51OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV54Session = httpContext.getWebSession();
      AV56GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV57GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV60TFCliNom = "" ;
      AV61TFCliNom_Sel = "" ;
      AV14TFForSer = "" ;
      AV15TFForSer_Sel = "" ;
      AV62TFForSerDsc = "" ;
      AV63TFForSerDsc_Sel = "" ;
      AV16TFForColNom = "" ;
      AV17TFForColNom_Sel = "" ;
      AV86TFIntDsc = "" ;
      AV87TFIntDsc_Sel = "" ;
      AV84TFMatDsc = "" ;
      AV85TFMatDsc_Sel = "" ;
      AV64Emprcod = "" ;
      AV67ForColNom = "" ;
      AV68ForColNom_to = "" ;
      AV71ForSer = "" ;
      AV72ForSer_to = "" ;
      AV79ProForCod = "" ;
      AV80ProForCodDestino = "" ;
      AV81ProforDsc = "" ;
      A279CliNom = "" ;
      AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = "" ;
      AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = "" ;
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = "" ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = "" ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = "" ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = "" ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = "" ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = "" ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = "" ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = "" ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = "" ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = "" ;
      scmdbuf = "" ;
      lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = "" ;
      lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = "" ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = "" ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = "" ;
      lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = "" ;
      lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A584IntDsc = "" ;
      A627MatDsc = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P09CT2_A396EmprCod = new String[] {""} ;
      P09CT2_A764ProForCod = new String[] {""} ;
      P09CT2_A279CliNom = new String[] {""} ;
      P09CT2_A626MatCod = new short[1] ;
      P09CT2_A583IntCod = new byte[1] ;
      P09CT2_A627MatDsc = new String[] {""} ;
      P09CT2_n627MatDsc = new boolean[] {false} ;
      P09CT2_A584IntDsc = new String[] {""} ;
      P09CT2_n584IntDsc = new boolean[] {false} ;
      P09CT2_A831TipColCod = new byte[1] ;
      P09CT2_A483ForColNum = new int[1] ;
      P09CT2_A482ForColNom = new String[] {""} ;
      P09CT2_A5742ForSerDsc = new String[] {""} ;
      P09CT2_n5742ForSerDsc = new boolean[] {false} ;
      P09CT2_A494ForSer = new String[] {""} ;
      P09CT2_A252CliCod = new int[1] ;
      P09CT2_A1160ProForL = new short[1] ;
      AV45Option = "" ;
      P09CT3_A396EmprCod = new String[] {""} ;
      P09CT3_A764ProForCod = new String[] {""} ;
      P09CT3_A494ForSer = new String[] {""} ;
      P09CT3_A626MatCod = new short[1] ;
      P09CT3_A583IntCod = new byte[1] ;
      P09CT3_A627MatDsc = new String[] {""} ;
      P09CT3_n627MatDsc = new boolean[] {false} ;
      P09CT3_A584IntDsc = new String[] {""} ;
      P09CT3_n584IntDsc = new boolean[] {false} ;
      P09CT3_A831TipColCod = new byte[1] ;
      P09CT3_A483ForColNum = new int[1] ;
      P09CT3_A482ForColNom = new String[] {""} ;
      P09CT3_A5742ForSerDsc = new String[] {""} ;
      P09CT3_n5742ForSerDsc = new boolean[] {false} ;
      P09CT3_A279CliNom = new String[] {""} ;
      P09CT3_A252CliCod = new int[1] ;
      P09CT3_A1160ProForL = new short[1] ;
      P09CT4_A396EmprCod = new String[] {""} ;
      P09CT4_A764ProForCod = new String[] {""} ;
      P09CT4_A5742ForSerDsc = new String[] {""} ;
      P09CT4_n5742ForSerDsc = new boolean[] {false} ;
      P09CT4_A626MatCod = new short[1] ;
      P09CT4_A583IntCod = new byte[1] ;
      P09CT4_A627MatDsc = new String[] {""} ;
      P09CT4_n627MatDsc = new boolean[] {false} ;
      P09CT4_A584IntDsc = new String[] {""} ;
      P09CT4_n584IntDsc = new boolean[] {false} ;
      P09CT4_A831TipColCod = new byte[1] ;
      P09CT4_A483ForColNum = new int[1] ;
      P09CT4_A482ForColNom = new String[] {""} ;
      P09CT4_A494ForSer = new String[] {""} ;
      P09CT4_A279CliNom = new String[] {""} ;
      P09CT4_A252CliCod = new int[1] ;
      P09CT4_A1160ProForL = new short[1] ;
      P09CT5_A396EmprCod = new String[] {""} ;
      P09CT5_A764ProForCod = new String[] {""} ;
      P09CT5_A482ForColNom = new String[] {""} ;
      P09CT5_A626MatCod = new short[1] ;
      P09CT5_A583IntCod = new byte[1] ;
      P09CT5_A627MatDsc = new String[] {""} ;
      P09CT5_n627MatDsc = new boolean[] {false} ;
      P09CT5_A584IntDsc = new String[] {""} ;
      P09CT5_n584IntDsc = new boolean[] {false} ;
      P09CT5_A831TipColCod = new byte[1] ;
      P09CT5_A483ForColNum = new int[1] ;
      P09CT5_A5742ForSerDsc = new String[] {""} ;
      P09CT5_n5742ForSerDsc = new boolean[] {false} ;
      P09CT5_A494ForSer = new String[] {""} ;
      P09CT5_A279CliNom = new String[] {""} ;
      P09CT5_A252CliCod = new int[1] ;
      P09CT5_A1160ProForL = new short[1] ;
      P09CT6_A396EmprCod = new String[] {""} ;
      P09CT6_A764ProForCod = new String[] {""} ;
      P09CT6_A584IntDsc = new String[] {""} ;
      P09CT6_n584IntDsc = new boolean[] {false} ;
      P09CT6_A626MatCod = new short[1] ;
      P09CT6_A583IntCod = new byte[1] ;
      P09CT6_A627MatDsc = new String[] {""} ;
      P09CT6_n627MatDsc = new boolean[] {false} ;
      P09CT6_A831TipColCod = new byte[1] ;
      P09CT6_A483ForColNum = new int[1] ;
      P09CT6_A482ForColNom = new String[] {""} ;
      P09CT6_A5742ForSerDsc = new String[] {""} ;
      P09CT6_n5742ForSerDsc = new boolean[] {false} ;
      P09CT6_A494ForSer = new String[] {""} ;
      P09CT6_A279CliNom = new String[] {""} ;
      P09CT6_A252CliCod = new int[1] ;
      P09CT6_A1160ProForL = new short[1] ;
      P09CT7_A396EmprCod = new String[] {""} ;
      P09CT7_A764ProForCod = new String[] {""} ;
      P09CT7_A627MatDsc = new String[] {""} ;
      P09CT7_n627MatDsc = new boolean[] {false} ;
      P09CT7_A626MatCod = new short[1] ;
      P09CT7_A583IntCod = new byte[1] ;
      P09CT7_A584IntDsc = new String[] {""} ;
      P09CT7_n584IntDsc = new boolean[] {false} ;
      P09CT7_A831TipColCod = new byte[1] ;
      P09CT7_A483ForColNum = new int[1] ;
      P09CT7_A482ForColNom = new String[] {""} ;
      P09CT7_A5742ForSerDsc = new String[] {""} ;
      P09CT7_n5742ForSerDsc = new boolean[] {false} ;
      P09CT7_A494ForSer = new String[] {""} ;
      P09CT7_A279CliNom = new String[] {""} ;
      P09CT7_A252CliCod = new int[1] ;
      P09CT7_A1160ProForL = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.sustitucionprocesoquimicoformulas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09CT2_A396EmprCod, P09CT2_A764ProForCod, P09CT2_A279CliNom, P09CT2_A626MatCod, P09CT2_A583IntCod, P09CT2_A627MatDsc, P09CT2_n627MatDsc, P09CT2_A584IntDsc, P09CT2_n584IntDsc, P09CT2_A831TipColCod,
            P09CT2_A483ForColNum, P09CT2_A482ForColNom, P09CT2_A5742ForSerDsc, P09CT2_n5742ForSerDsc, P09CT2_A494ForSer, P09CT2_A252CliCod, P09CT2_A1160ProForL
            }
            , new Object[] {
            P09CT3_A396EmprCod, P09CT3_A764ProForCod, P09CT3_A494ForSer, P09CT3_A626MatCod, P09CT3_A583IntCod, P09CT3_A627MatDsc, P09CT3_n627MatDsc, P09CT3_A584IntDsc, P09CT3_n584IntDsc, P09CT3_A831TipColCod,
            P09CT3_A483ForColNum, P09CT3_A482ForColNom, P09CT3_A5742ForSerDsc, P09CT3_n5742ForSerDsc, P09CT3_A279CliNom, P09CT3_A252CliCod, P09CT3_A1160ProForL
            }
            , new Object[] {
            P09CT4_A396EmprCod, P09CT4_A764ProForCod, P09CT4_A5742ForSerDsc, P09CT4_n5742ForSerDsc, P09CT4_A626MatCod, P09CT4_A583IntCod, P09CT4_A627MatDsc, P09CT4_n627MatDsc, P09CT4_A584IntDsc, P09CT4_n584IntDsc,
            P09CT4_A831TipColCod, P09CT4_A483ForColNum, P09CT4_A482ForColNom, P09CT4_A494ForSer, P09CT4_A279CliNom, P09CT4_A252CliCod, P09CT4_A1160ProForL
            }
            , new Object[] {
            P09CT5_A396EmprCod, P09CT5_A764ProForCod, P09CT5_A482ForColNom, P09CT5_A626MatCod, P09CT5_A583IntCod, P09CT5_A627MatDsc, P09CT5_n627MatDsc, P09CT5_A584IntDsc, P09CT5_n584IntDsc, P09CT5_A831TipColCod,
            P09CT5_A483ForColNum, P09CT5_A5742ForSerDsc, P09CT5_n5742ForSerDsc, P09CT5_A494ForSer, P09CT5_A279CliNom, P09CT5_A252CliCod, P09CT5_A1160ProForL
            }
            , new Object[] {
            P09CT6_A396EmprCod, P09CT6_A764ProForCod, P09CT6_A584IntDsc, P09CT6_n584IntDsc, P09CT6_A626MatCod, P09CT6_A583IntCod, P09CT6_A627MatDsc, P09CT6_n627MatDsc, P09CT6_A831TipColCod, P09CT6_A483ForColNum,
            P09CT6_A482ForColNom, P09CT6_A5742ForSerDsc, P09CT6_n5742ForSerDsc, P09CT6_A494ForSer, P09CT6_A279CliNom, P09CT6_A252CliCod, P09CT6_A1160ProForL
            }
            , new Object[] {
            P09CT7_A396EmprCod, P09CT7_A764ProForCod, P09CT7_A627MatDsc, P09CT7_n627MatDsc, P09CT7_A626MatCod, P09CT7_A583IntCod, P09CT7_A584IntDsc, P09CT7_n584IntDsc, P09CT7_A831TipColCod, P09CT7_A483ForColNum,
            P09CT7_A482ForColNom, P09CT7_A5742ForSerDsc, P09CT7_n5742ForSerDsc, P09CT7_A494ForSer, P09CT7_A279CliNom, P09CT7_A252CliCod, P09CT7_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFTipColCod ;
   private byte AV21TFTipColCod_To ;
   private byte AV73IntCod ;
   private byte AV74IntCod_to ;
   private byte AV77TipColCod ;
   private byte AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ;
   private byte AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short AV66Clicod_to ;
   private short AV75MatCod ;
   private short AV76MatCod_to ;
   private short AV78TipColCod_to ;
   private short A626MatCod ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV90GXV1 ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV18TFForColNum ;
   private int AV19TFForColNum_To ;
   private int AV65Clicod ;
   private int AV69ForColNum ;
   private int AV70ForColNum_to ;
   private int AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ;
   private int AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ;
   private int AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ;
   private int AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private long AV53count ;
   private String AV60TFCliNom ;
   private String AV61TFCliNom_Sel ;
   private String AV14TFForSer ;
   private String AV15TFForSer_Sel ;
   private String AV62TFForSerDsc ;
   private String AV63TFForSerDsc_Sel ;
   private String AV16TFForColNom ;
   private String AV17TFForColNom_Sel ;
   private String AV86TFIntDsc ;
   private String AV87TFIntDsc_Sel ;
   private String AV84TFMatDsc ;
   private String AV85TFMatDsc_Sel ;
   private String AV64Emprcod ;
   private String AV67ForColNom ;
   private String AV68ForColNom_to ;
   private String AV71ForSer ;
   private String AV72ForSer_to ;
   private String AV79ProForCod ;
   private String AV80ProForCodDestino ;
   private String AV81ProforDsc ;
   private String A279CliNom ;
   private String AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ;
   private String AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ;
   private String AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ;
   private String AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ;
   private String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ;
   private String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ;
   private String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ;
   private String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ;
   private String AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ;
   private String AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ;
   private String AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ;
   private String AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ;
   private String scmdbuf ;
   private String lV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ;
   private String lV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ;
   private String lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ;
   private String lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ;
   private String lV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ;
   private String lV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A584IntDsc ;
   private String A627MatDsc ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private boolean returnInSub ;
   private boolean brk9CT2 ;
   private boolean n627MatDsc ;
   private boolean n584IntDsc ;
   private boolean n5742ForSerDsc ;
   private boolean brk9CT4 ;
   private boolean brk9CT6 ;
   private boolean brk9CT8 ;
   private boolean brk9CT10 ;
   private boolean brk9CT12 ;
   private String AV47OptionsJson ;
   private String AV50OptionsDescJson ;
   private String AV52OptionIndexesJson ;
   private String AV43DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV45Option ;
   private com.genexus.webpanels.WebSession AV54Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09CT2_A396EmprCod ;
   private String[] P09CT2_A764ProForCod ;
   private String[] P09CT2_A279CliNom ;
   private short[] P09CT2_A626MatCod ;
   private byte[] P09CT2_A583IntCod ;
   private String[] P09CT2_A627MatDsc ;
   private boolean[] P09CT2_n627MatDsc ;
   private String[] P09CT2_A584IntDsc ;
   private boolean[] P09CT2_n584IntDsc ;
   private byte[] P09CT2_A831TipColCod ;
   private int[] P09CT2_A483ForColNum ;
   private String[] P09CT2_A482ForColNom ;
   private String[] P09CT2_A5742ForSerDsc ;
   private boolean[] P09CT2_n5742ForSerDsc ;
   private String[] P09CT2_A494ForSer ;
   private int[] P09CT2_A252CliCod ;
   private short[] P09CT2_A1160ProForL ;
   private String[] P09CT3_A396EmprCod ;
   private String[] P09CT3_A764ProForCod ;
   private String[] P09CT3_A494ForSer ;
   private short[] P09CT3_A626MatCod ;
   private byte[] P09CT3_A583IntCod ;
   private String[] P09CT3_A627MatDsc ;
   private boolean[] P09CT3_n627MatDsc ;
   private String[] P09CT3_A584IntDsc ;
   private boolean[] P09CT3_n584IntDsc ;
   private byte[] P09CT3_A831TipColCod ;
   private int[] P09CT3_A483ForColNum ;
   private String[] P09CT3_A482ForColNom ;
   private String[] P09CT3_A5742ForSerDsc ;
   private boolean[] P09CT3_n5742ForSerDsc ;
   private String[] P09CT3_A279CliNom ;
   private int[] P09CT3_A252CliCod ;
   private short[] P09CT3_A1160ProForL ;
   private String[] P09CT4_A396EmprCod ;
   private String[] P09CT4_A764ProForCod ;
   private String[] P09CT4_A5742ForSerDsc ;
   private boolean[] P09CT4_n5742ForSerDsc ;
   private short[] P09CT4_A626MatCod ;
   private byte[] P09CT4_A583IntCod ;
   private String[] P09CT4_A627MatDsc ;
   private boolean[] P09CT4_n627MatDsc ;
   private String[] P09CT4_A584IntDsc ;
   private boolean[] P09CT4_n584IntDsc ;
   private byte[] P09CT4_A831TipColCod ;
   private int[] P09CT4_A483ForColNum ;
   private String[] P09CT4_A482ForColNom ;
   private String[] P09CT4_A494ForSer ;
   private String[] P09CT4_A279CliNom ;
   private int[] P09CT4_A252CliCod ;
   private short[] P09CT4_A1160ProForL ;
   private String[] P09CT5_A396EmprCod ;
   private String[] P09CT5_A764ProForCod ;
   private String[] P09CT5_A482ForColNom ;
   private short[] P09CT5_A626MatCod ;
   private byte[] P09CT5_A583IntCod ;
   private String[] P09CT5_A627MatDsc ;
   private boolean[] P09CT5_n627MatDsc ;
   private String[] P09CT5_A584IntDsc ;
   private boolean[] P09CT5_n584IntDsc ;
   private byte[] P09CT5_A831TipColCod ;
   private int[] P09CT5_A483ForColNum ;
   private String[] P09CT5_A5742ForSerDsc ;
   private boolean[] P09CT5_n5742ForSerDsc ;
   private String[] P09CT5_A494ForSer ;
   private String[] P09CT5_A279CliNom ;
   private int[] P09CT5_A252CliCod ;
   private short[] P09CT5_A1160ProForL ;
   private String[] P09CT6_A396EmprCod ;
   private String[] P09CT6_A764ProForCod ;
   private String[] P09CT6_A584IntDsc ;
   private boolean[] P09CT6_n584IntDsc ;
   private short[] P09CT6_A626MatCod ;
   private byte[] P09CT6_A583IntCod ;
   private String[] P09CT6_A627MatDsc ;
   private boolean[] P09CT6_n627MatDsc ;
   private byte[] P09CT6_A831TipColCod ;
   private int[] P09CT6_A483ForColNum ;
   private String[] P09CT6_A482ForColNom ;
   private String[] P09CT6_A5742ForSerDsc ;
   private boolean[] P09CT6_n5742ForSerDsc ;
   private String[] P09CT6_A494ForSer ;
   private String[] P09CT6_A279CliNom ;
   private int[] P09CT6_A252CliCod ;
   private short[] P09CT6_A1160ProForL ;
   private String[] P09CT7_A396EmprCod ;
   private String[] P09CT7_A764ProForCod ;
   private String[] P09CT7_A627MatDsc ;
   private boolean[] P09CT7_n627MatDsc ;
   private short[] P09CT7_A626MatCod ;
   private byte[] P09CT7_A583IntCod ;
   private String[] P09CT7_A584IntDsc ;
   private boolean[] P09CT7_n584IntDsc ;
   private byte[] P09CT7_A831TipColCod ;
   private int[] P09CT7_A483ForColNum ;
   private String[] P09CT7_A482ForColNom ;
   private String[] P09CT7_A5742ForSerDsc ;
   private boolean[] P09CT7_n5742ForSerDsc ;
   private String[] P09CT7_A494ForSer ;
   private String[] P09CT7_A279CliNom ;
   private int[] P09CT7_A252CliCod ;
   private short[] P09CT7_A1160ProForL ;
   private GXSimpleCollection<String> AV46Options ;
   private GXSimpleCollection<String> AV49OptionsDesc ;
   private GXSimpleCollection<String> AV51OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV56GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV57GridStateFilterValue ;
}

final  class sustitucionprocesoquimicoformulas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV65Clicod ,
                                          short AV66Clicod_to ,
                                          String AV67ForColNom ,
                                          String AV68ForColNom_to ,
                                          int AV69ForColNum ,
                                          int AV70ForColNum_to ,
                                          String AV71ForSer ,
                                          String AV72ForSer_to ,
                                          byte AV73IntCod ,
                                          byte AV74IntCod_to ,
                                          short AV75MatCod ,
                                          short AV76MatCod_to ,
                                          byte AV77TipColCod ,
                                          short AV78TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV64Emprcod ,
                                          String A764ProForCod ,
                                          String AV79ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T2.CliNom, T3.MatCod, T3.IntCod, T4.MatDsc, T5.IntDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T3.ForSerDsc, T1.ForSer, T1.CliCod," ;
      scmdbuf += " T1.ProForL FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = T1.EmprCod AND T5.IntCod = T3.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.IntDsc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MatDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV70ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV73IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV74IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV75MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV76MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV77TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV78TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09CT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV65Clicod ,
                                          short AV66Clicod_to ,
                                          String AV67ForColNom ,
                                          String AV68ForColNom_to ,
                                          int AV69ForColNum ,
                                          int AV70ForColNum_to ,
                                          String AV71ForSer ,
                                          String AV72ForSer_to ,
                                          byte AV73IntCod ,
                                          byte AV74IntCod_to ,
                                          short AV75MatCod ,
                                          short AV76MatCod_to ,
                                          byte AV77TipColCod ,
                                          short AV78TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV64Emprcod ,
                                          String A764ProForCod ,
                                          String AV79ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[34];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.ForSer, T3.MatCod, T3.IntCod, T4.MatDsc, T5.IntDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T3.ForSerDsc, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.ProForL FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = T1.EmprCod AND T5.IntCod = T3.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.IntDsc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MatDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV70ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV73IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV74IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV75MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV76MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV77TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV78TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09CT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV65Clicod ,
                                          short AV66Clicod_to ,
                                          String AV67ForColNom ,
                                          String AV68ForColNom_to ,
                                          int AV69ForColNum ,
                                          int AV70ForColNum_to ,
                                          String AV71ForSer ,
                                          String AV72ForSer_to ,
                                          byte AV73IntCod ,
                                          byte AV74IntCod_to ,
                                          short AV75MatCod ,
                                          short AV76MatCod_to ,
                                          byte AV77TipColCod ,
                                          short AV78TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV64Emprcod ,
                                          String A764ProForCod ,
                                          String AV79ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T3.ForSerDsc, T3.MatCod, T3.IntCod, T4.MatDsc, T5.IntDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.ProForL FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = T1.EmprCod AND T5.IntCod = T3.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.IntDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MatDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV70ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV73IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV74IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV75MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV76MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV77TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV78TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.ForSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09CT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV65Clicod ,
                                          short AV66Clicod_to ,
                                          String AV67ForColNom ,
                                          String AV68ForColNom_to ,
                                          int AV69ForColNum ,
                                          int AV70ForColNum_to ,
                                          String AV71ForSer ,
                                          String AV72ForSer_to ,
                                          byte AV73IntCod ,
                                          byte AV74IntCod_to ,
                                          short AV75MatCod ,
                                          short AV76MatCod_to ,
                                          byte AV77TipColCod ,
                                          short AV78TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV64Emprcod ,
                                          String A764ProForCod ,
                                          String AV79ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.ForColNom, T3.MatCod, T3.IntCod, T4.MatDsc, T5.IntDsc, T1.TipColCod, T1.ForColNum, T3.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.ProForL FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = T1.EmprCod AND T5.IntCod = T3.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.IntDsc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MatDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV70ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV73IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV74IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV75MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV76MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV77TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV78TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09CT6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV65Clicod ,
                                          short AV66Clicod_to ,
                                          String AV67ForColNom ,
                                          String AV68ForColNom_to ,
                                          int AV69ForColNum ,
                                          int AV70ForColNum_to ,
                                          String AV71ForSer ,
                                          String AV72ForSer_to ,
                                          byte AV73IntCod ,
                                          byte AV74IntCod_to ,
                                          short AV75MatCod ,
                                          short AV76MatCod_to ,
                                          byte AV77TipColCod ,
                                          short AV78TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV64Emprcod ,
                                          String A764ProForCod ,
                                          String AV79ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[34];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T5.IntDsc, T3.MatCod, T3.IntCod, T4.MatDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T3.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.ProForL FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = T1.EmprCod AND T5.IntCod = T3.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.IntDsc = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MatDsc = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV70ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV73IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV74IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV75MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV76MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV77TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV78TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.IntDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09CT7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV65Clicod ,
                                          short AV66Clicod_to ,
                                          String AV67ForColNom ,
                                          String AV68ForColNom_to ,
                                          int AV69ForColNum ,
                                          int AV70ForColNum_to ,
                                          String AV71ForSer ,
                                          String AV72ForSer_to ,
                                          byte AV73IntCod ,
                                          byte AV74IntCod_to ,
                                          short AV75MatCod ,
                                          short AV76MatCod_to ,
                                          byte AV77TipColCod ,
                                          short AV78TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV64Emprcod ,
                                          String A764ProForCod ,
                                          String AV79ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[34];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T4.MatDsc, T3.MatCod, T3.IntCod, T5.IntDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T3.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.ProForL FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = T1.EmprCod AND T5.IntCod = T3.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV92Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.IntDsc = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MatDsc = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV70ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV73IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV74IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV75MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV76MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV77TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV78TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.MatDsc" ;
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
                  return conditional_P09CT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 1 :
                  return conditional_P09CT3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 2 :
                  return conditional_P09CT4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 3 :
                  return conditional_P09CT5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 4 :
                  return conditional_P09CT6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 5 :
                  return conditional_P09CT7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CT6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CT7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
      }
   }

}

