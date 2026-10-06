package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail_wkpgetfilterdata extends GXProcedure
{
   public trabajoexterno_detail_wkpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail_wkpgetfilterdata.class ), "" );
   }

   public trabajoexterno_detail_wkpgetfilterdata( int remoteHandle ,
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
      trabajoexterno_detail_wkpgetfilterdata.this.aP5 = new String[] {""};
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
      trabajoexterno_detail_wkpgetfilterdata.this.AV50DDOName = aP0;
      trabajoexterno_detail_wkpgetfilterdata.this.AV51SearchTxt = aP1;
      trabajoexterno_detail_wkpgetfilterdata.this.AV52SearchTxtTo = aP2;
      trabajoexterno_detail_wkpgetfilterdata.this.aP3 = aP3;
      trabajoexterno_detail_wkpgetfilterdata.this.aP4 = aP4;
      trabajoexterno_detail_wkpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASCODN") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODNOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_SALEXOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADSALEXOBSOPTIONS' */
         S171 ();
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
      if ( GXutil.strcmp(AV45Session.getValue("TrabajosExternos.TrabajoExterno_Detail_WKPGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternos.TrabajoExterno_Detail_WKPGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("TrabajosExternos.TrabajoExterno_Detail_WKPGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXNLN") == 0 )
         {
            AV10TFSalExNln = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFSalExNln_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV12TFBarCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV14TFBarCodReo = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFBarCodReo_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV16TFBarCodPar = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV17TFBarCodPar_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV20TFBarSer = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV21TFBarSer_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV22TFBarColNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV23TFBarColNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV24TFBarNomCli = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV25TFBarNomCli_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN") == 0 )
         {
            AV26TFFasCodn = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN_SEL") == 0 )
         {
            AV27TFFasCodn_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFORDLIN") == 0 )
         {
            AV28TFOrdLin = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFOrdLin_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXCOE") == 0 )
         {
            AV30TFSalExCoE = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFSalExCoE_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXKGE") == 0 )
         {
            AV32TFSalExKgE = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFSalExKgE_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXMTE") == 0 )
         {
            AV34TFSalExMtE = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFSalExMtE_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS") == 0 )
         {
            AV36TFSalExObs = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS_SEL") == 0 )
         {
            AV37TFSalExObs_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarCodPar = AV51SearchTxt ;
      AV17TFBarCodPar_Sel = "" ;
      AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV10TFSalExNln ;
      AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV12TFBarCod ;
      AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV18TFCliCod ;
      AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV19TFCliCod_To ;
      AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV20TFBarSer ;
      AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV22TFBarColNom ;
      AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV26TFFasCodn ;
      AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV28TFOrdLin ;
      AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV32TFSalExKgE ;
      AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV34TFSalExMtE ;
      AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV36TFSalExObs ;
      AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                           Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                           Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                           AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                           AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                           Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                           Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                           AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                           AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                           AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                           AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                           AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                           AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                           AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                           AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                           Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                           Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                           Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                           AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                           AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                           AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                           AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                           AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                           AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV57Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV58SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
      lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
      lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
      lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
      lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
      lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
      /* Using cursor P0ABK2 */
      pr_default.execute(0, new Object[] {AV57Emprcod, Integer.valueOf(AV58SalExtAlb), Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkABK2 = false ;
         A396EmprCod = P0ABK2_A396EmprCod[0] ;
         A2253SalExtAlb = P0ABK2_A2253SalExtAlb[0] ;
         A130BarCodPar = P0ABK2_A130BarCodPar[0] ;
         A6249SalExObs = P0ABK2_A6249SalExObs[0] ;
         A6258SalExMtE = P0ABK2_A6258SalExMtE[0] ;
         A6256SalExKgE = P0ABK2_A6256SalExKgE[0] ;
         A6257SalExCoE = P0ABK2_A6257SalExCoE[0] ;
         A654OrdLin = P0ABK2_A654OrdLin[0] ;
         A6558FasCodn = P0ABK2_A6558FasCodn[0] ;
         A1234BarNomCli = P0ABK2_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK2_A135BarColNom[0] ;
         A212BarSer = P0ABK2_A212BarSer[0] ;
         A252CliCod = P0ABK2_A252CliCod[0] ;
         n252CliCod = P0ABK2_n252CliCod[0] ;
         A132BarCodReo = P0ABK2_A132BarCodReo[0] ;
         A129BarCod = P0ABK2_A129BarCod[0] ;
         A6248SalExNln = P0ABK2_A6248SalExNln[0] ;
         A1234BarNomCli = P0ABK2_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK2_A135BarColNom[0] ;
         A212BarSer = P0ABK2_A212BarSer[0] ;
         A252CliCod = P0ABK2_A252CliCod[0] ;
         n252CliCod = P0ABK2_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ABK2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brkABK2 = false ;
            A396EmprCod = P0ABK2_A396EmprCod[0] ;
            A2253SalExtAlb = P0ABK2_A2253SalExtAlb[0] ;
            A6248SalExNln = P0ABK2_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkABK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
         {
            AV39Option = A130BarCodPar ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABK2 )
         {
            brkABK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarSer = AV51SearchTxt ;
      AV21TFBarSer_Sel = "" ;
      AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV10TFSalExNln ;
      AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV12TFBarCod ;
      AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV18TFCliCod ;
      AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV19TFCliCod_To ;
      AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV20TFBarSer ;
      AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV22TFBarColNom ;
      AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV26TFFasCodn ;
      AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV28TFOrdLin ;
      AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV32TFSalExKgE ;
      AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV34TFSalExMtE ;
      AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV36TFSalExObs ;
      AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                           Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                           Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                           AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                           AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                           Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                           Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                           AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                           AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                           AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                           AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                           AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                           AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                           AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                           AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                           Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                           Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                           Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                           AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                           AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                           AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                           AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                           AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                           AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV57Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV58SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
      lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
      lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
      lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
      lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
      lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
      /* Using cursor P0ABK3 */
      pr_default.execute(1, new Object[] {AV57Emprcod, Integer.valueOf(AV58SalExtAlb), Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkABK4 = false ;
         A396EmprCod = P0ABK3_A396EmprCod[0] ;
         A2253SalExtAlb = P0ABK3_A2253SalExtAlb[0] ;
         A212BarSer = P0ABK3_A212BarSer[0] ;
         A6249SalExObs = P0ABK3_A6249SalExObs[0] ;
         A6258SalExMtE = P0ABK3_A6258SalExMtE[0] ;
         A6256SalExKgE = P0ABK3_A6256SalExKgE[0] ;
         A6257SalExCoE = P0ABK3_A6257SalExCoE[0] ;
         A654OrdLin = P0ABK3_A654OrdLin[0] ;
         A6558FasCodn = P0ABK3_A6558FasCodn[0] ;
         A1234BarNomCli = P0ABK3_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK3_A135BarColNom[0] ;
         A252CliCod = P0ABK3_A252CliCod[0] ;
         n252CliCod = P0ABK3_n252CliCod[0] ;
         A130BarCodPar = P0ABK3_A130BarCodPar[0] ;
         A132BarCodReo = P0ABK3_A132BarCodReo[0] ;
         A129BarCod = P0ABK3_A129BarCod[0] ;
         A6248SalExNln = P0ABK3_A6248SalExNln[0] ;
         A212BarSer = P0ABK3_A212BarSer[0] ;
         A1234BarNomCli = P0ABK3_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK3_A135BarColNom[0] ;
         A252CliCod = P0ABK3_A252CliCod[0] ;
         n252CliCod = P0ABK3_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ABK3_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brkABK4 = false ;
            A396EmprCod = P0ABK3_A396EmprCod[0] ;
            A2253SalExtAlb = P0ABK3_A2253SalExtAlb[0] ;
            A130BarCodPar = P0ABK3_A130BarCodPar[0] ;
            A132BarCodReo = P0ABK3_A132BarCodReo[0] ;
            A129BarCod = P0ABK3_A129BarCod[0] ;
            A6248SalExNln = P0ABK3_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkABK4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV39Option = A212BarSer ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABK4 )
         {
            brkABK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarColNom = AV51SearchTxt ;
      AV23TFBarColNom_Sel = "" ;
      AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV10TFSalExNln ;
      AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV12TFBarCod ;
      AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV18TFCliCod ;
      AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV19TFCliCod_To ;
      AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV20TFBarSer ;
      AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV22TFBarColNom ;
      AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV26TFFasCodn ;
      AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV28TFOrdLin ;
      AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV32TFSalExKgE ;
      AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV34TFSalExMtE ;
      AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV36TFSalExObs ;
      AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                           Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                           Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                           AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                           AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                           Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                           Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                           AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                           AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                           AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                           AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                           AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                           AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                           AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                           AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                           Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                           Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                           Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                           AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                           AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                           AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                           AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                           AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                           AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV57Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV58SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
      lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
      lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
      lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
      lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
      lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
      /* Using cursor P0ABK4 */
      pr_default.execute(2, new Object[] {AV57Emprcod, Integer.valueOf(AV58SalExtAlb), Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkABK6 = false ;
         A396EmprCod = P0ABK4_A396EmprCod[0] ;
         A2253SalExtAlb = P0ABK4_A2253SalExtAlb[0] ;
         A135BarColNom = P0ABK4_A135BarColNom[0] ;
         A6249SalExObs = P0ABK4_A6249SalExObs[0] ;
         A6258SalExMtE = P0ABK4_A6258SalExMtE[0] ;
         A6256SalExKgE = P0ABK4_A6256SalExKgE[0] ;
         A6257SalExCoE = P0ABK4_A6257SalExCoE[0] ;
         A654OrdLin = P0ABK4_A654OrdLin[0] ;
         A6558FasCodn = P0ABK4_A6558FasCodn[0] ;
         A1234BarNomCli = P0ABK4_A1234BarNomCli[0] ;
         A212BarSer = P0ABK4_A212BarSer[0] ;
         A252CliCod = P0ABK4_A252CliCod[0] ;
         n252CliCod = P0ABK4_n252CliCod[0] ;
         A130BarCodPar = P0ABK4_A130BarCodPar[0] ;
         A132BarCodReo = P0ABK4_A132BarCodReo[0] ;
         A129BarCod = P0ABK4_A129BarCod[0] ;
         A6248SalExNln = P0ABK4_A6248SalExNln[0] ;
         A135BarColNom = P0ABK4_A135BarColNom[0] ;
         A1234BarNomCli = P0ABK4_A1234BarNomCli[0] ;
         A212BarSer = P0ABK4_A212BarSer[0] ;
         A252CliCod = P0ABK4_A252CliCod[0] ;
         n252CliCod = P0ABK4_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ABK4_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brkABK6 = false ;
            A396EmprCod = P0ABK4_A396EmprCod[0] ;
            A2253SalExtAlb = P0ABK4_A2253SalExtAlb[0] ;
            A130BarCodPar = P0ABK4_A130BarCodPar[0] ;
            A132BarCodReo = P0ABK4_A132BarCodReo[0] ;
            A129BarCod = P0ABK4_A129BarCod[0] ;
            A6248SalExNln = P0ABK4_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkABK6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV39Option = A135BarColNom ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABK6 )
         {
            brkABK6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarNomCli = AV51SearchTxt ;
      AV25TFBarNomCli_Sel = "" ;
      AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV10TFSalExNln ;
      AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV12TFBarCod ;
      AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV18TFCliCod ;
      AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV19TFCliCod_To ;
      AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV20TFBarSer ;
      AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV22TFBarColNom ;
      AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV26TFFasCodn ;
      AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV28TFOrdLin ;
      AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV32TFSalExKgE ;
      AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV34TFSalExMtE ;
      AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV36TFSalExObs ;
      AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                           Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                           Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                           AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                           AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                           Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                           Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                           AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                           AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                           AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                           AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                           AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                           AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                           AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                           AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                           Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                           Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                           Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                           AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                           AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                           AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                           AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                           AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                           AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV57Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV58SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
      lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
      lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
      lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
      lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
      lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
      /* Using cursor P0ABK5 */
      pr_default.execute(3, new Object[] {AV57Emprcod, Integer.valueOf(AV58SalExtAlb), Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkABK8 = false ;
         A396EmprCod = P0ABK5_A396EmprCod[0] ;
         A2253SalExtAlb = P0ABK5_A2253SalExtAlb[0] ;
         A1234BarNomCli = P0ABK5_A1234BarNomCli[0] ;
         A6249SalExObs = P0ABK5_A6249SalExObs[0] ;
         A6258SalExMtE = P0ABK5_A6258SalExMtE[0] ;
         A6256SalExKgE = P0ABK5_A6256SalExKgE[0] ;
         A6257SalExCoE = P0ABK5_A6257SalExCoE[0] ;
         A654OrdLin = P0ABK5_A654OrdLin[0] ;
         A6558FasCodn = P0ABK5_A6558FasCodn[0] ;
         A135BarColNom = P0ABK5_A135BarColNom[0] ;
         A212BarSer = P0ABK5_A212BarSer[0] ;
         A252CliCod = P0ABK5_A252CliCod[0] ;
         n252CliCod = P0ABK5_n252CliCod[0] ;
         A130BarCodPar = P0ABK5_A130BarCodPar[0] ;
         A132BarCodReo = P0ABK5_A132BarCodReo[0] ;
         A129BarCod = P0ABK5_A129BarCod[0] ;
         A6248SalExNln = P0ABK5_A6248SalExNln[0] ;
         A1234BarNomCli = P0ABK5_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK5_A135BarColNom[0] ;
         A212BarSer = P0ABK5_A212BarSer[0] ;
         A252CliCod = P0ABK5_A252CliCod[0] ;
         n252CliCod = P0ABK5_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0ABK5_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brkABK8 = false ;
            A396EmprCod = P0ABK5_A396EmprCod[0] ;
            A2253SalExtAlb = P0ABK5_A2253SalExtAlb[0] ;
            A130BarCodPar = P0ABK5_A130BarCodPar[0] ;
            A132BarCodReo = P0ABK5_A132BarCodReo[0] ;
            A129BarCod = P0ABK5_A129BarCod[0] ;
            A6248SalExNln = P0ABK5_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkABK8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV39Option = A1234BarNomCli ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABK8 )
         {
            brkABK8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFASCODNOPTIONS' Routine */
      returnInSub = false ;
      AV26TFFasCodn = AV51SearchTxt ;
      AV27TFFasCodn_Sel = "" ;
      AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV10TFSalExNln ;
      AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV12TFBarCod ;
      AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV18TFCliCod ;
      AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV19TFCliCod_To ;
      AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV20TFBarSer ;
      AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV22TFBarColNom ;
      AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV26TFFasCodn ;
      AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV28TFOrdLin ;
      AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV32TFSalExKgE ;
      AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV34TFSalExMtE ;
      AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV36TFSalExObs ;
      AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                           Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                           Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                           AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                           AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                           Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                           Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                           AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                           AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                           AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                           AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                           AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                           AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                           AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                           AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                           Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                           Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                           Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                           AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                           AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                           AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                           AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                           AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                           AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV58SalExtAlb) ,
                                           AV57Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
      lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
      lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
      lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
      lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
      lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
      /* Using cursor P0ABK6 */
      pr_default.execute(4, new Object[] {AV57Emprcod, Integer.valueOf(AV58SalExtAlb), Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkABK10 = false ;
         A396EmprCod = P0ABK6_A396EmprCod[0] ;
         A6558FasCodn = P0ABK6_A6558FasCodn[0] ;
         A2253SalExtAlb = P0ABK6_A2253SalExtAlb[0] ;
         A6249SalExObs = P0ABK6_A6249SalExObs[0] ;
         A6258SalExMtE = P0ABK6_A6258SalExMtE[0] ;
         A6256SalExKgE = P0ABK6_A6256SalExKgE[0] ;
         A6257SalExCoE = P0ABK6_A6257SalExCoE[0] ;
         A654OrdLin = P0ABK6_A654OrdLin[0] ;
         A1234BarNomCli = P0ABK6_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK6_A135BarColNom[0] ;
         A212BarSer = P0ABK6_A212BarSer[0] ;
         A252CliCod = P0ABK6_A252CliCod[0] ;
         n252CliCod = P0ABK6_n252CliCod[0] ;
         A130BarCodPar = P0ABK6_A130BarCodPar[0] ;
         A132BarCodReo = P0ABK6_A132BarCodReo[0] ;
         A129BarCod = P0ABK6_A129BarCod[0] ;
         A6248SalExNln = P0ABK6_A6248SalExNln[0] ;
         A1234BarNomCli = P0ABK6_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK6_A135BarColNom[0] ;
         A212BarSer = P0ABK6_A212BarSer[0] ;
         A252CliCod = P0ABK6_A252CliCod[0] ;
         n252CliCod = P0ABK6_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0ABK6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ABK6_A6558FasCodn[0], A6558FasCodn) == 0 ) )
         {
            brkABK10 = false ;
            A2253SalExtAlb = P0ABK6_A2253SalExtAlb[0] ;
            A6248SalExNln = P0ABK6_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkABK10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A6558FasCodn)==0) )
         {
            AV39Option = A6558FasCodn ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABK10 )
         {
            brkABK10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADSALEXOBSOPTIONS' Routine */
      returnInSub = false ;
      AV36TFSalExObs = AV51SearchTxt ;
      AV37TFSalExObs_Sel = "" ;
      AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV10TFSalExNln ;
      AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV12TFBarCod ;
      AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV18TFCliCod ;
      AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV19TFCliCod_To ;
      AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV20TFBarSer ;
      AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV22TFBarColNom ;
      AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV26TFFasCodn ;
      AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV28TFOrdLin ;
      AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV32TFSalExKgE ;
      AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV34TFSalExMtE ;
      AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV36TFSalExObs ;
      AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                           Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                           Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                           AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                           AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                           Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                           Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                           AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                           AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                           AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                           AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                           AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                           AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                           AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                           AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                           Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                           Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                           Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                           AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                           AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                           AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                           AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                           AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                           AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV57Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV58SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
      lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
      lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
      lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
      lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
      lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
      /* Using cursor P0ABK7 */
      pr_default.execute(5, new Object[] {AV57Emprcod, Integer.valueOf(AV58SalExtAlb), Short.valueOf(AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkABK12 = false ;
         A396EmprCod = P0ABK7_A396EmprCod[0] ;
         A2253SalExtAlb = P0ABK7_A2253SalExtAlb[0] ;
         A6249SalExObs = P0ABK7_A6249SalExObs[0] ;
         A6258SalExMtE = P0ABK7_A6258SalExMtE[0] ;
         A6256SalExKgE = P0ABK7_A6256SalExKgE[0] ;
         A6257SalExCoE = P0ABK7_A6257SalExCoE[0] ;
         A654OrdLin = P0ABK7_A654OrdLin[0] ;
         A6558FasCodn = P0ABK7_A6558FasCodn[0] ;
         A1234BarNomCli = P0ABK7_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK7_A135BarColNom[0] ;
         A212BarSer = P0ABK7_A212BarSer[0] ;
         A252CliCod = P0ABK7_A252CliCod[0] ;
         n252CliCod = P0ABK7_n252CliCod[0] ;
         A130BarCodPar = P0ABK7_A130BarCodPar[0] ;
         A132BarCodReo = P0ABK7_A132BarCodReo[0] ;
         A129BarCod = P0ABK7_A129BarCod[0] ;
         A6248SalExNln = P0ABK7_A6248SalExNln[0] ;
         A1234BarNomCli = P0ABK7_A1234BarNomCli[0] ;
         A135BarColNom = P0ABK7_A135BarColNom[0] ;
         A212BarSer = P0ABK7_A212BarSer[0] ;
         A252CliCod = P0ABK7_A252CliCod[0] ;
         n252CliCod = P0ABK7_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0ABK7_A6249SalExObs[0], A6249SalExObs) == 0 ) )
         {
            brkABK12 = false ;
            A396EmprCod = P0ABK7_A396EmprCod[0] ;
            A2253SalExtAlb = P0ABK7_A2253SalExtAlb[0] ;
            A6248SalExNln = P0ABK7_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkABK12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A6249SalExObs)==0) )
         {
            AV39Option = A6249SalExObs ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABK12 )
         {
            brkABK12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = trabajoexterno_detail_wkpgetfilterdata.this.AV53OptionsJson;
      this.aP4[0] = trabajoexterno_detail_wkpgetfilterdata.this.AV54OptionsDescJson;
      this.aP5[0] = trabajoexterno_detail_wkpgetfilterdata.this.AV55OptionIndexesJson;
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
      AV16TFBarCodPar = "" ;
      AV17TFBarCodPar_Sel = "" ;
      AV20TFBarSer = "" ;
      AV21TFBarSer_Sel = "" ;
      AV22TFBarColNom = "" ;
      AV23TFBarColNom_Sel = "" ;
      AV24TFBarNomCli = "" ;
      AV25TFBarNomCli_Sel = "" ;
      AV26TFFasCodn = "" ;
      AV27TFFasCodn_Sel = "" ;
      AV32TFSalExKgE = DecimalUtil.ZERO ;
      AV33TFSalExKgE_To = DecimalUtil.ZERO ;
      AV34TFSalExMtE = DecimalUtil.ZERO ;
      AV35TFSalExMtE_To = DecimalUtil.ZERO ;
      AV36TFSalExObs = "" ;
      AV37TFSalExObs_Sel = "" ;
      A130BarCodPar = "" ;
      AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = "" ;
      AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = "" ;
      AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = "" ;
      AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = "" ;
      AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = "" ;
      AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = "" ;
      AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = "" ;
      AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = "" ;
      AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = "" ;
      AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = "" ;
      AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = DecimalUtil.ZERO ;
      AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = DecimalUtil.ZERO ;
      AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = DecimalUtil.ZERO ;
      AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = DecimalUtil.ZERO ;
      AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = "" ;
      AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = "" ;
      scmdbuf = "" ;
      lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = "" ;
      lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = "" ;
      lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = "" ;
      lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = "" ;
      lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = "" ;
      lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6558FasCodn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6249SalExObs = "" ;
      A396EmprCod = "" ;
      AV57Emprcod = "" ;
      P0ABK2_A396EmprCod = new String[] {""} ;
      P0ABK2_A2253SalExtAlb = new int[1] ;
      P0ABK2_A130BarCodPar = new String[] {""} ;
      P0ABK2_A6249SalExObs = new String[] {""} ;
      P0ABK2_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK2_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK2_A6257SalExCoE = new int[1] ;
      P0ABK2_A654OrdLin = new short[1] ;
      P0ABK2_A6558FasCodn = new String[] {""} ;
      P0ABK2_A1234BarNomCli = new String[] {""} ;
      P0ABK2_A135BarColNom = new String[] {""} ;
      P0ABK2_A212BarSer = new String[] {""} ;
      P0ABK2_A252CliCod = new int[1] ;
      P0ABK2_n252CliCod = new boolean[] {false} ;
      P0ABK2_A132BarCodReo = new byte[1] ;
      P0ABK2_A129BarCod = new int[1] ;
      P0ABK2_A6248SalExNln = new short[1] ;
      AV39Option = "" ;
      P0ABK3_A396EmprCod = new String[] {""} ;
      P0ABK3_A2253SalExtAlb = new int[1] ;
      P0ABK3_A212BarSer = new String[] {""} ;
      P0ABK3_A6249SalExObs = new String[] {""} ;
      P0ABK3_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK3_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK3_A6257SalExCoE = new int[1] ;
      P0ABK3_A654OrdLin = new short[1] ;
      P0ABK3_A6558FasCodn = new String[] {""} ;
      P0ABK3_A1234BarNomCli = new String[] {""} ;
      P0ABK3_A135BarColNom = new String[] {""} ;
      P0ABK3_A252CliCod = new int[1] ;
      P0ABK3_n252CliCod = new boolean[] {false} ;
      P0ABK3_A130BarCodPar = new String[] {""} ;
      P0ABK3_A132BarCodReo = new byte[1] ;
      P0ABK3_A129BarCod = new int[1] ;
      P0ABK3_A6248SalExNln = new short[1] ;
      P0ABK4_A396EmprCod = new String[] {""} ;
      P0ABK4_A2253SalExtAlb = new int[1] ;
      P0ABK4_A135BarColNom = new String[] {""} ;
      P0ABK4_A6249SalExObs = new String[] {""} ;
      P0ABK4_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK4_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK4_A6257SalExCoE = new int[1] ;
      P0ABK4_A654OrdLin = new short[1] ;
      P0ABK4_A6558FasCodn = new String[] {""} ;
      P0ABK4_A1234BarNomCli = new String[] {""} ;
      P0ABK4_A212BarSer = new String[] {""} ;
      P0ABK4_A252CliCod = new int[1] ;
      P0ABK4_n252CliCod = new boolean[] {false} ;
      P0ABK4_A130BarCodPar = new String[] {""} ;
      P0ABK4_A132BarCodReo = new byte[1] ;
      P0ABK4_A129BarCod = new int[1] ;
      P0ABK4_A6248SalExNln = new short[1] ;
      P0ABK5_A396EmprCod = new String[] {""} ;
      P0ABK5_A2253SalExtAlb = new int[1] ;
      P0ABK5_A1234BarNomCli = new String[] {""} ;
      P0ABK5_A6249SalExObs = new String[] {""} ;
      P0ABK5_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK5_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK5_A6257SalExCoE = new int[1] ;
      P0ABK5_A654OrdLin = new short[1] ;
      P0ABK5_A6558FasCodn = new String[] {""} ;
      P0ABK5_A135BarColNom = new String[] {""} ;
      P0ABK5_A212BarSer = new String[] {""} ;
      P0ABK5_A252CliCod = new int[1] ;
      P0ABK5_n252CliCod = new boolean[] {false} ;
      P0ABK5_A130BarCodPar = new String[] {""} ;
      P0ABK5_A132BarCodReo = new byte[1] ;
      P0ABK5_A129BarCod = new int[1] ;
      P0ABK5_A6248SalExNln = new short[1] ;
      P0ABK6_A396EmprCod = new String[] {""} ;
      P0ABK6_A6558FasCodn = new String[] {""} ;
      P0ABK6_A2253SalExtAlb = new int[1] ;
      P0ABK6_A6249SalExObs = new String[] {""} ;
      P0ABK6_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK6_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK6_A6257SalExCoE = new int[1] ;
      P0ABK6_A654OrdLin = new short[1] ;
      P0ABK6_A1234BarNomCli = new String[] {""} ;
      P0ABK6_A135BarColNom = new String[] {""} ;
      P0ABK6_A212BarSer = new String[] {""} ;
      P0ABK6_A252CliCod = new int[1] ;
      P0ABK6_n252CliCod = new boolean[] {false} ;
      P0ABK6_A130BarCodPar = new String[] {""} ;
      P0ABK6_A132BarCodReo = new byte[1] ;
      P0ABK6_A129BarCod = new int[1] ;
      P0ABK6_A6248SalExNln = new short[1] ;
      P0ABK7_A396EmprCod = new String[] {""} ;
      P0ABK7_A2253SalExtAlb = new int[1] ;
      P0ABK7_A6249SalExObs = new String[] {""} ;
      P0ABK7_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK7_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABK7_A6257SalExCoE = new int[1] ;
      P0ABK7_A654OrdLin = new short[1] ;
      P0ABK7_A6558FasCodn = new String[] {""} ;
      P0ABK7_A1234BarNomCli = new String[] {""} ;
      P0ABK7_A135BarColNom = new String[] {""} ;
      P0ABK7_A212BarSer = new String[] {""} ;
      P0ABK7_A252CliCod = new int[1] ;
      P0ABK7_n252CliCod = new boolean[] {false} ;
      P0ABK7_A130BarCodPar = new String[] {""} ;
      P0ABK7_A132BarCodReo = new byte[1] ;
      P0ABK7_A129BarCod = new int[1] ;
      P0ABK7_A6248SalExNln = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_wkpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ABK2_A396EmprCod, P0ABK2_A2253SalExtAlb, P0ABK2_A130BarCodPar, P0ABK2_A6249SalExObs, P0ABK2_A6258SalExMtE, P0ABK2_A6256SalExKgE, P0ABK2_A6257SalExCoE, P0ABK2_A654OrdLin, P0ABK2_A6558FasCodn, P0ABK2_A1234BarNomCli,
            P0ABK2_A135BarColNom, P0ABK2_A212BarSer, P0ABK2_A252CliCod, P0ABK2_n252CliCod, P0ABK2_A132BarCodReo, P0ABK2_A129BarCod, P0ABK2_A6248SalExNln
            }
            , new Object[] {
            P0ABK3_A396EmprCod, P0ABK3_A2253SalExtAlb, P0ABK3_A212BarSer, P0ABK3_A6249SalExObs, P0ABK3_A6258SalExMtE, P0ABK3_A6256SalExKgE, P0ABK3_A6257SalExCoE, P0ABK3_A654OrdLin, P0ABK3_A6558FasCodn, P0ABK3_A1234BarNomCli,
            P0ABK3_A135BarColNom, P0ABK3_A252CliCod, P0ABK3_n252CliCod, P0ABK3_A130BarCodPar, P0ABK3_A132BarCodReo, P0ABK3_A129BarCod, P0ABK3_A6248SalExNln
            }
            , new Object[] {
            P0ABK4_A396EmprCod, P0ABK4_A2253SalExtAlb, P0ABK4_A135BarColNom, P0ABK4_A6249SalExObs, P0ABK4_A6258SalExMtE, P0ABK4_A6256SalExKgE, P0ABK4_A6257SalExCoE, P0ABK4_A654OrdLin, P0ABK4_A6558FasCodn, P0ABK4_A1234BarNomCli,
            P0ABK4_A212BarSer, P0ABK4_A252CliCod, P0ABK4_n252CliCod, P0ABK4_A130BarCodPar, P0ABK4_A132BarCodReo, P0ABK4_A129BarCod, P0ABK4_A6248SalExNln
            }
            , new Object[] {
            P0ABK5_A396EmprCod, P0ABK5_A2253SalExtAlb, P0ABK5_A1234BarNomCli, P0ABK5_A6249SalExObs, P0ABK5_A6258SalExMtE, P0ABK5_A6256SalExKgE, P0ABK5_A6257SalExCoE, P0ABK5_A654OrdLin, P0ABK5_A6558FasCodn, P0ABK5_A135BarColNom,
            P0ABK5_A212BarSer, P0ABK5_A252CliCod, P0ABK5_n252CliCod, P0ABK5_A130BarCodPar, P0ABK5_A132BarCodReo, P0ABK5_A129BarCod, P0ABK5_A6248SalExNln
            }
            , new Object[] {
            P0ABK6_A396EmprCod, P0ABK6_A6558FasCodn, P0ABK6_A2253SalExtAlb, P0ABK6_A6249SalExObs, P0ABK6_A6258SalExMtE, P0ABK6_A6256SalExKgE, P0ABK6_A6257SalExCoE, P0ABK6_A654OrdLin, P0ABK6_A1234BarNomCli, P0ABK6_A135BarColNom,
            P0ABK6_A212BarSer, P0ABK6_A252CliCod, P0ABK6_n252CliCod, P0ABK6_A130BarCodPar, P0ABK6_A132BarCodReo, P0ABK6_A129BarCod, P0ABK6_A6248SalExNln
            }
            , new Object[] {
            P0ABK7_A396EmprCod, P0ABK7_A2253SalExtAlb, P0ABK7_A6249SalExObs, P0ABK7_A6258SalExMtE, P0ABK7_A6256SalExKgE, P0ABK7_A6257SalExCoE, P0ABK7_A654OrdLin, P0ABK7_A6558FasCodn, P0ABK7_A1234BarNomCli, P0ABK7_A135BarColNom,
            P0ABK7_A212BarSer, P0ABK7_A252CliCod, P0ABK7_n252CliCod, P0ABK7_A130BarCodPar, P0ABK7_A132BarCodReo, P0ABK7_A129BarCod, P0ABK7_A6248SalExNln
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFBarCodReo ;
   private byte AV15TFBarCodReo_To ;
   private byte AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ;
   private byte AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ;
   private byte A132BarCodReo ;
   private short AV10TFSalExNln ;
   private short AV11TFSalExNln_To ;
   private short AV28TFOrdLin ;
   private short AV29TFOrdLin_To ;
   private short AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ;
   private short AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ;
   private short AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ;
   private short AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV12TFBarCod ;
   private int AV13TFBarCod_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV30TFSalExCoE ;
   private int AV31TFSalExCoE_To ;
   private int AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ;
   private int AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ;
   private int AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ;
   private int AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ;
   private int AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ;
   private int AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A6257SalExCoE ;
   private int A2253SalExtAlb ;
   private int AV58SalExtAlb ;
   private long AV44count ;
   private java.math.BigDecimal AV32TFSalExKgE ;
   private java.math.BigDecimal AV33TFSalExKgE_To ;
   private java.math.BigDecimal AV34TFSalExMtE ;
   private java.math.BigDecimal AV35TFSalExMtE_To ;
   private java.math.BigDecimal AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ;
   private java.math.BigDecimal AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ;
   private java.math.BigDecimal AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ;
   private java.math.BigDecimal AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private String AV16TFBarCodPar ;
   private String AV17TFBarCodPar_Sel ;
   private String AV20TFBarSer ;
   private String AV21TFBarSer_Sel ;
   private String AV22TFBarColNom ;
   private String AV23TFBarColNom_Sel ;
   private String AV24TFBarNomCli ;
   private String AV25TFBarNomCli_Sel ;
   private String AV26TFFasCodn ;
   private String AV27TFFasCodn_Sel ;
   private String AV36TFSalExObs ;
   private String AV37TFSalExObs_Sel ;
   private String A130BarCodPar ;
   private String AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ;
   private String AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ;
   private String AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ;
   private String AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ;
   private String AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ;
   private String AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ;
   private String AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ;
   private String AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ;
   private String AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ;
   private String AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ;
   private String AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ;
   private String AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ;
   private String scmdbuf ;
   private String lV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ;
   private String lV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ;
   private String lV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ;
   private String lV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ;
   private String lV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ;
   private String lV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A6558FasCodn ;
   private String A6249SalExObs ;
   private String A396EmprCod ;
   private String AV57Emprcod ;
   private boolean returnInSub ;
   private boolean brkABK2 ;
   private boolean n252CliCod ;
   private boolean brkABK4 ;
   private boolean brkABK6 ;
   private boolean brkABK8 ;
   private boolean brkABK10 ;
   private boolean brkABK12 ;
   private String AV53OptionsJson ;
   private String AV54OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV50DDOName ;
   private String AV51SearchTxt ;
   private String AV52SearchTxtTo ;
   private String AV39Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABK2_A396EmprCod ;
   private int[] P0ABK2_A2253SalExtAlb ;
   private String[] P0ABK2_A130BarCodPar ;
   private String[] P0ABK2_A6249SalExObs ;
   private java.math.BigDecimal[] P0ABK2_A6258SalExMtE ;
   private java.math.BigDecimal[] P0ABK2_A6256SalExKgE ;
   private int[] P0ABK2_A6257SalExCoE ;
   private short[] P0ABK2_A654OrdLin ;
   private String[] P0ABK2_A6558FasCodn ;
   private String[] P0ABK2_A1234BarNomCli ;
   private String[] P0ABK2_A135BarColNom ;
   private String[] P0ABK2_A212BarSer ;
   private int[] P0ABK2_A252CliCod ;
   private boolean[] P0ABK2_n252CliCod ;
   private byte[] P0ABK2_A132BarCodReo ;
   private int[] P0ABK2_A129BarCod ;
   private short[] P0ABK2_A6248SalExNln ;
   private String[] P0ABK3_A396EmprCod ;
   private int[] P0ABK3_A2253SalExtAlb ;
   private String[] P0ABK3_A212BarSer ;
   private String[] P0ABK3_A6249SalExObs ;
   private java.math.BigDecimal[] P0ABK3_A6258SalExMtE ;
   private java.math.BigDecimal[] P0ABK3_A6256SalExKgE ;
   private int[] P0ABK3_A6257SalExCoE ;
   private short[] P0ABK3_A654OrdLin ;
   private String[] P0ABK3_A6558FasCodn ;
   private String[] P0ABK3_A1234BarNomCli ;
   private String[] P0ABK3_A135BarColNom ;
   private int[] P0ABK3_A252CliCod ;
   private boolean[] P0ABK3_n252CliCod ;
   private String[] P0ABK3_A130BarCodPar ;
   private byte[] P0ABK3_A132BarCodReo ;
   private int[] P0ABK3_A129BarCod ;
   private short[] P0ABK3_A6248SalExNln ;
   private String[] P0ABK4_A396EmprCod ;
   private int[] P0ABK4_A2253SalExtAlb ;
   private String[] P0ABK4_A135BarColNom ;
   private String[] P0ABK4_A6249SalExObs ;
   private java.math.BigDecimal[] P0ABK4_A6258SalExMtE ;
   private java.math.BigDecimal[] P0ABK4_A6256SalExKgE ;
   private int[] P0ABK4_A6257SalExCoE ;
   private short[] P0ABK4_A654OrdLin ;
   private String[] P0ABK4_A6558FasCodn ;
   private String[] P0ABK4_A1234BarNomCli ;
   private String[] P0ABK4_A212BarSer ;
   private int[] P0ABK4_A252CliCod ;
   private boolean[] P0ABK4_n252CliCod ;
   private String[] P0ABK4_A130BarCodPar ;
   private byte[] P0ABK4_A132BarCodReo ;
   private int[] P0ABK4_A129BarCod ;
   private short[] P0ABK4_A6248SalExNln ;
   private String[] P0ABK5_A396EmprCod ;
   private int[] P0ABK5_A2253SalExtAlb ;
   private String[] P0ABK5_A1234BarNomCli ;
   private String[] P0ABK5_A6249SalExObs ;
   private java.math.BigDecimal[] P0ABK5_A6258SalExMtE ;
   private java.math.BigDecimal[] P0ABK5_A6256SalExKgE ;
   private int[] P0ABK5_A6257SalExCoE ;
   private short[] P0ABK5_A654OrdLin ;
   private String[] P0ABK5_A6558FasCodn ;
   private String[] P0ABK5_A135BarColNom ;
   private String[] P0ABK5_A212BarSer ;
   private int[] P0ABK5_A252CliCod ;
   private boolean[] P0ABK5_n252CliCod ;
   private String[] P0ABK5_A130BarCodPar ;
   private byte[] P0ABK5_A132BarCodReo ;
   private int[] P0ABK5_A129BarCod ;
   private short[] P0ABK5_A6248SalExNln ;
   private String[] P0ABK6_A396EmprCod ;
   private String[] P0ABK6_A6558FasCodn ;
   private int[] P0ABK6_A2253SalExtAlb ;
   private String[] P0ABK6_A6249SalExObs ;
   private java.math.BigDecimal[] P0ABK6_A6258SalExMtE ;
   private java.math.BigDecimal[] P0ABK6_A6256SalExKgE ;
   private int[] P0ABK6_A6257SalExCoE ;
   private short[] P0ABK6_A654OrdLin ;
   private String[] P0ABK6_A1234BarNomCli ;
   private String[] P0ABK6_A135BarColNom ;
   private String[] P0ABK6_A212BarSer ;
   private int[] P0ABK6_A252CliCod ;
   private boolean[] P0ABK6_n252CliCod ;
   private String[] P0ABK6_A130BarCodPar ;
   private byte[] P0ABK6_A132BarCodReo ;
   private int[] P0ABK6_A129BarCod ;
   private short[] P0ABK6_A6248SalExNln ;
   private String[] P0ABK7_A396EmprCod ;
   private int[] P0ABK7_A2253SalExtAlb ;
   private String[] P0ABK7_A6249SalExObs ;
   private java.math.BigDecimal[] P0ABK7_A6258SalExMtE ;
   private java.math.BigDecimal[] P0ABK7_A6256SalExKgE ;
   private int[] P0ABK7_A6257SalExCoE ;
   private short[] P0ABK7_A654OrdLin ;
   private String[] P0ABK7_A6558FasCodn ;
   private String[] P0ABK7_A1234BarNomCli ;
   private String[] P0ABK7_A135BarColNom ;
   private String[] P0ABK7_A212BarSer ;
   private int[] P0ABK7_A252CliCod ;
   private boolean[] P0ABK7_n252CliCod ;
   private String[] P0ABK7_A130BarCodPar ;
   private byte[] P0ABK7_A132BarCodReo ;
   private int[] P0ABK7_A129BarCod ;
   private short[] P0ABK7_A6248SalExNln ;
   private GXSimpleCollection<String> AV40Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV43OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class trabajoexterno_detail_wkpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ABK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV57Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV58SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T1.BarCodPar, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasCodn, T2.BarNomCli, T2.BarColNom, T2.BarSer," ;
      scmdbuf += " T2.CliCod, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ABK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV57Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV58SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[30];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T2.BarSer, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasCodn, T2.BarNomCli, T2.BarColNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ABK4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV57Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV58SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T2.BarColNom, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasCodn, T2.BarNomCli, T2.BarSer, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0ABK5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV57Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV58SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T2.BarNomCli, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasCodn, T2.BarColNom, T2.BarSer, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0ABK6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          int A2253SalExtAlb ,
                                          int AV58SalExtAlb ,
                                          String AV57Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[30];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCodn, T1.SalExtAlb, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCodn" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0ABK7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV57Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV58SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[30];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasCodn, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV63Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV67Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV84Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SalExObs" ;
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
                  return conditional_P0ABK2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 1 :
                  return conditional_P0ABK3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 2 :
                  return conditional_P0ABK4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 3 :
                  return conditional_P0ABK5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 4 :
                  return conditional_P0ABK6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 5 :
                  return conditional_P0ABK7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABK4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABK5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABK6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABK7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 40);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 40);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 40);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 40);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 40);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 40);
               }
               return;
      }
   }

}

