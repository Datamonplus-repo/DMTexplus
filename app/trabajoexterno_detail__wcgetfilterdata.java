package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail__wcgetfilterdata extends GXProcedure
{
   public trabajoexterno_detail__wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail__wcgetfilterdata.class ), "" );
   }

   public trabajoexterno_detail__wcgetfilterdata( int remoteHandle ,
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
      trabajoexterno_detail__wcgetfilterdata.this.aP5 = new String[] {""};
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
      trabajoexterno_detail__wcgetfilterdata.this.AV50DDOName = aP0;
      trabajoexterno_detail__wcgetfilterdata.this.AV51SearchTxt = aP1;
      trabajoexterno_detail__wcgetfilterdata.this.AV52SearchTxtTo = aP2;
      trabajoexterno_detail__wcgetfilterdata.this.aP3 = aP3;
      trabajoexterno_detail__wcgetfilterdata.this.aP4 = aP4;
      trabajoexterno_detail__wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV45Session.getValue("TrabajoExterno_Detail__WCGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajoExterno_Detail__WCGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("TrabajoExterno_Detail__WCGridState"), null, null);
      }
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
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
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALEXTALB") == 0 )
         {
            AV57SalExtAlb = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALEXTFEC") == 0 )
         {
            AV58SalExtFec = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALFHH") == 0 )
         {
            AV59SalFhh = localUtil.ctot( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MANCOD") == 0 )
         {
            AV60Mancod = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MANNOM") == 0 )
         {
            AV61ManNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALCODEID") == 0 )
         {
            AV62SalCodeID = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALENVAT") == 0 )
         {
            AV63SalEnvAT = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HASHIN") == 0 )
         {
            AV64HashIN = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OKIN") == 0 )
         {
            AV65okIN = GXutil.boolval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MESSAGES_JSONIN") == 0 )
         {
            AV66Messages_jsonIN = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarCodPar = AV51SearchTxt ;
      AV17TFBarCodPar_Sel = "" ;
      AV71Trabajoexterno_detail__wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV73Trabajoexterno_detail__wcds_3_tfbarcod = AV12TFBarCod ;
      AV74Trabajoexterno_detail__wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV75Trabajoexterno_detail__wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV77Trabajoexterno_detail__wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV79Trabajoexterno_detail__wcds_9_tfclicod = AV18TFCliCod ;
      AV80Trabajoexterno_detail__wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV81Trabajoexterno_detail__wcds_11_tfbarser = AV20TFBarSer ;
      AV82Trabajoexterno_detail__wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Trabajoexterno_detail__wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV85Trabajoexterno_detail__wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV87Trabajoexterno_detail__wcds_17_tffascodn = AV26TFFasCodn ;
      AV88Trabajoexterno_detail__wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV89Trabajoexterno_detail__wcds_19_tfordlin = AV28TFOrdLin ;
      AV90Trabajoexterno_detail__wcds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV91Trabajoexterno_detail__wcds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV93Trabajoexterno_detail__wcds_23_tfsalexkge = AV32TFSalExKgE ;
      AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV95Trabajoexterno_detail__wcds_25_tfsalexmte = AV34TFSalExMtE ;
      AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV97Trabajoexterno_detail__wcds_27_tfsalexobs = AV36TFSalExObs ;
      AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV71Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV73Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV74Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV75Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                           AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                           AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV79Trabajoexterno_detail__wcds_9_tfclicod) ,
                                           Integer.valueOf(AV80Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                           AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                           AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                           AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                           AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                           AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                           AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                           AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                           AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                           Short.valueOf(AV89Trabajoexterno_detail__wcds_19_tfordlin) ,
                                           Short.valueOf(AV90Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                           Integer.valueOf(AV91Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                           AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                           AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                           AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                           AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                           AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                           AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AHH2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAHH2 = false ;
         A396EmprCod = P0AHH2_A396EmprCod[0] ;
         A2253SalExtAlb = P0AHH2_A2253SalExtAlb[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) )
         {
            brkAHH2 = false ;
            A396EmprCod = P0AHH2_A396EmprCod[0] ;
            A2253SalExtAlb = P0AHH2_A2253SalExtAlb[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAHH2 = true ;
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
         if ( ! brkAHH2 )
         {
            brkAHH2 = true ;
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
      AV71Trabajoexterno_detail__wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV73Trabajoexterno_detail__wcds_3_tfbarcod = AV12TFBarCod ;
      AV74Trabajoexterno_detail__wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV75Trabajoexterno_detail__wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV77Trabajoexterno_detail__wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV79Trabajoexterno_detail__wcds_9_tfclicod = AV18TFCliCod ;
      AV80Trabajoexterno_detail__wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV81Trabajoexterno_detail__wcds_11_tfbarser = AV20TFBarSer ;
      AV82Trabajoexterno_detail__wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Trabajoexterno_detail__wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV85Trabajoexterno_detail__wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV87Trabajoexterno_detail__wcds_17_tffascodn = AV26TFFasCodn ;
      AV88Trabajoexterno_detail__wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV89Trabajoexterno_detail__wcds_19_tfordlin = AV28TFOrdLin ;
      AV90Trabajoexterno_detail__wcds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV91Trabajoexterno_detail__wcds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV93Trabajoexterno_detail__wcds_23_tfsalexkge = AV32TFSalExKgE ;
      AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV95Trabajoexterno_detail__wcds_25_tfsalexmte = AV34TFSalExMtE ;
      AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV97Trabajoexterno_detail__wcds_27_tfsalexobs = AV36TFSalExObs ;
      AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV71Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV73Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV74Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV75Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                           AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                           AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV79Trabajoexterno_detail__wcds_9_tfclicod) ,
                                           Integer.valueOf(AV80Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                           AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                           AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                           AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                           AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                           AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                           AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                           AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                           AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                           Short.valueOf(AV89Trabajoexterno_detail__wcds_19_tfordlin) ,
                                           Short.valueOf(AV90Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                           Integer.valueOf(AV91Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                           AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                           AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                           AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                           AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                           AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                           AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AHH3 */
      pr_default.execute(1, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAHH4 = false ;
         A396EmprCod = P0AHH3_A396EmprCod[0] ;
         A2253SalExtAlb = P0AHH3_A2253SalExtAlb[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkAHH4 = false ;
            A396EmprCod = P0AHH3_A396EmprCod[0] ;
            A2253SalExtAlb = P0AHH3_A2253SalExtAlb[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAHH4 = true ;
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
         if ( ! brkAHH4 )
         {
            brkAHH4 = true ;
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
      AV71Trabajoexterno_detail__wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV73Trabajoexterno_detail__wcds_3_tfbarcod = AV12TFBarCod ;
      AV74Trabajoexterno_detail__wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV75Trabajoexterno_detail__wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV77Trabajoexterno_detail__wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV79Trabajoexterno_detail__wcds_9_tfclicod = AV18TFCliCod ;
      AV80Trabajoexterno_detail__wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV81Trabajoexterno_detail__wcds_11_tfbarser = AV20TFBarSer ;
      AV82Trabajoexterno_detail__wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Trabajoexterno_detail__wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV85Trabajoexterno_detail__wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV87Trabajoexterno_detail__wcds_17_tffascodn = AV26TFFasCodn ;
      AV88Trabajoexterno_detail__wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV89Trabajoexterno_detail__wcds_19_tfordlin = AV28TFOrdLin ;
      AV90Trabajoexterno_detail__wcds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV91Trabajoexterno_detail__wcds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV93Trabajoexterno_detail__wcds_23_tfsalexkge = AV32TFSalExKgE ;
      AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV95Trabajoexterno_detail__wcds_25_tfsalexmte = AV34TFSalExMtE ;
      AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV97Trabajoexterno_detail__wcds_27_tfsalexobs = AV36TFSalExObs ;
      AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV71Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV73Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV74Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV75Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                           AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                           AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV79Trabajoexterno_detail__wcds_9_tfclicod) ,
                                           Integer.valueOf(AV80Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                           AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                           AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                           AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                           AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                           AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                           AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                           AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                           AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                           Short.valueOf(AV89Trabajoexterno_detail__wcds_19_tfordlin) ,
                                           Short.valueOf(AV90Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                           Integer.valueOf(AV91Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                           AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                           AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                           AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                           AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                           AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                           AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AHH4 */
      pr_default.execute(2, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAHH6 = false ;
         A396EmprCod = P0AHH4_A396EmprCod[0] ;
         A2253SalExtAlb = P0AHH4_A2253SalExtAlb[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) )
         {
            brkAHH6 = false ;
            A396EmprCod = P0AHH4_A396EmprCod[0] ;
            A2253SalExtAlb = P0AHH4_A2253SalExtAlb[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAHH6 = true ;
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
         if ( ! brkAHH6 )
         {
            brkAHH6 = true ;
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
      AV71Trabajoexterno_detail__wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV73Trabajoexterno_detail__wcds_3_tfbarcod = AV12TFBarCod ;
      AV74Trabajoexterno_detail__wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV75Trabajoexterno_detail__wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV77Trabajoexterno_detail__wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV79Trabajoexterno_detail__wcds_9_tfclicod = AV18TFCliCod ;
      AV80Trabajoexterno_detail__wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV81Trabajoexterno_detail__wcds_11_tfbarser = AV20TFBarSer ;
      AV82Trabajoexterno_detail__wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Trabajoexterno_detail__wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV85Trabajoexterno_detail__wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV87Trabajoexterno_detail__wcds_17_tffascodn = AV26TFFasCodn ;
      AV88Trabajoexterno_detail__wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV89Trabajoexterno_detail__wcds_19_tfordlin = AV28TFOrdLin ;
      AV90Trabajoexterno_detail__wcds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV91Trabajoexterno_detail__wcds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV93Trabajoexterno_detail__wcds_23_tfsalexkge = AV32TFSalExKgE ;
      AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV95Trabajoexterno_detail__wcds_25_tfsalexmte = AV34TFSalExMtE ;
      AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV97Trabajoexterno_detail__wcds_27_tfsalexobs = AV36TFSalExObs ;
      AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV71Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV73Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV74Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV75Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                           AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                           AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV79Trabajoexterno_detail__wcds_9_tfclicod) ,
                                           Integer.valueOf(AV80Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                           AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                           AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                           AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                           AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                           AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                           AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                           AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                           AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                           Short.valueOf(AV89Trabajoexterno_detail__wcds_19_tfordlin) ,
                                           Short.valueOf(AV90Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                           Integer.valueOf(AV91Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                           AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                           AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                           AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                           AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                           AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                           AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AHH5 */
      pr_default.execute(3, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAHH8 = false ;
         A396EmprCod = P0AHH5_A396EmprCod[0] ;
         A2253SalExtAlb = P0AHH5_A2253SalExtAlb[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) )
         {
            brkAHH8 = false ;
            A396EmprCod = P0AHH5_A396EmprCod[0] ;
            A2253SalExtAlb = P0AHH5_A2253SalExtAlb[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAHH8 = true ;
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
         if ( ! brkAHH8 )
         {
            brkAHH8 = true ;
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
      AV71Trabajoexterno_detail__wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV73Trabajoexterno_detail__wcds_3_tfbarcod = AV12TFBarCod ;
      AV74Trabajoexterno_detail__wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV75Trabajoexterno_detail__wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV77Trabajoexterno_detail__wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV79Trabajoexterno_detail__wcds_9_tfclicod = AV18TFCliCod ;
      AV80Trabajoexterno_detail__wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV81Trabajoexterno_detail__wcds_11_tfbarser = AV20TFBarSer ;
      AV82Trabajoexterno_detail__wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Trabajoexterno_detail__wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV85Trabajoexterno_detail__wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV87Trabajoexterno_detail__wcds_17_tffascodn = AV26TFFasCodn ;
      AV88Trabajoexterno_detail__wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV89Trabajoexterno_detail__wcds_19_tfordlin = AV28TFOrdLin ;
      AV90Trabajoexterno_detail__wcds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV91Trabajoexterno_detail__wcds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV93Trabajoexterno_detail__wcds_23_tfsalexkge = AV32TFSalExKgE ;
      AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV95Trabajoexterno_detail__wcds_25_tfsalexmte = AV34TFSalExMtE ;
      AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV97Trabajoexterno_detail__wcds_27_tfsalexobs = AV36TFSalExObs ;
      AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV71Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV73Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV74Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV75Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                           AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                           AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV79Trabajoexterno_detail__wcds_9_tfclicod) ,
                                           Integer.valueOf(AV80Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                           AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                           AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                           AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                           AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                           AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                           AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                           AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                           AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                           Short.valueOf(AV89Trabajoexterno_detail__wcds_19_tfordlin) ,
                                           Short.valueOf(AV90Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                           Integer.valueOf(AV91Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                           AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                           AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                           AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                           AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                           AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                           AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AHH6 */
      pr_default.execute(4, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAHH10 = false ;
         A396EmprCod = P0AHH6_A396EmprCod[0] ;
         A2253SalExtAlb = P0AHH6_A2253SalExtAlb[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            brkAHH10 = false ;
            A396EmprCod = P0AHH6_A396EmprCod[0] ;
            A2253SalExtAlb = P0AHH6_A2253SalExtAlb[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAHH10 = true ;
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
         if ( ! brkAHH10 )
         {
            brkAHH10 = true ;
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
      AV71Trabajoexterno_detail__wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV73Trabajoexterno_detail__wcds_3_tfbarcod = AV12TFBarCod ;
      AV74Trabajoexterno_detail__wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV75Trabajoexterno_detail__wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV77Trabajoexterno_detail__wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV79Trabajoexterno_detail__wcds_9_tfclicod = AV18TFCliCod ;
      AV80Trabajoexterno_detail__wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV81Trabajoexterno_detail__wcds_11_tfbarser = AV20TFBarSer ;
      AV82Trabajoexterno_detail__wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV83Trabajoexterno_detail__wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV85Trabajoexterno_detail__wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV87Trabajoexterno_detail__wcds_17_tffascodn = AV26TFFasCodn ;
      AV88Trabajoexterno_detail__wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV89Trabajoexterno_detail__wcds_19_tfordlin = AV28TFOrdLin ;
      AV90Trabajoexterno_detail__wcds_20_tfordlin_to = AV29TFOrdLin_To ;
      AV91Trabajoexterno_detail__wcds_21_tfsalexcoe = AV30TFSalExCoE ;
      AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV93Trabajoexterno_detail__wcds_23_tfsalexkge = AV32TFSalExKgE ;
      AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV95Trabajoexterno_detail__wcds_25_tfsalexmte = AV34TFSalExMtE ;
      AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV97Trabajoexterno_detail__wcds_27_tfsalexobs = AV36TFSalExObs ;
      AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV71Trabajoexterno_detail__wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV73Trabajoexterno_detail__wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV74Trabajoexterno_detail__wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV75Trabajoexterno_detail__wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to) ,
                                           AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                           AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV79Trabajoexterno_detail__wcds_9_tfclicod) ,
                                           Integer.valueOf(AV80Trabajoexterno_detail__wcds_10_tfclicod_to) ,
                                           AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                           AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                           AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                           AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                           AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                           AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                           AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                           AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                           Short.valueOf(AV89Trabajoexterno_detail__wcds_19_tfordlin) ,
                                           Short.valueOf(AV90Trabajoexterno_detail__wcds_20_tfordlin_to) ,
                                           Integer.valueOf(AV91Trabajoexterno_detail__wcds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to) ,
                                           AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                           AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                           AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                           AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                           AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                           AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AHH7 */
      pr_default.execute(5, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAHH12 = false ;
         A396EmprCod = P0AHH7_A396EmprCod[0] ;
         A2253SalExtAlb = P0AHH7_A2253SalExtAlb[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(5) != 101) )
         {
            brkAHH12 = false ;
            A396EmprCod = P0AHH7_A396EmprCod[0] ;
            A2253SalExtAlb = P0AHH7_A2253SalExtAlb[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAHH12 = true ;
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
         if ( ! brkAHH12 )
         {
            brkAHH12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = trabajoexterno_detail__wcgetfilterdata.this.AV53OptionsJson;
      this.aP4[0] = trabajoexterno_detail__wcgetfilterdata.this.AV54OptionsDescJson;
      this.aP5[0] = trabajoexterno_detail__wcgetfilterdata.this.AV55OptionIndexesJson;
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
      AV56Emprcod = "" ;
      AV58SalExtFec = GXutil.nullDate() ;
      AV59SalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV61ManNom = "" ;
      AV62SalCodeID = "" ;
      AV64HashIN = "" ;
      AV66Messages_jsonIN = "" ;
      A130BarCodPar = "" ;
      AV77Trabajoexterno_detail__wcds_7_tfbarcodpar = "" ;
      AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel = "" ;
      AV81Trabajoexterno_detail__wcds_11_tfbarser = "" ;
      AV82Trabajoexterno_detail__wcds_12_tfbarser_sel = "" ;
      AV83Trabajoexterno_detail__wcds_13_tfbarcolnom = "" ;
      AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel = "" ;
      AV85Trabajoexterno_detail__wcds_15_tfbarnomcli = "" ;
      AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel = "" ;
      AV87Trabajoexterno_detail__wcds_17_tffascodn = "" ;
      AV88Trabajoexterno_detail__wcds_18_tffascodn_sel = "" ;
      AV93Trabajoexterno_detail__wcds_23_tfsalexkge = DecimalUtil.ZERO ;
      AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to = DecimalUtil.ZERO ;
      AV95Trabajoexterno_detail__wcds_25_tfsalexmte = DecimalUtil.ZERO ;
      AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to = DecimalUtil.ZERO ;
      AV97Trabajoexterno_detail__wcds_27_tfsalexobs = "" ;
      AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel = "" ;
      scmdbuf = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6558FasCodn = "" ;
      A6249SalExObs = "" ;
      A396EmprCod = "" ;
      P0AHH2_A396EmprCod = new String[] {""} ;
      P0AHH2_A2253SalExtAlb = new int[1] ;
      AV39Option = "" ;
      P0AHH3_A396EmprCod = new String[] {""} ;
      P0AHH3_A2253SalExtAlb = new int[1] ;
      P0AHH4_A396EmprCod = new String[] {""} ;
      P0AHH4_A2253SalExtAlb = new int[1] ;
      P0AHH5_A396EmprCod = new String[] {""} ;
      P0AHH5_A2253SalExtAlb = new int[1] ;
      P0AHH6_A396EmprCod = new String[] {""} ;
      P0AHH6_A2253SalExtAlb = new int[1] ;
      P0AHH7_A396EmprCod = new String[] {""} ;
      P0AHH7_A2253SalExtAlb = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajoexterno_detail__wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AHH2_A396EmprCod, P0AHH2_A2253SalExtAlb
            }
            , new Object[] {
            P0AHH3_A396EmprCod, P0AHH3_A2253SalExtAlb
            }
            , new Object[] {
            P0AHH4_A396EmprCod, P0AHH4_A2253SalExtAlb
            }
            , new Object[] {
            P0AHH5_A396EmprCod, P0AHH5_A2253SalExtAlb
            }
            , new Object[] {
            P0AHH6_A396EmprCod, P0AHH6_A2253SalExtAlb
            }
            , new Object[] {
            P0AHH7_A396EmprCod, P0AHH7_A2253SalExtAlb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFBarCodReo ;
   private byte AV15TFBarCodReo_To ;
   private byte AV63SalEnvAT ;
   private byte AV75Trabajoexterno_detail__wcds_5_tfbarcodreo ;
   private byte AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to ;
   private short AV10TFSalExNln ;
   private short AV11TFSalExNln_To ;
   private short AV28TFOrdLin ;
   private short AV29TFOrdLin_To ;
   private short AV60Mancod ;
   private short AV71Trabajoexterno_detail__wcds_1_tfsalexnln ;
   private short AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to ;
   private short AV89Trabajoexterno_detail__wcds_19_tfordlin ;
   private short AV90Trabajoexterno_detail__wcds_20_tfordlin_to ;
   private short Gx_err ;
   private int AV69GXV1 ;
   private int AV12TFBarCod ;
   private int AV13TFBarCod_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV30TFSalExCoE ;
   private int AV31TFSalExCoE_To ;
   private int AV57SalExtAlb ;
   private int AV73Trabajoexterno_detail__wcds_3_tfbarcod ;
   private int AV74Trabajoexterno_detail__wcds_4_tfbarcod_to ;
   private int AV79Trabajoexterno_detail__wcds_9_tfclicod ;
   private int AV80Trabajoexterno_detail__wcds_10_tfclicod_to ;
   private int AV91Trabajoexterno_detail__wcds_21_tfsalexcoe ;
   private int AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to ;
   private int A2253SalExtAlb ;
   private long AV44count ;
   private java.math.BigDecimal AV32TFSalExKgE ;
   private java.math.BigDecimal AV33TFSalExKgE_To ;
   private java.math.BigDecimal AV34TFSalExMtE ;
   private java.math.BigDecimal AV35TFSalExMtE_To ;
   private java.math.BigDecimal AV93Trabajoexterno_detail__wcds_23_tfsalexkge ;
   private java.math.BigDecimal AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ;
   private java.math.BigDecimal AV95Trabajoexterno_detail__wcds_25_tfsalexmte ;
   private java.math.BigDecimal AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ;
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
   private String AV56Emprcod ;
   private String AV61ManNom ;
   private String AV62SalCodeID ;
   private String A130BarCodPar ;
   private String AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ;
   private String AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ;
   private String AV81Trabajoexterno_detail__wcds_11_tfbarser ;
   private String AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ;
   private String AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ;
   private String AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ;
   private String AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ;
   private String AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ;
   private String AV87Trabajoexterno_detail__wcds_17_tffascodn ;
   private String AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ;
   private String AV97Trabajoexterno_detail__wcds_27_tfsalexobs ;
   private String AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A6558FasCodn ;
   private String A6249SalExObs ;
   private String A396EmprCod ;
   private java.util.Date AV59SalFhh ;
   private java.util.Date AV58SalExtFec ;
   private boolean returnInSub ;
   private boolean AV65okIN ;
   private boolean brkAHH2 ;
   private boolean brkAHH4 ;
   private boolean brkAHH6 ;
   private boolean brkAHH8 ;
   private boolean brkAHH10 ;
   private boolean brkAHH12 ;
   private String AV53OptionsJson ;
   private String AV54OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV66Messages_jsonIN ;
   private String AV50DDOName ;
   private String AV51SearchTxt ;
   private String AV52SearchTxtTo ;
   private String AV64HashIN ;
   private String AV39Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHH2_A396EmprCod ;
   private int[] P0AHH2_A2253SalExtAlb ;
   private String[] P0AHH3_A396EmprCod ;
   private int[] P0AHH3_A2253SalExtAlb ;
   private String[] P0AHH4_A396EmprCod ;
   private int[] P0AHH4_A2253SalExtAlb ;
   private String[] P0AHH5_A396EmprCod ;
   private int[] P0AHH5_A2253SalExtAlb ;
   private String[] P0AHH6_A396EmprCod ;
   private int[] P0AHH6_A2253SalExtAlb ;
   private String[] P0AHH7_A396EmprCod ;
   private int[] P0AHH7_A2253SalExtAlb ;
   private GXSimpleCollection<String> AV40Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV43OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class trabajoexterno_detail__wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AHH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV71Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV73Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV74Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV75Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV79Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV80Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV89Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV90Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV91Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[2];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalExtAlb FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(SalExtAlb = ?)");
      scmdbuf += sWhereString ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AHH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV71Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV73Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV74Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV75Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV79Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV80Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV89Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV90Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV91Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[2];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalExtAlb FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(SalExtAlb = ?)");
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AHH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV71Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV73Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV74Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV75Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV79Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV80Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV89Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV90Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV91Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[2];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalExtAlb FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(SalExtAlb = ?)");
      scmdbuf += sWhereString ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AHH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV71Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV73Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV74Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV75Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV79Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV80Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV89Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV90Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV91Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[2];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalExtAlb FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(SalExtAlb = ?)");
      scmdbuf += sWhereString ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AHH6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV71Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV73Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV74Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV75Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV79Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV80Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV89Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV90Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV91Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[2];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalExtAlb FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(SalExtAlb = ?)");
      scmdbuf += sWhereString ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AHH7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV71Trabajoexterno_detail__wcds_1_tfsalexnln ,
                                          short AV72Trabajoexterno_detail__wcds_2_tfsalexnln_to ,
                                          int AV73Trabajoexterno_detail__wcds_3_tfbarcod ,
                                          int AV74Trabajoexterno_detail__wcds_4_tfbarcod_to ,
                                          byte AV75Trabajoexterno_detail__wcds_5_tfbarcodreo ,
                                          byte AV76Trabajoexterno_detail__wcds_6_tfbarcodreo_to ,
                                          String AV78Trabajoexterno_detail__wcds_8_tfbarcodpar_sel ,
                                          String AV77Trabajoexterno_detail__wcds_7_tfbarcodpar ,
                                          int AV79Trabajoexterno_detail__wcds_9_tfclicod ,
                                          int AV80Trabajoexterno_detail__wcds_10_tfclicod_to ,
                                          String AV82Trabajoexterno_detail__wcds_12_tfbarser_sel ,
                                          String AV81Trabajoexterno_detail__wcds_11_tfbarser ,
                                          String AV84Trabajoexterno_detail__wcds_14_tfbarcolnom_sel ,
                                          String AV83Trabajoexterno_detail__wcds_13_tfbarcolnom ,
                                          String AV86Trabajoexterno_detail__wcds_16_tfbarnomcli_sel ,
                                          String AV85Trabajoexterno_detail__wcds_15_tfbarnomcli ,
                                          String AV88Trabajoexterno_detail__wcds_18_tffascodn_sel ,
                                          String AV87Trabajoexterno_detail__wcds_17_tffascodn ,
                                          short AV89Trabajoexterno_detail__wcds_19_tfordlin ,
                                          short AV90Trabajoexterno_detail__wcds_20_tfordlin_to ,
                                          int AV91Trabajoexterno_detail__wcds_21_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail__wcds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail__wcds_23_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail__wcds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail__wcds_25_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail__wcds_26_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail__wcds_28_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail__wcds_27_tfsalexobs ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[2];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalExtAlb FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(SalExtAlb = ?)");
      scmdbuf += sWhereString ;
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
                  return conditional_P0AHH2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 1 :
                  return conditional_P0AHH3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 2 :
                  return conditional_P0AHH4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 3 :
                  return conditional_P0AHH5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 4 :
                  return conditional_P0AHH6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
            case 5 :
                  return conditional_P0AHH7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHH6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHH7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
      }
   }

}

