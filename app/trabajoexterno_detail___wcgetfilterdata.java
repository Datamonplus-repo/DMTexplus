package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail___wcgetfilterdata extends GXProcedure
{
   public trabajoexterno_detail___wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail___wcgetfilterdata.class ), "" );
   }

   public trabajoexterno_detail___wcgetfilterdata( int remoteHandle ,
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
      trabajoexterno_detail___wcgetfilterdata.this.aP5 = new String[] {""};
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
      trabajoexterno_detail___wcgetfilterdata.this.AV50DDOName = aP0;
      trabajoexterno_detail___wcgetfilterdata.this.AV51SearchTxt = aP1;
      trabajoexterno_detail___wcgetfilterdata.this.AV52SearchTxtTo = aP2;
      trabajoexterno_detail___wcgetfilterdata.this.aP3 = aP3;
      trabajoexterno_detail___wcgetfilterdata.this.aP4 = aP4;
      trabajoexterno_detail___wcgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_FASDSCMN") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCMNOPTIONS' */
         S171 ();
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
         S181 ();
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
      if ( GXutil.strcmp(AV45Session.getValue("TrabajoExterno_Detail___WCGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajoExterno_Detail___WCGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("TrabajoExterno_Detail___WCGridState"), null, null);
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
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
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSCMN") == 0 )
         {
            AV67TFFasDscMn = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSCMN_SEL") == 0 )
         {
            AV68TFFasDscMn_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarCodPar = AV51SearchTxt ;
      AV17TFBarCodPar_Sel = "" ;
      AV73Trabajoexterno_detail___wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV75Trabajoexterno_detail___wcds_3_tfbarcod = AV12TFBarCod ;
      AV76Trabajoexterno_detail___wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV77Trabajoexterno_detail___wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV81Trabajoexterno_detail___wcds_9_tfclicod = AV18TFCliCod ;
      AV82Trabajoexterno_detail___wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = AV20TFBarSer ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = AV26TFFasCodn ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = AV67TFFasDscMn ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV68TFFasDscMn_Sel ;
      AV93Trabajoexterno_detail___wcds_21_tfordlin = AV28TFOrdLin ;
      AV94Trabajoexterno_detail___wcds_22_tfordlin_to = AV29TFOrdLin_To ;
      AV95Trabajoexterno_detail___wcds_23_tfsalexcoe = AV30TFSalExCoE ;
      AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = AV32TFSalExKgE ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = AV34TFSalExMtE ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = AV36TFSalExObs ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV89Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV91Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV101Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor P0AJZ2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb), Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV79Trabajoexterno_detail___wcds_7_tfbarcodpar, AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to), lV83Trabajoexterno_detail___wcds_11_tfbarser, AV84Trabajoexterno_detail___wcds_12_tfbarser_sel, lV85Trabajoexterno_detail___wcds_13_tfbarcolnom, AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV87Trabajoexterno_detail___wcds_15_tfbarnomcli, AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV89Trabajoexterno_detail___wcds_17_tffascodn, AV90Trabajoexterno_detail___wcds_18_tffascodn_sel, lV91Trabajoexterno_detail___wcds_19_tffasdscmn, AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV97Trabajoexterno_detail___wcds_25_tfsalexkge, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV99Trabajoexterno_detail___wcds_27_tfsalexmte, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV101Trabajoexterno_detail___wcds_29_tfsalexobs, AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAJZ2 = false ;
         A396EmprCod = P0AJZ2_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJZ2_A2253SalExtAlb[0] ;
         A130BarCodPar = P0AJZ2_A130BarCodPar[0] ;
         A6249SalExObs = P0AJZ2_A6249SalExObs[0] ;
         A6258SalExMtE = P0AJZ2_A6258SalExMtE[0] ;
         A6256SalExKgE = P0AJZ2_A6256SalExKgE[0] ;
         A6257SalExCoE = P0AJZ2_A6257SalExCoE[0] ;
         A654OrdLin = P0AJZ2_A654OrdLin[0] ;
         A14410FasDscMn = P0AJZ2_A14410FasDscMn[0] ;
         A6558FasCodn = P0AJZ2_A6558FasCodn[0] ;
         A1234BarNomCli = P0AJZ2_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ2_A135BarColNom[0] ;
         A212BarSer = P0AJZ2_A212BarSer[0] ;
         A252CliCod = P0AJZ2_A252CliCod[0] ;
         n252CliCod = P0AJZ2_n252CliCod[0] ;
         A132BarCodReo = P0AJZ2_A132BarCodReo[0] ;
         A129BarCod = P0AJZ2_A129BarCod[0] ;
         A6248SalExNln = P0AJZ2_A6248SalExNln[0] ;
         A1234BarNomCli = P0AJZ2_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ2_A135BarColNom[0] ;
         A212BarSer = P0AJZ2_A212BarSer[0] ;
         A252CliCod = P0AJZ2_A252CliCod[0] ;
         n252CliCod = P0AJZ2_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AJZ2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brkAJZ2 = false ;
            A396EmprCod = P0AJZ2_A396EmprCod[0] ;
            A2253SalExtAlb = P0AJZ2_A2253SalExtAlb[0] ;
            A6248SalExNln = P0AJZ2_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAJZ2 = true ;
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
         if ( ! brkAJZ2 )
         {
            brkAJZ2 = true ;
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
      AV73Trabajoexterno_detail___wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV75Trabajoexterno_detail___wcds_3_tfbarcod = AV12TFBarCod ;
      AV76Trabajoexterno_detail___wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV77Trabajoexterno_detail___wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV81Trabajoexterno_detail___wcds_9_tfclicod = AV18TFCliCod ;
      AV82Trabajoexterno_detail___wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = AV20TFBarSer ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = AV26TFFasCodn ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = AV67TFFasDscMn ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV68TFFasDscMn_Sel ;
      AV93Trabajoexterno_detail___wcds_21_tfordlin = AV28TFOrdLin ;
      AV94Trabajoexterno_detail___wcds_22_tfordlin_to = AV29TFOrdLin_To ;
      AV95Trabajoexterno_detail___wcds_23_tfsalexcoe = AV30TFSalExCoE ;
      AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = AV32TFSalExKgE ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = AV34TFSalExMtE ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = AV36TFSalExObs ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV89Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV91Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV101Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor P0AJZ3 */
      pr_default.execute(1, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb), Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV79Trabajoexterno_detail___wcds_7_tfbarcodpar, AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to), lV83Trabajoexterno_detail___wcds_11_tfbarser, AV84Trabajoexterno_detail___wcds_12_tfbarser_sel, lV85Trabajoexterno_detail___wcds_13_tfbarcolnom, AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV87Trabajoexterno_detail___wcds_15_tfbarnomcli, AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV89Trabajoexterno_detail___wcds_17_tffascodn, AV90Trabajoexterno_detail___wcds_18_tffascodn_sel, lV91Trabajoexterno_detail___wcds_19_tffasdscmn, AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV97Trabajoexterno_detail___wcds_25_tfsalexkge, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV99Trabajoexterno_detail___wcds_27_tfsalexmte, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV101Trabajoexterno_detail___wcds_29_tfsalexobs, AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAJZ4 = false ;
         A396EmprCod = P0AJZ3_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJZ3_A2253SalExtAlb[0] ;
         A212BarSer = P0AJZ3_A212BarSer[0] ;
         A6249SalExObs = P0AJZ3_A6249SalExObs[0] ;
         A6258SalExMtE = P0AJZ3_A6258SalExMtE[0] ;
         A6256SalExKgE = P0AJZ3_A6256SalExKgE[0] ;
         A6257SalExCoE = P0AJZ3_A6257SalExCoE[0] ;
         A654OrdLin = P0AJZ3_A654OrdLin[0] ;
         A14410FasDscMn = P0AJZ3_A14410FasDscMn[0] ;
         A6558FasCodn = P0AJZ3_A6558FasCodn[0] ;
         A1234BarNomCli = P0AJZ3_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ3_A135BarColNom[0] ;
         A252CliCod = P0AJZ3_A252CliCod[0] ;
         n252CliCod = P0AJZ3_n252CliCod[0] ;
         A130BarCodPar = P0AJZ3_A130BarCodPar[0] ;
         A132BarCodReo = P0AJZ3_A132BarCodReo[0] ;
         A129BarCod = P0AJZ3_A129BarCod[0] ;
         A6248SalExNln = P0AJZ3_A6248SalExNln[0] ;
         A212BarSer = P0AJZ3_A212BarSer[0] ;
         A1234BarNomCli = P0AJZ3_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ3_A135BarColNom[0] ;
         A252CliCod = P0AJZ3_A252CliCod[0] ;
         n252CliCod = P0AJZ3_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AJZ3_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brkAJZ4 = false ;
            A396EmprCod = P0AJZ3_A396EmprCod[0] ;
            A2253SalExtAlb = P0AJZ3_A2253SalExtAlb[0] ;
            A130BarCodPar = P0AJZ3_A130BarCodPar[0] ;
            A132BarCodReo = P0AJZ3_A132BarCodReo[0] ;
            A129BarCod = P0AJZ3_A129BarCod[0] ;
            A6248SalExNln = P0AJZ3_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAJZ4 = true ;
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
         if ( ! brkAJZ4 )
         {
            brkAJZ4 = true ;
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
      AV73Trabajoexterno_detail___wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV75Trabajoexterno_detail___wcds_3_tfbarcod = AV12TFBarCod ;
      AV76Trabajoexterno_detail___wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV77Trabajoexterno_detail___wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV81Trabajoexterno_detail___wcds_9_tfclicod = AV18TFCliCod ;
      AV82Trabajoexterno_detail___wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = AV20TFBarSer ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = AV26TFFasCodn ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = AV67TFFasDscMn ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV68TFFasDscMn_Sel ;
      AV93Trabajoexterno_detail___wcds_21_tfordlin = AV28TFOrdLin ;
      AV94Trabajoexterno_detail___wcds_22_tfordlin_to = AV29TFOrdLin_To ;
      AV95Trabajoexterno_detail___wcds_23_tfsalexcoe = AV30TFSalExCoE ;
      AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = AV32TFSalExKgE ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = AV34TFSalExMtE ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = AV36TFSalExObs ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV89Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV91Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV101Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor P0AJZ4 */
      pr_default.execute(2, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb), Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV79Trabajoexterno_detail___wcds_7_tfbarcodpar, AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to), lV83Trabajoexterno_detail___wcds_11_tfbarser, AV84Trabajoexterno_detail___wcds_12_tfbarser_sel, lV85Trabajoexterno_detail___wcds_13_tfbarcolnom, AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV87Trabajoexterno_detail___wcds_15_tfbarnomcli, AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV89Trabajoexterno_detail___wcds_17_tffascodn, AV90Trabajoexterno_detail___wcds_18_tffascodn_sel, lV91Trabajoexterno_detail___wcds_19_tffasdscmn, AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV97Trabajoexterno_detail___wcds_25_tfsalexkge, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV99Trabajoexterno_detail___wcds_27_tfsalexmte, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV101Trabajoexterno_detail___wcds_29_tfsalexobs, AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAJZ6 = false ;
         A396EmprCod = P0AJZ4_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJZ4_A2253SalExtAlb[0] ;
         A135BarColNom = P0AJZ4_A135BarColNom[0] ;
         A6249SalExObs = P0AJZ4_A6249SalExObs[0] ;
         A6258SalExMtE = P0AJZ4_A6258SalExMtE[0] ;
         A6256SalExKgE = P0AJZ4_A6256SalExKgE[0] ;
         A6257SalExCoE = P0AJZ4_A6257SalExCoE[0] ;
         A654OrdLin = P0AJZ4_A654OrdLin[0] ;
         A14410FasDscMn = P0AJZ4_A14410FasDscMn[0] ;
         A6558FasCodn = P0AJZ4_A6558FasCodn[0] ;
         A1234BarNomCli = P0AJZ4_A1234BarNomCli[0] ;
         A212BarSer = P0AJZ4_A212BarSer[0] ;
         A252CliCod = P0AJZ4_A252CliCod[0] ;
         n252CliCod = P0AJZ4_n252CliCod[0] ;
         A130BarCodPar = P0AJZ4_A130BarCodPar[0] ;
         A132BarCodReo = P0AJZ4_A132BarCodReo[0] ;
         A129BarCod = P0AJZ4_A129BarCod[0] ;
         A6248SalExNln = P0AJZ4_A6248SalExNln[0] ;
         A135BarColNom = P0AJZ4_A135BarColNom[0] ;
         A1234BarNomCli = P0AJZ4_A1234BarNomCli[0] ;
         A212BarSer = P0AJZ4_A212BarSer[0] ;
         A252CliCod = P0AJZ4_A252CliCod[0] ;
         n252CliCod = P0AJZ4_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AJZ4_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brkAJZ6 = false ;
            A396EmprCod = P0AJZ4_A396EmprCod[0] ;
            A2253SalExtAlb = P0AJZ4_A2253SalExtAlb[0] ;
            A130BarCodPar = P0AJZ4_A130BarCodPar[0] ;
            A132BarCodReo = P0AJZ4_A132BarCodReo[0] ;
            A129BarCod = P0AJZ4_A129BarCod[0] ;
            A6248SalExNln = P0AJZ4_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAJZ6 = true ;
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
         if ( ! brkAJZ6 )
         {
            brkAJZ6 = true ;
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
      AV73Trabajoexterno_detail___wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV75Trabajoexterno_detail___wcds_3_tfbarcod = AV12TFBarCod ;
      AV76Trabajoexterno_detail___wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV77Trabajoexterno_detail___wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV81Trabajoexterno_detail___wcds_9_tfclicod = AV18TFCliCod ;
      AV82Trabajoexterno_detail___wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = AV20TFBarSer ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = AV26TFFasCodn ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = AV67TFFasDscMn ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV68TFFasDscMn_Sel ;
      AV93Trabajoexterno_detail___wcds_21_tfordlin = AV28TFOrdLin ;
      AV94Trabajoexterno_detail___wcds_22_tfordlin_to = AV29TFOrdLin_To ;
      AV95Trabajoexterno_detail___wcds_23_tfsalexcoe = AV30TFSalExCoE ;
      AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = AV32TFSalExKgE ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = AV34TFSalExMtE ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = AV36TFSalExObs ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV89Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV91Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV101Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor P0AJZ5 */
      pr_default.execute(3, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb), Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV79Trabajoexterno_detail___wcds_7_tfbarcodpar, AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to), lV83Trabajoexterno_detail___wcds_11_tfbarser, AV84Trabajoexterno_detail___wcds_12_tfbarser_sel, lV85Trabajoexterno_detail___wcds_13_tfbarcolnom, AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV87Trabajoexterno_detail___wcds_15_tfbarnomcli, AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV89Trabajoexterno_detail___wcds_17_tffascodn, AV90Trabajoexterno_detail___wcds_18_tffascodn_sel, lV91Trabajoexterno_detail___wcds_19_tffasdscmn, AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV97Trabajoexterno_detail___wcds_25_tfsalexkge, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV99Trabajoexterno_detail___wcds_27_tfsalexmte, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV101Trabajoexterno_detail___wcds_29_tfsalexobs, AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAJZ8 = false ;
         A396EmprCod = P0AJZ5_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJZ5_A2253SalExtAlb[0] ;
         A1234BarNomCli = P0AJZ5_A1234BarNomCli[0] ;
         A6249SalExObs = P0AJZ5_A6249SalExObs[0] ;
         A6258SalExMtE = P0AJZ5_A6258SalExMtE[0] ;
         A6256SalExKgE = P0AJZ5_A6256SalExKgE[0] ;
         A6257SalExCoE = P0AJZ5_A6257SalExCoE[0] ;
         A654OrdLin = P0AJZ5_A654OrdLin[0] ;
         A14410FasDscMn = P0AJZ5_A14410FasDscMn[0] ;
         A6558FasCodn = P0AJZ5_A6558FasCodn[0] ;
         A135BarColNom = P0AJZ5_A135BarColNom[0] ;
         A212BarSer = P0AJZ5_A212BarSer[0] ;
         A252CliCod = P0AJZ5_A252CliCod[0] ;
         n252CliCod = P0AJZ5_n252CliCod[0] ;
         A130BarCodPar = P0AJZ5_A130BarCodPar[0] ;
         A132BarCodReo = P0AJZ5_A132BarCodReo[0] ;
         A129BarCod = P0AJZ5_A129BarCod[0] ;
         A6248SalExNln = P0AJZ5_A6248SalExNln[0] ;
         A1234BarNomCli = P0AJZ5_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ5_A135BarColNom[0] ;
         A212BarSer = P0AJZ5_A212BarSer[0] ;
         A252CliCod = P0AJZ5_A252CliCod[0] ;
         n252CliCod = P0AJZ5_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AJZ5_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brkAJZ8 = false ;
            A396EmprCod = P0AJZ5_A396EmprCod[0] ;
            A2253SalExtAlb = P0AJZ5_A2253SalExtAlb[0] ;
            A130BarCodPar = P0AJZ5_A130BarCodPar[0] ;
            A132BarCodReo = P0AJZ5_A132BarCodReo[0] ;
            A129BarCod = P0AJZ5_A129BarCod[0] ;
            A6248SalExNln = P0AJZ5_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAJZ8 = true ;
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
         if ( ! brkAJZ8 )
         {
            brkAJZ8 = true ;
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
      AV73Trabajoexterno_detail___wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV75Trabajoexterno_detail___wcds_3_tfbarcod = AV12TFBarCod ;
      AV76Trabajoexterno_detail___wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV77Trabajoexterno_detail___wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV81Trabajoexterno_detail___wcds_9_tfclicod = AV18TFCliCod ;
      AV82Trabajoexterno_detail___wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = AV20TFBarSer ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = AV26TFFasCodn ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = AV67TFFasDscMn ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV68TFFasDscMn_Sel ;
      AV93Trabajoexterno_detail___wcds_21_tfordlin = AV28TFOrdLin ;
      AV94Trabajoexterno_detail___wcds_22_tfordlin_to = AV29TFOrdLin_To ;
      AV95Trabajoexterno_detail___wcds_23_tfsalexcoe = AV30TFSalExCoE ;
      AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = AV32TFSalExKgE ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = AV34TFSalExMtE ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = AV36TFSalExObs ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV89Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV91Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV101Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor P0AJZ6 */
      pr_default.execute(4, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb), Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV79Trabajoexterno_detail___wcds_7_tfbarcodpar, AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to), lV83Trabajoexterno_detail___wcds_11_tfbarser, AV84Trabajoexterno_detail___wcds_12_tfbarser_sel, lV85Trabajoexterno_detail___wcds_13_tfbarcolnom, AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV87Trabajoexterno_detail___wcds_15_tfbarnomcli, AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV89Trabajoexterno_detail___wcds_17_tffascodn, AV90Trabajoexterno_detail___wcds_18_tffascodn_sel, lV91Trabajoexterno_detail___wcds_19_tffasdscmn, AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV97Trabajoexterno_detail___wcds_25_tfsalexkge, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV99Trabajoexterno_detail___wcds_27_tfsalexmte, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV101Trabajoexterno_detail___wcds_29_tfsalexobs, AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAJZ10 = false ;
         A396EmprCod = P0AJZ6_A396EmprCod[0] ;
         A6558FasCodn = P0AJZ6_A6558FasCodn[0] ;
         A2253SalExtAlb = P0AJZ6_A2253SalExtAlb[0] ;
         A6249SalExObs = P0AJZ6_A6249SalExObs[0] ;
         A6258SalExMtE = P0AJZ6_A6258SalExMtE[0] ;
         A6256SalExKgE = P0AJZ6_A6256SalExKgE[0] ;
         A6257SalExCoE = P0AJZ6_A6257SalExCoE[0] ;
         A654OrdLin = P0AJZ6_A654OrdLin[0] ;
         A14410FasDscMn = P0AJZ6_A14410FasDscMn[0] ;
         A1234BarNomCli = P0AJZ6_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ6_A135BarColNom[0] ;
         A212BarSer = P0AJZ6_A212BarSer[0] ;
         A252CliCod = P0AJZ6_A252CliCod[0] ;
         n252CliCod = P0AJZ6_n252CliCod[0] ;
         A130BarCodPar = P0AJZ6_A130BarCodPar[0] ;
         A132BarCodReo = P0AJZ6_A132BarCodReo[0] ;
         A129BarCod = P0AJZ6_A129BarCod[0] ;
         A6248SalExNln = P0AJZ6_A6248SalExNln[0] ;
         A1234BarNomCli = P0AJZ6_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ6_A135BarColNom[0] ;
         A212BarSer = P0AJZ6_A212BarSer[0] ;
         A252CliCod = P0AJZ6_A252CliCod[0] ;
         n252CliCod = P0AJZ6_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AJZ6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AJZ6_A6558FasCodn[0], A6558FasCodn) == 0 ) )
         {
            brkAJZ10 = false ;
            A2253SalExtAlb = P0AJZ6_A2253SalExtAlb[0] ;
            A6248SalExNln = P0AJZ6_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAJZ10 = true ;
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
         if ( ! brkAJZ10 )
         {
            brkAJZ10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASDSCMNOPTIONS' Routine */
      returnInSub = false ;
      AV67TFFasDscMn = AV51SearchTxt ;
      AV68TFFasDscMn_Sel = "" ;
      AV73Trabajoexterno_detail___wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV75Trabajoexterno_detail___wcds_3_tfbarcod = AV12TFBarCod ;
      AV76Trabajoexterno_detail___wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV77Trabajoexterno_detail___wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV81Trabajoexterno_detail___wcds_9_tfclicod = AV18TFCliCod ;
      AV82Trabajoexterno_detail___wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = AV20TFBarSer ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = AV26TFFasCodn ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = AV67TFFasDscMn ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV68TFFasDscMn_Sel ;
      AV93Trabajoexterno_detail___wcds_21_tfordlin = AV28TFOrdLin ;
      AV94Trabajoexterno_detail___wcds_22_tfordlin_to = AV29TFOrdLin_To ;
      AV95Trabajoexterno_detail___wcds_23_tfsalexcoe = AV30TFSalExCoE ;
      AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = AV32TFSalExKgE ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = AV34TFSalExMtE ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = AV36TFSalExObs ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV89Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV91Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV101Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor P0AJZ7 */
      pr_default.execute(5, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb), Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV79Trabajoexterno_detail___wcds_7_tfbarcodpar, AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to), lV83Trabajoexterno_detail___wcds_11_tfbarser, AV84Trabajoexterno_detail___wcds_12_tfbarser_sel, lV85Trabajoexterno_detail___wcds_13_tfbarcolnom, AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV87Trabajoexterno_detail___wcds_15_tfbarnomcli, AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV89Trabajoexterno_detail___wcds_17_tffascodn, AV90Trabajoexterno_detail___wcds_18_tffascodn_sel, lV91Trabajoexterno_detail___wcds_19_tffasdscmn, AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV97Trabajoexterno_detail___wcds_25_tfsalexkge, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV99Trabajoexterno_detail___wcds_27_tfsalexmte, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV101Trabajoexterno_detail___wcds_29_tfsalexobs, AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAJZ12 = false ;
         A396EmprCod = P0AJZ7_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJZ7_A2253SalExtAlb[0] ;
         A14410FasDscMn = P0AJZ7_A14410FasDscMn[0] ;
         A6249SalExObs = P0AJZ7_A6249SalExObs[0] ;
         A6258SalExMtE = P0AJZ7_A6258SalExMtE[0] ;
         A6256SalExKgE = P0AJZ7_A6256SalExKgE[0] ;
         A6257SalExCoE = P0AJZ7_A6257SalExCoE[0] ;
         A654OrdLin = P0AJZ7_A654OrdLin[0] ;
         A6558FasCodn = P0AJZ7_A6558FasCodn[0] ;
         A1234BarNomCli = P0AJZ7_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ7_A135BarColNom[0] ;
         A212BarSer = P0AJZ7_A212BarSer[0] ;
         A252CliCod = P0AJZ7_A252CliCod[0] ;
         n252CliCod = P0AJZ7_n252CliCod[0] ;
         A130BarCodPar = P0AJZ7_A130BarCodPar[0] ;
         A132BarCodReo = P0AJZ7_A132BarCodReo[0] ;
         A129BarCod = P0AJZ7_A129BarCod[0] ;
         A6248SalExNln = P0AJZ7_A6248SalExNln[0] ;
         A1234BarNomCli = P0AJZ7_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ7_A135BarColNom[0] ;
         A212BarSer = P0AJZ7_A212BarSer[0] ;
         A252CliCod = P0AJZ7_A252CliCod[0] ;
         n252CliCod = P0AJZ7_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AJZ7_A14410FasDscMn[0], A14410FasDscMn) == 0 ) )
         {
            brkAJZ12 = false ;
            A396EmprCod = P0AJZ7_A396EmprCod[0] ;
            A2253SalExtAlb = P0AJZ7_A2253SalExtAlb[0] ;
            A6248SalExNln = P0AJZ7_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAJZ12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A14410FasDscMn)==0) )
         {
            AV39Option = A14410FasDscMn ;
            AV40Options.add(AV39Option, 0);
            AV43OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV40Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAJZ12 )
         {
            brkAJZ12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADSALEXOBSOPTIONS' Routine */
      returnInSub = false ;
      AV36TFSalExObs = AV51SearchTxt ;
      AV37TFSalExObs_Sel = "" ;
      AV73Trabajoexterno_detail___wcds_1_tfsalexnln = AV10TFSalExNln ;
      AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV11TFSalExNln_To ;
      AV75Trabajoexterno_detail___wcds_3_tfbarcod = AV12TFBarCod ;
      AV76Trabajoexterno_detail___wcds_4_tfbarcod_to = AV13TFBarCod_To ;
      AV77Trabajoexterno_detail___wcds_5_tfbarcodreo = AV14TFBarCodReo ;
      AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = AV16TFBarCodPar ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV81Trabajoexterno_detail___wcds_9_tfclicod = AV18TFCliCod ;
      AV82Trabajoexterno_detail___wcds_10_tfclicod_to = AV19TFCliCod_To ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = AV20TFBarSer ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = AV22TFBarColNom ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = AV24TFBarNomCli ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV25TFBarNomCli_Sel ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = AV26TFFasCodn ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = AV27TFFasCodn_Sel ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = AV67TFFasDscMn ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV68TFFasDscMn_Sel ;
      AV93Trabajoexterno_detail___wcds_21_tfordlin = AV28TFOrdLin ;
      AV94Trabajoexterno_detail___wcds_22_tfordlin_to = AV29TFOrdLin_To ;
      AV95Trabajoexterno_detail___wcds_23_tfsalexcoe = AV30TFSalExCoE ;
      AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV31TFSalExCoE_To ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = AV32TFSalExKgE ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV33TFSalExKgE_To ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = AV34TFSalExMtE ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV35TFSalExMtE_To ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = AV36TFSalExObs ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV37TFSalExObs_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(AV57SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV89Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV91Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV101Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor P0AJZ8 */
      pr_default.execute(6, new Object[] {AV56Emprcod, Integer.valueOf(AV57SalExtAlb), Short.valueOf(AV73Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV75Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV76Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV77Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV79Trabajoexterno_detail___wcds_7_tfbarcodpar, AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV81Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV82Trabajoexterno_detail___wcds_10_tfclicod_to), lV83Trabajoexterno_detail___wcds_11_tfbarser, AV84Trabajoexterno_detail___wcds_12_tfbarser_sel, lV85Trabajoexterno_detail___wcds_13_tfbarcolnom, AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV87Trabajoexterno_detail___wcds_15_tfbarnomcli, AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV89Trabajoexterno_detail___wcds_17_tffascodn, AV90Trabajoexterno_detail___wcds_18_tffascodn_sel, lV91Trabajoexterno_detail___wcds_19_tffasdscmn, AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV93Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV94Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV95Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV97Trabajoexterno_detail___wcds_25_tfsalexkge, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV99Trabajoexterno_detail___wcds_27_tfsalexmte, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV101Trabajoexterno_detail___wcds_29_tfsalexobs, AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAJZ14 = false ;
         A396EmprCod = P0AJZ8_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJZ8_A2253SalExtAlb[0] ;
         A6249SalExObs = P0AJZ8_A6249SalExObs[0] ;
         A6258SalExMtE = P0AJZ8_A6258SalExMtE[0] ;
         A6256SalExKgE = P0AJZ8_A6256SalExKgE[0] ;
         A6257SalExCoE = P0AJZ8_A6257SalExCoE[0] ;
         A654OrdLin = P0AJZ8_A654OrdLin[0] ;
         A14410FasDscMn = P0AJZ8_A14410FasDscMn[0] ;
         A6558FasCodn = P0AJZ8_A6558FasCodn[0] ;
         A1234BarNomCli = P0AJZ8_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ8_A135BarColNom[0] ;
         A212BarSer = P0AJZ8_A212BarSer[0] ;
         A252CliCod = P0AJZ8_A252CliCod[0] ;
         n252CliCod = P0AJZ8_n252CliCod[0] ;
         A130BarCodPar = P0AJZ8_A130BarCodPar[0] ;
         A132BarCodReo = P0AJZ8_A132BarCodReo[0] ;
         A129BarCod = P0AJZ8_A129BarCod[0] ;
         A6248SalExNln = P0AJZ8_A6248SalExNln[0] ;
         A1234BarNomCli = P0AJZ8_A1234BarNomCli[0] ;
         A135BarColNom = P0AJZ8_A135BarColNom[0] ;
         A212BarSer = P0AJZ8_A212BarSer[0] ;
         A252CliCod = P0AJZ8_A252CliCod[0] ;
         n252CliCod = P0AJZ8_n252CliCod[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AJZ8_A6249SalExObs[0], A6249SalExObs) == 0 ) )
         {
            brkAJZ14 = false ;
            A396EmprCod = P0AJZ8_A396EmprCod[0] ;
            A2253SalExtAlb = P0AJZ8_A2253SalExtAlb[0] ;
            A6248SalExNln = P0AJZ8_A6248SalExNln[0] ;
            AV44count = (long)(AV44count+1) ;
            brkAJZ14 = true ;
            pr_default.readNext(6);
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
         if ( ! brkAJZ14 )
         {
            brkAJZ14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = trabajoexterno_detail___wcgetfilterdata.this.AV53OptionsJson;
      this.aP4[0] = trabajoexterno_detail___wcgetfilterdata.this.AV54OptionsDescJson;
      this.aP5[0] = trabajoexterno_detail___wcgetfilterdata.this.AV55OptionIndexesJson;
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
      AV67TFFasDscMn = "" ;
      AV68TFFasDscMn_Sel = "" ;
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
      AV79Trabajoexterno_detail___wcds_7_tfbarcodpar = "" ;
      AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = "" ;
      AV83Trabajoexterno_detail___wcds_11_tfbarser = "" ;
      AV84Trabajoexterno_detail___wcds_12_tfbarser_sel = "" ;
      AV85Trabajoexterno_detail___wcds_13_tfbarcolnom = "" ;
      AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = "" ;
      AV87Trabajoexterno_detail___wcds_15_tfbarnomcli = "" ;
      AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = "" ;
      AV89Trabajoexterno_detail___wcds_17_tffascodn = "" ;
      AV90Trabajoexterno_detail___wcds_18_tffascodn_sel = "" ;
      AV91Trabajoexterno_detail___wcds_19_tffasdscmn = "" ;
      AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel = "" ;
      AV97Trabajoexterno_detail___wcds_25_tfsalexkge = DecimalUtil.ZERO ;
      AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to = DecimalUtil.ZERO ;
      AV99Trabajoexterno_detail___wcds_27_tfsalexmte = DecimalUtil.ZERO ;
      AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to = DecimalUtil.ZERO ;
      AV101Trabajoexterno_detail___wcds_29_tfsalexobs = "" ;
      AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel = "" ;
      scmdbuf = "" ;
      lV79Trabajoexterno_detail___wcds_7_tfbarcodpar = "" ;
      lV83Trabajoexterno_detail___wcds_11_tfbarser = "" ;
      lV85Trabajoexterno_detail___wcds_13_tfbarcolnom = "" ;
      lV87Trabajoexterno_detail___wcds_15_tfbarnomcli = "" ;
      lV89Trabajoexterno_detail___wcds_17_tffascodn = "" ;
      lV91Trabajoexterno_detail___wcds_19_tffasdscmn = "" ;
      lV101Trabajoexterno_detail___wcds_29_tfsalexobs = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6558FasCodn = "" ;
      A14410FasDscMn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6249SalExObs = "" ;
      A396EmprCod = "" ;
      P0AJZ2_A396EmprCod = new String[] {""} ;
      P0AJZ2_A2253SalExtAlb = new int[1] ;
      P0AJZ2_A130BarCodPar = new String[] {""} ;
      P0AJZ2_A6249SalExObs = new String[] {""} ;
      P0AJZ2_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ2_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ2_A6257SalExCoE = new int[1] ;
      P0AJZ2_A654OrdLin = new short[1] ;
      P0AJZ2_A14410FasDscMn = new String[] {""} ;
      P0AJZ2_A6558FasCodn = new String[] {""} ;
      P0AJZ2_A1234BarNomCli = new String[] {""} ;
      P0AJZ2_A135BarColNom = new String[] {""} ;
      P0AJZ2_A212BarSer = new String[] {""} ;
      P0AJZ2_A252CliCod = new int[1] ;
      P0AJZ2_n252CliCod = new boolean[] {false} ;
      P0AJZ2_A132BarCodReo = new byte[1] ;
      P0AJZ2_A129BarCod = new int[1] ;
      P0AJZ2_A6248SalExNln = new short[1] ;
      AV39Option = "" ;
      P0AJZ3_A396EmprCod = new String[] {""} ;
      P0AJZ3_A2253SalExtAlb = new int[1] ;
      P0AJZ3_A212BarSer = new String[] {""} ;
      P0AJZ3_A6249SalExObs = new String[] {""} ;
      P0AJZ3_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ3_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ3_A6257SalExCoE = new int[1] ;
      P0AJZ3_A654OrdLin = new short[1] ;
      P0AJZ3_A14410FasDscMn = new String[] {""} ;
      P0AJZ3_A6558FasCodn = new String[] {""} ;
      P0AJZ3_A1234BarNomCli = new String[] {""} ;
      P0AJZ3_A135BarColNom = new String[] {""} ;
      P0AJZ3_A252CliCod = new int[1] ;
      P0AJZ3_n252CliCod = new boolean[] {false} ;
      P0AJZ3_A130BarCodPar = new String[] {""} ;
      P0AJZ3_A132BarCodReo = new byte[1] ;
      P0AJZ3_A129BarCod = new int[1] ;
      P0AJZ3_A6248SalExNln = new short[1] ;
      P0AJZ4_A396EmprCod = new String[] {""} ;
      P0AJZ4_A2253SalExtAlb = new int[1] ;
      P0AJZ4_A135BarColNom = new String[] {""} ;
      P0AJZ4_A6249SalExObs = new String[] {""} ;
      P0AJZ4_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ4_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ4_A6257SalExCoE = new int[1] ;
      P0AJZ4_A654OrdLin = new short[1] ;
      P0AJZ4_A14410FasDscMn = new String[] {""} ;
      P0AJZ4_A6558FasCodn = new String[] {""} ;
      P0AJZ4_A1234BarNomCli = new String[] {""} ;
      P0AJZ4_A212BarSer = new String[] {""} ;
      P0AJZ4_A252CliCod = new int[1] ;
      P0AJZ4_n252CliCod = new boolean[] {false} ;
      P0AJZ4_A130BarCodPar = new String[] {""} ;
      P0AJZ4_A132BarCodReo = new byte[1] ;
      P0AJZ4_A129BarCod = new int[1] ;
      P0AJZ4_A6248SalExNln = new short[1] ;
      P0AJZ5_A396EmprCod = new String[] {""} ;
      P0AJZ5_A2253SalExtAlb = new int[1] ;
      P0AJZ5_A1234BarNomCli = new String[] {""} ;
      P0AJZ5_A6249SalExObs = new String[] {""} ;
      P0AJZ5_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ5_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ5_A6257SalExCoE = new int[1] ;
      P0AJZ5_A654OrdLin = new short[1] ;
      P0AJZ5_A14410FasDscMn = new String[] {""} ;
      P0AJZ5_A6558FasCodn = new String[] {""} ;
      P0AJZ5_A135BarColNom = new String[] {""} ;
      P0AJZ5_A212BarSer = new String[] {""} ;
      P0AJZ5_A252CliCod = new int[1] ;
      P0AJZ5_n252CliCod = new boolean[] {false} ;
      P0AJZ5_A130BarCodPar = new String[] {""} ;
      P0AJZ5_A132BarCodReo = new byte[1] ;
      P0AJZ5_A129BarCod = new int[1] ;
      P0AJZ5_A6248SalExNln = new short[1] ;
      P0AJZ6_A396EmprCod = new String[] {""} ;
      P0AJZ6_A6558FasCodn = new String[] {""} ;
      P0AJZ6_A2253SalExtAlb = new int[1] ;
      P0AJZ6_A6249SalExObs = new String[] {""} ;
      P0AJZ6_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ6_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ6_A6257SalExCoE = new int[1] ;
      P0AJZ6_A654OrdLin = new short[1] ;
      P0AJZ6_A14410FasDscMn = new String[] {""} ;
      P0AJZ6_A1234BarNomCli = new String[] {""} ;
      P0AJZ6_A135BarColNom = new String[] {""} ;
      P0AJZ6_A212BarSer = new String[] {""} ;
      P0AJZ6_A252CliCod = new int[1] ;
      P0AJZ6_n252CliCod = new boolean[] {false} ;
      P0AJZ6_A130BarCodPar = new String[] {""} ;
      P0AJZ6_A132BarCodReo = new byte[1] ;
      P0AJZ6_A129BarCod = new int[1] ;
      P0AJZ6_A6248SalExNln = new short[1] ;
      P0AJZ7_A396EmprCod = new String[] {""} ;
      P0AJZ7_A2253SalExtAlb = new int[1] ;
      P0AJZ7_A14410FasDscMn = new String[] {""} ;
      P0AJZ7_A6249SalExObs = new String[] {""} ;
      P0AJZ7_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ7_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ7_A6257SalExCoE = new int[1] ;
      P0AJZ7_A654OrdLin = new short[1] ;
      P0AJZ7_A6558FasCodn = new String[] {""} ;
      P0AJZ7_A1234BarNomCli = new String[] {""} ;
      P0AJZ7_A135BarColNom = new String[] {""} ;
      P0AJZ7_A212BarSer = new String[] {""} ;
      P0AJZ7_A252CliCod = new int[1] ;
      P0AJZ7_n252CliCod = new boolean[] {false} ;
      P0AJZ7_A130BarCodPar = new String[] {""} ;
      P0AJZ7_A132BarCodReo = new byte[1] ;
      P0AJZ7_A129BarCod = new int[1] ;
      P0AJZ7_A6248SalExNln = new short[1] ;
      P0AJZ8_A396EmprCod = new String[] {""} ;
      P0AJZ8_A2253SalExtAlb = new int[1] ;
      P0AJZ8_A6249SalExObs = new String[] {""} ;
      P0AJZ8_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ8_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJZ8_A6257SalExCoE = new int[1] ;
      P0AJZ8_A654OrdLin = new short[1] ;
      P0AJZ8_A14410FasDscMn = new String[] {""} ;
      P0AJZ8_A6558FasCodn = new String[] {""} ;
      P0AJZ8_A1234BarNomCli = new String[] {""} ;
      P0AJZ8_A135BarColNom = new String[] {""} ;
      P0AJZ8_A212BarSer = new String[] {""} ;
      P0AJZ8_A252CliCod = new int[1] ;
      P0AJZ8_n252CliCod = new boolean[] {false} ;
      P0AJZ8_A130BarCodPar = new String[] {""} ;
      P0AJZ8_A132BarCodReo = new byte[1] ;
      P0AJZ8_A129BarCod = new int[1] ;
      P0AJZ8_A6248SalExNln = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajoexterno_detail___wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AJZ2_A396EmprCod, P0AJZ2_A2253SalExtAlb, P0AJZ2_A130BarCodPar, P0AJZ2_A6249SalExObs, P0AJZ2_A6258SalExMtE, P0AJZ2_A6256SalExKgE, P0AJZ2_A6257SalExCoE, P0AJZ2_A654OrdLin, P0AJZ2_A14410FasDscMn, P0AJZ2_A6558FasCodn,
            P0AJZ2_A1234BarNomCli, P0AJZ2_A135BarColNom, P0AJZ2_A212BarSer, P0AJZ2_A252CliCod, P0AJZ2_n252CliCod, P0AJZ2_A132BarCodReo, P0AJZ2_A129BarCod, P0AJZ2_A6248SalExNln
            }
            , new Object[] {
            P0AJZ3_A396EmprCod, P0AJZ3_A2253SalExtAlb, P0AJZ3_A212BarSer, P0AJZ3_A6249SalExObs, P0AJZ3_A6258SalExMtE, P0AJZ3_A6256SalExKgE, P0AJZ3_A6257SalExCoE, P0AJZ3_A654OrdLin, P0AJZ3_A14410FasDscMn, P0AJZ3_A6558FasCodn,
            P0AJZ3_A1234BarNomCli, P0AJZ3_A135BarColNom, P0AJZ3_A252CliCod, P0AJZ3_n252CliCod, P0AJZ3_A130BarCodPar, P0AJZ3_A132BarCodReo, P0AJZ3_A129BarCod, P0AJZ3_A6248SalExNln
            }
            , new Object[] {
            P0AJZ4_A396EmprCod, P0AJZ4_A2253SalExtAlb, P0AJZ4_A135BarColNom, P0AJZ4_A6249SalExObs, P0AJZ4_A6258SalExMtE, P0AJZ4_A6256SalExKgE, P0AJZ4_A6257SalExCoE, P0AJZ4_A654OrdLin, P0AJZ4_A14410FasDscMn, P0AJZ4_A6558FasCodn,
            P0AJZ4_A1234BarNomCli, P0AJZ4_A212BarSer, P0AJZ4_A252CliCod, P0AJZ4_n252CliCod, P0AJZ4_A130BarCodPar, P0AJZ4_A132BarCodReo, P0AJZ4_A129BarCod, P0AJZ4_A6248SalExNln
            }
            , new Object[] {
            P0AJZ5_A396EmprCod, P0AJZ5_A2253SalExtAlb, P0AJZ5_A1234BarNomCli, P0AJZ5_A6249SalExObs, P0AJZ5_A6258SalExMtE, P0AJZ5_A6256SalExKgE, P0AJZ5_A6257SalExCoE, P0AJZ5_A654OrdLin, P0AJZ5_A14410FasDscMn, P0AJZ5_A6558FasCodn,
            P0AJZ5_A135BarColNom, P0AJZ5_A212BarSer, P0AJZ5_A252CliCod, P0AJZ5_n252CliCod, P0AJZ5_A130BarCodPar, P0AJZ5_A132BarCodReo, P0AJZ5_A129BarCod, P0AJZ5_A6248SalExNln
            }
            , new Object[] {
            P0AJZ6_A396EmprCod, P0AJZ6_A6558FasCodn, P0AJZ6_A2253SalExtAlb, P0AJZ6_A6249SalExObs, P0AJZ6_A6258SalExMtE, P0AJZ6_A6256SalExKgE, P0AJZ6_A6257SalExCoE, P0AJZ6_A654OrdLin, P0AJZ6_A14410FasDscMn, P0AJZ6_A1234BarNomCli,
            P0AJZ6_A135BarColNom, P0AJZ6_A212BarSer, P0AJZ6_A252CliCod, P0AJZ6_n252CliCod, P0AJZ6_A130BarCodPar, P0AJZ6_A132BarCodReo, P0AJZ6_A129BarCod, P0AJZ6_A6248SalExNln
            }
            , new Object[] {
            P0AJZ7_A396EmprCod, P0AJZ7_A2253SalExtAlb, P0AJZ7_A14410FasDscMn, P0AJZ7_A6249SalExObs, P0AJZ7_A6258SalExMtE, P0AJZ7_A6256SalExKgE, P0AJZ7_A6257SalExCoE, P0AJZ7_A654OrdLin, P0AJZ7_A6558FasCodn, P0AJZ7_A1234BarNomCli,
            P0AJZ7_A135BarColNom, P0AJZ7_A212BarSer, P0AJZ7_A252CliCod, P0AJZ7_n252CliCod, P0AJZ7_A130BarCodPar, P0AJZ7_A132BarCodReo, P0AJZ7_A129BarCod, P0AJZ7_A6248SalExNln
            }
            , new Object[] {
            P0AJZ8_A396EmprCod, P0AJZ8_A2253SalExtAlb, P0AJZ8_A6249SalExObs, P0AJZ8_A6258SalExMtE, P0AJZ8_A6256SalExKgE, P0AJZ8_A6257SalExCoE, P0AJZ8_A654OrdLin, P0AJZ8_A14410FasDscMn, P0AJZ8_A6558FasCodn, P0AJZ8_A1234BarNomCli,
            P0AJZ8_A135BarColNom, P0AJZ8_A212BarSer, P0AJZ8_A252CliCod, P0AJZ8_n252CliCod, P0AJZ8_A130BarCodPar, P0AJZ8_A132BarCodReo, P0AJZ8_A129BarCod, P0AJZ8_A6248SalExNln
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFBarCodReo ;
   private byte AV15TFBarCodReo_To ;
   private byte AV63SalEnvAT ;
   private byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ;
   private byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ;
   private byte A132BarCodReo ;
   private short AV10TFSalExNln ;
   private short AV11TFSalExNln_To ;
   private short AV28TFOrdLin ;
   private short AV29TFOrdLin_To ;
   private short AV60Mancod ;
   private short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ;
   private short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ;
   private short AV93Trabajoexterno_detail___wcds_21_tfordlin ;
   private short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short Gx_err ;
   private int AV71GXV1 ;
   private int AV12TFBarCod ;
   private int AV13TFBarCod_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV30TFSalExCoE ;
   private int AV31TFSalExCoE_To ;
   private int AV57SalExtAlb ;
   private int AV75Trabajoexterno_detail___wcds_3_tfbarcod ;
   private int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ;
   private int AV81Trabajoexterno_detail___wcds_9_tfclicod ;
   private int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ;
   private int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ;
   private int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A6257SalExCoE ;
   private int A2253SalExtAlb ;
   private long AV44count ;
   private java.math.BigDecimal AV32TFSalExKgE ;
   private java.math.BigDecimal AV33TFSalExKgE_To ;
   private java.math.BigDecimal AV34TFSalExMtE ;
   private java.math.BigDecimal AV35TFSalExMtE_To ;
   private java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ;
   private java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ;
   private java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ;
   private java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ;
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
   private String AV67TFFasDscMn ;
   private String AV68TFFasDscMn_Sel ;
   private String AV36TFSalExObs ;
   private String AV37TFSalExObs_Sel ;
   private String AV56Emprcod ;
   private String AV61ManNom ;
   private String AV62SalCodeID ;
   private String A130BarCodPar ;
   private String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ;
   private String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ;
   private String AV83Trabajoexterno_detail___wcds_11_tfbarser ;
   private String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ;
   private String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ;
   private String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ;
   private String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ;
   private String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ;
   private String AV89Trabajoexterno_detail___wcds_17_tffascodn ;
   private String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ;
   private String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ;
   private String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ;
   private String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ;
   private String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ;
   private String scmdbuf ;
   private String lV79Trabajoexterno_detail___wcds_7_tfbarcodpar ;
   private String lV83Trabajoexterno_detail___wcds_11_tfbarser ;
   private String lV85Trabajoexterno_detail___wcds_13_tfbarcolnom ;
   private String lV87Trabajoexterno_detail___wcds_15_tfbarnomcli ;
   private String lV89Trabajoexterno_detail___wcds_17_tffascodn ;
   private String lV91Trabajoexterno_detail___wcds_19_tffasdscmn ;
   private String lV101Trabajoexterno_detail___wcds_29_tfsalexobs ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A6558FasCodn ;
   private String A14410FasDscMn ;
   private String A6249SalExObs ;
   private String A396EmprCod ;
   private java.util.Date AV59SalFhh ;
   private java.util.Date AV58SalExtFec ;
   private boolean returnInSub ;
   private boolean AV65okIN ;
   private boolean brkAJZ2 ;
   private boolean n252CliCod ;
   private boolean brkAJZ4 ;
   private boolean brkAJZ6 ;
   private boolean brkAJZ8 ;
   private boolean brkAJZ10 ;
   private boolean brkAJZ12 ;
   private boolean brkAJZ14 ;
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
   private String[] P0AJZ2_A396EmprCod ;
   private int[] P0AJZ2_A2253SalExtAlb ;
   private String[] P0AJZ2_A130BarCodPar ;
   private String[] P0AJZ2_A6249SalExObs ;
   private java.math.BigDecimal[] P0AJZ2_A6258SalExMtE ;
   private java.math.BigDecimal[] P0AJZ2_A6256SalExKgE ;
   private int[] P0AJZ2_A6257SalExCoE ;
   private short[] P0AJZ2_A654OrdLin ;
   private String[] P0AJZ2_A14410FasDscMn ;
   private String[] P0AJZ2_A6558FasCodn ;
   private String[] P0AJZ2_A1234BarNomCli ;
   private String[] P0AJZ2_A135BarColNom ;
   private String[] P0AJZ2_A212BarSer ;
   private int[] P0AJZ2_A252CliCod ;
   private boolean[] P0AJZ2_n252CliCod ;
   private byte[] P0AJZ2_A132BarCodReo ;
   private int[] P0AJZ2_A129BarCod ;
   private short[] P0AJZ2_A6248SalExNln ;
   private String[] P0AJZ3_A396EmprCod ;
   private int[] P0AJZ3_A2253SalExtAlb ;
   private String[] P0AJZ3_A212BarSer ;
   private String[] P0AJZ3_A6249SalExObs ;
   private java.math.BigDecimal[] P0AJZ3_A6258SalExMtE ;
   private java.math.BigDecimal[] P0AJZ3_A6256SalExKgE ;
   private int[] P0AJZ3_A6257SalExCoE ;
   private short[] P0AJZ3_A654OrdLin ;
   private String[] P0AJZ3_A14410FasDscMn ;
   private String[] P0AJZ3_A6558FasCodn ;
   private String[] P0AJZ3_A1234BarNomCli ;
   private String[] P0AJZ3_A135BarColNom ;
   private int[] P0AJZ3_A252CliCod ;
   private boolean[] P0AJZ3_n252CliCod ;
   private String[] P0AJZ3_A130BarCodPar ;
   private byte[] P0AJZ3_A132BarCodReo ;
   private int[] P0AJZ3_A129BarCod ;
   private short[] P0AJZ3_A6248SalExNln ;
   private String[] P0AJZ4_A396EmprCod ;
   private int[] P0AJZ4_A2253SalExtAlb ;
   private String[] P0AJZ4_A135BarColNom ;
   private String[] P0AJZ4_A6249SalExObs ;
   private java.math.BigDecimal[] P0AJZ4_A6258SalExMtE ;
   private java.math.BigDecimal[] P0AJZ4_A6256SalExKgE ;
   private int[] P0AJZ4_A6257SalExCoE ;
   private short[] P0AJZ4_A654OrdLin ;
   private String[] P0AJZ4_A14410FasDscMn ;
   private String[] P0AJZ4_A6558FasCodn ;
   private String[] P0AJZ4_A1234BarNomCli ;
   private String[] P0AJZ4_A212BarSer ;
   private int[] P0AJZ4_A252CliCod ;
   private boolean[] P0AJZ4_n252CliCod ;
   private String[] P0AJZ4_A130BarCodPar ;
   private byte[] P0AJZ4_A132BarCodReo ;
   private int[] P0AJZ4_A129BarCod ;
   private short[] P0AJZ4_A6248SalExNln ;
   private String[] P0AJZ5_A396EmprCod ;
   private int[] P0AJZ5_A2253SalExtAlb ;
   private String[] P0AJZ5_A1234BarNomCli ;
   private String[] P0AJZ5_A6249SalExObs ;
   private java.math.BigDecimal[] P0AJZ5_A6258SalExMtE ;
   private java.math.BigDecimal[] P0AJZ5_A6256SalExKgE ;
   private int[] P0AJZ5_A6257SalExCoE ;
   private short[] P0AJZ5_A654OrdLin ;
   private String[] P0AJZ5_A14410FasDscMn ;
   private String[] P0AJZ5_A6558FasCodn ;
   private String[] P0AJZ5_A135BarColNom ;
   private String[] P0AJZ5_A212BarSer ;
   private int[] P0AJZ5_A252CliCod ;
   private boolean[] P0AJZ5_n252CliCod ;
   private String[] P0AJZ5_A130BarCodPar ;
   private byte[] P0AJZ5_A132BarCodReo ;
   private int[] P0AJZ5_A129BarCod ;
   private short[] P0AJZ5_A6248SalExNln ;
   private String[] P0AJZ6_A396EmprCod ;
   private String[] P0AJZ6_A6558FasCodn ;
   private int[] P0AJZ6_A2253SalExtAlb ;
   private String[] P0AJZ6_A6249SalExObs ;
   private java.math.BigDecimal[] P0AJZ6_A6258SalExMtE ;
   private java.math.BigDecimal[] P0AJZ6_A6256SalExKgE ;
   private int[] P0AJZ6_A6257SalExCoE ;
   private short[] P0AJZ6_A654OrdLin ;
   private String[] P0AJZ6_A14410FasDscMn ;
   private String[] P0AJZ6_A1234BarNomCli ;
   private String[] P0AJZ6_A135BarColNom ;
   private String[] P0AJZ6_A212BarSer ;
   private int[] P0AJZ6_A252CliCod ;
   private boolean[] P0AJZ6_n252CliCod ;
   private String[] P0AJZ6_A130BarCodPar ;
   private byte[] P0AJZ6_A132BarCodReo ;
   private int[] P0AJZ6_A129BarCod ;
   private short[] P0AJZ6_A6248SalExNln ;
   private String[] P0AJZ7_A396EmprCod ;
   private int[] P0AJZ7_A2253SalExtAlb ;
   private String[] P0AJZ7_A14410FasDscMn ;
   private String[] P0AJZ7_A6249SalExObs ;
   private java.math.BigDecimal[] P0AJZ7_A6258SalExMtE ;
   private java.math.BigDecimal[] P0AJZ7_A6256SalExKgE ;
   private int[] P0AJZ7_A6257SalExCoE ;
   private short[] P0AJZ7_A654OrdLin ;
   private String[] P0AJZ7_A6558FasCodn ;
   private String[] P0AJZ7_A1234BarNomCli ;
   private String[] P0AJZ7_A135BarColNom ;
   private String[] P0AJZ7_A212BarSer ;
   private int[] P0AJZ7_A252CliCod ;
   private boolean[] P0AJZ7_n252CliCod ;
   private String[] P0AJZ7_A130BarCodPar ;
   private byte[] P0AJZ7_A132BarCodReo ;
   private int[] P0AJZ7_A129BarCod ;
   private short[] P0AJZ7_A6248SalExNln ;
   private String[] P0AJZ8_A396EmprCod ;
   private int[] P0AJZ8_A2253SalExtAlb ;
   private String[] P0AJZ8_A6249SalExObs ;
   private java.math.BigDecimal[] P0AJZ8_A6258SalExMtE ;
   private java.math.BigDecimal[] P0AJZ8_A6256SalExKgE ;
   private int[] P0AJZ8_A6257SalExCoE ;
   private short[] P0AJZ8_A654OrdLin ;
   private String[] P0AJZ8_A14410FasDscMn ;
   private String[] P0AJZ8_A6558FasCodn ;
   private String[] P0AJZ8_A1234BarNomCli ;
   private String[] P0AJZ8_A135BarColNom ;
   private String[] P0AJZ8_A212BarSer ;
   private int[] P0AJZ8_A252CliCod ;
   private boolean[] P0AJZ8_n252CliCod ;
   private String[] P0AJZ8_A130BarCodPar ;
   private byte[] P0AJZ8_A132BarCodReo ;
   private int[] P0AJZ8_A129BarCod ;
   private short[] P0AJZ8_A6248SalExNln ;
   private GXSimpleCollection<String> AV40Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV43OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class trabajoexterno_detail___wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AJZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV75Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV81Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV93Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T1.BarCodPar, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasDscMn, T1.FasCodn, T2.BarNomCli, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T2.CliCod, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV73Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV94Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AJZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV75Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV81Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV93Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T2.BarSer, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasDscMn, T1.FasCodn, T2.BarNomCli, T2.BarColNom, T2.CliCod," ;
      scmdbuf += " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV73Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV94Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AJZ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV75Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV81Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV93Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T2.BarColNom, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasDscMn, T1.FasCodn, T2.BarNomCli, T2.BarSer, T2.CliCod," ;
      scmdbuf += " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV73Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV94Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AJZ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV75Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV81Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV93Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T2.BarNomCli, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasDscMn, T1.FasCodn, T2.BarColNom, T2.BarSer, T2.CliCod," ;
      scmdbuf += " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV73Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV94Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AJZ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV75Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV81Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV93Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[32];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCodn, T1.SalExtAlb, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasDscMn, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.CliCod," ;
      scmdbuf += " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV73Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV94Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCodn" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AJZ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV75Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV81Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV93Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[32];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T1.FasDscMn, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasCodn, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.CliCod," ;
      scmdbuf += " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV73Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV94Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasDscMn" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0AJZ8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV73Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV75Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV76Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV77Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV79Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV81Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV82Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV84Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV83Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV85Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV87Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV90Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV89Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV91Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV93Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV94Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV95Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV97Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV99Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV101Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          int A2253SalExtAlb ,
                                          int AV57SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[32];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtAlb, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasDscMn, T1.FasCodn, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.CliCod," ;
      scmdbuf += " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      if ( ! (0==AV73Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV94Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV95Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV96Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SalExObs" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P0AJZ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() );
            case 1 :
                  return conditional_P0AJZ3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() );
            case 2 :
                  return conditional_P0AJZ4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() );
            case 3 :
                  return conditional_P0AJZ5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() );
            case 4 :
                  return conditional_P0AJZ6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 5 :
                  return conditional_P0AJZ7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() );
            case 6 :
                  return conditional_P0AJZ8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJZ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJZ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJZ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJZ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJZ8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
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
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
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
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
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
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
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
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
      }
   }

}

