package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mtoformulastintewwgetfilterdata extends GXProcedure
{
   public mtoformulastintewwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastintewwgetfilterdata.class ), "" );
   }

   public mtoformulastintewwgetfilterdata( int remoteHandle ,
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
      mtoformulastintewwgetfilterdata.this.aP5 = new String[] {""};
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
      mtoformulastintewwgetfilterdata.this.AV56DDOName = aP0;
      mtoformulastintewwgetfilterdata.this.AV54SearchTxt = aP1;
      mtoformulastintewwgetfilterdata.this.AV55SearchTxtTo = aP2;
      mtoformulastintewwgetfilterdata.this.aP3 = aP3;
      mtoformulastintewwgetfilterdata.this.aP4 = aP4;
      mtoformulastintewwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FORSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FORSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FORTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORTIPARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FORNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADFORNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FORTONAL") == 0 )
      {
         /* Execute user subroutine: 'LOADFORTONALOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FOROPCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADFOROPCCLIOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_INTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV60OptionsJson = AV59Options.toJSonString(false) ;
      AV63OptionsDescJson = AV62OptionsDesc.toJSonString(false) ;
      AV65OptionIndexesJson = AV64OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV67Session.getValue("FormulacionTinte.MtoFormulasTinteWWGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.MtoFormulasTinteWWGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("FormulacionTinte.MtoFormulasTinteWWGridState"), null, null);
      }
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV72FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV16TFForSerDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV17TFForSerDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV83TFForTipArtDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV84TFForTipArtDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV18TFForColNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV19TFForColNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV48TFForNomCli = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV49TFForNomCli_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV22TFTipColCod = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFTipColCod_To = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV24TFTipColDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV25TFTipColDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV75TFForUltUti = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV76TFForUltUti_To = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV77TFForNumCol = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFForNumCol_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL") == 0 )
         {
            AV85TFForTonal = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL_SEL") == 0 )
         {
            AV86TFForTonal_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV79TFForRelBan = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV80TFForRelBan_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI") == 0 )
         {
            AV87TFForOpcCli = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI_SEL") == 0 )
         {
            AV88TFForOpcCli_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV28TFIntDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV29TFIntDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRO_SEL") == 0 )
         {
            AV89TFForPro_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV97TFForBlo_SelsJson = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV98TFForBlo_Sels.fromJSonString(AV97TFForBlo_SelsJson, null);
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV54SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09592 */
      pr_default.execute(0, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9592 = false ;
         A396EmprCod = P09592_A396EmprCod[0] ;
         A583IntCod = P09592_A583IntCod[0] ;
         A4384ForTipArt = P09592_A4384ForTipArt[0] ;
         n4384ForTipArt = P09592_n4384ForTipArt[0] ;
         A10045CliAct = P09592_A10045CliAct[0] ;
         A279CliNom = P09592_A279CliNom[0] ;
         A485ForFec = P09592_A485ForFec[0] ;
         n485ForFec = P09592_n485ForFec[0] ;
         A483ForColNum = P09592_A483ForColNum[0] ;
         A252CliCod = P09592_A252CliCod[0] ;
         A2749ForPro = P09592_A2749ForPro[0] ;
         n2749ForPro = P09592_n2749ForPro[0] ;
         A584IntDsc = P09592_A584IntDsc[0] ;
         n584IntDsc = P09592_n584IntDsc[0] ;
         A3560ForOpcCli = P09592_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09592_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09592_A2838ForRelBan[0] ;
         n2838ForRelBan = P09592_n2838ForRelBan[0] ;
         A995ForTonal = P09592_A995ForTonal[0] ;
         n995ForTonal = P09592_n995ForTonal[0] ;
         A486ForNumCol = P09592_A486ForNumCol[0] ;
         A496ForUltUti = P09592_A496ForUltUti[0] ;
         n496ForUltUti = P09592_n496ForUltUti[0] ;
         A832TipColDsc = P09592_A832TipColDsc[0] ;
         n832TipColDsc = P09592_n832TipColDsc[0] ;
         A831TipColCod = P09592_A831TipColCod[0] ;
         A1191ForNomCli = P09592_A1191ForNomCli[0] ;
         n1191ForNomCli = P09592_n1191ForNomCli[0] ;
         A482ForColNom = P09592_A482ForColNom[0] ;
         A5742ForSerDsc = P09592_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09592_n5742ForSerDsc[0] ;
         A494ForSer = P09592_A494ForSer[0] ;
         A7781ForBlo = P09592_A7781ForBlo[0] ;
         n7781ForBlo = P09592_n7781ForBlo[0] ;
         A13929ForTipArtD = P09592_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09592_n13929ForTipArtD[0] ;
         A584IntDsc = P09592_A584IntDsc[0] ;
         n584IntDsc = P09592_n584IntDsc[0] ;
         A13929ForTipArtD = P09592_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09592_n13929ForTipArtD[0] ;
         A10045CliAct = P09592_A10045CliAct[0] ;
         A279CliNom = P09592_A279CliNom[0] ;
         A832TipColDsc = P09592_A832TipColDsc[0] ;
         n832TipColDsc = P09592_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09592_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk9592 = false ;
               A396EmprCod = P09592_A396EmprCod[0] ;
               A483ForColNum = P09592_A483ForColNum[0] ;
               A252CliCod = P09592_A252CliCod[0] ;
               A831TipColCod = P09592_A831TipColCod[0] ;
               A482ForColNom = P09592_A482ForColNom[0] ;
               A494ForSer = P09592_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk9592 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV58Option = A279CliNom ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9592 )
         {
            brk9592 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV54SearchTxt ;
      AV15TFForSer_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09593 */
      pr_default.execute(1, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9594 = false ;
         A396EmprCod = P09593_A396EmprCod[0] ;
         A583IntCod = P09593_A583IntCod[0] ;
         A4384ForTipArt = P09593_A4384ForTipArt[0] ;
         n4384ForTipArt = P09593_n4384ForTipArt[0] ;
         A10045CliAct = P09593_A10045CliAct[0] ;
         A494ForSer = P09593_A494ForSer[0] ;
         A485ForFec = P09593_A485ForFec[0] ;
         n485ForFec = P09593_n485ForFec[0] ;
         A483ForColNum = P09593_A483ForColNum[0] ;
         A252CliCod = P09593_A252CliCod[0] ;
         A2749ForPro = P09593_A2749ForPro[0] ;
         n2749ForPro = P09593_n2749ForPro[0] ;
         A584IntDsc = P09593_A584IntDsc[0] ;
         n584IntDsc = P09593_n584IntDsc[0] ;
         A3560ForOpcCli = P09593_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09593_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09593_A2838ForRelBan[0] ;
         n2838ForRelBan = P09593_n2838ForRelBan[0] ;
         A995ForTonal = P09593_A995ForTonal[0] ;
         n995ForTonal = P09593_n995ForTonal[0] ;
         A486ForNumCol = P09593_A486ForNumCol[0] ;
         A496ForUltUti = P09593_A496ForUltUti[0] ;
         n496ForUltUti = P09593_n496ForUltUti[0] ;
         A832TipColDsc = P09593_A832TipColDsc[0] ;
         n832TipColDsc = P09593_n832TipColDsc[0] ;
         A831TipColCod = P09593_A831TipColCod[0] ;
         A1191ForNomCli = P09593_A1191ForNomCli[0] ;
         n1191ForNomCli = P09593_n1191ForNomCli[0] ;
         A482ForColNom = P09593_A482ForColNom[0] ;
         A5742ForSerDsc = P09593_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09593_n5742ForSerDsc[0] ;
         A279CliNom = P09593_A279CliNom[0] ;
         A7781ForBlo = P09593_A7781ForBlo[0] ;
         n7781ForBlo = P09593_n7781ForBlo[0] ;
         A13929ForTipArtD = P09593_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09593_n13929ForTipArtD[0] ;
         A584IntDsc = P09593_A584IntDsc[0] ;
         n584IntDsc = P09593_n584IntDsc[0] ;
         A13929ForTipArtD = P09593_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09593_n13929ForTipArtD[0] ;
         A10045CliAct = P09593_A10045CliAct[0] ;
         A279CliNom = P09593_A279CliNom[0] ;
         A832TipColDsc = P09593_A832TipColDsc[0] ;
         n832TipColDsc = P09593_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09593_A494ForSer[0], A494ForSer) == 0 ) )
            {
               brk9594 = false ;
               A396EmprCod = P09593_A396EmprCod[0] ;
               A483ForColNum = P09593_A483ForColNum[0] ;
               A252CliCod = P09593_A252CliCod[0] ;
               A831TipColCod = P09593_A831TipColCod[0] ;
               A482ForColNom = P09593_A482ForColNom[0] ;
               AV66count = (long)(AV66count+1) ;
               brk9594 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A494ForSer)==0) )
            {
               AV58Option = A494ForSer ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9594 )
         {
            brk9594 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForSerDsc = AV54SearchTxt ;
      AV17TFForSerDsc_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09594 */
      pr_default.execute(2, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9596 = false ;
         A396EmprCod = P09594_A396EmprCod[0] ;
         A583IntCod = P09594_A583IntCod[0] ;
         A4384ForTipArt = P09594_A4384ForTipArt[0] ;
         n4384ForTipArt = P09594_n4384ForTipArt[0] ;
         A10045CliAct = P09594_A10045CliAct[0] ;
         A5742ForSerDsc = P09594_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09594_n5742ForSerDsc[0] ;
         A485ForFec = P09594_A485ForFec[0] ;
         n485ForFec = P09594_n485ForFec[0] ;
         A483ForColNum = P09594_A483ForColNum[0] ;
         A252CliCod = P09594_A252CliCod[0] ;
         A2749ForPro = P09594_A2749ForPro[0] ;
         n2749ForPro = P09594_n2749ForPro[0] ;
         A584IntDsc = P09594_A584IntDsc[0] ;
         n584IntDsc = P09594_n584IntDsc[0] ;
         A3560ForOpcCli = P09594_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09594_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09594_A2838ForRelBan[0] ;
         n2838ForRelBan = P09594_n2838ForRelBan[0] ;
         A995ForTonal = P09594_A995ForTonal[0] ;
         n995ForTonal = P09594_n995ForTonal[0] ;
         A486ForNumCol = P09594_A486ForNumCol[0] ;
         A496ForUltUti = P09594_A496ForUltUti[0] ;
         n496ForUltUti = P09594_n496ForUltUti[0] ;
         A832TipColDsc = P09594_A832TipColDsc[0] ;
         n832TipColDsc = P09594_n832TipColDsc[0] ;
         A831TipColCod = P09594_A831TipColCod[0] ;
         A1191ForNomCli = P09594_A1191ForNomCli[0] ;
         n1191ForNomCli = P09594_n1191ForNomCli[0] ;
         A482ForColNom = P09594_A482ForColNom[0] ;
         A494ForSer = P09594_A494ForSer[0] ;
         A279CliNom = P09594_A279CliNom[0] ;
         A7781ForBlo = P09594_A7781ForBlo[0] ;
         n7781ForBlo = P09594_n7781ForBlo[0] ;
         A13929ForTipArtD = P09594_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09594_n13929ForTipArtD[0] ;
         A584IntDsc = P09594_A584IntDsc[0] ;
         n584IntDsc = P09594_n584IntDsc[0] ;
         A13929ForTipArtD = P09594_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09594_n13929ForTipArtD[0] ;
         A10045CliAct = P09594_A10045CliAct[0] ;
         A279CliNom = P09594_A279CliNom[0] ;
         A832TipColDsc = P09594_A832TipColDsc[0] ;
         n832TipColDsc = P09594_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09594_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
            {
               brk9596 = false ;
               A396EmprCod = P09594_A396EmprCod[0] ;
               A483ForColNum = P09594_A483ForColNum[0] ;
               A252CliCod = P09594_A252CliCod[0] ;
               A831TipColCod = P09594_A831TipColCod[0] ;
               A482ForColNom = P09594_A482ForColNom[0] ;
               A494ForSer = P09594_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk9596 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
            {
               AV58Option = A5742ForSerDsc ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9596 )
         {
            brk9596 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV83TFForTipArtDsc = AV54SearchTxt ;
      AV84TFForTipArtDsc_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09595 */
      pr_default.execute(3, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P09595_A396EmprCod[0] ;
         A583IntCod = P09595_A583IntCod[0] ;
         A4384ForTipArt = P09595_A4384ForTipArt[0] ;
         n4384ForTipArt = P09595_n4384ForTipArt[0] ;
         A485ForFec = P09595_A485ForFec[0] ;
         n485ForFec = P09595_n485ForFec[0] ;
         A10045CliAct = P09595_A10045CliAct[0] ;
         A483ForColNum = P09595_A483ForColNum[0] ;
         A252CliCod = P09595_A252CliCod[0] ;
         A2749ForPro = P09595_A2749ForPro[0] ;
         n2749ForPro = P09595_n2749ForPro[0] ;
         A584IntDsc = P09595_A584IntDsc[0] ;
         n584IntDsc = P09595_n584IntDsc[0] ;
         A3560ForOpcCli = P09595_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09595_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09595_A2838ForRelBan[0] ;
         n2838ForRelBan = P09595_n2838ForRelBan[0] ;
         A995ForTonal = P09595_A995ForTonal[0] ;
         n995ForTonal = P09595_n995ForTonal[0] ;
         A486ForNumCol = P09595_A486ForNumCol[0] ;
         A496ForUltUti = P09595_A496ForUltUti[0] ;
         n496ForUltUti = P09595_n496ForUltUti[0] ;
         A832TipColDsc = P09595_A832TipColDsc[0] ;
         n832TipColDsc = P09595_n832TipColDsc[0] ;
         A831TipColCod = P09595_A831TipColCod[0] ;
         A1191ForNomCli = P09595_A1191ForNomCli[0] ;
         n1191ForNomCli = P09595_n1191ForNomCli[0] ;
         A482ForColNom = P09595_A482ForColNom[0] ;
         A5742ForSerDsc = P09595_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09595_n5742ForSerDsc[0] ;
         A494ForSer = P09595_A494ForSer[0] ;
         A279CliNom = P09595_A279CliNom[0] ;
         A7781ForBlo = P09595_A7781ForBlo[0] ;
         n7781ForBlo = P09595_n7781ForBlo[0] ;
         A13929ForTipArtD = P09595_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09595_n13929ForTipArtD[0] ;
         A584IntDsc = P09595_A584IntDsc[0] ;
         n584IntDsc = P09595_n584IntDsc[0] ;
         A13929ForTipArtD = P09595_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09595_n13929ForTipArtD[0] ;
         A10045CliAct = P09595_A10045CliAct[0] ;
         A279CliNom = P09595_A279CliNom[0] ;
         A832TipColDsc = P09595_A832TipColDsc[0] ;
         n832TipColDsc = P09595_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            if ( ! (GXutil.strcmp("", A13929ForTipArtD)==0) )
            {
               AV58Option = A13929ForTipArtD ;
               AV57InsertIndex = 1 ;
               while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
               {
                  AV57InsertIndex = (int)(AV57InsertIndex+1) ;
               }
               if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
               {
                  AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                  AV66count = (long)(AV66count+1) ;
                  AV64OptionIndexes.removeItem(AV57InsertIndex);
                  AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
               }
               else
               {
                  AV59Options.add(AV58Option, AV57InsertIndex);
                  AV64OptionIndexes.add("1", AV57InsertIndex);
               }
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForColNom = AV54SearchTxt ;
      AV19TFForColNom_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09596 */
      pr_default.execute(4, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9599 = false ;
         A396EmprCod = P09596_A396EmprCod[0] ;
         A583IntCod = P09596_A583IntCod[0] ;
         A4384ForTipArt = P09596_A4384ForTipArt[0] ;
         n4384ForTipArt = P09596_n4384ForTipArt[0] ;
         A10045CliAct = P09596_A10045CliAct[0] ;
         A482ForColNom = P09596_A482ForColNom[0] ;
         A485ForFec = P09596_A485ForFec[0] ;
         n485ForFec = P09596_n485ForFec[0] ;
         A483ForColNum = P09596_A483ForColNum[0] ;
         A252CliCod = P09596_A252CliCod[0] ;
         A2749ForPro = P09596_A2749ForPro[0] ;
         n2749ForPro = P09596_n2749ForPro[0] ;
         A584IntDsc = P09596_A584IntDsc[0] ;
         n584IntDsc = P09596_n584IntDsc[0] ;
         A3560ForOpcCli = P09596_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09596_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09596_A2838ForRelBan[0] ;
         n2838ForRelBan = P09596_n2838ForRelBan[0] ;
         A995ForTonal = P09596_A995ForTonal[0] ;
         n995ForTonal = P09596_n995ForTonal[0] ;
         A486ForNumCol = P09596_A486ForNumCol[0] ;
         A496ForUltUti = P09596_A496ForUltUti[0] ;
         n496ForUltUti = P09596_n496ForUltUti[0] ;
         A832TipColDsc = P09596_A832TipColDsc[0] ;
         n832TipColDsc = P09596_n832TipColDsc[0] ;
         A831TipColCod = P09596_A831TipColCod[0] ;
         A1191ForNomCli = P09596_A1191ForNomCli[0] ;
         n1191ForNomCli = P09596_n1191ForNomCli[0] ;
         A5742ForSerDsc = P09596_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09596_n5742ForSerDsc[0] ;
         A494ForSer = P09596_A494ForSer[0] ;
         A279CliNom = P09596_A279CliNom[0] ;
         A7781ForBlo = P09596_A7781ForBlo[0] ;
         n7781ForBlo = P09596_n7781ForBlo[0] ;
         A13929ForTipArtD = P09596_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09596_n13929ForTipArtD[0] ;
         A584IntDsc = P09596_A584IntDsc[0] ;
         n584IntDsc = P09596_n584IntDsc[0] ;
         A13929ForTipArtD = P09596_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09596_n13929ForTipArtD[0] ;
         A10045CliAct = P09596_A10045CliAct[0] ;
         A279CliNom = P09596_A279CliNom[0] ;
         A832TipColDsc = P09596_A832TipColDsc[0] ;
         n832TipColDsc = P09596_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09596_A482ForColNom[0], A482ForColNom) == 0 ) )
            {
               brk9599 = false ;
               A396EmprCod = P09596_A396EmprCod[0] ;
               A483ForColNum = P09596_A483ForColNum[0] ;
               A252CliCod = P09596_A252CliCod[0] ;
               A831TipColCod = P09596_A831TipColCod[0] ;
               A494ForSer = P09596_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk9599 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
            {
               AV58Option = A482ForColNom ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9599 )
         {
            brk9599 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFORNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV48TFForNomCli = AV54SearchTxt ;
      AV49TFForNomCli_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09597 */
      pr_default.execute(5, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk95911 = false ;
         A396EmprCod = P09597_A396EmprCod[0] ;
         A583IntCod = P09597_A583IntCod[0] ;
         A4384ForTipArt = P09597_A4384ForTipArt[0] ;
         n4384ForTipArt = P09597_n4384ForTipArt[0] ;
         A10045CliAct = P09597_A10045CliAct[0] ;
         A1191ForNomCli = P09597_A1191ForNomCli[0] ;
         n1191ForNomCli = P09597_n1191ForNomCli[0] ;
         A485ForFec = P09597_A485ForFec[0] ;
         n485ForFec = P09597_n485ForFec[0] ;
         A483ForColNum = P09597_A483ForColNum[0] ;
         A252CliCod = P09597_A252CliCod[0] ;
         A2749ForPro = P09597_A2749ForPro[0] ;
         n2749ForPro = P09597_n2749ForPro[0] ;
         A584IntDsc = P09597_A584IntDsc[0] ;
         n584IntDsc = P09597_n584IntDsc[0] ;
         A3560ForOpcCli = P09597_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09597_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09597_A2838ForRelBan[0] ;
         n2838ForRelBan = P09597_n2838ForRelBan[0] ;
         A995ForTonal = P09597_A995ForTonal[0] ;
         n995ForTonal = P09597_n995ForTonal[0] ;
         A486ForNumCol = P09597_A486ForNumCol[0] ;
         A496ForUltUti = P09597_A496ForUltUti[0] ;
         n496ForUltUti = P09597_n496ForUltUti[0] ;
         A832TipColDsc = P09597_A832TipColDsc[0] ;
         n832TipColDsc = P09597_n832TipColDsc[0] ;
         A831TipColCod = P09597_A831TipColCod[0] ;
         A482ForColNom = P09597_A482ForColNom[0] ;
         A5742ForSerDsc = P09597_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09597_n5742ForSerDsc[0] ;
         A494ForSer = P09597_A494ForSer[0] ;
         A279CliNom = P09597_A279CliNom[0] ;
         A7781ForBlo = P09597_A7781ForBlo[0] ;
         n7781ForBlo = P09597_n7781ForBlo[0] ;
         A13929ForTipArtD = P09597_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09597_n13929ForTipArtD[0] ;
         A584IntDsc = P09597_A584IntDsc[0] ;
         n584IntDsc = P09597_n584IntDsc[0] ;
         A13929ForTipArtD = P09597_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09597_n13929ForTipArtD[0] ;
         A10045CliAct = P09597_A10045CliAct[0] ;
         A279CliNom = P09597_A279CliNom[0] ;
         A832TipColDsc = P09597_A832TipColDsc[0] ;
         n832TipColDsc = P09597_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09597_A1191ForNomCli[0], A1191ForNomCli) == 0 ) )
            {
               brk95911 = false ;
               A396EmprCod = P09597_A396EmprCod[0] ;
               A483ForColNum = P09597_A483ForColNum[0] ;
               A252CliCod = P09597_A252CliCod[0] ;
               A831TipColCod = P09597_A831TipColCod[0] ;
               A482ForColNom = P09597_A482ForColNom[0] ;
               A494ForSer = P09597_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk95911 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A1191ForNomCli)==0) )
            {
               AV58Option = A1191ForNomCli ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk95911 )
         {
            brk95911 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFTipColDsc = AV54SearchTxt ;
      AV25TFTipColDsc_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09598 */
      pr_default.execute(6, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk95913 = false ;
         A583IntCod = P09598_A583IntCod[0] ;
         A4384ForTipArt = P09598_A4384ForTipArt[0] ;
         n4384ForTipArt = P09598_n4384ForTipArt[0] ;
         A831TipColCod = P09598_A831TipColCod[0] ;
         A396EmprCod = P09598_A396EmprCod[0] ;
         A485ForFec = P09598_A485ForFec[0] ;
         n485ForFec = P09598_n485ForFec[0] ;
         A10045CliAct = P09598_A10045CliAct[0] ;
         A483ForColNum = P09598_A483ForColNum[0] ;
         A252CliCod = P09598_A252CliCod[0] ;
         A2749ForPro = P09598_A2749ForPro[0] ;
         n2749ForPro = P09598_n2749ForPro[0] ;
         A584IntDsc = P09598_A584IntDsc[0] ;
         n584IntDsc = P09598_n584IntDsc[0] ;
         A3560ForOpcCli = P09598_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09598_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09598_A2838ForRelBan[0] ;
         n2838ForRelBan = P09598_n2838ForRelBan[0] ;
         A995ForTonal = P09598_A995ForTonal[0] ;
         n995ForTonal = P09598_n995ForTonal[0] ;
         A486ForNumCol = P09598_A486ForNumCol[0] ;
         A496ForUltUti = P09598_A496ForUltUti[0] ;
         n496ForUltUti = P09598_n496ForUltUti[0] ;
         A832TipColDsc = P09598_A832TipColDsc[0] ;
         n832TipColDsc = P09598_n832TipColDsc[0] ;
         A1191ForNomCli = P09598_A1191ForNomCli[0] ;
         n1191ForNomCli = P09598_n1191ForNomCli[0] ;
         A482ForColNom = P09598_A482ForColNom[0] ;
         A5742ForSerDsc = P09598_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09598_n5742ForSerDsc[0] ;
         A494ForSer = P09598_A494ForSer[0] ;
         A279CliNom = P09598_A279CliNom[0] ;
         A7781ForBlo = P09598_A7781ForBlo[0] ;
         n7781ForBlo = P09598_n7781ForBlo[0] ;
         A13929ForTipArtD = P09598_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09598_n13929ForTipArtD[0] ;
         A584IntDsc = P09598_A584IntDsc[0] ;
         n584IntDsc = P09598_n584IntDsc[0] ;
         A832TipColDsc = P09598_A832TipColDsc[0] ;
         n832TipColDsc = P09598_n832TipColDsc[0] ;
         A13929ForTipArtD = P09598_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09598_n13929ForTipArtD[0] ;
         A10045CliAct = P09598_A10045CliAct[0] ;
         A279CliNom = P09598_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09598_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09598_A831TipColCod[0] == A831TipColCod ) )
            {
               brk95913 = false ;
               A483ForColNum = P09598_A483ForColNum[0] ;
               A252CliCod = P09598_A252CliCod[0] ;
               A482ForColNom = P09598_A482ForColNom[0] ;
               A494ForSer = P09598_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk95913 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
            {
               AV58Option = A832TipColDsc ;
               AV57InsertIndex = 1 ;
               while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
               {
                  AV57InsertIndex = (int)(AV57InsertIndex+1) ;
               }
               AV59Options.add(AV58Option, AV57InsertIndex);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk95913 )
         {
            brk95913 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFORTONALOPTIONS' Routine */
      returnInSub = false ;
      AV85TFForTonal = AV54SearchTxt ;
      AV86TFForTonal_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P09599 */
      pr_default.execute(7, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk95915 = false ;
         A396EmprCod = P09599_A396EmprCod[0] ;
         A583IntCod = P09599_A583IntCod[0] ;
         A4384ForTipArt = P09599_A4384ForTipArt[0] ;
         n4384ForTipArt = P09599_n4384ForTipArt[0] ;
         A10045CliAct = P09599_A10045CliAct[0] ;
         A995ForTonal = P09599_A995ForTonal[0] ;
         n995ForTonal = P09599_n995ForTonal[0] ;
         A485ForFec = P09599_A485ForFec[0] ;
         n485ForFec = P09599_n485ForFec[0] ;
         A483ForColNum = P09599_A483ForColNum[0] ;
         A252CliCod = P09599_A252CliCod[0] ;
         A2749ForPro = P09599_A2749ForPro[0] ;
         n2749ForPro = P09599_n2749ForPro[0] ;
         A584IntDsc = P09599_A584IntDsc[0] ;
         n584IntDsc = P09599_n584IntDsc[0] ;
         A3560ForOpcCli = P09599_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P09599_n3560ForOpcCli[0] ;
         A2838ForRelBan = P09599_A2838ForRelBan[0] ;
         n2838ForRelBan = P09599_n2838ForRelBan[0] ;
         A486ForNumCol = P09599_A486ForNumCol[0] ;
         A496ForUltUti = P09599_A496ForUltUti[0] ;
         n496ForUltUti = P09599_n496ForUltUti[0] ;
         A832TipColDsc = P09599_A832TipColDsc[0] ;
         n832TipColDsc = P09599_n832TipColDsc[0] ;
         A831TipColCod = P09599_A831TipColCod[0] ;
         A1191ForNomCli = P09599_A1191ForNomCli[0] ;
         n1191ForNomCli = P09599_n1191ForNomCli[0] ;
         A482ForColNom = P09599_A482ForColNom[0] ;
         A5742ForSerDsc = P09599_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09599_n5742ForSerDsc[0] ;
         A494ForSer = P09599_A494ForSer[0] ;
         A279CliNom = P09599_A279CliNom[0] ;
         A7781ForBlo = P09599_A7781ForBlo[0] ;
         n7781ForBlo = P09599_n7781ForBlo[0] ;
         A13929ForTipArtD = P09599_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09599_n13929ForTipArtD[0] ;
         A584IntDsc = P09599_A584IntDsc[0] ;
         n584IntDsc = P09599_n584IntDsc[0] ;
         A13929ForTipArtD = P09599_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09599_n13929ForTipArtD[0] ;
         A10045CliAct = P09599_A10045CliAct[0] ;
         A279CliNom = P09599_A279CliNom[0] ;
         A832TipColDsc = P09599_A832TipColDsc[0] ;
         n832TipColDsc = P09599_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09599_A995ForTonal[0], A995ForTonal) == 0 ) )
            {
               brk95915 = false ;
               A396EmprCod = P09599_A396EmprCod[0] ;
               A483ForColNum = P09599_A483ForColNum[0] ;
               A252CliCod = P09599_A252CliCod[0] ;
               A831TipColCod = P09599_A831TipColCod[0] ;
               A482ForColNom = P09599_A482ForColNom[0] ;
               A494ForSer = P09599_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk95915 = true ;
               pr_default.readNext(7);
            }
            if ( ! (GXutil.strcmp("", A995ForTonal)==0) )
            {
               AV58Option = A995ForTonal ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk95915 )
         {
            brk95915 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADFOROPCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV87TFForOpcCli = AV54SearchTxt ;
      AV88TFForOpcCli_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P095910 */
      pr_default.execute(8, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk95917 = false ;
         A396EmprCod = P095910_A396EmprCod[0] ;
         A583IntCod = P095910_A583IntCod[0] ;
         A4384ForTipArt = P095910_A4384ForTipArt[0] ;
         n4384ForTipArt = P095910_n4384ForTipArt[0] ;
         A10045CliAct = P095910_A10045CliAct[0] ;
         A3560ForOpcCli = P095910_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P095910_n3560ForOpcCli[0] ;
         A485ForFec = P095910_A485ForFec[0] ;
         n485ForFec = P095910_n485ForFec[0] ;
         A483ForColNum = P095910_A483ForColNum[0] ;
         A252CliCod = P095910_A252CliCod[0] ;
         A2749ForPro = P095910_A2749ForPro[0] ;
         n2749ForPro = P095910_n2749ForPro[0] ;
         A584IntDsc = P095910_A584IntDsc[0] ;
         n584IntDsc = P095910_n584IntDsc[0] ;
         A2838ForRelBan = P095910_A2838ForRelBan[0] ;
         n2838ForRelBan = P095910_n2838ForRelBan[0] ;
         A995ForTonal = P095910_A995ForTonal[0] ;
         n995ForTonal = P095910_n995ForTonal[0] ;
         A486ForNumCol = P095910_A486ForNumCol[0] ;
         A496ForUltUti = P095910_A496ForUltUti[0] ;
         n496ForUltUti = P095910_n496ForUltUti[0] ;
         A832TipColDsc = P095910_A832TipColDsc[0] ;
         n832TipColDsc = P095910_n832TipColDsc[0] ;
         A831TipColCod = P095910_A831TipColCod[0] ;
         A1191ForNomCli = P095910_A1191ForNomCli[0] ;
         n1191ForNomCli = P095910_n1191ForNomCli[0] ;
         A482ForColNom = P095910_A482ForColNom[0] ;
         A5742ForSerDsc = P095910_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095910_n5742ForSerDsc[0] ;
         A494ForSer = P095910_A494ForSer[0] ;
         A279CliNom = P095910_A279CliNom[0] ;
         A7781ForBlo = P095910_A7781ForBlo[0] ;
         n7781ForBlo = P095910_n7781ForBlo[0] ;
         A13929ForTipArtD = P095910_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P095910_n13929ForTipArtD[0] ;
         A584IntDsc = P095910_A584IntDsc[0] ;
         n584IntDsc = P095910_n584IntDsc[0] ;
         A13929ForTipArtD = P095910_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P095910_n13929ForTipArtD[0] ;
         A10045CliAct = P095910_A10045CliAct[0] ;
         A279CliNom = P095910_A279CliNom[0] ;
         A832TipColDsc = P095910_A832TipColDsc[0] ;
         n832TipColDsc = P095910_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P095910_A3560ForOpcCli[0], A3560ForOpcCli) == 0 ) )
            {
               brk95917 = false ;
               A396EmprCod = P095910_A396EmprCod[0] ;
               A483ForColNum = P095910_A483ForColNum[0] ;
               A252CliCod = P095910_A252CliCod[0] ;
               A831TipColCod = P095910_A831TipColCod[0] ;
               A482ForColNom = P095910_A482ForColNom[0] ;
               A494ForSer = P095910_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk95917 = true ;
               pr_default.readNext(8);
            }
            if ( ! (GXutil.strcmp("", A3560ForOpcCli)==0) )
            {
               AV58Option = A3560ForOpcCli ;
               AV61OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!"))) ;
               AV59Options.add(AV58Option, 0);
               AV62OptionsDesc.add(AV61OptionDesc, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk95917 )
         {
            brk95917 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADINTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV28TFIntDsc = AV54SearchTxt ;
      AV29TFIntDsc_Sel = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV72FilterFullText ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV12TFCliNom ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = AV14TFForSer ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV15TFForSer_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV16TFForSerDsc ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV83TFForTipArtDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV84TFForTipArtDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV18TFForColNom ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV48TFForNomCli ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV49TFForNomCli_Sel ;
      AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV22TFTipColCod ;
      AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV75TFForUltUti ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV76TFForUltUti_To ;
      AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV77TFForNumCol ;
      AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV78TFForNumCol_To ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV85TFForTonal ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV86TFForTonal_Sel ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV79TFForRelBan ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV80TFForRelBan_To ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV87TFForOpcCli ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV88TFForOpcCli_Sel ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV28TFIntDsc ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV29TFIntDsc_Sel ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV89TFForPro_Sel ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV92ForFec ,
                                           AV100ForFecto ,
                                           Integer.valueOf(AV94CliCodform) ,
                                           Integer.valueOf(AV95CliCodto) ,
                                           Integer.valueOf(AV96Forcolnum) ,
                                           AV99ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P095911 */
      pr_default.execute(9, new Object[] {AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV108Formulaciontinte_mtoformulastintewwds_4_tfforser, AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV92ForFec, AV100ForFecto, Integer.valueOf(AV94CliCodform), Integer.valueOf(AV95CliCodto), Integer.valueOf(AV96Forcolnum), AV99ForColNom});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk95919 = false ;
         A4384ForTipArt = P095911_A4384ForTipArt[0] ;
         n4384ForTipArt = P095911_n4384ForTipArt[0] ;
         A583IntCod = P095911_A583IntCod[0] ;
         A396EmprCod = P095911_A396EmprCod[0] ;
         A485ForFec = P095911_A485ForFec[0] ;
         n485ForFec = P095911_n485ForFec[0] ;
         A10045CliAct = P095911_A10045CliAct[0] ;
         A483ForColNum = P095911_A483ForColNum[0] ;
         A252CliCod = P095911_A252CliCod[0] ;
         A2749ForPro = P095911_A2749ForPro[0] ;
         n2749ForPro = P095911_n2749ForPro[0] ;
         A584IntDsc = P095911_A584IntDsc[0] ;
         n584IntDsc = P095911_n584IntDsc[0] ;
         A3560ForOpcCli = P095911_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P095911_n3560ForOpcCli[0] ;
         A2838ForRelBan = P095911_A2838ForRelBan[0] ;
         n2838ForRelBan = P095911_n2838ForRelBan[0] ;
         A995ForTonal = P095911_A995ForTonal[0] ;
         n995ForTonal = P095911_n995ForTonal[0] ;
         A486ForNumCol = P095911_A486ForNumCol[0] ;
         A496ForUltUti = P095911_A496ForUltUti[0] ;
         n496ForUltUti = P095911_n496ForUltUti[0] ;
         A832TipColDsc = P095911_A832TipColDsc[0] ;
         n832TipColDsc = P095911_n832TipColDsc[0] ;
         A831TipColCod = P095911_A831TipColCod[0] ;
         A1191ForNomCli = P095911_A1191ForNomCli[0] ;
         n1191ForNomCli = P095911_n1191ForNomCli[0] ;
         A482ForColNom = P095911_A482ForColNom[0] ;
         A5742ForSerDsc = P095911_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095911_n5742ForSerDsc[0] ;
         A494ForSer = P095911_A494ForSer[0] ;
         A279CliNom = P095911_A279CliNom[0] ;
         A7781ForBlo = P095911_A7781ForBlo[0] ;
         n7781ForBlo = P095911_n7781ForBlo[0] ;
         A13929ForTipArtD = P095911_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P095911_n13929ForTipArtD[0] ;
         A584IntDsc = P095911_A584IntDsc[0] ;
         n584IntDsc = P095911_n584IntDsc[0] ;
         A13929ForTipArtD = P095911_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P095911_n13929ForTipArtD[0] ;
         A10045CliAct = P095911_A10045CliAct[0] ;
         A279CliNom = P095911_A279CliNom[0] ;
         A832TipColDsc = P095911_A832TipColDsc[0] ;
         n832TipColDsc = P095911_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P095911_A396EmprCod[0], A396EmprCod) == 0 ) && ( P095911_A583IntCod[0] == A583IntCod ) )
            {
               brk95919 = false ;
               A483ForColNum = P095911_A483ForColNum[0] ;
               A252CliCod = P095911_A252CliCod[0] ;
               A831TipColCod = P095911_A831TipColCod[0] ;
               A482ForColNom = P095911_A482ForColNom[0] ;
               A494ForSer = P095911_A494ForSer[0] ;
               AV66count = (long)(AV66count+1) ;
               brk95919 = true ;
               pr_default.readNext(9);
            }
            if ( ! (GXutil.strcmp("", A584IntDsc)==0) )
            {
               AV58Option = A584IntDsc ;
               AV57InsertIndex = 1 ;
               while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
               {
                  AV57InsertIndex = (int)(AV57InsertIndex+1) ;
               }
               AV59Options.add(AV58Option, AV57InsertIndex);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk95919 )
         {
            brk95919 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mtoformulastintewwgetfilterdata.this.AV60OptionsJson;
      this.aP4[0] = mtoformulastintewwgetfilterdata.this.AV63OptionsDescJson;
      this.aP5[0] = mtoformulastintewwgetfilterdata.this.AV65OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60OptionsJson = "" ;
      AV63OptionsDescJson = "" ;
      AV65OptionIndexesJson = "" ;
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV67Session = httpContext.getWebSession();
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFForSer = "" ;
      AV15TFForSer_Sel = "" ;
      AV16TFForSerDsc = "" ;
      AV17TFForSerDsc_Sel = "" ;
      AV83TFForTipArtDsc = "" ;
      AV84TFForTipArtDsc_Sel = "" ;
      AV18TFForColNom = "" ;
      AV19TFForColNom_Sel = "" ;
      AV48TFForNomCli = "" ;
      AV49TFForNomCli_Sel = "" ;
      AV24TFTipColDsc = "" ;
      AV25TFTipColDsc_Sel = "" ;
      AV75TFForUltUti = GXutil.nullDate() ;
      AV76TFForUltUti_To = GXutil.nullDate() ;
      AV85TFForTonal = "" ;
      AV86TFForTonal_Sel = "" ;
      AV79TFForRelBan = DecimalUtil.ZERO ;
      AV80TFForRelBan_To = DecimalUtil.ZERO ;
      AV87TFForOpcCli = "" ;
      AV88TFForOpcCli_Sel = "" ;
      AV28TFIntDsc = "" ;
      AV29TFIntDsc_Sel = "" ;
      AV89TFForPro_Sel = "" ;
      AV97TFForBlo_SelsJson = "" ;
      AV98TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A279CliNom = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext = "" ;
      AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = "" ;
      AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = "" ;
      AV108Formulaciontinte_mtoformulastintewwds_4_tfforser = "" ;
      AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = "" ;
      AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = "" ;
      AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = "" ;
      AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = "" ;
      AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = "" ;
      AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = "" ;
      AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = "" ;
      AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = "" ;
      AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = "" ;
      AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = "" ;
      AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = "" ;
      AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti = GXutil.nullDate() ;
      AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = GXutil.nullDate() ;
      AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = "" ;
      AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = "" ;
      AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban = DecimalUtil.ZERO ;
      AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = DecimalUtil.ZERO ;
      AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = "" ;
      AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = "" ;
      AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = "" ;
      AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = "" ;
      AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = "" ;
      AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = "" ;
      scmdbuf = "" ;
      lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom = "" ;
      lV108Formulaciontinte_mtoformulastintewwds_4_tfforser = "" ;
      lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = "" ;
      lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = "" ;
      lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli = "" ;
      lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = "" ;
      lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal = "" ;
      lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli = "" ;
      lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc = "" ;
      A7781ForBlo = "" ;
      AV92ForFec = GXutil.nullDate() ;
      AV100ForFecto = GXutil.nullDate() ;
      AV99ForColNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A995ForTonal = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A3560ForOpcCli = "" ;
      A584IntDsc = "" ;
      A2749ForPro = "" ;
      A485ForFec = GXutil.nullDate() ;
      A13929ForTipArtD = "" ;
      A10045CliAct = "" ;
      P09592_A829TipArtCod = new short[1] ;
      P09592_A396EmprCod = new String[] {""} ;
      P09592_A583IntCod = new byte[1] ;
      P09592_A4384ForTipArt = new short[1] ;
      P09592_n4384ForTipArt = new boolean[] {false} ;
      P09592_A10045CliAct = new String[] {""} ;
      P09592_A279CliNom = new String[] {""} ;
      P09592_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09592_n485ForFec = new boolean[] {false} ;
      P09592_A483ForColNum = new int[1] ;
      P09592_A252CliCod = new int[1] ;
      P09592_A2749ForPro = new String[] {""} ;
      P09592_n2749ForPro = new boolean[] {false} ;
      P09592_A584IntDsc = new String[] {""} ;
      P09592_n584IntDsc = new boolean[] {false} ;
      P09592_A3560ForOpcCli = new String[] {""} ;
      P09592_n3560ForOpcCli = new boolean[] {false} ;
      P09592_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09592_n2838ForRelBan = new boolean[] {false} ;
      P09592_A995ForTonal = new String[] {""} ;
      P09592_n995ForTonal = new boolean[] {false} ;
      P09592_A486ForNumCol = new int[1] ;
      P09592_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09592_n496ForUltUti = new boolean[] {false} ;
      P09592_A832TipColDsc = new String[] {""} ;
      P09592_n832TipColDsc = new boolean[] {false} ;
      P09592_A831TipColCod = new byte[1] ;
      P09592_A1191ForNomCli = new String[] {""} ;
      P09592_n1191ForNomCli = new boolean[] {false} ;
      P09592_A482ForColNom = new String[] {""} ;
      P09592_A5742ForSerDsc = new String[] {""} ;
      P09592_n5742ForSerDsc = new boolean[] {false} ;
      P09592_A494ForSer = new String[] {""} ;
      P09592_A7781ForBlo = new String[] {""} ;
      P09592_n7781ForBlo = new boolean[] {false} ;
      P09592_A13929ForTipArtD = new String[] {""} ;
      P09592_n13929ForTipArtD = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV58Option = "" ;
      P09593_A829TipArtCod = new short[1] ;
      P09593_A396EmprCod = new String[] {""} ;
      P09593_A583IntCod = new byte[1] ;
      P09593_A4384ForTipArt = new short[1] ;
      P09593_n4384ForTipArt = new boolean[] {false} ;
      P09593_A10045CliAct = new String[] {""} ;
      P09593_A494ForSer = new String[] {""} ;
      P09593_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09593_n485ForFec = new boolean[] {false} ;
      P09593_A483ForColNum = new int[1] ;
      P09593_A252CliCod = new int[1] ;
      P09593_A2749ForPro = new String[] {""} ;
      P09593_n2749ForPro = new boolean[] {false} ;
      P09593_A584IntDsc = new String[] {""} ;
      P09593_n584IntDsc = new boolean[] {false} ;
      P09593_A3560ForOpcCli = new String[] {""} ;
      P09593_n3560ForOpcCli = new boolean[] {false} ;
      P09593_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09593_n2838ForRelBan = new boolean[] {false} ;
      P09593_A995ForTonal = new String[] {""} ;
      P09593_n995ForTonal = new boolean[] {false} ;
      P09593_A486ForNumCol = new int[1] ;
      P09593_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09593_n496ForUltUti = new boolean[] {false} ;
      P09593_A832TipColDsc = new String[] {""} ;
      P09593_n832TipColDsc = new boolean[] {false} ;
      P09593_A831TipColCod = new byte[1] ;
      P09593_A1191ForNomCli = new String[] {""} ;
      P09593_n1191ForNomCli = new boolean[] {false} ;
      P09593_A482ForColNom = new String[] {""} ;
      P09593_A5742ForSerDsc = new String[] {""} ;
      P09593_n5742ForSerDsc = new boolean[] {false} ;
      P09593_A279CliNom = new String[] {""} ;
      P09593_A7781ForBlo = new String[] {""} ;
      P09593_n7781ForBlo = new boolean[] {false} ;
      P09593_A13929ForTipArtD = new String[] {""} ;
      P09593_n13929ForTipArtD = new boolean[] {false} ;
      P09594_A829TipArtCod = new short[1] ;
      P09594_A396EmprCod = new String[] {""} ;
      P09594_A583IntCod = new byte[1] ;
      P09594_A4384ForTipArt = new short[1] ;
      P09594_n4384ForTipArt = new boolean[] {false} ;
      P09594_A10045CliAct = new String[] {""} ;
      P09594_A5742ForSerDsc = new String[] {""} ;
      P09594_n5742ForSerDsc = new boolean[] {false} ;
      P09594_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09594_n485ForFec = new boolean[] {false} ;
      P09594_A483ForColNum = new int[1] ;
      P09594_A252CliCod = new int[1] ;
      P09594_A2749ForPro = new String[] {""} ;
      P09594_n2749ForPro = new boolean[] {false} ;
      P09594_A584IntDsc = new String[] {""} ;
      P09594_n584IntDsc = new boolean[] {false} ;
      P09594_A3560ForOpcCli = new String[] {""} ;
      P09594_n3560ForOpcCli = new boolean[] {false} ;
      P09594_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09594_n2838ForRelBan = new boolean[] {false} ;
      P09594_A995ForTonal = new String[] {""} ;
      P09594_n995ForTonal = new boolean[] {false} ;
      P09594_A486ForNumCol = new int[1] ;
      P09594_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09594_n496ForUltUti = new boolean[] {false} ;
      P09594_A832TipColDsc = new String[] {""} ;
      P09594_n832TipColDsc = new boolean[] {false} ;
      P09594_A831TipColCod = new byte[1] ;
      P09594_A1191ForNomCli = new String[] {""} ;
      P09594_n1191ForNomCli = new boolean[] {false} ;
      P09594_A482ForColNom = new String[] {""} ;
      P09594_A494ForSer = new String[] {""} ;
      P09594_A279CliNom = new String[] {""} ;
      P09594_A7781ForBlo = new String[] {""} ;
      P09594_n7781ForBlo = new boolean[] {false} ;
      P09594_A13929ForTipArtD = new String[] {""} ;
      P09594_n13929ForTipArtD = new boolean[] {false} ;
      P09595_A829TipArtCod = new short[1] ;
      P09595_A396EmprCod = new String[] {""} ;
      P09595_A583IntCod = new byte[1] ;
      P09595_A4384ForTipArt = new short[1] ;
      P09595_n4384ForTipArt = new boolean[] {false} ;
      P09595_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09595_n485ForFec = new boolean[] {false} ;
      P09595_A10045CliAct = new String[] {""} ;
      P09595_A483ForColNum = new int[1] ;
      P09595_A252CliCod = new int[1] ;
      P09595_A2749ForPro = new String[] {""} ;
      P09595_n2749ForPro = new boolean[] {false} ;
      P09595_A584IntDsc = new String[] {""} ;
      P09595_n584IntDsc = new boolean[] {false} ;
      P09595_A3560ForOpcCli = new String[] {""} ;
      P09595_n3560ForOpcCli = new boolean[] {false} ;
      P09595_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09595_n2838ForRelBan = new boolean[] {false} ;
      P09595_A995ForTonal = new String[] {""} ;
      P09595_n995ForTonal = new boolean[] {false} ;
      P09595_A486ForNumCol = new int[1] ;
      P09595_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09595_n496ForUltUti = new boolean[] {false} ;
      P09595_A832TipColDsc = new String[] {""} ;
      P09595_n832TipColDsc = new boolean[] {false} ;
      P09595_A831TipColCod = new byte[1] ;
      P09595_A1191ForNomCli = new String[] {""} ;
      P09595_n1191ForNomCli = new boolean[] {false} ;
      P09595_A482ForColNom = new String[] {""} ;
      P09595_A5742ForSerDsc = new String[] {""} ;
      P09595_n5742ForSerDsc = new boolean[] {false} ;
      P09595_A494ForSer = new String[] {""} ;
      P09595_A279CliNom = new String[] {""} ;
      P09595_A7781ForBlo = new String[] {""} ;
      P09595_n7781ForBlo = new boolean[] {false} ;
      P09595_A13929ForTipArtD = new String[] {""} ;
      P09595_n13929ForTipArtD = new boolean[] {false} ;
      P09596_A829TipArtCod = new short[1] ;
      P09596_A396EmprCod = new String[] {""} ;
      P09596_A583IntCod = new byte[1] ;
      P09596_A4384ForTipArt = new short[1] ;
      P09596_n4384ForTipArt = new boolean[] {false} ;
      P09596_A10045CliAct = new String[] {""} ;
      P09596_A482ForColNom = new String[] {""} ;
      P09596_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09596_n485ForFec = new boolean[] {false} ;
      P09596_A483ForColNum = new int[1] ;
      P09596_A252CliCod = new int[1] ;
      P09596_A2749ForPro = new String[] {""} ;
      P09596_n2749ForPro = new boolean[] {false} ;
      P09596_A584IntDsc = new String[] {""} ;
      P09596_n584IntDsc = new boolean[] {false} ;
      P09596_A3560ForOpcCli = new String[] {""} ;
      P09596_n3560ForOpcCli = new boolean[] {false} ;
      P09596_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09596_n2838ForRelBan = new boolean[] {false} ;
      P09596_A995ForTonal = new String[] {""} ;
      P09596_n995ForTonal = new boolean[] {false} ;
      P09596_A486ForNumCol = new int[1] ;
      P09596_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09596_n496ForUltUti = new boolean[] {false} ;
      P09596_A832TipColDsc = new String[] {""} ;
      P09596_n832TipColDsc = new boolean[] {false} ;
      P09596_A831TipColCod = new byte[1] ;
      P09596_A1191ForNomCli = new String[] {""} ;
      P09596_n1191ForNomCli = new boolean[] {false} ;
      P09596_A5742ForSerDsc = new String[] {""} ;
      P09596_n5742ForSerDsc = new boolean[] {false} ;
      P09596_A494ForSer = new String[] {""} ;
      P09596_A279CliNom = new String[] {""} ;
      P09596_A7781ForBlo = new String[] {""} ;
      P09596_n7781ForBlo = new boolean[] {false} ;
      P09596_A13929ForTipArtD = new String[] {""} ;
      P09596_n13929ForTipArtD = new boolean[] {false} ;
      P09597_A829TipArtCod = new short[1] ;
      P09597_A396EmprCod = new String[] {""} ;
      P09597_A583IntCod = new byte[1] ;
      P09597_A4384ForTipArt = new short[1] ;
      P09597_n4384ForTipArt = new boolean[] {false} ;
      P09597_A10045CliAct = new String[] {""} ;
      P09597_A1191ForNomCli = new String[] {""} ;
      P09597_n1191ForNomCli = new boolean[] {false} ;
      P09597_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09597_n485ForFec = new boolean[] {false} ;
      P09597_A483ForColNum = new int[1] ;
      P09597_A252CliCod = new int[1] ;
      P09597_A2749ForPro = new String[] {""} ;
      P09597_n2749ForPro = new boolean[] {false} ;
      P09597_A584IntDsc = new String[] {""} ;
      P09597_n584IntDsc = new boolean[] {false} ;
      P09597_A3560ForOpcCli = new String[] {""} ;
      P09597_n3560ForOpcCli = new boolean[] {false} ;
      P09597_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09597_n2838ForRelBan = new boolean[] {false} ;
      P09597_A995ForTonal = new String[] {""} ;
      P09597_n995ForTonal = new boolean[] {false} ;
      P09597_A486ForNumCol = new int[1] ;
      P09597_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09597_n496ForUltUti = new boolean[] {false} ;
      P09597_A832TipColDsc = new String[] {""} ;
      P09597_n832TipColDsc = new boolean[] {false} ;
      P09597_A831TipColCod = new byte[1] ;
      P09597_A482ForColNom = new String[] {""} ;
      P09597_A5742ForSerDsc = new String[] {""} ;
      P09597_n5742ForSerDsc = new boolean[] {false} ;
      P09597_A494ForSer = new String[] {""} ;
      P09597_A279CliNom = new String[] {""} ;
      P09597_A7781ForBlo = new String[] {""} ;
      P09597_n7781ForBlo = new boolean[] {false} ;
      P09597_A13929ForTipArtD = new String[] {""} ;
      P09597_n13929ForTipArtD = new boolean[] {false} ;
      P09598_A829TipArtCod = new short[1] ;
      P09598_A583IntCod = new byte[1] ;
      P09598_A4384ForTipArt = new short[1] ;
      P09598_n4384ForTipArt = new boolean[] {false} ;
      P09598_A831TipColCod = new byte[1] ;
      P09598_A396EmprCod = new String[] {""} ;
      P09598_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09598_n485ForFec = new boolean[] {false} ;
      P09598_A10045CliAct = new String[] {""} ;
      P09598_A483ForColNum = new int[1] ;
      P09598_A252CliCod = new int[1] ;
      P09598_A2749ForPro = new String[] {""} ;
      P09598_n2749ForPro = new boolean[] {false} ;
      P09598_A584IntDsc = new String[] {""} ;
      P09598_n584IntDsc = new boolean[] {false} ;
      P09598_A3560ForOpcCli = new String[] {""} ;
      P09598_n3560ForOpcCli = new boolean[] {false} ;
      P09598_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09598_n2838ForRelBan = new boolean[] {false} ;
      P09598_A995ForTonal = new String[] {""} ;
      P09598_n995ForTonal = new boolean[] {false} ;
      P09598_A486ForNumCol = new int[1] ;
      P09598_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09598_n496ForUltUti = new boolean[] {false} ;
      P09598_A832TipColDsc = new String[] {""} ;
      P09598_n832TipColDsc = new boolean[] {false} ;
      P09598_A1191ForNomCli = new String[] {""} ;
      P09598_n1191ForNomCli = new boolean[] {false} ;
      P09598_A482ForColNom = new String[] {""} ;
      P09598_A5742ForSerDsc = new String[] {""} ;
      P09598_n5742ForSerDsc = new boolean[] {false} ;
      P09598_A494ForSer = new String[] {""} ;
      P09598_A279CliNom = new String[] {""} ;
      P09598_A7781ForBlo = new String[] {""} ;
      P09598_n7781ForBlo = new boolean[] {false} ;
      P09598_A13929ForTipArtD = new String[] {""} ;
      P09598_n13929ForTipArtD = new boolean[] {false} ;
      P09599_A829TipArtCod = new short[1] ;
      P09599_A396EmprCod = new String[] {""} ;
      P09599_A583IntCod = new byte[1] ;
      P09599_A4384ForTipArt = new short[1] ;
      P09599_n4384ForTipArt = new boolean[] {false} ;
      P09599_A10045CliAct = new String[] {""} ;
      P09599_A995ForTonal = new String[] {""} ;
      P09599_n995ForTonal = new boolean[] {false} ;
      P09599_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09599_n485ForFec = new boolean[] {false} ;
      P09599_A483ForColNum = new int[1] ;
      P09599_A252CliCod = new int[1] ;
      P09599_A2749ForPro = new String[] {""} ;
      P09599_n2749ForPro = new boolean[] {false} ;
      P09599_A584IntDsc = new String[] {""} ;
      P09599_n584IntDsc = new boolean[] {false} ;
      P09599_A3560ForOpcCli = new String[] {""} ;
      P09599_n3560ForOpcCli = new boolean[] {false} ;
      P09599_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09599_n2838ForRelBan = new boolean[] {false} ;
      P09599_A486ForNumCol = new int[1] ;
      P09599_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09599_n496ForUltUti = new boolean[] {false} ;
      P09599_A832TipColDsc = new String[] {""} ;
      P09599_n832TipColDsc = new boolean[] {false} ;
      P09599_A831TipColCod = new byte[1] ;
      P09599_A1191ForNomCli = new String[] {""} ;
      P09599_n1191ForNomCli = new boolean[] {false} ;
      P09599_A482ForColNom = new String[] {""} ;
      P09599_A5742ForSerDsc = new String[] {""} ;
      P09599_n5742ForSerDsc = new boolean[] {false} ;
      P09599_A494ForSer = new String[] {""} ;
      P09599_A279CliNom = new String[] {""} ;
      P09599_A7781ForBlo = new String[] {""} ;
      P09599_n7781ForBlo = new boolean[] {false} ;
      P09599_A13929ForTipArtD = new String[] {""} ;
      P09599_n13929ForTipArtD = new boolean[] {false} ;
      P095910_A829TipArtCod = new short[1] ;
      P095910_A396EmprCod = new String[] {""} ;
      P095910_A583IntCod = new byte[1] ;
      P095910_A4384ForTipArt = new short[1] ;
      P095910_n4384ForTipArt = new boolean[] {false} ;
      P095910_A10045CliAct = new String[] {""} ;
      P095910_A3560ForOpcCli = new String[] {""} ;
      P095910_n3560ForOpcCli = new boolean[] {false} ;
      P095910_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P095910_n485ForFec = new boolean[] {false} ;
      P095910_A483ForColNum = new int[1] ;
      P095910_A252CliCod = new int[1] ;
      P095910_A2749ForPro = new String[] {""} ;
      P095910_n2749ForPro = new boolean[] {false} ;
      P095910_A584IntDsc = new String[] {""} ;
      P095910_n584IntDsc = new boolean[] {false} ;
      P095910_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P095910_n2838ForRelBan = new boolean[] {false} ;
      P095910_A995ForTonal = new String[] {""} ;
      P095910_n995ForTonal = new boolean[] {false} ;
      P095910_A486ForNumCol = new int[1] ;
      P095910_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P095910_n496ForUltUti = new boolean[] {false} ;
      P095910_A832TipColDsc = new String[] {""} ;
      P095910_n832TipColDsc = new boolean[] {false} ;
      P095910_A831TipColCod = new byte[1] ;
      P095910_A1191ForNomCli = new String[] {""} ;
      P095910_n1191ForNomCli = new boolean[] {false} ;
      P095910_A482ForColNom = new String[] {""} ;
      P095910_A5742ForSerDsc = new String[] {""} ;
      P095910_n5742ForSerDsc = new boolean[] {false} ;
      P095910_A494ForSer = new String[] {""} ;
      P095910_A279CliNom = new String[] {""} ;
      P095910_A7781ForBlo = new String[] {""} ;
      P095910_n7781ForBlo = new boolean[] {false} ;
      P095910_A13929ForTipArtD = new String[] {""} ;
      P095910_n13929ForTipArtD = new boolean[] {false} ;
      AV61OptionDesc = "" ;
      P095911_A829TipArtCod = new short[1] ;
      P095911_A4384ForTipArt = new short[1] ;
      P095911_n4384ForTipArt = new boolean[] {false} ;
      P095911_A583IntCod = new byte[1] ;
      P095911_A396EmprCod = new String[] {""} ;
      P095911_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P095911_n485ForFec = new boolean[] {false} ;
      P095911_A10045CliAct = new String[] {""} ;
      P095911_A483ForColNum = new int[1] ;
      P095911_A252CliCod = new int[1] ;
      P095911_A2749ForPro = new String[] {""} ;
      P095911_n2749ForPro = new boolean[] {false} ;
      P095911_A584IntDsc = new String[] {""} ;
      P095911_n584IntDsc = new boolean[] {false} ;
      P095911_A3560ForOpcCli = new String[] {""} ;
      P095911_n3560ForOpcCli = new boolean[] {false} ;
      P095911_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P095911_n2838ForRelBan = new boolean[] {false} ;
      P095911_A995ForTonal = new String[] {""} ;
      P095911_n995ForTonal = new boolean[] {false} ;
      P095911_A486ForNumCol = new int[1] ;
      P095911_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P095911_n496ForUltUti = new boolean[] {false} ;
      P095911_A832TipColDsc = new String[] {""} ;
      P095911_n832TipColDsc = new boolean[] {false} ;
      P095911_A831TipColCod = new byte[1] ;
      P095911_A1191ForNomCli = new String[] {""} ;
      P095911_n1191ForNomCli = new boolean[] {false} ;
      P095911_A482ForColNom = new String[] {""} ;
      P095911_A5742ForSerDsc = new String[] {""} ;
      P095911_n5742ForSerDsc = new boolean[] {false} ;
      P095911_A494ForSer = new String[] {""} ;
      P095911_A279CliNom = new String[] {""} ;
      P095911_A7781ForBlo = new String[] {""} ;
      P095911_n7781ForBlo = new boolean[] {false} ;
      P095911_A13929ForTipArtD = new String[] {""} ;
      P095911_n13929ForTipArtD = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastintewwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09592_A829TipArtCod, P09592_A396EmprCod, P09592_A583IntCod, P09592_A4384ForTipArt, P09592_n4384ForTipArt, P09592_A10045CliAct, P09592_A279CliNom, P09592_A485ForFec, P09592_n485ForFec, P09592_A483ForColNum,
            P09592_A252CliCod, P09592_A2749ForPro, P09592_n2749ForPro, P09592_A584IntDsc, P09592_n584IntDsc, P09592_A3560ForOpcCli, P09592_n3560ForOpcCli, P09592_A2838ForRelBan, P09592_n2838ForRelBan, P09592_A995ForTonal,
            P09592_n995ForTonal, P09592_A486ForNumCol, P09592_A496ForUltUti, P09592_n496ForUltUti, P09592_A832TipColDsc, P09592_n832TipColDsc, P09592_A831TipColCod, P09592_A1191ForNomCli, P09592_n1191ForNomCli, P09592_A482ForColNom,
            P09592_A5742ForSerDsc, P09592_n5742ForSerDsc, P09592_A494ForSer, P09592_A7781ForBlo, P09592_n7781ForBlo, P09592_A13929ForTipArtD, P09592_n13929ForTipArtD
            }
            , new Object[] {
            P09593_A829TipArtCod, P09593_A396EmprCod, P09593_A583IntCod, P09593_A4384ForTipArt, P09593_n4384ForTipArt, P09593_A10045CliAct, P09593_A494ForSer, P09593_A485ForFec, P09593_n485ForFec, P09593_A483ForColNum,
            P09593_A252CliCod, P09593_A2749ForPro, P09593_n2749ForPro, P09593_A584IntDsc, P09593_n584IntDsc, P09593_A3560ForOpcCli, P09593_n3560ForOpcCli, P09593_A2838ForRelBan, P09593_n2838ForRelBan, P09593_A995ForTonal,
            P09593_n995ForTonal, P09593_A486ForNumCol, P09593_A496ForUltUti, P09593_n496ForUltUti, P09593_A832TipColDsc, P09593_n832TipColDsc, P09593_A831TipColCod, P09593_A1191ForNomCli, P09593_n1191ForNomCli, P09593_A482ForColNom,
            P09593_A5742ForSerDsc, P09593_n5742ForSerDsc, P09593_A279CliNom, P09593_A7781ForBlo, P09593_n7781ForBlo, P09593_A13929ForTipArtD, P09593_n13929ForTipArtD
            }
            , new Object[] {
            P09594_A829TipArtCod, P09594_A396EmprCod, P09594_A583IntCod, P09594_A4384ForTipArt, P09594_n4384ForTipArt, P09594_A10045CliAct, P09594_A5742ForSerDsc, P09594_n5742ForSerDsc, P09594_A485ForFec, P09594_n485ForFec,
            P09594_A483ForColNum, P09594_A252CliCod, P09594_A2749ForPro, P09594_n2749ForPro, P09594_A584IntDsc, P09594_n584IntDsc, P09594_A3560ForOpcCli, P09594_n3560ForOpcCli, P09594_A2838ForRelBan, P09594_n2838ForRelBan,
            P09594_A995ForTonal, P09594_n995ForTonal, P09594_A486ForNumCol, P09594_A496ForUltUti, P09594_n496ForUltUti, P09594_A832TipColDsc, P09594_n832TipColDsc, P09594_A831TipColCod, P09594_A1191ForNomCli, P09594_n1191ForNomCli,
            P09594_A482ForColNom, P09594_A494ForSer, P09594_A279CliNom, P09594_A7781ForBlo, P09594_n7781ForBlo, P09594_A13929ForTipArtD, P09594_n13929ForTipArtD
            }
            , new Object[] {
            P09595_A829TipArtCod, P09595_A396EmprCod, P09595_A583IntCod, P09595_A4384ForTipArt, P09595_n4384ForTipArt, P09595_A485ForFec, P09595_n485ForFec, P09595_A10045CliAct, P09595_A483ForColNum, P09595_A252CliCod,
            P09595_A2749ForPro, P09595_n2749ForPro, P09595_A584IntDsc, P09595_n584IntDsc, P09595_A3560ForOpcCli, P09595_n3560ForOpcCli, P09595_A2838ForRelBan, P09595_n2838ForRelBan, P09595_A995ForTonal, P09595_n995ForTonal,
            P09595_A486ForNumCol, P09595_A496ForUltUti, P09595_n496ForUltUti, P09595_A832TipColDsc, P09595_n832TipColDsc, P09595_A831TipColCod, P09595_A1191ForNomCli, P09595_n1191ForNomCli, P09595_A482ForColNom, P09595_A5742ForSerDsc,
            P09595_n5742ForSerDsc, P09595_A494ForSer, P09595_A279CliNom, P09595_A7781ForBlo, P09595_n7781ForBlo, P09595_A13929ForTipArtD, P09595_n13929ForTipArtD
            }
            , new Object[] {
            P09596_A829TipArtCod, P09596_A396EmprCod, P09596_A583IntCod, P09596_A4384ForTipArt, P09596_n4384ForTipArt, P09596_A10045CliAct, P09596_A482ForColNom, P09596_A485ForFec, P09596_n485ForFec, P09596_A483ForColNum,
            P09596_A252CliCod, P09596_A2749ForPro, P09596_n2749ForPro, P09596_A584IntDsc, P09596_n584IntDsc, P09596_A3560ForOpcCli, P09596_n3560ForOpcCli, P09596_A2838ForRelBan, P09596_n2838ForRelBan, P09596_A995ForTonal,
            P09596_n995ForTonal, P09596_A486ForNumCol, P09596_A496ForUltUti, P09596_n496ForUltUti, P09596_A832TipColDsc, P09596_n832TipColDsc, P09596_A831TipColCod, P09596_A1191ForNomCli, P09596_n1191ForNomCli, P09596_A5742ForSerDsc,
            P09596_n5742ForSerDsc, P09596_A494ForSer, P09596_A279CliNom, P09596_A7781ForBlo, P09596_n7781ForBlo, P09596_A13929ForTipArtD, P09596_n13929ForTipArtD
            }
            , new Object[] {
            P09597_A829TipArtCod, P09597_A396EmprCod, P09597_A583IntCod, P09597_A4384ForTipArt, P09597_n4384ForTipArt, P09597_A10045CliAct, P09597_A1191ForNomCli, P09597_n1191ForNomCli, P09597_A485ForFec, P09597_n485ForFec,
            P09597_A483ForColNum, P09597_A252CliCod, P09597_A2749ForPro, P09597_n2749ForPro, P09597_A584IntDsc, P09597_n584IntDsc, P09597_A3560ForOpcCli, P09597_n3560ForOpcCli, P09597_A2838ForRelBan, P09597_n2838ForRelBan,
            P09597_A995ForTonal, P09597_n995ForTonal, P09597_A486ForNumCol, P09597_A496ForUltUti, P09597_n496ForUltUti, P09597_A832TipColDsc, P09597_n832TipColDsc, P09597_A831TipColCod, P09597_A482ForColNom, P09597_A5742ForSerDsc,
            P09597_n5742ForSerDsc, P09597_A494ForSer, P09597_A279CliNom, P09597_A7781ForBlo, P09597_n7781ForBlo, P09597_A13929ForTipArtD, P09597_n13929ForTipArtD
            }
            , new Object[] {
            P09598_A829TipArtCod, P09598_A583IntCod, P09598_A4384ForTipArt, P09598_n4384ForTipArt, P09598_A831TipColCod, P09598_A396EmprCod, P09598_A485ForFec, P09598_n485ForFec, P09598_A10045CliAct, P09598_A483ForColNum,
            P09598_A252CliCod, P09598_A2749ForPro, P09598_n2749ForPro, P09598_A584IntDsc, P09598_n584IntDsc, P09598_A3560ForOpcCli, P09598_n3560ForOpcCli, P09598_A2838ForRelBan, P09598_n2838ForRelBan, P09598_A995ForTonal,
            P09598_n995ForTonal, P09598_A486ForNumCol, P09598_A496ForUltUti, P09598_n496ForUltUti, P09598_A832TipColDsc, P09598_n832TipColDsc, P09598_A1191ForNomCli, P09598_n1191ForNomCli, P09598_A482ForColNom, P09598_A5742ForSerDsc,
            P09598_n5742ForSerDsc, P09598_A494ForSer, P09598_A279CliNom, P09598_A7781ForBlo, P09598_n7781ForBlo, P09598_A13929ForTipArtD, P09598_n13929ForTipArtD
            }
            , new Object[] {
            P09599_A829TipArtCod, P09599_A396EmprCod, P09599_A583IntCod, P09599_A4384ForTipArt, P09599_n4384ForTipArt, P09599_A10045CliAct, P09599_A995ForTonal, P09599_n995ForTonal, P09599_A485ForFec, P09599_n485ForFec,
            P09599_A483ForColNum, P09599_A252CliCod, P09599_A2749ForPro, P09599_n2749ForPro, P09599_A584IntDsc, P09599_n584IntDsc, P09599_A3560ForOpcCli, P09599_n3560ForOpcCli, P09599_A2838ForRelBan, P09599_n2838ForRelBan,
            P09599_A486ForNumCol, P09599_A496ForUltUti, P09599_n496ForUltUti, P09599_A832TipColDsc, P09599_n832TipColDsc, P09599_A831TipColCod, P09599_A1191ForNomCli, P09599_n1191ForNomCli, P09599_A482ForColNom, P09599_A5742ForSerDsc,
            P09599_n5742ForSerDsc, P09599_A494ForSer, P09599_A279CliNom, P09599_A7781ForBlo, P09599_n7781ForBlo, P09599_A13929ForTipArtD, P09599_n13929ForTipArtD
            }
            , new Object[] {
            P095910_A829TipArtCod, P095910_A396EmprCod, P095910_A583IntCod, P095910_A4384ForTipArt, P095910_n4384ForTipArt, P095910_A10045CliAct, P095910_A3560ForOpcCli, P095910_n3560ForOpcCli, P095910_A485ForFec, P095910_n485ForFec,
            P095910_A483ForColNum, P095910_A252CliCod, P095910_A2749ForPro, P095910_n2749ForPro, P095910_A584IntDsc, P095910_n584IntDsc, P095910_A2838ForRelBan, P095910_n2838ForRelBan, P095910_A995ForTonal, P095910_n995ForTonal,
            P095910_A486ForNumCol, P095910_A496ForUltUti, P095910_n496ForUltUti, P095910_A832TipColDsc, P095910_n832TipColDsc, P095910_A831TipColCod, P095910_A1191ForNomCli, P095910_n1191ForNomCli, P095910_A482ForColNom, P095910_A5742ForSerDsc,
            P095910_n5742ForSerDsc, P095910_A494ForSer, P095910_A279CliNom, P095910_A7781ForBlo, P095910_n7781ForBlo, P095910_A13929ForTipArtD, P095910_n13929ForTipArtD
            }
            , new Object[] {
            P095911_A829TipArtCod, P095911_A4384ForTipArt, P095911_n4384ForTipArt, P095911_A583IntCod, P095911_A396EmprCod, P095911_A485ForFec, P095911_n485ForFec, P095911_A10045CliAct, P095911_A483ForColNum, P095911_A252CliCod,
            P095911_A2749ForPro, P095911_n2749ForPro, P095911_A584IntDsc, P095911_n584IntDsc, P095911_A3560ForOpcCli, P095911_n3560ForOpcCli, P095911_A2838ForRelBan, P095911_n2838ForRelBan, P095911_A995ForTonal, P095911_n995ForTonal,
            P095911_A486ForNumCol, P095911_A496ForUltUti, P095911_n496ForUltUti, P095911_A832TipColDsc, P095911_n832TipColDsc, P095911_A831TipColCod, P095911_A1191ForNomCli, P095911_n1191ForNomCli, P095911_A482ForColNom, P095911_A5742ForSerDsc,
            P095911_n5742ForSerDsc, P095911_A494ForSer, P095911_A279CliNom, P095911_A7781ForBlo, P095911_n7781ForBlo, P095911_A13929ForTipArtD, P095911_n13929ForTipArtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFTipColCod ;
   private byte AV23TFTipColCod_To ;
   private byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ;
   private byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short A4384ForTipArt ;
   private short Gx_err ;
   private int AV103GXV1 ;
   private int AV77TFForNumCol ;
   private int AV78TFForNumCol_To ;
   private int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ;
   private int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ;
   private int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ;
   private int AV94CliCodform ;
   private int AV95CliCodto ;
   private int AV96Forcolnum ;
   private int A486ForNumCol ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV57InsertIndex ;
   private long AV66count ;
   private java.math.BigDecimal AV79TFForRelBan ;
   private java.math.BigDecimal AV80TFForRelBan_To ;
   private java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ;
   private java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ;
   private java.math.BigDecimal A2838ForRelBan ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFForSer ;
   private String AV15TFForSer_Sel ;
   private String AV16TFForSerDsc ;
   private String AV17TFForSerDsc_Sel ;
   private String AV83TFForTipArtDsc ;
   private String AV84TFForTipArtDsc_Sel ;
   private String AV18TFForColNom ;
   private String AV19TFForColNom_Sel ;
   private String AV48TFForNomCli ;
   private String AV49TFForNomCli_Sel ;
   private String AV24TFTipColDsc ;
   private String AV25TFTipColDsc_Sel ;
   private String AV85TFForTonal ;
   private String AV86TFForTonal_Sel ;
   private String AV87TFForOpcCli ;
   private String AV88TFForOpcCli_Sel ;
   private String AV28TFIntDsc ;
   private String AV29TFIntDsc_Sel ;
   private String AV89TFForPro_Sel ;
   private String A279CliNom ;
   private String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ;
   private String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ;
   private String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ;
   private String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ;
   private String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ;
   private String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ;
   private String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ;
   private String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ;
   private String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ;
   private String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ;
   private String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ;
   private String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ;
   private String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ;
   private String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ;
   private String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ;
   private String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ;
   private String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ;
   private String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ;
   private String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ;
   private String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ;
   private String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ;
   private String lV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ;
   private String scmdbuf ;
   private String lV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ;
   private String lV108Formulaciontinte_mtoformulastintewwds_4_tfforser ;
   private String lV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ;
   private String lV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ;
   private String lV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ;
   private String lV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ;
   private String lV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ;
   private String lV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ;
   private String lV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ;
   private String A7781ForBlo ;
   private String AV99ForColNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A832TipColDsc ;
   private String A995ForTonal ;
   private String A3560ForOpcCli ;
   private String A584IntDsc ;
   private String A2749ForPro ;
   private String A13929ForTipArtD ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private java.util.Date AV75TFForUltUti ;
   private java.util.Date AV76TFForUltUti_To ;
   private java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ;
   private java.util.Date AV123Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to ;
   private java.util.Date AV92ForFec ;
   private java.util.Date AV100ForFecto ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date A485ForFec ;
   private boolean returnInSub ;
   private boolean brk9592 ;
   private boolean n4384ForTipArt ;
   private boolean n485ForFec ;
   private boolean n2749ForPro ;
   private boolean n584IntDsc ;
   private boolean n3560ForOpcCli ;
   private boolean n2838ForRelBan ;
   private boolean n995ForTonal ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n7781ForBlo ;
   private boolean n13929ForTipArtD ;
   private boolean brk9594 ;
   private boolean brk9596 ;
   private boolean brk9599 ;
   private boolean brk95911 ;
   private boolean brk95913 ;
   private boolean brk95915 ;
   private boolean brk95917 ;
   private boolean brk95919 ;
   private String AV60OptionsJson ;
   private String AV63OptionsDescJson ;
   private String AV65OptionIndexesJson ;
   private String AV97TFForBlo_SelsJson ;
   private String AV56DDOName ;
   private String AV54SearchTxt ;
   private String AV55SearchTxtTo ;
   private String AV72FilterFullText ;
   private String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ;
   private String AV58Option ;
   private String AV61OptionDesc ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09592_A829TipArtCod ;
   private String[] P09592_A396EmprCod ;
   private byte[] P09592_A583IntCod ;
   private short[] P09592_A4384ForTipArt ;
   private boolean[] P09592_n4384ForTipArt ;
   private String[] P09592_A10045CliAct ;
   private String[] P09592_A279CliNom ;
   private java.util.Date[] P09592_A485ForFec ;
   private boolean[] P09592_n485ForFec ;
   private int[] P09592_A483ForColNum ;
   private int[] P09592_A252CliCod ;
   private String[] P09592_A2749ForPro ;
   private boolean[] P09592_n2749ForPro ;
   private String[] P09592_A584IntDsc ;
   private boolean[] P09592_n584IntDsc ;
   private String[] P09592_A3560ForOpcCli ;
   private boolean[] P09592_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09592_A2838ForRelBan ;
   private boolean[] P09592_n2838ForRelBan ;
   private String[] P09592_A995ForTonal ;
   private boolean[] P09592_n995ForTonal ;
   private int[] P09592_A486ForNumCol ;
   private java.util.Date[] P09592_A496ForUltUti ;
   private boolean[] P09592_n496ForUltUti ;
   private String[] P09592_A832TipColDsc ;
   private boolean[] P09592_n832TipColDsc ;
   private byte[] P09592_A831TipColCod ;
   private String[] P09592_A1191ForNomCli ;
   private boolean[] P09592_n1191ForNomCli ;
   private String[] P09592_A482ForColNom ;
   private String[] P09592_A5742ForSerDsc ;
   private boolean[] P09592_n5742ForSerDsc ;
   private String[] P09592_A494ForSer ;
   private String[] P09592_A7781ForBlo ;
   private boolean[] P09592_n7781ForBlo ;
   private String[] P09592_A13929ForTipArtD ;
   private boolean[] P09592_n13929ForTipArtD ;
   private short[] P09593_A829TipArtCod ;
   private String[] P09593_A396EmprCod ;
   private byte[] P09593_A583IntCod ;
   private short[] P09593_A4384ForTipArt ;
   private boolean[] P09593_n4384ForTipArt ;
   private String[] P09593_A10045CliAct ;
   private String[] P09593_A494ForSer ;
   private java.util.Date[] P09593_A485ForFec ;
   private boolean[] P09593_n485ForFec ;
   private int[] P09593_A483ForColNum ;
   private int[] P09593_A252CliCod ;
   private String[] P09593_A2749ForPro ;
   private boolean[] P09593_n2749ForPro ;
   private String[] P09593_A584IntDsc ;
   private boolean[] P09593_n584IntDsc ;
   private String[] P09593_A3560ForOpcCli ;
   private boolean[] P09593_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09593_A2838ForRelBan ;
   private boolean[] P09593_n2838ForRelBan ;
   private String[] P09593_A995ForTonal ;
   private boolean[] P09593_n995ForTonal ;
   private int[] P09593_A486ForNumCol ;
   private java.util.Date[] P09593_A496ForUltUti ;
   private boolean[] P09593_n496ForUltUti ;
   private String[] P09593_A832TipColDsc ;
   private boolean[] P09593_n832TipColDsc ;
   private byte[] P09593_A831TipColCod ;
   private String[] P09593_A1191ForNomCli ;
   private boolean[] P09593_n1191ForNomCli ;
   private String[] P09593_A482ForColNom ;
   private String[] P09593_A5742ForSerDsc ;
   private boolean[] P09593_n5742ForSerDsc ;
   private String[] P09593_A279CliNom ;
   private String[] P09593_A7781ForBlo ;
   private boolean[] P09593_n7781ForBlo ;
   private String[] P09593_A13929ForTipArtD ;
   private boolean[] P09593_n13929ForTipArtD ;
   private short[] P09594_A829TipArtCod ;
   private String[] P09594_A396EmprCod ;
   private byte[] P09594_A583IntCod ;
   private short[] P09594_A4384ForTipArt ;
   private boolean[] P09594_n4384ForTipArt ;
   private String[] P09594_A10045CliAct ;
   private String[] P09594_A5742ForSerDsc ;
   private boolean[] P09594_n5742ForSerDsc ;
   private java.util.Date[] P09594_A485ForFec ;
   private boolean[] P09594_n485ForFec ;
   private int[] P09594_A483ForColNum ;
   private int[] P09594_A252CliCod ;
   private String[] P09594_A2749ForPro ;
   private boolean[] P09594_n2749ForPro ;
   private String[] P09594_A584IntDsc ;
   private boolean[] P09594_n584IntDsc ;
   private String[] P09594_A3560ForOpcCli ;
   private boolean[] P09594_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09594_A2838ForRelBan ;
   private boolean[] P09594_n2838ForRelBan ;
   private String[] P09594_A995ForTonal ;
   private boolean[] P09594_n995ForTonal ;
   private int[] P09594_A486ForNumCol ;
   private java.util.Date[] P09594_A496ForUltUti ;
   private boolean[] P09594_n496ForUltUti ;
   private String[] P09594_A832TipColDsc ;
   private boolean[] P09594_n832TipColDsc ;
   private byte[] P09594_A831TipColCod ;
   private String[] P09594_A1191ForNomCli ;
   private boolean[] P09594_n1191ForNomCli ;
   private String[] P09594_A482ForColNom ;
   private String[] P09594_A494ForSer ;
   private String[] P09594_A279CliNom ;
   private String[] P09594_A7781ForBlo ;
   private boolean[] P09594_n7781ForBlo ;
   private String[] P09594_A13929ForTipArtD ;
   private boolean[] P09594_n13929ForTipArtD ;
   private short[] P09595_A829TipArtCod ;
   private String[] P09595_A396EmprCod ;
   private byte[] P09595_A583IntCod ;
   private short[] P09595_A4384ForTipArt ;
   private boolean[] P09595_n4384ForTipArt ;
   private java.util.Date[] P09595_A485ForFec ;
   private boolean[] P09595_n485ForFec ;
   private String[] P09595_A10045CliAct ;
   private int[] P09595_A483ForColNum ;
   private int[] P09595_A252CliCod ;
   private String[] P09595_A2749ForPro ;
   private boolean[] P09595_n2749ForPro ;
   private String[] P09595_A584IntDsc ;
   private boolean[] P09595_n584IntDsc ;
   private String[] P09595_A3560ForOpcCli ;
   private boolean[] P09595_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09595_A2838ForRelBan ;
   private boolean[] P09595_n2838ForRelBan ;
   private String[] P09595_A995ForTonal ;
   private boolean[] P09595_n995ForTonal ;
   private int[] P09595_A486ForNumCol ;
   private java.util.Date[] P09595_A496ForUltUti ;
   private boolean[] P09595_n496ForUltUti ;
   private String[] P09595_A832TipColDsc ;
   private boolean[] P09595_n832TipColDsc ;
   private byte[] P09595_A831TipColCod ;
   private String[] P09595_A1191ForNomCli ;
   private boolean[] P09595_n1191ForNomCli ;
   private String[] P09595_A482ForColNom ;
   private String[] P09595_A5742ForSerDsc ;
   private boolean[] P09595_n5742ForSerDsc ;
   private String[] P09595_A494ForSer ;
   private String[] P09595_A279CliNom ;
   private String[] P09595_A7781ForBlo ;
   private boolean[] P09595_n7781ForBlo ;
   private String[] P09595_A13929ForTipArtD ;
   private boolean[] P09595_n13929ForTipArtD ;
   private short[] P09596_A829TipArtCod ;
   private String[] P09596_A396EmprCod ;
   private byte[] P09596_A583IntCod ;
   private short[] P09596_A4384ForTipArt ;
   private boolean[] P09596_n4384ForTipArt ;
   private String[] P09596_A10045CliAct ;
   private String[] P09596_A482ForColNom ;
   private java.util.Date[] P09596_A485ForFec ;
   private boolean[] P09596_n485ForFec ;
   private int[] P09596_A483ForColNum ;
   private int[] P09596_A252CliCod ;
   private String[] P09596_A2749ForPro ;
   private boolean[] P09596_n2749ForPro ;
   private String[] P09596_A584IntDsc ;
   private boolean[] P09596_n584IntDsc ;
   private String[] P09596_A3560ForOpcCli ;
   private boolean[] P09596_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09596_A2838ForRelBan ;
   private boolean[] P09596_n2838ForRelBan ;
   private String[] P09596_A995ForTonal ;
   private boolean[] P09596_n995ForTonal ;
   private int[] P09596_A486ForNumCol ;
   private java.util.Date[] P09596_A496ForUltUti ;
   private boolean[] P09596_n496ForUltUti ;
   private String[] P09596_A832TipColDsc ;
   private boolean[] P09596_n832TipColDsc ;
   private byte[] P09596_A831TipColCod ;
   private String[] P09596_A1191ForNomCli ;
   private boolean[] P09596_n1191ForNomCli ;
   private String[] P09596_A5742ForSerDsc ;
   private boolean[] P09596_n5742ForSerDsc ;
   private String[] P09596_A494ForSer ;
   private String[] P09596_A279CliNom ;
   private String[] P09596_A7781ForBlo ;
   private boolean[] P09596_n7781ForBlo ;
   private String[] P09596_A13929ForTipArtD ;
   private boolean[] P09596_n13929ForTipArtD ;
   private short[] P09597_A829TipArtCod ;
   private String[] P09597_A396EmprCod ;
   private byte[] P09597_A583IntCod ;
   private short[] P09597_A4384ForTipArt ;
   private boolean[] P09597_n4384ForTipArt ;
   private String[] P09597_A10045CliAct ;
   private String[] P09597_A1191ForNomCli ;
   private boolean[] P09597_n1191ForNomCli ;
   private java.util.Date[] P09597_A485ForFec ;
   private boolean[] P09597_n485ForFec ;
   private int[] P09597_A483ForColNum ;
   private int[] P09597_A252CliCod ;
   private String[] P09597_A2749ForPro ;
   private boolean[] P09597_n2749ForPro ;
   private String[] P09597_A584IntDsc ;
   private boolean[] P09597_n584IntDsc ;
   private String[] P09597_A3560ForOpcCli ;
   private boolean[] P09597_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09597_A2838ForRelBan ;
   private boolean[] P09597_n2838ForRelBan ;
   private String[] P09597_A995ForTonal ;
   private boolean[] P09597_n995ForTonal ;
   private int[] P09597_A486ForNumCol ;
   private java.util.Date[] P09597_A496ForUltUti ;
   private boolean[] P09597_n496ForUltUti ;
   private String[] P09597_A832TipColDsc ;
   private boolean[] P09597_n832TipColDsc ;
   private byte[] P09597_A831TipColCod ;
   private String[] P09597_A482ForColNom ;
   private String[] P09597_A5742ForSerDsc ;
   private boolean[] P09597_n5742ForSerDsc ;
   private String[] P09597_A494ForSer ;
   private String[] P09597_A279CliNom ;
   private String[] P09597_A7781ForBlo ;
   private boolean[] P09597_n7781ForBlo ;
   private String[] P09597_A13929ForTipArtD ;
   private boolean[] P09597_n13929ForTipArtD ;
   private short[] P09598_A829TipArtCod ;
   private byte[] P09598_A583IntCod ;
   private short[] P09598_A4384ForTipArt ;
   private boolean[] P09598_n4384ForTipArt ;
   private byte[] P09598_A831TipColCod ;
   private String[] P09598_A396EmprCod ;
   private java.util.Date[] P09598_A485ForFec ;
   private boolean[] P09598_n485ForFec ;
   private String[] P09598_A10045CliAct ;
   private int[] P09598_A483ForColNum ;
   private int[] P09598_A252CliCod ;
   private String[] P09598_A2749ForPro ;
   private boolean[] P09598_n2749ForPro ;
   private String[] P09598_A584IntDsc ;
   private boolean[] P09598_n584IntDsc ;
   private String[] P09598_A3560ForOpcCli ;
   private boolean[] P09598_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09598_A2838ForRelBan ;
   private boolean[] P09598_n2838ForRelBan ;
   private String[] P09598_A995ForTonal ;
   private boolean[] P09598_n995ForTonal ;
   private int[] P09598_A486ForNumCol ;
   private java.util.Date[] P09598_A496ForUltUti ;
   private boolean[] P09598_n496ForUltUti ;
   private String[] P09598_A832TipColDsc ;
   private boolean[] P09598_n832TipColDsc ;
   private String[] P09598_A1191ForNomCli ;
   private boolean[] P09598_n1191ForNomCli ;
   private String[] P09598_A482ForColNom ;
   private String[] P09598_A5742ForSerDsc ;
   private boolean[] P09598_n5742ForSerDsc ;
   private String[] P09598_A494ForSer ;
   private String[] P09598_A279CliNom ;
   private String[] P09598_A7781ForBlo ;
   private boolean[] P09598_n7781ForBlo ;
   private String[] P09598_A13929ForTipArtD ;
   private boolean[] P09598_n13929ForTipArtD ;
   private short[] P09599_A829TipArtCod ;
   private String[] P09599_A396EmprCod ;
   private byte[] P09599_A583IntCod ;
   private short[] P09599_A4384ForTipArt ;
   private boolean[] P09599_n4384ForTipArt ;
   private String[] P09599_A10045CliAct ;
   private String[] P09599_A995ForTonal ;
   private boolean[] P09599_n995ForTonal ;
   private java.util.Date[] P09599_A485ForFec ;
   private boolean[] P09599_n485ForFec ;
   private int[] P09599_A483ForColNum ;
   private int[] P09599_A252CliCod ;
   private String[] P09599_A2749ForPro ;
   private boolean[] P09599_n2749ForPro ;
   private String[] P09599_A584IntDsc ;
   private boolean[] P09599_n584IntDsc ;
   private String[] P09599_A3560ForOpcCli ;
   private boolean[] P09599_n3560ForOpcCli ;
   private java.math.BigDecimal[] P09599_A2838ForRelBan ;
   private boolean[] P09599_n2838ForRelBan ;
   private int[] P09599_A486ForNumCol ;
   private java.util.Date[] P09599_A496ForUltUti ;
   private boolean[] P09599_n496ForUltUti ;
   private String[] P09599_A832TipColDsc ;
   private boolean[] P09599_n832TipColDsc ;
   private byte[] P09599_A831TipColCod ;
   private String[] P09599_A1191ForNomCli ;
   private boolean[] P09599_n1191ForNomCli ;
   private String[] P09599_A482ForColNom ;
   private String[] P09599_A5742ForSerDsc ;
   private boolean[] P09599_n5742ForSerDsc ;
   private String[] P09599_A494ForSer ;
   private String[] P09599_A279CliNom ;
   private String[] P09599_A7781ForBlo ;
   private boolean[] P09599_n7781ForBlo ;
   private String[] P09599_A13929ForTipArtD ;
   private boolean[] P09599_n13929ForTipArtD ;
   private short[] P095910_A829TipArtCod ;
   private String[] P095910_A396EmprCod ;
   private byte[] P095910_A583IntCod ;
   private short[] P095910_A4384ForTipArt ;
   private boolean[] P095910_n4384ForTipArt ;
   private String[] P095910_A10045CliAct ;
   private String[] P095910_A3560ForOpcCli ;
   private boolean[] P095910_n3560ForOpcCli ;
   private java.util.Date[] P095910_A485ForFec ;
   private boolean[] P095910_n485ForFec ;
   private int[] P095910_A483ForColNum ;
   private int[] P095910_A252CliCod ;
   private String[] P095910_A2749ForPro ;
   private boolean[] P095910_n2749ForPro ;
   private String[] P095910_A584IntDsc ;
   private boolean[] P095910_n584IntDsc ;
   private java.math.BigDecimal[] P095910_A2838ForRelBan ;
   private boolean[] P095910_n2838ForRelBan ;
   private String[] P095910_A995ForTonal ;
   private boolean[] P095910_n995ForTonal ;
   private int[] P095910_A486ForNumCol ;
   private java.util.Date[] P095910_A496ForUltUti ;
   private boolean[] P095910_n496ForUltUti ;
   private String[] P095910_A832TipColDsc ;
   private boolean[] P095910_n832TipColDsc ;
   private byte[] P095910_A831TipColCod ;
   private String[] P095910_A1191ForNomCli ;
   private boolean[] P095910_n1191ForNomCli ;
   private String[] P095910_A482ForColNom ;
   private String[] P095910_A5742ForSerDsc ;
   private boolean[] P095910_n5742ForSerDsc ;
   private String[] P095910_A494ForSer ;
   private String[] P095910_A279CliNom ;
   private String[] P095910_A7781ForBlo ;
   private boolean[] P095910_n7781ForBlo ;
   private String[] P095910_A13929ForTipArtD ;
   private boolean[] P095910_n13929ForTipArtD ;
   private short[] P095911_A829TipArtCod ;
   private short[] P095911_A4384ForTipArt ;
   private boolean[] P095911_n4384ForTipArt ;
   private byte[] P095911_A583IntCod ;
   private String[] P095911_A396EmprCod ;
   private java.util.Date[] P095911_A485ForFec ;
   private boolean[] P095911_n485ForFec ;
   private String[] P095911_A10045CliAct ;
   private int[] P095911_A483ForColNum ;
   private int[] P095911_A252CliCod ;
   private String[] P095911_A2749ForPro ;
   private boolean[] P095911_n2749ForPro ;
   private String[] P095911_A584IntDsc ;
   private boolean[] P095911_n584IntDsc ;
   private String[] P095911_A3560ForOpcCli ;
   private boolean[] P095911_n3560ForOpcCli ;
   private java.math.BigDecimal[] P095911_A2838ForRelBan ;
   private boolean[] P095911_n2838ForRelBan ;
   private String[] P095911_A995ForTonal ;
   private boolean[] P095911_n995ForTonal ;
   private int[] P095911_A486ForNumCol ;
   private java.util.Date[] P095911_A496ForUltUti ;
   private boolean[] P095911_n496ForUltUti ;
   private String[] P095911_A832TipColDsc ;
   private boolean[] P095911_n832TipColDsc ;
   private byte[] P095911_A831TipColCod ;
   private String[] P095911_A1191ForNomCli ;
   private boolean[] P095911_n1191ForNomCli ;
   private String[] P095911_A482ForColNom ;
   private String[] P095911_A5742ForSerDsc ;
   private boolean[] P095911_n5742ForSerDsc ;
   private String[] P095911_A494ForSer ;
   private String[] P095911_A279CliNom ;
   private String[] P095911_A7781ForBlo ;
   private boolean[] P095911_n7781ForBlo ;
   private String[] P095911_A13929ForTipArtD ;
   private boolean[] P095911_n13929ForTipArtD ;
   private GXSimpleCollection<String> AV98TFForBlo_Sels ;
   private GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ;
   private GXSimpleCollection<String> AV59Options ;
   private GXSimpleCollection<String> AV62OptionsDesc ;
   private GXSimpleCollection<String> AV64OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class mtoformulastintewwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09592( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[38];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T4.CliAct, T4.CliNom, T1.ForFec, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan," ;
      scmdbuf += " T1.ForTonal, T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09593( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[38];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T4.CliAct, T1.ForSer, T1.ForFec, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan," ;
      scmdbuf += " T1.ForTonal, T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09594( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[38];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T4.CliAct, T1.ForSerDsc, T1.ForFec, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan," ;
      scmdbuf += " T1.ForTonal, T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSer, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ') AS" ;
      scmdbuf += " ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09595( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[38];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T1.ForFec, T4.CliAct, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan, T1.ForTonal," ;
      scmdbuf += " T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09596( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[38];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T4.CliAct, T1.ForColNom, T1.ForFec, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan," ;
      scmdbuf += " T1.ForTonal, T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ') AS" ;
      scmdbuf += " ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09597( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[38];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T4.CliAct, T1.ForNomCli, T1.ForFec, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan," ;
      scmdbuf += " T1.ForTonal, T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ') AS" ;
      scmdbuf += " ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForNomCli" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09598( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[38];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T4.TipArtCod, T1.IntCod, T1.ForTipArt, T1.TipColCod, T1.EmprCod, T1.ForFec, T5.CliAct, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan," ;
      scmdbuf += " T1.ForTonal, T1.ForNumCol, T1.ForUltUti, T3.TipColDsc, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T5.CliNom, T1.ForBlo, COALESCE( T4.TipArtDsc, ' ') AS" ;
      scmdbuf += " ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T4 ON T4.EmprCod = T1.EmprCod AND T4.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T5.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipColDsc = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipColCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09599( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV92ForFec ,
                                          java.util.Date AV100ForFecto ,
                                          int AV94CliCodform ,
                                          int AV95CliCodto ,
                                          int AV96Forcolnum ,
                                          String AV99ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[38];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T4.CliAct, T1.ForTonal, T1.ForFec, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan," ;
      scmdbuf += " T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForTonal" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P095910( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A7781ForBlo ,
                                           GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                           byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                           String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                           int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                           String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                           java.util.Date AV92ForFec ,
                                           java.util.Date AV100ForFecto ,
                                           int AV94CliCodform ,
                                           int AV95CliCodto ,
                                           int AV96Forcolnum ,
                                           String AV99ForColNom ,
                                           String A279CliNom ,
                                           String A494ForSer ,
                                           String A5742ForSerDsc ,
                                           String A482ForColNom ,
                                           String A1191ForNomCli ,
                                           byte A831TipColCod ,
                                           String A832TipColDsc ,
                                           java.util.Date A496ForUltUti ,
                                           int A486ForNumCol ,
                                           String A995ForTonal ,
                                           java.math.BigDecimal A2838ForRelBan ,
                                           String A3560ForOpcCli ,
                                           String A584IntDsc ,
                                           String A2749ForPro ,
                                           java.util.Date A485ForFec ,
                                           int A252CliCod ,
                                           int A483ForColNum ,
                                           String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           String A13929ForTipArtD ,
                                           String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[38];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.EmprCod, T1.IntCod, T1.ForTipArt, T4.CliAct, T1.ForOpcCli, T1.ForFec, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForRelBan, T1.ForTonal," ;
      scmdbuf += " T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForOpcCli" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P095911( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A7781ForBlo ,
                                           GXSimpleCollection<String> AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           String AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           String AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           String AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           String AV108Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           String AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           String AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           String AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           String AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           String AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           String AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           byte AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                           byte AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                           String AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           String AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           java.util.Date AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           int AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                           int AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                           String AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           String AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           java.math.BigDecimal AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           java.math.BigDecimal AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           String AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           String AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           String AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           String AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           String AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           int AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                           java.util.Date AV92ForFec ,
                                           java.util.Date AV100ForFecto ,
                                           int AV94CliCodform ,
                                           int AV95CliCodto ,
                                           int AV96Forcolnum ,
                                           String AV99ForColNom ,
                                           String A279CliNom ,
                                           String A494ForSer ,
                                           String A5742ForSerDsc ,
                                           String A482ForColNom ,
                                           String A1191ForNomCli ,
                                           byte A831TipColCod ,
                                           String A832TipColDsc ,
                                           java.util.Date A496ForUltUti ,
                                           int A486ForNumCol ,
                                           String A995ForTonal ,
                                           java.math.BigDecimal A2838ForRelBan ,
                                           String A3560ForOpcCli ,
                                           String A584IntDsc ,
                                           String A2749ForPro ,
                                           java.util.Date A485ForFec ,
                                           int A252CliCod ,
                                           int A483ForColNum ,
                                           String AV105Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           String A13929ForTipArtD ,
                                           String AV113Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           String AV112Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[38];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.ForTipArt, T1.IntCod, T1.EmprCod, T1.ForFec, T4.CliAct, T1.ForColNum, T1.CliCod, T1.ForPro, T2.IntDsc, T1.ForOpcCli, T1.ForRelBan, T1.ForTonal," ;
      scmdbuf += " T1.ForNumCol, T1.ForUltUti, T5.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, COALESCE( T3.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV116Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipColDsc = ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (0==AV94CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (0==AV95CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.IntCod" ;
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
                  return conditional_P09592(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 1 :
                  return conditional_P09593(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 2 :
                  return conditional_P09594(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 3 :
                  return conditional_P09595(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 4 :
                  return conditional_P09596(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 5 :
                  return conditional_P09597(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 6 :
                  return conditional_P09598(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 7 :
                  return conditional_P09599(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 8 :
                  return conditional_P095910(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 9 :
                  return conditional_P095911(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09592", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09593", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09594", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09595", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09596", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09597", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09598", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09599", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095910", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095911", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(18);
               ((String[]) buf[27])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 13);
               ((String[]) buf[30])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(22, 16);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(18);
               ((String[]) buf[27])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 13);
               ((String[]) buf[30])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((String[]) buf[28])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 13);
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((String[]) buf[26])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 13);
               ((String[]) buf[29])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(18);
               ((String[]) buf[27])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((String[]) buf[28])[0] = rslt.getString(19, 13);
               ((String[]) buf[29])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 13);
               ((String[]) buf[29])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((String[]) buf[26])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 13);
               ((String[]) buf[29])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((String[]) buf[26])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 13);
               ((String[]) buf[29])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((String[]) buf[26])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 13);
               ((String[]) buf[29])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 16);
               ((String[]) buf[32])[0] = rslt.getString(22, 30);
               ((String[]) buf[33])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
      }
   }

}

