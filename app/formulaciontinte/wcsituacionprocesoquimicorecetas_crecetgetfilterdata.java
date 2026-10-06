package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetas_crecetgetfilterdata extends GXProcedure
{
   public wcsituacionprocesoquimicorecetas_crecetgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsituacionprocesoquimicorecetas_crecetgetfilterdata.class ), "" );
   }

   public wcsituacionprocesoquimicorecetas_crecetgetfilterdata( int remoteHandle ,
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
      wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.aP5 = new String[] {""};
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
      wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.AV30DDOName = aP0;
      wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.AV28SearchTxt = aP1;
      wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.AV29SearchTxtTo = aP2;
      wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.aP3 = aP3;
      wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.aP4 = aP4;
      wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S171 ();
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
      if ( GXutil.strcmp(AV41Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV16TFBarSer = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV17TFBarSer_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV18TFBarSerDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV19TFBarSerDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV20TFBarColNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV21TFBarColNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV22TFBarColNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFBarColNum_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV24TFBarNomCli = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV25TFBarNomCli_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV26TFRecAcab_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV27TFRecAcab_Sels.fromJSonString(AV26TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV48Proforcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV28SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV46FilterFullText ;
      AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV12TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV14TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV16TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV20TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV22TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV24TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV27TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           AV47Emprcod ,
                                           AV48Proforcod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CN2 */
      pr_default.execute(0, new Object[] {AV47Emprcod, AV48Proforcod, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09CN2_A2804RecLinMaq[0] ;
         A764ProForCod = P09CN2_A764ProForCod[0] ;
         A396EmprCod = P09CN2_A396EmprCod[0] ;
         A6039RecAcab = P09CN2_A6039RecAcab[0] ;
         n6039RecAcab = P09CN2_n6039RecAcab[0] ;
         A1234BarNomCli = P09CN2_A1234BarNomCli[0] ;
         A136BarColNum = P09CN2_A136BarColNum[0] ;
         A135BarColNom = P09CN2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN2_A1652BarSerDsc[0] ;
         A212BarSer = P09CN2_A212BarSer[0] ;
         A279CliNom = P09CN2_A279CliNom[0] ;
         A252CliCod = P09CN2_A252CliCod[0] ;
         n252CliCod = P09CN2_n252CliCod[0] ;
         A130BarCodPar = P09CN2_A130BarCodPar[0] ;
         A132BarCodReo = P09CN2_A132BarCodReo[0] ;
         A129BarCod = P09CN2_A129BarCod[0] ;
         A1273RecLinPro = P09CN2_A1273RecLinPro[0] ;
         A1234BarNomCli = P09CN2_A1234BarNomCli[0] ;
         A136BarColNum = P09CN2_A136BarColNum[0] ;
         A135BarColNom = P09CN2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN2_A1652BarSerDsc[0] ;
         A212BarSer = P09CN2_A212BarSer[0] ;
         A252CliCod = P09CN2_A252CliCod[0] ;
         n252CliCod = P09CN2_n252CliCod[0] ;
         A279CliNom = P09CN2_A279CliNom[0] ;
         A6039RecAcab = P09CN2_A6039RecAcab[0] ;
         n6039RecAcab = P09CN2_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV32Option = A13696BarNHdr ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
            {
               AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
               AV40count = (long)(AV40count+1) ;
               AV38OptionIndexes.removeItem(AV31InsertIndex);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
            }
            else
            {
               AV33Options.add(AV32Option, AV31InsertIndex);
               AV38OptionIndexes.add("1", AV31InsertIndex);
            }
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV28SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV46FilterFullText ;
      AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV12TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV14TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV16TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV20TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV22TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV24TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV27TFRecAcab_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           A764ProForCod ,
                                           AV48Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CN3 */
      pr_default.execute(1, new Object[] {AV47Emprcod, AV48Proforcod, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9CN3 = false ;
         A2804RecLinMaq = P09CN3_A2804RecLinMaq[0] ;
         A396EmprCod = P09CN3_A396EmprCod[0] ;
         A764ProForCod = P09CN3_A764ProForCod[0] ;
         A279CliNom = P09CN3_A279CliNom[0] ;
         A6039RecAcab = P09CN3_A6039RecAcab[0] ;
         n6039RecAcab = P09CN3_n6039RecAcab[0] ;
         A1234BarNomCli = P09CN3_A1234BarNomCli[0] ;
         A136BarColNum = P09CN3_A136BarColNum[0] ;
         A135BarColNom = P09CN3_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN3_A1652BarSerDsc[0] ;
         A212BarSer = P09CN3_A212BarSer[0] ;
         A252CliCod = P09CN3_A252CliCod[0] ;
         n252CliCod = P09CN3_n252CliCod[0] ;
         A130BarCodPar = P09CN3_A130BarCodPar[0] ;
         A132BarCodReo = P09CN3_A132BarCodReo[0] ;
         A129BarCod = P09CN3_A129BarCod[0] ;
         A1273RecLinPro = P09CN3_A1273RecLinPro[0] ;
         A1234BarNomCli = P09CN3_A1234BarNomCli[0] ;
         A136BarColNum = P09CN3_A136BarColNum[0] ;
         A135BarColNom = P09CN3_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN3_A1652BarSerDsc[0] ;
         A212BarSer = P09CN3_A212BarSer[0] ;
         A252CliCod = P09CN3_A252CliCod[0] ;
         n252CliCod = P09CN3_n252CliCod[0] ;
         A279CliNom = P09CN3_A279CliNom[0] ;
         A6039RecAcab = P09CN3_A6039RecAcab[0] ;
         n6039RecAcab = P09CN3_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09CN3_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9CN3 = false ;
            A2804RecLinMaq = P09CN3_A2804RecLinMaq[0] ;
            A396EmprCod = P09CN3_A396EmprCod[0] ;
            A252CliCod = P09CN3_A252CliCod[0] ;
            n252CliCod = P09CN3_n252CliCod[0] ;
            A130BarCodPar = P09CN3_A130BarCodPar[0] ;
            A132BarCodReo = P09CN3_A132BarCodReo[0] ;
            A129BarCod = P09CN3_A129BarCod[0] ;
            A1273RecLinPro = P09CN3_A1273RecLinPro[0] ;
            A252CliCod = P09CN3_A252CliCod[0] ;
            n252CliCod = P09CN3_n252CliCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9CN3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV32Option = A279CliNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CN3 )
         {
            brk9CN3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarSer = AV28SearchTxt ;
      AV17TFBarSer_Sel = "" ;
      AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV46FilterFullText ;
      AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV12TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV14TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV16TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV20TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV22TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV24TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV27TFRecAcab_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           A764ProForCod ,
                                           AV48Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CN4 */
      pr_default.execute(2, new Object[] {AV47Emprcod, AV48Proforcod, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9CN5 = false ;
         A2804RecLinMaq = P09CN4_A2804RecLinMaq[0] ;
         A396EmprCod = P09CN4_A396EmprCod[0] ;
         A764ProForCod = P09CN4_A764ProForCod[0] ;
         A212BarSer = P09CN4_A212BarSer[0] ;
         A6039RecAcab = P09CN4_A6039RecAcab[0] ;
         n6039RecAcab = P09CN4_n6039RecAcab[0] ;
         A1234BarNomCli = P09CN4_A1234BarNomCli[0] ;
         A136BarColNum = P09CN4_A136BarColNum[0] ;
         A135BarColNom = P09CN4_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN4_A1652BarSerDsc[0] ;
         A279CliNom = P09CN4_A279CliNom[0] ;
         A252CliCod = P09CN4_A252CliCod[0] ;
         n252CliCod = P09CN4_n252CliCod[0] ;
         A130BarCodPar = P09CN4_A130BarCodPar[0] ;
         A132BarCodReo = P09CN4_A132BarCodReo[0] ;
         A129BarCod = P09CN4_A129BarCod[0] ;
         A1273RecLinPro = P09CN4_A1273RecLinPro[0] ;
         A212BarSer = P09CN4_A212BarSer[0] ;
         A1234BarNomCli = P09CN4_A1234BarNomCli[0] ;
         A136BarColNum = P09CN4_A136BarColNum[0] ;
         A135BarColNom = P09CN4_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN4_A1652BarSerDsc[0] ;
         A252CliCod = P09CN4_A252CliCod[0] ;
         n252CliCod = P09CN4_n252CliCod[0] ;
         A279CliNom = P09CN4_A279CliNom[0] ;
         A6039RecAcab = P09CN4_A6039RecAcab[0] ;
         n6039RecAcab = P09CN4_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09CN4_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9CN5 = false ;
            A2804RecLinMaq = P09CN4_A2804RecLinMaq[0] ;
            A396EmprCod = P09CN4_A396EmprCod[0] ;
            A130BarCodPar = P09CN4_A130BarCodPar[0] ;
            A132BarCodReo = P09CN4_A132BarCodReo[0] ;
            A129BarCod = P09CN4_A129BarCod[0] ;
            A1273RecLinPro = P09CN4_A1273RecLinPro[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9CN5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV32Option = A212BarSer ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CN5 )
         {
            brk9CN5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarSerDsc = AV28SearchTxt ;
      AV19TFBarSerDsc_Sel = "" ;
      AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV46FilterFullText ;
      AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV12TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV14TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV16TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV20TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV22TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV24TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV27TFRecAcab_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           A764ProForCod ,
                                           AV48Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CN5 */
      pr_default.execute(3, new Object[] {AV47Emprcod, AV48Proforcod, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9CN7 = false ;
         A2804RecLinMaq = P09CN5_A2804RecLinMaq[0] ;
         A396EmprCod = P09CN5_A396EmprCod[0] ;
         A764ProForCod = P09CN5_A764ProForCod[0] ;
         A1652BarSerDsc = P09CN5_A1652BarSerDsc[0] ;
         A6039RecAcab = P09CN5_A6039RecAcab[0] ;
         n6039RecAcab = P09CN5_n6039RecAcab[0] ;
         A1234BarNomCli = P09CN5_A1234BarNomCli[0] ;
         A136BarColNum = P09CN5_A136BarColNum[0] ;
         A135BarColNom = P09CN5_A135BarColNom[0] ;
         A212BarSer = P09CN5_A212BarSer[0] ;
         A279CliNom = P09CN5_A279CliNom[0] ;
         A252CliCod = P09CN5_A252CliCod[0] ;
         n252CliCod = P09CN5_n252CliCod[0] ;
         A130BarCodPar = P09CN5_A130BarCodPar[0] ;
         A132BarCodReo = P09CN5_A132BarCodReo[0] ;
         A129BarCod = P09CN5_A129BarCod[0] ;
         A1273RecLinPro = P09CN5_A1273RecLinPro[0] ;
         A1652BarSerDsc = P09CN5_A1652BarSerDsc[0] ;
         A1234BarNomCli = P09CN5_A1234BarNomCli[0] ;
         A136BarColNum = P09CN5_A136BarColNum[0] ;
         A135BarColNom = P09CN5_A135BarColNom[0] ;
         A212BarSer = P09CN5_A212BarSer[0] ;
         A252CliCod = P09CN5_A252CliCod[0] ;
         n252CliCod = P09CN5_n252CliCod[0] ;
         A279CliNom = P09CN5_A279CliNom[0] ;
         A6039RecAcab = P09CN5_A6039RecAcab[0] ;
         n6039RecAcab = P09CN5_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09CN5_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9CN7 = false ;
            A2804RecLinMaq = P09CN5_A2804RecLinMaq[0] ;
            A396EmprCod = P09CN5_A396EmprCod[0] ;
            A130BarCodPar = P09CN5_A130BarCodPar[0] ;
            A132BarCodReo = P09CN5_A132BarCodReo[0] ;
            A129BarCod = P09CN5_A129BarCod[0] ;
            A1273RecLinPro = P09CN5_A1273RecLinPro[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9CN7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV32Option = A1652BarSerDsc ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CN7 )
         {
            brk9CN7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarColNom = AV28SearchTxt ;
      AV21TFBarColNom_Sel = "" ;
      AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV46FilterFullText ;
      AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV12TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV14TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV16TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV20TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV22TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV24TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV27TFRecAcab_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           A764ProForCod ,
                                           AV48Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CN6 */
      pr_default.execute(4, new Object[] {AV47Emprcod, AV48Proforcod, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9CN9 = false ;
         A2804RecLinMaq = P09CN6_A2804RecLinMaq[0] ;
         A396EmprCod = P09CN6_A396EmprCod[0] ;
         A764ProForCod = P09CN6_A764ProForCod[0] ;
         A135BarColNom = P09CN6_A135BarColNom[0] ;
         A6039RecAcab = P09CN6_A6039RecAcab[0] ;
         n6039RecAcab = P09CN6_n6039RecAcab[0] ;
         A1234BarNomCli = P09CN6_A1234BarNomCli[0] ;
         A136BarColNum = P09CN6_A136BarColNum[0] ;
         A1652BarSerDsc = P09CN6_A1652BarSerDsc[0] ;
         A212BarSer = P09CN6_A212BarSer[0] ;
         A279CliNom = P09CN6_A279CliNom[0] ;
         A252CliCod = P09CN6_A252CliCod[0] ;
         n252CliCod = P09CN6_n252CliCod[0] ;
         A130BarCodPar = P09CN6_A130BarCodPar[0] ;
         A132BarCodReo = P09CN6_A132BarCodReo[0] ;
         A129BarCod = P09CN6_A129BarCod[0] ;
         A1273RecLinPro = P09CN6_A1273RecLinPro[0] ;
         A135BarColNom = P09CN6_A135BarColNom[0] ;
         A1234BarNomCli = P09CN6_A1234BarNomCli[0] ;
         A136BarColNum = P09CN6_A136BarColNum[0] ;
         A1652BarSerDsc = P09CN6_A1652BarSerDsc[0] ;
         A212BarSer = P09CN6_A212BarSer[0] ;
         A252CliCod = P09CN6_A252CliCod[0] ;
         n252CliCod = P09CN6_n252CliCod[0] ;
         A279CliNom = P09CN6_A279CliNom[0] ;
         A6039RecAcab = P09CN6_A6039RecAcab[0] ;
         n6039RecAcab = P09CN6_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09CN6_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk9CN9 = false ;
            A2804RecLinMaq = P09CN6_A2804RecLinMaq[0] ;
            A396EmprCod = P09CN6_A396EmprCod[0] ;
            A130BarCodPar = P09CN6_A130BarCodPar[0] ;
            A132BarCodReo = P09CN6_A132BarCodReo[0] ;
            A129BarCod = P09CN6_A129BarCod[0] ;
            A1273RecLinPro = P09CN6_A1273RecLinPro[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9CN9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV32Option = A135BarColNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CN9 )
         {
            brk9CN9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarNomCli = AV28SearchTxt ;
      AV25TFBarNomCli_Sel = "" ;
      AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV46FilterFullText ;
      AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV12TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV14TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV16TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV20TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV22TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV24TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV27TFRecAcab_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           A764ProForCod ,
                                           AV48Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CN7 */
      pr_default.execute(5, new Object[] {AV47Emprcod, AV48Proforcod, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9CN11 = false ;
         A2804RecLinMaq = P09CN7_A2804RecLinMaq[0] ;
         A396EmprCod = P09CN7_A396EmprCod[0] ;
         A764ProForCod = P09CN7_A764ProForCod[0] ;
         A1234BarNomCli = P09CN7_A1234BarNomCli[0] ;
         A6039RecAcab = P09CN7_A6039RecAcab[0] ;
         n6039RecAcab = P09CN7_n6039RecAcab[0] ;
         A136BarColNum = P09CN7_A136BarColNum[0] ;
         A135BarColNom = P09CN7_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN7_A1652BarSerDsc[0] ;
         A212BarSer = P09CN7_A212BarSer[0] ;
         A279CliNom = P09CN7_A279CliNom[0] ;
         A252CliCod = P09CN7_A252CliCod[0] ;
         n252CliCod = P09CN7_n252CliCod[0] ;
         A130BarCodPar = P09CN7_A130BarCodPar[0] ;
         A132BarCodReo = P09CN7_A132BarCodReo[0] ;
         A129BarCod = P09CN7_A129BarCod[0] ;
         A1273RecLinPro = P09CN7_A1273RecLinPro[0] ;
         A1234BarNomCli = P09CN7_A1234BarNomCli[0] ;
         A136BarColNum = P09CN7_A136BarColNum[0] ;
         A135BarColNom = P09CN7_A135BarColNom[0] ;
         A1652BarSerDsc = P09CN7_A1652BarSerDsc[0] ;
         A212BarSer = P09CN7_A212BarSer[0] ;
         A252CliCod = P09CN7_A252CliCod[0] ;
         n252CliCod = P09CN7_n252CliCod[0] ;
         A279CliNom = P09CN7_A279CliNom[0] ;
         A6039RecAcab = P09CN7_A6039RecAcab[0] ;
         n6039RecAcab = P09CN7_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09CN7_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk9CN11 = false ;
            A2804RecLinMaq = P09CN7_A2804RecLinMaq[0] ;
            A396EmprCod = P09CN7_A396EmprCod[0] ;
            A130BarCodPar = P09CN7_A130BarCodPar[0] ;
            A132BarCodReo = P09CN7_A132BarCodReo[0] ;
            A129BarCod = P09CN7_A129BarCod[0] ;
            A1273RecLinPro = P09CN7_A1273RecLinPro[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9CN11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV32Option = A1234BarNomCli ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CN11 )
         {
            brk9CN11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = wcsituacionprocesoquimicorecetas_crecetgetfilterdata.this.AV39OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV16TFBarSer = "" ;
      AV17TFBarSer_Sel = "" ;
      AV18TFBarSerDsc = "" ;
      AV19TFBarSerDsc_Sel = "" ;
      AV20TFBarColNom = "" ;
      AV21TFBarColNom_Sel = "" ;
      AV24TFBarNomCli = "" ;
      AV25TFBarNomCli_Sel = "" ;
      AV26TFRecAcab_SelsJson = "" ;
      AV27TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47Emprcod = "" ;
      AV48Proforcod = "" ;
      A13696BarNHdr = "" ;
      AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = "" ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = "" ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = "" ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = "" ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = "" ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P09CN2_A2804RecLinMaq = new short[1] ;
      P09CN2_A764ProForCod = new String[] {""} ;
      P09CN2_A396EmprCod = new String[] {""} ;
      P09CN2_A6039RecAcab = new String[] {""} ;
      P09CN2_n6039RecAcab = new boolean[] {false} ;
      P09CN2_A1234BarNomCli = new String[] {""} ;
      P09CN2_A136BarColNum = new int[1] ;
      P09CN2_A135BarColNom = new String[] {""} ;
      P09CN2_A1652BarSerDsc = new String[] {""} ;
      P09CN2_A212BarSer = new String[] {""} ;
      P09CN2_A279CliNom = new String[] {""} ;
      P09CN2_A252CliCod = new int[1] ;
      P09CN2_n252CliCod = new boolean[] {false} ;
      P09CN2_A130BarCodPar = new String[] {""} ;
      P09CN2_A132BarCodReo = new byte[1] ;
      P09CN2_A129BarCod = new int[1] ;
      P09CN2_A1273RecLinPro = new byte[1] ;
      AV32Option = "" ;
      P09CN3_A2804RecLinMaq = new short[1] ;
      P09CN3_A396EmprCod = new String[] {""} ;
      P09CN3_A764ProForCod = new String[] {""} ;
      P09CN3_A279CliNom = new String[] {""} ;
      P09CN3_A6039RecAcab = new String[] {""} ;
      P09CN3_n6039RecAcab = new boolean[] {false} ;
      P09CN3_A1234BarNomCli = new String[] {""} ;
      P09CN3_A136BarColNum = new int[1] ;
      P09CN3_A135BarColNom = new String[] {""} ;
      P09CN3_A1652BarSerDsc = new String[] {""} ;
      P09CN3_A212BarSer = new String[] {""} ;
      P09CN3_A252CliCod = new int[1] ;
      P09CN3_n252CliCod = new boolean[] {false} ;
      P09CN3_A130BarCodPar = new String[] {""} ;
      P09CN3_A132BarCodReo = new byte[1] ;
      P09CN3_A129BarCod = new int[1] ;
      P09CN3_A1273RecLinPro = new byte[1] ;
      P09CN4_A2804RecLinMaq = new short[1] ;
      P09CN4_A396EmprCod = new String[] {""} ;
      P09CN4_A764ProForCod = new String[] {""} ;
      P09CN4_A212BarSer = new String[] {""} ;
      P09CN4_A6039RecAcab = new String[] {""} ;
      P09CN4_n6039RecAcab = new boolean[] {false} ;
      P09CN4_A1234BarNomCli = new String[] {""} ;
      P09CN4_A136BarColNum = new int[1] ;
      P09CN4_A135BarColNom = new String[] {""} ;
      P09CN4_A1652BarSerDsc = new String[] {""} ;
      P09CN4_A279CliNom = new String[] {""} ;
      P09CN4_A252CliCod = new int[1] ;
      P09CN4_n252CliCod = new boolean[] {false} ;
      P09CN4_A130BarCodPar = new String[] {""} ;
      P09CN4_A132BarCodReo = new byte[1] ;
      P09CN4_A129BarCod = new int[1] ;
      P09CN4_A1273RecLinPro = new byte[1] ;
      P09CN5_A2804RecLinMaq = new short[1] ;
      P09CN5_A396EmprCod = new String[] {""} ;
      P09CN5_A764ProForCod = new String[] {""} ;
      P09CN5_A1652BarSerDsc = new String[] {""} ;
      P09CN5_A6039RecAcab = new String[] {""} ;
      P09CN5_n6039RecAcab = new boolean[] {false} ;
      P09CN5_A1234BarNomCli = new String[] {""} ;
      P09CN5_A136BarColNum = new int[1] ;
      P09CN5_A135BarColNom = new String[] {""} ;
      P09CN5_A212BarSer = new String[] {""} ;
      P09CN5_A279CliNom = new String[] {""} ;
      P09CN5_A252CliCod = new int[1] ;
      P09CN5_n252CliCod = new boolean[] {false} ;
      P09CN5_A130BarCodPar = new String[] {""} ;
      P09CN5_A132BarCodReo = new byte[1] ;
      P09CN5_A129BarCod = new int[1] ;
      P09CN5_A1273RecLinPro = new byte[1] ;
      P09CN6_A2804RecLinMaq = new short[1] ;
      P09CN6_A396EmprCod = new String[] {""} ;
      P09CN6_A764ProForCod = new String[] {""} ;
      P09CN6_A135BarColNom = new String[] {""} ;
      P09CN6_A6039RecAcab = new String[] {""} ;
      P09CN6_n6039RecAcab = new boolean[] {false} ;
      P09CN6_A1234BarNomCli = new String[] {""} ;
      P09CN6_A136BarColNum = new int[1] ;
      P09CN6_A1652BarSerDsc = new String[] {""} ;
      P09CN6_A212BarSer = new String[] {""} ;
      P09CN6_A279CliNom = new String[] {""} ;
      P09CN6_A252CliCod = new int[1] ;
      P09CN6_n252CliCod = new boolean[] {false} ;
      P09CN6_A130BarCodPar = new String[] {""} ;
      P09CN6_A132BarCodReo = new byte[1] ;
      P09CN6_A129BarCod = new int[1] ;
      P09CN6_A1273RecLinPro = new byte[1] ;
      P09CN7_A2804RecLinMaq = new short[1] ;
      P09CN7_A396EmprCod = new String[] {""} ;
      P09CN7_A764ProForCod = new String[] {""} ;
      P09CN7_A1234BarNomCli = new String[] {""} ;
      P09CN7_A6039RecAcab = new String[] {""} ;
      P09CN7_n6039RecAcab = new boolean[] {false} ;
      P09CN7_A136BarColNum = new int[1] ;
      P09CN7_A135BarColNom = new String[] {""} ;
      P09CN7_A1652BarSerDsc = new String[] {""} ;
      P09CN7_A212BarSer = new String[] {""} ;
      P09CN7_A279CliNom = new String[] {""} ;
      P09CN7_A252CliCod = new int[1] ;
      P09CN7_n252CliCod = new boolean[] {false} ;
      P09CN7_A130BarCodPar = new String[] {""} ;
      P09CN7_A132BarCodReo = new byte[1] ;
      P09CN7_A129BarCod = new int[1] ;
      P09CN7_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetas_crecetgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09CN2_A2804RecLinMaq, P09CN2_A764ProForCod, P09CN2_A396EmprCod, P09CN2_A6039RecAcab, P09CN2_n6039RecAcab, P09CN2_A1234BarNomCli, P09CN2_A136BarColNum, P09CN2_A135BarColNom, P09CN2_A1652BarSerDsc, P09CN2_A212BarSer,
            P09CN2_A279CliNom, P09CN2_A252CliCod, P09CN2_n252CliCod, P09CN2_A130BarCodPar, P09CN2_A132BarCodReo, P09CN2_A129BarCod, P09CN2_A1273RecLinPro
            }
            , new Object[] {
            P09CN3_A2804RecLinMaq, P09CN3_A396EmprCod, P09CN3_A764ProForCod, P09CN3_A279CliNom, P09CN3_A6039RecAcab, P09CN3_n6039RecAcab, P09CN3_A1234BarNomCli, P09CN3_A136BarColNum, P09CN3_A135BarColNom, P09CN3_A1652BarSerDsc,
            P09CN3_A212BarSer, P09CN3_A252CliCod, P09CN3_n252CliCod, P09CN3_A130BarCodPar, P09CN3_A132BarCodReo, P09CN3_A129BarCod, P09CN3_A1273RecLinPro
            }
            , new Object[] {
            P09CN4_A2804RecLinMaq, P09CN4_A396EmprCod, P09CN4_A764ProForCod, P09CN4_A212BarSer, P09CN4_A6039RecAcab, P09CN4_n6039RecAcab, P09CN4_A1234BarNomCli, P09CN4_A136BarColNum, P09CN4_A135BarColNom, P09CN4_A1652BarSerDsc,
            P09CN4_A279CliNom, P09CN4_A252CliCod, P09CN4_n252CliCod, P09CN4_A130BarCodPar, P09CN4_A132BarCodReo, P09CN4_A129BarCod, P09CN4_A1273RecLinPro
            }
            , new Object[] {
            P09CN5_A2804RecLinMaq, P09CN5_A396EmprCod, P09CN5_A764ProForCod, P09CN5_A1652BarSerDsc, P09CN5_A6039RecAcab, P09CN5_n6039RecAcab, P09CN5_A1234BarNomCli, P09CN5_A136BarColNum, P09CN5_A135BarColNom, P09CN5_A212BarSer,
            P09CN5_A279CliNom, P09CN5_A252CliCod, P09CN5_n252CliCod, P09CN5_A130BarCodPar, P09CN5_A132BarCodReo, P09CN5_A129BarCod, P09CN5_A1273RecLinPro
            }
            , new Object[] {
            P09CN6_A2804RecLinMaq, P09CN6_A396EmprCod, P09CN6_A764ProForCod, P09CN6_A135BarColNom, P09CN6_A6039RecAcab, P09CN6_n6039RecAcab, P09CN6_A1234BarNomCli, P09CN6_A136BarColNum, P09CN6_A1652BarSerDsc, P09CN6_A212BarSer,
            P09CN6_A279CliNom, P09CN6_A252CliCod, P09CN6_n252CliCod, P09CN6_A130BarCodPar, P09CN6_A132BarCodReo, P09CN6_A129BarCod, P09CN6_A1273RecLinPro
            }
            , new Object[] {
            P09CN7_A2804RecLinMaq, P09CN7_A396EmprCod, P09CN7_A764ProForCod, P09CN7_A1234BarNomCli, P09CN7_A6039RecAcab, P09CN7_n6039RecAcab, P09CN7_A136BarColNum, P09CN7_A135BarColNom, P09CN7_A1652BarSerDsc, P09CN7_A212BarSer,
            P09CN7_A279CliNom, P09CN7_A252CliCod, P09CN7_n252CliCod, P09CN7_A130BarCodPar, P09CN7_A132BarCodReo, P09CN7_A129BarCod, P09CN7_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV22TFBarColNum ;
   private int AV23TFBarColNum_To ;
   private int AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ;
   private int AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ;
   private int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ;
   private int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ;
   private int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV16TFBarSer ;
   private String AV17TFBarSer_Sel ;
   private String AV18TFBarSerDsc ;
   private String AV19TFBarSerDsc_Sel ;
   private String AV20TFBarColNom ;
   private String AV21TFBarColNom_Sel ;
   private String AV24TFBarNomCli ;
   private String AV25TFBarNomCli_Sel ;
   private String AV47Emprcod ;
   private String AV48Proforcod ;
   private String A13696BarNHdr ;
   private String AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ;
   private String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ;
   private String AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ;
   private String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ;
   private String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ;
   private String scmdbuf ;
   private String lV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String lV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n252CliCod ;
   private boolean brk9CN3 ;
   private boolean brk9CN5 ;
   private boolean brk9CN7 ;
   private boolean brk9CN9 ;
   private boolean brk9CN11 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV26TFRecAcab_SelsJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private String lV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09CN2_A2804RecLinMaq ;
   private String[] P09CN2_A764ProForCod ;
   private String[] P09CN2_A396EmprCod ;
   private String[] P09CN2_A6039RecAcab ;
   private boolean[] P09CN2_n6039RecAcab ;
   private String[] P09CN2_A1234BarNomCli ;
   private int[] P09CN2_A136BarColNum ;
   private String[] P09CN2_A135BarColNom ;
   private String[] P09CN2_A1652BarSerDsc ;
   private String[] P09CN2_A212BarSer ;
   private String[] P09CN2_A279CliNom ;
   private int[] P09CN2_A252CliCod ;
   private boolean[] P09CN2_n252CliCod ;
   private String[] P09CN2_A130BarCodPar ;
   private byte[] P09CN2_A132BarCodReo ;
   private int[] P09CN2_A129BarCod ;
   private byte[] P09CN2_A1273RecLinPro ;
   private short[] P09CN3_A2804RecLinMaq ;
   private String[] P09CN3_A396EmprCod ;
   private String[] P09CN3_A764ProForCod ;
   private String[] P09CN3_A279CliNom ;
   private String[] P09CN3_A6039RecAcab ;
   private boolean[] P09CN3_n6039RecAcab ;
   private String[] P09CN3_A1234BarNomCli ;
   private int[] P09CN3_A136BarColNum ;
   private String[] P09CN3_A135BarColNom ;
   private String[] P09CN3_A1652BarSerDsc ;
   private String[] P09CN3_A212BarSer ;
   private int[] P09CN3_A252CliCod ;
   private boolean[] P09CN3_n252CliCod ;
   private String[] P09CN3_A130BarCodPar ;
   private byte[] P09CN3_A132BarCodReo ;
   private int[] P09CN3_A129BarCod ;
   private byte[] P09CN3_A1273RecLinPro ;
   private short[] P09CN4_A2804RecLinMaq ;
   private String[] P09CN4_A396EmprCod ;
   private String[] P09CN4_A764ProForCod ;
   private String[] P09CN4_A212BarSer ;
   private String[] P09CN4_A6039RecAcab ;
   private boolean[] P09CN4_n6039RecAcab ;
   private String[] P09CN4_A1234BarNomCli ;
   private int[] P09CN4_A136BarColNum ;
   private String[] P09CN4_A135BarColNom ;
   private String[] P09CN4_A1652BarSerDsc ;
   private String[] P09CN4_A279CliNom ;
   private int[] P09CN4_A252CliCod ;
   private boolean[] P09CN4_n252CliCod ;
   private String[] P09CN4_A130BarCodPar ;
   private byte[] P09CN4_A132BarCodReo ;
   private int[] P09CN4_A129BarCod ;
   private byte[] P09CN4_A1273RecLinPro ;
   private short[] P09CN5_A2804RecLinMaq ;
   private String[] P09CN5_A396EmprCod ;
   private String[] P09CN5_A764ProForCod ;
   private String[] P09CN5_A1652BarSerDsc ;
   private String[] P09CN5_A6039RecAcab ;
   private boolean[] P09CN5_n6039RecAcab ;
   private String[] P09CN5_A1234BarNomCli ;
   private int[] P09CN5_A136BarColNum ;
   private String[] P09CN5_A135BarColNom ;
   private String[] P09CN5_A212BarSer ;
   private String[] P09CN5_A279CliNom ;
   private int[] P09CN5_A252CliCod ;
   private boolean[] P09CN5_n252CliCod ;
   private String[] P09CN5_A130BarCodPar ;
   private byte[] P09CN5_A132BarCodReo ;
   private int[] P09CN5_A129BarCod ;
   private byte[] P09CN5_A1273RecLinPro ;
   private short[] P09CN6_A2804RecLinMaq ;
   private String[] P09CN6_A396EmprCod ;
   private String[] P09CN6_A764ProForCod ;
   private String[] P09CN6_A135BarColNom ;
   private String[] P09CN6_A6039RecAcab ;
   private boolean[] P09CN6_n6039RecAcab ;
   private String[] P09CN6_A1234BarNomCli ;
   private int[] P09CN6_A136BarColNum ;
   private String[] P09CN6_A1652BarSerDsc ;
   private String[] P09CN6_A212BarSer ;
   private String[] P09CN6_A279CliNom ;
   private int[] P09CN6_A252CliCod ;
   private boolean[] P09CN6_n252CliCod ;
   private String[] P09CN6_A130BarCodPar ;
   private byte[] P09CN6_A132BarCodReo ;
   private int[] P09CN6_A129BarCod ;
   private byte[] P09CN6_A1273RecLinPro ;
   private short[] P09CN7_A2804RecLinMaq ;
   private String[] P09CN7_A396EmprCod ;
   private String[] P09CN7_A764ProForCod ;
   private String[] P09CN7_A1234BarNomCli ;
   private String[] P09CN7_A6039RecAcab ;
   private boolean[] P09CN7_n6039RecAcab ;
   private int[] P09CN7_A136BarColNum ;
   private String[] P09CN7_A135BarColNom ;
   private String[] P09CN7_A1652BarSerDsc ;
   private String[] P09CN7_A212BarSer ;
   private String[] P09CN7_A279CliNom ;
   private int[] P09CN7_A252CliCod ;
   private boolean[] P09CN7_n252CliCod ;
   private String[] P09CN7_A130BarCodPar ;
   private byte[] P09CN7_A132BarCodReo ;
   private int[] P09CN7_A129BarCod ;
   private byte[] P09CN7_A1273RecLinPro ;
   private GXSimpleCollection<String> AV27TFRecAcab_Sels ;
   private GXSimpleCollection<String> AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class wcsituacionprocesoquimicorecetas_crecetgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          String AV47Emprcod ,
                                          String AV48Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.ProForCod, T1.EmprCod, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09CN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          String A764ProForCod ,
                                          String AV48Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[27];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.ProForCod, T3.CliNom, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09CN4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          String A764ProForCod ,
                                          String AV48Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.ProForCod, T2.BarSer, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09CN5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          String A764ProForCod ,
                                          String AV48Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[27];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.ProForCod, T2.BarSerDsc, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09CN6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          String A764ProForCod ,
                                          String AV48Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[27];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.ProForCod, T2.BarColNom, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09CN7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          String A764ProForCod ,
                                          String AV48Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[27];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.ProForCod, T2.BarNomCli, T4.RecAcab, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P09CN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_P09CN3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 2 :
                  return conditional_P09CN4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 3 :
                  return conditional_P09CN5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 4 :
                  return conditional_P09CN6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 5 :
                  return conditional_P09CN7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CN4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CN5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CN6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CN7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
      }
   }

}

