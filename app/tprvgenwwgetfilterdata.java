package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprvgenwwgetfilterdata extends GXProcedure
{
   public tprvgenwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprvgenwwgetfilterdata.class ), "" );
   }

   public tprvgenwwgetfilterdata( int remoteHandle ,
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
      tprvgenwwgetfilterdata.this.aP5 = new String[] {""};
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
      tprvgenwwgetfilterdata.this.AV62DDOName = aP0;
      tprvgenwwgetfilterdata.this.AV60SearchTxt = aP1;
      tprvgenwwgetfilterdata.this.AV61SearchTxtTo = aP2;
      tprvgenwwgetfilterdata.this.aP3 = aP3;
      tprvgenwwgetfilterdata.this.aP4 = aP4;
      tprvgenwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVDIR") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVDIROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVCPO") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVCPOOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVPOBOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVNIF") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNIFOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVTLF") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVTLFOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVTLX") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVTLXOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_FPGCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFPGCODOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVREP") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVREPOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVCTA") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVCTAOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV66OptionsJson = AV65Options.toJSonString(false) ;
      AV69OptionsDescJson = AV68OptionsDesc.toJSonString(false) ;
      AV71OptionIndexesJson = AV70OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV73Session.getValue("TPRVGENWWGridState"), "") == 0 )
      {
         AV75GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPRVGENWWGridState"), null, null);
      }
      else
      {
         AV75GridState.fromxml(AV73Session.getValue("TPRVGENWWGridState"), null, null);
      }
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV76GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV12TFPrvNum = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFPrvNum_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV14TFPrvNom = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV15TFPrvNom_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV18TFPrvDir = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV19TFPrvDir_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV20TFPrvCpo = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV21TFPrvCpo_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV22TFPrvPob = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV23TFPrvPob_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV24TFPrvNif = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV25TFPrvNif_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV26TFPrvTlf = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV27TFPrvTlf_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPRI_SEL") == 0 )
         {
            AV79TFPrvPri_Sel = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV30TFPrvTlx = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV31TFPrvTlx_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTIP_SEL") == 0 )
         {
            AV80TFPrvTip_SelsJson = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV81TFPrvTip_Sels.fromJSonString(AV80TFPrvTip_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV34TFFpgCod = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV35TFFpgCod_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV38TFPrvVto = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFPrvVto_To = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV40TFPrvDiaPag = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFPrvDiaPag_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV42TFPrvPer = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFPrvPer_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVBAN") == 0 )
         {
            AV44TFPrvBan = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPrvBan_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV46TFPrvRep = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV47TFPrvRep_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV48TFPrvPlaEnt = (short)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFPrvPlaEnt_To = (short)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV82TFPrvMetTra_SelsJson = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV83TFPrvMetTra_Sels.fromJSonString(AV82TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV52TFPrvCta = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV53TFPrvCta_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCOD_SEL") == 0 )
         {
            AV54TFPrvDivCod_SelsJson = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFPrvDivCod_Sels.fromJSonString(AV54TFPrvDivCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCO") == 0 )
         {
            AV56TFPrvDivCo = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFPrvDivCo_To = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVACT_SEL") == 0 )
         {
            AV86TFPrvAct_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrvNom = AV60SearchTxt ;
      AV15TFPrvNom_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8AF2 = false ;
         A794PrvNom = P08AF2_A794PrvNom[0] ;
         n794PrvNom = P08AF2_n794PrvNom[0] ;
         A14216PrvAct = P08AF2_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF2_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF2_A783PrvCta[0] ;
         n783PrvCta = P08AF2_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF2_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF2_A801PrvRep[0] ;
         n801PrvRep = P08AF2_n801PrvRep[0] ;
         A780PrvBan = P08AF2_A780PrvBan[0] ;
         n780PrvBan = P08AF2_n780PrvBan[0] ;
         A797PrvPer = P08AF2_A797PrvPer[0] ;
         n797PrvPer = P08AF2_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF2_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF2_A805PrvVto[0] ;
         n805PrvVto = P08AF2_n805PrvVto[0] ;
         A497FpgCod = P08AF2_A497FpgCod[0] ;
         n497FpgCod = P08AF2_n497FpgCod[0] ;
         A804PrvTlx = P08AF2_A804PrvTlx[0] ;
         n804PrvTlx = P08AF2_n804PrvTlx[0] ;
         A800PrvPri = P08AF2_A800PrvPri[0] ;
         n800PrvPri = P08AF2_n800PrvPri[0] ;
         A803PrvTlf = P08AF2_A803PrvTlf[0] ;
         n803PrvTlf = P08AF2_n803PrvTlf[0] ;
         A793PrvNif = P08AF2_A793PrvNif[0] ;
         n793PrvNif = P08AF2_n793PrvNif[0] ;
         A799PrvPob = P08AF2_A799PrvPob[0] ;
         n799PrvPob = P08AF2_n799PrvPob[0] ;
         A782PrvCpo = P08AF2_A782PrvCpo[0] ;
         n782PrvCpo = P08AF2_n782PrvCpo[0] ;
         A786PrvDir = P08AF2_A786PrvDir[0] ;
         n786PrvDir = P08AF2_n786PrvDir[0] ;
         A795PrvNum = P08AF2_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF2_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF2_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF2_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF2_n792PrvMetTra[0] ;
         A802PrvTip = P08AF2_A802PrvTip[0] ;
         n802PrvTip = P08AF2_n802PrvTip[0] ;
         A396EmprCod = P08AF2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08AF2_A794PrvNom[0], A794PrvNom) == 0 ) )
            {
               brk8AF2 = false ;
               A795PrvNum = P08AF2_A795PrvNum[0] ;
               A396EmprCod = P08AF2_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
            {
               AV64Option = A794PrvNom ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF2 )
         {
            brk8AF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRVDIROPTIONS' Routine */
      returnInSub = false ;
      AV18TFPrvDir = AV60SearchTxt ;
      AV19TFPrvDir_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8AF4 = false ;
         A786PrvDir = P08AF3_A786PrvDir[0] ;
         n786PrvDir = P08AF3_n786PrvDir[0] ;
         A14216PrvAct = P08AF3_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF3_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF3_A783PrvCta[0] ;
         n783PrvCta = P08AF3_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF3_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF3_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF3_A801PrvRep[0] ;
         n801PrvRep = P08AF3_n801PrvRep[0] ;
         A780PrvBan = P08AF3_A780PrvBan[0] ;
         n780PrvBan = P08AF3_n780PrvBan[0] ;
         A797PrvPer = P08AF3_A797PrvPer[0] ;
         n797PrvPer = P08AF3_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF3_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF3_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF3_A805PrvVto[0] ;
         n805PrvVto = P08AF3_n805PrvVto[0] ;
         A497FpgCod = P08AF3_A497FpgCod[0] ;
         n497FpgCod = P08AF3_n497FpgCod[0] ;
         A804PrvTlx = P08AF3_A804PrvTlx[0] ;
         n804PrvTlx = P08AF3_n804PrvTlx[0] ;
         A800PrvPri = P08AF3_A800PrvPri[0] ;
         n800PrvPri = P08AF3_n800PrvPri[0] ;
         A803PrvTlf = P08AF3_A803PrvTlf[0] ;
         n803PrvTlf = P08AF3_n803PrvTlf[0] ;
         A793PrvNif = P08AF3_A793PrvNif[0] ;
         n793PrvNif = P08AF3_n793PrvNif[0] ;
         A799PrvPob = P08AF3_A799PrvPob[0] ;
         n799PrvPob = P08AF3_n799PrvPob[0] ;
         A782PrvCpo = P08AF3_A782PrvCpo[0] ;
         n782PrvCpo = P08AF3_n782PrvCpo[0] ;
         A794PrvNom = P08AF3_A794PrvNom[0] ;
         n794PrvNom = P08AF3_n794PrvNom[0] ;
         A795PrvNum = P08AF3_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF3_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF3_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF3_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF3_n792PrvMetTra[0] ;
         A802PrvTip = P08AF3_A802PrvTip[0] ;
         n802PrvTip = P08AF3_n802PrvTip[0] ;
         A396EmprCod = P08AF3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08AF3_A786PrvDir[0], A786PrvDir) == 0 ) )
            {
               brk8AF4 = false ;
               A795PrvNum = P08AF3_A795PrvNum[0] ;
               A396EmprCod = P08AF3_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A786PrvDir)==0) )
            {
               AV64Option = A786PrvDir ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF4 )
         {
            brk8AF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRVCPOOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPrvCpo = AV60SearchTxt ;
      AV21TFPrvCpo_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8AF6 = false ;
         A782PrvCpo = P08AF4_A782PrvCpo[0] ;
         n782PrvCpo = P08AF4_n782PrvCpo[0] ;
         A14216PrvAct = P08AF4_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF4_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF4_A783PrvCta[0] ;
         n783PrvCta = P08AF4_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF4_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF4_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF4_A801PrvRep[0] ;
         n801PrvRep = P08AF4_n801PrvRep[0] ;
         A780PrvBan = P08AF4_A780PrvBan[0] ;
         n780PrvBan = P08AF4_n780PrvBan[0] ;
         A797PrvPer = P08AF4_A797PrvPer[0] ;
         n797PrvPer = P08AF4_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF4_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF4_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF4_A805PrvVto[0] ;
         n805PrvVto = P08AF4_n805PrvVto[0] ;
         A497FpgCod = P08AF4_A497FpgCod[0] ;
         n497FpgCod = P08AF4_n497FpgCod[0] ;
         A804PrvTlx = P08AF4_A804PrvTlx[0] ;
         n804PrvTlx = P08AF4_n804PrvTlx[0] ;
         A800PrvPri = P08AF4_A800PrvPri[0] ;
         n800PrvPri = P08AF4_n800PrvPri[0] ;
         A803PrvTlf = P08AF4_A803PrvTlf[0] ;
         n803PrvTlf = P08AF4_n803PrvTlf[0] ;
         A793PrvNif = P08AF4_A793PrvNif[0] ;
         n793PrvNif = P08AF4_n793PrvNif[0] ;
         A799PrvPob = P08AF4_A799PrvPob[0] ;
         n799PrvPob = P08AF4_n799PrvPob[0] ;
         A786PrvDir = P08AF4_A786PrvDir[0] ;
         n786PrvDir = P08AF4_n786PrvDir[0] ;
         A794PrvNom = P08AF4_A794PrvNom[0] ;
         n794PrvNom = P08AF4_n794PrvNom[0] ;
         A795PrvNum = P08AF4_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF4_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF4_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF4_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF4_n792PrvMetTra[0] ;
         A802PrvTip = P08AF4_A802PrvTip[0] ;
         n802PrvTip = P08AF4_n802PrvTip[0] ;
         A396EmprCod = P08AF4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08AF4_A782PrvCpo[0], A782PrvCpo) == 0 ) )
            {
               brk8AF6 = false ;
               A795PrvNum = P08AF4_A795PrvNum[0] ;
               A396EmprCod = P08AF4_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A782PrvCpo)==0) )
            {
               AV64Option = A782PrvCpo ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF6 )
         {
            brk8AF6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRVPOBOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrvPob = AV60SearchTxt ;
      AV23TFPrvPob_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8AF8 = false ;
         A799PrvPob = P08AF5_A799PrvPob[0] ;
         n799PrvPob = P08AF5_n799PrvPob[0] ;
         A14216PrvAct = P08AF5_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF5_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF5_A783PrvCta[0] ;
         n783PrvCta = P08AF5_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF5_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF5_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF5_A801PrvRep[0] ;
         n801PrvRep = P08AF5_n801PrvRep[0] ;
         A780PrvBan = P08AF5_A780PrvBan[0] ;
         n780PrvBan = P08AF5_n780PrvBan[0] ;
         A797PrvPer = P08AF5_A797PrvPer[0] ;
         n797PrvPer = P08AF5_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF5_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF5_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF5_A805PrvVto[0] ;
         n805PrvVto = P08AF5_n805PrvVto[0] ;
         A497FpgCod = P08AF5_A497FpgCod[0] ;
         n497FpgCod = P08AF5_n497FpgCod[0] ;
         A804PrvTlx = P08AF5_A804PrvTlx[0] ;
         n804PrvTlx = P08AF5_n804PrvTlx[0] ;
         A800PrvPri = P08AF5_A800PrvPri[0] ;
         n800PrvPri = P08AF5_n800PrvPri[0] ;
         A803PrvTlf = P08AF5_A803PrvTlf[0] ;
         n803PrvTlf = P08AF5_n803PrvTlf[0] ;
         A793PrvNif = P08AF5_A793PrvNif[0] ;
         n793PrvNif = P08AF5_n793PrvNif[0] ;
         A782PrvCpo = P08AF5_A782PrvCpo[0] ;
         n782PrvCpo = P08AF5_n782PrvCpo[0] ;
         A786PrvDir = P08AF5_A786PrvDir[0] ;
         n786PrvDir = P08AF5_n786PrvDir[0] ;
         A794PrvNom = P08AF5_A794PrvNom[0] ;
         n794PrvNom = P08AF5_n794PrvNom[0] ;
         A795PrvNum = P08AF5_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF5_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF5_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF5_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF5_n792PrvMetTra[0] ;
         A802PrvTip = P08AF5_A802PrvTip[0] ;
         n802PrvTip = P08AF5_n802PrvTip[0] ;
         A396EmprCod = P08AF5_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08AF5_A799PrvPob[0], A799PrvPob) == 0 ) )
            {
               brk8AF8 = false ;
               A795PrvNum = P08AF5_A795PrvNum[0] ;
               A396EmprCod = P08AF5_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A799PrvPob)==0) )
            {
               AV64Option = A799PrvPob ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF8 )
         {
            brk8AF8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRVNIFOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPrvNif = AV60SearchTxt ;
      AV25TFPrvNif_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8AF10 = false ;
         A793PrvNif = P08AF6_A793PrvNif[0] ;
         n793PrvNif = P08AF6_n793PrvNif[0] ;
         A14216PrvAct = P08AF6_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF6_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF6_A783PrvCta[0] ;
         n783PrvCta = P08AF6_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF6_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF6_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF6_A801PrvRep[0] ;
         n801PrvRep = P08AF6_n801PrvRep[0] ;
         A780PrvBan = P08AF6_A780PrvBan[0] ;
         n780PrvBan = P08AF6_n780PrvBan[0] ;
         A797PrvPer = P08AF6_A797PrvPer[0] ;
         n797PrvPer = P08AF6_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF6_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF6_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF6_A805PrvVto[0] ;
         n805PrvVto = P08AF6_n805PrvVto[0] ;
         A497FpgCod = P08AF6_A497FpgCod[0] ;
         n497FpgCod = P08AF6_n497FpgCod[0] ;
         A804PrvTlx = P08AF6_A804PrvTlx[0] ;
         n804PrvTlx = P08AF6_n804PrvTlx[0] ;
         A800PrvPri = P08AF6_A800PrvPri[0] ;
         n800PrvPri = P08AF6_n800PrvPri[0] ;
         A803PrvTlf = P08AF6_A803PrvTlf[0] ;
         n803PrvTlf = P08AF6_n803PrvTlf[0] ;
         A799PrvPob = P08AF6_A799PrvPob[0] ;
         n799PrvPob = P08AF6_n799PrvPob[0] ;
         A782PrvCpo = P08AF6_A782PrvCpo[0] ;
         n782PrvCpo = P08AF6_n782PrvCpo[0] ;
         A786PrvDir = P08AF6_A786PrvDir[0] ;
         n786PrvDir = P08AF6_n786PrvDir[0] ;
         A794PrvNom = P08AF6_A794PrvNom[0] ;
         n794PrvNom = P08AF6_n794PrvNom[0] ;
         A795PrvNum = P08AF6_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF6_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF6_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF6_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF6_n792PrvMetTra[0] ;
         A802PrvTip = P08AF6_A802PrvTip[0] ;
         n802PrvTip = P08AF6_n802PrvTip[0] ;
         A396EmprCod = P08AF6_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08AF6_A793PrvNif[0], A793PrvNif) == 0 ) )
            {
               brk8AF10 = false ;
               A795PrvNum = P08AF6_A795PrvNum[0] ;
               A396EmprCod = P08AF6_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A793PrvNif)==0) )
            {
               AV64Option = A793PrvNif ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF10 )
         {
            brk8AF10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPRVTLFOPTIONS' Routine */
      returnInSub = false ;
      AV26TFPrvTlf = AV60SearchTxt ;
      AV27TFPrvTlf_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8AF12 = false ;
         A803PrvTlf = P08AF7_A803PrvTlf[0] ;
         n803PrvTlf = P08AF7_n803PrvTlf[0] ;
         A14216PrvAct = P08AF7_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF7_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF7_A783PrvCta[0] ;
         n783PrvCta = P08AF7_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF7_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF7_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF7_A801PrvRep[0] ;
         n801PrvRep = P08AF7_n801PrvRep[0] ;
         A780PrvBan = P08AF7_A780PrvBan[0] ;
         n780PrvBan = P08AF7_n780PrvBan[0] ;
         A797PrvPer = P08AF7_A797PrvPer[0] ;
         n797PrvPer = P08AF7_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF7_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF7_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF7_A805PrvVto[0] ;
         n805PrvVto = P08AF7_n805PrvVto[0] ;
         A497FpgCod = P08AF7_A497FpgCod[0] ;
         n497FpgCod = P08AF7_n497FpgCod[0] ;
         A804PrvTlx = P08AF7_A804PrvTlx[0] ;
         n804PrvTlx = P08AF7_n804PrvTlx[0] ;
         A800PrvPri = P08AF7_A800PrvPri[0] ;
         n800PrvPri = P08AF7_n800PrvPri[0] ;
         A793PrvNif = P08AF7_A793PrvNif[0] ;
         n793PrvNif = P08AF7_n793PrvNif[0] ;
         A799PrvPob = P08AF7_A799PrvPob[0] ;
         n799PrvPob = P08AF7_n799PrvPob[0] ;
         A782PrvCpo = P08AF7_A782PrvCpo[0] ;
         n782PrvCpo = P08AF7_n782PrvCpo[0] ;
         A786PrvDir = P08AF7_A786PrvDir[0] ;
         n786PrvDir = P08AF7_n786PrvDir[0] ;
         A794PrvNom = P08AF7_A794PrvNom[0] ;
         n794PrvNom = P08AF7_n794PrvNom[0] ;
         A795PrvNum = P08AF7_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF7_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF7_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF7_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF7_n792PrvMetTra[0] ;
         A802PrvTip = P08AF7_A802PrvTip[0] ;
         n802PrvTip = P08AF7_n802PrvTip[0] ;
         A396EmprCod = P08AF7_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08AF7_A803PrvTlf[0], A803PrvTlf) == 0 ) )
            {
               brk8AF12 = false ;
               A795PrvNum = P08AF7_A795PrvNum[0] ;
               A396EmprCod = P08AF7_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A803PrvTlf)==0) )
            {
               AV64Option = A803PrvTlf ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF12 )
         {
            brk8AF12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRVTLXOPTIONS' Routine */
      returnInSub = false ;
      AV30TFPrvTlx = AV60SearchTxt ;
      AV31TFPrvTlx_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8AF14 = false ;
         A804PrvTlx = P08AF8_A804PrvTlx[0] ;
         n804PrvTlx = P08AF8_n804PrvTlx[0] ;
         A14216PrvAct = P08AF8_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF8_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF8_A783PrvCta[0] ;
         n783PrvCta = P08AF8_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF8_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF8_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF8_A801PrvRep[0] ;
         n801PrvRep = P08AF8_n801PrvRep[0] ;
         A780PrvBan = P08AF8_A780PrvBan[0] ;
         n780PrvBan = P08AF8_n780PrvBan[0] ;
         A797PrvPer = P08AF8_A797PrvPer[0] ;
         n797PrvPer = P08AF8_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF8_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF8_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF8_A805PrvVto[0] ;
         n805PrvVto = P08AF8_n805PrvVto[0] ;
         A497FpgCod = P08AF8_A497FpgCod[0] ;
         n497FpgCod = P08AF8_n497FpgCod[0] ;
         A800PrvPri = P08AF8_A800PrvPri[0] ;
         n800PrvPri = P08AF8_n800PrvPri[0] ;
         A803PrvTlf = P08AF8_A803PrvTlf[0] ;
         n803PrvTlf = P08AF8_n803PrvTlf[0] ;
         A793PrvNif = P08AF8_A793PrvNif[0] ;
         n793PrvNif = P08AF8_n793PrvNif[0] ;
         A799PrvPob = P08AF8_A799PrvPob[0] ;
         n799PrvPob = P08AF8_n799PrvPob[0] ;
         A782PrvCpo = P08AF8_A782PrvCpo[0] ;
         n782PrvCpo = P08AF8_n782PrvCpo[0] ;
         A786PrvDir = P08AF8_A786PrvDir[0] ;
         n786PrvDir = P08AF8_n786PrvDir[0] ;
         A794PrvNom = P08AF8_A794PrvNom[0] ;
         n794PrvNom = P08AF8_n794PrvNom[0] ;
         A795PrvNum = P08AF8_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF8_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF8_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF8_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF8_n792PrvMetTra[0] ;
         A802PrvTip = P08AF8_A802PrvTip[0] ;
         n802PrvTip = P08AF8_n802PrvTip[0] ;
         A396EmprCod = P08AF8_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08AF8_A804PrvTlx[0], A804PrvTlx) == 0 ) )
            {
               brk8AF14 = false ;
               A795PrvNum = P08AF8_A795PrvNum[0] ;
               A396EmprCod = P08AF8_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A804PrvTlx)==0) )
            {
               AV64Option = A804PrvTlx ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF14 )
         {
            brk8AF14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFPGCODOPTIONS' Routine */
      returnInSub = false ;
      AV34TFFpgCod = AV60SearchTxt ;
      AV35TFFpgCod_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8AF16 = false ;
         A497FpgCod = P08AF9_A497FpgCod[0] ;
         n497FpgCod = P08AF9_n497FpgCod[0] ;
         A14216PrvAct = P08AF9_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF9_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF9_A783PrvCta[0] ;
         n783PrvCta = P08AF9_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF9_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF9_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF9_A801PrvRep[0] ;
         n801PrvRep = P08AF9_n801PrvRep[0] ;
         A780PrvBan = P08AF9_A780PrvBan[0] ;
         n780PrvBan = P08AF9_n780PrvBan[0] ;
         A797PrvPer = P08AF9_A797PrvPer[0] ;
         n797PrvPer = P08AF9_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF9_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF9_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF9_A805PrvVto[0] ;
         n805PrvVto = P08AF9_n805PrvVto[0] ;
         A804PrvTlx = P08AF9_A804PrvTlx[0] ;
         n804PrvTlx = P08AF9_n804PrvTlx[0] ;
         A800PrvPri = P08AF9_A800PrvPri[0] ;
         n800PrvPri = P08AF9_n800PrvPri[0] ;
         A803PrvTlf = P08AF9_A803PrvTlf[0] ;
         n803PrvTlf = P08AF9_n803PrvTlf[0] ;
         A793PrvNif = P08AF9_A793PrvNif[0] ;
         n793PrvNif = P08AF9_n793PrvNif[0] ;
         A799PrvPob = P08AF9_A799PrvPob[0] ;
         n799PrvPob = P08AF9_n799PrvPob[0] ;
         A782PrvCpo = P08AF9_A782PrvCpo[0] ;
         n782PrvCpo = P08AF9_n782PrvCpo[0] ;
         A786PrvDir = P08AF9_A786PrvDir[0] ;
         n786PrvDir = P08AF9_n786PrvDir[0] ;
         A794PrvNom = P08AF9_A794PrvNom[0] ;
         n794PrvNom = P08AF9_n794PrvNom[0] ;
         A795PrvNum = P08AF9_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF9_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF9_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF9_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF9_n792PrvMetTra[0] ;
         A802PrvTip = P08AF9_A802PrvTip[0] ;
         n802PrvTip = P08AF9_n802PrvTip[0] ;
         A396EmprCod = P08AF9_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08AF9_A497FpgCod[0], A497FpgCod) == 0 ) )
            {
               brk8AF16 = false ;
               A795PrvNum = P08AF9_A795PrvNum[0] ;
               A396EmprCod = P08AF9_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF16 = true ;
               pr_default.readNext(7);
            }
            if ( ! (GXutil.strcmp("", A497FpgCod)==0) )
            {
               AV64Option = A497FpgCod ;
               AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A497FpgCod, "@!"))) ;
               AV65Options.add(AV64Option, 0);
               AV68OptionsDesc.add(AV67OptionDesc, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF16 )
         {
            brk8AF16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADPRVREPOPTIONS' Routine */
      returnInSub = false ;
      AV46TFPrvRep = AV60SearchTxt ;
      AV47TFPrvRep_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8AF18 = false ;
         A801PrvRep = P08AF10_A801PrvRep[0] ;
         n801PrvRep = P08AF10_n801PrvRep[0] ;
         A14216PrvAct = P08AF10_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF10_A3143PrvDivCo[0] ;
         A783PrvCta = P08AF10_A783PrvCta[0] ;
         n783PrvCta = P08AF10_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AF10_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF10_n798PrvPlaEnt[0] ;
         A780PrvBan = P08AF10_A780PrvBan[0] ;
         n780PrvBan = P08AF10_n780PrvBan[0] ;
         A797PrvPer = P08AF10_A797PrvPer[0] ;
         n797PrvPer = P08AF10_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF10_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF10_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF10_A805PrvVto[0] ;
         n805PrvVto = P08AF10_n805PrvVto[0] ;
         A497FpgCod = P08AF10_A497FpgCod[0] ;
         n497FpgCod = P08AF10_n497FpgCod[0] ;
         A804PrvTlx = P08AF10_A804PrvTlx[0] ;
         n804PrvTlx = P08AF10_n804PrvTlx[0] ;
         A800PrvPri = P08AF10_A800PrvPri[0] ;
         n800PrvPri = P08AF10_n800PrvPri[0] ;
         A803PrvTlf = P08AF10_A803PrvTlf[0] ;
         n803PrvTlf = P08AF10_n803PrvTlf[0] ;
         A793PrvNif = P08AF10_A793PrvNif[0] ;
         n793PrvNif = P08AF10_n793PrvNif[0] ;
         A799PrvPob = P08AF10_A799PrvPob[0] ;
         n799PrvPob = P08AF10_n799PrvPob[0] ;
         A782PrvCpo = P08AF10_A782PrvCpo[0] ;
         n782PrvCpo = P08AF10_n782PrvCpo[0] ;
         A786PrvDir = P08AF10_A786PrvDir[0] ;
         n786PrvDir = P08AF10_n786PrvDir[0] ;
         A794PrvNom = P08AF10_A794PrvNom[0] ;
         n794PrvNom = P08AF10_n794PrvNom[0] ;
         A795PrvNum = P08AF10_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF10_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF10_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF10_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF10_n792PrvMetTra[0] ;
         A802PrvTip = P08AF10_A802PrvTip[0] ;
         n802PrvTip = P08AF10_n802PrvTip[0] ;
         A396EmprCod = P08AF10_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P08AF10_A801PrvRep[0], A801PrvRep) == 0 ) )
            {
               brk8AF18 = false ;
               A795PrvNum = P08AF10_A795PrvNum[0] ;
               A396EmprCod = P08AF10_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF18 = true ;
               pr_default.readNext(8);
            }
            if ( ! (GXutil.strcmp("", A801PrvRep)==0) )
            {
               AV64Option = A801PrvRep ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF18 )
         {
            brk8AF18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADPRVCTAOPTIONS' Routine */
      returnInSub = false ;
      AV52TFPrvCta = AV60SearchTxt ;
      AV53TFPrvCta_Sel = "" ;
      AV91Tprvgenwwds_1_filterfulltext = AV78FilterFullText ;
      AV92Tprvgenwwds_2_tfprvnum = AV12TFPrvNum ;
      AV93Tprvgenwwds_3_tfprvnum_to = AV13TFPrvNum_To ;
      AV94Tprvgenwwds_4_tfprvnom = AV14TFPrvNom ;
      AV95Tprvgenwwds_5_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV96Tprvgenwwds_6_tfprvdir = AV18TFPrvDir ;
      AV97Tprvgenwwds_7_tfprvdir_sel = AV19TFPrvDir_Sel ;
      AV98Tprvgenwwds_8_tfprvcpo = AV20TFPrvCpo ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = AV21TFPrvCpo_Sel ;
      AV100Tprvgenwwds_10_tfprvpob = AV22TFPrvPob ;
      AV101Tprvgenwwds_11_tfprvpob_sel = AV23TFPrvPob_Sel ;
      AV102Tprvgenwwds_12_tfprvnif = AV24TFPrvNif ;
      AV103Tprvgenwwds_13_tfprvnif_sel = AV25TFPrvNif_Sel ;
      AV104Tprvgenwwds_14_tfprvtlf = AV26TFPrvTlf ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = AV27TFPrvTlf_Sel ;
      AV106Tprvgenwwds_16_tfprvpri_sel = AV79TFPrvPri_Sel ;
      AV107Tprvgenwwds_17_tfprvtlx = AV30TFPrvTlx ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = AV31TFPrvTlx_Sel ;
      AV109Tprvgenwwds_19_tfprvtip_sels = AV81TFPrvTip_Sels ;
      AV110Tprvgenwwds_20_tffpgcod = AV34TFFpgCod ;
      AV111Tprvgenwwds_21_tffpgcod_sel = AV35TFFpgCod_Sel ;
      AV112Tprvgenwwds_22_tfprvvto = AV38TFPrvVto ;
      AV113Tprvgenwwds_23_tfprvvto_to = AV39TFPrvVto_To ;
      AV114Tprvgenwwds_24_tfprvdiapag = AV40TFPrvDiaPag ;
      AV115Tprvgenwwds_25_tfprvdiapag_to = AV41TFPrvDiaPag_To ;
      AV116Tprvgenwwds_26_tfprvper = AV42TFPrvPer ;
      AV117Tprvgenwwds_27_tfprvper_to = AV43TFPrvPer_To ;
      AV118Tprvgenwwds_28_tfprvban = AV44TFPrvBan ;
      AV119Tprvgenwwds_29_tfprvban_to = AV45TFPrvBan_To ;
      AV120Tprvgenwwds_30_tfprvrep = AV46TFPrvRep ;
      AV121Tprvgenwwds_31_tfprvrep_sel = AV47TFPrvRep_Sel ;
      AV122Tprvgenwwds_32_tfprvplaent = AV48TFPrvPlaEnt ;
      AV123Tprvgenwwds_33_tfprvplaent_to = AV49TFPrvPlaEnt_To ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = AV83TFPrvMetTra_Sels ;
      AV125Tprvgenwwds_35_tfprvcta = AV52TFPrvCta ;
      AV126Tprvgenwwds_36_tfprvcta_sel = AV53TFPrvCta_Sel ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = AV55TFPrvDivCod_Sels ;
      AV128Tprvgenwwds_38_tfprvdivco = AV56TFPrvDivCo ;
      AV129Tprvgenwwds_39_tfprvdivco_to = AV57TFPrvDivCo_To ;
      AV130Tprvgenwwds_40_tfprvact_sel = AV86TFPrvAct_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to) ,
                                           AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           AV94Tprvgenwwds_4_tfprvnom ,
                                           AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           AV96Tprvgenwwds_6_tfprvdir ,
                                           AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV98Tprvgenwwds_8_tfprvcpo ,
                                           AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           AV100Tprvgenwwds_10_tfprvpob ,
                                           AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           AV102Tprvgenwwds_12_tfprvnif ,
                                           AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV104Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV106Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV107Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV109Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           AV110Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV116Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to) ,
                                           AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           AV120Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           AV125Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV127Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV130Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           AV91Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV94Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV94Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV96Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV96Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV98Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV100Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV102Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV104Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV107Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV107Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV110Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV120Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV125Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV125Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AF11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(AV92Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV93Tprvgenwwds_3_tfprvnum_to), lV94Tprvgenwwds_4_tfprvnom, AV95Tprvgenwwds_5_tfprvnom_sel, lV96Tprvgenwwds_6_tfprvdir, AV97Tprvgenwwds_7_tfprvdir_sel, lV98Tprvgenwwds_8_tfprvcpo, AV99Tprvgenwwds_9_tfprvcpo_sel, lV100Tprvgenwwds_10_tfprvpob, AV101Tprvgenwwds_11_tfprvpob_sel, lV102Tprvgenwwds_12_tfprvnif, AV103Tprvgenwwds_13_tfprvnif_sel, lV104Tprvgenwwds_14_tfprvtlf, AV105Tprvgenwwds_15_tfprvtlf_sel, lV107Tprvgenwwds_17_tfprvtlx, AV108Tprvgenwwds_18_tfprvtlx_sel, lV110Tprvgenwwds_20_tffpgcod, AV111Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV112Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV113Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV114Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV115Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV116Tprvgenwwds_26_tfprvper), Integer.valueOf(AV117Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV118Tprvgenwwds_28_tfprvban), Integer.valueOf(AV119Tprvgenwwds_29_tfprvban_to), lV120Tprvgenwwds_30_tfprvrep, AV121Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV122Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV123Tprvgenwwds_33_tfprvplaent_to), lV125Tprvgenwwds_35_tfprvcta, AV126Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV128Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV129Tprvgenwwds_39_tfprvdivco_to), AV130Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk8AF20 = false ;
         A783PrvCta = P08AF11_A783PrvCta[0] ;
         n783PrvCta = P08AF11_n783PrvCta[0] ;
         A14216PrvAct = P08AF11_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AF11_A3143PrvDivCo[0] ;
         A798PrvPlaEnt = P08AF11_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AF11_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AF11_A801PrvRep[0] ;
         n801PrvRep = P08AF11_n801PrvRep[0] ;
         A780PrvBan = P08AF11_A780PrvBan[0] ;
         n780PrvBan = P08AF11_n780PrvBan[0] ;
         A797PrvPer = P08AF11_A797PrvPer[0] ;
         n797PrvPer = P08AF11_n797PrvPer[0] ;
         A785PrvDiaPag = P08AF11_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AF11_n785PrvDiaPag[0] ;
         A805PrvVto = P08AF11_A805PrvVto[0] ;
         n805PrvVto = P08AF11_n805PrvVto[0] ;
         A497FpgCod = P08AF11_A497FpgCod[0] ;
         n497FpgCod = P08AF11_n497FpgCod[0] ;
         A804PrvTlx = P08AF11_A804PrvTlx[0] ;
         n804PrvTlx = P08AF11_n804PrvTlx[0] ;
         A800PrvPri = P08AF11_A800PrvPri[0] ;
         n800PrvPri = P08AF11_n800PrvPri[0] ;
         A803PrvTlf = P08AF11_A803PrvTlf[0] ;
         n803PrvTlf = P08AF11_n803PrvTlf[0] ;
         A793PrvNif = P08AF11_A793PrvNif[0] ;
         n793PrvNif = P08AF11_n793PrvNif[0] ;
         A799PrvPob = P08AF11_A799PrvPob[0] ;
         n799PrvPob = P08AF11_n799PrvPob[0] ;
         A782PrvCpo = P08AF11_A782PrvCpo[0] ;
         n782PrvCpo = P08AF11_n782PrvCpo[0] ;
         A786PrvDir = P08AF11_A786PrvDir[0] ;
         n786PrvDir = P08AF11_n786PrvDir[0] ;
         A794PrvNom = P08AF11_A794PrvNom[0] ;
         n794PrvNom = P08AF11_n794PrvNom[0] ;
         A795PrvNum = P08AF11_A795PrvNum[0] ;
         A3092PrvDivCod = P08AF11_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AF11_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AF11_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AF11_n792PrvMetTra[0] ;
         A802PrvTip = P08AF11_A802PrvTip[0] ;
         n802PrvTip = P08AF11_n802PrvTip[0] ;
         A396EmprCod = P08AF11_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV91Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV91Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV91Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P08AF11_A783PrvCta[0], A783PrvCta) == 0 ) )
            {
               brk8AF20 = false ;
               A795PrvNum = P08AF11_A795PrvNum[0] ;
               A396EmprCod = P08AF11_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk8AF20 = true ;
               pr_default.readNext(9);
            }
            if ( ! (GXutil.strcmp("", A783PrvCta)==0) )
            {
               AV64Option = A783PrvCta ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8AF20 )
         {
            brk8AF20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprvgenwwgetfilterdata.this.AV66OptionsJson;
      this.aP4[0] = tprvgenwwgetfilterdata.this.AV69OptionsDescJson;
      this.aP5[0] = tprvgenwwgetfilterdata.this.AV71OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66OptionsJson = "" ;
      AV69OptionsDescJson = "" ;
      AV71OptionIndexesJson = "" ;
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV73Session = httpContext.getWebSession();
      AV75GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV76GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV78FilterFullText = "" ;
      AV14TFPrvNom = "" ;
      AV15TFPrvNom_Sel = "" ;
      AV18TFPrvDir = "" ;
      AV19TFPrvDir_Sel = "" ;
      AV20TFPrvCpo = "" ;
      AV21TFPrvCpo_Sel = "" ;
      AV22TFPrvPob = "" ;
      AV23TFPrvPob_Sel = "" ;
      AV24TFPrvNif = "" ;
      AV25TFPrvNif_Sel = "" ;
      AV26TFPrvTlf = "" ;
      AV27TFPrvTlf_Sel = "" ;
      AV30TFPrvTlx = "" ;
      AV31TFPrvTlx_Sel = "" ;
      AV80TFPrvTip_SelsJson = "" ;
      AV81TFPrvTip_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34TFFpgCod = "" ;
      AV35TFFpgCod_Sel = "" ;
      AV46TFPrvRep = "" ;
      AV47TFPrvRep_Sel = "" ;
      AV82TFPrvMetTra_SelsJson = "" ;
      AV83TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52TFPrvCta = "" ;
      AV53TFPrvCta_Sel = "" ;
      AV54TFPrvDivCod_SelsJson = "" ;
      AV55TFPrvDivCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86TFPrvAct_Sel = "" ;
      A794PrvNom = "" ;
      AV91Tprvgenwwds_1_filterfulltext = "" ;
      AV94Tprvgenwwds_4_tfprvnom = "" ;
      AV95Tprvgenwwds_5_tfprvnom_sel = "" ;
      AV96Tprvgenwwds_6_tfprvdir = "" ;
      AV97Tprvgenwwds_7_tfprvdir_sel = "" ;
      AV98Tprvgenwwds_8_tfprvcpo = "" ;
      AV99Tprvgenwwds_9_tfprvcpo_sel = "" ;
      AV100Tprvgenwwds_10_tfprvpob = "" ;
      AV101Tprvgenwwds_11_tfprvpob_sel = "" ;
      AV102Tprvgenwwds_12_tfprvnif = "" ;
      AV103Tprvgenwwds_13_tfprvnif_sel = "" ;
      AV104Tprvgenwwds_14_tfprvtlf = "" ;
      AV105Tprvgenwwds_15_tfprvtlf_sel = "" ;
      AV107Tprvgenwwds_17_tfprvtlx = "" ;
      AV108Tprvgenwwds_18_tfprvtlx_sel = "" ;
      AV109Tprvgenwwds_19_tfprvtip_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV110Tprvgenwwds_20_tffpgcod = "" ;
      AV111Tprvgenwwds_21_tffpgcod_sel = "" ;
      AV120Tprvgenwwds_30_tfprvrep = "" ;
      AV121Tprvgenwwds_31_tfprvrep_sel = "" ;
      AV124Tprvgenwwds_34_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV125Tprvgenwwds_35_tfprvcta = "" ;
      AV126Tprvgenwwds_36_tfprvcta_sel = "" ;
      AV127Tprvgenwwds_37_tfprvdivcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV130Tprvgenwwds_40_tfprvact_sel = "" ;
      lV91Tprvgenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV94Tprvgenwwds_4_tfprvnom = "" ;
      lV96Tprvgenwwds_6_tfprvdir = "" ;
      lV98Tprvgenwwds_8_tfprvcpo = "" ;
      lV100Tprvgenwwds_10_tfprvpob = "" ;
      lV102Tprvgenwwds_12_tfprvnif = "" ;
      lV104Tprvgenwwds_14_tfprvtlf = "" ;
      lV107Tprvgenwwds_17_tfprvtlx = "" ;
      lV110Tprvgenwwds_20_tffpgcod = "" ;
      lV120Tprvgenwwds_30_tfprvrep = "" ;
      lV125Tprvgenwwds_35_tfprvcta = "" ;
      A802PrvTip = "" ;
      A792PrvMetTra = "" ;
      A3092PrvDivCod = "" ;
      A786PrvDir = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A497FpgCod = "" ;
      A801PrvRep = "" ;
      A783PrvCta = "" ;
      A14216PrvAct = "" ;
      P08AF2_A794PrvNom = new String[] {""} ;
      P08AF2_n794PrvNom = new boolean[] {false} ;
      P08AF2_A14216PrvAct = new String[] {""} ;
      P08AF2_A3143PrvDivCo = new byte[1] ;
      P08AF2_A783PrvCta = new String[] {""} ;
      P08AF2_n783PrvCta = new boolean[] {false} ;
      P08AF2_A798PrvPlaEnt = new short[1] ;
      P08AF2_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF2_A801PrvRep = new String[] {""} ;
      P08AF2_n801PrvRep = new boolean[] {false} ;
      P08AF2_A780PrvBan = new int[1] ;
      P08AF2_n780PrvBan = new boolean[] {false} ;
      P08AF2_A797PrvPer = new int[1] ;
      P08AF2_n797PrvPer = new boolean[] {false} ;
      P08AF2_A785PrvDiaPag = new int[1] ;
      P08AF2_n785PrvDiaPag = new boolean[] {false} ;
      P08AF2_A805PrvVto = new byte[1] ;
      P08AF2_n805PrvVto = new boolean[] {false} ;
      P08AF2_A497FpgCod = new String[] {""} ;
      P08AF2_n497FpgCod = new boolean[] {false} ;
      P08AF2_A804PrvTlx = new String[] {""} ;
      P08AF2_n804PrvTlx = new boolean[] {false} ;
      P08AF2_A800PrvPri = new byte[1] ;
      P08AF2_n800PrvPri = new boolean[] {false} ;
      P08AF2_A803PrvTlf = new String[] {""} ;
      P08AF2_n803PrvTlf = new boolean[] {false} ;
      P08AF2_A793PrvNif = new String[] {""} ;
      P08AF2_n793PrvNif = new boolean[] {false} ;
      P08AF2_A799PrvPob = new String[] {""} ;
      P08AF2_n799PrvPob = new boolean[] {false} ;
      P08AF2_A782PrvCpo = new String[] {""} ;
      P08AF2_n782PrvCpo = new boolean[] {false} ;
      P08AF2_A786PrvDir = new String[] {""} ;
      P08AF2_n786PrvDir = new boolean[] {false} ;
      P08AF2_A795PrvNum = new int[1] ;
      P08AF2_A3092PrvDivCod = new String[] {""} ;
      P08AF2_n3092PrvDivCod = new boolean[] {false} ;
      P08AF2_A792PrvMetTra = new String[] {""} ;
      P08AF2_n792PrvMetTra = new boolean[] {false} ;
      P08AF2_A802PrvTip = new String[] {""} ;
      P08AF2_n802PrvTip = new boolean[] {false} ;
      P08AF2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV64Option = "" ;
      P08AF3_A786PrvDir = new String[] {""} ;
      P08AF3_n786PrvDir = new boolean[] {false} ;
      P08AF3_A14216PrvAct = new String[] {""} ;
      P08AF3_A3143PrvDivCo = new byte[1] ;
      P08AF3_A783PrvCta = new String[] {""} ;
      P08AF3_n783PrvCta = new boolean[] {false} ;
      P08AF3_A798PrvPlaEnt = new short[1] ;
      P08AF3_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF3_A801PrvRep = new String[] {""} ;
      P08AF3_n801PrvRep = new boolean[] {false} ;
      P08AF3_A780PrvBan = new int[1] ;
      P08AF3_n780PrvBan = new boolean[] {false} ;
      P08AF3_A797PrvPer = new int[1] ;
      P08AF3_n797PrvPer = new boolean[] {false} ;
      P08AF3_A785PrvDiaPag = new int[1] ;
      P08AF3_n785PrvDiaPag = new boolean[] {false} ;
      P08AF3_A805PrvVto = new byte[1] ;
      P08AF3_n805PrvVto = new boolean[] {false} ;
      P08AF3_A497FpgCod = new String[] {""} ;
      P08AF3_n497FpgCod = new boolean[] {false} ;
      P08AF3_A804PrvTlx = new String[] {""} ;
      P08AF3_n804PrvTlx = new boolean[] {false} ;
      P08AF3_A800PrvPri = new byte[1] ;
      P08AF3_n800PrvPri = new boolean[] {false} ;
      P08AF3_A803PrvTlf = new String[] {""} ;
      P08AF3_n803PrvTlf = new boolean[] {false} ;
      P08AF3_A793PrvNif = new String[] {""} ;
      P08AF3_n793PrvNif = new boolean[] {false} ;
      P08AF3_A799PrvPob = new String[] {""} ;
      P08AF3_n799PrvPob = new boolean[] {false} ;
      P08AF3_A782PrvCpo = new String[] {""} ;
      P08AF3_n782PrvCpo = new boolean[] {false} ;
      P08AF3_A794PrvNom = new String[] {""} ;
      P08AF3_n794PrvNom = new boolean[] {false} ;
      P08AF3_A795PrvNum = new int[1] ;
      P08AF3_A3092PrvDivCod = new String[] {""} ;
      P08AF3_n3092PrvDivCod = new boolean[] {false} ;
      P08AF3_A792PrvMetTra = new String[] {""} ;
      P08AF3_n792PrvMetTra = new boolean[] {false} ;
      P08AF3_A802PrvTip = new String[] {""} ;
      P08AF3_n802PrvTip = new boolean[] {false} ;
      P08AF3_A396EmprCod = new String[] {""} ;
      P08AF4_A782PrvCpo = new String[] {""} ;
      P08AF4_n782PrvCpo = new boolean[] {false} ;
      P08AF4_A14216PrvAct = new String[] {""} ;
      P08AF4_A3143PrvDivCo = new byte[1] ;
      P08AF4_A783PrvCta = new String[] {""} ;
      P08AF4_n783PrvCta = new boolean[] {false} ;
      P08AF4_A798PrvPlaEnt = new short[1] ;
      P08AF4_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF4_A801PrvRep = new String[] {""} ;
      P08AF4_n801PrvRep = new boolean[] {false} ;
      P08AF4_A780PrvBan = new int[1] ;
      P08AF4_n780PrvBan = new boolean[] {false} ;
      P08AF4_A797PrvPer = new int[1] ;
      P08AF4_n797PrvPer = new boolean[] {false} ;
      P08AF4_A785PrvDiaPag = new int[1] ;
      P08AF4_n785PrvDiaPag = new boolean[] {false} ;
      P08AF4_A805PrvVto = new byte[1] ;
      P08AF4_n805PrvVto = new boolean[] {false} ;
      P08AF4_A497FpgCod = new String[] {""} ;
      P08AF4_n497FpgCod = new boolean[] {false} ;
      P08AF4_A804PrvTlx = new String[] {""} ;
      P08AF4_n804PrvTlx = new boolean[] {false} ;
      P08AF4_A800PrvPri = new byte[1] ;
      P08AF4_n800PrvPri = new boolean[] {false} ;
      P08AF4_A803PrvTlf = new String[] {""} ;
      P08AF4_n803PrvTlf = new boolean[] {false} ;
      P08AF4_A793PrvNif = new String[] {""} ;
      P08AF4_n793PrvNif = new boolean[] {false} ;
      P08AF4_A799PrvPob = new String[] {""} ;
      P08AF4_n799PrvPob = new boolean[] {false} ;
      P08AF4_A786PrvDir = new String[] {""} ;
      P08AF4_n786PrvDir = new boolean[] {false} ;
      P08AF4_A794PrvNom = new String[] {""} ;
      P08AF4_n794PrvNom = new boolean[] {false} ;
      P08AF4_A795PrvNum = new int[1] ;
      P08AF4_A3092PrvDivCod = new String[] {""} ;
      P08AF4_n3092PrvDivCod = new boolean[] {false} ;
      P08AF4_A792PrvMetTra = new String[] {""} ;
      P08AF4_n792PrvMetTra = new boolean[] {false} ;
      P08AF4_A802PrvTip = new String[] {""} ;
      P08AF4_n802PrvTip = new boolean[] {false} ;
      P08AF4_A396EmprCod = new String[] {""} ;
      P08AF5_A799PrvPob = new String[] {""} ;
      P08AF5_n799PrvPob = new boolean[] {false} ;
      P08AF5_A14216PrvAct = new String[] {""} ;
      P08AF5_A3143PrvDivCo = new byte[1] ;
      P08AF5_A783PrvCta = new String[] {""} ;
      P08AF5_n783PrvCta = new boolean[] {false} ;
      P08AF5_A798PrvPlaEnt = new short[1] ;
      P08AF5_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF5_A801PrvRep = new String[] {""} ;
      P08AF5_n801PrvRep = new boolean[] {false} ;
      P08AF5_A780PrvBan = new int[1] ;
      P08AF5_n780PrvBan = new boolean[] {false} ;
      P08AF5_A797PrvPer = new int[1] ;
      P08AF5_n797PrvPer = new boolean[] {false} ;
      P08AF5_A785PrvDiaPag = new int[1] ;
      P08AF5_n785PrvDiaPag = new boolean[] {false} ;
      P08AF5_A805PrvVto = new byte[1] ;
      P08AF5_n805PrvVto = new boolean[] {false} ;
      P08AF5_A497FpgCod = new String[] {""} ;
      P08AF5_n497FpgCod = new boolean[] {false} ;
      P08AF5_A804PrvTlx = new String[] {""} ;
      P08AF5_n804PrvTlx = new boolean[] {false} ;
      P08AF5_A800PrvPri = new byte[1] ;
      P08AF5_n800PrvPri = new boolean[] {false} ;
      P08AF5_A803PrvTlf = new String[] {""} ;
      P08AF5_n803PrvTlf = new boolean[] {false} ;
      P08AF5_A793PrvNif = new String[] {""} ;
      P08AF5_n793PrvNif = new boolean[] {false} ;
      P08AF5_A782PrvCpo = new String[] {""} ;
      P08AF5_n782PrvCpo = new boolean[] {false} ;
      P08AF5_A786PrvDir = new String[] {""} ;
      P08AF5_n786PrvDir = new boolean[] {false} ;
      P08AF5_A794PrvNom = new String[] {""} ;
      P08AF5_n794PrvNom = new boolean[] {false} ;
      P08AF5_A795PrvNum = new int[1] ;
      P08AF5_A3092PrvDivCod = new String[] {""} ;
      P08AF5_n3092PrvDivCod = new boolean[] {false} ;
      P08AF5_A792PrvMetTra = new String[] {""} ;
      P08AF5_n792PrvMetTra = new boolean[] {false} ;
      P08AF5_A802PrvTip = new String[] {""} ;
      P08AF5_n802PrvTip = new boolean[] {false} ;
      P08AF5_A396EmprCod = new String[] {""} ;
      P08AF6_A793PrvNif = new String[] {""} ;
      P08AF6_n793PrvNif = new boolean[] {false} ;
      P08AF6_A14216PrvAct = new String[] {""} ;
      P08AF6_A3143PrvDivCo = new byte[1] ;
      P08AF6_A783PrvCta = new String[] {""} ;
      P08AF6_n783PrvCta = new boolean[] {false} ;
      P08AF6_A798PrvPlaEnt = new short[1] ;
      P08AF6_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF6_A801PrvRep = new String[] {""} ;
      P08AF6_n801PrvRep = new boolean[] {false} ;
      P08AF6_A780PrvBan = new int[1] ;
      P08AF6_n780PrvBan = new boolean[] {false} ;
      P08AF6_A797PrvPer = new int[1] ;
      P08AF6_n797PrvPer = new boolean[] {false} ;
      P08AF6_A785PrvDiaPag = new int[1] ;
      P08AF6_n785PrvDiaPag = new boolean[] {false} ;
      P08AF6_A805PrvVto = new byte[1] ;
      P08AF6_n805PrvVto = new boolean[] {false} ;
      P08AF6_A497FpgCod = new String[] {""} ;
      P08AF6_n497FpgCod = new boolean[] {false} ;
      P08AF6_A804PrvTlx = new String[] {""} ;
      P08AF6_n804PrvTlx = new boolean[] {false} ;
      P08AF6_A800PrvPri = new byte[1] ;
      P08AF6_n800PrvPri = new boolean[] {false} ;
      P08AF6_A803PrvTlf = new String[] {""} ;
      P08AF6_n803PrvTlf = new boolean[] {false} ;
      P08AF6_A799PrvPob = new String[] {""} ;
      P08AF6_n799PrvPob = new boolean[] {false} ;
      P08AF6_A782PrvCpo = new String[] {""} ;
      P08AF6_n782PrvCpo = new boolean[] {false} ;
      P08AF6_A786PrvDir = new String[] {""} ;
      P08AF6_n786PrvDir = new boolean[] {false} ;
      P08AF6_A794PrvNom = new String[] {""} ;
      P08AF6_n794PrvNom = new boolean[] {false} ;
      P08AF6_A795PrvNum = new int[1] ;
      P08AF6_A3092PrvDivCod = new String[] {""} ;
      P08AF6_n3092PrvDivCod = new boolean[] {false} ;
      P08AF6_A792PrvMetTra = new String[] {""} ;
      P08AF6_n792PrvMetTra = new boolean[] {false} ;
      P08AF6_A802PrvTip = new String[] {""} ;
      P08AF6_n802PrvTip = new boolean[] {false} ;
      P08AF6_A396EmprCod = new String[] {""} ;
      P08AF7_A803PrvTlf = new String[] {""} ;
      P08AF7_n803PrvTlf = new boolean[] {false} ;
      P08AF7_A14216PrvAct = new String[] {""} ;
      P08AF7_A3143PrvDivCo = new byte[1] ;
      P08AF7_A783PrvCta = new String[] {""} ;
      P08AF7_n783PrvCta = new boolean[] {false} ;
      P08AF7_A798PrvPlaEnt = new short[1] ;
      P08AF7_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF7_A801PrvRep = new String[] {""} ;
      P08AF7_n801PrvRep = new boolean[] {false} ;
      P08AF7_A780PrvBan = new int[1] ;
      P08AF7_n780PrvBan = new boolean[] {false} ;
      P08AF7_A797PrvPer = new int[1] ;
      P08AF7_n797PrvPer = new boolean[] {false} ;
      P08AF7_A785PrvDiaPag = new int[1] ;
      P08AF7_n785PrvDiaPag = new boolean[] {false} ;
      P08AF7_A805PrvVto = new byte[1] ;
      P08AF7_n805PrvVto = new boolean[] {false} ;
      P08AF7_A497FpgCod = new String[] {""} ;
      P08AF7_n497FpgCod = new boolean[] {false} ;
      P08AF7_A804PrvTlx = new String[] {""} ;
      P08AF7_n804PrvTlx = new boolean[] {false} ;
      P08AF7_A800PrvPri = new byte[1] ;
      P08AF7_n800PrvPri = new boolean[] {false} ;
      P08AF7_A793PrvNif = new String[] {""} ;
      P08AF7_n793PrvNif = new boolean[] {false} ;
      P08AF7_A799PrvPob = new String[] {""} ;
      P08AF7_n799PrvPob = new boolean[] {false} ;
      P08AF7_A782PrvCpo = new String[] {""} ;
      P08AF7_n782PrvCpo = new boolean[] {false} ;
      P08AF7_A786PrvDir = new String[] {""} ;
      P08AF7_n786PrvDir = new boolean[] {false} ;
      P08AF7_A794PrvNom = new String[] {""} ;
      P08AF7_n794PrvNom = new boolean[] {false} ;
      P08AF7_A795PrvNum = new int[1] ;
      P08AF7_A3092PrvDivCod = new String[] {""} ;
      P08AF7_n3092PrvDivCod = new boolean[] {false} ;
      P08AF7_A792PrvMetTra = new String[] {""} ;
      P08AF7_n792PrvMetTra = new boolean[] {false} ;
      P08AF7_A802PrvTip = new String[] {""} ;
      P08AF7_n802PrvTip = new boolean[] {false} ;
      P08AF7_A396EmprCod = new String[] {""} ;
      P08AF8_A804PrvTlx = new String[] {""} ;
      P08AF8_n804PrvTlx = new boolean[] {false} ;
      P08AF8_A14216PrvAct = new String[] {""} ;
      P08AF8_A3143PrvDivCo = new byte[1] ;
      P08AF8_A783PrvCta = new String[] {""} ;
      P08AF8_n783PrvCta = new boolean[] {false} ;
      P08AF8_A798PrvPlaEnt = new short[1] ;
      P08AF8_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF8_A801PrvRep = new String[] {""} ;
      P08AF8_n801PrvRep = new boolean[] {false} ;
      P08AF8_A780PrvBan = new int[1] ;
      P08AF8_n780PrvBan = new boolean[] {false} ;
      P08AF8_A797PrvPer = new int[1] ;
      P08AF8_n797PrvPer = new boolean[] {false} ;
      P08AF8_A785PrvDiaPag = new int[1] ;
      P08AF8_n785PrvDiaPag = new boolean[] {false} ;
      P08AF8_A805PrvVto = new byte[1] ;
      P08AF8_n805PrvVto = new boolean[] {false} ;
      P08AF8_A497FpgCod = new String[] {""} ;
      P08AF8_n497FpgCod = new boolean[] {false} ;
      P08AF8_A800PrvPri = new byte[1] ;
      P08AF8_n800PrvPri = new boolean[] {false} ;
      P08AF8_A803PrvTlf = new String[] {""} ;
      P08AF8_n803PrvTlf = new boolean[] {false} ;
      P08AF8_A793PrvNif = new String[] {""} ;
      P08AF8_n793PrvNif = new boolean[] {false} ;
      P08AF8_A799PrvPob = new String[] {""} ;
      P08AF8_n799PrvPob = new boolean[] {false} ;
      P08AF8_A782PrvCpo = new String[] {""} ;
      P08AF8_n782PrvCpo = new boolean[] {false} ;
      P08AF8_A786PrvDir = new String[] {""} ;
      P08AF8_n786PrvDir = new boolean[] {false} ;
      P08AF8_A794PrvNom = new String[] {""} ;
      P08AF8_n794PrvNom = new boolean[] {false} ;
      P08AF8_A795PrvNum = new int[1] ;
      P08AF8_A3092PrvDivCod = new String[] {""} ;
      P08AF8_n3092PrvDivCod = new boolean[] {false} ;
      P08AF8_A792PrvMetTra = new String[] {""} ;
      P08AF8_n792PrvMetTra = new boolean[] {false} ;
      P08AF8_A802PrvTip = new String[] {""} ;
      P08AF8_n802PrvTip = new boolean[] {false} ;
      P08AF8_A396EmprCod = new String[] {""} ;
      P08AF9_A497FpgCod = new String[] {""} ;
      P08AF9_n497FpgCod = new boolean[] {false} ;
      P08AF9_A14216PrvAct = new String[] {""} ;
      P08AF9_A3143PrvDivCo = new byte[1] ;
      P08AF9_A783PrvCta = new String[] {""} ;
      P08AF9_n783PrvCta = new boolean[] {false} ;
      P08AF9_A798PrvPlaEnt = new short[1] ;
      P08AF9_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF9_A801PrvRep = new String[] {""} ;
      P08AF9_n801PrvRep = new boolean[] {false} ;
      P08AF9_A780PrvBan = new int[1] ;
      P08AF9_n780PrvBan = new boolean[] {false} ;
      P08AF9_A797PrvPer = new int[1] ;
      P08AF9_n797PrvPer = new boolean[] {false} ;
      P08AF9_A785PrvDiaPag = new int[1] ;
      P08AF9_n785PrvDiaPag = new boolean[] {false} ;
      P08AF9_A805PrvVto = new byte[1] ;
      P08AF9_n805PrvVto = new boolean[] {false} ;
      P08AF9_A804PrvTlx = new String[] {""} ;
      P08AF9_n804PrvTlx = new boolean[] {false} ;
      P08AF9_A800PrvPri = new byte[1] ;
      P08AF9_n800PrvPri = new boolean[] {false} ;
      P08AF9_A803PrvTlf = new String[] {""} ;
      P08AF9_n803PrvTlf = new boolean[] {false} ;
      P08AF9_A793PrvNif = new String[] {""} ;
      P08AF9_n793PrvNif = new boolean[] {false} ;
      P08AF9_A799PrvPob = new String[] {""} ;
      P08AF9_n799PrvPob = new boolean[] {false} ;
      P08AF9_A782PrvCpo = new String[] {""} ;
      P08AF9_n782PrvCpo = new boolean[] {false} ;
      P08AF9_A786PrvDir = new String[] {""} ;
      P08AF9_n786PrvDir = new boolean[] {false} ;
      P08AF9_A794PrvNom = new String[] {""} ;
      P08AF9_n794PrvNom = new boolean[] {false} ;
      P08AF9_A795PrvNum = new int[1] ;
      P08AF9_A3092PrvDivCod = new String[] {""} ;
      P08AF9_n3092PrvDivCod = new boolean[] {false} ;
      P08AF9_A792PrvMetTra = new String[] {""} ;
      P08AF9_n792PrvMetTra = new boolean[] {false} ;
      P08AF9_A802PrvTip = new String[] {""} ;
      P08AF9_n802PrvTip = new boolean[] {false} ;
      P08AF9_A396EmprCod = new String[] {""} ;
      AV67OptionDesc = "" ;
      P08AF10_A801PrvRep = new String[] {""} ;
      P08AF10_n801PrvRep = new boolean[] {false} ;
      P08AF10_A14216PrvAct = new String[] {""} ;
      P08AF10_A3143PrvDivCo = new byte[1] ;
      P08AF10_A783PrvCta = new String[] {""} ;
      P08AF10_n783PrvCta = new boolean[] {false} ;
      P08AF10_A798PrvPlaEnt = new short[1] ;
      P08AF10_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF10_A780PrvBan = new int[1] ;
      P08AF10_n780PrvBan = new boolean[] {false} ;
      P08AF10_A797PrvPer = new int[1] ;
      P08AF10_n797PrvPer = new boolean[] {false} ;
      P08AF10_A785PrvDiaPag = new int[1] ;
      P08AF10_n785PrvDiaPag = new boolean[] {false} ;
      P08AF10_A805PrvVto = new byte[1] ;
      P08AF10_n805PrvVto = new boolean[] {false} ;
      P08AF10_A497FpgCod = new String[] {""} ;
      P08AF10_n497FpgCod = new boolean[] {false} ;
      P08AF10_A804PrvTlx = new String[] {""} ;
      P08AF10_n804PrvTlx = new boolean[] {false} ;
      P08AF10_A800PrvPri = new byte[1] ;
      P08AF10_n800PrvPri = new boolean[] {false} ;
      P08AF10_A803PrvTlf = new String[] {""} ;
      P08AF10_n803PrvTlf = new boolean[] {false} ;
      P08AF10_A793PrvNif = new String[] {""} ;
      P08AF10_n793PrvNif = new boolean[] {false} ;
      P08AF10_A799PrvPob = new String[] {""} ;
      P08AF10_n799PrvPob = new boolean[] {false} ;
      P08AF10_A782PrvCpo = new String[] {""} ;
      P08AF10_n782PrvCpo = new boolean[] {false} ;
      P08AF10_A786PrvDir = new String[] {""} ;
      P08AF10_n786PrvDir = new boolean[] {false} ;
      P08AF10_A794PrvNom = new String[] {""} ;
      P08AF10_n794PrvNom = new boolean[] {false} ;
      P08AF10_A795PrvNum = new int[1] ;
      P08AF10_A3092PrvDivCod = new String[] {""} ;
      P08AF10_n3092PrvDivCod = new boolean[] {false} ;
      P08AF10_A792PrvMetTra = new String[] {""} ;
      P08AF10_n792PrvMetTra = new boolean[] {false} ;
      P08AF10_A802PrvTip = new String[] {""} ;
      P08AF10_n802PrvTip = new boolean[] {false} ;
      P08AF10_A396EmprCod = new String[] {""} ;
      P08AF11_A783PrvCta = new String[] {""} ;
      P08AF11_n783PrvCta = new boolean[] {false} ;
      P08AF11_A14216PrvAct = new String[] {""} ;
      P08AF11_A3143PrvDivCo = new byte[1] ;
      P08AF11_A798PrvPlaEnt = new short[1] ;
      P08AF11_n798PrvPlaEnt = new boolean[] {false} ;
      P08AF11_A801PrvRep = new String[] {""} ;
      P08AF11_n801PrvRep = new boolean[] {false} ;
      P08AF11_A780PrvBan = new int[1] ;
      P08AF11_n780PrvBan = new boolean[] {false} ;
      P08AF11_A797PrvPer = new int[1] ;
      P08AF11_n797PrvPer = new boolean[] {false} ;
      P08AF11_A785PrvDiaPag = new int[1] ;
      P08AF11_n785PrvDiaPag = new boolean[] {false} ;
      P08AF11_A805PrvVto = new byte[1] ;
      P08AF11_n805PrvVto = new boolean[] {false} ;
      P08AF11_A497FpgCod = new String[] {""} ;
      P08AF11_n497FpgCod = new boolean[] {false} ;
      P08AF11_A804PrvTlx = new String[] {""} ;
      P08AF11_n804PrvTlx = new boolean[] {false} ;
      P08AF11_A800PrvPri = new byte[1] ;
      P08AF11_n800PrvPri = new boolean[] {false} ;
      P08AF11_A803PrvTlf = new String[] {""} ;
      P08AF11_n803PrvTlf = new boolean[] {false} ;
      P08AF11_A793PrvNif = new String[] {""} ;
      P08AF11_n793PrvNif = new boolean[] {false} ;
      P08AF11_A799PrvPob = new String[] {""} ;
      P08AF11_n799PrvPob = new boolean[] {false} ;
      P08AF11_A782PrvCpo = new String[] {""} ;
      P08AF11_n782PrvCpo = new boolean[] {false} ;
      P08AF11_A786PrvDir = new String[] {""} ;
      P08AF11_n786PrvDir = new boolean[] {false} ;
      P08AF11_A794PrvNom = new String[] {""} ;
      P08AF11_n794PrvNom = new boolean[] {false} ;
      P08AF11_A795PrvNum = new int[1] ;
      P08AF11_A3092PrvDivCod = new String[] {""} ;
      P08AF11_n3092PrvDivCod = new boolean[] {false} ;
      P08AF11_A792PrvMetTra = new String[] {""} ;
      P08AF11_n792PrvMetTra = new boolean[] {false} ;
      P08AF11_A802PrvTip = new String[] {""} ;
      P08AF11_n802PrvTip = new boolean[] {false} ;
      P08AF11_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgenwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08AF2_A794PrvNom, P08AF2_n794PrvNom, P08AF2_A14216PrvAct, P08AF2_A3143PrvDivCo, P08AF2_A783PrvCta, P08AF2_n783PrvCta, P08AF2_A798PrvPlaEnt, P08AF2_n798PrvPlaEnt, P08AF2_A801PrvRep, P08AF2_n801PrvRep,
            P08AF2_A780PrvBan, P08AF2_n780PrvBan, P08AF2_A797PrvPer, P08AF2_n797PrvPer, P08AF2_A785PrvDiaPag, P08AF2_n785PrvDiaPag, P08AF2_A805PrvVto, P08AF2_n805PrvVto, P08AF2_A497FpgCod, P08AF2_n497FpgCod,
            P08AF2_A804PrvTlx, P08AF2_n804PrvTlx, P08AF2_A800PrvPri, P08AF2_n800PrvPri, P08AF2_A803PrvTlf, P08AF2_n803PrvTlf, P08AF2_A793PrvNif, P08AF2_n793PrvNif, P08AF2_A799PrvPob, P08AF2_n799PrvPob,
            P08AF2_A782PrvCpo, P08AF2_n782PrvCpo, P08AF2_A786PrvDir, P08AF2_n786PrvDir, P08AF2_A795PrvNum, P08AF2_A3092PrvDivCod, P08AF2_n3092PrvDivCod, P08AF2_A792PrvMetTra, P08AF2_n792PrvMetTra, P08AF2_A802PrvTip,
            P08AF2_n802PrvTip, P08AF2_A396EmprCod
            }
            , new Object[] {
            P08AF3_A786PrvDir, P08AF3_n786PrvDir, P08AF3_A14216PrvAct, P08AF3_A3143PrvDivCo, P08AF3_A783PrvCta, P08AF3_n783PrvCta, P08AF3_A798PrvPlaEnt, P08AF3_n798PrvPlaEnt, P08AF3_A801PrvRep, P08AF3_n801PrvRep,
            P08AF3_A780PrvBan, P08AF3_n780PrvBan, P08AF3_A797PrvPer, P08AF3_n797PrvPer, P08AF3_A785PrvDiaPag, P08AF3_n785PrvDiaPag, P08AF3_A805PrvVto, P08AF3_n805PrvVto, P08AF3_A497FpgCod, P08AF3_n497FpgCod,
            P08AF3_A804PrvTlx, P08AF3_n804PrvTlx, P08AF3_A800PrvPri, P08AF3_n800PrvPri, P08AF3_A803PrvTlf, P08AF3_n803PrvTlf, P08AF3_A793PrvNif, P08AF3_n793PrvNif, P08AF3_A799PrvPob, P08AF3_n799PrvPob,
            P08AF3_A782PrvCpo, P08AF3_n782PrvCpo, P08AF3_A794PrvNom, P08AF3_n794PrvNom, P08AF3_A795PrvNum, P08AF3_A3092PrvDivCod, P08AF3_n3092PrvDivCod, P08AF3_A792PrvMetTra, P08AF3_n792PrvMetTra, P08AF3_A802PrvTip,
            P08AF3_n802PrvTip, P08AF3_A396EmprCod
            }
            , new Object[] {
            P08AF4_A782PrvCpo, P08AF4_n782PrvCpo, P08AF4_A14216PrvAct, P08AF4_A3143PrvDivCo, P08AF4_A783PrvCta, P08AF4_n783PrvCta, P08AF4_A798PrvPlaEnt, P08AF4_n798PrvPlaEnt, P08AF4_A801PrvRep, P08AF4_n801PrvRep,
            P08AF4_A780PrvBan, P08AF4_n780PrvBan, P08AF4_A797PrvPer, P08AF4_n797PrvPer, P08AF4_A785PrvDiaPag, P08AF4_n785PrvDiaPag, P08AF4_A805PrvVto, P08AF4_n805PrvVto, P08AF4_A497FpgCod, P08AF4_n497FpgCod,
            P08AF4_A804PrvTlx, P08AF4_n804PrvTlx, P08AF4_A800PrvPri, P08AF4_n800PrvPri, P08AF4_A803PrvTlf, P08AF4_n803PrvTlf, P08AF4_A793PrvNif, P08AF4_n793PrvNif, P08AF4_A799PrvPob, P08AF4_n799PrvPob,
            P08AF4_A786PrvDir, P08AF4_n786PrvDir, P08AF4_A794PrvNom, P08AF4_n794PrvNom, P08AF4_A795PrvNum, P08AF4_A3092PrvDivCod, P08AF4_n3092PrvDivCod, P08AF4_A792PrvMetTra, P08AF4_n792PrvMetTra, P08AF4_A802PrvTip,
            P08AF4_n802PrvTip, P08AF4_A396EmprCod
            }
            , new Object[] {
            P08AF5_A799PrvPob, P08AF5_n799PrvPob, P08AF5_A14216PrvAct, P08AF5_A3143PrvDivCo, P08AF5_A783PrvCta, P08AF5_n783PrvCta, P08AF5_A798PrvPlaEnt, P08AF5_n798PrvPlaEnt, P08AF5_A801PrvRep, P08AF5_n801PrvRep,
            P08AF5_A780PrvBan, P08AF5_n780PrvBan, P08AF5_A797PrvPer, P08AF5_n797PrvPer, P08AF5_A785PrvDiaPag, P08AF5_n785PrvDiaPag, P08AF5_A805PrvVto, P08AF5_n805PrvVto, P08AF5_A497FpgCod, P08AF5_n497FpgCod,
            P08AF5_A804PrvTlx, P08AF5_n804PrvTlx, P08AF5_A800PrvPri, P08AF5_n800PrvPri, P08AF5_A803PrvTlf, P08AF5_n803PrvTlf, P08AF5_A793PrvNif, P08AF5_n793PrvNif, P08AF5_A782PrvCpo, P08AF5_n782PrvCpo,
            P08AF5_A786PrvDir, P08AF5_n786PrvDir, P08AF5_A794PrvNom, P08AF5_n794PrvNom, P08AF5_A795PrvNum, P08AF5_A3092PrvDivCod, P08AF5_n3092PrvDivCod, P08AF5_A792PrvMetTra, P08AF5_n792PrvMetTra, P08AF5_A802PrvTip,
            P08AF5_n802PrvTip, P08AF5_A396EmprCod
            }
            , new Object[] {
            P08AF6_A793PrvNif, P08AF6_n793PrvNif, P08AF6_A14216PrvAct, P08AF6_A3143PrvDivCo, P08AF6_A783PrvCta, P08AF6_n783PrvCta, P08AF6_A798PrvPlaEnt, P08AF6_n798PrvPlaEnt, P08AF6_A801PrvRep, P08AF6_n801PrvRep,
            P08AF6_A780PrvBan, P08AF6_n780PrvBan, P08AF6_A797PrvPer, P08AF6_n797PrvPer, P08AF6_A785PrvDiaPag, P08AF6_n785PrvDiaPag, P08AF6_A805PrvVto, P08AF6_n805PrvVto, P08AF6_A497FpgCod, P08AF6_n497FpgCod,
            P08AF6_A804PrvTlx, P08AF6_n804PrvTlx, P08AF6_A800PrvPri, P08AF6_n800PrvPri, P08AF6_A803PrvTlf, P08AF6_n803PrvTlf, P08AF6_A799PrvPob, P08AF6_n799PrvPob, P08AF6_A782PrvCpo, P08AF6_n782PrvCpo,
            P08AF6_A786PrvDir, P08AF6_n786PrvDir, P08AF6_A794PrvNom, P08AF6_n794PrvNom, P08AF6_A795PrvNum, P08AF6_A3092PrvDivCod, P08AF6_n3092PrvDivCod, P08AF6_A792PrvMetTra, P08AF6_n792PrvMetTra, P08AF6_A802PrvTip,
            P08AF6_n802PrvTip, P08AF6_A396EmprCod
            }
            , new Object[] {
            P08AF7_A803PrvTlf, P08AF7_n803PrvTlf, P08AF7_A14216PrvAct, P08AF7_A3143PrvDivCo, P08AF7_A783PrvCta, P08AF7_n783PrvCta, P08AF7_A798PrvPlaEnt, P08AF7_n798PrvPlaEnt, P08AF7_A801PrvRep, P08AF7_n801PrvRep,
            P08AF7_A780PrvBan, P08AF7_n780PrvBan, P08AF7_A797PrvPer, P08AF7_n797PrvPer, P08AF7_A785PrvDiaPag, P08AF7_n785PrvDiaPag, P08AF7_A805PrvVto, P08AF7_n805PrvVto, P08AF7_A497FpgCod, P08AF7_n497FpgCod,
            P08AF7_A804PrvTlx, P08AF7_n804PrvTlx, P08AF7_A800PrvPri, P08AF7_n800PrvPri, P08AF7_A793PrvNif, P08AF7_n793PrvNif, P08AF7_A799PrvPob, P08AF7_n799PrvPob, P08AF7_A782PrvCpo, P08AF7_n782PrvCpo,
            P08AF7_A786PrvDir, P08AF7_n786PrvDir, P08AF7_A794PrvNom, P08AF7_n794PrvNom, P08AF7_A795PrvNum, P08AF7_A3092PrvDivCod, P08AF7_n3092PrvDivCod, P08AF7_A792PrvMetTra, P08AF7_n792PrvMetTra, P08AF7_A802PrvTip,
            P08AF7_n802PrvTip, P08AF7_A396EmprCod
            }
            , new Object[] {
            P08AF8_A804PrvTlx, P08AF8_n804PrvTlx, P08AF8_A14216PrvAct, P08AF8_A3143PrvDivCo, P08AF8_A783PrvCta, P08AF8_n783PrvCta, P08AF8_A798PrvPlaEnt, P08AF8_n798PrvPlaEnt, P08AF8_A801PrvRep, P08AF8_n801PrvRep,
            P08AF8_A780PrvBan, P08AF8_n780PrvBan, P08AF8_A797PrvPer, P08AF8_n797PrvPer, P08AF8_A785PrvDiaPag, P08AF8_n785PrvDiaPag, P08AF8_A805PrvVto, P08AF8_n805PrvVto, P08AF8_A497FpgCod, P08AF8_n497FpgCod,
            P08AF8_A800PrvPri, P08AF8_n800PrvPri, P08AF8_A803PrvTlf, P08AF8_n803PrvTlf, P08AF8_A793PrvNif, P08AF8_n793PrvNif, P08AF8_A799PrvPob, P08AF8_n799PrvPob, P08AF8_A782PrvCpo, P08AF8_n782PrvCpo,
            P08AF8_A786PrvDir, P08AF8_n786PrvDir, P08AF8_A794PrvNom, P08AF8_n794PrvNom, P08AF8_A795PrvNum, P08AF8_A3092PrvDivCod, P08AF8_n3092PrvDivCod, P08AF8_A792PrvMetTra, P08AF8_n792PrvMetTra, P08AF8_A802PrvTip,
            P08AF8_n802PrvTip, P08AF8_A396EmprCod
            }
            , new Object[] {
            P08AF9_A497FpgCod, P08AF9_n497FpgCod, P08AF9_A14216PrvAct, P08AF9_A3143PrvDivCo, P08AF9_A783PrvCta, P08AF9_n783PrvCta, P08AF9_A798PrvPlaEnt, P08AF9_n798PrvPlaEnt, P08AF9_A801PrvRep, P08AF9_n801PrvRep,
            P08AF9_A780PrvBan, P08AF9_n780PrvBan, P08AF9_A797PrvPer, P08AF9_n797PrvPer, P08AF9_A785PrvDiaPag, P08AF9_n785PrvDiaPag, P08AF9_A805PrvVto, P08AF9_n805PrvVto, P08AF9_A804PrvTlx, P08AF9_n804PrvTlx,
            P08AF9_A800PrvPri, P08AF9_n800PrvPri, P08AF9_A803PrvTlf, P08AF9_n803PrvTlf, P08AF9_A793PrvNif, P08AF9_n793PrvNif, P08AF9_A799PrvPob, P08AF9_n799PrvPob, P08AF9_A782PrvCpo, P08AF9_n782PrvCpo,
            P08AF9_A786PrvDir, P08AF9_n786PrvDir, P08AF9_A794PrvNom, P08AF9_n794PrvNom, P08AF9_A795PrvNum, P08AF9_A3092PrvDivCod, P08AF9_n3092PrvDivCod, P08AF9_A792PrvMetTra, P08AF9_n792PrvMetTra, P08AF9_A802PrvTip,
            P08AF9_n802PrvTip, P08AF9_A396EmprCod
            }
            , new Object[] {
            P08AF10_A801PrvRep, P08AF10_n801PrvRep, P08AF10_A14216PrvAct, P08AF10_A3143PrvDivCo, P08AF10_A783PrvCta, P08AF10_n783PrvCta, P08AF10_A798PrvPlaEnt, P08AF10_n798PrvPlaEnt, P08AF10_A780PrvBan, P08AF10_n780PrvBan,
            P08AF10_A797PrvPer, P08AF10_n797PrvPer, P08AF10_A785PrvDiaPag, P08AF10_n785PrvDiaPag, P08AF10_A805PrvVto, P08AF10_n805PrvVto, P08AF10_A497FpgCod, P08AF10_n497FpgCod, P08AF10_A804PrvTlx, P08AF10_n804PrvTlx,
            P08AF10_A800PrvPri, P08AF10_n800PrvPri, P08AF10_A803PrvTlf, P08AF10_n803PrvTlf, P08AF10_A793PrvNif, P08AF10_n793PrvNif, P08AF10_A799PrvPob, P08AF10_n799PrvPob, P08AF10_A782PrvCpo, P08AF10_n782PrvCpo,
            P08AF10_A786PrvDir, P08AF10_n786PrvDir, P08AF10_A794PrvNom, P08AF10_n794PrvNom, P08AF10_A795PrvNum, P08AF10_A3092PrvDivCod, P08AF10_n3092PrvDivCod, P08AF10_A792PrvMetTra, P08AF10_n792PrvMetTra, P08AF10_A802PrvTip,
            P08AF10_n802PrvTip, P08AF10_A396EmprCod
            }
            , new Object[] {
            P08AF11_A783PrvCta, P08AF11_n783PrvCta, P08AF11_A14216PrvAct, P08AF11_A3143PrvDivCo, P08AF11_A798PrvPlaEnt, P08AF11_n798PrvPlaEnt, P08AF11_A801PrvRep, P08AF11_n801PrvRep, P08AF11_A780PrvBan, P08AF11_n780PrvBan,
            P08AF11_A797PrvPer, P08AF11_n797PrvPer, P08AF11_A785PrvDiaPag, P08AF11_n785PrvDiaPag, P08AF11_A805PrvVto, P08AF11_n805PrvVto, P08AF11_A497FpgCod, P08AF11_n497FpgCod, P08AF11_A804PrvTlx, P08AF11_n804PrvTlx,
            P08AF11_A800PrvPri, P08AF11_n800PrvPri, P08AF11_A803PrvTlf, P08AF11_n803PrvTlf, P08AF11_A793PrvNif, P08AF11_n793PrvNif, P08AF11_A799PrvPob, P08AF11_n799PrvPob, P08AF11_A782PrvCpo, P08AF11_n782PrvCpo,
            P08AF11_A786PrvDir, P08AF11_n786PrvDir, P08AF11_A794PrvNom, P08AF11_n794PrvNom, P08AF11_A795PrvNum, P08AF11_A3092PrvDivCod, P08AF11_n3092PrvDivCod, P08AF11_A792PrvMetTra, P08AF11_n792PrvMetTra, P08AF11_A802PrvTip,
            P08AF11_n802PrvTip, P08AF11_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV79TFPrvPri_Sel ;
   private byte AV38TFPrvVto ;
   private byte AV39TFPrvVto_To ;
   private byte AV56TFPrvDivCo ;
   private byte AV57TFPrvDivCo_To ;
   private byte AV106Tprvgenwwds_16_tfprvpri_sel ;
   private byte AV112Tprvgenwwds_22_tfprvvto ;
   private byte AV113Tprvgenwwds_23_tfprvvto_to ;
   private byte AV128Tprvgenwwds_38_tfprvdivco ;
   private byte AV129Tprvgenwwds_39_tfprvdivco_to ;
   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte A3143PrvDivCo ;
   private short AV48TFPrvPlaEnt ;
   private short AV49TFPrvPlaEnt_To ;
   private short AV122Tprvgenwwds_32_tfprvplaent ;
   private short AV123Tprvgenwwds_33_tfprvplaent_to ;
   private short A798PrvPlaEnt ;
   private short Gx_err ;
   private int AV89GXV1 ;
   private int AV12TFPrvNum ;
   private int AV13TFPrvNum_To ;
   private int AV40TFPrvDiaPag ;
   private int AV41TFPrvDiaPag_To ;
   private int AV42TFPrvPer ;
   private int AV43TFPrvPer_To ;
   private int AV44TFPrvBan ;
   private int AV45TFPrvBan_To ;
   private int AV92Tprvgenwwds_2_tfprvnum ;
   private int AV93Tprvgenwwds_3_tfprvnum_to ;
   private int AV114Tprvgenwwds_24_tfprvdiapag ;
   private int AV115Tprvgenwwds_25_tfprvdiapag_to ;
   private int AV116Tprvgenwwds_26_tfprvper ;
   private int AV117Tprvgenwwds_27_tfprvper_to ;
   private int AV118Tprvgenwwds_28_tfprvban ;
   private int AV119Tprvgenwwds_29_tfprvban_to ;
   private int AV109Tprvgenwwds_19_tfprvtip_sels_size ;
   private int AV124Tprvgenwwds_34_tfprvmettra_sels_size ;
   private int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int A780PrvBan ;
   private long AV72count ;
   private String AV14TFPrvNom ;
   private String AV15TFPrvNom_Sel ;
   private String AV18TFPrvDir ;
   private String AV19TFPrvDir_Sel ;
   private String AV20TFPrvCpo ;
   private String AV21TFPrvCpo_Sel ;
   private String AV22TFPrvPob ;
   private String AV23TFPrvPob_Sel ;
   private String AV24TFPrvNif ;
   private String AV25TFPrvNif_Sel ;
   private String AV26TFPrvTlf ;
   private String AV27TFPrvTlf_Sel ;
   private String AV30TFPrvTlx ;
   private String AV31TFPrvTlx_Sel ;
   private String AV34TFFpgCod ;
   private String AV35TFFpgCod_Sel ;
   private String AV46TFPrvRep ;
   private String AV47TFPrvRep_Sel ;
   private String AV52TFPrvCta ;
   private String AV53TFPrvCta_Sel ;
   private String AV86TFPrvAct_Sel ;
   private String A794PrvNom ;
   private String AV94Tprvgenwwds_4_tfprvnom ;
   private String AV95Tprvgenwwds_5_tfprvnom_sel ;
   private String AV96Tprvgenwwds_6_tfprvdir ;
   private String AV97Tprvgenwwds_7_tfprvdir_sel ;
   private String AV98Tprvgenwwds_8_tfprvcpo ;
   private String AV99Tprvgenwwds_9_tfprvcpo_sel ;
   private String AV100Tprvgenwwds_10_tfprvpob ;
   private String AV101Tprvgenwwds_11_tfprvpob_sel ;
   private String AV102Tprvgenwwds_12_tfprvnif ;
   private String AV103Tprvgenwwds_13_tfprvnif_sel ;
   private String AV104Tprvgenwwds_14_tfprvtlf ;
   private String AV105Tprvgenwwds_15_tfprvtlf_sel ;
   private String AV107Tprvgenwwds_17_tfprvtlx ;
   private String AV108Tprvgenwwds_18_tfprvtlx_sel ;
   private String AV110Tprvgenwwds_20_tffpgcod ;
   private String AV111Tprvgenwwds_21_tffpgcod_sel ;
   private String AV120Tprvgenwwds_30_tfprvrep ;
   private String AV121Tprvgenwwds_31_tfprvrep_sel ;
   private String AV125Tprvgenwwds_35_tfprvcta ;
   private String AV126Tprvgenwwds_36_tfprvcta_sel ;
   private String AV130Tprvgenwwds_40_tfprvact_sel ;
   private String scmdbuf ;
   private String lV94Tprvgenwwds_4_tfprvnom ;
   private String lV96Tprvgenwwds_6_tfprvdir ;
   private String lV98Tprvgenwwds_8_tfprvcpo ;
   private String lV100Tprvgenwwds_10_tfprvpob ;
   private String lV102Tprvgenwwds_12_tfprvnif ;
   private String lV104Tprvgenwwds_14_tfprvtlf ;
   private String lV107Tprvgenwwds_17_tfprvtlx ;
   private String lV110Tprvgenwwds_20_tffpgcod ;
   private String lV120Tprvgenwwds_30_tfprvrep ;
   private String lV125Tprvgenwwds_35_tfprvcta ;
   private String A802PrvTip ;
   private String A792PrvMetTra ;
   private String A3092PrvDivCod ;
   private String A786PrvDir ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A497FpgCod ;
   private String A801PrvRep ;
   private String A783PrvCta ;
   private String A14216PrvAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8AF2 ;
   private boolean n794PrvNom ;
   private boolean n783PrvCta ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n780PrvBan ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n497FpgCod ;
   private boolean n804PrvTlx ;
   private boolean n800PrvPri ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n786PrvDir ;
   private boolean n3092PrvDivCod ;
   private boolean n792PrvMetTra ;
   private boolean n802PrvTip ;
   private boolean brk8AF4 ;
   private boolean brk8AF6 ;
   private boolean brk8AF8 ;
   private boolean brk8AF10 ;
   private boolean brk8AF12 ;
   private boolean brk8AF14 ;
   private boolean brk8AF16 ;
   private boolean brk8AF18 ;
   private boolean brk8AF20 ;
   private String AV66OptionsJson ;
   private String AV69OptionsDescJson ;
   private String AV71OptionIndexesJson ;
   private String AV80TFPrvTip_SelsJson ;
   private String AV82TFPrvMetTra_SelsJson ;
   private String AV54TFPrvDivCod_SelsJson ;
   private String AV62DDOName ;
   private String AV60SearchTxt ;
   private String AV61SearchTxtTo ;
   private String AV78FilterFullText ;
   private String AV91Tprvgenwwds_1_filterfulltext ;
   private String lV91Tprvgenwwds_1_filterfulltext ;
   private String AV64Option ;
   private String AV67OptionDesc ;
   private com.genexus.webpanels.WebSession AV73Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08AF2_A794PrvNom ;
   private boolean[] P08AF2_n794PrvNom ;
   private String[] P08AF2_A14216PrvAct ;
   private byte[] P08AF2_A3143PrvDivCo ;
   private String[] P08AF2_A783PrvCta ;
   private boolean[] P08AF2_n783PrvCta ;
   private short[] P08AF2_A798PrvPlaEnt ;
   private boolean[] P08AF2_n798PrvPlaEnt ;
   private String[] P08AF2_A801PrvRep ;
   private boolean[] P08AF2_n801PrvRep ;
   private int[] P08AF2_A780PrvBan ;
   private boolean[] P08AF2_n780PrvBan ;
   private int[] P08AF2_A797PrvPer ;
   private boolean[] P08AF2_n797PrvPer ;
   private int[] P08AF2_A785PrvDiaPag ;
   private boolean[] P08AF2_n785PrvDiaPag ;
   private byte[] P08AF2_A805PrvVto ;
   private boolean[] P08AF2_n805PrvVto ;
   private String[] P08AF2_A497FpgCod ;
   private boolean[] P08AF2_n497FpgCod ;
   private String[] P08AF2_A804PrvTlx ;
   private boolean[] P08AF2_n804PrvTlx ;
   private byte[] P08AF2_A800PrvPri ;
   private boolean[] P08AF2_n800PrvPri ;
   private String[] P08AF2_A803PrvTlf ;
   private boolean[] P08AF2_n803PrvTlf ;
   private String[] P08AF2_A793PrvNif ;
   private boolean[] P08AF2_n793PrvNif ;
   private String[] P08AF2_A799PrvPob ;
   private boolean[] P08AF2_n799PrvPob ;
   private String[] P08AF2_A782PrvCpo ;
   private boolean[] P08AF2_n782PrvCpo ;
   private String[] P08AF2_A786PrvDir ;
   private boolean[] P08AF2_n786PrvDir ;
   private int[] P08AF2_A795PrvNum ;
   private String[] P08AF2_A3092PrvDivCod ;
   private boolean[] P08AF2_n3092PrvDivCod ;
   private String[] P08AF2_A792PrvMetTra ;
   private boolean[] P08AF2_n792PrvMetTra ;
   private String[] P08AF2_A802PrvTip ;
   private boolean[] P08AF2_n802PrvTip ;
   private String[] P08AF2_A396EmprCod ;
   private String[] P08AF3_A786PrvDir ;
   private boolean[] P08AF3_n786PrvDir ;
   private String[] P08AF3_A14216PrvAct ;
   private byte[] P08AF3_A3143PrvDivCo ;
   private String[] P08AF3_A783PrvCta ;
   private boolean[] P08AF3_n783PrvCta ;
   private short[] P08AF3_A798PrvPlaEnt ;
   private boolean[] P08AF3_n798PrvPlaEnt ;
   private String[] P08AF3_A801PrvRep ;
   private boolean[] P08AF3_n801PrvRep ;
   private int[] P08AF3_A780PrvBan ;
   private boolean[] P08AF3_n780PrvBan ;
   private int[] P08AF3_A797PrvPer ;
   private boolean[] P08AF3_n797PrvPer ;
   private int[] P08AF3_A785PrvDiaPag ;
   private boolean[] P08AF3_n785PrvDiaPag ;
   private byte[] P08AF3_A805PrvVto ;
   private boolean[] P08AF3_n805PrvVto ;
   private String[] P08AF3_A497FpgCod ;
   private boolean[] P08AF3_n497FpgCod ;
   private String[] P08AF3_A804PrvTlx ;
   private boolean[] P08AF3_n804PrvTlx ;
   private byte[] P08AF3_A800PrvPri ;
   private boolean[] P08AF3_n800PrvPri ;
   private String[] P08AF3_A803PrvTlf ;
   private boolean[] P08AF3_n803PrvTlf ;
   private String[] P08AF3_A793PrvNif ;
   private boolean[] P08AF3_n793PrvNif ;
   private String[] P08AF3_A799PrvPob ;
   private boolean[] P08AF3_n799PrvPob ;
   private String[] P08AF3_A782PrvCpo ;
   private boolean[] P08AF3_n782PrvCpo ;
   private String[] P08AF3_A794PrvNom ;
   private boolean[] P08AF3_n794PrvNom ;
   private int[] P08AF3_A795PrvNum ;
   private String[] P08AF3_A3092PrvDivCod ;
   private boolean[] P08AF3_n3092PrvDivCod ;
   private String[] P08AF3_A792PrvMetTra ;
   private boolean[] P08AF3_n792PrvMetTra ;
   private String[] P08AF3_A802PrvTip ;
   private boolean[] P08AF3_n802PrvTip ;
   private String[] P08AF3_A396EmprCod ;
   private String[] P08AF4_A782PrvCpo ;
   private boolean[] P08AF4_n782PrvCpo ;
   private String[] P08AF4_A14216PrvAct ;
   private byte[] P08AF4_A3143PrvDivCo ;
   private String[] P08AF4_A783PrvCta ;
   private boolean[] P08AF4_n783PrvCta ;
   private short[] P08AF4_A798PrvPlaEnt ;
   private boolean[] P08AF4_n798PrvPlaEnt ;
   private String[] P08AF4_A801PrvRep ;
   private boolean[] P08AF4_n801PrvRep ;
   private int[] P08AF4_A780PrvBan ;
   private boolean[] P08AF4_n780PrvBan ;
   private int[] P08AF4_A797PrvPer ;
   private boolean[] P08AF4_n797PrvPer ;
   private int[] P08AF4_A785PrvDiaPag ;
   private boolean[] P08AF4_n785PrvDiaPag ;
   private byte[] P08AF4_A805PrvVto ;
   private boolean[] P08AF4_n805PrvVto ;
   private String[] P08AF4_A497FpgCod ;
   private boolean[] P08AF4_n497FpgCod ;
   private String[] P08AF4_A804PrvTlx ;
   private boolean[] P08AF4_n804PrvTlx ;
   private byte[] P08AF4_A800PrvPri ;
   private boolean[] P08AF4_n800PrvPri ;
   private String[] P08AF4_A803PrvTlf ;
   private boolean[] P08AF4_n803PrvTlf ;
   private String[] P08AF4_A793PrvNif ;
   private boolean[] P08AF4_n793PrvNif ;
   private String[] P08AF4_A799PrvPob ;
   private boolean[] P08AF4_n799PrvPob ;
   private String[] P08AF4_A786PrvDir ;
   private boolean[] P08AF4_n786PrvDir ;
   private String[] P08AF4_A794PrvNom ;
   private boolean[] P08AF4_n794PrvNom ;
   private int[] P08AF4_A795PrvNum ;
   private String[] P08AF4_A3092PrvDivCod ;
   private boolean[] P08AF4_n3092PrvDivCod ;
   private String[] P08AF4_A792PrvMetTra ;
   private boolean[] P08AF4_n792PrvMetTra ;
   private String[] P08AF4_A802PrvTip ;
   private boolean[] P08AF4_n802PrvTip ;
   private String[] P08AF4_A396EmprCod ;
   private String[] P08AF5_A799PrvPob ;
   private boolean[] P08AF5_n799PrvPob ;
   private String[] P08AF5_A14216PrvAct ;
   private byte[] P08AF5_A3143PrvDivCo ;
   private String[] P08AF5_A783PrvCta ;
   private boolean[] P08AF5_n783PrvCta ;
   private short[] P08AF5_A798PrvPlaEnt ;
   private boolean[] P08AF5_n798PrvPlaEnt ;
   private String[] P08AF5_A801PrvRep ;
   private boolean[] P08AF5_n801PrvRep ;
   private int[] P08AF5_A780PrvBan ;
   private boolean[] P08AF5_n780PrvBan ;
   private int[] P08AF5_A797PrvPer ;
   private boolean[] P08AF5_n797PrvPer ;
   private int[] P08AF5_A785PrvDiaPag ;
   private boolean[] P08AF5_n785PrvDiaPag ;
   private byte[] P08AF5_A805PrvVto ;
   private boolean[] P08AF5_n805PrvVto ;
   private String[] P08AF5_A497FpgCod ;
   private boolean[] P08AF5_n497FpgCod ;
   private String[] P08AF5_A804PrvTlx ;
   private boolean[] P08AF5_n804PrvTlx ;
   private byte[] P08AF5_A800PrvPri ;
   private boolean[] P08AF5_n800PrvPri ;
   private String[] P08AF5_A803PrvTlf ;
   private boolean[] P08AF5_n803PrvTlf ;
   private String[] P08AF5_A793PrvNif ;
   private boolean[] P08AF5_n793PrvNif ;
   private String[] P08AF5_A782PrvCpo ;
   private boolean[] P08AF5_n782PrvCpo ;
   private String[] P08AF5_A786PrvDir ;
   private boolean[] P08AF5_n786PrvDir ;
   private String[] P08AF5_A794PrvNom ;
   private boolean[] P08AF5_n794PrvNom ;
   private int[] P08AF5_A795PrvNum ;
   private String[] P08AF5_A3092PrvDivCod ;
   private boolean[] P08AF5_n3092PrvDivCod ;
   private String[] P08AF5_A792PrvMetTra ;
   private boolean[] P08AF5_n792PrvMetTra ;
   private String[] P08AF5_A802PrvTip ;
   private boolean[] P08AF5_n802PrvTip ;
   private String[] P08AF5_A396EmprCod ;
   private String[] P08AF6_A793PrvNif ;
   private boolean[] P08AF6_n793PrvNif ;
   private String[] P08AF6_A14216PrvAct ;
   private byte[] P08AF6_A3143PrvDivCo ;
   private String[] P08AF6_A783PrvCta ;
   private boolean[] P08AF6_n783PrvCta ;
   private short[] P08AF6_A798PrvPlaEnt ;
   private boolean[] P08AF6_n798PrvPlaEnt ;
   private String[] P08AF6_A801PrvRep ;
   private boolean[] P08AF6_n801PrvRep ;
   private int[] P08AF6_A780PrvBan ;
   private boolean[] P08AF6_n780PrvBan ;
   private int[] P08AF6_A797PrvPer ;
   private boolean[] P08AF6_n797PrvPer ;
   private int[] P08AF6_A785PrvDiaPag ;
   private boolean[] P08AF6_n785PrvDiaPag ;
   private byte[] P08AF6_A805PrvVto ;
   private boolean[] P08AF6_n805PrvVto ;
   private String[] P08AF6_A497FpgCod ;
   private boolean[] P08AF6_n497FpgCod ;
   private String[] P08AF6_A804PrvTlx ;
   private boolean[] P08AF6_n804PrvTlx ;
   private byte[] P08AF6_A800PrvPri ;
   private boolean[] P08AF6_n800PrvPri ;
   private String[] P08AF6_A803PrvTlf ;
   private boolean[] P08AF6_n803PrvTlf ;
   private String[] P08AF6_A799PrvPob ;
   private boolean[] P08AF6_n799PrvPob ;
   private String[] P08AF6_A782PrvCpo ;
   private boolean[] P08AF6_n782PrvCpo ;
   private String[] P08AF6_A786PrvDir ;
   private boolean[] P08AF6_n786PrvDir ;
   private String[] P08AF6_A794PrvNom ;
   private boolean[] P08AF6_n794PrvNom ;
   private int[] P08AF6_A795PrvNum ;
   private String[] P08AF6_A3092PrvDivCod ;
   private boolean[] P08AF6_n3092PrvDivCod ;
   private String[] P08AF6_A792PrvMetTra ;
   private boolean[] P08AF6_n792PrvMetTra ;
   private String[] P08AF6_A802PrvTip ;
   private boolean[] P08AF6_n802PrvTip ;
   private String[] P08AF6_A396EmprCod ;
   private String[] P08AF7_A803PrvTlf ;
   private boolean[] P08AF7_n803PrvTlf ;
   private String[] P08AF7_A14216PrvAct ;
   private byte[] P08AF7_A3143PrvDivCo ;
   private String[] P08AF7_A783PrvCta ;
   private boolean[] P08AF7_n783PrvCta ;
   private short[] P08AF7_A798PrvPlaEnt ;
   private boolean[] P08AF7_n798PrvPlaEnt ;
   private String[] P08AF7_A801PrvRep ;
   private boolean[] P08AF7_n801PrvRep ;
   private int[] P08AF7_A780PrvBan ;
   private boolean[] P08AF7_n780PrvBan ;
   private int[] P08AF7_A797PrvPer ;
   private boolean[] P08AF7_n797PrvPer ;
   private int[] P08AF7_A785PrvDiaPag ;
   private boolean[] P08AF7_n785PrvDiaPag ;
   private byte[] P08AF7_A805PrvVto ;
   private boolean[] P08AF7_n805PrvVto ;
   private String[] P08AF7_A497FpgCod ;
   private boolean[] P08AF7_n497FpgCod ;
   private String[] P08AF7_A804PrvTlx ;
   private boolean[] P08AF7_n804PrvTlx ;
   private byte[] P08AF7_A800PrvPri ;
   private boolean[] P08AF7_n800PrvPri ;
   private String[] P08AF7_A793PrvNif ;
   private boolean[] P08AF7_n793PrvNif ;
   private String[] P08AF7_A799PrvPob ;
   private boolean[] P08AF7_n799PrvPob ;
   private String[] P08AF7_A782PrvCpo ;
   private boolean[] P08AF7_n782PrvCpo ;
   private String[] P08AF7_A786PrvDir ;
   private boolean[] P08AF7_n786PrvDir ;
   private String[] P08AF7_A794PrvNom ;
   private boolean[] P08AF7_n794PrvNom ;
   private int[] P08AF7_A795PrvNum ;
   private String[] P08AF7_A3092PrvDivCod ;
   private boolean[] P08AF7_n3092PrvDivCod ;
   private String[] P08AF7_A792PrvMetTra ;
   private boolean[] P08AF7_n792PrvMetTra ;
   private String[] P08AF7_A802PrvTip ;
   private boolean[] P08AF7_n802PrvTip ;
   private String[] P08AF7_A396EmprCod ;
   private String[] P08AF8_A804PrvTlx ;
   private boolean[] P08AF8_n804PrvTlx ;
   private String[] P08AF8_A14216PrvAct ;
   private byte[] P08AF8_A3143PrvDivCo ;
   private String[] P08AF8_A783PrvCta ;
   private boolean[] P08AF8_n783PrvCta ;
   private short[] P08AF8_A798PrvPlaEnt ;
   private boolean[] P08AF8_n798PrvPlaEnt ;
   private String[] P08AF8_A801PrvRep ;
   private boolean[] P08AF8_n801PrvRep ;
   private int[] P08AF8_A780PrvBan ;
   private boolean[] P08AF8_n780PrvBan ;
   private int[] P08AF8_A797PrvPer ;
   private boolean[] P08AF8_n797PrvPer ;
   private int[] P08AF8_A785PrvDiaPag ;
   private boolean[] P08AF8_n785PrvDiaPag ;
   private byte[] P08AF8_A805PrvVto ;
   private boolean[] P08AF8_n805PrvVto ;
   private String[] P08AF8_A497FpgCod ;
   private boolean[] P08AF8_n497FpgCod ;
   private byte[] P08AF8_A800PrvPri ;
   private boolean[] P08AF8_n800PrvPri ;
   private String[] P08AF8_A803PrvTlf ;
   private boolean[] P08AF8_n803PrvTlf ;
   private String[] P08AF8_A793PrvNif ;
   private boolean[] P08AF8_n793PrvNif ;
   private String[] P08AF8_A799PrvPob ;
   private boolean[] P08AF8_n799PrvPob ;
   private String[] P08AF8_A782PrvCpo ;
   private boolean[] P08AF8_n782PrvCpo ;
   private String[] P08AF8_A786PrvDir ;
   private boolean[] P08AF8_n786PrvDir ;
   private String[] P08AF8_A794PrvNom ;
   private boolean[] P08AF8_n794PrvNom ;
   private int[] P08AF8_A795PrvNum ;
   private String[] P08AF8_A3092PrvDivCod ;
   private boolean[] P08AF8_n3092PrvDivCod ;
   private String[] P08AF8_A792PrvMetTra ;
   private boolean[] P08AF8_n792PrvMetTra ;
   private String[] P08AF8_A802PrvTip ;
   private boolean[] P08AF8_n802PrvTip ;
   private String[] P08AF8_A396EmprCod ;
   private String[] P08AF9_A497FpgCod ;
   private boolean[] P08AF9_n497FpgCod ;
   private String[] P08AF9_A14216PrvAct ;
   private byte[] P08AF9_A3143PrvDivCo ;
   private String[] P08AF9_A783PrvCta ;
   private boolean[] P08AF9_n783PrvCta ;
   private short[] P08AF9_A798PrvPlaEnt ;
   private boolean[] P08AF9_n798PrvPlaEnt ;
   private String[] P08AF9_A801PrvRep ;
   private boolean[] P08AF9_n801PrvRep ;
   private int[] P08AF9_A780PrvBan ;
   private boolean[] P08AF9_n780PrvBan ;
   private int[] P08AF9_A797PrvPer ;
   private boolean[] P08AF9_n797PrvPer ;
   private int[] P08AF9_A785PrvDiaPag ;
   private boolean[] P08AF9_n785PrvDiaPag ;
   private byte[] P08AF9_A805PrvVto ;
   private boolean[] P08AF9_n805PrvVto ;
   private String[] P08AF9_A804PrvTlx ;
   private boolean[] P08AF9_n804PrvTlx ;
   private byte[] P08AF9_A800PrvPri ;
   private boolean[] P08AF9_n800PrvPri ;
   private String[] P08AF9_A803PrvTlf ;
   private boolean[] P08AF9_n803PrvTlf ;
   private String[] P08AF9_A793PrvNif ;
   private boolean[] P08AF9_n793PrvNif ;
   private String[] P08AF9_A799PrvPob ;
   private boolean[] P08AF9_n799PrvPob ;
   private String[] P08AF9_A782PrvCpo ;
   private boolean[] P08AF9_n782PrvCpo ;
   private String[] P08AF9_A786PrvDir ;
   private boolean[] P08AF9_n786PrvDir ;
   private String[] P08AF9_A794PrvNom ;
   private boolean[] P08AF9_n794PrvNom ;
   private int[] P08AF9_A795PrvNum ;
   private String[] P08AF9_A3092PrvDivCod ;
   private boolean[] P08AF9_n3092PrvDivCod ;
   private String[] P08AF9_A792PrvMetTra ;
   private boolean[] P08AF9_n792PrvMetTra ;
   private String[] P08AF9_A802PrvTip ;
   private boolean[] P08AF9_n802PrvTip ;
   private String[] P08AF9_A396EmprCod ;
   private String[] P08AF10_A801PrvRep ;
   private boolean[] P08AF10_n801PrvRep ;
   private String[] P08AF10_A14216PrvAct ;
   private byte[] P08AF10_A3143PrvDivCo ;
   private String[] P08AF10_A783PrvCta ;
   private boolean[] P08AF10_n783PrvCta ;
   private short[] P08AF10_A798PrvPlaEnt ;
   private boolean[] P08AF10_n798PrvPlaEnt ;
   private int[] P08AF10_A780PrvBan ;
   private boolean[] P08AF10_n780PrvBan ;
   private int[] P08AF10_A797PrvPer ;
   private boolean[] P08AF10_n797PrvPer ;
   private int[] P08AF10_A785PrvDiaPag ;
   private boolean[] P08AF10_n785PrvDiaPag ;
   private byte[] P08AF10_A805PrvVto ;
   private boolean[] P08AF10_n805PrvVto ;
   private String[] P08AF10_A497FpgCod ;
   private boolean[] P08AF10_n497FpgCod ;
   private String[] P08AF10_A804PrvTlx ;
   private boolean[] P08AF10_n804PrvTlx ;
   private byte[] P08AF10_A800PrvPri ;
   private boolean[] P08AF10_n800PrvPri ;
   private String[] P08AF10_A803PrvTlf ;
   private boolean[] P08AF10_n803PrvTlf ;
   private String[] P08AF10_A793PrvNif ;
   private boolean[] P08AF10_n793PrvNif ;
   private String[] P08AF10_A799PrvPob ;
   private boolean[] P08AF10_n799PrvPob ;
   private String[] P08AF10_A782PrvCpo ;
   private boolean[] P08AF10_n782PrvCpo ;
   private String[] P08AF10_A786PrvDir ;
   private boolean[] P08AF10_n786PrvDir ;
   private String[] P08AF10_A794PrvNom ;
   private boolean[] P08AF10_n794PrvNom ;
   private int[] P08AF10_A795PrvNum ;
   private String[] P08AF10_A3092PrvDivCod ;
   private boolean[] P08AF10_n3092PrvDivCod ;
   private String[] P08AF10_A792PrvMetTra ;
   private boolean[] P08AF10_n792PrvMetTra ;
   private String[] P08AF10_A802PrvTip ;
   private boolean[] P08AF10_n802PrvTip ;
   private String[] P08AF10_A396EmprCod ;
   private String[] P08AF11_A783PrvCta ;
   private boolean[] P08AF11_n783PrvCta ;
   private String[] P08AF11_A14216PrvAct ;
   private byte[] P08AF11_A3143PrvDivCo ;
   private short[] P08AF11_A798PrvPlaEnt ;
   private boolean[] P08AF11_n798PrvPlaEnt ;
   private String[] P08AF11_A801PrvRep ;
   private boolean[] P08AF11_n801PrvRep ;
   private int[] P08AF11_A780PrvBan ;
   private boolean[] P08AF11_n780PrvBan ;
   private int[] P08AF11_A797PrvPer ;
   private boolean[] P08AF11_n797PrvPer ;
   private int[] P08AF11_A785PrvDiaPag ;
   private boolean[] P08AF11_n785PrvDiaPag ;
   private byte[] P08AF11_A805PrvVto ;
   private boolean[] P08AF11_n805PrvVto ;
   private String[] P08AF11_A497FpgCod ;
   private boolean[] P08AF11_n497FpgCod ;
   private String[] P08AF11_A804PrvTlx ;
   private boolean[] P08AF11_n804PrvTlx ;
   private byte[] P08AF11_A800PrvPri ;
   private boolean[] P08AF11_n800PrvPri ;
   private String[] P08AF11_A803PrvTlf ;
   private boolean[] P08AF11_n803PrvTlf ;
   private String[] P08AF11_A793PrvNif ;
   private boolean[] P08AF11_n793PrvNif ;
   private String[] P08AF11_A799PrvPob ;
   private boolean[] P08AF11_n799PrvPob ;
   private String[] P08AF11_A782PrvCpo ;
   private boolean[] P08AF11_n782PrvCpo ;
   private String[] P08AF11_A786PrvDir ;
   private boolean[] P08AF11_n786PrvDir ;
   private String[] P08AF11_A794PrvNom ;
   private boolean[] P08AF11_n794PrvNom ;
   private int[] P08AF11_A795PrvNum ;
   private String[] P08AF11_A3092PrvDivCod ;
   private boolean[] P08AF11_n3092PrvDivCod ;
   private String[] P08AF11_A792PrvMetTra ;
   private boolean[] P08AF11_n792PrvMetTra ;
   private String[] P08AF11_A802PrvTip ;
   private boolean[] P08AF11_n802PrvTip ;
   private String[] P08AF11_A396EmprCod ;
   private GXSimpleCollection<String> AV81TFPrvTip_Sels ;
   private GXSimpleCollection<String> AV83TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV55TFPrvDivCod_Sels ;
   private GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ;
   private GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ;
   private GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ;
   private GXSimpleCollection<String> AV65Options ;
   private GXSimpleCollection<String> AV68OptionsDesc ;
   private GXSimpleCollection<String> AV70OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV75GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV76GridStateFilterValue ;
}

final  class tprvgenwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[35];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrvNom, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08AF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[35];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT PrvDir, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvDir" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08AF4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[35];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT PrvCpo, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvCpo" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08AF5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[35];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT PrvPob, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvPob" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08AF6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[35];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT PrvNif, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvNif" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08AF7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[35];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT PrvTlf, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvTlf" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P08AF8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[35];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT PrvTlx, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvTlx" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P08AF9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV92Tprvgenwwds_2_tfprvnum ,
                                          int AV93Tprvgenwwds_3_tfprvnum_to ,
                                          String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV94Tprvgenwwds_4_tfprvnom ,
                                          String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV96Tprvgenwwds_6_tfprvdir ,
                                          String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV98Tprvgenwwds_8_tfprvcpo ,
                                          String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV100Tprvgenwwds_10_tfprvpob ,
                                          String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV102Tprvgenwwds_12_tfprvnif ,
                                          String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV104Tprvgenwwds_14_tfprvtlf ,
                                          byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV107Tprvgenwwds_17_tfprvtlx ,
                                          int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV110Tprvgenwwds_20_tffpgcod ,
                                          byte AV112Tprvgenwwds_22_tfprvvto ,
                                          byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                          int AV114Tprvgenwwds_24_tfprvdiapag ,
                                          int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV116Tprvgenwwds_26_tfprvper ,
                                          int AV117Tprvgenwwds_27_tfprvper_to ,
                                          int AV118Tprvgenwwds_28_tfprvban ,
                                          int AV119Tprvgenwwds_29_tfprvban_to ,
                                          String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV120Tprvgenwwds_30_tfprvrep ,
                                          short AV122Tprvgenwwds_32_tfprvplaent ,
                                          short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV125Tprvgenwwds_35_tfprvcta ,
                                          int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV128Tprvgenwwds_38_tfprvdivco ,
                                          byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV130Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[35];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT FpgCod, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FpgCod" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P08AF10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A802PrvTip ,
                                           GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           String A3092PrvDivCod ,
                                           GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           int AV92Tprvgenwwds_2_tfprvnum ,
                                           int AV93Tprvgenwwds_3_tfprvnum_to ,
                                           String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           String AV94Tprvgenwwds_4_tfprvnom ,
                                           String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           String AV96Tprvgenwwds_6_tfprvdir ,
                                           String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           String AV98Tprvgenwwds_8_tfprvcpo ,
                                           String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           String AV100Tprvgenwwds_10_tfprvpob ,
                                           String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           String AV102Tprvgenwwds_12_tfprvnif ,
                                           String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           String AV104Tprvgenwwds_14_tfprvtlf ,
                                           byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                           String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           String AV107Tprvgenwwds_17_tfprvtlx ,
                                           int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                           String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           String AV110Tprvgenwwds_20_tffpgcod ,
                                           byte AV112Tprvgenwwds_22_tfprvvto ,
                                           byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                           int AV114Tprvgenwwds_24_tfprvdiapag ,
                                           int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                           int AV116Tprvgenwwds_26_tfprvper ,
                                           int AV117Tprvgenwwds_27_tfprvper_to ,
                                           int AV118Tprvgenwwds_28_tfprvban ,
                                           int AV119Tprvgenwwds_29_tfprvban_to ,
                                           String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           String AV120Tprvgenwwds_30_tfprvrep ,
                                           short AV122Tprvgenwwds_32_tfprvplaent ,
                                           short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                           int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                           String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           String AV125Tprvgenwwds_35_tfprvcta ,
                                           int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                           byte AV128Tprvgenwwds_38_tfprvdivco ,
                                           byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                           String AV130Tprvgenwwds_40_tfprvact_sel ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A782PrvCpo ,
                                           String A799PrvPob ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           byte A800PrvPri ,
                                           String A804PrvTlx ,
                                           String A497FpgCod ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           int A780PrvBan ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           byte A3143PrvDivCo ,
                                           String A14216PrvAct ,
                                           String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[35];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT PrvRep, PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvRep" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P08AF11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A802PrvTip ,
                                           GXSimpleCollection<String> AV109Tprvgenwwds_19_tfprvtip_sels ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV124Tprvgenwwds_34_tfprvmettra_sels ,
                                           String A3092PrvDivCod ,
                                           GXSimpleCollection<String> AV127Tprvgenwwds_37_tfprvdivcod_sels ,
                                           int AV92Tprvgenwwds_2_tfprvnum ,
                                           int AV93Tprvgenwwds_3_tfprvnum_to ,
                                           String AV95Tprvgenwwds_5_tfprvnom_sel ,
                                           String AV94Tprvgenwwds_4_tfprvnom ,
                                           String AV97Tprvgenwwds_7_tfprvdir_sel ,
                                           String AV96Tprvgenwwds_6_tfprvdir ,
                                           String AV99Tprvgenwwds_9_tfprvcpo_sel ,
                                           String AV98Tprvgenwwds_8_tfprvcpo ,
                                           String AV101Tprvgenwwds_11_tfprvpob_sel ,
                                           String AV100Tprvgenwwds_10_tfprvpob ,
                                           String AV103Tprvgenwwds_13_tfprvnif_sel ,
                                           String AV102Tprvgenwwds_12_tfprvnif ,
                                           String AV105Tprvgenwwds_15_tfprvtlf_sel ,
                                           String AV104Tprvgenwwds_14_tfprvtlf ,
                                           byte AV106Tprvgenwwds_16_tfprvpri_sel ,
                                           String AV108Tprvgenwwds_18_tfprvtlx_sel ,
                                           String AV107Tprvgenwwds_17_tfprvtlx ,
                                           int AV109Tprvgenwwds_19_tfprvtip_sels_size ,
                                           String AV111Tprvgenwwds_21_tffpgcod_sel ,
                                           String AV110Tprvgenwwds_20_tffpgcod ,
                                           byte AV112Tprvgenwwds_22_tfprvvto ,
                                           byte AV113Tprvgenwwds_23_tfprvvto_to ,
                                           int AV114Tprvgenwwds_24_tfprvdiapag ,
                                           int AV115Tprvgenwwds_25_tfprvdiapag_to ,
                                           int AV116Tprvgenwwds_26_tfprvper ,
                                           int AV117Tprvgenwwds_27_tfprvper_to ,
                                           int AV118Tprvgenwwds_28_tfprvban ,
                                           int AV119Tprvgenwwds_29_tfprvban_to ,
                                           String AV121Tprvgenwwds_31_tfprvrep_sel ,
                                           String AV120Tprvgenwwds_30_tfprvrep ,
                                           short AV122Tprvgenwwds_32_tfprvplaent ,
                                           short AV123Tprvgenwwds_33_tfprvplaent_to ,
                                           int AV124Tprvgenwwds_34_tfprvmettra_sels_size ,
                                           String AV126Tprvgenwwds_36_tfprvcta_sel ,
                                           String AV125Tprvgenwwds_35_tfprvcta ,
                                           int AV127Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                           byte AV128Tprvgenwwds_38_tfprvdivco ,
                                           byte AV129Tprvgenwwds_39_tfprvdivco_to ,
                                           String AV130Tprvgenwwds_40_tfprvact_sel ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A782PrvCpo ,
                                           String A799PrvPob ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           byte A800PrvPri ,
                                           String A804PrvTlx ,
                                           String A497FpgCod ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           int A780PrvBan ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           byte A3143PrvDivCo ,
                                           String A14216PrvAct ,
                                           String AV91Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[35];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT PrvCta, PrvAct, PrvDivCo, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV92Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV106Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( AV109Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( AV124Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV125Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( AV127Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV128Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvCta" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_P08AF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 1 :
                  return conditional_P08AF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 2 :
                  return conditional_P08AF4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 3 :
                  return conditional_P08AF5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 4 :
                  return conditional_P08AF6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 5 :
                  return conditional_P08AF7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 6 :
                  return conditional_P08AF8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 7 :
                  return conditional_P08AF9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 8 :
                  return conditional_P08AF10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 9 :
                  return conditional_P08AF11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AF11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 18);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 14);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

