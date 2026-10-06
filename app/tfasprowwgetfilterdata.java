package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfasprowwgetfilterdata extends GXProcedure
{
   public tfasprowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasprowwgetfilterdata.class ), "" );
   }

   public tfasprowwgetfilterdata( int remoteHandle ,
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
      tfasprowwgetfilterdata.this.aP5 = new String[] {""};
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
      tfasprowwgetfilterdata.this.AV50DDOName = aP0;
      tfasprowwgetfilterdata.this.AV48SearchTxt = aP1;
      tfasprowwgetfilterdata.this.AV49SearchTxtTo = aP2;
      tfasprowwgetfilterdata.this.aP3 = aP3;
      tfasprowwgetfilterdata.this.aP4 = aP4;
      tfasprowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV53Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV56OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASSIGLA") == 0 )
      {
         /* Execute user subroutine: 'LOADFASSIGLAOPTIONS' */
         S141 ();
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
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S161 ();
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
         S171 ();
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
         S181 ();
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
         S191 ();
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
         S201 ();
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
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV54OptionsJson = AV53Options.toJSonString(false) ;
      AV57OptionsDescJson = AV56OptionsDesc.toJSonString(false) ;
      AV59OptionIndexesJson = AV58OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV61Session.getValue("TFASPROWWGridState"), "") == 0 )
      {
         AV63GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFASPROWWGridState"), null, null);
      }
      else
      {
         AV63GridState.fromxml(AV61Session.getValue("TFASPROWWGridState"), null, null);
      }
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV64GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV83FilterFullText = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTIVA_SEL") == 0 )
         {
            AV87TFFasActiva_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV10TFFasCod = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV11TFFasCod_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV12TFFasDsc = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV13TFFasDsc_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA") == 0 )
         {
            AV14TFFasSigla = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA_SEL") == 0 )
         {
            AV15TFFasSigla_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV16TFMaqCod = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV17TFMaqCod_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV18TFMaqDsc = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV19TFMaqDsc_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV20TFFasDec = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFFasDec_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC2") == 0 )
         {
            AV22TFFasDec2 = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFFasDec2_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV24TFFasPreSal = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFFasPreSal_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV26TFFasPrePie = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFFasPrePie_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV28TFFasVelPro = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFFasVelPro_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV30TFFasNumPas = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFFasNumPas_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV32TFFasActTin = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV33TFFasActTin_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV34TFFasCon = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV35TFFasCon_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV36TFFasAcab = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV37TFFasAcab_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV38TFFasForMul = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV39TFFasForMul_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA") == 0 )
         {
            AV40TFFasConPla = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA_SEL") == 0 )
         {
            AV41TFFasConPla_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFFasCod = AV48SearchTxt ;
      AV11TFFasCod_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V2 */
      pr_default.execute(0, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk81V2 = false ;
         A396EmprCod = P081V2_A396EmprCod[0] ;
         A457FasCod = P081V2_A457FasCod[0] ;
         A4299FasConPla = P081V2_A4299FasConPla[0] ;
         n4299FasConPla = P081V2_n4299FasConPla[0] ;
         A4286FasForMul = P081V2_A4286FasForMul[0] ;
         n4286FasForMul = P081V2_n4286FasForMul[0] ;
         A4903FasAcab = P081V2_A4903FasAcab[0] ;
         n4903FasAcab = P081V2_n4903FasAcab[0] ;
         A458FasCon = P081V2_A458FasCon[0] ;
         n458FasCon = P081V2_n458FasCon[0] ;
         A456FasActTin = P081V2_A456FasActTin[0] ;
         n456FasActTin = P081V2_n456FasActTin[0] ;
         A464FasNumPas = P081V2_A464FasNumPas[0] ;
         n464FasNumPas = P081V2_n464FasNumPas[0] ;
         A472FasVelPro = P081V2_A472FasVelPro[0] ;
         n472FasVelPro = P081V2_n472FasVelPro[0] ;
         A468FasPrePie = P081V2_A468FasPrePie[0] ;
         n468FasPrePie = P081V2_n468FasPrePie[0] ;
         A469FasPreSal = P081V2_A469FasPreSal[0] ;
         n469FasPreSal = P081V2_n469FasPreSal[0] ;
         A5990FasDec2 = P081V2_A5990FasDec2[0] ;
         n5990FasDec2 = P081V2_n5990FasDec2[0] ;
         A459FasDec = P081V2_A459FasDec[0] ;
         n459FasDec = P081V2_n459FasDec[0] ;
         A606MaqDsc = P081V2_A606MaqDsc[0] ;
         n606MaqDsc = P081V2_n606MaqDsc[0] ;
         A602MaqCod = P081V2_A602MaqCod[0] ;
         n602MaqCod = P081V2_n602MaqCod[0] ;
         A7070FasSigla = P081V2_A7070FasSigla[0] ;
         n7070FasSigla = P081V2_n7070FasSigla[0] ;
         A460FasDsc = P081V2_A460FasDsc[0] ;
         A14042FasActiva = P081V2_A14042FasActiva[0] ;
         A606MaqDsc = P081V2_A606MaqDsc[0] ;
         n606MaqDsc = P081V2_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P081V2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk81V2 = false ;
            A396EmprCod = P081V2_A396EmprCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV52Option = A457FasCod ;
            AV55OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV53Options.add(AV52Option, 0);
            AV56OptionsDesc.add(AV55OptionDesc, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V2 )
         {
            brk81V2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasDsc = AV48SearchTxt ;
      AV13TFFasDsc_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V3 */
      pr_default.execute(1, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk81V4 = false ;
         A396EmprCod = P081V3_A396EmprCod[0] ;
         A460FasDsc = P081V3_A460FasDsc[0] ;
         A4299FasConPla = P081V3_A4299FasConPla[0] ;
         n4299FasConPla = P081V3_n4299FasConPla[0] ;
         A4286FasForMul = P081V3_A4286FasForMul[0] ;
         n4286FasForMul = P081V3_n4286FasForMul[0] ;
         A4903FasAcab = P081V3_A4903FasAcab[0] ;
         n4903FasAcab = P081V3_n4903FasAcab[0] ;
         A458FasCon = P081V3_A458FasCon[0] ;
         n458FasCon = P081V3_n458FasCon[0] ;
         A456FasActTin = P081V3_A456FasActTin[0] ;
         n456FasActTin = P081V3_n456FasActTin[0] ;
         A464FasNumPas = P081V3_A464FasNumPas[0] ;
         n464FasNumPas = P081V3_n464FasNumPas[0] ;
         A472FasVelPro = P081V3_A472FasVelPro[0] ;
         n472FasVelPro = P081V3_n472FasVelPro[0] ;
         A468FasPrePie = P081V3_A468FasPrePie[0] ;
         n468FasPrePie = P081V3_n468FasPrePie[0] ;
         A469FasPreSal = P081V3_A469FasPreSal[0] ;
         n469FasPreSal = P081V3_n469FasPreSal[0] ;
         A5990FasDec2 = P081V3_A5990FasDec2[0] ;
         n5990FasDec2 = P081V3_n5990FasDec2[0] ;
         A459FasDec = P081V3_A459FasDec[0] ;
         n459FasDec = P081V3_n459FasDec[0] ;
         A606MaqDsc = P081V3_A606MaqDsc[0] ;
         n606MaqDsc = P081V3_n606MaqDsc[0] ;
         A602MaqCod = P081V3_A602MaqCod[0] ;
         n602MaqCod = P081V3_n602MaqCod[0] ;
         A7070FasSigla = P081V3_A7070FasSigla[0] ;
         n7070FasSigla = P081V3_n7070FasSigla[0] ;
         A457FasCod = P081V3_A457FasCod[0] ;
         A14042FasActiva = P081V3_A14042FasActiva[0] ;
         A606MaqDsc = P081V3_A606MaqDsc[0] ;
         n606MaqDsc = P081V3_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P081V3_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brk81V4 = false ;
            A396EmprCod = P081V3_A396EmprCod[0] ;
            A457FasCod = P081V3_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV52Option = A460FasDsc ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V4 )
         {
            brk81V4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASSIGLAOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasSigla = AV48SearchTxt ;
      AV15TFFasSigla_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V4 */
      pr_default.execute(2, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk81V6 = false ;
         A396EmprCod = P081V4_A396EmprCod[0] ;
         A7070FasSigla = P081V4_A7070FasSigla[0] ;
         n7070FasSigla = P081V4_n7070FasSigla[0] ;
         A4299FasConPla = P081V4_A4299FasConPla[0] ;
         n4299FasConPla = P081V4_n4299FasConPla[0] ;
         A4286FasForMul = P081V4_A4286FasForMul[0] ;
         n4286FasForMul = P081V4_n4286FasForMul[0] ;
         A4903FasAcab = P081V4_A4903FasAcab[0] ;
         n4903FasAcab = P081V4_n4903FasAcab[0] ;
         A458FasCon = P081V4_A458FasCon[0] ;
         n458FasCon = P081V4_n458FasCon[0] ;
         A456FasActTin = P081V4_A456FasActTin[0] ;
         n456FasActTin = P081V4_n456FasActTin[0] ;
         A464FasNumPas = P081V4_A464FasNumPas[0] ;
         n464FasNumPas = P081V4_n464FasNumPas[0] ;
         A472FasVelPro = P081V4_A472FasVelPro[0] ;
         n472FasVelPro = P081V4_n472FasVelPro[0] ;
         A468FasPrePie = P081V4_A468FasPrePie[0] ;
         n468FasPrePie = P081V4_n468FasPrePie[0] ;
         A469FasPreSal = P081V4_A469FasPreSal[0] ;
         n469FasPreSal = P081V4_n469FasPreSal[0] ;
         A5990FasDec2 = P081V4_A5990FasDec2[0] ;
         n5990FasDec2 = P081V4_n5990FasDec2[0] ;
         A459FasDec = P081V4_A459FasDec[0] ;
         n459FasDec = P081V4_n459FasDec[0] ;
         A606MaqDsc = P081V4_A606MaqDsc[0] ;
         n606MaqDsc = P081V4_n606MaqDsc[0] ;
         A602MaqCod = P081V4_A602MaqCod[0] ;
         n602MaqCod = P081V4_n602MaqCod[0] ;
         A460FasDsc = P081V4_A460FasDsc[0] ;
         A457FasCod = P081V4_A457FasCod[0] ;
         A14042FasActiva = P081V4_A14042FasActiva[0] ;
         A606MaqDsc = P081V4_A606MaqDsc[0] ;
         n606MaqDsc = P081V4_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P081V4_A7070FasSigla[0], A7070FasSigla) == 0 ) )
         {
            brk81V6 = false ;
            A396EmprCod = P081V4_A396EmprCod[0] ;
            A457FasCod = P081V4_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A7070FasSigla)==0) )
         {
            AV52Option = A7070FasSigla ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V6 )
         {
            brk81V6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCod = AV48SearchTxt ;
      AV17TFMaqCod_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V5 */
      pr_default.execute(3, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk81V8 = false ;
         A396EmprCod = P081V5_A396EmprCod[0] ;
         A602MaqCod = P081V5_A602MaqCod[0] ;
         n602MaqCod = P081V5_n602MaqCod[0] ;
         A4299FasConPla = P081V5_A4299FasConPla[0] ;
         n4299FasConPla = P081V5_n4299FasConPla[0] ;
         A4286FasForMul = P081V5_A4286FasForMul[0] ;
         n4286FasForMul = P081V5_n4286FasForMul[0] ;
         A4903FasAcab = P081V5_A4903FasAcab[0] ;
         n4903FasAcab = P081V5_n4903FasAcab[0] ;
         A458FasCon = P081V5_A458FasCon[0] ;
         n458FasCon = P081V5_n458FasCon[0] ;
         A456FasActTin = P081V5_A456FasActTin[0] ;
         n456FasActTin = P081V5_n456FasActTin[0] ;
         A464FasNumPas = P081V5_A464FasNumPas[0] ;
         n464FasNumPas = P081V5_n464FasNumPas[0] ;
         A472FasVelPro = P081V5_A472FasVelPro[0] ;
         n472FasVelPro = P081V5_n472FasVelPro[0] ;
         A468FasPrePie = P081V5_A468FasPrePie[0] ;
         n468FasPrePie = P081V5_n468FasPrePie[0] ;
         A469FasPreSal = P081V5_A469FasPreSal[0] ;
         n469FasPreSal = P081V5_n469FasPreSal[0] ;
         A5990FasDec2 = P081V5_A5990FasDec2[0] ;
         n5990FasDec2 = P081V5_n5990FasDec2[0] ;
         A459FasDec = P081V5_A459FasDec[0] ;
         n459FasDec = P081V5_n459FasDec[0] ;
         A606MaqDsc = P081V5_A606MaqDsc[0] ;
         n606MaqDsc = P081V5_n606MaqDsc[0] ;
         A7070FasSigla = P081V5_A7070FasSigla[0] ;
         n7070FasSigla = P081V5_n7070FasSigla[0] ;
         A460FasDsc = P081V5_A460FasDsc[0] ;
         A457FasCod = P081V5_A457FasCod[0] ;
         A14042FasActiva = P081V5_A14042FasActiva[0] ;
         A606MaqDsc = P081V5_A606MaqDsc[0] ;
         n606MaqDsc = P081V5_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P081V5_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk81V8 = false ;
            A396EmprCod = P081V5_A396EmprCod[0] ;
            A457FasCod = P081V5_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV52Option = A602MaqCod ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V8 )
         {
            brk81V8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFMaqDsc = AV48SearchTxt ;
      AV19TFMaqDsc_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V6 */
      pr_default.execute(4, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk81V10 = false ;
         A602MaqCod = P081V6_A602MaqCod[0] ;
         n602MaqCod = P081V6_n602MaqCod[0] ;
         A396EmprCod = P081V6_A396EmprCod[0] ;
         A4299FasConPla = P081V6_A4299FasConPla[0] ;
         n4299FasConPla = P081V6_n4299FasConPla[0] ;
         A4286FasForMul = P081V6_A4286FasForMul[0] ;
         n4286FasForMul = P081V6_n4286FasForMul[0] ;
         A4903FasAcab = P081V6_A4903FasAcab[0] ;
         n4903FasAcab = P081V6_n4903FasAcab[0] ;
         A458FasCon = P081V6_A458FasCon[0] ;
         n458FasCon = P081V6_n458FasCon[0] ;
         A456FasActTin = P081V6_A456FasActTin[0] ;
         n456FasActTin = P081V6_n456FasActTin[0] ;
         A464FasNumPas = P081V6_A464FasNumPas[0] ;
         n464FasNumPas = P081V6_n464FasNumPas[0] ;
         A472FasVelPro = P081V6_A472FasVelPro[0] ;
         n472FasVelPro = P081V6_n472FasVelPro[0] ;
         A468FasPrePie = P081V6_A468FasPrePie[0] ;
         n468FasPrePie = P081V6_n468FasPrePie[0] ;
         A469FasPreSal = P081V6_A469FasPreSal[0] ;
         n469FasPreSal = P081V6_n469FasPreSal[0] ;
         A5990FasDec2 = P081V6_A5990FasDec2[0] ;
         n5990FasDec2 = P081V6_n5990FasDec2[0] ;
         A459FasDec = P081V6_A459FasDec[0] ;
         n459FasDec = P081V6_n459FasDec[0] ;
         A606MaqDsc = P081V6_A606MaqDsc[0] ;
         n606MaqDsc = P081V6_n606MaqDsc[0] ;
         A7070FasSigla = P081V6_A7070FasSigla[0] ;
         n7070FasSigla = P081V6_n7070FasSigla[0] ;
         A460FasDsc = P081V6_A460FasDsc[0] ;
         A457FasCod = P081V6_A457FasCod[0] ;
         A14042FasActiva = P081V6_A14042FasActiva[0] ;
         A606MaqDsc = P081V6_A606MaqDsc[0] ;
         n606MaqDsc = P081V6_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P081V6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P081V6_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk81V10 = false ;
            A457FasCod = P081V6_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV52Option = A606MaqDsc ;
            AV51InsertIndex = 1 ;
            while ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) < 0 ) )
            {
               AV51InsertIndex = (int)(AV51InsertIndex+1) ;
            }
            AV53Options.add(AV52Option, AV51InsertIndex);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), AV51InsertIndex);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V10 )
         {
            brk81V10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASACTTINOPTIONS' Routine */
      returnInSub = false ;
      AV32TFFasActTin = AV48SearchTxt ;
      AV33TFFasActTin_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V7 */
      pr_default.execute(5, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk81V12 = false ;
         A396EmprCod = P081V7_A396EmprCod[0] ;
         A456FasActTin = P081V7_A456FasActTin[0] ;
         n456FasActTin = P081V7_n456FasActTin[0] ;
         A4299FasConPla = P081V7_A4299FasConPla[0] ;
         n4299FasConPla = P081V7_n4299FasConPla[0] ;
         A4286FasForMul = P081V7_A4286FasForMul[0] ;
         n4286FasForMul = P081V7_n4286FasForMul[0] ;
         A4903FasAcab = P081V7_A4903FasAcab[0] ;
         n4903FasAcab = P081V7_n4903FasAcab[0] ;
         A458FasCon = P081V7_A458FasCon[0] ;
         n458FasCon = P081V7_n458FasCon[0] ;
         A464FasNumPas = P081V7_A464FasNumPas[0] ;
         n464FasNumPas = P081V7_n464FasNumPas[0] ;
         A472FasVelPro = P081V7_A472FasVelPro[0] ;
         n472FasVelPro = P081V7_n472FasVelPro[0] ;
         A468FasPrePie = P081V7_A468FasPrePie[0] ;
         n468FasPrePie = P081V7_n468FasPrePie[0] ;
         A469FasPreSal = P081V7_A469FasPreSal[0] ;
         n469FasPreSal = P081V7_n469FasPreSal[0] ;
         A5990FasDec2 = P081V7_A5990FasDec2[0] ;
         n5990FasDec2 = P081V7_n5990FasDec2[0] ;
         A459FasDec = P081V7_A459FasDec[0] ;
         n459FasDec = P081V7_n459FasDec[0] ;
         A606MaqDsc = P081V7_A606MaqDsc[0] ;
         n606MaqDsc = P081V7_n606MaqDsc[0] ;
         A602MaqCod = P081V7_A602MaqCod[0] ;
         n602MaqCod = P081V7_n602MaqCod[0] ;
         A7070FasSigla = P081V7_A7070FasSigla[0] ;
         n7070FasSigla = P081V7_n7070FasSigla[0] ;
         A460FasDsc = P081V7_A460FasDsc[0] ;
         A457FasCod = P081V7_A457FasCod[0] ;
         A14042FasActiva = P081V7_A14042FasActiva[0] ;
         A606MaqDsc = P081V7_A606MaqDsc[0] ;
         n606MaqDsc = P081V7_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P081V7_A456FasActTin[0], A456FasActTin) == 0 ) )
         {
            brk81V12 = false ;
            A396EmprCod = P081V7_A396EmprCod[0] ;
            A457FasCod = P081V7_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A456FasActTin)==0) )
         {
            AV52Option = A456FasActTin ;
            AV55OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A456FasActTin, "@!"))) ;
            AV53Options.add(AV52Option, 0);
            AV56OptionsDesc.add(AV55OptionDesc, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V12 )
         {
            brk81V12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADFASCONOPTIONS' Routine */
      returnInSub = false ;
      AV34TFFasCon = AV48SearchTxt ;
      AV35TFFasCon_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V8 */
      pr_default.execute(6, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk81V14 = false ;
         A396EmprCod = P081V8_A396EmprCod[0] ;
         A458FasCon = P081V8_A458FasCon[0] ;
         n458FasCon = P081V8_n458FasCon[0] ;
         A4299FasConPla = P081V8_A4299FasConPla[0] ;
         n4299FasConPla = P081V8_n4299FasConPla[0] ;
         A4286FasForMul = P081V8_A4286FasForMul[0] ;
         n4286FasForMul = P081V8_n4286FasForMul[0] ;
         A4903FasAcab = P081V8_A4903FasAcab[0] ;
         n4903FasAcab = P081V8_n4903FasAcab[0] ;
         A456FasActTin = P081V8_A456FasActTin[0] ;
         n456FasActTin = P081V8_n456FasActTin[0] ;
         A464FasNumPas = P081V8_A464FasNumPas[0] ;
         n464FasNumPas = P081V8_n464FasNumPas[0] ;
         A472FasVelPro = P081V8_A472FasVelPro[0] ;
         n472FasVelPro = P081V8_n472FasVelPro[0] ;
         A468FasPrePie = P081V8_A468FasPrePie[0] ;
         n468FasPrePie = P081V8_n468FasPrePie[0] ;
         A469FasPreSal = P081V8_A469FasPreSal[0] ;
         n469FasPreSal = P081V8_n469FasPreSal[0] ;
         A5990FasDec2 = P081V8_A5990FasDec2[0] ;
         n5990FasDec2 = P081V8_n5990FasDec2[0] ;
         A459FasDec = P081V8_A459FasDec[0] ;
         n459FasDec = P081V8_n459FasDec[0] ;
         A606MaqDsc = P081V8_A606MaqDsc[0] ;
         n606MaqDsc = P081V8_n606MaqDsc[0] ;
         A602MaqCod = P081V8_A602MaqCod[0] ;
         n602MaqCod = P081V8_n602MaqCod[0] ;
         A7070FasSigla = P081V8_A7070FasSigla[0] ;
         n7070FasSigla = P081V8_n7070FasSigla[0] ;
         A460FasDsc = P081V8_A460FasDsc[0] ;
         A457FasCod = P081V8_A457FasCod[0] ;
         A14042FasActiva = P081V8_A14042FasActiva[0] ;
         A606MaqDsc = P081V8_A606MaqDsc[0] ;
         n606MaqDsc = P081V8_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P081V8_A458FasCon[0], A458FasCon) == 0 ) )
         {
            brk81V14 = false ;
            A396EmprCod = P081V8_A396EmprCod[0] ;
            A457FasCod = P081V8_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A458FasCon)==0) )
         {
            AV52Option = A458FasCon ;
            AV55OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A458FasCon, "@!"))) ;
            AV53Options.add(AV52Option, 0);
            AV56OptionsDesc.add(AV55OptionDesc, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V14 )
         {
            brk81V14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFASACABOPTIONS' Routine */
      returnInSub = false ;
      AV36TFFasAcab = AV48SearchTxt ;
      AV37TFFasAcab_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V9 */
      pr_default.execute(7, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk81V16 = false ;
         A396EmprCod = P081V9_A396EmprCod[0] ;
         A4903FasAcab = P081V9_A4903FasAcab[0] ;
         n4903FasAcab = P081V9_n4903FasAcab[0] ;
         A4299FasConPla = P081V9_A4299FasConPla[0] ;
         n4299FasConPla = P081V9_n4299FasConPla[0] ;
         A4286FasForMul = P081V9_A4286FasForMul[0] ;
         n4286FasForMul = P081V9_n4286FasForMul[0] ;
         A458FasCon = P081V9_A458FasCon[0] ;
         n458FasCon = P081V9_n458FasCon[0] ;
         A456FasActTin = P081V9_A456FasActTin[0] ;
         n456FasActTin = P081V9_n456FasActTin[0] ;
         A464FasNumPas = P081V9_A464FasNumPas[0] ;
         n464FasNumPas = P081V9_n464FasNumPas[0] ;
         A472FasVelPro = P081V9_A472FasVelPro[0] ;
         n472FasVelPro = P081V9_n472FasVelPro[0] ;
         A468FasPrePie = P081V9_A468FasPrePie[0] ;
         n468FasPrePie = P081V9_n468FasPrePie[0] ;
         A469FasPreSal = P081V9_A469FasPreSal[0] ;
         n469FasPreSal = P081V9_n469FasPreSal[0] ;
         A5990FasDec2 = P081V9_A5990FasDec2[0] ;
         n5990FasDec2 = P081V9_n5990FasDec2[0] ;
         A459FasDec = P081V9_A459FasDec[0] ;
         n459FasDec = P081V9_n459FasDec[0] ;
         A606MaqDsc = P081V9_A606MaqDsc[0] ;
         n606MaqDsc = P081V9_n606MaqDsc[0] ;
         A602MaqCod = P081V9_A602MaqCod[0] ;
         n602MaqCod = P081V9_n602MaqCod[0] ;
         A7070FasSigla = P081V9_A7070FasSigla[0] ;
         n7070FasSigla = P081V9_n7070FasSigla[0] ;
         A460FasDsc = P081V9_A460FasDsc[0] ;
         A457FasCod = P081V9_A457FasCod[0] ;
         A14042FasActiva = P081V9_A14042FasActiva[0] ;
         A606MaqDsc = P081V9_A606MaqDsc[0] ;
         n606MaqDsc = P081V9_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P081V9_A4903FasAcab[0], A4903FasAcab) == 0 ) )
         {
            brk81V16 = false ;
            A396EmprCod = P081V9_A396EmprCod[0] ;
            A457FasCod = P081V9_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A4903FasAcab)==0) )
         {
            AV52Option = A4903FasAcab ;
            AV55OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4903FasAcab, "@!"))) ;
            AV53Options.add(AV52Option, 0);
            AV56OptionsDesc.add(AV55OptionDesc, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V16 )
         {
            brk81V16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADFASFORMULOPTIONS' Routine */
      returnInSub = false ;
      AV38TFFasForMul = AV48SearchTxt ;
      AV39TFFasForMul_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V10 */
      pr_default.execute(8, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk81V18 = false ;
         A396EmprCod = P081V10_A396EmprCod[0] ;
         A4286FasForMul = P081V10_A4286FasForMul[0] ;
         n4286FasForMul = P081V10_n4286FasForMul[0] ;
         A4299FasConPla = P081V10_A4299FasConPla[0] ;
         n4299FasConPla = P081V10_n4299FasConPla[0] ;
         A4903FasAcab = P081V10_A4903FasAcab[0] ;
         n4903FasAcab = P081V10_n4903FasAcab[0] ;
         A458FasCon = P081V10_A458FasCon[0] ;
         n458FasCon = P081V10_n458FasCon[0] ;
         A456FasActTin = P081V10_A456FasActTin[0] ;
         n456FasActTin = P081V10_n456FasActTin[0] ;
         A464FasNumPas = P081V10_A464FasNumPas[0] ;
         n464FasNumPas = P081V10_n464FasNumPas[0] ;
         A472FasVelPro = P081V10_A472FasVelPro[0] ;
         n472FasVelPro = P081V10_n472FasVelPro[0] ;
         A468FasPrePie = P081V10_A468FasPrePie[0] ;
         n468FasPrePie = P081V10_n468FasPrePie[0] ;
         A469FasPreSal = P081V10_A469FasPreSal[0] ;
         n469FasPreSal = P081V10_n469FasPreSal[0] ;
         A5990FasDec2 = P081V10_A5990FasDec2[0] ;
         n5990FasDec2 = P081V10_n5990FasDec2[0] ;
         A459FasDec = P081V10_A459FasDec[0] ;
         n459FasDec = P081V10_n459FasDec[0] ;
         A606MaqDsc = P081V10_A606MaqDsc[0] ;
         n606MaqDsc = P081V10_n606MaqDsc[0] ;
         A602MaqCod = P081V10_A602MaqCod[0] ;
         n602MaqCod = P081V10_n602MaqCod[0] ;
         A7070FasSigla = P081V10_A7070FasSigla[0] ;
         n7070FasSigla = P081V10_n7070FasSigla[0] ;
         A460FasDsc = P081V10_A460FasDsc[0] ;
         A457FasCod = P081V10_A457FasCod[0] ;
         A14042FasActiva = P081V10_A14042FasActiva[0] ;
         A606MaqDsc = P081V10_A606MaqDsc[0] ;
         n606MaqDsc = P081V10_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P081V10_A4286FasForMul[0], A4286FasForMul) == 0 ) )
         {
            brk81V18 = false ;
            A396EmprCod = P081V10_A396EmprCod[0] ;
            A457FasCod = P081V10_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V18 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A4286FasForMul)==0) )
         {
            AV52Option = A4286FasForMul ;
            AV55OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4286FasForMul, "@!"))) ;
            AV53Options.add(AV52Option, 0);
            AV56OptionsDesc.add(AV55OptionDesc, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V18 )
         {
            brk81V18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADFASCONPLAOPTIONS' Routine */
      returnInSub = false ;
      AV40TFFasConPla = AV48SearchTxt ;
      AV41TFFasConPla_Sel = "" ;
      AV92Tfasprowwds_1_filterfulltext = AV83FilterFullText ;
      AV93Tfasprowwds_2_tffasactiva_sel = AV87TFFasActiva_Sel ;
      AV94Tfasprowwds_3_tffascod = AV10TFFasCod ;
      AV95Tfasprowwds_4_tffascod_sel = AV11TFFasCod_Sel ;
      AV96Tfasprowwds_5_tffasdsc = AV12TFFasDsc ;
      AV97Tfasprowwds_6_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV98Tfasprowwds_7_tffassigla = AV14TFFasSigla ;
      AV99Tfasprowwds_8_tffassigla_sel = AV15TFFasSigla_Sel ;
      AV100Tfasprowwds_9_tfmaqcod = AV16TFMaqCod ;
      AV101Tfasprowwds_10_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV102Tfasprowwds_11_tfmaqdsc = AV18TFMaqDsc ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV104Tfasprowwds_13_tffasdec = AV20TFFasDec ;
      AV105Tfasprowwds_14_tffasdec_to = AV21TFFasDec_To ;
      AV106Tfasprowwds_15_tffasdec2 = AV22TFFasDec2 ;
      AV107Tfasprowwds_16_tffasdec2_to = AV23TFFasDec2_To ;
      AV108Tfasprowwds_17_tffaspresal = AV24TFFasPreSal ;
      AV109Tfasprowwds_18_tffaspresal_to = AV25TFFasPreSal_To ;
      AV110Tfasprowwds_19_tffasprepie = AV26TFFasPrePie ;
      AV111Tfasprowwds_20_tffasprepie_to = AV27TFFasPrePie_To ;
      AV112Tfasprowwds_21_tffasvelpro = AV28TFFasVelPro ;
      AV113Tfasprowwds_22_tffasvelpro_to = AV29TFFasVelPro_To ;
      AV114Tfasprowwds_23_tffasnumpas = AV30TFFasNumPas ;
      AV115Tfasprowwds_24_tffasnumpas_to = AV31TFFasNumPas_To ;
      AV116Tfasprowwds_25_tffasacttin = AV32TFFasActTin ;
      AV117Tfasprowwds_26_tffasacttin_sel = AV33TFFasActTin_Sel ;
      AV118Tfasprowwds_27_tffascon = AV34TFFasCon ;
      AV119Tfasprowwds_28_tffascon_sel = AV35TFFasCon_Sel ;
      AV120Tfasprowwds_29_tffasacab = AV36TFFasAcab ;
      AV121Tfasprowwds_30_tffasacab_sel = AV37TFFasAcab_Sel ;
      AV122Tfasprowwds_31_tffasformul = AV38TFFasForMul ;
      AV123Tfasprowwds_32_tffasformul_sel = AV39TFFasForMul_Sel ;
      AV124Tfasprowwds_33_tffasconpla = AV40TFFasConPla ;
      AV125Tfasprowwds_34_tffasconpla_sel = AV41TFFasConPla_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV92Tfasprowwds_1_filterfulltext ,
                                           AV93Tfasprowwds_2_tffasactiva_sel ,
                                           AV95Tfasprowwds_4_tffascod_sel ,
                                           AV94Tfasprowwds_3_tffascod ,
                                           AV97Tfasprowwds_6_tffasdsc_sel ,
                                           AV96Tfasprowwds_5_tffasdsc ,
                                           AV99Tfasprowwds_8_tffassigla_sel ,
                                           AV98Tfasprowwds_7_tffassigla ,
                                           AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           AV100Tfasprowwds_9_tfmaqcod ,
                                           AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV102Tfasprowwds_11_tfmaqdsc ,
                                           AV104Tfasprowwds_13_tffasdec ,
                                           AV105Tfasprowwds_14_tffasdec_to ,
                                           AV106Tfasprowwds_15_tffasdec2 ,
                                           AV107Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV108Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV110Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to) ,
                                           AV112Tfasprowwds_21_tffasvelpro ,
                                           AV113Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV114Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to) ,
                                           AV117Tfasprowwds_26_tffasacttin_sel ,
                                           AV116Tfasprowwds_25_tffasacttin ,
                                           AV119Tfasprowwds_28_tffascon_sel ,
                                           AV118Tfasprowwds_27_tffascon ,
                                           AV121Tfasprowwds_30_tffasacab_sel ,
                                           AV120Tfasprowwds_29_tffasacab ,
                                           AV123Tfasprowwds_32_tffasformul_sel ,
                                           AV122Tfasprowwds_31_tffasformul ,
                                           AV125Tfasprowwds_34_tffasconpla_sel ,
                                           AV124Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV92Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Tfasprowwds_1_filterfulltext), "%", "") ;
      lV94Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV94Tfasprowwds_3_tffascod), 8, "%") ;
      lV96Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV96Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV98Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV98Tfasprowwds_7_tffassigla), 4, "%") ;
      lV100Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV102Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV116Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV116Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV118Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV118Tfasprowwds_27_tffascon), 1, "%") ;
      lV120Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_29_tffasacab), 1, "%") ;
      lV122Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_31_tffasformul), 1, "%") ;
      lV124Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081V11 */
      pr_default.execute(9, new Object[] {lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, lV92Tfasprowwds_1_filterfulltext, AV93Tfasprowwds_2_tffasactiva_sel, lV94Tfasprowwds_3_tffascod, AV95Tfasprowwds_4_tffascod_sel, lV96Tfasprowwds_5_tffasdsc, AV97Tfasprowwds_6_tffasdsc_sel, lV98Tfasprowwds_7_tffassigla, AV99Tfasprowwds_8_tffassigla_sel, lV100Tfasprowwds_9_tfmaqcod, AV101Tfasprowwds_10_tfmaqcod_sel, lV102Tfasprowwds_11_tfmaqdsc, AV103Tfasprowwds_12_tfmaqdsc_sel, AV104Tfasprowwds_13_tffasdec, AV105Tfasprowwds_14_tffasdec_to, AV106Tfasprowwds_15_tffasdec2, AV107Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV108Tfasprowwds_17_tffaspresal), Short.valueOf(AV109Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV110Tfasprowwds_19_tffasprepie), Short.valueOf(AV111Tfasprowwds_20_tffasprepie_to), AV112Tfasprowwds_21_tffasvelpro, AV113Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV114Tfasprowwds_23_tffasnumpas), Short.valueOf(AV115Tfasprowwds_24_tffasnumpas_to), lV116Tfasprowwds_25_tffasacttin, AV117Tfasprowwds_26_tffasacttin_sel, lV118Tfasprowwds_27_tffascon, AV119Tfasprowwds_28_tffascon_sel, lV120Tfasprowwds_29_tffasacab, AV121Tfasprowwds_30_tffasacab_sel, lV122Tfasprowwds_31_tffasformul, AV123Tfasprowwds_32_tffasformul_sel, lV124Tfasprowwds_33_tffasconpla, AV125Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk81V20 = false ;
         A396EmprCod = P081V11_A396EmprCod[0] ;
         A4299FasConPla = P081V11_A4299FasConPla[0] ;
         n4299FasConPla = P081V11_n4299FasConPla[0] ;
         A4286FasForMul = P081V11_A4286FasForMul[0] ;
         n4286FasForMul = P081V11_n4286FasForMul[0] ;
         A4903FasAcab = P081V11_A4903FasAcab[0] ;
         n4903FasAcab = P081V11_n4903FasAcab[0] ;
         A458FasCon = P081V11_A458FasCon[0] ;
         n458FasCon = P081V11_n458FasCon[0] ;
         A456FasActTin = P081V11_A456FasActTin[0] ;
         n456FasActTin = P081V11_n456FasActTin[0] ;
         A464FasNumPas = P081V11_A464FasNumPas[0] ;
         n464FasNumPas = P081V11_n464FasNumPas[0] ;
         A472FasVelPro = P081V11_A472FasVelPro[0] ;
         n472FasVelPro = P081V11_n472FasVelPro[0] ;
         A468FasPrePie = P081V11_A468FasPrePie[0] ;
         n468FasPrePie = P081V11_n468FasPrePie[0] ;
         A469FasPreSal = P081V11_A469FasPreSal[0] ;
         n469FasPreSal = P081V11_n469FasPreSal[0] ;
         A5990FasDec2 = P081V11_A5990FasDec2[0] ;
         n5990FasDec2 = P081V11_n5990FasDec2[0] ;
         A459FasDec = P081V11_A459FasDec[0] ;
         n459FasDec = P081V11_n459FasDec[0] ;
         A606MaqDsc = P081V11_A606MaqDsc[0] ;
         n606MaqDsc = P081V11_n606MaqDsc[0] ;
         A602MaqCod = P081V11_A602MaqCod[0] ;
         n602MaqCod = P081V11_n602MaqCod[0] ;
         A7070FasSigla = P081V11_A7070FasSigla[0] ;
         n7070FasSigla = P081V11_n7070FasSigla[0] ;
         A460FasDsc = P081V11_A460FasDsc[0] ;
         A457FasCod = P081V11_A457FasCod[0] ;
         A14042FasActiva = P081V11_A14042FasActiva[0] ;
         A606MaqDsc = P081V11_A606MaqDsc[0] ;
         n606MaqDsc = P081V11_n606MaqDsc[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P081V11_A4299FasConPla[0], A4299FasConPla) == 0 ) )
         {
            brk81V20 = false ;
            A396EmprCod = P081V11_A396EmprCod[0] ;
            A457FasCod = P081V11_A457FasCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk81V20 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A4299FasConPla)==0) )
         {
            AV52Option = A4299FasConPla ;
            AV55OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4299FasConPla, "@!"))) ;
            AV53Options.add(AV52Option, 0);
            AV56OptionsDesc.add(AV55OptionDesc, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81V20 )
         {
            brk81V20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tfasprowwgetfilterdata.this.AV54OptionsJson;
      this.aP4[0] = tfasprowwgetfilterdata.this.AV57OptionsDescJson;
      this.aP5[0] = tfasprowwgetfilterdata.this.AV59OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV54OptionsJson = "" ;
      AV57OptionsDescJson = "" ;
      AV59OptionIndexesJson = "" ;
      AV53Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV61Session = httpContext.getWebSession();
      AV63GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV64GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV83FilterFullText = "" ;
      AV87TFFasActiva_Sel = "" ;
      AV10TFFasCod = "" ;
      AV11TFFasCod_Sel = "" ;
      AV12TFFasDsc = "" ;
      AV13TFFasDsc_Sel = "" ;
      AV14TFFasSigla = "" ;
      AV15TFFasSigla_Sel = "" ;
      AV16TFMaqCod = "" ;
      AV17TFMaqCod_Sel = "" ;
      AV18TFMaqDsc = "" ;
      AV19TFMaqDsc_Sel = "" ;
      AV20TFFasDec = DecimalUtil.ZERO ;
      AV21TFFasDec_To = DecimalUtil.ZERO ;
      AV22TFFasDec2 = DecimalUtil.ZERO ;
      AV23TFFasDec2_To = DecimalUtil.ZERO ;
      AV28TFFasVelPro = DecimalUtil.ZERO ;
      AV29TFFasVelPro_To = DecimalUtil.ZERO ;
      AV32TFFasActTin = "" ;
      AV33TFFasActTin_Sel = "" ;
      AV34TFFasCon = "" ;
      AV35TFFasCon_Sel = "" ;
      AV36TFFasAcab = "" ;
      AV37TFFasAcab_Sel = "" ;
      AV38TFFasForMul = "" ;
      AV39TFFasForMul_Sel = "" ;
      AV40TFFasConPla = "" ;
      AV41TFFasConPla_Sel = "" ;
      A457FasCod = "" ;
      AV92Tfasprowwds_1_filterfulltext = "" ;
      AV93Tfasprowwds_2_tffasactiva_sel = "" ;
      AV94Tfasprowwds_3_tffascod = "" ;
      AV95Tfasprowwds_4_tffascod_sel = "" ;
      AV96Tfasprowwds_5_tffasdsc = "" ;
      AV97Tfasprowwds_6_tffasdsc_sel = "" ;
      AV98Tfasprowwds_7_tffassigla = "" ;
      AV99Tfasprowwds_8_tffassigla_sel = "" ;
      AV100Tfasprowwds_9_tfmaqcod = "" ;
      AV101Tfasprowwds_10_tfmaqcod_sel = "" ;
      AV102Tfasprowwds_11_tfmaqdsc = "" ;
      AV103Tfasprowwds_12_tfmaqdsc_sel = "" ;
      AV104Tfasprowwds_13_tffasdec = DecimalUtil.ZERO ;
      AV105Tfasprowwds_14_tffasdec_to = DecimalUtil.ZERO ;
      AV106Tfasprowwds_15_tffasdec2 = DecimalUtil.ZERO ;
      AV107Tfasprowwds_16_tffasdec2_to = DecimalUtil.ZERO ;
      AV112Tfasprowwds_21_tffasvelpro = DecimalUtil.ZERO ;
      AV113Tfasprowwds_22_tffasvelpro_to = DecimalUtil.ZERO ;
      AV116Tfasprowwds_25_tffasacttin = "" ;
      AV117Tfasprowwds_26_tffasacttin_sel = "" ;
      AV118Tfasprowwds_27_tffascon = "" ;
      AV119Tfasprowwds_28_tffascon_sel = "" ;
      AV120Tfasprowwds_29_tffasacab = "" ;
      AV121Tfasprowwds_30_tffasacab_sel = "" ;
      AV122Tfasprowwds_31_tffasformul = "" ;
      AV123Tfasprowwds_32_tffasformul_sel = "" ;
      AV124Tfasprowwds_33_tffasconpla = "" ;
      AV125Tfasprowwds_34_tffasconpla_sel = "" ;
      scmdbuf = "" ;
      lV92Tfasprowwds_1_filterfulltext = "" ;
      lV94Tfasprowwds_3_tffascod = "" ;
      lV96Tfasprowwds_5_tffasdsc = "" ;
      lV98Tfasprowwds_7_tffassigla = "" ;
      lV100Tfasprowwds_9_tfmaqcod = "" ;
      lV102Tfasprowwds_11_tfmaqdsc = "" ;
      lV116Tfasprowwds_25_tffasacttin = "" ;
      lV118Tfasprowwds_27_tffascon = "" ;
      lV120Tfasprowwds_29_tffasacab = "" ;
      lV122Tfasprowwds_31_tffasformul = "" ;
      lV124Tfasprowwds_33_tffasconpla = "" ;
      A460FasDsc = "" ;
      A7070FasSigla = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A14042FasActiva = "" ;
      P081V2_A396EmprCod = new String[] {""} ;
      P081V2_A457FasCod = new String[] {""} ;
      P081V2_A4299FasConPla = new String[] {""} ;
      P081V2_n4299FasConPla = new boolean[] {false} ;
      P081V2_A4286FasForMul = new String[] {""} ;
      P081V2_n4286FasForMul = new boolean[] {false} ;
      P081V2_A4903FasAcab = new String[] {""} ;
      P081V2_n4903FasAcab = new boolean[] {false} ;
      P081V2_A458FasCon = new String[] {""} ;
      P081V2_n458FasCon = new boolean[] {false} ;
      P081V2_A456FasActTin = new String[] {""} ;
      P081V2_n456FasActTin = new boolean[] {false} ;
      P081V2_A464FasNumPas = new short[1] ;
      P081V2_n464FasNumPas = new boolean[] {false} ;
      P081V2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V2_n472FasVelPro = new boolean[] {false} ;
      P081V2_A468FasPrePie = new short[1] ;
      P081V2_n468FasPrePie = new boolean[] {false} ;
      P081V2_A469FasPreSal = new short[1] ;
      P081V2_n469FasPreSal = new boolean[] {false} ;
      P081V2_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V2_n5990FasDec2 = new boolean[] {false} ;
      P081V2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V2_n459FasDec = new boolean[] {false} ;
      P081V2_A606MaqDsc = new String[] {""} ;
      P081V2_n606MaqDsc = new boolean[] {false} ;
      P081V2_A602MaqCod = new String[] {""} ;
      P081V2_n602MaqCod = new boolean[] {false} ;
      P081V2_A7070FasSigla = new String[] {""} ;
      P081V2_n7070FasSigla = new boolean[] {false} ;
      P081V2_A460FasDsc = new String[] {""} ;
      P081V2_A14042FasActiva = new String[] {""} ;
      A396EmprCod = "" ;
      AV52Option = "" ;
      AV55OptionDesc = "" ;
      P081V3_A396EmprCod = new String[] {""} ;
      P081V3_A460FasDsc = new String[] {""} ;
      P081V3_A4299FasConPla = new String[] {""} ;
      P081V3_n4299FasConPla = new boolean[] {false} ;
      P081V3_A4286FasForMul = new String[] {""} ;
      P081V3_n4286FasForMul = new boolean[] {false} ;
      P081V3_A4903FasAcab = new String[] {""} ;
      P081V3_n4903FasAcab = new boolean[] {false} ;
      P081V3_A458FasCon = new String[] {""} ;
      P081V3_n458FasCon = new boolean[] {false} ;
      P081V3_A456FasActTin = new String[] {""} ;
      P081V3_n456FasActTin = new boolean[] {false} ;
      P081V3_A464FasNumPas = new short[1] ;
      P081V3_n464FasNumPas = new boolean[] {false} ;
      P081V3_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V3_n472FasVelPro = new boolean[] {false} ;
      P081V3_A468FasPrePie = new short[1] ;
      P081V3_n468FasPrePie = new boolean[] {false} ;
      P081V3_A469FasPreSal = new short[1] ;
      P081V3_n469FasPreSal = new boolean[] {false} ;
      P081V3_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V3_n5990FasDec2 = new boolean[] {false} ;
      P081V3_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V3_n459FasDec = new boolean[] {false} ;
      P081V3_A606MaqDsc = new String[] {""} ;
      P081V3_n606MaqDsc = new boolean[] {false} ;
      P081V3_A602MaqCod = new String[] {""} ;
      P081V3_n602MaqCod = new boolean[] {false} ;
      P081V3_A7070FasSigla = new String[] {""} ;
      P081V3_n7070FasSigla = new boolean[] {false} ;
      P081V3_A457FasCod = new String[] {""} ;
      P081V3_A14042FasActiva = new String[] {""} ;
      P081V4_A396EmprCod = new String[] {""} ;
      P081V4_A7070FasSigla = new String[] {""} ;
      P081V4_n7070FasSigla = new boolean[] {false} ;
      P081V4_A4299FasConPla = new String[] {""} ;
      P081V4_n4299FasConPla = new boolean[] {false} ;
      P081V4_A4286FasForMul = new String[] {""} ;
      P081V4_n4286FasForMul = new boolean[] {false} ;
      P081V4_A4903FasAcab = new String[] {""} ;
      P081V4_n4903FasAcab = new boolean[] {false} ;
      P081V4_A458FasCon = new String[] {""} ;
      P081V4_n458FasCon = new boolean[] {false} ;
      P081V4_A456FasActTin = new String[] {""} ;
      P081V4_n456FasActTin = new boolean[] {false} ;
      P081V4_A464FasNumPas = new short[1] ;
      P081V4_n464FasNumPas = new boolean[] {false} ;
      P081V4_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V4_n472FasVelPro = new boolean[] {false} ;
      P081V4_A468FasPrePie = new short[1] ;
      P081V4_n468FasPrePie = new boolean[] {false} ;
      P081V4_A469FasPreSal = new short[1] ;
      P081V4_n469FasPreSal = new boolean[] {false} ;
      P081V4_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V4_n5990FasDec2 = new boolean[] {false} ;
      P081V4_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V4_n459FasDec = new boolean[] {false} ;
      P081V4_A606MaqDsc = new String[] {""} ;
      P081V4_n606MaqDsc = new boolean[] {false} ;
      P081V4_A602MaqCod = new String[] {""} ;
      P081V4_n602MaqCod = new boolean[] {false} ;
      P081V4_A460FasDsc = new String[] {""} ;
      P081V4_A457FasCod = new String[] {""} ;
      P081V4_A14042FasActiva = new String[] {""} ;
      P081V5_A396EmprCod = new String[] {""} ;
      P081V5_A602MaqCod = new String[] {""} ;
      P081V5_n602MaqCod = new boolean[] {false} ;
      P081V5_A4299FasConPla = new String[] {""} ;
      P081V5_n4299FasConPla = new boolean[] {false} ;
      P081V5_A4286FasForMul = new String[] {""} ;
      P081V5_n4286FasForMul = new boolean[] {false} ;
      P081V5_A4903FasAcab = new String[] {""} ;
      P081V5_n4903FasAcab = new boolean[] {false} ;
      P081V5_A458FasCon = new String[] {""} ;
      P081V5_n458FasCon = new boolean[] {false} ;
      P081V5_A456FasActTin = new String[] {""} ;
      P081V5_n456FasActTin = new boolean[] {false} ;
      P081V5_A464FasNumPas = new short[1] ;
      P081V5_n464FasNumPas = new boolean[] {false} ;
      P081V5_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V5_n472FasVelPro = new boolean[] {false} ;
      P081V5_A468FasPrePie = new short[1] ;
      P081V5_n468FasPrePie = new boolean[] {false} ;
      P081V5_A469FasPreSal = new short[1] ;
      P081V5_n469FasPreSal = new boolean[] {false} ;
      P081V5_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V5_n5990FasDec2 = new boolean[] {false} ;
      P081V5_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V5_n459FasDec = new boolean[] {false} ;
      P081V5_A606MaqDsc = new String[] {""} ;
      P081V5_n606MaqDsc = new boolean[] {false} ;
      P081V5_A7070FasSigla = new String[] {""} ;
      P081V5_n7070FasSigla = new boolean[] {false} ;
      P081V5_A460FasDsc = new String[] {""} ;
      P081V5_A457FasCod = new String[] {""} ;
      P081V5_A14042FasActiva = new String[] {""} ;
      P081V6_A602MaqCod = new String[] {""} ;
      P081V6_n602MaqCod = new boolean[] {false} ;
      P081V6_A396EmprCod = new String[] {""} ;
      P081V6_A4299FasConPla = new String[] {""} ;
      P081V6_n4299FasConPla = new boolean[] {false} ;
      P081V6_A4286FasForMul = new String[] {""} ;
      P081V6_n4286FasForMul = new boolean[] {false} ;
      P081V6_A4903FasAcab = new String[] {""} ;
      P081V6_n4903FasAcab = new boolean[] {false} ;
      P081V6_A458FasCon = new String[] {""} ;
      P081V6_n458FasCon = new boolean[] {false} ;
      P081V6_A456FasActTin = new String[] {""} ;
      P081V6_n456FasActTin = new boolean[] {false} ;
      P081V6_A464FasNumPas = new short[1] ;
      P081V6_n464FasNumPas = new boolean[] {false} ;
      P081V6_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V6_n472FasVelPro = new boolean[] {false} ;
      P081V6_A468FasPrePie = new short[1] ;
      P081V6_n468FasPrePie = new boolean[] {false} ;
      P081V6_A469FasPreSal = new short[1] ;
      P081V6_n469FasPreSal = new boolean[] {false} ;
      P081V6_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V6_n5990FasDec2 = new boolean[] {false} ;
      P081V6_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V6_n459FasDec = new boolean[] {false} ;
      P081V6_A606MaqDsc = new String[] {""} ;
      P081V6_n606MaqDsc = new boolean[] {false} ;
      P081V6_A7070FasSigla = new String[] {""} ;
      P081V6_n7070FasSigla = new boolean[] {false} ;
      P081V6_A460FasDsc = new String[] {""} ;
      P081V6_A457FasCod = new String[] {""} ;
      P081V6_A14042FasActiva = new String[] {""} ;
      P081V7_A396EmprCod = new String[] {""} ;
      P081V7_A456FasActTin = new String[] {""} ;
      P081V7_n456FasActTin = new boolean[] {false} ;
      P081V7_A4299FasConPla = new String[] {""} ;
      P081V7_n4299FasConPla = new boolean[] {false} ;
      P081V7_A4286FasForMul = new String[] {""} ;
      P081V7_n4286FasForMul = new boolean[] {false} ;
      P081V7_A4903FasAcab = new String[] {""} ;
      P081V7_n4903FasAcab = new boolean[] {false} ;
      P081V7_A458FasCon = new String[] {""} ;
      P081V7_n458FasCon = new boolean[] {false} ;
      P081V7_A464FasNumPas = new short[1] ;
      P081V7_n464FasNumPas = new boolean[] {false} ;
      P081V7_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V7_n472FasVelPro = new boolean[] {false} ;
      P081V7_A468FasPrePie = new short[1] ;
      P081V7_n468FasPrePie = new boolean[] {false} ;
      P081V7_A469FasPreSal = new short[1] ;
      P081V7_n469FasPreSal = new boolean[] {false} ;
      P081V7_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V7_n5990FasDec2 = new boolean[] {false} ;
      P081V7_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V7_n459FasDec = new boolean[] {false} ;
      P081V7_A606MaqDsc = new String[] {""} ;
      P081V7_n606MaqDsc = new boolean[] {false} ;
      P081V7_A602MaqCod = new String[] {""} ;
      P081V7_n602MaqCod = new boolean[] {false} ;
      P081V7_A7070FasSigla = new String[] {""} ;
      P081V7_n7070FasSigla = new boolean[] {false} ;
      P081V7_A460FasDsc = new String[] {""} ;
      P081V7_A457FasCod = new String[] {""} ;
      P081V7_A14042FasActiva = new String[] {""} ;
      P081V8_A396EmprCod = new String[] {""} ;
      P081V8_A458FasCon = new String[] {""} ;
      P081V8_n458FasCon = new boolean[] {false} ;
      P081V8_A4299FasConPla = new String[] {""} ;
      P081V8_n4299FasConPla = new boolean[] {false} ;
      P081V8_A4286FasForMul = new String[] {""} ;
      P081V8_n4286FasForMul = new boolean[] {false} ;
      P081V8_A4903FasAcab = new String[] {""} ;
      P081V8_n4903FasAcab = new boolean[] {false} ;
      P081V8_A456FasActTin = new String[] {""} ;
      P081V8_n456FasActTin = new boolean[] {false} ;
      P081V8_A464FasNumPas = new short[1] ;
      P081V8_n464FasNumPas = new boolean[] {false} ;
      P081V8_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V8_n472FasVelPro = new boolean[] {false} ;
      P081V8_A468FasPrePie = new short[1] ;
      P081V8_n468FasPrePie = new boolean[] {false} ;
      P081V8_A469FasPreSal = new short[1] ;
      P081V8_n469FasPreSal = new boolean[] {false} ;
      P081V8_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V8_n5990FasDec2 = new boolean[] {false} ;
      P081V8_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V8_n459FasDec = new boolean[] {false} ;
      P081V8_A606MaqDsc = new String[] {""} ;
      P081V8_n606MaqDsc = new boolean[] {false} ;
      P081V8_A602MaqCod = new String[] {""} ;
      P081V8_n602MaqCod = new boolean[] {false} ;
      P081V8_A7070FasSigla = new String[] {""} ;
      P081V8_n7070FasSigla = new boolean[] {false} ;
      P081V8_A460FasDsc = new String[] {""} ;
      P081V8_A457FasCod = new String[] {""} ;
      P081V8_A14042FasActiva = new String[] {""} ;
      P081V9_A396EmprCod = new String[] {""} ;
      P081V9_A4903FasAcab = new String[] {""} ;
      P081V9_n4903FasAcab = new boolean[] {false} ;
      P081V9_A4299FasConPla = new String[] {""} ;
      P081V9_n4299FasConPla = new boolean[] {false} ;
      P081V9_A4286FasForMul = new String[] {""} ;
      P081V9_n4286FasForMul = new boolean[] {false} ;
      P081V9_A458FasCon = new String[] {""} ;
      P081V9_n458FasCon = new boolean[] {false} ;
      P081V9_A456FasActTin = new String[] {""} ;
      P081V9_n456FasActTin = new boolean[] {false} ;
      P081V9_A464FasNumPas = new short[1] ;
      P081V9_n464FasNumPas = new boolean[] {false} ;
      P081V9_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V9_n472FasVelPro = new boolean[] {false} ;
      P081V9_A468FasPrePie = new short[1] ;
      P081V9_n468FasPrePie = new boolean[] {false} ;
      P081V9_A469FasPreSal = new short[1] ;
      P081V9_n469FasPreSal = new boolean[] {false} ;
      P081V9_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V9_n5990FasDec2 = new boolean[] {false} ;
      P081V9_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V9_n459FasDec = new boolean[] {false} ;
      P081V9_A606MaqDsc = new String[] {""} ;
      P081V9_n606MaqDsc = new boolean[] {false} ;
      P081V9_A602MaqCod = new String[] {""} ;
      P081V9_n602MaqCod = new boolean[] {false} ;
      P081V9_A7070FasSigla = new String[] {""} ;
      P081V9_n7070FasSigla = new boolean[] {false} ;
      P081V9_A460FasDsc = new String[] {""} ;
      P081V9_A457FasCod = new String[] {""} ;
      P081V9_A14042FasActiva = new String[] {""} ;
      P081V10_A396EmprCod = new String[] {""} ;
      P081V10_A4286FasForMul = new String[] {""} ;
      P081V10_n4286FasForMul = new boolean[] {false} ;
      P081V10_A4299FasConPla = new String[] {""} ;
      P081V10_n4299FasConPla = new boolean[] {false} ;
      P081V10_A4903FasAcab = new String[] {""} ;
      P081V10_n4903FasAcab = new boolean[] {false} ;
      P081V10_A458FasCon = new String[] {""} ;
      P081V10_n458FasCon = new boolean[] {false} ;
      P081V10_A456FasActTin = new String[] {""} ;
      P081V10_n456FasActTin = new boolean[] {false} ;
      P081V10_A464FasNumPas = new short[1] ;
      P081V10_n464FasNumPas = new boolean[] {false} ;
      P081V10_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V10_n472FasVelPro = new boolean[] {false} ;
      P081V10_A468FasPrePie = new short[1] ;
      P081V10_n468FasPrePie = new boolean[] {false} ;
      P081V10_A469FasPreSal = new short[1] ;
      P081V10_n469FasPreSal = new boolean[] {false} ;
      P081V10_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V10_n5990FasDec2 = new boolean[] {false} ;
      P081V10_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V10_n459FasDec = new boolean[] {false} ;
      P081V10_A606MaqDsc = new String[] {""} ;
      P081V10_n606MaqDsc = new boolean[] {false} ;
      P081V10_A602MaqCod = new String[] {""} ;
      P081V10_n602MaqCod = new boolean[] {false} ;
      P081V10_A7070FasSigla = new String[] {""} ;
      P081V10_n7070FasSigla = new boolean[] {false} ;
      P081V10_A460FasDsc = new String[] {""} ;
      P081V10_A457FasCod = new String[] {""} ;
      P081V10_A14042FasActiva = new String[] {""} ;
      P081V11_A396EmprCod = new String[] {""} ;
      P081V11_A4299FasConPla = new String[] {""} ;
      P081V11_n4299FasConPla = new boolean[] {false} ;
      P081V11_A4286FasForMul = new String[] {""} ;
      P081V11_n4286FasForMul = new boolean[] {false} ;
      P081V11_A4903FasAcab = new String[] {""} ;
      P081V11_n4903FasAcab = new boolean[] {false} ;
      P081V11_A458FasCon = new String[] {""} ;
      P081V11_n458FasCon = new boolean[] {false} ;
      P081V11_A456FasActTin = new String[] {""} ;
      P081V11_n456FasActTin = new boolean[] {false} ;
      P081V11_A464FasNumPas = new short[1] ;
      P081V11_n464FasNumPas = new boolean[] {false} ;
      P081V11_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V11_n472FasVelPro = new boolean[] {false} ;
      P081V11_A468FasPrePie = new short[1] ;
      P081V11_n468FasPrePie = new boolean[] {false} ;
      P081V11_A469FasPreSal = new short[1] ;
      P081V11_n469FasPreSal = new boolean[] {false} ;
      P081V11_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V11_n5990FasDec2 = new boolean[] {false} ;
      P081V11_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081V11_n459FasDec = new boolean[] {false} ;
      P081V11_A606MaqDsc = new String[] {""} ;
      P081V11_n606MaqDsc = new boolean[] {false} ;
      P081V11_A602MaqCod = new String[] {""} ;
      P081V11_n602MaqCod = new boolean[] {false} ;
      P081V11_A7070FasSigla = new String[] {""} ;
      P081V11_n7070FasSigla = new boolean[] {false} ;
      P081V11_A460FasDsc = new String[] {""} ;
      P081V11_A457FasCod = new String[] {""} ;
      P081V11_A14042FasActiva = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasprowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P081V2_A396EmprCod, P081V2_A457FasCod, P081V2_A4299FasConPla, P081V2_n4299FasConPla, P081V2_A4286FasForMul, P081V2_n4286FasForMul, P081V2_A4903FasAcab, P081V2_n4903FasAcab, P081V2_A458FasCon, P081V2_n458FasCon,
            P081V2_A456FasActTin, P081V2_n456FasActTin, P081V2_A464FasNumPas, P081V2_n464FasNumPas, P081V2_A472FasVelPro, P081V2_n472FasVelPro, P081V2_A468FasPrePie, P081V2_n468FasPrePie, P081V2_A469FasPreSal, P081V2_n469FasPreSal,
            P081V2_A5990FasDec2, P081V2_n5990FasDec2, P081V2_A459FasDec, P081V2_n459FasDec, P081V2_A606MaqDsc, P081V2_n606MaqDsc, P081V2_A602MaqCod, P081V2_n602MaqCod, P081V2_A7070FasSigla, P081V2_n7070FasSigla,
            P081V2_A460FasDsc, P081V2_A14042FasActiva
            }
            , new Object[] {
            P081V3_A396EmprCod, P081V3_A460FasDsc, P081V3_A4299FasConPla, P081V3_n4299FasConPla, P081V3_A4286FasForMul, P081V3_n4286FasForMul, P081V3_A4903FasAcab, P081V3_n4903FasAcab, P081V3_A458FasCon, P081V3_n458FasCon,
            P081V3_A456FasActTin, P081V3_n456FasActTin, P081V3_A464FasNumPas, P081V3_n464FasNumPas, P081V3_A472FasVelPro, P081V3_n472FasVelPro, P081V3_A468FasPrePie, P081V3_n468FasPrePie, P081V3_A469FasPreSal, P081V3_n469FasPreSal,
            P081V3_A5990FasDec2, P081V3_n5990FasDec2, P081V3_A459FasDec, P081V3_n459FasDec, P081V3_A606MaqDsc, P081V3_n606MaqDsc, P081V3_A602MaqCod, P081V3_n602MaqCod, P081V3_A7070FasSigla, P081V3_n7070FasSigla,
            P081V3_A457FasCod, P081V3_A14042FasActiva
            }
            , new Object[] {
            P081V4_A396EmprCod, P081V4_A7070FasSigla, P081V4_n7070FasSigla, P081V4_A4299FasConPla, P081V4_n4299FasConPla, P081V4_A4286FasForMul, P081V4_n4286FasForMul, P081V4_A4903FasAcab, P081V4_n4903FasAcab, P081V4_A458FasCon,
            P081V4_n458FasCon, P081V4_A456FasActTin, P081V4_n456FasActTin, P081V4_A464FasNumPas, P081V4_n464FasNumPas, P081V4_A472FasVelPro, P081V4_n472FasVelPro, P081V4_A468FasPrePie, P081V4_n468FasPrePie, P081V4_A469FasPreSal,
            P081V4_n469FasPreSal, P081V4_A5990FasDec2, P081V4_n5990FasDec2, P081V4_A459FasDec, P081V4_n459FasDec, P081V4_A606MaqDsc, P081V4_n606MaqDsc, P081V4_A602MaqCod, P081V4_n602MaqCod, P081V4_A460FasDsc,
            P081V4_A457FasCod, P081V4_A14042FasActiva
            }
            , new Object[] {
            P081V5_A396EmprCod, P081V5_A602MaqCod, P081V5_n602MaqCod, P081V5_A4299FasConPla, P081V5_n4299FasConPla, P081V5_A4286FasForMul, P081V5_n4286FasForMul, P081V5_A4903FasAcab, P081V5_n4903FasAcab, P081V5_A458FasCon,
            P081V5_n458FasCon, P081V5_A456FasActTin, P081V5_n456FasActTin, P081V5_A464FasNumPas, P081V5_n464FasNumPas, P081V5_A472FasVelPro, P081V5_n472FasVelPro, P081V5_A468FasPrePie, P081V5_n468FasPrePie, P081V5_A469FasPreSal,
            P081V5_n469FasPreSal, P081V5_A5990FasDec2, P081V5_n5990FasDec2, P081V5_A459FasDec, P081V5_n459FasDec, P081V5_A606MaqDsc, P081V5_n606MaqDsc, P081V5_A7070FasSigla, P081V5_n7070FasSigla, P081V5_A460FasDsc,
            P081V5_A457FasCod, P081V5_A14042FasActiva
            }
            , new Object[] {
            P081V6_A602MaqCod, P081V6_n602MaqCod, P081V6_A396EmprCod, P081V6_A4299FasConPla, P081V6_n4299FasConPla, P081V6_A4286FasForMul, P081V6_n4286FasForMul, P081V6_A4903FasAcab, P081V6_n4903FasAcab, P081V6_A458FasCon,
            P081V6_n458FasCon, P081V6_A456FasActTin, P081V6_n456FasActTin, P081V6_A464FasNumPas, P081V6_n464FasNumPas, P081V6_A472FasVelPro, P081V6_n472FasVelPro, P081V6_A468FasPrePie, P081V6_n468FasPrePie, P081V6_A469FasPreSal,
            P081V6_n469FasPreSal, P081V6_A5990FasDec2, P081V6_n5990FasDec2, P081V6_A459FasDec, P081V6_n459FasDec, P081V6_A606MaqDsc, P081V6_n606MaqDsc, P081V6_A7070FasSigla, P081V6_n7070FasSigla, P081V6_A460FasDsc,
            P081V6_A457FasCod, P081V6_A14042FasActiva
            }
            , new Object[] {
            P081V7_A396EmprCod, P081V7_A456FasActTin, P081V7_n456FasActTin, P081V7_A4299FasConPla, P081V7_n4299FasConPla, P081V7_A4286FasForMul, P081V7_n4286FasForMul, P081V7_A4903FasAcab, P081V7_n4903FasAcab, P081V7_A458FasCon,
            P081V7_n458FasCon, P081V7_A464FasNumPas, P081V7_n464FasNumPas, P081V7_A472FasVelPro, P081V7_n472FasVelPro, P081V7_A468FasPrePie, P081V7_n468FasPrePie, P081V7_A469FasPreSal, P081V7_n469FasPreSal, P081V7_A5990FasDec2,
            P081V7_n5990FasDec2, P081V7_A459FasDec, P081V7_n459FasDec, P081V7_A606MaqDsc, P081V7_n606MaqDsc, P081V7_A602MaqCod, P081V7_n602MaqCod, P081V7_A7070FasSigla, P081V7_n7070FasSigla, P081V7_A460FasDsc,
            P081V7_A457FasCod, P081V7_A14042FasActiva
            }
            , new Object[] {
            P081V8_A396EmprCod, P081V8_A458FasCon, P081V8_n458FasCon, P081V8_A4299FasConPla, P081V8_n4299FasConPla, P081V8_A4286FasForMul, P081V8_n4286FasForMul, P081V8_A4903FasAcab, P081V8_n4903FasAcab, P081V8_A456FasActTin,
            P081V8_n456FasActTin, P081V8_A464FasNumPas, P081V8_n464FasNumPas, P081V8_A472FasVelPro, P081V8_n472FasVelPro, P081V8_A468FasPrePie, P081V8_n468FasPrePie, P081V8_A469FasPreSal, P081V8_n469FasPreSal, P081V8_A5990FasDec2,
            P081V8_n5990FasDec2, P081V8_A459FasDec, P081V8_n459FasDec, P081V8_A606MaqDsc, P081V8_n606MaqDsc, P081V8_A602MaqCod, P081V8_n602MaqCod, P081V8_A7070FasSigla, P081V8_n7070FasSigla, P081V8_A460FasDsc,
            P081V8_A457FasCod, P081V8_A14042FasActiva
            }
            , new Object[] {
            P081V9_A396EmprCod, P081V9_A4903FasAcab, P081V9_n4903FasAcab, P081V9_A4299FasConPla, P081V9_n4299FasConPla, P081V9_A4286FasForMul, P081V9_n4286FasForMul, P081V9_A458FasCon, P081V9_n458FasCon, P081V9_A456FasActTin,
            P081V9_n456FasActTin, P081V9_A464FasNumPas, P081V9_n464FasNumPas, P081V9_A472FasVelPro, P081V9_n472FasVelPro, P081V9_A468FasPrePie, P081V9_n468FasPrePie, P081V9_A469FasPreSal, P081V9_n469FasPreSal, P081V9_A5990FasDec2,
            P081V9_n5990FasDec2, P081V9_A459FasDec, P081V9_n459FasDec, P081V9_A606MaqDsc, P081V9_n606MaqDsc, P081V9_A602MaqCod, P081V9_n602MaqCod, P081V9_A7070FasSigla, P081V9_n7070FasSigla, P081V9_A460FasDsc,
            P081V9_A457FasCod, P081V9_A14042FasActiva
            }
            , new Object[] {
            P081V10_A396EmprCod, P081V10_A4286FasForMul, P081V10_n4286FasForMul, P081V10_A4299FasConPla, P081V10_n4299FasConPla, P081V10_A4903FasAcab, P081V10_n4903FasAcab, P081V10_A458FasCon, P081V10_n458FasCon, P081V10_A456FasActTin,
            P081V10_n456FasActTin, P081V10_A464FasNumPas, P081V10_n464FasNumPas, P081V10_A472FasVelPro, P081V10_n472FasVelPro, P081V10_A468FasPrePie, P081V10_n468FasPrePie, P081V10_A469FasPreSal, P081V10_n469FasPreSal, P081V10_A5990FasDec2,
            P081V10_n5990FasDec2, P081V10_A459FasDec, P081V10_n459FasDec, P081V10_A606MaqDsc, P081V10_n606MaqDsc, P081V10_A602MaqCod, P081V10_n602MaqCod, P081V10_A7070FasSigla, P081V10_n7070FasSigla, P081V10_A460FasDsc,
            P081V10_A457FasCod, P081V10_A14042FasActiva
            }
            , new Object[] {
            P081V11_A396EmprCod, P081V11_A4299FasConPla, P081V11_n4299FasConPla, P081V11_A4286FasForMul, P081V11_n4286FasForMul, P081V11_A4903FasAcab, P081V11_n4903FasAcab, P081V11_A458FasCon, P081V11_n458FasCon, P081V11_A456FasActTin,
            P081V11_n456FasActTin, P081V11_A464FasNumPas, P081V11_n464FasNumPas, P081V11_A472FasVelPro, P081V11_n472FasVelPro, P081V11_A468FasPrePie, P081V11_n468FasPrePie, P081V11_A469FasPreSal, P081V11_n469FasPreSal, P081V11_A5990FasDec2,
            P081V11_n5990FasDec2, P081V11_A459FasDec, P081V11_n459FasDec, P081V11_A606MaqDsc, P081V11_n606MaqDsc, P081V11_A602MaqCod, P081V11_n602MaqCod, P081V11_A7070FasSigla, P081V11_n7070FasSigla, P081V11_A460FasDsc,
            P081V11_A457FasCod, P081V11_A14042FasActiva
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV24TFFasPreSal ;
   private short AV25TFFasPreSal_To ;
   private short AV26TFFasPrePie ;
   private short AV27TFFasPrePie_To ;
   private short AV30TFFasNumPas ;
   private short AV31TFFasNumPas_To ;
   private short AV108Tfasprowwds_17_tffaspresal ;
   private short AV109Tfasprowwds_18_tffaspresal_to ;
   private short AV110Tfasprowwds_19_tffasprepie ;
   private short AV111Tfasprowwds_20_tffasprepie_to ;
   private short AV114Tfasprowwds_23_tffasnumpas ;
   private short AV115Tfasprowwds_24_tffasnumpas_to ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short Gx_err ;
   private int AV90GXV1 ;
   private int AV51InsertIndex ;
   private long AV60count ;
   private java.math.BigDecimal AV20TFFasDec ;
   private java.math.BigDecimal AV21TFFasDec_To ;
   private java.math.BigDecimal AV22TFFasDec2 ;
   private java.math.BigDecimal AV23TFFasDec2_To ;
   private java.math.BigDecimal AV28TFFasVelPro ;
   private java.math.BigDecimal AV29TFFasVelPro_To ;
   private java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ;
   private java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ;
   private java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ;
   private java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ;
   private java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ;
   private java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A472FasVelPro ;
   private String AV87TFFasActiva_Sel ;
   private String AV10TFFasCod ;
   private String AV11TFFasCod_Sel ;
   private String AV12TFFasDsc ;
   private String AV13TFFasDsc_Sel ;
   private String AV14TFFasSigla ;
   private String AV15TFFasSigla_Sel ;
   private String AV16TFMaqCod ;
   private String AV17TFMaqCod_Sel ;
   private String AV18TFMaqDsc ;
   private String AV19TFMaqDsc_Sel ;
   private String AV32TFFasActTin ;
   private String AV33TFFasActTin_Sel ;
   private String AV34TFFasCon ;
   private String AV35TFFasCon_Sel ;
   private String AV36TFFasAcab ;
   private String AV37TFFasAcab_Sel ;
   private String AV38TFFasForMul ;
   private String AV39TFFasForMul_Sel ;
   private String AV40TFFasConPla ;
   private String AV41TFFasConPla_Sel ;
   private String A457FasCod ;
   private String AV93Tfasprowwds_2_tffasactiva_sel ;
   private String AV94Tfasprowwds_3_tffascod ;
   private String AV95Tfasprowwds_4_tffascod_sel ;
   private String AV96Tfasprowwds_5_tffasdsc ;
   private String AV97Tfasprowwds_6_tffasdsc_sel ;
   private String AV98Tfasprowwds_7_tffassigla ;
   private String AV99Tfasprowwds_8_tffassigla_sel ;
   private String AV100Tfasprowwds_9_tfmaqcod ;
   private String AV101Tfasprowwds_10_tfmaqcod_sel ;
   private String AV102Tfasprowwds_11_tfmaqdsc ;
   private String AV103Tfasprowwds_12_tfmaqdsc_sel ;
   private String AV116Tfasprowwds_25_tffasacttin ;
   private String AV117Tfasprowwds_26_tffasacttin_sel ;
   private String AV118Tfasprowwds_27_tffascon ;
   private String AV119Tfasprowwds_28_tffascon_sel ;
   private String AV120Tfasprowwds_29_tffasacab ;
   private String AV121Tfasprowwds_30_tffasacab_sel ;
   private String AV122Tfasprowwds_31_tffasformul ;
   private String AV123Tfasprowwds_32_tffasformul_sel ;
   private String AV124Tfasprowwds_33_tffasconpla ;
   private String AV125Tfasprowwds_34_tffasconpla_sel ;
   private String scmdbuf ;
   private String lV94Tfasprowwds_3_tffascod ;
   private String lV96Tfasprowwds_5_tffasdsc ;
   private String lV98Tfasprowwds_7_tffassigla ;
   private String lV100Tfasprowwds_9_tfmaqcod ;
   private String lV102Tfasprowwds_11_tfmaqdsc ;
   private String lV116Tfasprowwds_25_tffasacttin ;
   private String lV118Tfasprowwds_27_tffascon ;
   private String lV120Tfasprowwds_29_tffasacab ;
   private String lV122Tfasprowwds_31_tffasformul ;
   private String lV124Tfasprowwds_33_tffasconpla ;
   private String A460FasDsc ;
   private String A7070FasSigla ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String A14042FasActiva ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk81V2 ;
   private boolean n4299FasConPla ;
   private boolean n4286FasForMul ;
   private boolean n4903FasAcab ;
   private boolean n458FasCon ;
   private boolean n456FasActTin ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n5990FasDec2 ;
   private boolean n459FasDec ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n7070FasSigla ;
   private boolean brk81V4 ;
   private boolean brk81V6 ;
   private boolean brk81V8 ;
   private boolean brk81V10 ;
   private boolean brk81V12 ;
   private boolean brk81V14 ;
   private boolean brk81V16 ;
   private boolean brk81V18 ;
   private boolean brk81V20 ;
   private String AV54OptionsJson ;
   private String AV57OptionsDescJson ;
   private String AV59OptionIndexesJson ;
   private String AV50DDOName ;
   private String AV48SearchTxt ;
   private String AV49SearchTxtTo ;
   private String AV83FilterFullText ;
   private String AV92Tfasprowwds_1_filterfulltext ;
   private String lV92Tfasprowwds_1_filterfulltext ;
   private String AV52Option ;
   private String AV55OptionDesc ;
   private com.genexus.webpanels.WebSession AV61Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P081V2_A396EmprCod ;
   private String[] P081V2_A457FasCod ;
   private String[] P081V2_A4299FasConPla ;
   private boolean[] P081V2_n4299FasConPla ;
   private String[] P081V2_A4286FasForMul ;
   private boolean[] P081V2_n4286FasForMul ;
   private String[] P081V2_A4903FasAcab ;
   private boolean[] P081V2_n4903FasAcab ;
   private String[] P081V2_A458FasCon ;
   private boolean[] P081V2_n458FasCon ;
   private String[] P081V2_A456FasActTin ;
   private boolean[] P081V2_n456FasActTin ;
   private short[] P081V2_A464FasNumPas ;
   private boolean[] P081V2_n464FasNumPas ;
   private java.math.BigDecimal[] P081V2_A472FasVelPro ;
   private boolean[] P081V2_n472FasVelPro ;
   private short[] P081V2_A468FasPrePie ;
   private boolean[] P081V2_n468FasPrePie ;
   private short[] P081V2_A469FasPreSal ;
   private boolean[] P081V2_n469FasPreSal ;
   private java.math.BigDecimal[] P081V2_A5990FasDec2 ;
   private boolean[] P081V2_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V2_A459FasDec ;
   private boolean[] P081V2_n459FasDec ;
   private String[] P081V2_A606MaqDsc ;
   private boolean[] P081V2_n606MaqDsc ;
   private String[] P081V2_A602MaqCod ;
   private boolean[] P081V2_n602MaqCod ;
   private String[] P081V2_A7070FasSigla ;
   private boolean[] P081V2_n7070FasSigla ;
   private String[] P081V2_A460FasDsc ;
   private String[] P081V2_A14042FasActiva ;
   private String[] P081V3_A396EmprCod ;
   private String[] P081V3_A460FasDsc ;
   private String[] P081V3_A4299FasConPla ;
   private boolean[] P081V3_n4299FasConPla ;
   private String[] P081V3_A4286FasForMul ;
   private boolean[] P081V3_n4286FasForMul ;
   private String[] P081V3_A4903FasAcab ;
   private boolean[] P081V3_n4903FasAcab ;
   private String[] P081V3_A458FasCon ;
   private boolean[] P081V3_n458FasCon ;
   private String[] P081V3_A456FasActTin ;
   private boolean[] P081V3_n456FasActTin ;
   private short[] P081V3_A464FasNumPas ;
   private boolean[] P081V3_n464FasNumPas ;
   private java.math.BigDecimal[] P081V3_A472FasVelPro ;
   private boolean[] P081V3_n472FasVelPro ;
   private short[] P081V3_A468FasPrePie ;
   private boolean[] P081V3_n468FasPrePie ;
   private short[] P081V3_A469FasPreSal ;
   private boolean[] P081V3_n469FasPreSal ;
   private java.math.BigDecimal[] P081V3_A5990FasDec2 ;
   private boolean[] P081V3_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V3_A459FasDec ;
   private boolean[] P081V3_n459FasDec ;
   private String[] P081V3_A606MaqDsc ;
   private boolean[] P081V3_n606MaqDsc ;
   private String[] P081V3_A602MaqCod ;
   private boolean[] P081V3_n602MaqCod ;
   private String[] P081V3_A7070FasSigla ;
   private boolean[] P081V3_n7070FasSigla ;
   private String[] P081V3_A457FasCod ;
   private String[] P081V3_A14042FasActiva ;
   private String[] P081V4_A396EmprCod ;
   private String[] P081V4_A7070FasSigla ;
   private boolean[] P081V4_n7070FasSigla ;
   private String[] P081V4_A4299FasConPla ;
   private boolean[] P081V4_n4299FasConPla ;
   private String[] P081V4_A4286FasForMul ;
   private boolean[] P081V4_n4286FasForMul ;
   private String[] P081V4_A4903FasAcab ;
   private boolean[] P081V4_n4903FasAcab ;
   private String[] P081V4_A458FasCon ;
   private boolean[] P081V4_n458FasCon ;
   private String[] P081V4_A456FasActTin ;
   private boolean[] P081V4_n456FasActTin ;
   private short[] P081V4_A464FasNumPas ;
   private boolean[] P081V4_n464FasNumPas ;
   private java.math.BigDecimal[] P081V4_A472FasVelPro ;
   private boolean[] P081V4_n472FasVelPro ;
   private short[] P081V4_A468FasPrePie ;
   private boolean[] P081V4_n468FasPrePie ;
   private short[] P081V4_A469FasPreSal ;
   private boolean[] P081V4_n469FasPreSal ;
   private java.math.BigDecimal[] P081V4_A5990FasDec2 ;
   private boolean[] P081V4_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V4_A459FasDec ;
   private boolean[] P081V4_n459FasDec ;
   private String[] P081V4_A606MaqDsc ;
   private boolean[] P081V4_n606MaqDsc ;
   private String[] P081V4_A602MaqCod ;
   private boolean[] P081V4_n602MaqCod ;
   private String[] P081V4_A460FasDsc ;
   private String[] P081V4_A457FasCod ;
   private String[] P081V4_A14042FasActiva ;
   private String[] P081V5_A396EmprCod ;
   private String[] P081V5_A602MaqCod ;
   private boolean[] P081V5_n602MaqCod ;
   private String[] P081V5_A4299FasConPla ;
   private boolean[] P081V5_n4299FasConPla ;
   private String[] P081V5_A4286FasForMul ;
   private boolean[] P081V5_n4286FasForMul ;
   private String[] P081V5_A4903FasAcab ;
   private boolean[] P081V5_n4903FasAcab ;
   private String[] P081V5_A458FasCon ;
   private boolean[] P081V5_n458FasCon ;
   private String[] P081V5_A456FasActTin ;
   private boolean[] P081V5_n456FasActTin ;
   private short[] P081V5_A464FasNumPas ;
   private boolean[] P081V5_n464FasNumPas ;
   private java.math.BigDecimal[] P081V5_A472FasVelPro ;
   private boolean[] P081V5_n472FasVelPro ;
   private short[] P081V5_A468FasPrePie ;
   private boolean[] P081V5_n468FasPrePie ;
   private short[] P081V5_A469FasPreSal ;
   private boolean[] P081V5_n469FasPreSal ;
   private java.math.BigDecimal[] P081V5_A5990FasDec2 ;
   private boolean[] P081V5_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V5_A459FasDec ;
   private boolean[] P081V5_n459FasDec ;
   private String[] P081V5_A606MaqDsc ;
   private boolean[] P081V5_n606MaqDsc ;
   private String[] P081V5_A7070FasSigla ;
   private boolean[] P081V5_n7070FasSigla ;
   private String[] P081V5_A460FasDsc ;
   private String[] P081V5_A457FasCod ;
   private String[] P081V5_A14042FasActiva ;
   private String[] P081V6_A602MaqCod ;
   private boolean[] P081V6_n602MaqCod ;
   private String[] P081V6_A396EmprCod ;
   private String[] P081V6_A4299FasConPla ;
   private boolean[] P081V6_n4299FasConPla ;
   private String[] P081V6_A4286FasForMul ;
   private boolean[] P081V6_n4286FasForMul ;
   private String[] P081V6_A4903FasAcab ;
   private boolean[] P081V6_n4903FasAcab ;
   private String[] P081V6_A458FasCon ;
   private boolean[] P081V6_n458FasCon ;
   private String[] P081V6_A456FasActTin ;
   private boolean[] P081V6_n456FasActTin ;
   private short[] P081V6_A464FasNumPas ;
   private boolean[] P081V6_n464FasNumPas ;
   private java.math.BigDecimal[] P081V6_A472FasVelPro ;
   private boolean[] P081V6_n472FasVelPro ;
   private short[] P081V6_A468FasPrePie ;
   private boolean[] P081V6_n468FasPrePie ;
   private short[] P081V6_A469FasPreSal ;
   private boolean[] P081V6_n469FasPreSal ;
   private java.math.BigDecimal[] P081V6_A5990FasDec2 ;
   private boolean[] P081V6_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V6_A459FasDec ;
   private boolean[] P081V6_n459FasDec ;
   private String[] P081V6_A606MaqDsc ;
   private boolean[] P081V6_n606MaqDsc ;
   private String[] P081V6_A7070FasSigla ;
   private boolean[] P081V6_n7070FasSigla ;
   private String[] P081V6_A460FasDsc ;
   private String[] P081V6_A457FasCod ;
   private String[] P081V6_A14042FasActiva ;
   private String[] P081V7_A396EmprCod ;
   private String[] P081V7_A456FasActTin ;
   private boolean[] P081V7_n456FasActTin ;
   private String[] P081V7_A4299FasConPla ;
   private boolean[] P081V7_n4299FasConPla ;
   private String[] P081V7_A4286FasForMul ;
   private boolean[] P081V7_n4286FasForMul ;
   private String[] P081V7_A4903FasAcab ;
   private boolean[] P081V7_n4903FasAcab ;
   private String[] P081V7_A458FasCon ;
   private boolean[] P081V7_n458FasCon ;
   private short[] P081V7_A464FasNumPas ;
   private boolean[] P081V7_n464FasNumPas ;
   private java.math.BigDecimal[] P081V7_A472FasVelPro ;
   private boolean[] P081V7_n472FasVelPro ;
   private short[] P081V7_A468FasPrePie ;
   private boolean[] P081V7_n468FasPrePie ;
   private short[] P081V7_A469FasPreSal ;
   private boolean[] P081V7_n469FasPreSal ;
   private java.math.BigDecimal[] P081V7_A5990FasDec2 ;
   private boolean[] P081V7_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V7_A459FasDec ;
   private boolean[] P081V7_n459FasDec ;
   private String[] P081V7_A606MaqDsc ;
   private boolean[] P081V7_n606MaqDsc ;
   private String[] P081V7_A602MaqCod ;
   private boolean[] P081V7_n602MaqCod ;
   private String[] P081V7_A7070FasSigla ;
   private boolean[] P081V7_n7070FasSigla ;
   private String[] P081V7_A460FasDsc ;
   private String[] P081V7_A457FasCod ;
   private String[] P081V7_A14042FasActiva ;
   private String[] P081V8_A396EmprCod ;
   private String[] P081V8_A458FasCon ;
   private boolean[] P081V8_n458FasCon ;
   private String[] P081V8_A4299FasConPla ;
   private boolean[] P081V8_n4299FasConPla ;
   private String[] P081V8_A4286FasForMul ;
   private boolean[] P081V8_n4286FasForMul ;
   private String[] P081V8_A4903FasAcab ;
   private boolean[] P081V8_n4903FasAcab ;
   private String[] P081V8_A456FasActTin ;
   private boolean[] P081V8_n456FasActTin ;
   private short[] P081V8_A464FasNumPas ;
   private boolean[] P081V8_n464FasNumPas ;
   private java.math.BigDecimal[] P081V8_A472FasVelPro ;
   private boolean[] P081V8_n472FasVelPro ;
   private short[] P081V8_A468FasPrePie ;
   private boolean[] P081V8_n468FasPrePie ;
   private short[] P081V8_A469FasPreSal ;
   private boolean[] P081V8_n469FasPreSal ;
   private java.math.BigDecimal[] P081V8_A5990FasDec2 ;
   private boolean[] P081V8_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V8_A459FasDec ;
   private boolean[] P081V8_n459FasDec ;
   private String[] P081V8_A606MaqDsc ;
   private boolean[] P081V8_n606MaqDsc ;
   private String[] P081V8_A602MaqCod ;
   private boolean[] P081V8_n602MaqCod ;
   private String[] P081V8_A7070FasSigla ;
   private boolean[] P081V8_n7070FasSigla ;
   private String[] P081V8_A460FasDsc ;
   private String[] P081V8_A457FasCod ;
   private String[] P081V8_A14042FasActiva ;
   private String[] P081V9_A396EmprCod ;
   private String[] P081V9_A4903FasAcab ;
   private boolean[] P081V9_n4903FasAcab ;
   private String[] P081V9_A4299FasConPla ;
   private boolean[] P081V9_n4299FasConPla ;
   private String[] P081V9_A4286FasForMul ;
   private boolean[] P081V9_n4286FasForMul ;
   private String[] P081V9_A458FasCon ;
   private boolean[] P081V9_n458FasCon ;
   private String[] P081V9_A456FasActTin ;
   private boolean[] P081V9_n456FasActTin ;
   private short[] P081V9_A464FasNumPas ;
   private boolean[] P081V9_n464FasNumPas ;
   private java.math.BigDecimal[] P081V9_A472FasVelPro ;
   private boolean[] P081V9_n472FasVelPro ;
   private short[] P081V9_A468FasPrePie ;
   private boolean[] P081V9_n468FasPrePie ;
   private short[] P081V9_A469FasPreSal ;
   private boolean[] P081V9_n469FasPreSal ;
   private java.math.BigDecimal[] P081V9_A5990FasDec2 ;
   private boolean[] P081V9_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V9_A459FasDec ;
   private boolean[] P081V9_n459FasDec ;
   private String[] P081V9_A606MaqDsc ;
   private boolean[] P081V9_n606MaqDsc ;
   private String[] P081V9_A602MaqCod ;
   private boolean[] P081V9_n602MaqCod ;
   private String[] P081V9_A7070FasSigla ;
   private boolean[] P081V9_n7070FasSigla ;
   private String[] P081V9_A460FasDsc ;
   private String[] P081V9_A457FasCod ;
   private String[] P081V9_A14042FasActiva ;
   private String[] P081V10_A396EmprCod ;
   private String[] P081V10_A4286FasForMul ;
   private boolean[] P081V10_n4286FasForMul ;
   private String[] P081V10_A4299FasConPla ;
   private boolean[] P081V10_n4299FasConPla ;
   private String[] P081V10_A4903FasAcab ;
   private boolean[] P081V10_n4903FasAcab ;
   private String[] P081V10_A458FasCon ;
   private boolean[] P081V10_n458FasCon ;
   private String[] P081V10_A456FasActTin ;
   private boolean[] P081V10_n456FasActTin ;
   private short[] P081V10_A464FasNumPas ;
   private boolean[] P081V10_n464FasNumPas ;
   private java.math.BigDecimal[] P081V10_A472FasVelPro ;
   private boolean[] P081V10_n472FasVelPro ;
   private short[] P081V10_A468FasPrePie ;
   private boolean[] P081V10_n468FasPrePie ;
   private short[] P081V10_A469FasPreSal ;
   private boolean[] P081V10_n469FasPreSal ;
   private java.math.BigDecimal[] P081V10_A5990FasDec2 ;
   private boolean[] P081V10_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V10_A459FasDec ;
   private boolean[] P081V10_n459FasDec ;
   private String[] P081V10_A606MaqDsc ;
   private boolean[] P081V10_n606MaqDsc ;
   private String[] P081V10_A602MaqCod ;
   private boolean[] P081V10_n602MaqCod ;
   private String[] P081V10_A7070FasSigla ;
   private boolean[] P081V10_n7070FasSigla ;
   private String[] P081V10_A460FasDsc ;
   private String[] P081V10_A457FasCod ;
   private String[] P081V10_A14042FasActiva ;
   private String[] P081V11_A396EmprCod ;
   private String[] P081V11_A4299FasConPla ;
   private boolean[] P081V11_n4299FasConPla ;
   private String[] P081V11_A4286FasForMul ;
   private boolean[] P081V11_n4286FasForMul ;
   private String[] P081V11_A4903FasAcab ;
   private boolean[] P081V11_n4903FasAcab ;
   private String[] P081V11_A458FasCon ;
   private boolean[] P081V11_n458FasCon ;
   private String[] P081V11_A456FasActTin ;
   private boolean[] P081V11_n456FasActTin ;
   private short[] P081V11_A464FasNumPas ;
   private boolean[] P081V11_n464FasNumPas ;
   private java.math.BigDecimal[] P081V11_A472FasVelPro ;
   private boolean[] P081V11_n472FasVelPro ;
   private short[] P081V11_A468FasPrePie ;
   private boolean[] P081V11_n468FasPrePie ;
   private short[] P081V11_A469FasPreSal ;
   private boolean[] P081V11_n469FasPreSal ;
   private java.math.BigDecimal[] P081V11_A5990FasDec2 ;
   private boolean[] P081V11_n5990FasDec2 ;
   private java.math.BigDecimal[] P081V11_A459FasDec ;
   private boolean[] P081V11_n459FasDec ;
   private String[] P081V11_A606MaqDsc ;
   private boolean[] P081V11_n606MaqDsc ;
   private String[] P081V11_A602MaqCod ;
   private boolean[] P081V11_n602MaqCod ;
   private String[] P081V11_A7070FasSigla ;
   private boolean[] P081V11_n7070FasSigla ;
   private String[] P081V11_A460FasDsc ;
   private String[] P081V11_A457FasCod ;
   private String[] P081V11_A14042FasActiva ;
   private GXSimpleCollection<String> AV53Options ;
   private GXSimpleCollection<String> AV56OptionsDesc ;
   private GXSimpleCollection<String> AV58OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV63GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV64GridStateFilterValue ;
}

final  class tfasprowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[49];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2," ;
      scmdbuf += " T1.FasDec, T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P081V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[49];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasDsc, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2," ;
      scmdbuf += " T1.FasDec, T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P081V4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[49];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasSigla, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2," ;
      scmdbuf += " T1.FasDec, T2.MaqDsc, T1.MaqCod, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasSigla" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P081V5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[49];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2," ;
      scmdbuf += " T1.FasDec, T2.MaqDsc, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P081V6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[49];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T1.EmprCod, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2," ;
      scmdbuf += " T1.FasDec, T2.MaqDsc, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
         GXv_int10[12] = (byte)(1) ;
         GXv_int10[13] = (byte)(1) ;
         GXv_int10[14] = (byte)(1) ;
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P081V7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[49];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasActTin, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int12[10] = (byte)(1) ;
         GXv_int12[11] = (byte)(1) ;
         GXv_int12[12] = (byte)(1) ;
         GXv_int12[13] = (byte)(1) ;
         GXv_int12[14] = (byte)(1) ;
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasActTin" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P081V8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[49];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCon, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
         GXv_int14[1] = (byte)(1) ;
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
         GXv_int14[14] = (byte)(1) ;
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCon" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P081V9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tfasprowwds_1_filterfulltext ,
                                          String AV93Tfasprowwds_2_tffasactiva_sel ,
                                          String AV95Tfasprowwds_4_tffascod_sel ,
                                          String AV94Tfasprowwds_3_tffascod ,
                                          String AV97Tfasprowwds_6_tffasdsc_sel ,
                                          String AV96Tfasprowwds_5_tffasdsc ,
                                          String AV99Tfasprowwds_8_tffassigla_sel ,
                                          String AV98Tfasprowwds_7_tffassigla ,
                                          String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV100Tfasprowwds_9_tfmaqcod ,
                                          String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV102Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                          short AV108Tfasprowwds_17_tffaspresal ,
                                          short AV109Tfasprowwds_18_tffaspresal_to ,
                                          short AV110Tfasprowwds_19_tffasprepie ,
                                          short AV111Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                          short AV114Tfasprowwds_23_tffasnumpas ,
                                          short AV115Tfasprowwds_24_tffasnumpas_to ,
                                          String AV117Tfasprowwds_26_tffasacttin_sel ,
                                          String AV116Tfasprowwds_25_tffasacttin ,
                                          String AV119Tfasprowwds_28_tffascon_sel ,
                                          String AV118Tfasprowwds_27_tffascon ,
                                          String AV121Tfasprowwds_30_tffasacab_sel ,
                                          String AV120Tfasprowwds_29_tffasacab ,
                                          String AV123Tfasprowwds_32_tffasformul_sel ,
                                          String AV122Tfasprowwds_31_tffasformul ,
                                          String AV125Tfasprowwds_34_tffasconpla_sel ,
                                          String AV124Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[49];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasAcab, T1.FasConPla, T1.FasForMul, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
         GXv_int16[1] = (byte)(1) ;
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
         GXv_int16[14] = (byte)(1) ;
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasAcab" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P081V10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV92Tfasprowwds_1_filterfulltext ,
                                           String AV93Tfasprowwds_2_tffasactiva_sel ,
                                           String AV95Tfasprowwds_4_tffascod_sel ,
                                           String AV94Tfasprowwds_3_tffascod ,
                                           String AV97Tfasprowwds_6_tffasdsc_sel ,
                                           String AV96Tfasprowwds_5_tffasdsc ,
                                           String AV99Tfasprowwds_8_tffassigla_sel ,
                                           String AV98Tfasprowwds_7_tffassigla ,
                                           String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           String AV100Tfasprowwds_9_tfmaqcod ,
                                           String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           String AV102Tfasprowwds_11_tfmaqdsc ,
                                           java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                           java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                           java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                           java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                           short AV108Tfasprowwds_17_tffaspresal ,
                                           short AV109Tfasprowwds_18_tffaspresal_to ,
                                           short AV110Tfasprowwds_19_tffasprepie ,
                                           short AV111Tfasprowwds_20_tffasprepie_to ,
                                           java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                           java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                           short AV114Tfasprowwds_23_tffasnumpas ,
                                           short AV115Tfasprowwds_24_tffasnumpas_to ,
                                           String AV117Tfasprowwds_26_tffasacttin_sel ,
                                           String AV116Tfasprowwds_25_tffasacttin ,
                                           String AV119Tfasprowwds_28_tffascon_sel ,
                                           String AV118Tfasprowwds_27_tffascon ,
                                           String AV121Tfasprowwds_30_tffasacab_sel ,
                                           String AV120Tfasprowwds_29_tffasacab ,
                                           String AV123Tfasprowwds_32_tffasformul_sel ,
                                           String AV122Tfasprowwds_31_tffasformul ,
                                           String AV125Tfasprowwds_34_tffasconpla_sel ,
                                           String AV124Tfasprowwds_33_tffasconpla ,
                                           String A457FasCod ,
                                           String A460FasDsc ,
                                           String A7070FasSigla ,
                                           String A602MaqCod ,
                                           String A606MaqDsc ,
                                           java.math.BigDecimal A459FasDec ,
                                           java.math.BigDecimal A5990FasDec2 ,
                                           short A469FasPreSal ,
                                           short A468FasPrePie ,
                                           java.math.BigDecimal A472FasVelPro ,
                                           short A464FasNumPas ,
                                           String A456FasActTin ,
                                           String A458FasCon ,
                                           String A4903FasAcab ,
                                           String A4286FasForMul ,
                                           String A4299FasConPla ,
                                           String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[49];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasForMul, T1.FasConPla, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
         GXv_int18[1] = (byte)(1) ;
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
         GXv_int18[5] = (byte)(1) ;
         GXv_int18[6] = (byte)(1) ;
         GXv_int18[7] = (byte)(1) ;
         GXv_int18[8] = (byte)(1) ;
         GXv_int18[9] = (byte)(1) ;
         GXv_int18[10] = (byte)(1) ;
         GXv_int18[11] = (byte)(1) ;
         GXv_int18[12] = (byte)(1) ;
         GXv_int18[13] = (byte)(1) ;
         GXv_int18[14] = (byte)(1) ;
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int18[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int18[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasForMul" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P081V11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV92Tfasprowwds_1_filterfulltext ,
                                           String AV93Tfasprowwds_2_tffasactiva_sel ,
                                           String AV95Tfasprowwds_4_tffascod_sel ,
                                           String AV94Tfasprowwds_3_tffascod ,
                                           String AV97Tfasprowwds_6_tffasdsc_sel ,
                                           String AV96Tfasprowwds_5_tffasdsc ,
                                           String AV99Tfasprowwds_8_tffassigla_sel ,
                                           String AV98Tfasprowwds_7_tffassigla ,
                                           String AV101Tfasprowwds_10_tfmaqcod_sel ,
                                           String AV100Tfasprowwds_9_tfmaqcod ,
                                           String AV103Tfasprowwds_12_tfmaqdsc_sel ,
                                           String AV102Tfasprowwds_11_tfmaqdsc ,
                                           java.math.BigDecimal AV104Tfasprowwds_13_tffasdec ,
                                           java.math.BigDecimal AV105Tfasprowwds_14_tffasdec_to ,
                                           java.math.BigDecimal AV106Tfasprowwds_15_tffasdec2 ,
                                           java.math.BigDecimal AV107Tfasprowwds_16_tffasdec2_to ,
                                           short AV108Tfasprowwds_17_tffaspresal ,
                                           short AV109Tfasprowwds_18_tffaspresal_to ,
                                           short AV110Tfasprowwds_19_tffasprepie ,
                                           short AV111Tfasprowwds_20_tffasprepie_to ,
                                           java.math.BigDecimal AV112Tfasprowwds_21_tffasvelpro ,
                                           java.math.BigDecimal AV113Tfasprowwds_22_tffasvelpro_to ,
                                           short AV114Tfasprowwds_23_tffasnumpas ,
                                           short AV115Tfasprowwds_24_tffasnumpas_to ,
                                           String AV117Tfasprowwds_26_tffasacttin_sel ,
                                           String AV116Tfasprowwds_25_tffasacttin ,
                                           String AV119Tfasprowwds_28_tffascon_sel ,
                                           String AV118Tfasprowwds_27_tffascon ,
                                           String AV121Tfasprowwds_30_tffasacab_sel ,
                                           String AV120Tfasprowwds_29_tffasacab ,
                                           String AV123Tfasprowwds_32_tffasformul_sel ,
                                           String AV122Tfasprowwds_31_tffasformul ,
                                           String AV125Tfasprowwds_34_tffasconpla_sel ,
                                           String AV124Tfasprowwds_33_tffasconpla ,
                                           String A457FasCod ,
                                           String A460FasDsc ,
                                           String A7070FasSigla ,
                                           String A602MaqCod ,
                                           String A606MaqDsc ,
                                           java.math.BigDecimal A459FasDec ,
                                           java.math.BigDecimal A5990FasDec2 ,
                                           short A469FasPreSal ,
                                           short A468FasPrePie ,
                                           java.math.BigDecimal A472FasVelPro ,
                                           short A464FasNumPas ,
                                           String A456FasActTin ,
                                           String A458FasCon ,
                                           String A4903FasAcab ,
                                           String A4286FasForMul ,
                                           String A4299FasConPla ,
                                           String A14042FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[49];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV92Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
         GXv_int20[1] = (byte)(1) ;
         GXv_int20[2] = (byte)(1) ;
         GXv_int20[3] = (byte)(1) ;
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
         GXv_int20[6] = (byte)(1) ;
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
         GXv_int20[9] = (byte)(1) ;
         GXv_int20[10] = (byte)(1) ;
         GXv_int20[11] = (byte)(1) ;
         GXv_int20[12] = (byte)(1) ;
         GXv_int20[13] = (byte)(1) ;
         GXv_int20[14] = (byte)(1) ;
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV98Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV110Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV111Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV116Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV118Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasConPla" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P081V2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 1 :
                  return conditional_P081V3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 2 :
                  return conditional_P081V4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 3 :
                  return conditional_P081V5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 4 :
                  return conditional_P081V6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 5 :
                  return conditional_P081V7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 6 :
                  return conditional_P081V8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 7 :
                  return conditional_P081V9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 8 :
                  return conditional_P081V10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 9 :
                  return conditional_P081V11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081V11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 28);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
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
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
      }
   }

}

