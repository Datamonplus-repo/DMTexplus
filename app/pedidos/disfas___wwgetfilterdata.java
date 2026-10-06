package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disfas___wwgetfilterdata extends GXProcedure
{
   public disfas___wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disfas___wwgetfilterdata.class ), "" );
   }

   public disfas___wwgetfilterdata( int remoteHandle ,
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
      disfas___wwgetfilterdata.this.aP5 = new String[] {""};
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
      disfas___wwgetfilterdata.this.AV42DDOName = aP0;
      disfas___wwgetfilterdata.this.AV43SearchTxt = aP1;
      disfas___wwgetfilterdata.this.AV44SearchTxtTo = aP2;
      disfas___wwgetfilterdata.this.aP3 = aP3;
      disfas___wwgetfilterdata.this.aP4 = aP4;
      disfas___wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FASACTTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADFASACTTINOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FASCON") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCONOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FASACAB") == 0 )
      {
         /* Execute user subroutine: 'LOADFASACABOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FASFORMUL") == 0 )
      {
         /* Execute user subroutine: 'LOADFASFORMULOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_DISFASOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADDISFASOBSOPTIONS' */
         S171 ();
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
      if ( GXutil.strcmp(AV37Session.getValue("Pedidos.DisFas___WWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.DisFas___WWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("Pedidos.DisFas___WWGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV12TFFasDec = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV13TFFasDec_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV14TFFasPreSal = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFFasPreSal_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV16TFFasPrePie = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFFasPrePie_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV18TFFasVelPro = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFFasVelPro_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV20TFFasNumPas = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFFasNumPas_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV22TFFasActTin = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV23TFFasActTin_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV24TFFasCon = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV25TFFasCon_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV26TFFasAcab = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV27TFFasAcab_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV28TFFasForMul = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV29TFFasForMul_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFASOBS") == 0 )
         {
            AV48TFDisFasObs = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFASOBS_SEL") == 0 )
         {
            AV49TFDisFasObs_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV43SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV54Pedidos_disfas___wwds_1_tfmaqcod = AV10TFMaqCod ;
      AV55Pedidos_disfas___wwds_2_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Pedidos_disfas___wwds_3_tffasdec = AV12TFFasDec ;
      AV57Pedidos_disfas___wwds_4_tffasdec_to = AV13TFFasDec_To ;
      AV58Pedidos_disfas___wwds_5_tffaspresal = AV14TFFasPreSal ;
      AV59Pedidos_disfas___wwds_6_tffaspresal_to = AV15TFFasPreSal_To ;
      AV60Pedidos_disfas___wwds_7_tffasprepie = AV16TFFasPrePie ;
      AV61Pedidos_disfas___wwds_8_tffasprepie_to = AV17TFFasPrePie_To ;
      AV62Pedidos_disfas___wwds_9_tffasvelpro = AV18TFFasVelPro ;
      AV63Pedidos_disfas___wwds_10_tffasvelpro_to = AV19TFFasVelPro_To ;
      AV64Pedidos_disfas___wwds_11_tffasnumpas = AV20TFFasNumPas ;
      AV65Pedidos_disfas___wwds_12_tffasnumpas_to = AV21TFFasNumPas_To ;
      AV66Pedidos_disfas___wwds_13_tffasacttin = AV22TFFasActTin ;
      AV67Pedidos_disfas___wwds_14_tffasacttin_sel = AV23TFFasActTin_Sel ;
      AV68Pedidos_disfas___wwds_15_tffascon = AV24TFFasCon ;
      AV69Pedidos_disfas___wwds_16_tffascon_sel = AV25TFFasCon_Sel ;
      AV70Pedidos_disfas___wwds_17_tffasacab = AV26TFFasAcab ;
      AV71Pedidos_disfas___wwds_18_tffasacab_sel = AV27TFFasAcab_Sel ;
      AV72Pedidos_disfas___wwds_19_tffasformul = AV28TFFasForMul ;
      AV73Pedidos_disfas___wwds_20_tffasformul_sel = AV29TFFasForMul_Sel ;
      AV74Pedidos_disfas___wwds_21_tfdisfasobs = AV48TFDisFasObs ;
      AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV49TFDisFasObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                           AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                           AV56Pedidos_disfas___wwds_3_tffasdec ,
                                           AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                           Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal) ,
                                           Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                           Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie) ,
                                           Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                           AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                           AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                           Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas) ,
                                           Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                           AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                           AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                           AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                           AV68Pedidos_disfas___wwds_15_tffascon ,
                                           AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                           AV70Pedidos_disfas___wwds_17_tffasacab ,
                                           AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                           AV72Pedidos_disfas___wwds_19_tffasformul ,
                                           AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                           AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                           A9841DisFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
      lV66Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV66Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
      lV68Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV68Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
      lV70Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV70Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
      lV72Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV72Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
      lV74Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV74Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
      /* Using cursor P0AG72 */
      pr_default.execute(0, new Object[] {lV54Pedidos_disfas___wwds_1_tfmaqcod, AV55Pedidos_disfas___wwds_2_tfmaqcod_sel, AV56Pedidos_disfas___wwds_3_tffasdec, AV57Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to), AV62Pedidos_disfas___wwds_9_tffasvelpro, AV63Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to), lV66Pedidos_disfas___wwds_13_tffasacttin, AV67Pedidos_disfas___wwds_14_tffasacttin_sel, lV68Pedidos_disfas___wwds_15_tffascon, AV69Pedidos_disfas___wwds_16_tffascon_sel, lV70Pedidos_disfas___wwds_17_tffasacab, AV71Pedidos_disfas___wwds_18_tffasacab_sel, lV72Pedidos_disfas___wwds_19_tffasformul, AV73Pedidos_disfas___wwds_20_tffasformul_sel, lV74Pedidos_disfas___wwds_21_tfdisfasobs, AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAG72 = false ;
         A396EmprCod = P0AG72_A396EmprCod[0] ;
         A457FasCod = P0AG72_A457FasCod[0] ;
         A602MaqCod = P0AG72_A602MaqCod[0] ;
         n602MaqCod = P0AG72_n602MaqCod[0] ;
         A9841DisFasObs = P0AG72_A9841DisFasObs[0] ;
         A4286FasForMul = P0AG72_A4286FasForMul[0] ;
         n4286FasForMul = P0AG72_n4286FasForMul[0] ;
         A4903FasAcab = P0AG72_A4903FasAcab[0] ;
         n4903FasAcab = P0AG72_n4903FasAcab[0] ;
         A458FasCon = P0AG72_A458FasCon[0] ;
         n458FasCon = P0AG72_n458FasCon[0] ;
         A456FasActTin = P0AG72_A456FasActTin[0] ;
         n456FasActTin = P0AG72_n456FasActTin[0] ;
         A464FasNumPas = P0AG72_A464FasNumPas[0] ;
         n464FasNumPas = P0AG72_n464FasNumPas[0] ;
         A472FasVelPro = P0AG72_A472FasVelPro[0] ;
         n472FasVelPro = P0AG72_n472FasVelPro[0] ;
         A468FasPrePie = P0AG72_A468FasPrePie[0] ;
         n468FasPrePie = P0AG72_n468FasPrePie[0] ;
         A469FasPreSal = P0AG72_A469FasPreSal[0] ;
         n469FasPreSal = P0AG72_n469FasPreSal[0] ;
         A459FasDec = P0AG72_A459FasDec[0] ;
         n459FasDec = P0AG72_n459FasDec[0] ;
         A361DisCod = P0AG72_A361DisCod[0] ;
         A758ProCod = P0AG72_A758ProCod[0] ;
         A368DisFasLin = P0AG72_A368DisFasLin[0] ;
         A602MaqCod = P0AG72_A602MaqCod[0] ;
         n602MaqCod = P0AG72_n602MaqCod[0] ;
         A4286FasForMul = P0AG72_A4286FasForMul[0] ;
         n4286FasForMul = P0AG72_n4286FasForMul[0] ;
         A4903FasAcab = P0AG72_A4903FasAcab[0] ;
         n4903FasAcab = P0AG72_n4903FasAcab[0] ;
         A458FasCon = P0AG72_A458FasCon[0] ;
         n458FasCon = P0AG72_n458FasCon[0] ;
         A456FasActTin = P0AG72_A456FasActTin[0] ;
         n456FasActTin = P0AG72_n456FasActTin[0] ;
         A464FasNumPas = P0AG72_A464FasNumPas[0] ;
         n464FasNumPas = P0AG72_n464FasNumPas[0] ;
         A472FasVelPro = P0AG72_A472FasVelPro[0] ;
         n472FasVelPro = P0AG72_n472FasVelPro[0] ;
         A468FasPrePie = P0AG72_A468FasPrePie[0] ;
         n468FasPrePie = P0AG72_n468FasPrePie[0] ;
         A469FasPreSal = P0AG72_A469FasPreSal[0] ;
         n469FasPreSal = P0AG72_n469FasPreSal[0] ;
         A459FasDec = P0AG72_A459FasDec[0] ;
         n459FasDec = P0AG72_n459FasDec[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AG72_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brkAG72 = false ;
            A396EmprCod = P0AG72_A396EmprCod[0] ;
            A457FasCod = P0AG72_A457FasCod[0] ;
            A361DisCod = P0AG72_A361DisCod[0] ;
            A758ProCod = P0AG72_A758ProCod[0] ;
            A368DisFasLin = P0AG72_A368DisFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAG72 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV31Option = A602MaqCod ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG72 )
         {
            brkAG72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASACTTINOPTIONS' Routine */
      returnInSub = false ;
      AV22TFFasActTin = AV43SearchTxt ;
      AV23TFFasActTin_Sel = "" ;
      AV54Pedidos_disfas___wwds_1_tfmaqcod = AV10TFMaqCod ;
      AV55Pedidos_disfas___wwds_2_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Pedidos_disfas___wwds_3_tffasdec = AV12TFFasDec ;
      AV57Pedidos_disfas___wwds_4_tffasdec_to = AV13TFFasDec_To ;
      AV58Pedidos_disfas___wwds_5_tffaspresal = AV14TFFasPreSal ;
      AV59Pedidos_disfas___wwds_6_tffaspresal_to = AV15TFFasPreSal_To ;
      AV60Pedidos_disfas___wwds_7_tffasprepie = AV16TFFasPrePie ;
      AV61Pedidos_disfas___wwds_8_tffasprepie_to = AV17TFFasPrePie_To ;
      AV62Pedidos_disfas___wwds_9_tffasvelpro = AV18TFFasVelPro ;
      AV63Pedidos_disfas___wwds_10_tffasvelpro_to = AV19TFFasVelPro_To ;
      AV64Pedidos_disfas___wwds_11_tffasnumpas = AV20TFFasNumPas ;
      AV65Pedidos_disfas___wwds_12_tffasnumpas_to = AV21TFFasNumPas_To ;
      AV66Pedidos_disfas___wwds_13_tffasacttin = AV22TFFasActTin ;
      AV67Pedidos_disfas___wwds_14_tffasacttin_sel = AV23TFFasActTin_Sel ;
      AV68Pedidos_disfas___wwds_15_tffascon = AV24TFFasCon ;
      AV69Pedidos_disfas___wwds_16_tffascon_sel = AV25TFFasCon_Sel ;
      AV70Pedidos_disfas___wwds_17_tffasacab = AV26TFFasAcab ;
      AV71Pedidos_disfas___wwds_18_tffasacab_sel = AV27TFFasAcab_Sel ;
      AV72Pedidos_disfas___wwds_19_tffasformul = AV28TFFasForMul ;
      AV73Pedidos_disfas___wwds_20_tffasformul_sel = AV29TFFasForMul_Sel ;
      AV74Pedidos_disfas___wwds_21_tfdisfasobs = AV48TFDisFasObs ;
      AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV49TFDisFasObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                           AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                           AV56Pedidos_disfas___wwds_3_tffasdec ,
                                           AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                           Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal) ,
                                           Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                           Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie) ,
                                           Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                           AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                           AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                           Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas) ,
                                           Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                           AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                           AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                           AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                           AV68Pedidos_disfas___wwds_15_tffascon ,
                                           AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                           AV70Pedidos_disfas___wwds_17_tffasacab ,
                                           AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                           AV72Pedidos_disfas___wwds_19_tffasformul ,
                                           AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                           AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                           A9841DisFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
      lV66Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV66Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
      lV68Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV68Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
      lV70Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV70Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
      lV72Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV72Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
      lV74Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV74Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
      /* Using cursor P0AG73 */
      pr_default.execute(1, new Object[] {lV54Pedidos_disfas___wwds_1_tfmaqcod, AV55Pedidos_disfas___wwds_2_tfmaqcod_sel, AV56Pedidos_disfas___wwds_3_tffasdec, AV57Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to), AV62Pedidos_disfas___wwds_9_tffasvelpro, AV63Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to), lV66Pedidos_disfas___wwds_13_tffasacttin, AV67Pedidos_disfas___wwds_14_tffasacttin_sel, lV68Pedidos_disfas___wwds_15_tffascon, AV69Pedidos_disfas___wwds_16_tffascon_sel, lV70Pedidos_disfas___wwds_17_tffasacab, AV71Pedidos_disfas___wwds_18_tffasacab_sel, lV72Pedidos_disfas___wwds_19_tffasformul, AV73Pedidos_disfas___wwds_20_tffasformul_sel, lV74Pedidos_disfas___wwds_21_tfdisfasobs, AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAG74 = false ;
         A396EmprCod = P0AG73_A396EmprCod[0] ;
         A457FasCod = P0AG73_A457FasCod[0] ;
         A456FasActTin = P0AG73_A456FasActTin[0] ;
         n456FasActTin = P0AG73_n456FasActTin[0] ;
         A9841DisFasObs = P0AG73_A9841DisFasObs[0] ;
         A4286FasForMul = P0AG73_A4286FasForMul[0] ;
         n4286FasForMul = P0AG73_n4286FasForMul[0] ;
         A4903FasAcab = P0AG73_A4903FasAcab[0] ;
         n4903FasAcab = P0AG73_n4903FasAcab[0] ;
         A458FasCon = P0AG73_A458FasCon[0] ;
         n458FasCon = P0AG73_n458FasCon[0] ;
         A464FasNumPas = P0AG73_A464FasNumPas[0] ;
         n464FasNumPas = P0AG73_n464FasNumPas[0] ;
         A472FasVelPro = P0AG73_A472FasVelPro[0] ;
         n472FasVelPro = P0AG73_n472FasVelPro[0] ;
         A468FasPrePie = P0AG73_A468FasPrePie[0] ;
         n468FasPrePie = P0AG73_n468FasPrePie[0] ;
         A469FasPreSal = P0AG73_A469FasPreSal[0] ;
         n469FasPreSal = P0AG73_n469FasPreSal[0] ;
         A459FasDec = P0AG73_A459FasDec[0] ;
         n459FasDec = P0AG73_n459FasDec[0] ;
         A602MaqCod = P0AG73_A602MaqCod[0] ;
         n602MaqCod = P0AG73_n602MaqCod[0] ;
         A361DisCod = P0AG73_A361DisCod[0] ;
         A758ProCod = P0AG73_A758ProCod[0] ;
         A368DisFasLin = P0AG73_A368DisFasLin[0] ;
         A456FasActTin = P0AG73_A456FasActTin[0] ;
         n456FasActTin = P0AG73_n456FasActTin[0] ;
         A4286FasForMul = P0AG73_A4286FasForMul[0] ;
         n4286FasForMul = P0AG73_n4286FasForMul[0] ;
         A4903FasAcab = P0AG73_A4903FasAcab[0] ;
         n4903FasAcab = P0AG73_n4903FasAcab[0] ;
         A458FasCon = P0AG73_A458FasCon[0] ;
         n458FasCon = P0AG73_n458FasCon[0] ;
         A464FasNumPas = P0AG73_A464FasNumPas[0] ;
         n464FasNumPas = P0AG73_n464FasNumPas[0] ;
         A472FasVelPro = P0AG73_A472FasVelPro[0] ;
         n472FasVelPro = P0AG73_n472FasVelPro[0] ;
         A468FasPrePie = P0AG73_A468FasPrePie[0] ;
         n468FasPrePie = P0AG73_n468FasPrePie[0] ;
         A469FasPreSal = P0AG73_A469FasPreSal[0] ;
         n469FasPreSal = P0AG73_n469FasPreSal[0] ;
         A459FasDec = P0AG73_A459FasDec[0] ;
         n459FasDec = P0AG73_n459FasDec[0] ;
         A602MaqCod = P0AG73_A602MaqCod[0] ;
         n602MaqCod = P0AG73_n602MaqCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AG73_A456FasActTin[0], A456FasActTin) == 0 ) )
         {
            brkAG74 = false ;
            A396EmprCod = P0AG73_A396EmprCod[0] ;
            A457FasCod = P0AG73_A457FasCod[0] ;
            A361DisCod = P0AG73_A361DisCod[0] ;
            A758ProCod = P0AG73_A758ProCod[0] ;
            A368DisFasLin = P0AG73_A368DisFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAG74 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A456FasActTin)==0) )
         {
            AV31Option = A456FasActTin ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A456FasActTin, "@!"))) ;
            AV32Options.add(AV31Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG74 )
         {
            brkAG74 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASCONOPTIONS' Routine */
      returnInSub = false ;
      AV24TFFasCon = AV43SearchTxt ;
      AV25TFFasCon_Sel = "" ;
      AV54Pedidos_disfas___wwds_1_tfmaqcod = AV10TFMaqCod ;
      AV55Pedidos_disfas___wwds_2_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Pedidos_disfas___wwds_3_tffasdec = AV12TFFasDec ;
      AV57Pedidos_disfas___wwds_4_tffasdec_to = AV13TFFasDec_To ;
      AV58Pedidos_disfas___wwds_5_tffaspresal = AV14TFFasPreSal ;
      AV59Pedidos_disfas___wwds_6_tffaspresal_to = AV15TFFasPreSal_To ;
      AV60Pedidos_disfas___wwds_7_tffasprepie = AV16TFFasPrePie ;
      AV61Pedidos_disfas___wwds_8_tffasprepie_to = AV17TFFasPrePie_To ;
      AV62Pedidos_disfas___wwds_9_tffasvelpro = AV18TFFasVelPro ;
      AV63Pedidos_disfas___wwds_10_tffasvelpro_to = AV19TFFasVelPro_To ;
      AV64Pedidos_disfas___wwds_11_tffasnumpas = AV20TFFasNumPas ;
      AV65Pedidos_disfas___wwds_12_tffasnumpas_to = AV21TFFasNumPas_To ;
      AV66Pedidos_disfas___wwds_13_tffasacttin = AV22TFFasActTin ;
      AV67Pedidos_disfas___wwds_14_tffasacttin_sel = AV23TFFasActTin_Sel ;
      AV68Pedidos_disfas___wwds_15_tffascon = AV24TFFasCon ;
      AV69Pedidos_disfas___wwds_16_tffascon_sel = AV25TFFasCon_Sel ;
      AV70Pedidos_disfas___wwds_17_tffasacab = AV26TFFasAcab ;
      AV71Pedidos_disfas___wwds_18_tffasacab_sel = AV27TFFasAcab_Sel ;
      AV72Pedidos_disfas___wwds_19_tffasformul = AV28TFFasForMul ;
      AV73Pedidos_disfas___wwds_20_tffasformul_sel = AV29TFFasForMul_Sel ;
      AV74Pedidos_disfas___wwds_21_tfdisfasobs = AV48TFDisFasObs ;
      AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV49TFDisFasObs_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                           AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                           AV56Pedidos_disfas___wwds_3_tffasdec ,
                                           AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                           Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal) ,
                                           Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                           Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie) ,
                                           Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                           AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                           AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                           Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas) ,
                                           Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                           AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                           AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                           AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                           AV68Pedidos_disfas___wwds_15_tffascon ,
                                           AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                           AV70Pedidos_disfas___wwds_17_tffasacab ,
                                           AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                           AV72Pedidos_disfas___wwds_19_tffasformul ,
                                           AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                           AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                           A9841DisFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
      lV66Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV66Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
      lV68Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV68Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
      lV70Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV70Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
      lV72Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV72Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
      lV74Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV74Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
      /* Using cursor P0AG74 */
      pr_default.execute(2, new Object[] {lV54Pedidos_disfas___wwds_1_tfmaqcod, AV55Pedidos_disfas___wwds_2_tfmaqcod_sel, AV56Pedidos_disfas___wwds_3_tffasdec, AV57Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to), AV62Pedidos_disfas___wwds_9_tffasvelpro, AV63Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to), lV66Pedidos_disfas___wwds_13_tffasacttin, AV67Pedidos_disfas___wwds_14_tffasacttin_sel, lV68Pedidos_disfas___wwds_15_tffascon, AV69Pedidos_disfas___wwds_16_tffascon_sel, lV70Pedidos_disfas___wwds_17_tffasacab, AV71Pedidos_disfas___wwds_18_tffasacab_sel, lV72Pedidos_disfas___wwds_19_tffasformul, AV73Pedidos_disfas___wwds_20_tffasformul_sel, lV74Pedidos_disfas___wwds_21_tfdisfasobs, AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAG76 = false ;
         A396EmprCod = P0AG74_A396EmprCod[0] ;
         A457FasCod = P0AG74_A457FasCod[0] ;
         A458FasCon = P0AG74_A458FasCon[0] ;
         n458FasCon = P0AG74_n458FasCon[0] ;
         A9841DisFasObs = P0AG74_A9841DisFasObs[0] ;
         A4286FasForMul = P0AG74_A4286FasForMul[0] ;
         n4286FasForMul = P0AG74_n4286FasForMul[0] ;
         A4903FasAcab = P0AG74_A4903FasAcab[0] ;
         n4903FasAcab = P0AG74_n4903FasAcab[0] ;
         A456FasActTin = P0AG74_A456FasActTin[0] ;
         n456FasActTin = P0AG74_n456FasActTin[0] ;
         A464FasNumPas = P0AG74_A464FasNumPas[0] ;
         n464FasNumPas = P0AG74_n464FasNumPas[0] ;
         A472FasVelPro = P0AG74_A472FasVelPro[0] ;
         n472FasVelPro = P0AG74_n472FasVelPro[0] ;
         A468FasPrePie = P0AG74_A468FasPrePie[0] ;
         n468FasPrePie = P0AG74_n468FasPrePie[0] ;
         A469FasPreSal = P0AG74_A469FasPreSal[0] ;
         n469FasPreSal = P0AG74_n469FasPreSal[0] ;
         A459FasDec = P0AG74_A459FasDec[0] ;
         n459FasDec = P0AG74_n459FasDec[0] ;
         A602MaqCod = P0AG74_A602MaqCod[0] ;
         n602MaqCod = P0AG74_n602MaqCod[0] ;
         A361DisCod = P0AG74_A361DisCod[0] ;
         A758ProCod = P0AG74_A758ProCod[0] ;
         A368DisFasLin = P0AG74_A368DisFasLin[0] ;
         A458FasCon = P0AG74_A458FasCon[0] ;
         n458FasCon = P0AG74_n458FasCon[0] ;
         A4286FasForMul = P0AG74_A4286FasForMul[0] ;
         n4286FasForMul = P0AG74_n4286FasForMul[0] ;
         A4903FasAcab = P0AG74_A4903FasAcab[0] ;
         n4903FasAcab = P0AG74_n4903FasAcab[0] ;
         A456FasActTin = P0AG74_A456FasActTin[0] ;
         n456FasActTin = P0AG74_n456FasActTin[0] ;
         A464FasNumPas = P0AG74_A464FasNumPas[0] ;
         n464FasNumPas = P0AG74_n464FasNumPas[0] ;
         A472FasVelPro = P0AG74_A472FasVelPro[0] ;
         n472FasVelPro = P0AG74_n472FasVelPro[0] ;
         A468FasPrePie = P0AG74_A468FasPrePie[0] ;
         n468FasPrePie = P0AG74_n468FasPrePie[0] ;
         A469FasPreSal = P0AG74_A469FasPreSal[0] ;
         n469FasPreSal = P0AG74_n469FasPreSal[0] ;
         A459FasDec = P0AG74_A459FasDec[0] ;
         n459FasDec = P0AG74_n459FasDec[0] ;
         A602MaqCod = P0AG74_A602MaqCod[0] ;
         n602MaqCod = P0AG74_n602MaqCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AG74_A458FasCon[0], A458FasCon) == 0 ) )
         {
            brkAG76 = false ;
            A396EmprCod = P0AG74_A396EmprCod[0] ;
            A457FasCod = P0AG74_A457FasCod[0] ;
            A361DisCod = P0AG74_A361DisCod[0] ;
            A758ProCod = P0AG74_A758ProCod[0] ;
            A368DisFasLin = P0AG74_A368DisFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAG76 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A458FasCon)==0) )
         {
            AV31Option = A458FasCon ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A458FasCon, "@!"))) ;
            AV32Options.add(AV31Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG76 )
         {
            brkAG76 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASACABOPTIONS' Routine */
      returnInSub = false ;
      AV26TFFasAcab = AV43SearchTxt ;
      AV27TFFasAcab_Sel = "" ;
      AV54Pedidos_disfas___wwds_1_tfmaqcod = AV10TFMaqCod ;
      AV55Pedidos_disfas___wwds_2_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Pedidos_disfas___wwds_3_tffasdec = AV12TFFasDec ;
      AV57Pedidos_disfas___wwds_4_tffasdec_to = AV13TFFasDec_To ;
      AV58Pedidos_disfas___wwds_5_tffaspresal = AV14TFFasPreSal ;
      AV59Pedidos_disfas___wwds_6_tffaspresal_to = AV15TFFasPreSal_To ;
      AV60Pedidos_disfas___wwds_7_tffasprepie = AV16TFFasPrePie ;
      AV61Pedidos_disfas___wwds_8_tffasprepie_to = AV17TFFasPrePie_To ;
      AV62Pedidos_disfas___wwds_9_tffasvelpro = AV18TFFasVelPro ;
      AV63Pedidos_disfas___wwds_10_tffasvelpro_to = AV19TFFasVelPro_To ;
      AV64Pedidos_disfas___wwds_11_tffasnumpas = AV20TFFasNumPas ;
      AV65Pedidos_disfas___wwds_12_tffasnumpas_to = AV21TFFasNumPas_To ;
      AV66Pedidos_disfas___wwds_13_tffasacttin = AV22TFFasActTin ;
      AV67Pedidos_disfas___wwds_14_tffasacttin_sel = AV23TFFasActTin_Sel ;
      AV68Pedidos_disfas___wwds_15_tffascon = AV24TFFasCon ;
      AV69Pedidos_disfas___wwds_16_tffascon_sel = AV25TFFasCon_Sel ;
      AV70Pedidos_disfas___wwds_17_tffasacab = AV26TFFasAcab ;
      AV71Pedidos_disfas___wwds_18_tffasacab_sel = AV27TFFasAcab_Sel ;
      AV72Pedidos_disfas___wwds_19_tffasformul = AV28TFFasForMul ;
      AV73Pedidos_disfas___wwds_20_tffasformul_sel = AV29TFFasForMul_Sel ;
      AV74Pedidos_disfas___wwds_21_tfdisfasobs = AV48TFDisFasObs ;
      AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV49TFDisFasObs_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                           AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                           AV56Pedidos_disfas___wwds_3_tffasdec ,
                                           AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                           Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal) ,
                                           Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                           Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie) ,
                                           Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                           AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                           AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                           Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas) ,
                                           Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                           AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                           AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                           AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                           AV68Pedidos_disfas___wwds_15_tffascon ,
                                           AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                           AV70Pedidos_disfas___wwds_17_tffasacab ,
                                           AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                           AV72Pedidos_disfas___wwds_19_tffasformul ,
                                           AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                           AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                           A9841DisFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
      lV66Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV66Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
      lV68Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV68Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
      lV70Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV70Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
      lV72Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV72Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
      lV74Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV74Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
      /* Using cursor P0AG75 */
      pr_default.execute(3, new Object[] {lV54Pedidos_disfas___wwds_1_tfmaqcod, AV55Pedidos_disfas___wwds_2_tfmaqcod_sel, AV56Pedidos_disfas___wwds_3_tffasdec, AV57Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to), AV62Pedidos_disfas___wwds_9_tffasvelpro, AV63Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to), lV66Pedidos_disfas___wwds_13_tffasacttin, AV67Pedidos_disfas___wwds_14_tffasacttin_sel, lV68Pedidos_disfas___wwds_15_tffascon, AV69Pedidos_disfas___wwds_16_tffascon_sel, lV70Pedidos_disfas___wwds_17_tffasacab, AV71Pedidos_disfas___wwds_18_tffasacab_sel, lV72Pedidos_disfas___wwds_19_tffasformul, AV73Pedidos_disfas___wwds_20_tffasformul_sel, lV74Pedidos_disfas___wwds_21_tfdisfasobs, AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAG78 = false ;
         A396EmprCod = P0AG75_A396EmprCod[0] ;
         A457FasCod = P0AG75_A457FasCod[0] ;
         A4903FasAcab = P0AG75_A4903FasAcab[0] ;
         n4903FasAcab = P0AG75_n4903FasAcab[0] ;
         A9841DisFasObs = P0AG75_A9841DisFasObs[0] ;
         A4286FasForMul = P0AG75_A4286FasForMul[0] ;
         n4286FasForMul = P0AG75_n4286FasForMul[0] ;
         A458FasCon = P0AG75_A458FasCon[0] ;
         n458FasCon = P0AG75_n458FasCon[0] ;
         A456FasActTin = P0AG75_A456FasActTin[0] ;
         n456FasActTin = P0AG75_n456FasActTin[0] ;
         A464FasNumPas = P0AG75_A464FasNumPas[0] ;
         n464FasNumPas = P0AG75_n464FasNumPas[0] ;
         A472FasVelPro = P0AG75_A472FasVelPro[0] ;
         n472FasVelPro = P0AG75_n472FasVelPro[0] ;
         A468FasPrePie = P0AG75_A468FasPrePie[0] ;
         n468FasPrePie = P0AG75_n468FasPrePie[0] ;
         A469FasPreSal = P0AG75_A469FasPreSal[0] ;
         n469FasPreSal = P0AG75_n469FasPreSal[0] ;
         A459FasDec = P0AG75_A459FasDec[0] ;
         n459FasDec = P0AG75_n459FasDec[0] ;
         A602MaqCod = P0AG75_A602MaqCod[0] ;
         n602MaqCod = P0AG75_n602MaqCod[0] ;
         A361DisCod = P0AG75_A361DisCod[0] ;
         A758ProCod = P0AG75_A758ProCod[0] ;
         A368DisFasLin = P0AG75_A368DisFasLin[0] ;
         A4903FasAcab = P0AG75_A4903FasAcab[0] ;
         n4903FasAcab = P0AG75_n4903FasAcab[0] ;
         A4286FasForMul = P0AG75_A4286FasForMul[0] ;
         n4286FasForMul = P0AG75_n4286FasForMul[0] ;
         A458FasCon = P0AG75_A458FasCon[0] ;
         n458FasCon = P0AG75_n458FasCon[0] ;
         A456FasActTin = P0AG75_A456FasActTin[0] ;
         n456FasActTin = P0AG75_n456FasActTin[0] ;
         A464FasNumPas = P0AG75_A464FasNumPas[0] ;
         n464FasNumPas = P0AG75_n464FasNumPas[0] ;
         A472FasVelPro = P0AG75_A472FasVelPro[0] ;
         n472FasVelPro = P0AG75_n472FasVelPro[0] ;
         A468FasPrePie = P0AG75_A468FasPrePie[0] ;
         n468FasPrePie = P0AG75_n468FasPrePie[0] ;
         A469FasPreSal = P0AG75_A469FasPreSal[0] ;
         n469FasPreSal = P0AG75_n469FasPreSal[0] ;
         A459FasDec = P0AG75_A459FasDec[0] ;
         n459FasDec = P0AG75_n459FasDec[0] ;
         A602MaqCod = P0AG75_A602MaqCod[0] ;
         n602MaqCod = P0AG75_n602MaqCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AG75_A4903FasAcab[0], A4903FasAcab) == 0 ) )
         {
            brkAG78 = false ;
            A396EmprCod = P0AG75_A396EmprCod[0] ;
            A457FasCod = P0AG75_A457FasCod[0] ;
            A361DisCod = P0AG75_A361DisCod[0] ;
            A758ProCod = P0AG75_A758ProCod[0] ;
            A368DisFasLin = P0AG75_A368DisFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAG78 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4903FasAcab)==0) )
         {
            AV31Option = A4903FasAcab ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4903FasAcab, "@!"))) ;
            AV32Options.add(AV31Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG78 )
         {
            brkAG78 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFASFORMULOPTIONS' Routine */
      returnInSub = false ;
      AV28TFFasForMul = AV43SearchTxt ;
      AV29TFFasForMul_Sel = "" ;
      AV54Pedidos_disfas___wwds_1_tfmaqcod = AV10TFMaqCod ;
      AV55Pedidos_disfas___wwds_2_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Pedidos_disfas___wwds_3_tffasdec = AV12TFFasDec ;
      AV57Pedidos_disfas___wwds_4_tffasdec_to = AV13TFFasDec_To ;
      AV58Pedidos_disfas___wwds_5_tffaspresal = AV14TFFasPreSal ;
      AV59Pedidos_disfas___wwds_6_tffaspresal_to = AV15TFFasPreSal_To ;
      AV60Pedidos_disfas___wwds_7_tffasprepie = AV16TFFasPrePie ;
      AV61Pedidos_disfas___wwds_8_tffasprepie_to = AV17TFFasPrePie_To ;
      AV62Pedidos_disfas___wwds_9_tffasvelpro = AV18TFFasVelPro ;
      AV63Pedidos_disfas___wwds_10_tffasvelpro_to = AV19TFFasVelPro_To ;
      AV64Pedidos_disfas___wwds_11_tffasnumpas = AV20TFFasNumPas ;
      AV65Pedidos_disfas___wwds_12_tffasnumpas_to = AV21TFFasNumPas_To ;
      AV66Pedidos_disfas___wwds_13_tffasacttin = AV22TFFasActTin ;
      AV67Pedidos_disfas___wwds_14_tffasacttin_sel = AV23TFFasActTin_Sel ;
      AV68Pedidos_disfas___wwds_15_tffascon = AV24TFFasCon ;
      AV69Pedidos_disfas___wwds_16_tffascon_sel = AV25TFFasCon_Sel ;
      AV70Pedidos_disfas___wwds_17_tffasacab = AV26TFFasAcab ;
      AV71Pedidos_disfas___wwds_18_tffasacab_sel = AV27TFFasAcab_Sel ;
      AV72Pedidos_disfas___wwds_19_tffasformul = AV28TFFasForMul ;
      AV73Pedidos_disfas___wwds_20_tffasformul_sel = AV29TFFasForMul_Sel ;
      AV74Pedidos_disfas___wwds_21_tfdisfasobs = AV48TFDisFasObs ;
      AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV49TFDisFasObs_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                           AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                           AV56Pedidos_disfas___wwds_3_tffasdec ,
                                           AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                           Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal) ,
                                           Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                           Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie) ,
                                           Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                           AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                           AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                           Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas) ,
                                           Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                           AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                           AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                           AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                           AV68Pedidos_disfas___wwds_15_tffascon ,
                                           AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                           AV70Pedidos_disfas___wwds_17_tffasacab ,
                                           AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                           AV72Pedidos_disfas___wwds_19_tffasformul ,
                                           AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                           AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                           A9841DisFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
      lV66Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV66Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
      lV68Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV68Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
      lV70Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV70Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
      lV72Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV72Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
      lV74Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV74Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
      /* Using cursor P0AG76 */
      pr_default.execute(4, new Object[] {lV54Pedidos_disfas___wwds_1_tfmaqcod, AV55Pedidos_disfas___wwds_2_tfmaqcod_sel, AV56Pedidos_disfas___wwds_3_tffasdec, AV57Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to), AV62Pedidos_disfas___wwds_9_tffasvelpro, AV63Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to), lV66Pedidos_disfas___wwds_13_tffasacttin, AV67Pedidos_disfas___wwds_14_tffasacttin_sel, lV68Pedidos_disfas___wwds_15_tffascon, AV69Pedidos_disfas___wwds_16_tffascon_sel, lV70Pedidos_disfas___wwds_17_tffasacab, AV71Pedidos_disfas___wwds_18_tffasacab_sel, lV72Pedidos_disfas___wwds_19_tffasformul, AV73Pedidos_disfas___wwds_20_tffasformul_sel, lV74Pedidos_disfas___wwds_21_tfdisfasobs, AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAG710 = false ;
         A396EmprCod = P0AG76_A396EmprCod[0] ;
         A457FasCod = P0AG76_A457FasCod[0] ;
         A4286FasForMul = P0AG76_A4286FasForMul[0] ;
         n4286FasForMul = P0AG76_n4286FasForMul[0] ;
         A9841DisFasObs = P0AG76_A9841DisFasObs[0] ;
         A4903FasAcab = P0AG76_A4903FasAcab[0] ;
         n4903FasAcab = P0AG76_n4903FasAcab[0] ;
         A458FasCon = P0AG76_A458FasCon[0] ;
         n458FasCon = P0AG76_n458FasCon[0] ;
         A456FasActTin = P0AG76_A456FasActTin[0] ;
         n456FasActTin = P0AG76_n456FasActTin[0] ;
         A464FasNumPas = P0AG76_A464FasNumPas[0] ;
         n464FasNumPas = P0AG76_n464FasNumPas[0] ;
         A472FasVelPro = P0AG76_A472FasVelPro[0] ;
         n472FasVelPro = P0AG76_n472FasVelPro[0] ;
         A468FasPrePie = P0AG76_A468FasPrePie[0] ;
         n468FasPrePie = P0AG76_n468FasPrePie[0] ;
         A469FasPreSal = P0AG76_A469FasPreSal[0] ;
         n469FasPreSal = P0AG76_n469FasPreSal[0] ;
         A459FasDec = P0AG76_A459FasDec[0] ;
         n459FasDec = P0AG76_n459FasDec[0] ;
         A602MaqCod = P0AG76_A602MaqCod[0] ;
         n602MaqCod = P0AG76_n602MaqCod[0] ;
         A361DisCod = P0AG76_A361DisCod[0] ;
         A758ProCod = P0AG76_A758ProCod[0] ;
         A368DisFasLin = P0AG76_A368DisFasLin[0] ;
         A4286FasForMul = P0AG76_A4286FasForMul[0] ;
         n4286FasForMul = P0AG76_n4286FasForMul[0] ;
         A4903FasAcab = P0AG76_A4903FasAcab[0] ;
         n4903FasAcab = P0AG76_n4903FasAcab[0] ;
         A458FasCon = P0AG76_A458FasCon[0] ;
         n458FasCon = P0AG76_n458FasCon[0] ;
         A456FasActTin = P0AG76_A456FasActTin[0] ;
         n456FasActTin = P0AG76_n456FasActTin[0] ;
         A464FasNumPas = P0AG76_A464FasNumPas[0] ;
         n464FasNumPas = P0AG76_n464FasNumPas[0] ;
         A472FasVelPro = P0AG76_A472FasVelPro[0] ;
         n472FasVelPro = P0AG76_n472FasVelPro[0] ;
         A468FasPrePie = P0AG76_A468FasPrePie[0] ;
         n468FasPrePie = P0AG76_n468FasPrePie[0] ;
         A469FasPreSal = P0AG76_A469FasPreSal[0] ;
         n469FasPreSal = P0AG76_n469FasPreSal[0] ;
         A459FasDec = P0AG76_A459FasDec[0] ;
         n459FasDec = P0AG76_n459FasDec[0] ;
         A602MaqCod = P0AG76_A602MaqCod[0] ;
         n602MaqCod = P0AG76_n602MaqCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AG76_A4286FasForMul[0], A4286FasForMul) == 0 ) )
         {
            brkAG710 = false ;
            A396EmprCod = P0AG76_A396EmprCod[0] ;
            A457FasCod = P0AG76_A457FasCod[0] ;
            A361DisCod = P0AG76_A361DisCod[0] ;
            A758ProCod = P0AG76_A758ProCod[0] ;
            A368DisFasLin = P0AG76_A368DisFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAG710 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A4286FasForMul)==0) )
         {
            AV31Option = A4286FasForMul ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4286FasForMul, "@!"))) ;
            AV32Options.add(AV31Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG710 )
         {
            brkAG710 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADDISFASOBSOPTIONS' Routine */
      returnInSub = false ;
      AV48TFDisFasObs = AV43SearchTxt ;
      AV49TFDisFasObs_Sel = "" ;
      AV54Pedidos_disfas___wwds_1_tfmaqcod = AV10TFMaqCod ;
      AV55Pedidos_disfas___wwds_2_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Pedidos_disfas___wwds_3_tffasdec = AV12TFFasDec ;
      AV57Pedidos_disfas___wwds_4_tffasdec_to = AV13TFFasDec_To ;
      AV58Pedidos_disfas___wwds_5_tffaspresal = AV14TFFasPreSal ;
      AV59Pedidos_disfas___wwds_6_tffaspresal_to = AV15TFFasPreSal_To ;
      AV60Pedidos_disfas___wwds_7_tffasprepie = AV16TFFasPrePie ;
      AV61Pedidos_disfas___wwds_8_tffasprepie_to = AV17TFFasPrePie_To ;
      AV62Pedidos_disfas___wwds_9_tffasvelpro = AV18TFFasVelPro ;
      AV63Pedidos_disfas___wwds_10_tffasvelpro_to = AV19TFFasVelPro_To ;
      AV64Pedidos_disfas___wwds_11_tffasnumpas = AV20TFFasNumPas ;
      AV65Pedidos_disfas___wwds_12_tffasnumpas_to = AV21TFFasNumPas_To ;
      AV66Pedidos_disfas___wwds_13_tffasacttin = AV22TFFasActTin ;
      AV67Pedidos_disfas___wwds_14_tffasacttin_sel = AV23TFFasActTin_Sel ;
      AV68Pedidos_disfas___wwds_15_tffascon = AV24TFFasCon ;
      AV69Pedidos_disfas___wwds_16_tffascon_sel = AV25TFFasCon_Sel ;
      AV70Pedidos_disfas___wwds_17_tffasacab = AV26TFFasAcab ;
      AV71Pedidos_disfas___wwds_18_tffasacab_sel = AV27TFFasAcab_Sel ;
      AV72Pedidos_disfas___wwds_19_tffasformul = AV28TFFasForMul ;
      AV73Pedidos_disfas___wwds_20_tffasformul_sel = AV29TFFasForMul_Sel ;
      AV74Pedidos_disfas___wwds_21_tfdisfasobs = AV48TFDisFasObs ;
      AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV49TFDisFasObs_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                           AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                           AV56Pedidos_disfas___wwds_3_tffasdec ,
                                           AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                           Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal) ,
                                           Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                           Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie) ,
                                           Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                           AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                           AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                           Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas) ,
                                           Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                           AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                           AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                           AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                           AV68Pedidos_disfas___wwds_15_tffascon ,
                                           AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                           AV70Pedidos_disfas___wwds_17_tffasacab ,
                                           AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                           AV72Pedidos_disfas___wwds_19_tffasformul ,
                                           AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                           AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                           A9841DisFasObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
      lV66Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV66Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
      lV68Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV68Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
      lV70Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV70Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
      lV72Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV72Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
      lV74Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV74Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
      /* Using cursor P0AG77 */
      pr_default.execute(5, new Object[] {lV54Pedidos_disfas___wwds_1_tfmaqcod, AV55Pedidos_disfas___wwds_2_tfmaqcod_sel, AV56Pedidos_disfas___wwds_3_tffasdec, AV57Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV58Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV59Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV60Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV61Pedidos_disfas___wwds_8_tffasprepie_to), AV62Pedidos_disfas___wwds_9_tffasvelpro, AV63Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV64Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV65Pedidos_disfas___wwds_12_tffasnumpas_to), lV66Pedidos_disfas___wwds_13_tffasacttin, AV67Pedidos_disfas___wwds_14_tffasacttin_sel, lV68Pedidos_disfas___wwds_15_tffascon, AV69Pedidos_disfas___wwds_16_tffascon_sel, lV70Pedidos_disfas___wwds_17_tffasacab, AV71Pedidos_disfas___wwds_18_tffasacab_sel, lV72Pedidos_disfas___wwds_19_tffasformul, AV73Pedidos_disfas___wwds_20_tffasformul_sel, lV74Pedidos_disfas___wwds_21_tfdisfasobs, AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAG712 = false ;
         A396EmprCod = P0AG77_A396EmprCod[0] ;
         A457FasCod = P0AG77_A457FasCod[0] ;
         A9841DisFasObs = P0AG77_A9841DisFasObs[0] ;
         A4286FasForMul = P0AG77_A4286FasForMul[0] ;
         n4286FasForMul = P0AG77_n4286FasForMul[0] ;
         A4903FasAcab = P0AG77_A4903FasAcab[0] ;
         n4903FasAcab = P0AG77_n4903FasAcab[0] ;
         A458FasCon = P0AG77_A458FasCon[0] ;
         n458FasCon = P0AG77_n458FasCon[0] ;
         A456FasActTin = P0AG77_A456FasActTin[0] ;
         n456FasActTin = P0AG77_n456FasActTin[0] ;
         A464FasNumPas = P0AG77_A464FasNumPas[0] ;
         n464FasNumPas = P0AG77_n464FasNumPas[0] ;
         A472FasVelPro = P0AG77_A472FasVelPro[0] ;
         n472FasVelPro = P0AG77_n472FasVelPro[0] ;
         A468FasPrePie = P0AG77_A468FasPrePie[0] ;
         n468FasPrePie = P0AG77_n468FasPrePie[0] ;
         A469FasPreSal = P0AG77_A469FasPreSal[0] ;
         n469FasPreSal = P0AG77_n469FasPreSal[0] ;
         A459FasDec = P0AG77_A459FasDec[0] ;
         n459FasDec = P0AG77_n459FasDec[0] ;
         A602MaqCod = P0AG77_A602MaqCod[0] ;
         n602MaqCod = P0AG77_n602MaqCod[0] ;
         A361DisCod = P0AG77_A361DisCod[0] ;
         A758ProCod = P0AG77_A758ProCod[0] ;
         A368DisFasLin = P0AG77_A368DisFasLin[0] ;
         A4286FasForMul = P0AG77_A4286FasForMul[0] ;
         n4286FasForMul = P0AG77_n4286FasForMul[0] ;
         A4903FasAcab = P0AG77_A4903FasAcab[0] ;
         n4903FasAcab = P0AG77_n4903FasAcab[0] ;
         A458FasCon = P0AG77_A458FasCon[0] ;
         n458FasCon = P0AG77_n458FasCon[0] ;
         A456FasActTin = P0AG77_A456FasActTin[0] ;
         n456FasActTin = P0AG77_n456FasActTin[0] ;
         A464FasNumPas = P0AG77_A464FasNumPas[0] ;
         n464FasNumPas = P0AG77_n464FasNumPas[0] ;
         A472FasVelPro = P0AG77_A472FasVelPro[0] ;
         n472FasVelPro = P0AG77_n472FasVelPro[0] ;
         A468FasPrePie = P0AG77_A468FasPrePie[0] ;
         n468FasPrePie = P0AG77_n468FasPrePie[0] ;
         A469FasPreSal = P0AG77_A469FasPreSal[0] ;
         n469FasPreSal = P0AG77_n469FasPreSal[0] ;
         A459FasDec = P0AG77_A459FasDec[0] ;
         n459FasDec = P0AG77_n459FasDec[0] ;
         A602MaqCod = P0AG77_A602MaqCod[0] ;
         n602MaqCod = P0AG77_n602MaqCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AG77_A9841DisFasObs[0], A9841DisFasObs) == 0 ) )
         {
            brkAG712 = false ;
            A396EmprCod = P0AG77_A396EmprCod[0] ;
            A361DisCod = P0AG77_A361DisCod[0] ;
            A758ProCod = P0AG77_A758ProCod[0] ;
            A368DisFasLin = P0AG77_A368DisFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAG712 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A9841DisFasObs)==0) )
         {
            AV31Option = A9841DisFasObs ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG712 )
         {
            brkAG712 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = disfas___wwgetfilterdata.this.AV45OptionsJson;
      this.aP4[0] = disfas___wwgetfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = disfas___wwgetfilterdata.this.AV47OptionIndexesJson;
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
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV12TFFasDec = DecimalUtil.ZERO ;
      AV13TFFasDec_To = DecimalUtil.ZERO ;
      AV18TFFasVelPro = DecimalUtil.ZERO ;
      AV19TFFasVelPro_To = DecimalUtil.ZERO ;
      AV22TFFasActTin = "" ;
      AV23TFFasActTin_Sel = "" ;
      AV24TFFasCon = "" ;
      AV25TFFasCon_Sel = "" ;
      AV26TFFasAcab = "" ;
      AV27TFFasAcab_Sel = "" ;
      AV28TFFasForMul = "" ;
      AV29TFFasForMul_Sel = "" ;
      AV48TFDisFasObs = "" ;
      AV49TFDisFasObs_Sel = "" ;
      A602MaqCod = "" ;
      AV54Pedidos_disfas___wwds_1_tfmaqcod = "" ;
      AV55Pedidos_disfas___wwds_2_tfmaqcod_sel = "" ;
      AV56Pedidos_disfas___wwds_3_tffasdec = DecimalUtil.ZERO ;
      AV57Pedidos_disfas___wwds_4_tffasdec_to = DecimalUtil.ZERO ;
      AV62Pedidos_disfas___wwds_9_tffasvelpro = DecimalUtil.ZERO ;
      AV63Pedidos_disfas___wwds_10_tffasvelpro_to = DecimalUtil.ZERO ;
      AV66Pedidos_disfas___wwds_13_tffasacttin = "" ;
      AV67Pedidos_disfas___wwds_14_tffasacttin_sel = "" ;
      AV68Pedidos_disfas___wwds_15_tffascon = "" ;
      AV69Pedidos_disfas___wwds_16_tffascon_sel = "" ;
      AV70Pedidos_disfas___wwds_17_tffasacab = "" ;
      AV71Pedidos_disfas___wwds_18_tffasacab_sel = "" ;
      AV72Pedidos_disfas___wwds_19_tffasformul = "" ;
      AV73Pedidos_disfas___wwds_20_tffasformul_sel = "" ;
      AV74Pedidos_disfas___wwds_21_tfdisfasobs = "" ;
      AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel = "" ;
      scmdbuf = "" ;
      lV54Pedidos_disfas___wwds_1_tfmaqcod = "" ;
      lV66Pedidos_disfas___wwds_13_tffasacttin = "" ;
      lV68Pedidos_disfas___wwds_15_tffascon = "" ;
      lV70Pedidos_disfas___wwds_17_tffasacab = "" ;
      lV72Pedidos_disfas___wwds_19_tffasformul = "" ;
      lV74Pedidos_disfas___wwds_21_tfdisfasobs = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A9841DisFasObs = "" ;
      P0AG72_A396EmprCod = new String[] {""} ;
      P0AG72_A457FasCod = new String[] {""} ;
      P0AG72_A602MaqCod = new String[] {""} ;
      P0AG72_n602MaqCod = new boolean[] {false} ;
      P0AG72_A9841DisFasObs = new String[] {""} ;
      P0AG72_A4286FasForMul = new String[] {""} ;
      P0AG72_n4286FasForMul = new boolean[] {false} ;
      P0AG72_A4903FasAcab = new String[] {""} ;
      P0AG72_n4903FasAcab = new boolean[] {false} ;
      P0AG72_A458FasCon = new String[] {""} ;
      P0AG72_n458FasCon = new boolean[] {false} ;
      P0AG72_A456FasActTin = new String[] {""} ;
      P0AG72_n456FasActTin = new boolean[] {false} ;
      P0AG72_A464FasNumPas = new short[1] ;
      P0AG72_n464FasNumPas = new boolean[] {false} ;
      P0AG72_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG72_n472FasVelPro = new boolean[] {false} ;
      P0AG72_A468FasPrePie = new short[1] ;
      P0AG72_n468FasPrePie = new boolean[] {false} ;
      P0AG72_A469FasPreSal = new short[1] ;
      P0AG72_n469FasPreSal = new boolean[] {false} ;
      P0AG72_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG72_n459FasDec = new boolean[] {false} ;
      P0AG72_A361DisCod = new int[1] ;
      P0AG72_A758ProCod = new String[] {""} ;
      P0AG72_A368DisFasLin = new short[1] ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV31Option = "" ;
      P0AG73_A396EmprCod = new String[] {""} ;
      P0AG73_A457FasCod = new String[] {""} ;
      P0AG73_A456FasActTin = new String[] {""} ;
      P0AG73_n456FasActTin = new boolean[] {false} ;
      P0AG73_A9841DisFasObs = new String[] {""} ;
      P0AG73_A4286FasForMul = new String[] {""} ;
      P0AG73_n4286FasForMul = new boolean[] {false} ;
      P0AG73_A4903FasAcab = new String[] {""} ;
      P0AG73_n4903FasAcab = new boolean[] {false} ;
      P0AG73_A458FasCon = new String[] {""} ;
      P0AG73_n458FasCon = new boolean[] {false} ;
      P0AG73_A464FasNumPas = new short[1] ;
      P0AG73_n464FasNumPas = new boolean[] {false} ;
      P0AG73_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG73_n472FasVelPro = new boolean[] {false} ;
      P0AG73_A468FasPrePie = new short[1] ;
      P0AG73_n468FasPrePie = new boolean[] {false} ;
      P0AG73_A469FasPreSal = new short[1] ;
      P0AG73_n469FasPreSal = new boolean[] {false} ;
      P0AG73_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG73_n459FasDec = new boolean[] {false} ;
      P0AG73_A602MaqCod = new String[] {""} ;
      P0AG73_n602MaqCod = new boolean[] {false} ;
      P0AG73_A361DisCod = new int[1] ;
      P0AG73_A758ProCod = new String[] {""} ;
      P0AG73_A368DisFasLin = new short[1] ;
      AV33OptionDesc = "" ;
      P0AG74_A396EmprCod = new String[] {""} ;
      P0AG74_A457FasCod = new String[] {""} ;
      P0AG74_A458FasCon = new String[] {""} ;
      P0AG74_n458FasCon = new boolean[] {false} ;
      P0AG74_A9841DisFasObs = new String[] {""} ;
      P0AG74_A4286FasForMul = new String[] {""} ;
      P0AG74_n4286FasForMul = new boolean[] {false} ;
      P0AG74_A4903FasAcab = new String[] {""} ;
      P0AG74_n4903FasAcab = new boolean[] {false} ;
      P0AG74_A456FasActTin = new String[] {""} ;
      P0AG74_n456FasActTin = new boolean[] {false} ;
      P0AG74_A464FasNumPas = new short[1] ;
      P0AG74_n464FasNumPas = new boolean[] {false} ;
      P0AG74_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG74_n472FasVelPro = new boolean[] {false} ;
      P0AG74_A468FasPrePie = new short[1] ;
      P0AG74_n468FasPrePie = new boolean[] {false} ;
      P0AG74_A469FasPreSal = new short[1] ;
      P0AG74_n469FasPreSal = new boolean[] {false} ;
      P0AG74_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG74_n459FasDec = new boolean[] {false} ;
      P0AG74_A602MaqCod = new String[] {""} ;
      P0AG74_n602MaqCod = new boolean[] {false} ;
      P0AG74_A361DisCod = new int[1] ;
      P0AG74_A758ProCod = new String[] {""} ;
      P0AG74_A368DisFasLin = new short[1] ;
      P0AG75_A396EmprCod = new String[] {""} ;
      P0AG75_A457FasCod = new String[] {""} ;
      P0AG75_A4903FasAcab = new String[] {""} ;
      P0AG75_n4903FasAcab = new boolean[] {false} ;
      P0AG75_A9841DisFasObs = new String[] {""} ;
      P0AG75_A4286FasForMul = new String[] {""} ;
      P0AG75_n4286FasForMul = new boolean[] {false} ;
      P0AG75_A458FasCon = new String[] {""} ;
      P0AG75_n458FasCon = new boolean[] {false} ;
      P0AG75_A456FasActTin = new String[] {""} ;
      P0AG75_n456FasActTin = new boolean[] {false} ;
      P0AG75_A464FasNumPas = new short[1] ;
      P0AG75_n464FasNumPas = new boolean[] {false} ;
      P0AG75_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG75_n472FasVelPro = new boolean[] {false} ;
      P0AG75_A468FasPrePie = new short[1] ;
      P0AG75_n468FasPrePie = new boolean[] {false} ;
      P0AG75_A469FasPreSal = new short[1] ;
      P0AG75_n469FasPreSal = new boolean[] {false} ;
      P0AG75_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG75_n459FasDec = new boolean[] {false} ;
      P0AG75_A602MaqCod = new String[] {""} ;
      P0AG75_n602MaqCod = new boolean[] {false} ;
      P0AG75_A361DisCod = new int[1] ;
      P0AG75_A758ProCod = new String[] {""} ;
      P0AG75_A368DisFasLin = new short[1] ;
      P0AG76_A396EmprCod = new String[] {""} ;
      P0AG76_A457FasCod = new String[] {""} ;
      P0AG76_A4286FasForMul = new String[] {""} ;
      P0AG76_n4286FasForMul = new boolean[] {false} ;
      P0AG76_A9841DisFasObs = new String[] {""} ;
      P0AG76_A4903FasAcab = new String[] {""} ;
      P0AG76_n4903FasAcab = new boolean[] {false} ;
      P0AG76_A458FasCon = new String[] {""} ;
      P0AG76_n458FasCon = new boolean[] {false} ;
      P0AG76_A456FasActTin = new String[] {""} ;
      P0AG76_n456FasActTin = new boolean[] {false} ;
      P0AG76_A464FasNumPas = new short[1] ;
      P0AG76_n464FasNumPas = new boolean[] {false} ;
      P0AG76_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG76_n472FasVelPro = new boolean[] {false} ;
      P0AG76_A468FasPrePie = new short[1] ;
      P0AG76_n468FasPrePie = new boolean[] {false} ;
      P0AG76_A469FasPreSal = new short[1] ;
      P0AG76_n469FasPreSal = new boolean[] {false} ;
      P0AG76_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG76_n459FasDec = new boolean[] {false} ;
      P0AG76_A602MaqCod = new String[] {""} ;
      P0AG76_n602MaqCod = new boolean[] {false} ;
      P0AG76_A361DisCod = new int[1] ;
      P0AG76_A758ProCod = new String[] {""} ;
      P0AG76_A368DisFasLin = new short[1] ;
      P0AG77_A396EmprCod = new String[] {""} ;
      P0AG77_A457FasCod = new String[] {""} ;
      P0AG77_A9841DisFasObs = new String[] {""} ;
      P0AG77_A4286FasForMul = new String[] {""} ;
      P0AG77_n4286FasForMul = new boolean[] {false} ;
      P0AG77_A4903FasAcab = new String[] {""} ;
      P0AG77_n4903FasAcab = new boolean[] {false} ;
      P0AG77_A458FasCon = new String[] {""} ;
      P0AG77_n458FasCon = new boolean[] {false} ;
      P0AG77_A456FasActTin = new String[] {""} ;
      P0AG77_n456FasActTin = new boolean[] {false} ;
      P0AG77_A464FasNumPas = new short[1] ;
      P0AG77_n464FasNumPas = new boolean[] {false} ;
      P0AG77_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG77_n472FasVelPro = new boolean[] {false} ;
      P0AG77_A468FasPrePie = new short[1] ;
      P0AG77_n468FasPrePie = new boolean[] {false} ;
      P0AG77_A469FasPreSal = new short[1] ;
      P0AG77_n469FasPreSal = new boolean[] {false} ;
      P0AG77_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG77_n459FasDec = new boolean[] {false} ;
      P0AG77_A602MaqCod = new String[] {""} ;
      P0AG77_n602MaqCod = new boolean[] {false} ;
      P0AG77_A361DisCod = new int[1] ;
      P0AG77_A758ProCod = new String[] {""} ;
      P0AG77_A368DisFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas___wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AG72_A396EmprCod, P0AG72_A457FasCod, P0AG72_A602MaqCod, P0AG72_n602MaqCod, P0AG72_A9841DisFasObs, P0AG72_A4286FasForMul, P0AG72_n4286FasForMul, P0AG72_A4903FasAcab, P0AG72_n4903FasAcab, P0AG72_A458FasCon,
            P0AG72_n458FasCon, P0AG72_A456FasActTin, P0AG72_n456FasActTin, P0AG72_A464FasNumPas, P0AG72_n464FasNumPas, P0AG72_A472FasVelPro, P0AG72_n472FasVelPro, P0AG72_A468FasPrePie, P0AG72_n468FasPrePie, P0AG72_A469FasPreSal,
            P0AG72_n469FasPreSal, P0AG72_A459FasDec, P0AG72_n459FasDec, P0AG72_A361DisCod, P0AG72_A758ProCod, P0AG72_A368DisFasLin
            }
            , new Object[] {
            P0AG73_A396EmprCod, P0AG73_A457FasCod, P0AG73_A456FasActTin, P0AG73_n456FasActTin, P0AG73_A9841DisFasObs, P0AG73_A4286FasForMul, P0AG73_n4286FasForMul, P0AG73_A4903FasAcab, P0AG73_n4903FasAcab, P0AG73_A458FasCon,
            P0AG73_n458FasCon, P0AG73_A464FasNumPas, P0AG73_n464FasNumPas, P0AG73_A472FasVelPro, P0AG73_n472FasVelPro, P0AG73_A468FasPrePie, P0AG73_n468FasPrePie, P0AG73_A469FasPreSal, P0AG73_n469FasPreSal, P0AG73_A459FasDec,
            P0AG73_n459FasDec, P0AG73_A602MaqCod, P0AG73_n602MaqCod, P0AG73_A361DisCod, P0AG73_A758ProCod, P0AG73_A368DisFasLin
            }
            , new Object[] {
            P0AG74_A396EmprCod, P0AG74_A457FasCod, P0AG74_A458FasCon, P0AG74_n458FasCon, P0AG74_A9841DisFasObs, P0AG74_A4286FasForMul, P0AG74_n4286FasForMul, P0AG74_A4903FasAcab, P0AG74_n4903FasAcab, P0AG74_A456FasActTin,
            P0AG74_n456FasActTin, P0AG74_A464FasNumPas, P0AG74_n464FasNumPas, P0AG74_A472FasVelPro, P0AG74_n472FasVelPro, P0AG74_A468FasPrePie, P0AG74_n468FasPrePie, P0AG74_A469FasPreSal, P0AG74_n469FasPreSal, P0AG74_A459FasDec,
            P0AG74_n459FasDec, P0AG74_A602MaqCod, P0AG74_n602MaqCod, P0AG74_A361DisCod, P0AG74_A758ProCod, P0AG74_A368DisFasLin
            }
            , new Object[] {
            P0AG75_A396EmprCod, P0AG75_A457FasCod, P0AG75_A4903FasAcab, P0AG75_n4903FasAcab, P0AG75_A9841DisFasObs, P0AG75_A4286FasForMul, P0AG75_n4286FasForMul, P0AG75_A458FasCon, P0AG75_n458FasCon, P0AG75_A456FasActTin,
            P0AG75_n456FasActTin, P0AG75_A464FasNumPas, P0AG75_n464FasNumPas, P0AG75_A472FasVelPro, P0AG75_n472FasVelPro, P0AG75_A468FasPrePie, P0AG75_n468FasPrePie, P0AG75_A469FasPreSal, P0AG75_n469FasPreSal, P0AG75_A459FasDec,
            P0AG75_n459FasDec, P0AG75_A602MaqCod, P0AG75_n602MaqCod, P0AG75_A361DisCod, P0AG75_A758ProCod, P0AG75_A368DisFasLin
            }
            , new Object[] {
            P0AG76_A396EmprCod, P0AG76_A457FasCod, P0AG76_A4286FasForMul, P0AG76_n4286FasForMul, P0AG76_A9841DisFasObs, P0AG76_A4903FasAcab, P0AG76_n4903FasAcab, P0AG76_A458FasCon, P0AG76_n458FasCon, P0AG76_A456FasActTin,
            P0AG76_n456FasActTin, P0AG76_A464FasNumPas, P0AG76_n464FasNumPas, P0AG76_A472FasVelPro, P0AG76_n472FasVelPro, P0AG76_A468FasPrePie, P0AG76_n468FasPrePie, P0AG76_A469FasPreSal, P0AG76_n469FasPreSal, P0AG76_A459FasDec,
            P0AG76_n459FasDec, P0AG76_A602MaqCod, P0AG76_n602MaqCod, P0AG76_A361DisCod, P0AG76_A758ProCod, P0AG76_A368DisFasLin
            }
            , new Object[] {
            P0AG77_A396EmprCod, P0AG77_A457FasCod, P0AG77_A9841DisFasObs, P0AG77_A4286FasForMul, P0AG77_n4286FasForMul, P0AG77_A4903FasAcab, P0AG77_n4903FasAcab, P0AG77_A458FasCon, P0AG77_n458FasCon, P0AG77_A456FasActTin,
            P0AG77_n456FasActTin, P0AG77_A464FasNumPas, P0AG77_n464FasNumPas, P0AG77_A472FasVelPro, P0AG77_n472FasVelPro, P0AG77_A468FasPrePie, P0AG77_n468FasPrePie, P0AG77_A469FasPreSal, P0AG77_n469FasPreSal, P0AG77_A459FasDec,
            P0AG77_n459FasDec, P0AG77_A602MaqCod, P0AG77_n602MaqCod, P0AG77_A361DisCod, P0AG77_A758ProCod, P0AG77_A368DisFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14TFFasPreSal ;
   private short AV15TFFasPreSal_To ;
   private short AV16TFFasPrePie ;
   private short AV17TFFasPrePie_To ;
   private short AV20TFFasNumPas ;
   private short AV21TFFasNumPas_To ;
   private short AV58Pedidos_disfas___wwds_5_tffaspresal ;
   private short AV59Pedidos_disfas___wwds_6_tffaspresal_to ;
   private short AV60Pedidos_disfas___wwds_7_tffasprepie ;
   private short AV61Pedidos_disfas___wwds_8_tffasprepie_to ;
   private short AV64Pedidos_disfas___wwds_11_tffasnumpas ;
   private short AV65Pedidos_disfas___wwds_12_tffasnumpas_to ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int A361DisCod ;
   private long AV36count ;
   private java.math.BigDecimal AV12TFFasDec ;
   private java.math.BigDecimal AV13TFFasDec_To ;
   private java.math.BigDecimal AV18TFFasVelPro ;
   private java.math.BigDecimal AV19TFFasVelPro_To ;
   private java.math.BigDecimal AV56Pedidos_disfas___wwds_3_tffasdec ;
   private java.math.BigDecimal AV57Pedidos_disfas___wwds_4_tffasdec_to ;
   private java.math.BigDecimal AV62Pedidos_disfas___wwds_9_tffasvelpro ;
   private java.math.BigDecimal AV63Pedidos_disfas___wwds_10_tffasvelpro_to ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV22TFFasActTin ;
   private String AV23TFFasActTin_Sel ;
   private String AV24TFFasCon ;
   private String AV25TFFasCon_Sel ;
   private String AV26TFFasAcab ;
   private String AV27TFFasAcab_Sel ;
   private String AV28TFFasForMul ;
   private String AV29TFFasForMul_Sel ;
   private String A602MaqCod ;
   private String AV54Pedidos_disfas___wwds_1_tfmaqcod ;
   private String AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ;
   private String AV66Pedidos_disfas___wwds_13_tffasacttin ;
   private String AV67Pedidos_disfas___wwds_14_tffasacttin_sel ;
   private String AV68Pedidos_disfas___wwds_15_tffascon ;
   private String AV69Pedidos_disfas___wwds_16_tffascon_sel ;
   private String AV70Pedidos_disfas___wwds_17_tffasacab ;
   private String AV71Pedidos_disfas___wwds_18_tffasacab_sel ;
   private String AV72Pedidos_disfas___wwds_19_tffasformul ;
   private String AV73Pedidos_disfas___wwds_20_tffasformul_sel ;
   private String scmdbuf ;
   private String lV54Pedidos_disfas___wwds_1_tfmaqcod ;
   private String lV66Pedidos_disfas___wwds_13_tffasacttin ;
   private String lV68Pedidos_disfas___wwds_15_tffascon ;
   private String lV70Pedidos_disfas___wwds_17_tffasacab ;
   private String lV72Pedidos_disfas___wwds_19_tffasformul ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private boolean returnInSub ;
   private boolean brkAG72 ;
   private boolean n602MaqCod ;
   private boolean n4286FasForMul ;
   private boolean n4903FasAcab ;
   private boolean n458FasCon ;
   private boolean n456FasActTin ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n459FasDec ;
   private boolean brkAG74 ;
   private boolean brkAG76 ;
   private boolean brkAG78 ;
   private boolean brkAG710 ;
   private boolean brkAG712 ;
   private String AV45OptionsJson ;
   private String AV46OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV43SearchTxt ;
   private String AV44SearchTxtTo ;
   private String AV48TFDisFasObs ;
   private String AV49TFDisFasObs_Sel ;
   private String AV74Pedidos_disfas___wwds_21_tfdisfasobs ;
   private String AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ;
   private String lV74Pedidos_disfas___wwds_21_tfdisfasobs ;
   private String A9841DisFasObs ;
   private String AV31Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AG72_A396EmprCod ;
   private String[] P0AG72_A457FasCod ;
   private String[] P0AG72_A602MaqCod ;
   private boolean[] P0AG72_n602MaqCod ;
   private String[] P0AG72_A9841DisFasObs ;
   private String[] P0AG72_A4286FasForMul ;
   private boolean[] P0AG72_n4286FasForMul ;
   private String[] P0AG72_A4903FasAcab ;
   private boolean[] P0AG72_n4903FasAcab ;
   private String[] P0AG72_A458FasCon ;
   private boolean[] P0AG72_n458FasCon ;
   private String[] P0AG72_A456FasActTin ;
   private boolean[] P0AG72_n456FasActTin ;
   private short[] P0AG72_A464FasNumPas ;
   private boolean[] P0AG72_n464FasNumPas ;
   private java.math.BigDecimal[] P0AG72_A472FasVelPro ;
   private boolean[] P0AG72_n472FasVelPro ;
   private short[] P0AG72_A468FasPrePie ;
   private boolean[] P0AG72_n468FasPrePie ;
   private short[] P0AG72_A469FasPreSal ;
   private boolean[] P0AG72_n469FasPreSal ;
   private java.math.BigDecimal[] P0AG72_A459FasDec ;
   private boolean[] P0AG72_n459FasDec ;
   private int[] P0AG72_A361DisCod ;
   private String[] P0AG72_A758ProCod ;
   private short[] P0AG72_A368DisFasLin ;
   private String[] P0AG73_A396EmprCod ;
   private String[] P0AG73_A457FasCod ;
   private String[] P0AG73_A456FasActTin ;
   private boolean[] P0AG73_n456FasActTin ;
   private String[] P0AG73_A9841DisFasObs ;
   private String[] P0AG73_A4286FasForMul ;
   private boolean[] P0AG73_n4286FasForMul ;
   private String[] P0AG73_A4903FasAcab ;
   private boolean[] P0AG73_n4903FasAcab ;
   private String[] P0AG73_A458FasCon ;
   private boolean[] P0AG73_n458FasCon ;
   private short[] P0AG73_A464FasNumPas ;
   private boolean[] P0AG73_n464FasNumPas ;
   private java.math.BigDecimal[] P0AG73_A472FasVelPro ;
   private boolean[] P0AG73_n472FasVelPro ;
   private short[] P0AG73_A468FasPrePie ;
   private boolean[] P0AG73_n468FasPrePie ;
   private short[] P0AG73_A469FasPreSal ;
   private boolean[] P0AG73_n469FasPreSal ;
   private java.math.BigDecimal[] P0AG73_A459FasDec ;
   private boolean[] P0AG73_n459FasDec ;
   private String[] P0AG73_A602MaqCod ;
   private boolean[] P0AG73_n602MaqCod ;
   private int[] P0AG73_A361DisCod ;
   private String[] P0AG73_A758ProCod ;
   private short[] P0AG73_A368DisFasLin ;
   private String[] P0AG74_A396EmprCod ;
   private String[] P0AG74_A457FasCod ;
   private String[] P0AG74_A458FasCon ;
   private boolean[] P0AG74_n458FasCon ;
   private String[] P0AG74_A9841DisFasObs ;
   private String[] P0AG74_A4286FasForMul ;
   private boolean[] P0AG74_n4286FasForMul ;
   private String[] P0AG74_A4903FasAcab ;
   private boolean[] P0AG74_n4903FasAcab ;
   private String[] P0AG74_A456FasActTin ;
   private boolean[] P0AG74_n456FasActTin ;
   private short[] P0AG74_A464FasNumPas ;
   private boolean[] P0AG74_n464FasNumPas ;
   private java.math.BigDecimal[] P0AG74_A472FasVelPro ;
   private boolean[] P0AG74_n472FasVelPro ;
   private short[] P0AG74_A468FasPrePie ;
   private boolean[] P0AG74_n468FasPrePie ;
   private short[] P0AG74_A469FasPreSal ;
   private boolean[] P0AG74_n469FasPreSal ;
   private java.math.BigDecimal[] P0AG74_A459FasDec ;
   private boolean[] P0AG74_n459FasDec ;
   private String[] P0AG74_A602MaqCod ;
   private boolean[] P0AG74_n602MaqCod ;
   private int[] P0AG74_A361DisCod ;
   private String[] P0AG74_A758ProCod ;
   private short[] P0AG74_A368DisFasLin ;
   private String[] P0AG75_A396EmprCod ;
   private String[] P0AG75_A457FasCod ;
   private String[] P0AG75_A4903FasAcab ;
   private boolean[] P0AG75_n4903FasAcab ;
   private String[] P0AG75_A9841DisFasObs ;
   private String[] P0AG75_A4286FasForMul ;
   private boolean[] P0AG75_n4286FasForMul ;
   private String[] P0AG75_A458FasCon ;
   private boolean[] P0AG75_n458FasCon ;
   private String[] P0AG75_A456FasActTin ;
   private boolean[] P0AG75_n456FasActTin ;
   private short[] P0AG75_A464FasNumPas ;
   private boolean[] P0AG75_n464FasNumPas ;
   private java.math.BigDecimal[] P0AG75_A472FasVelPro ;
   private boolean[] P0AG75_n472FasVelPro ;
   private short[] P0AG75_A468FasPrePie ;
   private boolean[] P0AG75_n468FasPrePie ;
   private short[] P0AG75_A469FasPreSal ;
   private boolean[] P0AG75_n469FasPreSal ;
   private java.math.BigDecimal[] P0AG75_A459FasDec ;
   private boolean[] P0AG75_n459FasDec ;
   private String[] P0AG75_A602MaqCod ;
   private boolean[] P0AG75_n602MaqCod ;
   private int[] P0AG75_A361DisCod ;
   private String[] P0AG75_A758ProCod ;
   private short[] P0AG75_A368DisFasLin ;
   private String[] P0AG76_A396EmprCod ;
   private String[] P0AG76_A457FasCod ;
   private String[] P0AG76_A4286FasForMul ;
   private boolean[] P0AG76_n4286FasForMul ;
   private String[] P0AG76_A9841DisFasObs ;
   private String[] P0AG76_A4903FasAcab ;
   private boolean[] P0AG76_n4903FasAcab ;
   private String[] P0AG76_A458FasCon ;
   private boolean[] P0AG76_n458FasCon ;
   private String[] P0AG76_A456FasActTin ;
   private boolean[] P0AG76_n456FasActTin ;
   private short[] P0AG76_A464FasNumPas ;
   private boolean[] P0AG76_n464FasNumPas ;
   private java.math.BigDecimal[] P0AG76_A472FasVelPro ;
   private boolean[] P0AG76_n472FasVelPro ;
   private short[] P0AG76_A468FasPrePie ;
   private boolean[] P0AG76_n468FasPrePie ;
   private short[] P0AG76_A469FasPreSal ;
   private boolean[] P0AG76_n469FasPreSal ;
   private java.math.BigDecimal[] P0AG76_A459FasDec ;
   private boolean[] P0AG76_n459FasDec ;
   private String[] P0AG76_A602MaqCod ;
   private boolean[] P0AG76_n602MaqCod ;
   private int[] P0AG76_A361DisCod ;
   private String[] P0AG76_A758ProCod ;
   private short[] P0AG76_A368DisFasLin ;
   private String[] P0AG77_A396EmprCod ;
   private String[] P0AG77_A457FasCod ;
   private String[] P0AG77_A9841DisFasObs ;
   private String[] P0AG77_A4286FasForMul ;
   private boolean[] P0AG77_n4286FasForMul ;
   private String[] P0AG77_A4903FasAcab ;
   private boolean[] P0AG77_n4903FasAcab ;
   private String[] P0AG77_A458FasCon ;
   private boolean[] P0AG77_n458FasCon ;
   private String[] P0AG77_A456FasActTin ;
   private boolean[] P0AG77_n456FasActTin ;
   private short[] P0AG77_A464FasNumPas ;
   private boolean[] P0AG77_n464FasNumPas ;
   private java.math.BigDecimal[] P0AG77_A472FasVelPro ;
   private boolean[] P0AG77_n472FasVelPro ;
   private short[] P0AG77_A468FasPrePie ;
   private boolean[] P0AG77_n468FasPrePie ;
   private short[] P0AG77_A469FasPreSal ;
   private boolean[] P0AG77_n469FasPreSal ;
   private java.math.BigDecimal[] P0AG77_A459FasDec ;
   private boolean[] P0AG77_n459FasDec ;
   private String[] P0AG77_A602MaqCod ;
   private boolean[] P0AG77_n602MaqCod ;
   private int[] P0AG77_A361DisCod ;
   private String[] P0AG77_A758ProCod ;
   private short[] P0AG77_A368DisFasLin ;
   private GXSimpleCollection<String> AV32Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV35OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class disfas___wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AG72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV56Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV58Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV59Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV60Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV61Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV64Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV65Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV68Pedidos_disfas___wwds_15_tffascon ,
                                          String AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV70Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV72Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                          String A9841DisFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.MaqCod, T1.DisFasObs, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal," ;
      scmdbuf += " T2.FasDec, T1.DisCod, T1.ProCod, T1.DisFasLin FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AG73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV56Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV58Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV59Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV60Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV61Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV64Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV65Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV68Pedidos_disfas___wwds_15_tffascon ,
                                          String AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV70Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV72Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                          String A9841DisFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.FasActTin, T1.DisFasObs, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T1.DisCod, T1.ProCod, T1.DisFasLin FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasActTin" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AG74( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV56Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV58Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV59Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV60Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV61Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV64Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV65Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV68Pedidos_disfas___wwds_15_tffascon ,
                                          String AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV70Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV72Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                          String A9841DisFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.FasCon, T1.DisFasObs, T2.FasForMul, T2.FasAcab, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T1.DisCod, T1.ProCod, T1.DisFasLin FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasCon" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AG75( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV56Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV58Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV59Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV60Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV61Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV64Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV65Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV68Pedidos_disfas___wwds_15_tffascon ,
                                          String AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV70Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV72Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                          String A9841DisFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.FasAcab, T1.DisFasObs, T2.FasForMul, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T1.DisCod, T1.ProCod, T1.DisFasLin FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasAcab" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AG76( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV56Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV58Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV59Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV60Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV61Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV64Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV65Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV68Pedidos_disfas___wwds_15_tffascon ,
                                          String AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV70Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV72Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                          String A9841DisFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[22];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.FasForMul, T1.DisFasObs, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T1.DisCod, T1.ProCod, T1.DisFasLin FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasForMul" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AG77( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV54Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV56Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV57Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV58Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV59Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV60Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV61Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV62Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV63Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV64Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV65Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV67Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV66Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV69Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV68Pedidos_disfas___wwds_15_tffascon ,
                                          String AV71Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV70Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV73Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV72Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV74Pedidos_disfas___wwds_21_tfdisfasobs ,
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
                                          String A9841DisFasObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[22];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.DisFasObs, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec," ;
      scmdbuf += " T2.MaqCod, T1.DisCod, T1.ProCod, T1.DisFasLin FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisFasObs" ;
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
                  return conditional_P0AG72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P0AG73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_P0AG74(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 3 :
                  return conditional_P0AG75(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 4 :
                  return conditional_P0AG76(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 5 :
                  return conditional_P0AG77(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AG72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG74", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG75", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG76", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG77", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
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
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 8);
               ((short[]) buf[25])[0] = rslt.getShort(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 8);
               ((short[]) buf[25])[0] = rslt.getShort(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 8);
               ((short[]) buf[25])[0] = rslt.getShort(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 8);
               ((short[]) buf[25])[0] = rslt.getShort(16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 8);
               ((short[]) buf[25])[0] = rslt.getShort(16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 8);
               ((short[]) buf[25])[0] = rslt.getShort(16);
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
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 3000);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 3000);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 3000);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 3000);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 3000);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 3000);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 3000);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 3000);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 3000);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 3000);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 3000);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 3000);
               }
               return;
      }
   }

}

