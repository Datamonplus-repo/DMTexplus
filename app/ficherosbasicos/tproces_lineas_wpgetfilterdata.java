package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tproces_lineas_wpgetfilterdata extends GXProcedure
{
   public tproces_lineas_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_lineas_wpgetfilterdata.class ), "" );
   }

   public tproces_lineas_wpgetfilterdata( int remoteHandle ,
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
      tproces_lineas_wpgetfilterdata.this.aP5 = new String[] {""};
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
      tproces_lineas_wpgetfilterdata.this.AV50DDOName = aP0;
      tproces_lineas_wpgetfilterdata.this.AV51SearchTxt = aP1;
      tproces_lineas_wpgetfilterdata.this.AV52SearchTxtTo = aP2;
      tproces_lineas_wpgetfilterdata.this.aP3 = aP3;
      tproces_lineas_wpgetfilterdata.this.aP4 = aP4;
      tproces_lineas_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV43OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASACTTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADFASACTTINOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASCON") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCONOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASACAB") == 0 )
      {
         /* Execute user subroutine: 'LOADFASACABOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASFORMUL") == 0 )
      {
         /* Execute user subroutine: 'LOADFASFORMULOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASCONPLA") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCONPLAOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV53OptionsJson = AV40Options.toJSonString(false) ;
      AV54OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV55OptionIndexesJson = AV43OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("FicherosBasicos.TProces_Lineas_WPGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TProces_Lineas_WPGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("FicherosBasicos.TProces_Lineas_WPGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
         {
            AV10TFProNumLin = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFProNumLin_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV16TFMaqCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV17TFMaqCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV18TFFasDec = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFFasDec_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV20TFFasPreSal = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFFasPreSal_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV22TFFasPrePie = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFFasPrePie_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV24TFFasVelPro = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFFasVelPro_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV26TFFasNumPas = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFFasNumPas_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV28TFFasActTin = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV29TFFasActTin_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV30TFFasCon = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV31TFFasCon_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV32TFFasAcab = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV33TFFasAcab_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV34TFFasForMul = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV35TFFasForMul_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA") == 0 )
         {
            AV36TFFasConPla = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA_SEL") == 0 )
         {
            AV37TFFasConPla_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCOD") == 0 )
         {
            AV57Procod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRODSC") == 0 )
         {
            AV58Prodsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV51SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A758ProCod ,
                                           AV57Procod ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA9H2 = false ;
         A396EmprCod = P0A9H2_A396EmprCod[0] ;
         A457FasCod = P0A9H2_A457FasCod[0] ;
         A758ProCod = P0A9H2_A758ProCod[0] ;
         A4299FasConPla = P0A9H2_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H2_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H2_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H2_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H2_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H2_n4903FasAcab[0] ;
         A458FasCon = P0A9H2_A458FasCon[0] ;
         n458FasCon = P0A9H2_n458FasCon[0] ;
         A456FasActTin = P0A9H2_A456FasActTin[0] ;
         n456FasActTin = P0A9H2_n456FasActTin[0] ;
         A464FasNumPas = P0A9H2_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H2_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H2_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H2_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H2_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H2_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H2_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H2_n469FasPreSal[0] ;
         A459FasDec = P0A9H2_A459FasDec[0] ;
         n459FasDec = P0A9H2_n459FasDec[0] ;
         A602MaqCod = P0A9H2_A602MaqCod[0] ;
         n602MaqCod = P0A9H2_n602MaqCod[0] ;
         A460FasDsc = P0A9H2_A460FasDsc[0] ;
         A774ProNumLin = P0A9H2_A774ProNumLin[0] ;
         A4299FasConPla = P0A9H2_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H2_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H2_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H2_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H2_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H2_n4903FasAcab[0] ;
         A458FasCon = P0A9H2_A458FasCon[0] ;
         n458FasCon = P0A9H2_n458FasCon[0] ;
         A456FasActTin = P0A9H2_A456FasActTin[0] ;
         n456FasActTin = P0A9H2_n456FasActTin[0] ;
         A464FasNumPas = P0A9H2_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H2_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H2_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H2_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H2_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H2_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H2_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H2_n469FasPreSal[0] ;
         A459FasDec = P0A9H2_A459FasDec[0] ;
         n459FasDec = P0A9H2_n459FasDec[0] ;
         A602MaqCod = P0A9H2_A602MaqCod[0] ;
         n602MaqCod = P0A9H2_n602MaqCod[0] ;
         A460FasDsc = P0A9H2_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A9H2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A9H2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkA9H2 = false ;
            A758ProCod = P0A9H2_A758ProCod[0] ;
            A774ProNumLin = P0A9H2_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV39Option = A457FasCod ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV40Options.add(AV39Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H2 )
         {
            brkA9H2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV51SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A758ProCod ,
                                           AV57Procod ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H3 */
      pr_default.execute(1, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA9H4 = false ;
         A457FasCod = P0A9H3_A457FasCod[0] ;
         A396EmprCod = P0A9H3_A396EmprCod[0] ;
         A758ProCod = P0A9H3_A758ProCod[0] ;
         A4299FasConPla = P0A9H3_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H3_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H3_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H3_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H3_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H3_n4903FasAcab[0] ;
         A458FasCon = P0A9H3_A458FasCon[0] ;
         n458FasCon = P0A9H3_n458FasCon[0] ;
         A456FasActTin = P0A9H3_A456FasActTin[0] ;
         n456FasActTin = P0A9H3_n456FasActTin[0] ;
         A464FasNumPas = P0A9H3_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H3_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H3_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H3_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H3_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H3_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H3_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H3_n469FasPreSal[0] ;
         A459FasDec = P0A9H3_A459FasDec[0] ;
         n459FasDec = P0A9H3_n459FasDec[0] ;
         A602MaqCod = P0A9H3_A602MaqCod[0] ;
         n602MaqCod = P0A9H3_n602MaqCod[0] ;
         A460FasDsc = P0A9H3_A460FasDsc[0] ;
         A774ProNumLin = P0A9H3_A774ProNumLin[0] ;
         A4299FasConPla = P0A9H3_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H3_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H3_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H3_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H3_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H3_n4903FasAcab[0] ;
         A458FasCon = P0A9H3_A458FasCon[0] ;
         n458FasCon = P0A9H3_n458FasCon[0] ;
         A456FasActTin = P0A9H3_A456FasActTin[0] ;
         n456FasActTin = P0A9H3_n456FasActTin[0] ;
         A464FasNumPas = P0A9H3_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H3_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H3_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H3_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H3_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H3_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H3_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H3_n469FasPreSal[0] ;
         A459FasDec = P0A9H3_A459FasDec[0] ;
         n459FasDec = P0A9H3_n459FasDec[0] ;
         A602MaqCod = P0A9H3_A602MaqCod[0] ;
         n602MaqCod = P0A9H3_n602MaqCod[0] ;
         A460FasDsc = P0A9H3_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A9H3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A9H3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkA9H4 = false ;
            A758ProCod = P0A9H3_A758ProCod[0] ;
            A774ProNumLin = P0A9H3_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV39Option = A460FasDsc ;
            AV38InsertIndex = 1 ;
            while ( ( AV38InsertIndex <= AV40Options.size() ) && ( GXutil.strcmp((String)AV40Options.elementAt(-1+AV38InsertIndex), AV39Option) < 0 ) )
            {
               AV38InsertIndex = (int)(AV38InsertIndex+1) ;
            }
            AV40Options.add(AV39Option, AV38InsertIndex);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV38InsertIndex);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H4 )
         {
            brkA9H4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCod = AV51SearchTxt ;
      AV17TFMaqCod_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           A758ProCod ,
                                           AV57Procod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H4 */
      pr_default.execute(2, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA9H6 = false ;
         A396EmprCod = P0A9H4_A396EmprCod[0] ;
         A758ProCod = P0A9H4_A758ProCod[0] ;
         A602MaqCod = P0A9H4_A602MaqCod[0] ;
         n602MaqCod = P0A9H4_n602MaqCod[0] ;
         A4299FasConPla = P0A9H4_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H4_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H4_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H4_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H4_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H4_n4903FasAcab[0] ;
         A458FasCon = P0A9H4_A458FasCon[0] ;
         n458FasCon = P0A9H4_n458FasCon[0] ;
         A456FasActTin = P0A9H4_A456FasActTin[0] ;
         n456FasActTin = P0A9H4_n456FasActTin[0] ;
         A464FasNumPas = P0A9H4_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H4_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H4_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H4_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H4_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H4_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H4_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H4_n469FasPreSal[0] ;
         A459FasDec = P0A9H4_A459FasDec[0] ;
         n459FasDec = P0A9H4_n459FasDec[0] ;
         A460FasDsc = P0A9H4_A460FasDsc[0] ;
         A457FasCod = P0A9H4_A457FasCod[0] ;
         A774ProNumLin = P0A9H4_A774ProNumLin[0] ;
         A602MaqCod = P0A9H4_A602MaqCod[0] ;
         n602MaqCod = P0A9H4_n602MaqCod[0] ;
         A4299FasConPla = P0A9H4_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H4_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H4_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H4_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H4_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H4_n4903FasAcab[0] ;
         A458FasCon = P0A9H4_A458FasCon[0] ;
         n458FasCon = P0A9H4_n458FasCon[0] ;
         A456FasActTin = P0A9H4_A456FasActTin[0] ;
         n456FasActTin = P0A9H4_n456FasActTin[0] ;
         A464FasNumPas = P0A9H4_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H4_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H4_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H4_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H4_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H4_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H4_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H4_n469FasPreSal[0] ;
         A459FasDec = P0A9H4_A459FasDec[0] ;
         n459FasDec = P0A9H4_n459FasDec[0] ;
         A460FasDsc = P0A9H4_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A9H4_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brkA9H6 = false ;
            A396EmprCod = P0A9H4_A396EmprCod[0] ;
            A758ProCod = P0A9H4_A758ProCod[0] ;
            A457FasCod = P0A9H4_A457FasCod[0] ;
            A774ProNumLin = P0A9H4_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV39Option = A602MaqCod ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H6 )
         {
            brkA9H6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASACTTINOPTIONS' Routine */
      returnInSub = false ;
      AV28TFFasActTin = AV51SearchTxt ;
      AV29TFFasActTin_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           A758ProCod ,
                                           AV57Procod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H5 */
      pr_default.execute(3, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA9H8 = false ;
         A396EmprCod = P0A9H5_A396EmprCod[0] ;
         A758ProCod = P0A9H5_A758ProCod[0] ;
         A456FasActTin = P0A9H5_A456FasActTin[0] ;
         n456FasActTin = P0A9H5_n456FasActTin[0] ;
         A4299FasConPla = P0A9H5_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H5_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H5_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H5_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H5_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H5_n4903FasAcab[0] ;
         A458FasCon = P0A9H5_A458FasCon[0] ;
         n458FasCon = P0A9H5_n458FasCon[0] ;
         A464FasNumPas = P0A9H5_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H5_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H5_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H5_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H5_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H5_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H5_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H5_n469FasPreSal[0] ;
         A459FasDec = P0A9H5_A459FasDec[0] ;
         n459FasDec = P0A9H5_n459FasDec[0] ;
         A602MaqCod = P0A9H5_A602MaqCod[0] ;
         n602MaqCod = P0A9H5_n602MaqCod[0] ;
         A460FasDsc = P0A9H5_A460FasDsc[0] ;
         A457FasCod = P0A9H5_A457FasCod[0] ;
         A774ProNumLin = P0A9H5_A774ProNumLin[0] ;
         A456FasActTin = P0A9H5_A456FasActTin[0] ;
         n456FasActTin = P0A9H5_n456FasActTin[0] ;
         A4299FasConPla = P0A9H5_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H5_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H5_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H5_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H5_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H5_n4903FasAcab[0] ;
         A458FasCon = P0A9H5_A458FasCon[0] ;
         n458FasCon = P0A9H5_n458FasCon[0] ;
         A464FasNumPas = P0A9H5_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H5_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H5_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H5_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H5_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H5_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H5_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H5_n469FasPreSal[0] ;
         A459FasDec = P0A9H5_A459FasDec[0] ;
         n459FasDec = P0A9H5_n459FasDec[0] ;
         A602MaqCod = P0A9H5_A602MaqCod[0] ;
         n602MaqCod = P0A9H5_n602MaqCod[0] ;
         A460FasDsc = P0A9H5_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A9H5_A456FasActTin[0], A456FasActTin) == 0 ) )
         {
            brkA9H8 = false ;
            A396EmprCod = P0A9H5_A396EmprCod[0] ;
            A758ProCod = P0A9H5_A758ProCod[0] ;
            A457FasCod = P0A9H5_A457FasCod[0] ;
            A774ProNumLin = P0A9H5_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A456FasActTin)==0) )
         {
            AV39Option = A456FasActTin ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A456FasActTin, "@!"))) ;
            AV40Options.add(AV39Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H8 )
         {
            brkA9H8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFASCONOPTIONS' Routine */
      returnInSub = false ;
      AV30TFFasCon = AV51SearchTxt ;
      AV31TFFasCon_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           A758ProCod ,
                                           AV57Procod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H6 */
      pr_default.execute(4, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA9H10 = false ;
         A396EmprCod = P0A9H6_A396EmprCod[0] ;
         A758ProCod = P0A9H6_A758ProCod[0] ;
         A458FasCon = P0A9H6_A458FasCon[0] ;
         n458FasCon = P0A9H6_n458FasCon[0] ;
         A4299FasConPla = P0A9H6_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H6_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H6_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H6_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H6_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H6_n4903FasAcab[0] ;
         A456FasActTin = P0A9H6_A456FasActTin[0] ;
         n456FasActTin = P0A9H6_n456FasActTin[0] ;
         A464FasNumPas = P0A9H6_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H6_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H6_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H6_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H6_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H6_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H6_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H6_n469FasPreSal[0] ;
         A459FasDec = P0A9H6_A459FasDec[0] ;
         n459FasDec = P0A9H6_n459FasDec[0] ;
         A602MaqCod = P0A9H6_A602MaqCod[0] ;
         n602MaqCod = P0A9H6_n602MaqCod[0] ;
         A460FasDsc = P0A9H6_A460FasDsc[0] ;
         A457FasCod = P0A9H6_A457FasCod[0] ;
         A774ProNumLin = P0A9H6_A774ProNumLin[0] ;
         A458FasCon = P0A9H6_A458FasCon[0] ;
         n458FasCon = P0A9H6_n458FasCon[0] ;
         A4299FasConPla = P0A9H6_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H6_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H6_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H6_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H6_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H6_n4903FasAcab[0] ;
         A456FasActTin = P0A9H6_A456FasActTin[0] ;
         n456FasActTin = P0A9H6_n456FasActTin[0] ;
         A464FasNumPas = P0A9H6_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H6_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H6_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H6_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H6_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H6_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H6_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H6_n469FasPreSal[0] ;
         A459FasDec = P0A9H6_A459FasDec[0] ;
         n459FasDec = P0A9H6_n459FasDec[0] ;
         A602MaqCod = P0A9H6_A602MaqCod[0] ;
         n602MaqCod = P0A9H6_n602MaqCod[0] ;
         A460FasDsc = P0A9H6_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A9H6_A458FasCon[0], A458FasCon) == 0 ) )
         {
            brkA9H10 = false ;
            A396EmprCod = P0A9H6_A396EmprCod[0] ;
            A758ProCod = P0A9H6_A758ProCod[0] ;
            A457FasCod = P0A9H6_A457FasCod[0] ;
            A774ProNumLin = P0A9H6_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A458FasCon)==0) )
         {
            AV39Option = A458FasCon ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A458FasCon, "@!"))) ;
            AV40Options.add(AV39Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H10 )
         {
            brkA9H10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASACABOPTIONS' Routine */
      returnInSub = false ;
      AV32TFFasAcab = AV51SearchTxt ;
      AV33TFFasAcab_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           A758ProCod ,
                                           AV57Procod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H7 */
      pr_default.execute(5, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkA9H12 = false ;
         A396EmprCod = P0A9H7_A396EmprCod[0] ;
         A758ProCod = P0A9H7_A758ProCod[0] ;
         A4903FasAcab = P0A9H7_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H7_n4903FasAcab[0] ;
         A4299FasConPla = P0A9H7_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H7_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H7_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H7_n4286FasForMul[0] ;
         A458FasCon = P0A9H7_A458FasCon[0] ;
         n458FasCon = P0A9H7_n458FasCon[0] ;
         A456FasActTin = P0A9H7_A456FasActTin[0] ;
         n456FasActTin = P0A9H7_n456FasActTin[0] ;
         A464FasNumPas = P0A9H7_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H7_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H7_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H7_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H7_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H7_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H7_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H7_n469FasPreSal[0] ;
         A459FasDec = P0A9H7_A459FasDec[0] ;
         n459FasDec = P0A9H7_n459FasDec[0] ;
         A602MaqCod = P0A9H7_A602MaqCod[0] ;
         n602MaqCod = P0A9H7_n602MaqCod[0] ;
         A460FasDsc = P0A9H7_A460FasDsc[0] ;
         A457FasCod = P0A9H7_A457FasCod[0] ;
         A774ProNumLin = P0A9H7_A774ProNumLin[0] ;
         A4903FasAcab = P0A9H7_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H7_n4903FasAcab[0] ;
         A4299FasConPla = P0A9H7_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H7_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H7_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H7_n4286FasForMul[0] ;
         A458FasCon = P0A9H7_A458FasCon[0] ;
         n458FasCon = P0A9H7_n458FasCon[0] ;
         A456FasActTin = P0A9H7_A456FasActTin[0] ;
         n456FasActTin = P0A9H7_n456FasActTin[0] ;
         A464FasNumPas = P0A9H7_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H7_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H7_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H7_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H7_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H7_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H7_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H7_n469FasPreSal[0] ;
         A459FasDec = P0A9H7_A459FasDec[0] ;
         n459FasDec = P0A9H7_n459FasDec[0] ;
         A602MaqCod = P0A9H7_A602MaqCod[0] ;
         n602MaqCod = P0A9H7_n602MaqCod[0] ;
         A460FasDsc = P0A9H7_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0A9H7_A4903FasAcab[0], A4903FasAcab) == 0 ) )
         {
            brkA9H12 = false ;
            A396EmprCod = P0A9H7_A396EmprCod[0] ;
            A758ProCod = P0A9H7_A758ProCod[0] ;
            A457FasCod = P0A9H7_A457FasCod[0] ;
            A774ProNumLin = P0A9H7_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A4903FasAcab)==0) )
         {
            AV39Option = A4903FasAcab ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4903FasAcab, "@!"))) ;
            AV40Options.add(AV39Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H12 )
         {
            brkA9H12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADFASFORMULOPTIONS' Routine */
      returnInSub = false ;
      AV34TFFasForMul = AV51SearchTxt ;
      AV35TFFasForMul_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           A758ProCod ,
                                           AV57Procod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H8 */
      pr_default.execute(6, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkA9H14 = false ;
         A396EmprCod = P0A9H8_A396EmprCod[0] ;
         A758ProCod = P0A9H8_A758ProCod[0] ;
         A4286FasForMul = P0A9H8_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H8_n4286FasForMul[0] ;
         A4299FasConPla = P0A9H8_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H8_n4299FasConPla[0] ;
         A4903FasAcab = P0A9H8_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H8_n4903FasAcab[0] ;
         A458FasCon = P0A9H8_A458FasCon[0] ;
         n458FasCon = P0A9H8_n458FasCon[0] ;
         A456FasActTin = P0A9H8_A456FasActTin[0] ;
         n456FasActTin = P0A9H8_n456FasActTin[0] ;
         A464FasNumPas = P0A9H8_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H8_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H8_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H8_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H8_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H8_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H8_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H8_n469FasPreSal[0] ;
         A459FasDec = P0A9H8_A459FasDec[0] ;
         n459FasDec = P0A9H8_n459FasDec[0] ;
         A602MaqCod = P0A9H8_A602MaqCod[0] ;
         n602MaqCod = P0A9H8_n602MaqCod[0] ;
         A460FasDsc = P0A9H8_A460FasDsc[0] ;
         A457FasCod = P0A9H8_A457FasCod[0] ;
         A774ProNumLin = P0A9H8_A774ProNumLin[0] ;
         A4286FasForMul = P0A9H8_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H8_n4286FasForMul[0] ;
         A4299FasConPla = P0A9H8_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H8_n4299FasConPla[0] ;
         A4903FasAcab = P0A9H8_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H8_n4903FasAcab[0] ;
         A458FasCon = P0A9H8_A458FasCon[0] ;
         n458FasCon = P0A9H8_n458FasCon[0] ;
         A456FasActTin = P0A9H8_A456FasActTin[0] ;
         n456FasActTin = P0A9H8_n456FasActTin[0] ;
         A464FasNumPas = P0A9H8_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H8_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H8_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H8_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H8_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H8_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H8_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H8_n469FasPreSal[0] ;
         A459FasDec = P0A9H8_A459FasDec[0] ;
         n459FasDec = P0A9H8_n459FasDec[0] ;
         A602MaqCod = P0A9H8_A602MaqCod[0] ;
         n602MaqCod = P0A9H8_n602MaqCod[0] ;
         A460FasDsc = P0A9H8_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0A9H8_A4286FasForMul[0], A4286FasForMul) == 0 ) )
         {
            brkA9H14 = false ;
            A396EmprCod = P0A9H8_A396EmprCod[0] ;
            A758ProCod = P0A9H8_A758ProCod[0] ;
            A457FasCod = P0A9H8_A457FasCod[0] ;
            A774ProNumLin = P0A9H8_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A4286FasForMul)==0) )
         {
            AV39Option = A4286FasForMul ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4286FasForMul, "@!"))) ;
            AV40Options.add(AV39Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H14 )
         {
            brkA9H14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFASCONPLAOPTIONS' Routine */
      returnInSub = false ;
      AV36TFFasConPla = AV51SearchTxt ;
      AV37TFFasConPla_Sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV10TFProNumLin ;
      AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV12TFFasCod ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV14TFFasDsc ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV16TFMaqCod ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV18TFFasDec ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV19TFFasDec_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV20TFFasPreSal ;
      AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV21TFFasPreSal_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV22TFFasPrePie ;
      AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV23TFFasPrePie_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV24TFFasVelPro ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV25TFFasVelPro_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV26TFFasNumPas ;
      AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV27TFFasNumPas_To ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV28TFFasActTin ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV29TFFasActTin_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV30TFFasCon ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV31TFFasCon_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV32TFFasAcab ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV33TFFasAcab_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV34TFFasForMul ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV35TFFasForMul_Sel ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV36TFFasConPla ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV37TFFasConPla_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           A758ProCod ,
                                           AV57Procod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor P0A9H9 */
      pr_default.execute(7, new Object[] {AV56Emprcod, AV57Procod, Short.valueOf(AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brkA9H16 = false ;
         A396EmprCod = P0A9H9_A396EmprCod[0] ;
         A758ProCod = P0A9H9_A758ProCod[0] ;
         A4299FasConPla = P0A9H9_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H9_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H9_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H9_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H9_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H9_n4903FasAcab[0] ;
         A458FasCon = P0A9H9_A458FasCon[0] ;
         n458FasCon = P0A9H9_n458FasCon[0] ;
         A456FasActTin = P0A9H9_A456FasActTin[0] ;
         n456FasActTin = P0A9H9_n456FasActTin[0] ;
         A464FasNumPas = P0A9H9_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H9_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H9_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H9_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H9_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H9_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H9_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H9_n469FasPreSal[0] ;
         A459FasDec = P0A9H9_A459FasDec[0] ;
         n459FasDec = P0A9H9_n459FasDec[0] ;
         A602MaqCod = P0A9H9_A602MaqCod[0] ;
         n602MaqCod = P0A9H9_n602MaqCod[0] ;
         A460FasDsc = P0A9H9_A460FasDsc[0] ;
         A457FasCod = P0A9H9_A457FasCod[0] ;
         A774ProNumLin = P0A9H9_A774ProNumLin[0] ;
         A4299FasConPla = P0A9H9_A4299FasConPla[0] ;
         n4299FasConPla = P0A9H9_n4299FasConPla[0] ;
         A4286FasForMul = P0A9H9_A4286FasForMul[0] ;
         n4286FasForMul = P0A9H9_n4286FasForMul[0] ;
         A4903FasAcab = P0A9H9_A4903FasAcab[0] ;
         n4903FasAcab = P0A9H9_n4903FasAcab[0] ;
         A458FasCon = P0A9H9_A458FasCon[0] ;
         n458FasCon = P0A9H9_n458FasCon[0] ;
         A456FasActTin = P0A9H9_A456FasActTin[0] ;
         n456FasActTin = P0A9H9_n456FasActTin[0] ;
         A464FasNumPas = P0A9H9_A464FasNumPas[0] ;
         n464FasNumPas = P0A9H9_n464FasNumPas[0] ;
         A472FasVelPro = P0A9H9_A472FasVelPro[0] ;
         n472FasVelPro = P0A9H9_n472FasVelPro[0] ;
         A468FasPrePie = P0A9H9_A468FasPrePie[0] ;
         n468FasPrePie = P0A9H9_n468FasPrePie[0] ;
         A469FasPreSal = P0A9H9_A469FasPreSal[0] ;
         n469FasPreSal = P0A9H9_n469FasPreSal[0] ;
         A459FasDec = P0A9H9_A459FasDec[0] ;
         n459FasDec = P0A9H9_n459FasDec[0] ;
         A602MaqCod = P0A9H9_A602MaqCod[0] ;
         n602MaqCod = P0A9H9_n602MaqCod[0] ;
         A460FasDsc = P0A9H9_A460FasDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P0A9H9_A4299FasConPla[0], A4299FasConPla) == 0 ) )
         {
            brkA9H16 = false ;
            A396EmprCod = P0A9H9_A396EmprCod[0] ;
            A758ProCod = P0A9H9_A758ProCod[0] ;
            A457FasCod = P0A9H9_A457FasCod[0] ;
            A774ProNumLin = P0A9H9_A774ProNumLin[0] ;
            AV44count = (long)(AV44count+1) ;
            brkA9H16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A4299FasConPla)==0) )
         {
            AV39Option = A4299FasConPla ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4299FasConPla, "@!"))) ;
            AV40Options.add(AV39Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9H16 )
         {
            brkA9H16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tproces_lineas_wpgetfilterdata.this.AV53OptionsJson;
      this.aP4[0] = tproces_lineas_wpgetfilterdata.this.AV54OptionsDescJson;
      this.aP5[0] = tproces_lineas_wpgetfilterdata.this.AV55OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV53OptionsJson = "" ;
      AV54OptionsDescJson = "" ;
      AV55OptionIndexesJson = "" ;
      AV40Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV43OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFMaqCod = "" ;
      AV17TFMaqCod_Sel = "" ;
      AV18TFFasDec = DecimalUtil.ZERO ;
      AV19TFFasDec_To = DecimalUtil.ZERO ;
      AV24TFFasVelPro = DecimalUtil.ZERO ;
      AV25TFFasVelPro_To = DecimalUtil.ZERO ;
      AV28TFFasActTin = "" ;
      AV29TFFasActTin_Sel = "" ;
      AV30TFFasCon = "" ;
      AV31TFFasCon_Sel = "" ;
      AV32TFFasAcab = "" ;
      AV33TFFasAcab_Sel = "" ;
      AV34TFFasForMul = "" ;
      AV35TFFasForMul_Sel = "" ;
      AV36TFFasConPla = "" ;
      AV37TFFasConPla_Sel = "" ;
      AV56Emprcod = "" ;
      AV57Procod = "" ;
      AV58Prodsc = "" ;
      A457FasCod = "" ;
      AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = "" ;
      AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = "" ;
      AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = "" ;
      AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = "" ;
      AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = "" ;
      AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = "" ;
      AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = DecimalUtil.ZERO ;
      AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = DecimalUtil.ZERO ;
      AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = DecimalUtil.ZERO ;
      AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = DecimalUtil.ZERO ;
      AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = "" ;
      AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = "" ;
      AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = "" ;
      AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = "" ;
      AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = "" ;
      AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = "" ;
      AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = "" ;
      AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = "" ;
      AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = "" ;
      AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = "" ;
      scmdbuf = "" ;
      lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod = "" ;
      lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = "" ;
      lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = "" ;
      lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = "" ;
      lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon = "" ;
      lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = "" ;
      lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = "" ;
      lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      P0A9H2_A396EmprCod = new String[] {""} ;
      P0A9H2_A457FasCod = new String[] {""} ;
      P0A9H2_A758ProCod = new String[] {""} ;
      P0A9H2_A4299FasConPla = new String[] {""} ;
      P0A9H2_n4299FasConPla = new boolean[] {false} ;
      P0A9H2_A4286FasForMul = new String[] {""} ;
      P0A9H2_n4286FasForMul = new boolean[] {false} ;
      P0A9H2_A4903FasAcab = new String[] {""} ;
      P0A9H2_n4903FasAcab = new boolean[] {false} ;
      P0A9H2_A458FasCon = new String[] {""} ;
      P0A9H2_n458FasCon = new boolean[] {false} ;
      P0A9H2_A456FasActTin = new String[] {""} ;
      P0A9H2_n456FasActTin = new boolean[] {false} ;
      P0A9H2_A464FasNumPas = new short[1] ;
      P0A9H2_n464FasNumPas = new boolean[] {false} ;
      P0A9H2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H2_n472FasVelPro = new boolean[] {false} ;
      P0A9H2_A468FasPrePie = new short[1] ;
      P0A9H2_n468FasPrePie = new boolean[] {false} ;
      P0A9H2_A469FasPreSal = new short[1] ;
      P0A9H2_n469FasPreSal = new boolean[] {false} ;
      P0A9H2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H2_n459FasDec = new boolean[] {false} ;
      P0A9H2_A602MaqCod = new String[] {""} ;
      P0A9H2_n602MaqCod = new boolean[] {false} ;
      P0A9H2_A460FasDsc = new String[] {""} ;
      P0A9H2_A774ProNumLin = new short[1] ;
      AV39Option = "" ;
      AV41OptionDesc = "" ;
      P0A9H3_A457FasCod = new String[] {""} ;
      P0A9H3_A396EmprCod = new String[] {""} ;
      P0A9H3_A758ProCod = new String[] {""} ;
      P0A9H3_A4299FasConPla = new String[] {""} ;
      P0A9H3_n4299FasConPla = new boolean[] {false} ;
      P0A9H3_A4286FasForMul = new String[] {""} ;
      P0A9H3_n4286FasForMul = new boolean[] {false} ;
      P0A9H3_A4903FasAcab = new String[] {""} ;
      P0A9H3_n4903FasAcab = new boolean[] {false} ;
      P0A9H3_A458FasCon = new String[] {""} ;
      P0A9H3_n458FasCon = new boolean[] {false} ;
      P0A9H3_A456FasActTin = new String[] {""} ;
      P0A9H3_n456FasActTin = new boolean[] {false} ;
      P0A9H3_A464FasNumPas = new short[1] ;
      P0A9H3_n464FasNumPas = new boolean[] {false} ;
      P0A9H3_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H3_n472FasVelPro = new boolean[] {false} ;
      P0A9H3_A468FasPrePie = new short[1] ;
      P0A9H3_n468FasPrePie = new boolean[] {false} ;
      P0A9H3_A469FasPreSal = new short[1] ;
      P0A9H3_n469FasPreSal = new boolean[] {false} ;
      P0A9H3_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H3_n459FasDec = new boolean[] {false} ;
      P0A9H3_A602MaqCod = new String[] {""} ;
      P0A9H3_n602MaqCod = new boolean[] {false} ;
      P0A9H3_A460FasDsc = new String[] {""} ;
      P0A9H3_A774ProNumLin = new short[1] ;
      P0A9H4_A396EmprCod = new String[] {""} ;
      P0A9H4_A758ProCod = new String[] {""} ;
      P0A9H4_A602MaqCod = new String[] {""} ;
      P0A9H4_n602MaqCod = new boolean[] {false} ;
      P0A9H4_A4299FasConPla = new String[] {""} ;
      P0A9H4_n4299FasConPla = new boolean[] {false} ;
      P0A9H4_A4286FasForMul = new String[] {""} ;
      P0A9H4_n4286FasForMul = new boolean[] {false} ;
      P0A9H4_A4903FasAcab = new String[] {""} ;
      P0A9H4_n4903FasAcab = new boolean[] {false} ;
      P0A9H4_A458FasCon = new String[] {""} ;
      P0A9H4_n458FasCon = new boolean[] {false} ;
      P0A9H4_A456FasActTin = new String[] {""} ;
      P0A9H4_n456FasActTin = new boolean[] {false} ;
      P0A9H4_A464FasNumPas = new short[1] ;
      P0A9H4_n464FasNumPas = new boolean[] {false} ;
      P0A9H4_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H4_n472FasVelPro = new boolean[] {false} ;
      P0A9H4_A468FasPrePie = new short[1] ;
      P0A9H4_n468FasPrePie = new boolean[] {false} ;
      P0A9H4_A469FasPreSal = new short[1] ;
      P0A9H4_n469FasPreSal = new boolean[] {false} ;
      P0A9H4_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H4_n459FasDec = new boolean[] {false} ;
      P0A9H4_A460FasDsc = new String[] {""} ;
      P0A9H4_A457FasCod = new String[] {""} ;
      P0A9H4_A774ProNumLin = new short[1] ;
      P0A9H5_A396EmprCod = new String[] {""} ;
      P0A9H5_A758ProCod = new String[] {""} ;
      P0A9H5_A456FasActTin = new String[] {""} ;
      P0A9H5_n456FasActTin = new boolean[] {false} ;
      P0A9H5_A4299FasConPla = new String[] {""} ;
      P0A9H5_n4299FasConPla = new boolean[] {false} ;
      P0A9H5_A4286FasForMul = new String[] {""} ;
      P0A9H5_n4286FasForMul = new boolean[] {false} ;
      P0A9H5_A4903FasAcab = new String[] {""} ;
      P0A9H5_n4903FasAcab = new boolean[] {false} ;
      P0A9H5_A458FasCon = new String[] {""} ;
      P0A9H5_n458FasCon = new boolean[] {false} ;
      P0A9H5_A464FasNumPas = new short[1] ;
      P0A9H5_n464FasNumPas = new boolean[] {false} ;
      P0A9H5_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H5_n472FasVelPro = new boolean[] {false} ;
      P0A9H5_A468FasPrePie = new short[1] ;
      P0A9H5_n468FasPrePie = new boolean[] {false} ;
      P0A9H5_A469FasPreSal = new short[1] ;
      P0A9H5_n469FasPreSal = new boolean[] {false} ;
      P0A9H5_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H5_n459FasDec = new boolean[] {false} ;
      P0A9H5_A602MaqCod = new String[] {""} ;
      P0A9H5_n602MaqCod = new boolean[] {false} ;
      P0A9H5_A460FasDsc = new String[] {""} ;
      P0A9H5_A457FasCod = new String[] {""} ;
      P0A9H5_A774ProNumLin = new short[1] ;
      P0A9H6_A396EmprCod = new String[] {""} ;
      P0A9H6_A758ProCod = new String[] {""} ;
      P0A9H6_A458FasCon = new String[] {""} ;
      P0A9H6_n458FasCon = new boolean[] {false} ;
      P0A9H6_A4299FasConPla = new String[] {""} ;
      P0A9H6_n4299FasConPla = new boolean[] {false} ;
      P0A9H6_A4286FasForMul = new String[] {""} ;
      P0A9H6_n4286FasForMul = new boolean[] {false} ;
      P0A9H6_A4903FasAcab = new String[] {""} ;
      P0A9H6_n4903FasAcab = new boolean[] {false} ;
      P0A9H6_A456FasActTin = new String[] {""} ;
      P0A9H6_n456FasActTin = new boolean[] {false} ;
      P0A9H6_A464FasNumPas = new short[1] ;
      P0A9H6_n464FasNumPas = new boolean[] {false} ;
      P0A9H6_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H6_n472FasVelPro = new boolean[] {false} ;
      P0A9H6_A468FasPrePie = new short[1] ;
      P0A9H6_n468FasPrePie = new boolean[] {false} ;
      P0A9H6_A469FasPreSal = new short[1] ;
      P0A9H6_n469FasPreSal = new boolean[] {false} ;
      P0A9H6_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H6_n459FasDec = new boolean[] {false} ;
      P0A9H6_A602MaqCod = new String[] {""} ;
      P0A9H6_n602MaqCod = new boolean[] {false} ;
      P0A9H6_A460FasDsc = new String[] {""} ;
      P0A9H6_A457FasCod = new String[] {""} ;
      P0A9H6_A774ProNumLin = new short[1] ;
      P0A9H7_A396EmprCod = new String[] {""} ;
      P0A9H7_A758ProCod = new String[] {""} ;
      P0A9H7_A4903FasAcab = new String[] {""} ;
      P0A9H7_n4903FasAcab = new boolean[] {false} ;
      P0A9H7_A4299FasConPla = new String[] {""} ;
      P0A9H7_n4299FasConPla = new boolean[] {false} ;
      P0A9H7_A4286FasForMul = new String[] {""} ;
      P0A9H7_n4286FasForMul = new boolean[] {false} ;
      P0A9H7_A458FasCon = new String[] {""} ;
      P0A9H7_n458FasCon = new boolean[] {false} ;
      P0A9H7_A456FasActTin = new String[] {""} ;
      P0A9H7_n456FasActTin = new boolean[] {false} ;
      P0A9H7_A464FasNumPas = new short[1] ;
      P0A9H7_n464FasNumPas = new boolean[] {false} ;
      P0A9H7_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H7_n472FasVelPro = new boolean[] {false} ;
      P0A9H7_A468FasPrePie = new short[1] ;
      P0A9H7_n468FasPrePie = new boolean[] {false} ;
      P0A9H7_A469FasPreSal = new short[1] ;
      P0A9H7_n469FasPreSal = new boolean[] {false} ;
      P0A9H7_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H7_n459FasDec = new boolean[] {false} ;
      P0A9H7_A602MaqCod = new String[] {""} ;
      P0A9H7_n602MaqCod = new boolean[] {false} ;
      P0A9H7_A460FasDsc = new String[] {""} ;
      P0A9H7_A457FasCod = new String[] {""} ;
      P0A9H7_A774ProNumLin = new short[1] ;
      P0A9H8_A396EmprCod = new String[] {""} ;
      P0A9H8_A758ProCod = new String[] {""} ;
      P0A9H8_A4286FasForMul = new String[] {""} ;
      P0A9H8_n4286FasForMul = new boolean[] {false} ;
      P0A9H8_A4299FasConPla = new String[] {""} ;
      P0A9H8_n4299FasConPla = new boolean[] {false} ;
      P0A9H8_A4903FasAcab = new String[] {""} ;
      P0A9H8_n4903FasAcab = new boolean[] {false} ;
      P0A9H8_A458FasCon = new String[] {""} ;
      P0A9H8_n458FasCon = new boolean[] {false} ;
      P0A9H8_A456FasActTin = new String[] {""} ;
      P0A9H8_n456FasActTin = new boolean[] {false} ;
      P0A9H8_A464FasNumPas = new short[1] ;
      P0A9H8_n464FasNumPas = new boolean[] {false} ;
      P0A9H8_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H8_n472FasVelPro = new boolean[] {false} ;
      P0A9H8_A468FasPrePie = new short[1] ;
      P0A9H8_n468FasPrePie = new boolean[] {false} ;
      P0A9H8_A469FasPreSal = new short[1] ;
      P0A9H8_n469FasPreSal = new boolean[] {false} ;
      P0A9H8_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H8_n459FasDec = new boolean[] {false} ;
      P0A9H8_A602MaqCod = new String[] {""} ;
      P0A9H8_n602MaqCod = new boolean[] {false} ;
      P0A9H8_A460FasDsc = new String[] {""} ;
      P0A9H8_A457FasCod = new String[] {""} ;
      P0A9H8_A774ProNumLin = new short[1] ;
      P0A9H9_A396EmprCod = new String[] {""} ;
      P0A9H9_A758ProCod = new String[] {""} ;
      P0A9H9_A4299FasConPla = new String[] {""} ;
      P0A9H9_n4299FasConPla = new boolean[] {false} ;
      P0A9H9_A4286FasForMul = new String[] {""} ;
      P0A9H9_n4286FasForMul = new boolean[] {false} ;
      P0A9H9_A4903FasAcab = new String[] {""} ;
      P0A9H9_n4903FasAcab = new boolean[] {false} ;
      P0A9H9_A458FasCon = new String[] {""} ;
      P0A9H9_n458FasCon = new boolean[] {false} ;
      P0A9H9_A456FasActTin = new String[] {""} ;
      P0A9H9_n456FasActTin = new boolean[] {false} ;
      P0A9H9_A464FasNumPas = new short[1] ;
      P0A9H9_n464FasNumPas = new boolean[] {false} ;
      P0A9H9_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H9_n472FasVelPro = new boolean[] {false} ;
      P0A9H9_A468FasPrePie = new short[1] ;
      P0A9H9_n468FasPrePie = new boolean[] {false} ;
      P0A9H9_A469FasPreSal = new short[1] ;
      P0A9H9_n469FasPreSal = new boolean[] {false} ;
      P0A9H9_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9H9_n459FasDec = new boolean[] {false} ;
      P0A9H9_A602MaqCod = new String[] {""} ;
      P0A9H9_n602MaqCod = new boolean[] {false} ;
      P0A9H9_A460FasDsc = new String[] {""} ;
      P0A9H9_A457FasCod = new String[] {""} ;
      P0A9H9_A774ProNumLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A9H2_A396EmprCod, P0A9H2_A457FasCod, P0A9H2_A758ProCod, P0A9H2_A4299FasConPla, P0A9H2_n4299FasConPla, P0A9H2_A4286FasForMul, P0A9H2_n4286FasForMul, P0A9H2_A4903FasAcab, P0A9H2_n4903FasAcab, P0A9H2_A458FasCon,
            P0A9H2_n458FasCon, P0A9H2_A456FasActTin, P0A9H2_n456FasActTin, P0A9H2_A464FasNumPas, P0A9H2_n464FasNumPas, P0A9H2_A472FasVelPro, P0A9H2_n472FasVelPro, P0A9H2_A468FasPrePie, P0A9H2_n468FasPrePie, P0A9H2_A469FasPreSal,
            P0A9H2_n469FasPreSal, P0A9H2_A459FasDec, P0A9H2_n459FasDec, P0A9H2_A602MaqCod, P0A9H2_n602MaqCod, P0A9H2_A460FasDsc, P0A9H2_A774ProNumLin
            }
            , new Object[] {
            P0A9H3_A457FasCod, P0A9H3_A396EmprCod, P0A9H3_A758ProCod, P0A9H3_A4299FasConPla, P0A9H3_n4299FasConPla, P0A9H3_A4286FasForMul, P0A9H3_n4286FasForMul, P0A9H3_A4903FasAcab, P0A9H3_n4903FasAcab, P0A9H3_A458FasCon,
            P0A9H3_n458FasCon, P0A9H3_A456FasActTin, P0A9H3_n456FasActTin, P0A9H3_A464FasNumPas, P0A9H3_n464FasNumPas, P0A9H3_A472FasVelPro, P0A9H3_n472FasVelPro, P0A9H3_A468FasPrePie, P0A9H3_n468FasPrePie, P0A9H3_A469FasPreSal,
            P0A9H3_n469FasPreSal, P0A9H3_A459FasDec, P0A9H3_n459FasDec, P0A9H3_A602MaqCod, P0A9H3_n602MaqCod, P0A9H3_A460FasDsc, P0A9H3_A774ProNumLin
            }
            , new Object[] {
            P0A9H4_A396EmprCod, P0A9H4_A758ProCod, P0A9H4_A602MaqCod, P0A9H4_n602MaqCod, P0A9H4_A4299FasConPla, P0A9H4_n4299FasConPla, P0A9H4_A4286FasForMul, P0A9H4_n4286FasForMul, P0A9H4_A4903FasAcab, P0A9H4_n4903FasAcab,
            P0A9H4_A458FasCon, P0A9H4_n458FasCon, P0A9H4_A456FasActTin, P0A9H4_n456FasActTin, P0A9H4_A464FasNumPas, P0A9H4_n464FasNumPas, P0A9H4_A472FasVelPro, P0A9H4_n472FasVelPro, P0A9H4_A468FasPrePie, P0A9H4_n468FasPrePie,
            P0A9H4_A469FasPreSal, P0A9H4_n469FasPreSal, P0A9H4_A459FasDec, P0A9H4_n459FasDec, P0A9H4_A460FasDsc, P0A9H4_A457FasCod, P0A9H4_A774ProNumLin
            }
            , new Object[] {
            P0A9H5_A396EmprCod, P0A9H5_A758ProCod, P0A9H5_A456FasActTin, P0A9H5_n456FasActTin, P0A9H5_A4299FasConPla, P0A9H5_n4299FasConPla, P0A9H5_A4286FasForMul, P0A9H5_n4286FasForMul, P0A9H5_A4903FasAcab, P0A9H5_n4903FasAcab,
            P0A9H5_A458FasCon, P0A9H5_n458FasCon, P0A9H5_A464FasNumPas, P0A9H5_n464FasNumPas, P0A9H5_A472FasVelPro, P0A9H5_n472FasVelPro, P0A9H5_A468FasPrePie, P0A9H5_n468FasPrePie, P0A9H5_A469FasPreSal, P0A9H5_n469FasPreSal,
            P0A9H5_A459FasDec, P0A9H5_n459FasDec, P0A9H5_A602MaqCod, P0A9H5_n602MaqCod, P0A9H5_A460FasDsc, P0A9H5_A457FasCod, P0A9H5_A774ProNumLin
            }
            , new Object[] {
            P0A9H6_A396EmprCod, P0A9H6_A758ProCod, P0A9H6_A458FasCon, P0A9H6_n458FasCon, P0A9H6_A4299FasConPla, P0A9H6_n4299FasConPla, P0A9H6_A4286FasForMul, P0A9H6_n4286FasForMul, P0A9H6_A4903FasAcab, P0A9H6_n4903FasAcab,
            P0A9H6_A456FasActTin, P0A9H6_n456FasActTin, P0A9H6_A464FasNumPas, P0A9H6_n464FasNumPas, P0A9H6_A472FasVelPro, P0A9H6_n472FasVelPro, P0A9H6_A468FasPrePie, P0A9H6_n468FasPrePie, P0A9H6_A469FasPreSal, P0A9H6_n469FasPreSal,
            P0A9H6_A459FasDec, P0A9H6_n459FasDec, P0A9H6_A602MaqCod, P0A9H6_n602MaqCod, P0A9H6_A460FasDsc, P0A9H6_A457FasCod, P0A9H6_A774ProNumLin
            }
            , new Object[] {
            P0A9H7_A396EmprCod, P0A9H7_A758ProCod, P0A9H7_A4903FasAcab, P0A9H7_n4903FasAcab, P0A9H7_A4299FasConPla, P0A9H7_n4299FasConPla, P0A9H7_A4286FasForMul, P0A9H7_n4286FasForMul, P0A9H7_A458FasCon, P0A9H7_n458FasCon,
            P0A9H7_A456FasActTin, P0A9H7_n456FasActTin, P0A9H7_A464FasNumPas, P0A9H7_n464FasNumPas, P0A9H7_A472FasVelPro, P0A9H7_n472FasVelPro, P0A9H7_A468FasPrePie, P0A9H7_n468FasPrePie, P0A9H7_A469FasPreSal, P0A9H7_n469FasPreSal,
            P0A9H7_A459FasDec, P0A9H7_n459FasDec, P0A9H7_A602MaqCod, P0A9H7_n602MaqCod, P0A9H7_A460FasDsc, P0A9H7_A457FasCod, P0A9H7_A774ProNumLin
            }
            , new Object[] {
            P0A9H8_A396EmprCod, P0A9H8_A758ProCod, P0A9H8_A4286FasForMul, P0A9H8_n4286FasForMul, P0A9H8_A4299FasConPla, P0A9H8_n4299FasConPla, P0A9H8_A4903FasAcab, P0A9H8_n4903FasAcab, P0A9H8_A458FasCon, P0A9H8_n458FasCon,
            P0A9H8_A456FasActTin, P0A9H8_n456FasActTin, P0A9H8_A464FasNumPas, P0A9H8_n464FasNumPas, P0A9H8_A472FasVelPro, P0A9H8_n472FasVelPro, P0A9H8_A468FasPrePie, P0A9H8_n468FasPrePie, P0A9H8_A469FasPreSal, P0A9H8_n469FasPreSal,
            P0A9H8_A459FasDec, P0A9H8_n459FasDec, P0A9H8_A602MaqCod, P0A9H8_n602MaqCod, P0A9H8_A460FasDsc, P0A9H8_A457FasCod, P0A9H8_A774ProNumLin
            }
            , new Object[] {
            P0A9H9_A396EmprCod, P0A9H9_A758ProCod, P0A9H9_A4299FasConPla, P0A9H9_n4299FasConPla, P0A9H9_A4286FasForMul, P0A9H9_n4286FasForMul, P0A9H9_A4903FasAcab, P0A9H9_n4903FasAcab, P0A9H9_A458FasCon, P0A9H9_n458FasCon,
            P0A9H9_A456FasActTin, P0A9H9_n456FasActTin, P0A9H9_A464FasNumPas, P0A9H9_n464FasNumPas, P0A9H9_A472FasVelPro, P0A9H9_n472FasVelPro, P0A9H9_A468FasPrePie, P0A9H9_n468FasPrePie, P0A9H9_A469FasPreSal, P0A9H9_n469FasPreSal,
            P0A9H9_A459FasDec, P0A9H9_n459FasDec, P0A9H9_A602MaqCod, P0A9H9_n602MaqCod, P0A9H9_A460FasDsc, P0A9H9_A457FasCod, P0A9H9_A774ProNumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFProNumLin ;
   private short AV11TFProNumLin_To ;
   private short AV20TFFasPreSal ;
   private short AV21TFFasPreSal_To ;
   private short AV22TFFasPrePie ;
   private short AV23TFFasPrePie_To ;
   private short AV26TFFasNumPas ;
   private short AV27TFFasNumPas_To ;
   private short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ;
   private short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ;
   private short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ;
   private short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ;
   private short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ;
   private short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ;
   private short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ;
   private short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ;
   private short A774ProNumLin ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV38InsertIndex ;
   private long AV44count ;
   private java.math.BigDecimal AV18TFFasDec ;
   private java.math.BigDecimal AV19TFFasDec_To ;
   private java.math.BigDecimal AV24TFFasVelPro ;
   private java.math.BigDecimal AV25TFFasVelPro_To ;
   private java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ;
   private java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ;
   private java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ;
   private java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV16TFMaqCod ;
   private String AV17TFMaqCod_Sel ;
   private String AV28TFFasActTin ;
   private String AV29TFFasActTin_Sel ;
   private String AV30TFFasCon ;
   private String AV31TFFasCon_Sel ;
   private String AV32TFFasAcab ;
   private String AV33TFFasAcab_Sel ;
   private String AV34TFFasForMul ;
   private String AV35TFFasForMul_Sel ;
   private String AV36TFFasConPla ;
   private String AV37TFFasConPla_Sel ;
   private String AV56Emprcod ;
   private String AV57Procod ;
   private String AV58Prodsc ;
   private String A457FasCod ;
   private String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ;
   private String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ;
   private String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ;
   private String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ;
   private String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ;
   private String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ;
   private String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ;
   private String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ;
   private String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ;
   private String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ;
   private String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ;
   private String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ;
   private String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ;
   private String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ;
   private String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ;
   private String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ;
   private String scmdbuf ;
   private String lV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ;
   private String lV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ;
   private String lV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ;
   private String lV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ;
   private String lV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ;
   private String lV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ;
   private String lV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ;
   private String lV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ;
   private String A460FasDsc ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA9H2 ;
   private boolean n4299FasConPla ;
   private boolean n4286FasForMul ;
   private boolean n4903FasAcab ;
   private boolean n458FasCon ;
   private boolean n456FasActTin ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n459FasDec ;
   private boolean n602MaqCod ;
   private boolean brkA9H4 ;
   private boolean brkA9H6 ;
   private boolean brkA9H8 ;
   private boolean brkA9H10 ;
   private boolean brkA9H12 ;
   private boolean brkA9H14 ;
   private boolean brkA9H16 ;
   private String AV53OptionsJson ;
   private String AV54OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV50DDOName ;
   private String AV51SearchTxt ;
   private String AV52SearchTxtTo ;
   private String AV39Option ;
   private String AV41OptionDesc ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9H2_A396EmprCod ;
   private String[] P0A9H2_A457FasCod ;
   private String[] P0A9H2_A758ProCod ;
   private String[] P0A9H2_A4299FasConPla ;
   private boolean[] P0A9H2_n4299FasConPla ;
   private String[] P0A9H2_A4286FasForMul ;
   private boolean[] P0A9H2_n4286FasForMul ;
   private String[] P0A9H2_A4903FasAcab ;
   private boolean[] P0A9H2_n4903FasAcab ;
   private String[] P0A9H2_A458FasCon ;
   private boolean[] P0A9H2_n458FasCon ;
   private String[] P0A9H2_A456FasActTin ;
   private boolean[] P0A9H2_n456FasActTin ;
   private short[] P0A9H2_A464FasNumPas ;
   private boolean[] P0A9H2_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H2_A472FasVelPro ;
   private boolean[] P0A9H2_n472FasVelPro ;
   private short[] P0A9H2_A468FasPrePie ;
   private boolean[] P0A9H2_n468FasPrePie ;
   private short[] P0A9H2_A469FasPreSal ;
   private boolean[] P0A9H2_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H2_A459FasDec ;
   private boolean[] P0A9H2_n459FasDec ;
   private String[] P0A9H2_A602MaqCod ;
   private boolean[] P0A9H2_n602MaqCod ;
   private String[] P0A9H2_A460FasDsc ;
   private short[] P0A9H2_A774ProNumLin ;
   private String[] P0A9H3_A457FasCod ;
   private String[] P0A9H3_A396EmprCod ;
   private String[] P0A9H3_A758ProCod ;
   private String[] P0A9H3_A4299FasConPla ;
   private boolean[] P0A9H3_n4299FasConPla ;
   private String[] P0A9H3_A4286FasForMul ;
   private boolean[] P0A9H3_n4286FasForMul ;
   private String[] P0A9H3_A4903FasAcab ;
   private boolean[] P0A9H3_n4903FasAcab ;
   private String[] P0A9H3_A458FasCon ;
   private boolean[] P0A9H3_n458FasCon ;
   private String[] P0A9H3_A456FasActTin ;
   private boolean[] P0A9H3_n456FasActTin ;
   private short[] P0A9H3_A464FasNumPas ;
   private boolean[] P0A9H3_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H3_A472FasVelPro ;
   private boolean[] P0A9H3_n472FasVelPro ;
   private short[] P0A9H3_A468FasPrePie ;
   private boolean[] P0A9H3_n468FasPrePie ;
   private short[] P0A9H3_A469FasPreSal ;
   private boolean[] P0A9H3_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H3_A459FasDec ;
   private boolean[] P0A9H3_n459FasDec ;
   private String[] P0A9H3_A602MaqCod ;
   private boolean[] P0A9H3_n602MaqCod ;
   private String[] P0A9H3_A460FasDsc ;
   private short[] P0A9H3_A774ProNumLin ;
   private String[] P0A9H4_A396EmprCod ;
   private String[] P0A9H4_A758ProCod ;
   private String[] P0A9H4_A602MaqCod ;
   private boolean[] P0A9H4_n602MaqCod ;
   private String[] P0A9H4_A4299FasConPla ;
   private boolean[] P0A9H4_n4299FasConPla ;
   private String[] P0A9H4_A4286FasForMul ;
   private boolean[] P0A9H4_n4286FasForMul ;
   private String[] P0A9H4_A4903FasAcab ;
   private boolean[] P0A9H4_n4903FasAcab ;
   private String[] P0A9H4_A458FasCon ;
   private boolean[] P0A9H4_n458FasCon ;
   private String[] P0A9H4_A456FasActTin ;
   private boolean[] P0A9H4_n456FasActTin ;
   private short[] P0A9H4_A464FasNumPas ;
   private boolean[] P0A9H4_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H4_A472FasVelPro ;
   private boolean[] P0A9H4_n472FasVelPro ;
   private short[] P0A9H4_A468FasPrePie ;
   private boolean[] P0A9H4_n468FasPrePie ;
   private short[] P0A9H4_A469FasPreSal ;
   private boolean[] P0A9H4_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H4_A459FasDec ;
   private boolean[] P0A9H4_n459FasDec ;
   private String[] P0A9H4_A460FasDsc ;
   private String[] P0A9H4_A457FasCod ;
   private short[] P0A9H4_A774ProNumLin ;
   private String[] P0A9H5_A396EmprCod ;
   private String[] P0A9H5_A758ProCod ;
   private String[] P0A9H5_A456FasActTin ;
   private boolean[] P0A9H5_n456FasActTin ;
   private String[] P0A9H5_A4299FasConPla ;
   private boolean[] P0A9H5_n4299FasConPla ;
   private String[] P0A9H5_A4286FasForMul ;
   private boolean[] P0A9H5_n4286FasForMul ;
   private String[] P0A9H5_A4903FasAcab ;
   private boolean[] P0A9H5_n4903FasAcab ;
   private String[] P0A9H5_A458FasCon ;
   private boolean[] P0A9H5_n458FasCon ;
   private short[] P0A9H5_A464FasNumPas ;
   private boolean[] P0A9H5_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H5_A472FasVelPro ;
   private boolean[] P0A9H5_n472FasVelPro ;
   private short[] P0A9H5_A468FasPrePie ;
   private boolean[] P0A9H5_n468FasPrePie ;
   private short[] P0A9H5_A469FasPreSal ;
   private boolean[] P0A9H5_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H5_A459FasDec ;
   private boolean[] P0A9H5_n459FasDec ;
   private String[] P0A9H5_A602MaqCod ;
   private boolean[] P0A9H5_n602MaqCod ;
   private String[] P0A9H5_A460FasDsc ;
   private String[] P0A9H5_A457FasCod ;
   private short[] P0A9H5_A774ProNumLin ;
   private String[] P0A9H6_A396EmprCod ;
   private String[] P0A9H6_A758ProCod ;
   private String[] P0A9H6_A458FasCon ;
   private boolean[] P0A9H6_n458FasCon ;
   private String[] P0A9H6_A4299FasConPla ;
   private boolean[] P0A9H6_n4299FasConPla ;
   private String[] P0A9H6_A4286FasForMul ;
   private boolean[] P0A9H6_n4286FasForMul ;
   private String[] P0A9H6_A4903FasAcab ;
   private boolean[] P0A9H6_n4903FasAcab ;
   private String[] P0A9H6_A456FasActTin ;
   private boolean[] P0A9H6_n456FasActTin ;
   private short[] P0A9H6_A464FasNumPas ;
   private boolean[] P0A9H6_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H6_A472FasVelPro ;
   private boolean[] P0A9H6_n472FasVelPro ;
   private short[] P0A9H6_A468FasPrePie ;
   private boolean[] P0A9H6_n468FasPrePie ;
   private short[] P0A9H6_A469FasPreSal ;
   private boolean[] P0A9H6_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H6_A459FasDec ;
   private boolean[] P0A9H6_n459FasDec ;
   private String[] P0A9H6_A602MaqCod ;
   private boolean[] P0A9H6_n602MaqCod ;
   private String[] P0A9H6_A460FasDsc ;
   private String[] P0A9H6_A457FasCod ;
   private short[] P0A9H6_A774ProNumLin ;
   private String[] P0A9H7_A396EmprCod ;
   private String[] P0A9H7_A758ProCod ;
   private String[] P0A9H7_A4903FasAcab ;
   private boolean[] P0A9H7_n4903FasAcab ;
   private String[] P0A9H7_A4299FasConPla ;
   private boolean[] P0A9H7_n4299FasConPla ;
   private String[] P0A9H7_A4286FasForMul ;
   private boolean[] P0A9H7_n4286FasForMul ;
   private String[] P0A9H7_A458FasCon ;
   private boolean[] P0A9H7_n458FasCon ;
   private String[] P0A9H7_A456FasActTin ;
   private boolean[] P0A9H7_n456FasActTin ;
   private short[] P0A9H7_A464FasNumPas ;
   private boolean[] P0A9H7_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H7_A472FasVelPro ;
   private boolean[] P0A9H7_n472FasVelPro ;
   private short[] P0A9H7_A468FasPrePie ;
   private boolean[] P0A9H7_n468FasPrePie ;
   private short[] P0A9H7_A469FasPreSal ;
   private boolean[] P0A9H7_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H7_A459FasDec ;
   private boolean[] P0A9H7_n459FasDec ;
   private String[] P0A9H7_A602MaqCod ;
   private boolean[] P0A9H7_n602MaqCod ;
   private String[] P0A9H7_A460FasDsc ;
   private String[] P0A9H7_A457FasCod ;
   private short[] P0A9H7_A774ProNumLin ;
   private String[] P0A9H8_A396EmprCod ;
   private String[] P0A9H8_A758ProCod ;
   private String[] P0A9H8_A4286FasForMul ;
   private boolean[] P0A9H8_n4286FasForMul ;
   private String[] P0A9H8_A4299FasConPla ;
   private boolean[] P0A9H8_n4299FasConPla ;
   private String[] P0A9H8_A4903FasAcab ;
   private boolean[] P0A9H8_n4903FasAcab ;
   private String[] P0A9H8_A458FasCon ;
   private boolean[] P0A9H8_n458FasCon ;
   private String[] P0A9H8_A456FasActTin ;
   private boolean[] P0A9H8_n456FasActTin ;
   private short[] P0A9H8_A464FasNumPas ;
   private boolean[] P0A9H8_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H8_A472FasVelPro ;
   private boolean[] P0A9H8_n472FasVelPro ;
   private short[] P0A9H8_A468FasPrePie ;
   private boolean[] P0A9H8_n468FasPrePie ;
   private short[] P0A9H8_A469FasPreSal ;
   private boolean[] P0A9H8_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H8_A459FasDec ;
   private boolean[] P0A9H8_n459FasDec ;
   private String[] P0A9H8_A602MaqCod ;
   private boolean[] P0A9H8_n602MaqCod ;
   private String[] P0A9H8_A460FasDsc ;
   private String[] P0A9H8_A457FasCod ;
   private short[] P0A9H8_A774ProNumLin ;
   private String[] P0A9H9_A396EmprCod ;
   private String[] P0A9H9_A758ProCod ;
   private String[] P0A9H9_A4299FasConPla ;
   private boolean[] P0A9H9_n4299FasConPla ;
   private String[] P0A9H9_A4286FasForMul ;
   private boolean[] P0A9H9_n4286FasForMul ;
   private String[] P0A9H9_A4903FasAcab ;
   private boolean[] P0A9H9_n4903FasAcab ;
   private String[] P0A9H9_A458FasCon ;
   private boolean[] P0A9H9_n458FasCon ;
   private String[] P0A9H9_A456FasActTin ;
   private boolean[] P0A9H9_n456FasActTin ;
   private short[] P0A9H9_A464FasNumPas ;
   private boolean[] P0A9H9_n464FasNumPas ;
   private java.math.BigDecimal[] P0A9H9_A472FasVelPro ;
   private boolean[] P0A9H9_n472FasVelPro ;
   private short[] P0A9H9_A468FasPrePie ;
   private boolean[] P0A9H9_n468FasPrePie ;
   private short[] P0A9H9_A469FasPreSal ;
   private boolean[] P0A9H9_n469FasPreSal ;
   private java.math.BigDecimal[] P0A9H9_A459FasDec ;
   private boolean[] P0A9H9_n459FasDec ;
   private String[] P0A9H9_A602MaqCod ;
   private boolean[] P0A9H9_n602MaqCod ;
   private String[] P0A9H9_A460FasDsc ;
   private String[] P0A9H9_A457FasCod ;
   private short[] P0A9H9_A774ProNumLin ;
   private GXSimpleCollection<String> AV40Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV43OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class tproces_lineas_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A758ProCod ,
                                          String AV57Procod ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.ProCod, T2.FasConPla, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal," ;
      scmdbuf += " T2.FasDec, T2.MaqCod, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A9H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A758ProCod ,
                                          String AV57Procod ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[30];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T1.EmprCod, T1.ProCod, T2.FasConPla, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal," ;
      scmdbuf += " T2.FasDec, T2.MaqCod, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A9H4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String A758ProCod ,
                                          String AV57Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.MaqCod, T2.FasConPla, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal," ;
      scmdbuf += " T2.FasDec, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.MaqCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A9H5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String A758ProCod ,
                                          String AV57Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.FasActTin, T2.FasConPla, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasActTin" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A9H6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String A758ProCod ,
                                          String AV57Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[30];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.FasCon, T2.FasConPla, T2.FasForMul, T2.FasAcab, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasCon" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0A9H7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String A758ProCod ,
                                          String AV57Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[30];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.FasAcab, T2.FasConPla, T2.FasForMul, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasAcab" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0A9H8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String A758ProCod ,
                                          String AV57Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[30];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.FasForMul, T2.FasConPla, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasForMul" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0A9H9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String A758ProCod ,
                                          String AV57Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[30];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.FasConPla, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV63Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV89Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasConPla" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P0A9H2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 1 :
                  return conditional_P0A9H3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 2 :
                  return conditional_P0A9H4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 3 :
                  return conditional_P0A9H5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 4 :
                  return conditional_P0A9H6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 5 :
                  return conditional_P0A9H7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 6 :
                  return conditional_P0A9H8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 7 :
                  return conditional_P0A9H9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9H4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9H5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9H6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9H7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9H8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9H9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 28);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 28);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 28);
               ((String[]) buf[25])[0] = rslt.getString(15, 8);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 28);
               ((String[]) buf[25])[0] = rslt.getString(15, 8);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 28);
               ((String[]) buf[25])[0] = rslt.getString(15, 8);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 28);
               ((String[]) buf[25])[0] = rslt.getString(15, 8);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 28);
               ((String[]) buf[25])[0] = rslt.getString(15, 8);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 28);
               ((String[]) buf[25])[0] = rslt.getString(15, 8);
               ((short[]) buf[26])[0] = rslt.getShort(16);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
      }
   }

}

