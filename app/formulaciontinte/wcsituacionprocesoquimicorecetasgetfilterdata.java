package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetasgetfilterdata extends GXProcedure
{
   public wcsituacionprocesoquimicorecetasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsituacionprocesoquimicorecetasgetfilterdata.class ), "" );
   }

   public wcsituacionprocesoquimicorecetasgetfilterdata( int remoteHandle ,
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
      wcsituacionprocesoquimicorecetasgetfilterdata.this.aP5 = new String[] {""};
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
      wcsituacionprocesoquimicorecetasgetfilterdata.this.AV30DDOName = aP0;
      wcsituacionprocesoquimicorecetasgetfilterdata.this.AV28SearchTxt = aP1;
      wcsituacionprocesoquimicorecetasgetfilterdata.this.AV29SearchTxtTo = aP2;
      wcsituacionprocesoquimicorecetasgetfilterdata.this.aP3 = aP3;
      wcsituacionprocesoquimicorecetasgetfilterdata.this.aP4 = aP4;
      wcsituacionprocesoquimicorecetasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S131 ();
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
         S141 ();
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
         S151 ();
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
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
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
      if ( GXutil.strcmp(AV41Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV14TFBarSer = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV15TFBarSer_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV16TFBarSerDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV17TFBarSerDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV18TFBarColNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV19TFBarColNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV20TFBarColNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBarColNum_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV22TFBarNomCli = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV23TFBarNomCli_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV24TFBarNHdr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV25TFBarNHdr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV48TFRecAcab_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV49TFRecAcab_Sels.fromJSonString(AV48TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV46Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV47Proforcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV28SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV50FilterFullText ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV10TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV12TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV14TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV15TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV16TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV18TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV20TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV24TFBarNHdr ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV25TFBarNHdr_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV49TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           AV47Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IS2 */
      pr_default.execute(0, new Object[] {AV46Emprcod, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8IS2 = false ;
         A396EmprCod = P08IS2_A396EmprCod[0] ;
         A279CliNom = P08IS2_A279CliNom[0] ;
         A1234BarNomCli = P08IS2_A1234BarNomCli[0] ;
         A136BarColNum = P08IS2_A136BarColNum[0] ;
         A135BarColNom = P08IS2_A135BarColNom[0] ;
         A1652BarSerDsc = P08IS2_A1652BarSerDsc[0] ;
         A212BarSer = P08IS2_A212BarSer[0] ;
         A252CliCod = P08IS2_A252CliCod[0] ;
         n252CliCod = P08IS2_n252CliCod[0] ;
         A130BarCodPar = P08IS2_A130BarCodPar[0] ;
         A132BarCodReo = P08IS2_A132BarCodReo[0] ;
         A129BarCod = P08IS2_A129BarCod[0] ;
         A279CliNom = P08IS2_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08IS2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8IS2 = false ;
            A396EmprCod = P08IS2_A396EmprCod[0] ;
            A252CliCod = P08IS2_A252CliCod[0] ;
            n252CliCod = P08IS2_n252CliCod[0] ;
            A130BarCodPar = P08IS2_A130BarCodPar[0] ;
            A132BarCodReo = P08IS2_A132BarCodReo[0] ;
            A129BarCod = P08IS2_A129BarCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8IS2 = true ;
            pr_default.readNext(0);
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
         if ( ! brk8IS2 )
         {
            brk8IS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarSer = AV28SearchTxt ;
      AV15TFBarSer_Sel = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV50FilterFullText ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV10TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV12TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV14TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV15TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV16TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV18TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV20TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV24TFBarNHdr ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV25TFBarNHdr_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV49TFRecAcab_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV47Proforcod ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IS3 */
      pr_default.execute(1, new Object[] {AV46Emprcod, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8IS4 = false ;
         A396EmprCod = P08IS3_A396EmprCod[0] ;
         A212BarSer = P08IS3_A212BarSer[0] ;
         A1234BarNomCli = P08IS3_A1234BarNomCli[0] ;
         A136BarColNum = P08IS3_A136BarColNum[0] ;
         A135BarColNom = P08IS3_A135BarColNom[0] ;
         A1652BarSerDsc = P08IS3_A1652BarSerDsc[0] ;
         A279CliNom = P08IS3_A279CliNom[0] ;
         A252CliCod = P08IS3_A252CliCod[0] ;
         n252CliCod = P08IS3_n252CliCod[0] ;
         A130BarCodPar = P08IS3_A130BarCodPar[0] ;
         A132BarCodReo = P08IS3_A132BarCodReo[0] ;
         A129BarCod = P08IS3_A129BarCod[0] ;
         A279CliNom = P08IS3_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08IS3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08IS3_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk8IS4 = false ;
            A130BarCodPar = P08IS3_A130BarCodPar[0] ;
            A132BarCodReo = P08IS3_A132BarCodReo[0] ;
            A129BarCod = P08IS3_A129BarCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8IS4 = true ;
            pr_default.readNext(1);
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
         if ( ! brk8IS4 )
         {
            brk8IS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarSerDsc = AV28SearchTxt ;
      AV17TFBarSerDsc_Sel = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV50FilterFullText ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV10TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV12TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV14TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV15TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV16TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV18TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV20TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV24TFBarNHdr ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV25TFBarNHdr_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV49TFRecAcab_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           AV47Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IS4 */
      pr_default.execute(2, new Object[] {AV46Emprcod, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8IS6 = false ;
         A396EmprCod = P08IS4_A396EmprCod[0] ;
         A1652BarSerDsc = P08IS4_A1652BarSerDsc[0] ;
         A1234BarNomCli = P08IS4_A1234BarNomCli[0] ;
         A136BarColNum = P08IS4_A136BarColNum[0] ;
         A135BarColNom = P08IS4_A135BarColNom[0] ;
         A212BarSer = P08IS4_A212BarSer[0] ;
         A279CliNom = P08IS4_A279CliNom[0] ;
         A252CliCod = P08IS4_A252CliCod[0] ;
         n252CliCod = P08IS4_n252CliCod[0] ;
         A130BarCodPar = P08IS4_A130BarCodPar[0] ;
         A132BarCodReo = P08IS4_A132BarCodReo[0] ;
         A129BarCod = P08IS4_A129BarCod[0] ;
         A279CliNom = P08IS4_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08IS4_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk8IS6 = false ;
            A396EmprCod = P08IS4_A396EmprCod[0] ;
            A130BarCodPar = P08IS4_A130BarCodPar[0] ;
            A132BarCodReo = P08IS4_A132BarCodReo[0] ;
            A129BarCod = P08IS4_A129BarCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8IS6 = true ;
            pr_default.readNext(2);
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
         if ( ! brk8IS6 )
         {
            brk8IS6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarColNom = AV28SearchTxt ;
      AV19TFBarColNom_Sel = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV50FilterFullText ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV10TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV12TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV14TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV15TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV16TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV18TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV20TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV24TFBarNHdr ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV25TFBarNHdr_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV49TFRecAcab_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           AV47Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IS5 */
      pr_default.execute(3, new Object[] {AV46Emprcod, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8IS8 = false ;
         A396EmprCod = P08IS5_A396EmprCod[0] ;
         A135BarColNom = P08IS5_A135BarColNom[0] ;
         A1234BarNomCli = P08IS5_A1234BarNomCli[0] ;
         A136BarColNum = P08IS5_A136BarColNum[0] ;
         A1652BarSerDsc = P08IS5_A1652BarSerDsc[0] ;
         A212BarSer = P08IS5_A212BarSer[0] ;
         A279CliNom = P08IS5_A279CliNom[0] ;
         A252CliCod = P08IS5_A252CliCod[0] ;
         n252CliCod = P08IS5_n252CliCod[0] ;
         A130BarCodPar = P08IS5_A130BarCodPar[0] ;
         A132BarCodReo = P08IS5_A132BarCodReo[0] ;
         A129BarCod = P08IS5_A129BarCod[0] ;
         A279CliNom = P08IS5_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08IS5_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk8IS8 = false ;
            A396EmprCod = P08IS5_A396EmprCod[0] ;
            A130BarCodPar = P08IS5_A130BarCodPar[0] ;
            A132BarCodReo = P08IS5_A132BarCodReo[0] ;
            A129BarCod = P08IS5_A129BarCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8IS8 = true ;
            pr_default.readNext(3);
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
         if ( ! brk8IS8 )
         {
            brk8IS8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarNomCli = AV28SearchTxt ;
      AV23TFBarNomCli_Sel = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV50FilterFullText ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV10TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV12TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV14TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV15TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV16TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV18TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV20TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV24TFBarNHdr ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV25TFBarNHdr_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV49TFRecAcab_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           AV47Proforcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IS6 */
      pr_default.execute(4, new Object[] {AV46Emprcod, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8IS10 = false ;
         A396EmprCod = P08IS6_A396EmprCod[0] ;
         A1234BarNomCli = P08IS6_A1234BarNomCli[0] ;
         A136BarColNum = P08IS6_A136BarColNum[0] ;
         A135BarColNom = P08IS6_A135BarColNom[0] ;
         A1652BarSerDsc = P08IS6_A1652BarSerDsc[0] ;
         A212BarSer = P08IS6_A212BarSer[0] ;
         A279CliNom = P08IS6_A279CliNom[0] ;
         A252CliCod = P08IS6_A252CliCod[0] ;
         n252CliCod = P08IS6_n252CliCod[0] ;
         A130BarCodPar = P08IS6_A130BarCodPar[0] ;
         A132BarCodReo = P08IS6_A132BarCodReo[0] ;
         A129BarCod = P08IS6_A129BarCod[0] ;
         A279CliNom = P08IS6_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08IS6_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk8IS10 = false ;
            A396EmprCod = P08IS6_A396EmprCod[0] ;
            A130BarCodPar = P08IS6_A130BarCodPar[0] ;
            A132BarCodReo = P08IS6_A132BarCodReo[0] ;
            A129BarCod = P08IS6_A129BarCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8IS10 = true ;
            pr_default.readNext(4);
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
         if ( ! brk8IS10 )
         {
            brk8IS10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarNHdr = AV28SearchTxt ;
      AV25TFBarNHdr_Sel = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV50FilterFullText ;
      AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV10TFCliCod ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV12TFCliNom ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV14TFBarSer ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV15TFBarSer_Sel ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV16TFBarSerDsc ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV18TFBarColNom ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV20TFBarColNum ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV24TFBarNHdr ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV25TFBarNHdr_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV49TFRecAcab_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV47Proforcod ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IS7 */
      pr_default.execute(5, new Object[] {AV46Emprcod, Integer.valueOf(AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P08IS7_A396EmprCod[0] ;
         A1234BarNomCli = P08IS7_A1234BarNomCli[0] ;
         A136BarColNum = P08IS7_A136BarColNum[0] ;
         A135BarColNom = P08IS7_A135BarColNom[0] ;
         A1652BarSerDsc = P08IS7_A1652BarSerDsc[0] ;
         A212BarSer = P08IS7_A212BarSer[0] ;
         A279CliNom = P08IS7_A279CliNom[0] ;
         A252CliCod = P08IS7_A252CliCod[0] ;
         n252CliCod = P08IS7_n252CliCod[0] ;
         A130BarCodPar = P08IS7_A130BarCodPar[0] ;
         A132BarCodReo = P08IS7_A132BarCodReo[0] ;
         A129BarCod = P08IS7_A129BarCod[0] ;
         A279CliNom = P08IS7_A279CliNom[0] ;
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
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcsituacionprocesoquimicorecetasgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = wcsituacionprocesoquimicorecetasgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = wcsituacionprocesoquimicorecetasgetfilterdata.this.AV39OptionIndexesJson;
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
      AV50FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFBarSer = "" ;
      AV15TFBarSer_Sel = "" ;
      AV16TFBarSerDsc = "" ;
      AV17TFBarSerDsc_Sel = "" ;
      AV18TFBarColNom = "" ;
      AV19TFBarColNom_Sel = "" ;
      AV22TFBarNomCli = "" ;
      AV23TFBarNomCli_Sel = "" ;
      AV24TFBarNHdr = "" ;
      AV25TFBarNHdr_Sel = "" ;
      AV48TFRecAcab_SelsJson = "" ;
      AV49TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46Emprcod = "" ;
      AV47Proforcod = "" ;
      A279CliNom = "" ;
      AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = "" ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = "" ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = "" ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = "" ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = "" ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = "" ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      A6039RecAcab = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P08IS2_A396EmprCod = new String[] {""} ;
      P08IS2_A279CliNom = new String[] {""} ;
      P08IS2_A1234BarNomCli = new String[] {""} ;
      P08IS2_A136BarColNum = new int[1] ;
      P08IS2_A135BarColNom = new String[] {""} ;
      P08IS2_A1652BarSerDsc = new String[] {""} ;
      P08IS2_A212BarSer = new String[] {""} ;
      P08IS2_A252CliCod = new int[1] ;
      P08IS2_n252CliCod = new boolean[] {false} ;
      P08IS2_A130BarCodPar = new String[] {""} ;
      P08IS2_A132BarCodReo = new byte[1] ;
      P08IS2_A129BarCod = new int[1] ;
      A13696BarNHdr = "" ;
      AV32Option = "" ;
      P08IS3_A396EmprCod = new String[] {""} ;
      P08IS3_A212BarSer = new String[] {""} ;
      P08IS3_A1234BarNomCli = new String[] {""} ;
      P08IS3_A136BarColNum = new int[1] ;
      P08IS3_A135BarColNom = new String[] {""} ;
      P08IS3_A1652BarSerDsc = new String[] {""} ;
      P08IS3_A279CliNom = new String[] {""} ;
      P08IS3_A252CliCod = new int[1] ;
      P08IS3_n252CliCod = new boolean[] {false} ;
      P08IS3_A130BarCodPar = new String[] {""} ;
      P08IS3_A132BarCodReo = new byte[1] ;
      P08IS3_A129BarCod = new int[1] ;
      P08IS4_A396EmprCod = new String[] {""} ;
      P08IS4_A1652BarSerDsc = new String[] {""} ;
      P08IS4_A1234BarNomCli = new String[] {""} ;
      P08IS4_A136BarColNum = new int[1] ;
      P08IS4_A135BarColNom = new String[] {""} ;
      P08IS4_A212BarSer = new String[] {""} ;
      P08IS4_A279CliNom = new String[] {""} ;
      P08IS4_A252CliCod = new int[1] ;
      P08IS4_n252CliCod = new boolean[] {false} ;
      P08IS4_A130BarCodPar = new String[] {""} ;
      P08IS4_A132BarCodReo = new byte[1] ;
      P08IS4_A129BarCod = new int[1] ;
      P08IS5_A396EmprCod = new String[] {""} ;
      P08IS5_A135BarColNom = new String[] {""} ;
      P08IS5_A1234BarNomCli = new String[] {""} ;
      P08IS5_A136BarColNum = new int[1] ;
      P08IS5_A1652BarSerDsc = new String[] {""} ;
      P08IS5_A212BarSer = new String[] {""} ;
      P08IS5_A279CliNom = new String[] {""} ;
      P08IS5_A252CliCod = new int[1] ;
      P08IS5_n252CliCod = new boolean[] {false} ;
      P08IS5_A130BarCodPar = new String[] {""} ;
      P08IS5_A132BarCodReo = new byte[1] ;
      P08IS5_A129BarCod = new int[1] ;
      P08IS6_A396EmprCod = new String[] {""} ;
      P08IS6_A1234BarNomCli = new String[] {""} ;
      P08IS6_A136BarColNum = new int[1] ;
      P08IS6_A135BarColNom = new String[] {""} ;
      P08IS6_A1652BarSerDsc = new String[] {""} ;
      P08IS6_A212BarSer = new String[] {""} ;
      P08IS6_A279CliNom = new String[] {""} ;
      P08IS6_A252CliCod = new int[1] ;
      P08IS6_n252CliCod = new boolean[] {false} ;
      P08IS6_A130BarCodPar = new String[] {""} ;
      P08IS6_A132BarCodReo = new byte[1] ;
      P08IS6_A129BarCod = new int[1] ;
      P08IS7_A396EmprCod = new String[] {""} ;
      P08IS7_A1234BarNomCli = new String[] {""} ;
      P08IS7_A136BarColNum = new int[1] ;
      P08IS7_A135BarColNom = new String[] {""} ;
      P08IS7_A1652BarSerDsc = new String[] {""} ;
      P08IS7_A212BarSer = new String[] {""} ;
      P08IS7_A279CliNom = new String[] {""} ;
      P08IS7_A252CliCod = new int[1] ;
      P08IS7_n252CliCod = new boolean[] {false} ;
      P08IS7_A130BarCodPar = new String[] {""} ;
      P08IS7_A132BarCodReo = new byte[1] ;
      P08IS7_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08IS2_A396EmprCod, P08IS2_A279CliNom, P08IS2_A1234BarNomCli, P08IS2_A136BarColNum, P08IS2_A135BarColNom, P08IS2_A1652BarSerDsc, P08IS2_A212BarSer, P08IS2_A252CliCod, P08IS2_n252CliCod, P08IS2_A130BarCodPar,
            P08IS2_A132BarCodReo, P08IS2_A129BarCod
            }
            , new Object[] {
            P08IS3_A396EmprCod, P08IS3_A212BarSer, P08IS3_A1234BarNomCli, P08IS3_A136BarColNum, P08IS3_A135BarColNom, P08IS3_A1652BarSerDsc, P08IS3_A279CliNom, P08IS3_A252CliCod, P08IS3_n252CliCod, P08IS3_A130BarCodPar,
            P08IS3_A132BarCodReo, P08IS3_A129BarCod
            }
            , new Object[] {
            P08IS4_A396EmprCod, P08IS4_A1652BarSerDsc, P08IS4_A1234BarNomCli, P08IS4_A136BarColNum, P08IS4_A135BarColNom, P08IS4_A212BarSer, P08IS4_A279CliNom, P08IS4_A252CliCod, P08IS4_n252CliCod, P08IS4_A130BarCodPar,
            P08IS4_A132BarCodReo, P08IS4_A129BarCod
            }
            , new Object[] {
            P08IS5_A396EmprCod, P08IS5_A135BarColNom, P08IS5_A1234BarNomCli, P08IS5_A136BarColNum, P08IS5_A1652BarSerDsc, P08IS5_A212BarSer, P08IS5_A279CliNom, P08IS5_A252CliCod, P08IS5_n252CliCod, P08IS5_A130BarCodPar,
            P08IS5_A132BarCodReo, P08IS5_A129BarCod
            }
            , new Object[] {
            P08IS6_A396EmprCod, P08IS6_A1234BarNomCli, P08IS6_A136BarColNum, P08IS6_A135BarColNom, P08IS6_A1652BarSerDsc, P08IS6_A212BarSer, P08IS6_A279CliNom, P08IS6_A252CliCod, P08IS6_n252CliCod, P08IS6_A130BarCodPar,
            P08IS6_A132BarCodReo, P08IS6_A129BarCod
            }
            , new Object[] {
            P08IS7_A396EmprCod, P08IS7_A1234BarNomCli, P08IS7_A136BarColNum, P08IS7_A135BarColNom, P08IS7_A1652BarSerDsc, P08IS7_A212BarSer, P08IS7_A279CliNom, P08IS7_A252CliCod, P08IS7_n252CliCod, P08IS7_A130BarCodPar,
            P08IS7_A132BarCodReo, P08IS7_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV20TFBarColNum ;
   private int AV21TFBarColNum_To ;
   private int AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ;
   private int AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ;
   private int AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ;
   private int AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ;
   private int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFBarSer ;
   private String AV15TFBarSer_Sel ;
   private String AV16TFBarSerDsc ;
   private String AV17TFBarSerDsc_Sel ;
   private String AV18TFBarColNom ;
   private String AV19TFBarColNom_Sel ;
   private String AV22TFBarNomCli ;
   private String AV23TFBarNomCli_Sel ;
   private String AV24TFBarNHdr ;
   private String AV25TFBarNHdr_Sel ;
   private String AV46Emprcod ;
   private String AV47Proforcod ;
   private String A279CliNom ;
   private String AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ;
   private String AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ;
   private String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ;
   private String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ;
   private String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ;
   private String scmdbuf ;
   private String lV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String lV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String A6039RecAcab ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private boolean returnInSub ;
   private boolean brk8IS2 ;
   private boolean n252CliCod ;
   private boolean brk8IS4 ;
   private boolean brk8IS6 ;
   private boolean brk8IS8 ;
   private boolean brk8IS10 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV48TFRecAcab_SelsJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08IS2_A396EmprCod ;
   private String[] P08IS2_A279CliNom ;
   private String[] P08IS2_A1234BarNomCli ;
   private int[] P08IS2_A136BarColNum ;
   private String[] P08IS2_A135BarColNom ;
   private String[] P08IS2_A1652BarSerDsc ;
   private String[] P08IS2_A212BarSer ;
   private int[] P08IS2_A252CliCod ;
   private boolean[] P08IS2_n252CliCod ;
   private String[] P08IS2_A130BarCodPar ;
   private byte[] P08IS2_A132BarCodReo ;
   private int[] P08IS2_A129BarCod ;
   private String[] P08IS3_A396EmprCod ;
   private String[] P08IS3_A212BarSer ;
   private String[] P08IS3_A1234BarNomCli ;
   private int[] P08IS3_A136BarColNum ;
   private String[] P08IS3_A135BarColNom ;
   private String[] P08IS3_A1652BarSerDsc ;
   private String[] P08IS3_A279CliNom ;
   private int[] P08IS3_A252CliCod ;
   private boolean[] P08IS3_n252CliCod ;
   private String[] P08IS3_A130BarCodPar ;
   private byte[] P08IS3_A132BarCodReo ;
   private int[] P08IS3_A129BarCod ;
   private String[] P08IS4_A396EmprCod ;
   private String[] P08IS4_A1652BarSerDsc ;
   private String[] P08IS4_A1234BarNomCli ;
   private int[] P08IS4_A136BarColNum ;
   private String[] P08IS4_A135BarColNom ;
   private String[] P08IS4_A212BarSer ;
   private String[] P08IS4_A279CliNom ;
   private int[] P08IS4_A252CliCod ;
   private boolean[] P08IS4_n252CliCod ;
   private String[] P08IS4_A130BarCodPar ;
   private byte[] P08IS4_A132BarCodReo ;
   private int[] P08IS4_A129BarCod ;
   private String[] P08IS5_A396EmprCod ;
   private String[] P08IS5_A135BarColNom ;
   private String[] P08IS5_A1234BarNomCli ;
   private int[] P08IS5_A136BarColNum ;
   private String[] P08IS5_A1652BarSerDsc ;
   private String[] P08IS5_A212BarSer ;
   private String[] P08IS5_A279CliNom ;
   private int[] P08IS5_A252CliCod ;
   private boolean[] P08IS5_n252CliCod ;
   private String[] P08IS5_A130BarCodPar ;
   private byte[] P08IS5_A132BarCodReo ;
   private int[] P08IS5_A129BarCod ;
   private String[] P08IS6_A396EmprCod ;
   private String[] P08IS6_A1234BarNomCli ;
   private int[] P08IS6_A136BarColNum ;
   private String[] P08IS6_A135BarColNom ;
   private String[] P08IS6_A1652BarSerDsc ;
   private String[] P08IS6_A212BarSer ;
   private String[] P08IS6_A279CliNom ;
   private int[] P08IS6_A252CliCod ;
   private boolean[] P08IS6_n252CliCod ;
   private String[] P08IS6_A130BarCodPar ;
   private byte[] P08IS6_A132BarCodReo ;
   private int[] P08IS6_A129BarCod ;
   private String[] P08IS7_A396EmprCod ;
   private String[] P08IS7_A1234BarNomCli ;
   private int[] P08IS7_A136BarColNum ;
   private String[] P08IS7_A135BarColNom ;
   private String[] P08IS7_A1652BarSerDsc ;
   private String[] P08IS7_A212BarSer ;
   private String[] P08IS7_A279CliNom ;
   private int[] P08IS7_A252CliCod ;
   private boolean[] P08IS7_n252CliCod ;
   private String[] P08IS7_A130BarCodPar ;
   private byte[] P08IS7_A132BarCodReo ;
   private int[] P08IS7_A129BarCod ;
   private GXSimpleCollection<String> AV49TFRecAcab_Sels ;
   private GXSimpleCollection<String> AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class wcsituacionprocesoquimicorecetasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08IS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String AV47Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08IS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV47Proforcod ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[17];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSer, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08IS4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String AV47Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSerDsc, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08IS5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String AV47Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarColNom, T1.BarNomCli, T1.BarColNum, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08IS6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String AV47Proforcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[17];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08IS7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV55Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV47Proforcod ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[17];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV56Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
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
                  return conditional_P08IS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_P08IS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 2 :
                  return conditional_P08IS4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[33] );
            case 3 :
                  return conditional_P08IS5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[33] );
            case 4 :
                  return conditional_P08IS6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[33] );
            case 5 :
                  return conditional_P08IS7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08IS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08IS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08IS4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08IS5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08IS6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08IS7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
            case 2 :
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
            case 3 :
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
            case 4 :
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
            case 5 :
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
      }
   }

}

